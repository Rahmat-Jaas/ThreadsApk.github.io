package X;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import ch.boye.httpclientandroidlib.impl.auth.NTLMEngineImpl;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.barcelona.R;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.registrationpush.RegistrationPushActionReceiver;
import com.instagram.registrationpush.RegistrationPushAlarmReceiver;

/* renamed from: X.47m  reason: invalid class name and case insensitive filesystem */
public final class C692347m implements C10390iG {
    public static C692347m A03;
    public final AlarmManager A00;
    public final NotificationManager A01;
    public final Context A02;

    public static synchronized C692347m A00(Context context) {
        C692347m r1;
        synchronized (C692347m.class) {
            r1 = A03;
            if (r1 == null) {
                r1 = new C692347m(context.getApplicationContext());
                A03 = r1;
            }
        }
        return r1;
    }

    public final void A01() {
        C16230sh r3 = new C16230sh();
        Context context = this.A02;
        Intent A04 = C18250wR.A04(context, RegistrationPushAlarmReceiver.class);
        A04.setAction("RegistrationPush.PUSH_ACTION");
        r3.A06(A04, context.getClassLoader());
        PendingIntent A022 = r3.A02(context, 0, NTLMEngineImpl.FLAG_NEGOTIATE_128);
        if (A022 != null) {
            this.A00.cancel(A022);
        }
        this.A01.cancel("registration", 64278);
    }

    public C692347m(Context context) {
        this.A02 = context;
        this.A00 = (AlarmManager) context.getSystemService("alarm");
        this.A01 = C18250wR.A03(context);
    }

    public final void A02(C10300i6 r10) {
        if (C63593hs.A06() || C63593hs.A05()) {
            C691847d.A03(this);
        } else if (C691847d.A05()) {
            synchronized (C63593hs.class) {
                AnonymousClass0wJ.A13(C63593hs.A01.A00.edit(), "registration_push_sent_v2", true);
            }
            C13330nS A022 = C13330nS.A02(r10);
            long currentTimeMillis = System.currentTimeMillis();
            long A012 = AnonymousClass269.A01();
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A022, "pushable"), 2543);
            if (AnonymousClass0wJ.A1U(A0I)) {
                double d = (double) currentTimeMillis;
                C18180wK.A1B(A0I, d);
                double d2 = (double) A012;
                AnonymousClass0wJ.A1A(A0I, d, d2);
                AnonymousClass269.A06(A0I, d2);
                C63683i7.A08(A0I);
                A0I.A0S("os_version", C18230wP.A0f(Build.VERSION.SDK_INT));
                C63683i7.A09(A0I, r10);
                A0I.Bb4();
            }
            Context context = this.A02;
            C30949Gbq gbq = new C30949Gbq(context, "ig_other");
            gbq.A0A(true);
            int i = R.drawable.notification_icon;
            int A023 = C121907Is.A02(context, R.attr.defaultNotificationIcon);
            if (A023 != 0) {
                i = A023;
            }
            gbq.A05(i);
            gbq.A08(context.getString(R.string.f0nameremoved));
            gbq.A07(context.getString(2131830089));
            Class<RegistrationPushActionReceiver> cls = RegistrationPushActionReceiver.class;
            Intent A04 = C18250wR.A04(context, cls);
            A04.setAction("com.instagram.registrationpush.ACTION_TAPPED");
            gbq.A0A = C18210wN.A0I(context, A04).A02(context, 0, 0);
            Intent A042 = C18250wR.A04(context, cls);
            A042.setAction("com.instagram.registrationpush.ACTION_DELETED");
            gbq.A09.deleteIntent = C18210wN.A0I(context, A042).A02(context, 0, 0);
            Notification A013 = gbq.A01();
            long currentTimeMillis2 = System.currentTimeMillis();
            long A014 = AnonymousClass269.A01();
            USLEBaseShape0S0000000 A0I2 = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r10), "pushed"), 2544);
            if (AnonymousClass0wJ.A1U(A0I2)) {
                double d3 = (double) currentTimeMillis2;
                double d4 = (double) A014;
                AnonymousClass0wJ.A1A(A0I2, d3, d4);
                C18180wK.A19(A0I2);
                AnonymousClass269.A06(A0I2, d4);
                C18180wK.A1B(A0I2, d3);
                A0I2.A0S("time_variation", 30L);
                A0I2.A0S("os_version", C18230wP.A0f(Build.VERSION.SDK_INT));
                C63683i7.A07(A0I2);
                C63683i7.A08(A0I2);
                C63683i7.A06(A0I2, r10);
                C63683i7.A09(A0I2, r10);
                A0I2.A0Q("is_internal_build", false);
                A0I2.Bb4();
            }
            this.A01.notify("registration", 64278, A013);
        }
    }

    public final void onAppBackgrounded() {
        int A032 = C14030oh.A03(-1551326841);
        A01();
        if (C63593hs.A05() || C63593hs.A06()) {
            C691847d.A03(this);
        } else {
            C16230sh r5 = new C16230sh();
            Context context = this.A02;
            Intent A04 = C18250wR.A04(context, RegistrationPushAlarmReceiver.class);
            A04.setAction("RegistrationPush.PUSH_ACTION");
            r5.A06(A04, context.getClassLoader());
            PendingIntent A022 = r5.A02(context, 0, 134217728);
            this.A00.set(2, SystemClock.elapsedRealtime() + (((long) 30) * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS), A022);
        }
        C14030oh.A0A(-2133824819, A032);
    }

    public final void onAppForegrounded() {
        int A032 = C14030oh.A03(-1020357735);
        A01();
        C14030oh.A0A(-233288084, A032);
    }
}
