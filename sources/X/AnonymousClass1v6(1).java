package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import fxcache.model.FxCalAccount;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;

/* renamed from: X.1v6  reason: invalid class name */
public final class AnonymousClass1v6 extends AnonymousClass1dQ implements CallerContextable, C81414nk {
    public static final String __redex_internal_original_name = "CrosspostingUnifiedOnboardingFragment";

    public final String getModuleName() {
        return "crossposting_unified_onboarding_fragment";
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            r14 = this;
            r5 = 0
            X.C04220Ms.A0B(r15, r5)
            r0 = r16
            super.onViewCreated(r15, r0)
            r0 = 2131299287(0x7f090bd7, float:1.8216571E38)
            android.view.View r9 = X.AnonymousClass0wJ.A0J(r15, r0)
            r0 = 2131299293(0x7f090bdd, float:1.8216583E38)
            android.view.View r8 = X.AnonymousClass0wJ.A0J(r15, r0)
            r0 = 2131308624(0x7f093050, float:1.8235509E38)
            android.view.View r6 = X.AnonymousClass0wJ.A0J(r15, r0)
            com.instagram.igds.components.button.IgdsButton r6 = (com.instagram.igds.components.button.IgdsButton) r6
            r0 = 2131308625(0x7f093051, float:1.823551E38)
            android.view.View r7 = X.AnonymousClass0wJ.A0J(r15, r0)
            r0 = 2131299296(0x7f090be0, float:1.821659E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0J(r15, r0)
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3
            r0 = 2131299290(0x7f090bda, float:1.8216577E38)
            android.view.View r11 = X.AnonymousClass0wJ.A0J(r15, r0)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r0 = 2131299289(0x7f090bd9, float:1.8216575E38)
            android.view.View r10 = X.AnonymousClass0wJ.A0J(r15, r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r10 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r10
            r0 = 2131299288(0x7f090bd8, float:1.8216573E38)
            android.view.View r12 = X.AnonymousClass0wJ.A0J(r15, r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r12 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r12
            com.instagram.service.session.UserSession r2 = r14.getSession()
            X.0TJ r4 = X.AnonymousClass0TJ.A05
            r0 = 36327902836435161(0x811009000028d9, double:3.037250262260455E-306)
            boolean r0 = X.C63803iN.A0E(r4, r2, r0)
            r2 = 8
            if (r0 == 0) goto L_0x018e
            com.instagram.service.session.UserSession r13 = r14.getSession()
            r0 = 36609377813205955(0x821009000113c3, double:3.2152561709790625E-306)
            int r1 = X.C63803iN.A01(r4, r13, r0)
            if (r1 == 0) goto L_0x017b
            r0 = 1
            if (r1 == r0) goto L_0x0192
            r0 = 2
            if (r1 == r0) goto L_0x0177
            r0 = 3
            if (r1 != r0) goto L_0x018e
            boolean r0 = r14.A01(r12, r1)
            if (r0 == 0) goto L_0x0085
            android.view.ViewGroup$MarginLayoutParams r0 = X.C18230wP.A0H(r3)
            r0.topMargin = r5
            r3.setLayoutParams(r0)
        L_0x0085:
            r11.setVisibility(r2)
            r10.setVisibility(r2)
        L_0x008b:
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x00ee
            com.instagram.service.session.UserSession r10 = r14.getSession()
            r0 = 36327683793102962(0x810fd600002872, double:3.0371117383751555E-306)
            boolean r0 = X.C63803iN.A0E(r4, r10, r0)
            if (r0 == 0) goto L_0x00ee
            X.2AC r0 = r14.A01
            if (r0 == 0) goto L_0x01a9
            java.lang.Integer r0 = X.AnonymousClass3P1.A00(r0)
            int r1 = r0.intValue()
            if (r1 == r5) goto L_0x00e4
            r0 = 1
            if (r1 != r0) goto L_0x00bf
            r0 = 2131835981(0x7f113c4d, float:1.9305116E38)
            X.C18180wK.A10(r3, r14, r0)
            r0 = 2131835980(0x7f113c4c, float:1.9305114E38)
        L_0x00b8:
            java.lang.String r0 = r14.getString(r0)
            r6.setText((java.lang.String) r0)
        L_0x00bf:
            com.instagram.service.session.UserSession r3 = r14.getSession()
            r0 = 36323753898025006(0x810c430000202e, double:3.034626456903439E-306)
            boolean r0 = X.C63803iN.A0E(r4, r3, r0)
            if (r0 == 0) goto L_0x00d4
            r9.setVisibility(r2)
            r8.setVisibility(r5)
        L_0x00d4:
            r0 = 289(0x121, float:4.05E-43)
            X.AnonymousClass0wJ.A17(r6, r0, r14)
            r0 = 290(0x122, float:4.06E-43)
            X.AnonymousClass0wJ.A17(r7, r0, r14)
            X.29W r0 = X.AnonymousClass29W.VIEW
            A00(r0, r14)
            return
        L_0x00e4:
            r0 = 2131835983(0x7f113c4f, float:1.930512E38)
            X.C18180wK.A10(r3, r14, r0)
            r0 = 2131835982(0x7f113c4e, float:1.9305118E38)
            goto L_0x00b8
        L_0x00ee:
            com.instagram.service.session.UserSession r10 = r14.getSession()
            r0 = 36325867022132518(0x810e2f00032526, double:3.035962805097897E-306)
            boolean r0 = X.C63803iN.A0E(r4, r10, r0)
            if (r0 == 0) goto L_0x00bf
            com.instagram.service.session.UserSession r10 = r14.getSession()
            r0 = 36325867022263591(0x810e2f00052527, double:3.035962805180788E-306)
            boolean r0 = X.C63803iN.A0E(r4, r10, r0)
            if (r0 == 0) goto L_0x0116
            r0 = 2131837278(0x7f11415e, float:1.9307747E38)
            X.C18180wK.A10(r3, r14, r0)
            r0 = 2131837268(0x7f114154, float:1.9307726E38)
            goto L_0x00b8
        L_0x0116:
            com.instagram.service.session.UserSession r10 = r14.getSession()
            r0 = 36325867022329128(0x810e2f00062528, double:3.035962805222234E-306)
            boolean r0 = X.C63803iN.A0E(r4, r10, r0)
            if (r0 == 0) goto L_0x012f
            r0 = 2131837277(0x7f11415d, float:1.9307744E38)
            X.C18180wK.A10(r3, r14, r0)
            r0 = 2131837269(0x7f114155, float:1.9307728E38)
            goto L_0x00b8
        L_0x012f:
            com.instagram.service.session.UserSession r10 = r14.getSession()
            r0 = 36325867022394665(0x810e2f00072529, double:3.03596280526368E-306)
            boolean r0 = X.C63803iN.A0E(r4, r10, r0)
            if (r0 == 0) goto L_0x0143
            r0 = 2131837270(0x7f114156, float:1.930773E38)
            goto L_0x00b8
        L_0x0143:
            com.instagram.service.session.UserSession r10 = r14.getSession()
            r0 = 36325867022460202(0x810e2f0008252a, double:3.035962805305126E-306)
            boolean r0 = X.C63803iN.A0E(r4, r10, r0)
            if (r0 == 0) goto L_0x015d
            r0 = 2131837279(0x7f11415f, float:1.9307749E38)
            X.C18180wK.A10(r3, r14, r0)
            r0 = 2131837271(0x7f114157, float:1.9307732E38)
            goto L_0x00b8
        L_0x015d:
            com.instagram.service.session.UserSession r10 = r14.getSession()
            r0 = 36325867022525739(0x810e2f0009252b, double:3.035962805346572E-306)
            boolean r0 = X.C63803iN.A0E(r4, r10, r0)
            if (r0 == 0) goto L_0x00bf
            r0 = 2131837278(0x7f11415e, float:1.9307747E38)
            X.C18180wK.A10(r3, r14, r0)
            r0 = 2131837272(0x7f114158, float:1.9307734E38)
            goto L_0x00b8
        L_0x0177:
            r0 = 2131232008(0x7f080508, float:1.8080113E38)
            goto L_0x0195
        L_0x017b:
            boolean r0 = r14.A01(r10, r1)
            if (r0 == 0) goto L_0x018a
            android.view.ViewGroup$MarginLayoutParams r0 = X.C18230wP.A0H(r3)
            r0.topMargin = r5
            r3.setLayoutParams(r0)
        L_0x018a:
            r11.setVisibility(r2)
            goto L_0x01a4
        L_0x018e:
            r11.setVisibility(r2)
            goto L_0x01a1
        L_0x0192:
            r0 = 2131231979(0x7f0804eb, float:1.8080054E38)
        L_0x0195:
            r11.setImageResource(r0)
            android.view.ViewGroup$MarginLayoutParams r0 = X.C18230wP.A0H(r3)
            r0.topMargin = r5
            r3.setLayoutParams(r0)
        L_0x01a1:
            r10.setVisibility(r2)
        L_0x01a4:
            r12.setVisibility(r2)
            goto L_0x008b
        L_0x01a9:
            java.lang.String r0 = "entrypoint"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1v6.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public AnonymousClass1v6(Bundle bundle, UserSession userSession) {
        this.A02 = userSession;
        String string = bundle.getString("args_entrypoint");
        if (string != null) {
            AnonymousClass2AC valueOf = AnonymousClass2AC.valueOf(string);
            C04220Ms.A0B(valueOf, 0);
            this.A01 = valueOf;
            this.A00 = bundle.getInt("args_num_of_views", -1);
            this.A04 = bundle.getBoolean("args_is_after_fbc", false);
            AnonymousClass1v3 A00 = AnonymousClass3ZC.A00(getSession());
            C83844s5 r0 = A00.A03;
            if (r0 == null) {
                r0 = A00.A04();
                A00.A03 = r0;
            }
            this.A03 = r0;
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final void A00(AnonymousClass29W r6, AnonymousClass1v6 r7) {
        UserSession A02 = r7.getSession();
        AnonymousClass2AC r4 = r7.A01;
        if (r4 != null) {
            AnonymousClass2AD A00 = C49352rF.A00(r4, r7.getSession(), r7.A04);
            AnonymousClass14U A002 = AnonymousClass14U.A00();
            A002.A07("newly_linked_accounts", Boolean.valueOf(AnonymousClass3ZC.A00(r7.getSession()).A06));
            A002.A07("is_account_linked", C18180wK.A0Y());
            C18210wN.A1D(A002, (long) r7.A00);
            C49322rC.A00(r4, r6, A00, A002, A02);
            return;
        }
        C04220Ms.A0E("entrypoint");
        throw null;
    }

    private final boolean A01(GradientSpinnerAvatarView gradientSpinnerAvatarView, int i) {
        String str;
        if (C63803iN.A0F(getSession())) {
            str = C67373zR.A01(getSession());
        } else {
            C04620Ok r1 = C06810aP.A01;
            if (C18200wM.A1X(getSession(), r1)) {
                str = r1.A01(getSession()).A18();
            } else if (C67363zQ.A0H(getSession())) {
                str = C67363zQ.A01(getSession()).A02;
            } else {
                FxCalAccount A01 = C35692Ol.A00(getSession()).A01(CallerContext.A00(AnonymousClass1v6.class), "ig_to_fb_sharing_account");
                if (A01 != null) {
                    str = A01.A04;
                } else {
                    str = null;
                }
            }
        }
        UserSession A02 = getSession();
        String A00 = ((C67053yn) A02.A01(C67053yn.class, new KtLambdaShape116S0100000_I2_96(A02, 20))).A00(str);
        if (A00 != null) {
            Context requireContext = requireContext();
            gradientSpinnerAvatarView.A04();
            gradientSpinnerAvatarView.A09(C18250wR.A0K(A00), this);
            int i2 = R.drawable.avatar_bottom_badge_facebook_24;
            if (i == 0) {
                i2 = R.drawable.avatar_bottom_badge_facebook_16;
            }
            gradientSpinnerAvatarView.setBottomBadgeDrawable(requireContext.getDrawable(i2));
            gradientSpinnerAvatarView.A01 = C09860go.A03(requireContext, 3);
            return true;
        }
        gradientSpinnerAvatarView.setVisibility(8);
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1323778769);
        super.onCreate(bundle);
        AnonymousClass1v3 A00 = AnonymousClass3ZC.A00(getSession());
        C83844s5 r0 = A00.A03;
        if (r0 == null) {
            r0 = A00.A04();
            A00.A03 = r0;
        }
        this.A03 = r0;
        C14030oh.A09(449555493, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1810035335);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.crossposting_unified_onboarding_bottom_sheet_upsell, viewGroup, false);
        C14030oh.A09(-643051839, A02);
        return inflate;
    }
}
