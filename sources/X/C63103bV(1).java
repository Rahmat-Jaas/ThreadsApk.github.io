package X;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxPCallbackShape12S1300000_1_I2;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.3bV  reason: invalid class name and case insensitive filesystem */
public final class C63103bV {
    public static final C63103bV A03 = new C63103bV();
    public C81514nv A00;
    public C82814qJ A01;
    public C18360x3 A02;

    public static void A00(Activity activity, C10300i6 r8, C63103bV r9, String str) {
        Activity activity2 = activity;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            A0v.add("android.permission.RECEIVE_SMS");
            AnonymousClass7K8.A02(activity2, new IDxPCallbackShape12S1300000_1_I2(activity2, r8, r9, str, 1), (String[]) A0v.toArray(new String[A0v.size()]));
        }
    }

    public final /* synthetic */ void A04(Activity activity, C10300i6 r8, String str, Map map) {
        Object obj = map.get("android.permission.RECEIVE_SMS");
        C971568d r4 = C971568d.GRANTED;
        if (obj == r4) {
            C82814qJ r0 = this.A01;
            r0.getClass();
            C18360x3 r3 = new C18360x3(r8, r0, str);
            this.A02 = r3;
            Context applicationContext = activity.getApplicationContext();
            applicationContext.getClass();
            applicationContext.registerReceiver(r3, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
        }
        if (obj == r4) {
            C04220Ms.A0B(r8, 0);
            double A002 = C18200wM.A00();
            double A003 = AnonymousClass269.A00();
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r8), "sms_permission_allowed"), 2736);
            AnonymousClass0wJ.A1B(A0I, A002, A003);
            C18210wN.A19(A0I, "phone");
            C18180wK.A1A(A0I, A003);
            AnonymousClass269.A08(A0I, "phone");
            C63683i7.A07(A0I);
            C63683i7.A0A(A0I, r8);
            return;
        }
        C61763Vg A022 = C63313hF.A02(r8, C313625r.PHONE, AnonymousClass265.A1A, "sms_permission_denied");
        A022.A02("os_version", Build.VERSION.SDK_INT);
        A022.A01();
    }

    public static void A01(Context context, C10300i6 r8, String str, String str2, boolean z) {
        C18240wQ.A1L(context, str, str2);
        String A002 = C09140ev.A00(context);
        String A0i = C18230wP.A0i(context);
        H1T A0N = AnonymousClass0wJ.A0N(r8);
        A0N.A0J("accounts/validate_signup_sms_code/");
        A0N.A0O(C62983bG.A03(9, 12, 69), str);
        A0N.A0O(C62983bG.A03(39, 17, 95), str2);
        A0N.A0O(C62983bG.A03(0, 9, 122), A002);
        AnonymousClass269.A0A(A0N, "guid", A0i);
        C32165H8c A0T = C18180wK.A0T(A0N, C27101ry.class, AnonymousClass3NX.class);
        A0T.A00 = new AnonymousClass1if(context, r8, str, str2, z);
        C31155GhB.A03(A0T);
    }

    public static void A02(C10300i6 r7, AnonymousClass265 r8, String str, long j) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r7), "ig_android_sms_retriever_error"), 788);
        if (AnonymousClass0wJ.A1U(A0I)) {
            double A002 = AnonymousClass269.A00();
            double A003 = C18200wM.A00();
            A0I.A0S("duration", Long.valueOf(j));
            A0I.A0T("error_type", str);
            C63683i7.A05(A0I);
            C18190wL.A1I(A0I, r8.A01);
            AnonymousClass269.A07(A0I, A003, A002);
            C63683i7.A09(A0I, r7);
            C18200wM.A1K(A0I, A002);
            A0I.Bb4();
        }
    }

    public final void A03(Activity activity, C10300i6 r19, C82814qJ r20, AnonymousClass265 r21, String str) {
        C81514nv r0;
        C63643hy.A02();
        Activity activity2 = activity;
        C82814qJ r11 = r20;
        String str2 = str;
        C18240wQ.A1L(activity2, str2, r11);
        C63643hy.A02();
        if (!(this.A02 == null || this.A01 == null || (r0 = this.A00) == null || !((C18370x4) r0).A03.get())) {
            A05(activity2);
        }
        this.A01 = r11;
        C62783aj instance = C62783aj.getInstance();
        C10300i6 r10 = r19;
        if (instance == null || !C09650fs.A04(activity2) || C18180wK.A1W(activity2.checkSelfPermission("android.permission.RECEIVE_SMS"))) {
            A00(activity2, r10, this, str2);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass265 r13 = r21;
        String str3 = r13.A01;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, str3);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r10), "ig_android_sms_retriever_started"), 790);
        AnonymousClass0wJ.A1B(A0I, A002, A003);
        C63683i7.A05(A0I);
        C63683i7.A04(A0I);
        C18180wK.A1A(A0I, A003);
        AnonymousClass269.A08(A0I, str3);
        C18180wK.A19(A0I);
        C63683i7.A07(A0I);
        C63683i7.A09(A0I, r10);
        A0I.Bb4();
        C81514nv listenForSmsResponse = instance.listenForSmsResponse(activity2, A1Z);
        this.A00 = listenForSmsResponse;
        ((C18370x4) listenForSmsResponse).A00 = new C24171hb(activity2, r10, r11, this, r13, str2, elapsedRealtime);
    }

    public final void A05(Context context) {
        C81514nv r0;
        C63643hy.A02();
        context.getClass();
        C63643hy.A02();
        if (this.A02 != null && this.A01 != null && (r0 = this.A00) != null && ((C18370x4) r0).A03.get()) {
            if (this.A01 != null) {
                this.A01 = null;
            }
            C81514nv r02 = this.A00;
            if (r02 != null && ((C18370x4) r02).A03.get()) {
                C18370x4 r2 = (C18370x4) this.A00;
                if (r2.A03.getAndSet(false)) {
                    r2.A02.unregisterReceiver(r2);
                }
                this.A00 = null;
            }
            C18360x3 r1 = this.A02;
            if (r1 != null) {
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                applicationContext.unregisterReceiver(r1);
                this.A02 = null;
            }
        }
    }
}
