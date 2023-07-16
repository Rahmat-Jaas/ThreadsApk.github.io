package com.facebook.breakpad;

import X.AnonymousClass0LU;
import X.C15020qa;

public class BreakpadExtraManager {
    public static native boolean appendSessionIdInTombstone(String str);

    static {
        try {
            C15020qa.A0A("breakpad_extra");
        } catch (UnsatisfiedLinkError e) {
            AnonymousClass0LU.A0E("BreakpadExtra", "Failed to load breakpad extra jni library: ", e);
        }
    }
}
