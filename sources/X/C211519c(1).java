package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.19c  reason: invalid class name and case insensitive filesystem */
public final class C211519c extends AnonymousClass3Iv {
    public AtomicReference A00 = new AtomicReference("");

    public final String getDataDirPath() {
        return "";
    }

    public final long getLastNormalUpdateTimestamp() {
        return 0;
    }

    public final AnonymousClass3V0 getLatestHandle() {
        return null;
    }

    public final boolean isValid() {
        return false;
    }

    public final void logExposure(String str, String str2) {
    }

    public final void logExposure(String str, String str2, String str3) {
    }

    public final boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener) {
        return false;
    }

    public final boolean updateEmergencyPushConfigs() {
        return false;
    }

    public final void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback) {
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkComplete(false);
        }
    }

    public final AnonymousClass0TK getOrCreateOverridesTable() {
        return C67653zu.A09;
    }

    public final String syncFetchReason() {
        return AnonymousClass00U.A0L("MobileConfigManagerHolderNoop: ", (String) this.A00.get());
    }

    public final boolean updateConfigs(AnonymousClass0TM r3) {
        MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback = r3.A01;
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkComplete(false);
        }
        return false;
    }
}
