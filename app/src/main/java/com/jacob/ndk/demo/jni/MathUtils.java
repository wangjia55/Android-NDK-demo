package com.jacob.ndk.demo.jni;

/**
 * Created by jacob-wj on 2015/5/25.
 */
public class MathUtils {
    public static  native int square(int num);

    static{
        System.loadLibrary("JniDemo");
    }

}
