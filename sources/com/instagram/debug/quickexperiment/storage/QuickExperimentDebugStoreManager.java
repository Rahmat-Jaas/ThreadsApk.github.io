package com.instagram.debug.quickexperiment.storage;

import X.AnonymousClass2CI;
import X.C07810cE;
import X.C61823Vx;
import X.C67603zp;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

public class QuickExperimentDebugStoreManager {
    public static final HashMap OVERRIDE_STORE_PER_USER = new HashMap();
    public static final String TAG = "QuickExperimentDebugStoreManager";

    public static synchronized QuickExperimentDebugStore getOverrideStore(UserSession userSession) {
        QuickExperimentDebugStore quickExperimentDebugStore;
        IllegalStateException illegalStateException;
        synchronized (QuickExperimentDebugStoreManager.class) {
            String userId = userSession.getUserId();
            HashMap hashMap = OVERRIDE_STORE_PER_USER;
            quickExperimentDebugStore = (QuickExperimentDebugStore) hashMap.get(userId);
            if (quickExperimentDebugStore == null) {
                C61823Vx A01 = C61823Vx.A01();
                if (A01 != null) {
                    C07810cE A00 = A01.A03().A00();
                    C07810cE A002 = A01.A04(userSession).A00();
                    C67603zp A003 = AnonymousClass2CI.A00(A002);
                    C67603zp A004 = AnonymousClass2CI.A00(A00);
                    if (A003 == null || A004 == null) {
                        illegalStateException = new IllegalStateException(StringFormatUtil.formatStrLocaleSafe("Failed to getOverrideStore, null device or user MobileConfig impl, deviceMC:%s, userMC:%s, userId:%s", A00, A002, userId));
                    } else {
                        quickExperimentDebugStore = QuickExperimentDebugStore.create(A003, A004);
                        hashMap.put(userId, quickExperimentDebugStore);
                    }
                } else {
                    illegalStateException = new IllegalStateException("Failed to getOverrideStore, null QuickExperimentManagerFactory");
                }
                throw illegalStateException;
            }
        }
        return quickExperimentDebugStore;
    }
}
