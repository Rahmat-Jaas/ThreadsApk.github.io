package com.instagram.business.fragment;

import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass264;
import X.AnonymousClass2A8;
import X.AnonymousClass2A9;
import X.AnonymousClass323;
import X.AnonymousClass3WZ;
import X.AnonymousClass3z8;
import X.AnonymousClass4u2;
import X.C10300i6;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18240wQ;
import X.C24711ju;
import X.C26141q7;
import X.C311924p;
import X.C34640IcN;
import X.C35762Os;
import X.C37408JrQ;
import X.C61853Wb;
import X.C62383Zj;
import X.C63803iN;
import X.C63813iO;
import X.C67293zJ;
import X.C67363zQ;
import X.C82034oy;
import X.C82424pb;
import X.C84214sk;
import X.C84264sr;
import X.C84654td;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxAListenerShape459S0100000_1_I2;
import com.facebook.redex.IDxDListenerShape644S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import java.util.Map;

public final class ConnectFBPageFragment extends C34640IcN implements C82424pb, C82034oy, C84264sr {
    public BusinessFlowAnalyticsLogger A00;
    public C84654td A01;
    public BusinessNavBar A02;
    public C24711ju A03;
    public C10300i6 A04;
    public IgdsBottomButtonLayout A05;
    public String A06;
    public boolean A07;
    public final C84214sk A08 = new IDxDListenerShape644S0100000_1_I2(this, 1);

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final String getModuleName() {
        return "connect_fb_page";
    }

    public static void A00(ConnectFBPageFragment connectFBPageFragment) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = connectFBPageFragment.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdx(new C37408JrQ("facebook_connect", connectFBPageFragment.A06, "facebook_connect", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public static void A01(ConnectFBPageFragment connectFBPageFragment) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = connectFBPageFragment.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdy(new C37408JrQ("facebook_connect", connectFBPageFragment.A06, "facebook_connect", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public static void A02(ConnectFBPageFragment connectFBPageFragment) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = connectFBPageFragment.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.BcE(new C37408JrQ("facebook_connect", connectFBPageFragment.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        C84654td r1 = connectFBPageFragment.A01;
        if (r1 != null) {
            r1.Bel(AnonymousClass3z8.A00(connectFBPageFragment.A04));
        }
    }

    private boolean A03() {
        C84654td r0;
        if (!C67293zJ.A05(this.A01) && ((r0 = this.A01) == null || r0.Aiz() != C311924p.CREATOR_SIGNUP_FLOW)) {
            return false;
        }
        C10300i6 r2 = this.A04;
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A06;
        if (C63803iN.A05(r3, r2, 36316602777472223L).booleanValue() || C63803iN.A05(r3, this.A04, 36316602777603296L).booleanValue()) {
            return true;
        }
        return false;
    }

    public final void CCX() {
        AnonymousClass264 r0;
        C84654td r02;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("facebook_connect", this.A06, "continue", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (A03()) {
            C10300i6 r2 = this.A04;
            C62383Zj.A01(AnonymousClass2A9.A02, AnonymousClass2A8.A0G, r2);
        }
        C10300i6 r3 = this.A04;
        C84654td r22 = this.A01;
        if (C61853Wb.A01(C67293zJ.A00, r3, "ig_professional_conversion_flow") || !(r22 == null || AnonymousClass0wJ.A0R(r22).A0C == null)) {
            A02(this);
            return;
        }
        C26141q7 A002 = C35762Os.A00().A00(this, this.A04, AnonymousClass3WZ.A01(requireActivity(), (UserSession) this.A04, new IDxAListenerShape459S0100000_1_I2(this, 1)));
        if (C67293zJ.A05(this.A01) || ((r02 = this.A01) != null && r02.Aiz() == C311924p.CREATOR_SIGNUP_FLOW)) {
            r0 = AnonymousClass264.CREATOR_ACCOUNT_CONVERSION;
        } else {
            r0 = AnonymousClass264.BUSINESS_CONNECT_FB_PAGE;
        }
        A002.A06(r0.A00());
    }

    public final void CJ9() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("facebook_connect", this.A06, "skip", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger2 = this.A00;
        if (businessFlowAnalyticsLogger2 != null) {
            businessFlowAnalyticsLogger2.Bdo(new C37408JrQ("facebook_connect", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (A03()) {
            C10300i6 r2 = this.A04;
            C62383Zj.A01(AnonymousClass2A9.A02, AnonymousClass2A8.A0H, r2);
        }
        C84654td r22 = this.A01;
        if (r22 != null) {
            ((BusinessConversionActivity) r22).A0J(AnonymousClass3z8.A00(this.A04), true);
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (this.A07) {
            AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 132);
        }
    }

    public final C10300i6 getSession() {
        return this.A04;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        C10300i6 r3 = this.A04;
        if (i2 == -1) {
            C67363zQ.A06(intent, r3, AnonymousClass3WZ.A00(requireActivity(), (UserSession) r3, this.A08), i2);
        } else if (i == 64206) {
            C63813iO.A04(2131830180);
            A01(this);
            super.onActivityResult(i, i2, intent);
        }
        A00(this);
        super.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.BbZ(new C37408JrQ("facebook_connect", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (!this.A07) {
            return true;
        }
        this.A01.CfG(AnonymousClass3z8.A00(this.A04));
        return true;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A01 = C67293zJ.A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (r2 != com.instagram.business.controller.datamodel.ConversionStep.RENEW) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = -275909405(0xffffffffef8df4e3, float:-8.786687E28)
            int r3 = X.C14030oh.A02(r0)
            super.onCreate(r5)
            android.os.Bundle r1 = r4.requireArguments()
            java.lang.String r0 = "entry_point"
            java.lang.String r0 = r1.getString(r0)
            r4.A06 = r0
            X.0i6 r0 = X.C18190wL.A0S(r1)
            r4.A04 = r0
            X.C24731jw.A01(r4)
            X.4td r0 = r4.A01
            if (r0 == 0) goto L_0x0031
            X.0i6 r2 = r4.A04
            X.24p r1 = r0.Aiz()
            X.4td r0 = r4.A01
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = X.C18190wL.A0O(r1, r4, r2, r0)
            r4.A00 = r0
        L_0x0031:
            X.4td r0 = r4.A01
            if (r0 == 0) goto L_0x003e
            com.instagram.business.controller.datamodel.ConversionStep r2 = r0.CWQ()
            com.instagram.business.controller.datamodel.ConversionStep r1 = com.instagram.business.controller.datamodel.ConversionStep.RENEW
            r0 = 0
            if (r2 == r1) goto L_0x003f
        L_0x003e:
            r0 = 1
        L_0x003f:
            r4.A07 = r0
            r0 = -616750385(0xffffffffdb3d22cf, float:-5.3237043E16)
            X.C14030oh.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.fragment.ConnectFBPageFragment.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24711ju r1;
        int A022 = C14030oh.A02(2006500486);
        boolean A032 = A03();
        int i = R.layout.connect_fb_fragment;
        if (A032) {
            i = R.layout.connect_fb_igds_fragment;
        }
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, i);
        boolean A033 = A03();
        View findViewById = A0H.findViewById(R.id.navigation_bar);
        if (A033) {
            this.A05 = (IgdsBottomButtonLayout) findViewById;
            int i2 = 2131830179;
            if (A03()) {
                i2 = 2131824395;
            }
            int i3 = 2131835990;
            if (A03()) {
                i3 = 2131831871;
            }
            r1 = new C24711ju((C84264sr) this, this.A05, i2, i3);
        } else {
            BusinessNavBar businessNavBar = (BusinessNavBar) findViewById;
            this.A02 = businessNavBar;
            int i4 = 2131830179;
            if (A03()) {
                i4 = 2131824395;
            }
            int i5 = 2131835990;
            if (A03()) {
                i5 = 2131831871;
            }
            r1 = new C24711ju(businessNavBar, (C84264sr) this, i4, i5);
        }
        this.A03 = r1;
        registerLifecycleListener(r1);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A00;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdt(new C37408JrQ("facebook_connect", this.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (A03()) {
            C10300i6 r2 = this.A04;
            C62383Zj.A01(AnonymousClass2A9.A02, AnonymousClass2A8.A04, r2);
        }
        C14030oh.A09(2026544249, A022);
        return A0H;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1379720923);
        super.onDestroyView();
        unregisterLifecycleListener(this.A03);
        C14030oh.A09(379728544, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1715915950);
        super.onResume();
        Context requireContext = requireContext();
        boolean A1X = AnonymousClass0wJ.A1X(AnonymousClass323.A01.getValue());
        int i = R.drawable.instagram_business_images_fb_connect_business;
        if (A1X) {
            i = R.drawable.ig_illustrations_illo_fb_connect_refresh;
        }
        Drawable drawable = requireContext.getDrawable(i);
        drawable.getClass();
        if (A03()) {
            IgdsHeadline A0S = C18240wQ.A0S(requireView(), R.id.headline);
            A0S.setImageDrawable(requireContext().getDrawable(R.drawable.fx_upsell_assets_account_center_logout_value_prop_image));
            A0S.setHeadline(2131827782);
            int i2 = 2131827780;
            if (C63803iN.A05(AnonymousClass0TJ.A05, this.A04, 36325441820173407L).booleanValue()) {
                i2 = 2131827781;
            }
            A0S.setBody(i2);
        } else {
            View view = this.mView;
            view.getClass();
            C18200wM.A0J(view, R.id.image).setImageDrawable(drawable);
            AnonymousClass0wJ.A0L(view, R.id.title).setText(2131824303);
            AnonymousClass0wJ.A0L(this.mView, R.id.subtitle).setText(2131824306);
        }
        C14030oh.A09(-1360048063, A022);
    }
}
