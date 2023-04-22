package com.main;

public class Test001 {
    private static final String TAG = "Test001";
    private static final String TEST;
    private static final String TEST2 = null;

    static {
        TEST = "test";
    }

    public static void main(String[] args) {
        System.out.println(TAG);
    }
}
