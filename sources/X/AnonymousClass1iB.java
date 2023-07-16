package X;

import android.os.SystemClock;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.1iB  reason: invalid class name */
public final class AnonymousClass1iB extends C63873iU {
    public long A00;
    public final /* synthetic */ AnonymousClass1bJ A01;

    public AnonymousClass1iB(AnonymousClass1bJ r1) {
        this.A01 = r1;
    }

    public final void onFail(AnonymousClass3XX r9) {
        int A03 = C14030oh.A03(-1965333432);
        super.onFail(r9);
        C07530bf r6 = this.A01.A08;
        AnonymousClass0wJ.A1N(r6, AnonymousClass265.A0r);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r6), "show_continue_as_failed"), 2722);
        AnonymousClass0wJ.A1B(A0I, A002, A003);
        C18210wN.A17(A0I);
        AnonymousClass269.A06(A0I, A003);
        C18190wL.A1I(A0I, "landing");
        C63683i7.A0A(A0I, r6);
        C14030oh.A0A(767865165, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-1185498701);
        C07530bf r11 = this.A01.A08;
        AnonymousClass0wJ.A1N(r11, AnonymousClass265.A0r);
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(r11), "show_continue_as_finished"), 2723);
        AnonymousClass0wJ.A1B(A0I, A002, A003);
        C18180wK.A1A(A0I, A003);
        C18190wL.A1I(A0I, "landing");
        A0I.A0S("ts", Long.valueOf(SystemClock.elapsedRealtime() - this.A00));
        AnonymousClass269.A05(A0I);
        C63683i7.A08(A0I);
        A0I.A0T("release_channel", (String) null);
        A0I.A0T("source", (String) null);
        C18180wK.A19(A0I);
        A0I.Bb4();
        C14030oh.A0A(-1283061582, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-141495388);
        this.A00 = SystemClock.elapsedRealtime();
        C14030oh.A0A(-806559348, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        r10 = X.C18210wN.A1U(r12.A03);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2083097532(0x7c298bbc, float:3.5213293E36)
            int r7 = X.C14030oh.A03(r0)
            X.1Tf r12 = (X.C22061Tf) r12
            r0 = -1588751818(0xffffffffa14d9236, float:-6.965021E-19)
            int r6 = X.C14030oh.A03(r0)
            X.1bJ r9 = r11.A01
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x005a
            X.0bf r3 = r9.A08
            java.lang.String r2 = "bail_on_phone_id"
            r1 = 0
            X.265 r0 = X.AnonymousClass265.A0r
            X.3Vg r2 = X.C63313hF.A02(r3, r1, r0, r2)
            X.32J r0 = r2.A00
            r1 = r0
            if (r0 != 0) goto L_0x002b
            X.32J r0 = new X.32J
            r0.<init>()
        L_0x002b:
            monitor-enter(r0)
            monitor-exit(r0)
            r0 = r1
            if (r1 != 0) goto L_0x0035
            X.32J r0 = new X.32J
            r0.<init>()
        L_0x0035:
            monitor-enter(r0)
            monitor-exit(r0)
            r0 = r1
            if (r1 != 0) goto L_0x003f
            X.32J r0 = new X.32J
            r0.<init>()
        L_0x003f:
            monitor-enter(r0)
            monitor-exit(r0)
            if (r1 != 0) goto L_0x0048
            X.32J r1 = new X.32J
            r1.<init>()
        L_0x0048:
            monitor-enter(r1)
            monitor-exit(r1)
            r2.A01()
            r0 = -1473518509(0xffffffffa82be453, float:-9.541917E-15)
        L_0x0050:
            X.C14030oh.A0A(r0, r6)
            r0 = 394506618(0x1783b17a, float:8.510478E-25)
            X.C14030oh.A0A(r0, r7)
            return
        L_0x005a:
            boolean r0 = r12.A04
            if (r0 != 0) goto L_0x0099
            X.0bf r10 = r9.A08
            java.lang.String r9 = "landing"
            java.lang.String r8 = "phone_id"
            r0 = 0
            X.C04220Ms.A0B(r10, r0)
            double r2 = X.C18200wM.A00()
            double r0 = X.AnonymousClass269.A00()
            X.0nS r5 = X.C13330nS.A02(r10)
            java.lang.String r4 = "show_continue_as_user_not_found"
            X.0A2 r5 = X.AnonymousClass0wJ.A0M(r5, r4)
            r4 = 2725(0xaa5, float:3.819E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.C18180wK.A0I(r5, r4)
            X.AnonymousClass0wJ.A1B(r4, r2, r0)
            X.AnonymousClass269.A06(r4, r0)
            X.C18190wL.A1I(r4, r9)
            X.C63683i7.A07(r4)
            X.C63683i7.A08(r4)
            X.C63683i7.A09(r4, r10)
            X.C18250wR.A0z(r4, r8)
            r0 = -1586535647(0xffffffffa16f6321, float:-8.1107546E-19)
            goto L_0x0050
        L_0x0099:
            r3 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00b6
            java.lang.String r2 = r12.A02
            java.lang.String r1 = r12.A00
            r0 = 0
            X.C04220Ms.A0B(r3, r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r1)
            X.AnonymousClass2BD.A00 = r0
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r2)
            X.AnonymousClass2BD.A01 = r0
        L_0x00b6:
            android.widget.TextSwitcher r0 = r9.A02
            android.view.View r0 = r0.getCurrentView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r2 = X.C18210wN.A0c(r0)
            r1 = 2131824394(0x7f110f0a, float:1.9281615E38)
            r8 = 1
            java.lang.String r0 = r12.A01
            r10 = 0
            java.lang.String r1 = X.AnonymousClass0wJ.A0o(r9, r0, r1)
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x00d8
            android.widget.TextSwitcher r0 = r9.A02
            r0.setText(r1)
        L_0x00d8:
            android.widget.TextView r0 = r9.A03
            if (r0 == 0) goto L_0x0110
            java.lang.String r0 = r12.A03
            boolean r10 = X.C18210wN.A1U(r0)
            if (r10 == 0) goto L_0x0110
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r9)
            r0 = 17694721(0x10e0001, float:2.6081284E-38)
            int r3 = r1.getInteger(r0)
            android.widget.TextView r1 = r9.A03
            r0 = 0
            r1.setAlpha(r0)
            android.widget.TextView r1 = r9.A03
            java.lang.String r0 = r12.A03
            r1.setText(r0)
            android.widget.TextView r0 = r9.A03
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            long r0 = (long) r3
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r0.start()
        L_0x0110:
            X.0bf r5 = r9.A08
            X.265 r4 = X.AnonymousClass265.A0r
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r9.A00
            long r2 = r2 - r0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            X.C18210wN.A0n(r8, r5, r4)
            r0 = 16
            X.AnonymousClass3XB.A00(r5, r4, r1, r2, r0)
            r0 = 784446352(0x2ec1b390, float:8.8085206E-11)
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1iB.onSuccess(java.lang.Object):void");
    }
}
