package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;

/* renamed from: X.3Iv  reason: invalid class name */
public abstract class AnonymousClass3Iv {
    public abstract void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback);

    public abstract String getDataDirPath();

    public abstract long getLastNormalUpdateTimestamp();

    public abstract AnonymousClass3V0 getLatestHandle();

    public abstract AnonymousClass0TK getOrCreateOverridesTable();

    public abstract boolean isValid();

    public abstract void logExposure(String str, String str2);

    public abstract void logExposure(String str, String str2, String str3);

    public abstract boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener);

    public abstract String syncFetchReason();

    public abstract boolean updateConfigs(AnonymousClass0TM r1);

    public abstract boolean updateEmergencyPushConfigs();
}
