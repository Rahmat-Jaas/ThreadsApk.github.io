package com.facebook.mobileconfig;

import X.AnonymousClass0TK;
import X.AnonymousClass0TM;
import X.AnonymousClass0qM;
import X.AnonymousClass35F;
import X.AnonymousClass3Iv;
import X.AnonymousClass3V0;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import com.facebook.redex.IDxCCallbackShape301S0200000_1_I2;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;

public class MobileConfigManagerHolderImpl extends AnonymousClass3Iv {
    public final CountDownLatch SET_NETWORK_SERVICE_SIGNAL = new CountDownLatch(1);
    public String mDataDirPath = "";
    public AnonymousClass35F mFamilyDeviceIdProvider = null;
    public boolean mHasSessionId;
    public final HybridData mHybridData;
    public volatile MobileConfigUpdateOverridesTableCallback mOverridesTableCallback = null;
    public ScheduledExecutorService mScheduledExecutor = null;

    private native boolean updateConfigsInternal(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback, int[] iArr);

    private native boolean usePartialAndFullSyncFetch();

    public native void clearChangeListeners();

    public native void clearCurrentUserData();

    public native void clearOverrides();

    public native void deleteOldUserData(int i);

    public native void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback);

    public native String getConsistencyLoggingFlagsJSON();

    public native String getFamilyDeviceId();

    public native String getFrameworkStatus();

    public native long getLastErrorCode();

    public native long getLastNormalUpdateTimestamp();

    public native MobileConfigMmapHandleHolder getLatestHandleHolder();

    public native long getLatestTotalParamsCount();

    public native MobileConfigOverridesTableHolder getOrCreateOverridesTableHolder();

    public native String getParamsHashForPackage(String str);

    public native String getQueryHashString();

    public native String getSchemaString();

    public native boolean isConsistencyLoggingNeeded(int i);

    public native boolean isFetchNeeded();

    public native boolean isNetworkServiceSet();

    public native boolean isValid();

    public native void logConfigs(String str, int i, Map map);

    public native void logExposure(String str, String str2, String str3);

    public native void logStorageConsistency();

    public native boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener);

    public native String saveCurrentParamsMapToDisk();

    public native boolean setEpHandler(MobileConfigEmergencyPushChangeListener mobileConfigEmergencyPushChangeListener);

    public native void setFamilyDeviceId(String str);

    public native boolean setSandboxURL(String str);

    public native boolean shouldRefetchFdidAndUpdateConfigs();

    public native String syncFetchReason();

    public boolean updateConfigs(AnonymousClass0TM r10) {
        int i;
        if (2 - r10.A02.intValue() != 0) {
            i = 2;
        } else {
            i = 1;
        }
        return updateConfigsInternal(i, r10.A00, r10.A03, r10.A04, false, false, new IDxCCallbackShape301S0200000_1_I2(0, this, r10), (int[]) null);
    }

    public native boolean updateEmergencyPushConfigs();

    public native boolean updateEmergencyPushConfigsSynchronously(int i);

    static {
        AnonymousClass0qM.A02("mobileconfig-jni");
    }

    public String getDataDirPath() {
        return this.mDataDirPath;
    }

    public void logExposure(String str, String str2) {
        logExposure(str, str2, "");
    }

    public MobileConfigManagerHolderImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public AnonymousClass3V0 getLatestHandle() {
        return getLatestHandleHolder();
    }

    public AnonymousClass0TK getOrCreateOverridesTable() {
        MobileConfigOverridesTableHolder orCreateOverridesTableHolder = getOrCreateOverridesTableHolder();
        if (this.mOverridesTableCallback != null) {
            orCreateOverridesTableHolder.setOverridesFileUpdatedCallback(this.mOverridesTableCallback);
        }
        return orCreateOverridesTableHolder;
    }
}
