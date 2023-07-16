package com.facebook.profilo.provider.stacktrace;

import X.C15020qa;

public class StackTraceWhitelist {
    public static native void nativeAddToWhitelist(int i);

    public static native void nativeRemoveFromWhitelist(int i);

    static {
        C15020qa.A0A("profilo_stacktrace");
    }
}
