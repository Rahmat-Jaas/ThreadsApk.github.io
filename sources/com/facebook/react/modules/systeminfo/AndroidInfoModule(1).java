package com.facebook.react.modules.systeminfo;

import X.C18170wI;
import X.C18180wK;
import X.IPD;
import android.app.UiModeManager;
import android.provider.Settings;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

@ReactModule(name = "PlatformConstants")
public class AndroidInfoModule extends NativePlatformConstantsAndroidSpec implements TurboModule {
    public static final String IS_TESTING = "IS_TESTING";

    public void invalidate() {
    }

    private Boolean isRunningScreenshotTest() {
        try {
            Class.forName("com.facebook.testing.react.screenshots.ReactAppScreenshotTestActivity");
            return C18180wK.A0Y();
        } catch (ClassNotFoundException unused) {
            return C18180wK.A0X();
        }
    }

    private String uiMode() {
        IPD reactApplicationContext = getReactApplicationContext();
        int currentModeType = ((UiModeManager) reactApplicationContext.getBaseContext().getSystemService(C18170wI.A00(234))).getCurrentModeType();
        if (currentModeType == 1) {
            return "normal";
        }
        if (currentModeType == 2) {
            return "desk";
        }
        if (currentModeType == 3) {
            return "car";
        }
        if (currentModeType == 4) {
            return "tv";
        }
        if (currentModeType == 6) {
            return "watch";
        }
        if (currentModeType != 7) {
            return "unknown";
        }
        return "vrheadset";
    }

    public String getAndroidID() {
        return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0054, code lost:
        if (isRunningScreenshotTest().booleanValue() != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map getTypedExportedConstants() {
        /*
            r3 = this;
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "Version"
            r2.put(r0, r1)
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            java.lang.String r0 = "Release"
            r2.put(r0, r1)
            java.lang.String r1 = android.os.Build.SERIAL
            java.lang.String r0 = "Serial"
            r2.put(r0, r1)
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.lang.String r0 = "Fingerprint"
            r2.put(r0, r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r0 = "Model"
            r2.put(r0, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            r0 = 687(0x2af, float:9.63E-43)
            java.lang.String r0 = X.C18170wI.A00(r0)
            r2.put(r0, r1)
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r0 = "Brand"
            r2.put(r0, r1)
            java.lang.String r0 = "IS_TESTING"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0056
            java.lang.Boolean r0 = r3.isRunningScreenshotTest()
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x0057
        L_0x0056:
            r0 = 1
        L_0x0057:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "isTesting"
            r2.put(r0, r1)
            java.util.Map r1 = X.AnonymousClass3QY.A00
            java.lang.String r0 = "reactNativeVersion"
            r2.put(r0, r1)
            java.lang.String r1 = r3.uiMode()
            java.lang.String r0 = "uiMode"
            r2.put(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.systeminfo.AndroidInfoModule.getTypedExportedConstants():java.util.Map");
    }

    public AndroidInfoModule(IPD ipd) {
        super(ipd);
    }
}
