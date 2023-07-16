package com.bloks.foa.extensions.regex;

import X.C15020qa;

public class StringRegexUtils {
    public static native boolean matchesRegex(String str, String str2);

    static {
        C15020qa.A0A("stringregex-jni");
    }
}
