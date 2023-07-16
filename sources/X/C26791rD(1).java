package X;

import com.facebook.redex.IDxCCallbackShape124S0300000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1rD  reason: invalid class name and case insensitive filesystem */
public final class C26791rD extends C24431ij {
    public final C11630kW A00;
    public final String A01;
    public final String A02;
    public final /* synthetic */ C23151ca A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26791rD(androidx.fragment.app.Fragment r11, X.C11630kW r12, X.C84634tZ r13, X.C23151ca r14, X.C07530bf r15, java.lang.String r16, java.lang.String r17) {
        /*
            r10 = this;
            r1 = r10
            r10.A03 = r14
            androidx.fragment.app.FragmentActivity r2 = r11.getActivity()
            X.265 r7 = X.AnonymousClass265.A0t
            java.lang.Integer r8 = X.AnonymousClass006.A00
            android.net.Uri r3 = X.C67323zM.A01(r11)
            r4 = r12
            r5 = r13
            r6 = r15
            r9 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.A01 = r9
            r0 = r17
            r10.A02 = r0
            r10.A00 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26791rD.<init>(androidx.fragment.app.Fragment, X.0kW, X.4tZ, X.1ca, X.0bf, java.lang.String, java.lang.String):void");
    }

    public static void A00(C26791rD r1, UserSession userSession, User user) {
        if (r1.A03.getContext() != null) {
            super.A03(userSession, user);
        }
    }

    public final void A03(UserSession userSession, User user) {
        C23151ca r1 = this.A03;
        UserSession userSession2 = userSession;
        if (r1.getContext() != null) {
            String BK7 = user.BK7();
            String str = this.A02;
            C551031t.A00(r1, userSession2, user.B4M(), new IDxCCallbackShape124S0300000_1_I2(2, userSession, user, this), AnonymousClass265.A0t, BK7, str, false);
            return;
        }
        A00(this, userSession, user);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (((X.C26641qy) r0).A0B == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.AnonymousClass3XX r9) {
        /*
            r8 = this;
            r0 = 1629093366(0x6119fdf6, float:1.7754073E20)
            int r5 = X.C14030oh.A03(r0)
            super.onFail(r9)
            java.lang.String r6 = r8.A01
            X.1ca r7 = r8.A03
            android.widget.TextView r0 = r7.A05
            java.lang.String r0 = X.C18180wK.A0f(r0)
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = r8.A02
            boolean r0 = r0.equals(r0)
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r9.A00
            if (r0 == 0) goto L_0x002d
            X.1qy r0 = (X.C26641qy) r0
            boolean r0 = r0.A0B
            r4 = 1
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r4 = 0
        L_0x002e:
            X.0bf r3 = r7.A0B
            java.lang.String r2 = "next_blocked"
            r1 = 0
            X.265 r0 = X.AnonymousClass265.A0t
            X.3Vg r2 = X.C63313hF.A02(r3, r1, r0, r2)
            if (r4 == 0) goto L_0x0041
            r0 = 1
            r7.A0G = r0
            X.C23151ca.A00(r7)
        L_0x0041:
            java.lang.String r1 = r8.A00
            java.lang.Object r0 = r9.A00
            if (r0 == 0) goto L_0x004e
            X.1j3 r0 = (X.AnonymousClass1j3) r0
            java.lang.String r0 = r0.mErrorType
            if (r0 == 0) goto L_0x004e
            r1 = r0
        L_0x004e:
            java.lang.String r0 = "error"
            r2.A03(r0, r1)
            java.lang.String r0 = "log_in_token"
            r2.A03(r0, r6)
            r2.A01()
            r0 = -564127796(0xffffffffde6017cc, float:-4.03689982E18)
            X.C14030oh.A0A(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26791rD.onFail(X.3XX):void");
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(-811885048);
        super.onFinish();
        C23151ca r1 = this.A03;
        r1.A0J = false;
        C23151ca.A00(r1);
        C14030oh.A0A(-1909731700, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(1404577823);
        super.onStart();
        C23151ca r1 = this.A03;
        r1.A0J = true;
        C23151ca.A00(r1);
        C14030oh.A0A(-2087590770, A032);
    }
}
