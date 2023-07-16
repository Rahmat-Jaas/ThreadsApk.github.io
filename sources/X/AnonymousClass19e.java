package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;

/* renamed from: X.19e  reason: invalid class name */
public final class AnonymousClass19e extends AnonymousClass3Iv {
    public AnonymousClass0Jj A00 = null;
    public volatile AnonymousClass3Iv A01 = new C211519c();

    public static MobileConfigManagerHolderImpl A00(AnonymousClass3Iv r3) {
        Class<MobileConfigManagerHolderImpl> cls = MobileConfigManagerHolderImpl.class;
        while (r3 instanceof AnonymousClass19e) {
            AnonymousClass19e r32 = (AnonymousClass19e) r3;
            synchronized (r32) {
                r3 = r32.A01;
            }
        }
        if (!cls.isInstance(r3)) {
            r3 = null;
        }
        return (MobileConfigManagerHolderImpl) r3;
    }

    public static AnonymousClass19d A01(AnonymousClass3Iv r3) {
        Class<AnonymousClass19d> cls = AnonymousClass19d.class;
        while (r3 instanceof AnonymousClass19e) {
            AnonymousClass19e r32 = (AnonymousClass19e) r3;
            synchronized (r32) {
                r3 = r32.A01;
            }
        }
        if (!cls.isInstance(r3)) {
            r3 = null;
        }
        return (AnonymousClass19d) r3;
    }

    public final void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback) {
        this.A01.fetchNames(z, mobileConfigUpdateConfigsCallback);
    }

    public final String getDataDirPath() {
        return this.A01.getDataDirPath();
    }

    public final long getLastNormalUpdateTimestamp() {
        return this.A01.getLastNormalUpdateTimestamp();
    }

    public final AnonymousClass3V0 getLatestHandle() {
        return this.A01.getLatestHandle();
    }

    public final AnonymousClass0TK getOrCreateOverridesTable() {
        return this.A01.getOrCreateOverridesTable();
    }

    public final boolean isValid() {
        return this.A01.isValid();
    }

    public final void logExposure(String str, String str2) {
        logExposure(str, str2, "");
    }

    public final boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener) {
        return this.A01.registerConfigChangeListener(mobileConfigCxxChangeListener);
    }

    public final String syncFetchReason() {
        return this.A01.syncFetchReason();
    }

    public final boolean updateConfigs(AnonymousClass0TM r2) {
        return this.A01.updateConfigs(r2);
    }

    public final boolean updateEmergencyPushConfigs() {
        return this.A01.updateEmergencyPushConfigs();
    }

    public final void logExposure(String str, String str2, String str3) {
        this.A01.logExposure(str, str2, str3);
    }
}
