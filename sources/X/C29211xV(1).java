package X;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.instagram.service.session.UserSession;

/* renamed from: X.1xV  reason: invalid class name and case insensitive filesystem */
public final class C29211xV extends C23411dm implements C82034oy, C82654q3 {
    public static final String __redex_internal_original_name = "AccountSecurityFragment";
    public Dialog A00;
    public UserSession A01;
    public AnonymousClass4MC A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08 = C18250wR.A08();
    public final C63873iU A09 = C63873iU.A06(this, 59);

    public final boolean BNR() {
        return false;
    }

    public final String getModuleName() {
        return "account_security";
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r5.A08 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0B(X.AnonymousClass1U1 r5, X.C29211xV r6) {
        /*
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            if (r5 == 0) goto L_0x0016
            java.lang.String r0 = r5.A03
            r6.A05 = r0
            java.lang.String r0 = r5.A00
            r6.A03 = r0
            java.lang.String r0 = r5.A02
            r6.A04 = r0
            boolean r0 = r5.A0F
            r6.A07 = r0
        L_0x0016:
            r3 = 2131836697(0x7f113f19, float:1.9306568E38)
            if (r5 == 0) goto L_0x0020
            boolean r0 = r5.A08
            r2 = 1
            if (r0 != 0) goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            r0 = 24
            com.facebook.redex.IDxCListenerShape267S0100000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape267S0100000_1_I2
            r1.<init>((java.lang.Object) r6, (int) r0)
            r0 = 15
            X.4MC r0 = X.AnonymousClass4MC.A04(r1, r6, r0, r3, r2)
            r6.A02 = r0
            r4.add(r0)
            androidx.fragment.app.FragmentActivity r3 = r6.getActivity()
            r2 = 42
            r1 = 52
            r0 = 65
            java.lang.String r0 = X.C63213h0.A01(r2, r1, r0)
            java.lang.String r0 = X.AnonymousClass3W8.A01(r3, r0)
            android.net.Uri r3 = X.C15430rJ.A01(r0)
            r0 = 2131829574(0x7f112346, float:1.929212E38)
            java.lang.String r2 = r6.getString(r0)
            r0 = 2131836698(0x7f113f1a, float:1.930657E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r6, r2, r0)
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r0)
            X.0xb r0 = new X.0xb
            r0.<init>(r3)
            X.AnonymousClass3Zw.A01(r1, r0, r2)
            X.C23411dm.A01(r1, r4)
            if (r5 == 0) goto L_0x0084
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0084
            r0 = 2131821824(0x7f110500, float:1.9276402E38)
            X.C63613hu.A03(r4, r0)
            r1 = 2131821822(0x7f1104fe, float:1.9276398E38)
            r0 = 128(0x80, float:1.794E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r5, r6, r0)
            X.AnonymousClass4MA.A03(r0, r4, r1)
            r0 = 2131821823(0x7f1104ff, float:1.92764E38)
            X.C63293hC.A00(r6, r4, r0)
        L_0x0084:
            r6.setItems(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29211xV.A0B(X.1U1, X.1xV):void");
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        AnonymousClass4u2.A08(r3, getString(2131830176));
        r3.CtQ((View.OnClickListener) null, this.A06);
        r3.setIsLoading(this.A06);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-139107681);
        super.onCreate(bundle);
        this.A01 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(1662160527, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1019084957);
        super.onPause();
        getRootActivity();
        C14030oh.A09(9862761, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-30142207);
        super.onResume();
        getRootActivity();
        C14030oh.A09(-1097043455, A022);
    }

    public final void onStart() {
        int i;
        int A022 = C14030oh.A02(793775239);
        super.onStart();
        Dialog dialog = this.A00;
        if (dialog == null || !dialog.isShowing()) {
            C32165H8c A012 = C62403Zn.A01(getContext(), this.A01);
            A012.A00 = new AnonymousClass1i0(this);
            schedule(A012);
            i = 1786576759;
        } else {
            i = 719474574;
        }
        C14030oh.A09(i, A022);
    }
}
