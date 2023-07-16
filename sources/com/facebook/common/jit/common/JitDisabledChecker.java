package com.facebook.common.jit.common;

import X.C02720Cp;
import android.app.Application;
import android.content.pm.PackageManager;
import android.text.SpannedString;
import com.facebook.common.dextricks.Constants;

public final class JitDisabledChecker {
    public static final boolean sIsJitDisabled;

    public static boolean testCompileMethod(int i) {
        if (new SpannedString("Test").length() > i) {
            return true;
        }
        return false;
    }

    static {
        Application A00 = C02720Cp.A00();
        boolean z = false;
        try {
            if (!(A00.getPackageManager() == null || (A00.getPackageManager().getApplicationInfo(A00.getPackageName(), 0).flags & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) == 0)) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        sIsJitDisabled = z;
    }
}
