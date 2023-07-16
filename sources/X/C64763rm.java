package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;

/* renamed from: X.3rm  reason: invalid class name and case insensitive filesystem */
public final class C64763rm implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass1ci A00;
    public final /* synthetic */ C313625r A01;
    public final /* synthetic */ C34640IcN A02;
    public final /* synthetic */ C10300i6 A03;
    public final /* synthetic */ C82814qJ A04;
    public final /* synthetic */ AnonymousClass265 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C64763rm(C34640IcN icN, C10300i6 r2, AnonymousClass1ci r3, C82814qJ r4, C313625r r5, AnonymousClass265 r6, String str, String str2) {
        this.A00 = r3;
        this.A02 = icN;
        this.A03 = r2;
        this.A05 = r6;
        this.A01 = r5;
        this.A04 = r4;
        this.A06 = str;
        this.A07 = str2;
    }

    public final void onClick(View view) {
        C63873iU r2;
        C33841Hva hva;
        int i;
        C32165H8c h8c;
        int A052 = C14030oh.A05(-1232583374);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass1ci r8 = this.A00;
        if (elapsedRealtime - r8.A00 < 30000) {
            C34640IcN icN = this.A02;
            C62973bE.A03(icN.requireContext(), AnonymousClass0wJ.A0o(icN, 30, 2131836055), icN.getString(2131836056));
            i = -2049441818;
        } else {
            C10300i6 r11 = this.A03;
            AnonymousClass265 r13 = this.A05;
            C63313hF.A04(r11, this.A01, r13, "resend_confirmation");
            C82814qJ r12 = this.A04;
            if (r12 != null) {
                C63103bV.A03.A03(this.A02.requireActivity(), r11, r12, r13, C63553hn.A00(this.A06, this.A07));
            }
            C34640IcN icN2 = this.A02;
            Context context = r8.getContext();
            String A002 = C09140ev.A00(context);
            String A0i = C18230wP.A0i(context);
            AnonymousClass3Xi r112 = new AnonymousClass3Xi(r8.requireContext());
            if (r8.A0E) {
                C32165H8c A003 = AnonymousClass3WR.A00(context, r8.A07, C63553hn.A00(r8.A09, r8.A0B), A002, A0i);
                r2 = new C27451sX(r8, r8, r8.A06);
                h8c = A003;
            } else if (!r8.A0F || r8.A0A == null || context == null) {
                C62323Yh.A00.A01(r8.A07, r8.BDt().A01, "user_clicked_on_resend_code_link");
                C32165H8c A012 = C63883iV.A01(context, r8.A07, (Boolean) null, (Boolean) null, r8.A0A, (String) null, true, false);
                r2 = new AnonymousClass1hA(r8);
                h8c = A012;
            } else {
                C62323Yh r4 = C62323Yh.A00;
                r4.A01(r8.A07, r8.BDt().A01, "user_clicked_on_resend_code_link");
                C07530bf r122 = r8.A07;
                String str = r8.A0A;
                AnonymousClass265 BDt = r8.BDt();
                AnonymousClass1hA r9 = new AnonymousClass1hA(r8);
                C26881rP r10 = new C26881rP(context, r8);
                String str2 = BDt.A01;
                r4.A01(r122, str2, "client_start_check_feo2_availability");
                if (r112.A01.A00() >= 1) {
                    r4.A01(r122, str2, "client_check_is_feo2_available");
                    hva = new C25051lg((View) null, r8, r9, r10, r112, r122, BDt, true, str);
                } else {
                    r4.A01(r122, str2, "client_check_is_feo2_unavailable");
                    C32165H8c A013 = C63883iV.A01(r112.A00, r122, (Boolean) null, (Boolean) null, str, (String) null, true, false);
                    A013.A00 = r9;
                    hva = A013;
                }
                icN2.schedule(hva);
                r8.A00 = SystemClock.elapsedRealtime();
                i = -988586882;
            }
            h8c.A00 = r2;
            hva = h8c;
            icN2.schedule(hva);
            r8.A00 = SystemClock.elapsedRealtime();
            i = -988586882;
        }
        C14030oh.A0C(i, A052);
    }
}
