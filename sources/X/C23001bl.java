package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* renamed from: X.1bl  reason: invalid class name and case insensitive filesystem */
public final class C23001bl extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "TwoFacFinishFragment";
    public Integer A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final C04530Oa A09 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        r2.Cqb(2131837068);
    }

    public static final void A00(C23001bl r5) {
        Fragment A012;
        C04530Oa r4 = r5.A09;
        AnonymousClass3WQ.A00(AnonymousClass0wJ.A0X(r4), AnonymousClass006.A0u);
        C62653aT r1 = C62653aT.A02;
        C04220Ms.A06(r1);
        if (r5.A07) {
            r1.A03();
            Bundle requireArguments = r5.requireArguments();
            A012 = new AnonymousClass1bL();
            A012.setArguments(requireArguments);
        } else {
            boolean z = r5.A04;
            C58803Hi A032 = r1.A03();
            if (z) {
                A012 = A032.A02((ArrayList) null, false);
            } else {
                A012 = A032.A01(AnonymousClass006.A0j, true, !r5.requireArguments().getBoolean("has_two_fac_already_on"));
            }
        }
        AnonymousClass0wJ.A19(A012, r5.requireActivity(), AnonymousClass0wJ.A0U(r4));
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A09);
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final boolean onBackPressed() {
        A00(this);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0072, code lost:
        if (r2 == false) goto L_0x0074;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = 717269313(0x2ac0a941, float:3.4223495E-13)
            int r3 = X.C14030oh.A02(r0)
            super.onCreate(r10)
            android.os.Bundle r7 = r9.requireArguments()
            r4 = 0
            r1 = 33
            r0 = 124(0x7c, float:1.74E-43)
            java.lang.String r0 = X.C63833iQ.A07(r4, r1, r0)
            boolean r0 = r7.getBoolean(r0)
            r9.A04 = r0
            java.lang.String r0 = "has_phone_number_confirmed"
            boolean r0 = r7.getBoolean(r0)
            r9.A02 = r0
            java.lang.String r0 = X.C63833iQ.A02()
            java.lang.String r1 = ""
            java.lang.String r0 = X.C18210wN.A0b(r7, r0, r1)
            r9.A01 = r0
            java.lang.String r0 = "has_two_fac_already_on"
            boolean r0 = r7.getBoolean(r0)
            r9.A03 = r0
            java.lang.String r0 = "two_fac_enable_method"
            java.lang.String r8 = X.C18210wN.A0b(r7, r0, r1)
            java.lang.Integer[] r6 = X.C18240wQ.A1a()
            int r5 = r6.length
            r2 = 0
        L_0x0045:
            if (r2 >= r5) goto L_0x0056
            r1 = r6[r2]
            java.lang.String r0 = X.C36182Qi.A00(r1)
            boolean r0 = X.C04220Ms.A0I(r0, r8)
            if (r0 != 0) goto L_0x0058
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0056:
            java.lang.Integer r1 = X.AnonymousClass006.A0N
        L_0x0058:
            r9.A00 = r1
            java.lang.String r0 = "is_eligible_for_whatsapp_two_factor"
            boolean r2 = r7.getBoolean(r0)
            r9.A05 = r2
            java.lang.Integer r1 = r9.A00
            if (r1 != 0) goto L_0x006d
            java.lang.String r0 = "twoFacEnableMethod"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x006d:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 != r0) goto L_0x0074
            r0 = 1
            if (r2 != 0) goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            r9.A06 = r0
            java.lang.String r0 = "is_eligible_for_multiple_totp"
            boolean r0 = r7.getBoolean(r0)
            r9.A08 = r0
            X.0Oa r2 = r9.A09
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r2)
            java.lang.String r0 = "confirm"
            X.AnonymousClass3WQ.A02(r1, r0)
            X.0i6 r1 = X.AnonymousClass0wJ.A0U(r2)
            X.C04220Ms.A0B(r1, r4)
            X.0kW r0 = X.C60923Rc.A01
            X.0nS r1 = X.C13330nS.A01(r0, r1)
            java.lang.String r0 = "instagram_two_fac_setup_complete"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2317(0x90d, float:3.247E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r0 = X.C18180wK.A0I(r1, r0)
            X.C63833iQ.A0D(r0)
            r0.Bb4()
            r0 = 733057867(0x2bb1934b, float:1.2617488E-12)
            X.C14030oh.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23001bl.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a1, code lost:
        if (r11.A07 == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0130, code lost:
        if (r1 != X.AnonymousClass006.A01) goto L_0x0132;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            r11 = this;
            r0 = -1713004003(0xffffffff99e5a21d, float:-2.3743522E-23)
            int r4 = X.C14030oh.A02(r0)
            r3 = 0
            X.C04220Ms.A0B(r12, r3)
            r0 = 2131497401(0x7f0c11b9, float:1.8618394E38)
            r2 = 0
            android.view.View r5 = r12.inflate(r0, r13, r3)
            r0 = 2131299052(0x7f090aec, float:1.8216095E38)
            android.view.View r8 = X.AnonymousClass0wJ.A0J(r5, r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 2131299021(0x7f090acd, float:1.8216032E38)
            android.view.View r6 = X.AnonymousClass0wJ.A0J(r5, r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            boolean r0 = r11.A04
            java.lang.String r10 = "twoFacEnableMethod"
            if (r0 == 0) goto L_0x010e
            r7 = 2131837074(0x7f114092, float:1.9307333E38)
        L_0x002e:
            X.C18180wK.A10(r8, r11, r7)
            java.lang.Integer r7 = r11.A00
            if (r7 == 0) goto L_0x004f
            java.lang.Integer r1 = X.AnonymousClass006.A00
            X.0Oa r0 = r11.A09
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            if (r7 != r1) goto L_0x0058
            X.C62423Zt.A02(r0)
            boolean r0 = r11.A02
            if (r0 != 0) goto L_0x0054
            r1 = 2131837069(0x7f11408d, float:1.9307323E38)
            java.lang.String r0 = r11.A01
            if (r0 != 0) goto L_0x0063
            java.lang.String r10 = "phoneNumber"
        L_0x004f:
            X.C04220Ms.A0E(r10)
            r0 = 0
            throw r0
        L_0x0054:
            r0 = 2131837070(0x7f11408e, float:1.9307325E38)
            goto L_0x005e
        L_0x0058:
            X.C62423Zt.A02(r0)
            r0 = 2131837071(0x7f11408f, float:1.9307327E38)
        L_0x005e:
            java.lang.String r0 = r11.getString(r0)
            goto L_0x006b
        L_0x0063:
            java.lang.String r0 = X.C62923b9.A00(r0)
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r11, r0, r1)
        L_0x006b:
            r6.setText(r0)
            r0 = 2131302512(0x7f091870, float:1.8223112E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0K(r5, r0)
            r0 = 538(0x21a, float:7.54E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r11)
            r0 = 2131299831(0x7f090df7, float:1.8217675E38)
            android.view.View r9 = X.AnonymousClass0wJ.A0J(r5, r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r9 = (com.instagram.ui.widget.progressbutton.ProgressButton) r9
            r0 = 539(0x21b, float:7.55E-43)
            X.AnonymousClass0wJ.A16(r9, r0, r11)
            r0 = 2131309138(0x7f093252, float:1.8236551E38)
            android.view.View r6 = X.AnonymousClass0wJ.A0K(r5, r0)
            boolean r0 = r11.A06
            int r0 = X.C18190wL.A00(r0)
            r6.setVisibility(r0)
            boolean r0 = r11.A05
            if (r0 == 0) goto L_0x00a3
            boolean r1 = r11.A07
            r0 = 2131831737(0x7f112bb9, float:1.9296508E38)
            if (r1 != 0) goto L_0x00a6
        L_0x00a3:
            r0 = 2131826219(0x7f11162b, float:1.9285316E38)
        L_0x00a6:
            r9.setText((int) r0)
            X.13k r8 = new X.13k
            r8.<init>(r6)
            r7 = 2131837185(0x7f114101, float:1.9307558E38)
            X.3vc r6 = X.C65723vc.A00
            r1 = 4
            com.facebook.redex.IDxTListenerShape181S0200000_1_I2 r0 = new com.facebook.redex.IDxTListenerShape181S0200000_1_I2
            r0.<init>((int) r1, (java.lang.Object) r9, (java.lang.Object) r11)
            X.4MC r1 = new X.4MC
            r1.<init>((android.widget.CompoundButton.OnCheckedChangeListener) r6, (X.C33516HpC) r0, (int) r7, (boolean) r3)
            r0 = 2131837184(0x7f114100, float:1.9307556E38)
            r1.A02 = r0
            r0 = 0
            X.C50342sq.A00(r0, r8, r0, r1)
            r0 = 2131300617(0x7f091109, float:1.8219269E38)
            android.view.View r6 = X.AnonymousClass0wJ.A0J(r5, r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.Integer r1 = r11.A00
            if (r1 == 0) goto L_0x004f
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x010b
            boolean r0 = r11.A08
            if (r0 == 0) goto L_0x010b
        L_0x00dc:
            r6.setVisibility(r2)
            r0 = 2131837073(0x7f114091, float:1.930733E38)
            java.lang.String r3 = r11.getString(r0)
            r0 = 2131837072(0x7f114090, float:1.9307329E38)
            java.lang.String r2 = r11.getString(r0)
            androidx.fragment.app.FragmentActivity r1 = r11.requireActivity()
            r0 = 2131100091(0x7f0601bb, float:1.7812554E38)
            int r1 = r1.getColor(r0)
            r0 = 40
            com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2 r0 = X.C18730xl.A00(r11, r1, r0)
            X.AnonymousClass3Zw.A03(r0, r6, r3, r2)
            X.C24731jw.A02(r11)
            r0 = -946771680(0xffffffffc7916920, float:-74450.25)
            X.C14030oh.A09(r0, r4)
            return r5
        L_0x010b:
            r2 = 8
            goto L_0x00dc
        L_0x010e:
            boolean r0 = r11.A02
            if (r0 == 0) goto L_0x0123
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x0123
            java.lang.Integer r1 = r11.A00
            if (r1 == 0) goto L_0x004f
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 != r0) goto L_0x0123
            r7 = 2131837076(0x7f114094, float:1.9307337E38)
            goto L_0x002e
        L_0x0123:
            boolean r0 = r11.A03
            if (r0 == 0) goto L_0x0132
            java.lang.Integer r1 = r11.A00
            if (r1 == 0) goto L_0x004f
            java.lang.Integer r0 = X.AnonymousClass006.A01
            r7 = 2131837077(0x7f114095, float:1.9307339E38)
            if (r1 == r0) goto L_0x002e
        L_0x0132:
            r7 = 2131837075(0x7f114093, float:1.9307335E38)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23001bl.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
