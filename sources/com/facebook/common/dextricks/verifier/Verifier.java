package com.facebook.common.dextricks.verifier;

import X.AnonymousClass0SH;
import X.C15020qa;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.Experiments;

public class Verifier {
    public static boolean sDisabledRuntimeVerification = false;
    public static Boolean sHasNativeCode = null;
    public static boolean sTriedDisableRuntimeVerification = false;

    public static native boolean disableRuntimeVerification_10_0_0();

    public static native boolean disableRuntimeVerification_11_0_0();

    public static native boolean disableRuntimeVerification_5_1_1();

    public static native boolean disableRuntimeVerification_6_0_1();

    public static native boolean disableRuntimeVerification_7_0_0();

    public static native boolean disableRuntimeVerification_7_1_2();

    public static native boolean disableRuntimeVerification_8_0_0();

    public static native boolean disableRuntimeVerification_8_1_0();

    public static native boolean disableRuntimeVerification_9_0_0();

    public static synchronized void disableRuntimeVerification(Context context) {
        boolean z;
        synchronized (Verifier.class) {
            boolean maybeLoadVerifierLibrary = maybeLoadVerifierLibrary();
            if (!sTriedDisableRuntimeVerification && maybeLoadVerifierLibrary && AnonymousClass0SH.A00(context, Experiments.DISABLE_VERIFIERDISABLE, 0) != 1) {
                switch (Build.VERSION.SDK_INT) {
                    case 28:
                        z = disableRuntimeVerification_9_0_0();
                        sDisabledRuntimeVerification = z;
                        break;
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                        z = disableRuntimeVerification_10_0_0();
                        sDisabledRuntimeVerification = z;
                        break;
                    case 30:
                        z = disableRuntimeVerification_11_0_0();
                        sDisabledRuntimeVerification = z;
                        break;
                    default:
                        sDisabledRuntimeVerification = false;
                        sTriedDisableRuntimeVerification = false;
                        break;
                }
                sTriedDisableRuntimeVerification = true;
                if (!z) {
                    Log.w("Verifier", "Could not disable runtime verification");
                }
            }
        }
    }

    public static synchronized boolean maybeLoadVerifierLibrary() {
        boolean booleanValue;
        boolean z;
        synchronized (Verifier.class) {
            Boolean bool = sHasNativeCode;
            if (bool == null) {
                try {
                    C15020qa.A0A("verifier");
                    z = true;
                } catch (Throwable unused) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
                sHasNativeCode = bool;
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }

    static {
        maybeLoadVerifierLibrary();
    }
}
