package com.instagram.registrationpush;

import X.AnonymousClass0wJ;
import X.AnonymousClass269;
import X.C10300i6;
import X.C10340iB;
import X.C10650ih;
import X.C13330nS;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18230wP;
import X.C18240wQ;
import X.C63683i7;
import X.C692347m;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

public class RegistrationPushActionReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = C14030oh.A01(1560946096);
        C692347m A00 = C692347m.A00(context);
        C10300i6 A0W = C18200wM.A0W(this);
        if ("com.instagram.registrationpush.ACTION_TAPPED".equals(intent.getAction())) {
            long currentTimeMillis = System.currentTimeMillis();
            long A012 = AnonymousClass269.A01();
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(A0W), "push_tapped"), 2542);
            if (AnonymousClass0wJ.A1U(A0I)) {
                double d = (double) currentTimeMillis;
                double d2 = (double) A012;
                AnonymousClass0wJ.A1A(A0I, d, d2);
                C18180wK.A19(A0I);
                AnonymousClass269.A05(A0I);
                AnonymousClass0wJ.A1D(A0I, d2, d);
                C18190wL.A1K(A0I);
                C63683i7.A09(A0I, A0W);
                C63683i7.A06(A0I, A0W);
                C18180wK.A1G(A0I);
                A0I.Bb4();
            }
            Intent A0B = C18230wP.A0B();
            Context context2 = A00.A02;
            A0B.setClassName(context2, "com.instagram.mainactivity.MainActivity");
            A0B.setAction("android.intent.action.MAIN");
            A0B.addCategory("android.intent.category.LAUNCHER");
            A0B.addFlags(268435456);
            C10650ih.A02(context2, A0B);
        } else if ("com.instagram.registrationpush.ACTION_DELETED".equals(intent.getAction())) {
            long currentTimeMillis2 = System.currentTimeMillis();
            long A013 = AnonymousClass269.A01();
            USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(A0W), "push_dismissed"), 2540);
            if (AnonymousClass0wJ.A1U(A0I2)) {
                double d3 = (double) currentTimeMillis2;
                C18180wK.A1B(A0I2, d3);
                double d4 = (double) A013;
                AnonymousClass0wJ.A1A(A0I2, d3, d4);
                AnonymousClass269.A06(A0I2, d4);
                C18180wK.A19(A0I2);
                C18180wK.A1G(A0I2);
                A0I2.A0Q("is_internal_build", C18180wK.A0X());
                A0I2.A0T("release_channel", C18240wQ.A0g(C10340iB.A00().name()));
                C63683i7.A09(A0I2, A0W);
                A0I2.Bb4();
            }
        }
        C14030oh.A0E(277673059, A01, intent);
    }
}
