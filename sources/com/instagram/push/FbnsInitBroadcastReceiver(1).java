package com.instagram.push;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass0TJ;
import X.AnonymousClass0YN;
import X.AnonymousClass0s5;
import X.AnonymousClass6UB;
import X.AnonymousClass7GV;
import X.C05030Qo;
import X.C10300i6;
import X.C1190873l;
import X.C12530m4;
import X.C12710mM;
import X.C14030oh;
import X.C16890tv;
import X.C17250ua;
import X.C18200wM;
import X.C19573AyZ;
import X.C63173fJ;
import X.KJ8;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import com.instagram.service.session.UserSession;

public class FbnsInitBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        String A00;
        int A01 = C14030oh.A01(862564143);
        KJ8.A0G.A0G(intent, AnonymousClass006.A15);
        if (intent == null) {
            i = -63516572;
        } else {
            if (!AnonymousClass000.A00(46).equals(intent.getAction())) {
                if (!AnonymousClass000.A00(287).equals(intent.getAction()) && !"android.intent.action.USER_PRESENT".equals(intent.getAction()) && !"com.facebook.rti.intent.ACTION_FBNS_STARTED".equals(intent.getAction()) && !"com.facebook.rti.intent.ACTION_FBNS_STOPPED".equals(intent.getAction())) {
                    i = 50988532;
                }
            }
            String str = null;
            Context context2 = context;
            if ("com.facebook.rti.intent.ACTION_FBNS_STARTED".equals(intent.getAction()) || "com.facebook.rti.intent.ACTION_FBNS_STOPPED".equals(intent.getAction())) {
                context.getClass();
                if (!((C12530m4) C17250ua.A00).A00(intent, new C12710mM(context)).BZk()) {
                    i = 838973032;
                }
            }
            if (C63173fJ.A05(AnonymousClass0TJ.A05, 18296805494358495L) && (A00 = AnonymousClass0s5.A00(context)) != null) {
                C16890tv.A01(context2, (AnonymousClass0YN) null, FbnsServiceDelegate.A00(A00), "FbnsSuspendSwitch", A00, "com.facebook.rti.intent.ACTION_FBNS_KILL_SWITCH_DISABLE_SERVICE");
            }
            if (AnonymousClass6UB.A00(context)) {
                boolean z = false;
                C10300i6 A0W = C18200wM.A0W(this);
                if (A0W instanceof UserSession) {
                    UserSession A02 = C05030Qo.A02(A0W);
                    str = A02.getUserId();
                    z = C19573AyZ.A03(A02);
                }
                C1190873l.A00().BPv(AnonymousClass7GV.A00, str, z);
            }
            i = -1268128060;
        }
        C14030oh.A0E(i, A01, intent);
    }
}
