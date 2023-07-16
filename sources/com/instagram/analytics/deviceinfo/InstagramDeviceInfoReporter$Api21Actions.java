package com.instagram.analytics.deviceinfo;

import X.C15680ri;
import android.system.ErrnoException;
import android.system.Os;

public class InstagramDeviceInfoReporter$Api21Actions {
    public static void addFileLastAccessTime(C15680ri r4, String str) {
        try {
            r4.A0C("access_date", Long.valueOf(Os.lstat(str).st_atime * 1000));
        } catch (ErrnoException unused) {
        }
    }
}
