package com.facebook.voltron.runtime;

import X.AnonymousClass00U;
import android.content.Context;

public class ModuleApkUtil$ModuleResolver {
    public static String A00(Context context, String str) {
        String[] strArr = context.getApplicationInfo().splitSourceDirs;
        if (strArr != null) {
            String A0V = AnonymousClass00U.A0V("split_", str, ".apk");
            for (String str2 : strArr) {
                if (str2.endsWith(A0V)) {
                    return str2;
                }
            }
        }
        return null;
    }
}
