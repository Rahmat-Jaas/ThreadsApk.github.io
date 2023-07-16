package com.facebook.redex;

import X.AnonymousClass0TJ;
import X.AnonymousClass0TM;
import X.AnonymousClass0wJ;
import X.AnonymousClass35F;
import X.AnonymousClass3Ie;
import X.C10060hf;
import X.C18200wM;
import X.C305221q;
import X.C550631o;
import X.C62253Xz;
import X.C67603zp;
import X.C67673zx;
import X.C73464Sn;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class IDxCCallbackShape301S0200000_1_I2 implements MobileConfigUpdateConfigsCallback {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCCallbackShape301S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onNetworkComplete(boolean z) {
        ScheduledExecutorService scheduledExecutorService;
        AnonymousClass35F r1;
        C305221q r0;
        if (this.A02 != 0) {
            AnonymousClass3Ie r3 = (AnonymousClass3Ie) this.A00;
            if (r3.A04) {
                C62253Xz r6 = r3.A01;
                C67603zp r5 = r6.A00;
                AnonymousClass0TJ r2 = AnonymousClass0TJ.A04;
                if (r5.ATw(r2, 36314584143562729L, false)) {
                    boolean ATw = r5.ATw(r2, 36314584143628266L, false);
                    r5.A0A();
                    r5.A06().fetchNames(ATw, new C67673zx(r6, 0, ATw));
                }
            }
            if (C550631o.A00() && r3.A03.compareAndSet(false, true)) {
                r3.A01.A00.A0C();
            }
            if (r3.A01.A00.A03 == 2) {
                AnonymousClass0wJ.A13(C18200wM.A0C().edit(), "session_based_client_config_success_fetched", z);
            }
            C10060hf r12 = (C10060hf) this.A01;
            if (z) {
                r0 = C305221q.SUCCESS_DID_UPDATE;
            } else {
                r0 = C305221q.FAILURE;
            }
            r12.A01(r0);
            return;
        }
        MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback = ((AnonymousClass0TM) this.A01).A01;
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkComplete(z);
        }
        MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl = (MobileConfigManagerHolderImpl) this.A00;
        if (mobileConfigManagerHolderImpl.shouldRefetchFdidAndUpdateConfigs() && (scheduledExecutorService = mobileConfigManagerHolderImpl.mScheduledExecutor) != null && (r1 = mobileConfigManagerHolderImpl.mFamilyDeviceIdProvider) != null) {
            scheduledExecutorService.schedule(new C73464Sn(mobileConfigManagerHolderImpl, r1, scheduledExecutorService, 30), 0, TimeUnit.MILLISECONDS);
        }
    }
}
