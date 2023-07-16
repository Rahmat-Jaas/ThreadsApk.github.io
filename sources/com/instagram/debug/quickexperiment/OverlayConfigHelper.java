package com.instagram.debug.quickexperiment;

import X.AnonymousClass0LU;
import X.AnonymousClass0Tc;
import X.C05450Tu;
import X.C07950cU;
import X.C18240wQ;
import X.C40582LjJ;
import java.util.Arrays;

public class OverlayConfigHelper {
    public static final String TAG = "OverlayConfigHelper";

    public static boolean isOverlayConfig(C07950cU r4) {
        long j = r4.mMobileConfigSpecifier;
        try {
            if (Arrays.binarySearch(C40582LjJ.A00, C05450Tu.A00(j)) < 0) {
                return false;
            }
            return true;
        } catch (AnonymousClass0Tc e) {
            AnonymousClass0LU.A0L(TAG, "Failed to get config key with specifier:%d", e, C18240wQ.A1b(j));
            return false;
        }
    }
}
