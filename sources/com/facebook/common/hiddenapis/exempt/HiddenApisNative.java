package com.facebook.common.hiddenapis.exempt;

import X.C15020qa;
import android.util.Log;

public class HiddenApisNative {
    public static boolean sInited;

    public static native boolean removeAllHiddenApiCheckHardening(int i, boolean z);

    public static native boolean setHiddenApiCheckHardening(int i, boolean z);

    static {
        String str;
        try {
            boolean A0A = C15020qa.A0A("hiddenapi");
            sInited = A0A;
            if (A0A) {
                str = "yes";
            } else {
                str = "no";
            }
            String.format("Hidden api library loaded: %s", new Object[]{str});
        } catch (UnsatisfiedLinkError e) {
            Log.w("HiddenApi", "Failed to load HiddenApiLib lib.", e);
            sInited = false;
        }
    }
}
