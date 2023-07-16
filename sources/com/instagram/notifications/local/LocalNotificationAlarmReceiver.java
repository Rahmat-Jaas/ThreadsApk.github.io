package com.instagram.notifications.local;

import X.AnonymousClass0RA;
import X.AnonymousClass0wJ;
import X.AnonymousClass35L;
import X.C14030oh;
import X.C16100sU;
import X.C18190wL;
import X.C36402Re;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape90S0100000_I2_70;

public final class LocalNotificationAlarmReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C14030oh.A01(-804192871);
        AnonymousClass0wJ.A1N(context, intent);
        if (!C16100sU.A00().A01(context, intent, this)) {
            i = 1453237636;
        } else {
            UserSession A07 = AnonymousClass0RA.A0C.A07(intent.getExtras());
            if (A07 == null) {
                i = 1956409015;
            } else {
                if (C36402Re.A00(context)) {
                    String stringExtra = intent.getStringExtra("local_notification_type");
                    if (stringExtra == null) {
                        i = -990550280;
                    } else if (stringExtra.equals("UNSEEN_LIKES")) {
                        ((AnonymousClass35L) A07.A01(AnonymousClass35L.class, new KtLambdaShape90S0100000_I2_70(A07, 18))).A00.getString("UNSEEN_LIKES", (String) null);
                    } else {
                        throw C18190wL.A0a(stringExtra);
                    }
                }
                i = -1720482044;
            }
        }
        C14030oh.A0E(i, A01, intent);
    }
}
