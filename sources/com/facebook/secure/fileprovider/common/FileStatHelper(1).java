package com.facebook.secure.fileprovider.common;

import X.C15020qa;

public class FileStatHelper {
    public static native StatInfo statOpenFile(int i);

    static {
        C15020qa.A0A("filestathelper");
    }
}
