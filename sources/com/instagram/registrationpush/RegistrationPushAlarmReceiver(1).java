package com.instagram.registrationpush;

import X.C14030oh;
import X.C18200wM;
import X.C692347m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RegistrationPushAlarmReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = C14030oh.A01(2008941914);
        C692347m.A00(context).A02(C18200wM.A0W(this));
        C14030oh.A0E(975778410, A01, intent);
    }
}
