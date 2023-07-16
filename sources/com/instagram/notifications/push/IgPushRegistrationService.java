package com.instagram.notifications.push;

import X.AnonymousClass00U;
import X.AnonymousClass0RA;
import X.C011805m;
import X.C04850Pk;
import X.C10450iM;
import X.C134157x7;
import X.C134167x9;
import X.C28174Ezk;
import android.content.Intent;
import ch.boye.httpclientandroidlib.HttpStatus;

public class IgPushRegistrationService extends C011805m {
    public final void onHandleWork(Intent intent) {
        if (intent == null) {
            try {
                C10450iM.A03("IgPushRegistrationService", "onHandleWork - Null Intent");
            } catch (RuntimeException e) {
                C10450iM.A05("IgPushRegistrationService", "onHandleWork - runtime exception", 1, e);
            }
        } else if (intent.getExtras() == null) {
            C10450iM.A03("IgPushRegistrationService", "onHandleWork - Empty extras");
        } else {
            String string = intent.getExtras().getString(C28174Ezk.A00(HttpStatus.SC_NOT_ACCEPTABLE));
            C134167x9 r3 = new C134167x9(getApplicationContext(), intent);
            if (!AnonymousClass0RA.A0C.A09(new C134157x7(), (C04850Pk) null, r3, string)) {
                C10450iM.A03("IgPushRegistrationService", AnonymousClass00U.A0L("onHandleWork - Error when adding operation, given id is not authenticated: ", string));
            }
        }
    }
}
