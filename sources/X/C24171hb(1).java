package X;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.1hb  reason: invalid class name and case insensitive filesystem */
public final class C24171hb extends C63873iU {
    public final /* synthetic */ C63103bV A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ C10300i6 A03;
    public final /* synthetic */ C82814qJ A04;
    public final /* synthetic */ AnonymousClass265 A05;
    public final /* synthetic */ String A06;

    public C24171hb(Activity activity, C10300i6 r2, C82814qJ r3, C63103bV r4, AnonymousClass265 r5, String str, long j) {
        this.A00 = r4;
        this.A02 = activity;
        this.A03 = r2;
        this.A05 = r5;
        this.A01 = j;
        this.A04 = r3;
        this.A06 = str;
    }

    public final void onFail(AnonymousClass3XX r9) {
        String str;
        int A032 = C14030oh.A03(1471499418);
        Throwable th = r9.A01;
        if (th == null || th.getMessage() == null) {
            str = "unknown";
        } else {
            str = th.getMessage();
        }
        if ("unsupported".equals(str)) {
            C63103bV r3 = this.A00;
            C63103bV.A00(this.A02, this.A03, r3, this.A06);
        }
        C63103bV.A02(this.A03, this.A05, str, SystemClock.elapsedRealtime() - this.A01);
        C14030oh.A0A(1847368360, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String A002;
        int A032 = C14030oh.A03(77221909);
        String str = (String) obj;
        int A033 = C14030oh.A03(1096953075);
        Activity activity = this.A02;
        if (AnonymousClass0fO.A00(activity)) {
            A002 = AnonymousClass3XK.A01(str);
        } else {
            A002 = AnonymousClass3XK.A00(str);
        }
        if (!TextUtils.isEmpty(A002)) {
            C10300i6 r5 = this.A03;
            String str2 = this.A05.A01;
            double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - this.A01);
            C04220Ms.A0B(str2, 1);
            double A003 = C18200wM.A00();
            double A004 = AnonymousClass269.A00();
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r5), "ig_android_sms_retriever_received_sms"), 789);
            C18180wK.A1B(A0I, A003);
            A0I.A0R("duration", Double.valueOf(elapsedRealtime));
            AnonymousClass0wJ.A1A(A0I, A003, A004);
            C63683i7.A05(A0I);
            C63683i7.A04(A0I);
            A0I.A0T("release_channel", C63683i7.A01());
            C18180wK.A1A(A0I, A004);
            AnonymousClass269.A08(A0I, str2);
            C18180wK.A19(A0I);
            C63683i7.A09(A0I, r5);
            A0I.Bb4();
            this.A04.CHy(activity, A002, this.A06);
        } else {
            C63103bV.A02(this.A03, this.A05, "parse_error", SystemClock.elapsedRealtime() - this.A01);
        }
        C14030oh.A0A(1613496368, A033);
        C14030oh.A0A(-1831907782, A032);
    }
}
