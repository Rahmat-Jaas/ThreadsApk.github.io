package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxEListenerShape223S0100000_1_I2;
import com.facebook.redex.IDxLListenerShape686S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.service.session.UserSession;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3Vj  reason: invalid class name and case insensitive filesystem */
public final class C61783Vj {
    public boolean A00;
    public final FragmentActivity A01;
    public final C34640IcN A02;
    public final BusinessFlowAnalyticsLogger A03;
    public final C84294su A04 = new C682142t(this);
    public final C82394pY A05;
    public final C82394pY A06;
    public final UserSession A07;

    private List A00() {
        C34640IcN icN = this.A02;
        return Arrays.asList(new String[]{icN.getString(2131820885), icN.getString(2131820887)});
    }

    public final void A04(List list) {
        if (AnonymousClass0wJ.A0Y(this.A07).A0g() == AnonymousClass266.A06) {
            C62133Xg r2 = new C62133Xg((View.OnClickListener) C18200wM.A0R(C311924p.INTEREST_ACCOUNT_CONVERSION, this, 181), 2131836517);
            r2.A02 = this.A01.getColor(R.color.blue_5);
            r2.A06 = A00();
            list.add(r2);
        }
    }

    public C61783Vj(C34640IcN icN, UserSession userSession) {
        IDxEListenerShape223S0100000_1_I2 A0P = C18220wO.A0P(this, 69);
        this.A06 = A0P;
        IDxEListenerShape223S0100000_1_I2 A0P2 = C18220wO.A0P(this, 70);
        this.A05 = A0P2;
        this.A07 = userSession;
        this.A02 = icN;
        this.A01 = icN.requireActivity();
        BusinessFlowAnalyticsLogger A012 = C37076Jk8.A01(C311924p.CONVERSION_FLOW, userSession, "business_conversion_controller", (String) null);
        A012.getClass();
        this.A03 = A012;
        if (icN.mView != null) {
            AnonymousClass3LY.A00(userSession).A01(A0P, AnonymousClass45V.class);
            AnonymousClass3LY.A00(userSession).A01(A0P2, C687145e.class);
            icN.registerLifecycleListener(new IDxLListenerShape686S0100000_1_I2(this, 1));
        }
    }

    public final void A01(C311924p r8) {
        int i;
        int ordinal = r8.ordinal();
        if (ordinal == 2) {
            C62423Zt.A02(this.A07);
            i = 11;
        } else if (ordinal == 5) {
            i = 12;
        } else {
            throw C18190wL.A0a("unsupported flow type");
        }
        C34502Ju.A00();
        C62883b4.A01();
        FragmentActivity fragmentActivity = this.A01;
        C04220Ms.A0B(fragmentActivity, 0);
        Intent A042 = C18250wR.A04(fragmentActivity, BusinessConversionActivity.class);
        C34640IcN icN = this.A02;
        Bundle requireArguments = icN.requireArguments();
        requireArguments.putString("entry_point", "setting");
        requireArguments.putInt("intro_entry_position", 0);
        C18250wR.A0o(A042, r8.A00, requireArguments);
        C10650ih.A0E(A042, icN, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ef, code lost:
        if (X.C67333zN.A06(r6, 36319244182361084L, true) != false) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Integer r9, java.util.List r10) {
        /*
            r8 = this;
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            com.instagram.service.session.UserSession r6 = r8.A07
            com.instagram.user.model.User r7 = X.AnonymousClass0wJ.A0Y(r6)
            X.266 r0 = r7.A0g()
            if (r0 == 0) goto L_0x006b
            r7.A3a()
            r5 = 1
            X.266 r0 = r7.A0g()
            int r1 = r0.ordinal()
            if (r1 == r5) goto L_0x00a9
            r0 = 2
            if (r1 == r0) goto L_0x008c
            r0 = 3
            if (r1 != r0) goto L_0x006b
            r2 = 2131827941(0x7f111ce5, float:1.9288809E38)
            X.266 r1 = X.AnonymousClass266.A04
            r0 = 182(0xb6, float:2.55E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r1 = X.C18200wM.A0R(r1, r8, r0)
            X.3Xg r0 = new X.3Xg
            r0.<init>((android.view.View.OnClickListener) r1, (int) r2)
            r3.add(r0)
            r2 = 2131836515(0x7f113e63, float:1.9306199E38)
            r0 = 138(0x8a, float:1.93E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r1 = X.C18210wN.A0H(r8, r0)
        L_0x0040:
            X.3Xg r0 = new X.3Xg
            r0.<init>((android.view.View.OnClickListener) r1, (int) r2)
            r3.add(r0)
        L_0x0048:
            boolean r0 = r7.A3a()
            if (r0 == 0) goto L_0x006c
            r1 = 2131836486(0x7f113e46, float:1.930614E38)
            r0 = 183(0xb7, float:2.56E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r3, r8, r0)
            X.3Xg r3 = new X.3Xg
            r3.<init>((android.view.View.OnClickListener) r0, (int) r1)
            androidx.fragment.app.FragmentActivity r2 = r8.A01
            java.lang.Integer r1 = X.AnonymousClass006.A01
            r0 = 2131099707(0x7f06003b, float:1.7811775E38)
            if (r9 != r1) goto L_0x0068
            r0 = 2131100092(0x7f0601bc, float:1.7812556E38)
        L_0x0068:
            X.C62133Xg.A00(r2, r3, r10, r0)
        L_0x006b:
            return
        L_0x006c:
            java.util.Iterator r4 = r3.iterator()
        L_0x0070:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r3 = r4.next()
            X.3Xg r3 = (X.C62133Xg) r3
            androidx.fragment.app.FragmentActivity r2 = r8.A01
            java.lang.Integer r1 = X.AnonymousClass006.A01
            r0 = 2131099707(0x7f06003b, float:1.7811775E38)
            if (r9 != r1) goto L_0x0088
            r0 = 2131100092(0x7f0601bc, float:1.7812556E38)
        L_0x0088:
            X.C62133Xg.A00(r2, r3, r10, r0)
            goto L_0x0070
        L_0x008c:
            r2 = 2131836515(0x7f113e63, float:1.9306199E38)
            r0 = 138(0x8a, float:1.93E-43)
            com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1 r1 = X.C18210wN.A0H(r8, r0)
            X.3Xg r0 = new X.3Xg
            r0.<init>((android.view.View.OnClickListener) r1, (int) r2)
            r3.add(r0)
            r2 = 2131836507(0x7f113e5b, float:1.9306183E38)
            X.266 r1 = X.AnonymousClass266.A05
            r0 = 182(0xb6, float:2.55E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r1 = X.C18200wM.A0R(r1, r8, r0)
            goto L_0x0040
        L_0x00a9:
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 36312174666187622(0x8101bb00000366, double:3.027303704063653E-306)
            boolean r2 = X.C63803iN.A0E(r4, r6, r0)
            if (r2 != 0) goto L_0x00d6
            boolean r2 = X.C67333zN.A05(r6)
            if (r2 != 0) goto L_0x00d6
        L_0x00bc:
            X.24p r1 = X.C311924p.INTEREST_ACCOUNT_CONVERSION
            r0 = 181(0xb5, float:2.54E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r2 = X.C18200wM.A0R(r1, r8, r0)
            com.instagram.quickpromotion.intf.QPTooltipAnchor r0 = com.instagram.quickpromotion.intf.QPTooltipAnchor.A0F
            X.1xk r1 = new X.1xk
            r1.<init>(r2, r0)
            r3.add(r1)
            java.util.List r0 = r8.A00()
            r1.A06 = r0
            goto L_0x0048
        L_0x00d6:
            boolean r0 = X.C63803iN.A0E(r4, r6, r0)
            if (r0 != 0) goto L_0x00e2
            boolean r0 = X.C67333zN.A05(r6)
            if (r0 == 0) goto L_0x0048
        L_0x00e2:
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            r0 = 36319244182361084(0x810829000013fc, double:3.031774494558407E-306)
            boolean r0 = X.C67333zN.A06(r6, r0, r5)
            if (r0 == 0) goto L_0x0048
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61783Vj.A02(java.lang.Integer, java.util.List):void");
    }

    public final void A03(Integer num, List list) {
        C62133Xg r3 = new C62133Xg((View.OnClickListener) C18200wM.A0R(C311924p.PROFESSIONAL_SIGNUP_FLOW, this, 181), 2131821080);
        r3.A06 = A00();
        FragmentActivity fragmentActivity = this.A01;
        Integer num2 = AnonymousClass006.A01;
        int i = R.color.blue_5;
        if (num == num2) {
            i = R.color.igds_primary_text;
        }
        C62133Xg.A00(fragmentActivity, r3, list, i);
    }
}
