package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.barcelona.R;

/* renamed from: X.1Yc  reason: invalid class name and case insensitive filesystem */
public final class C22441Yc extends C34640IcN {
    public static final String __redex_internal_original_name = "AccountPrivacySwitchBottomSheetFragment";
    public View.OnClickListener A00;
    public C82974qa A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final CallerContext A05 = CallerContext.A01(__redex_internal_original_name);
    public final C11630kW A06 = new C683043g(this);
    public final String A07 = "ig_android_linking_cache_ig_to_fb_reels_crossposting";
    public final String A08 = "999+";
    public final C04530Oa A09 = C62373Zc.A02(this, 10);
    public final C04530Oa A0A = C80644m9.A00(this);

    public final String getModuleName() {
        return "privacy_switch_bottom_sheet";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0094 A[LOOP:0: B:9:0x008e->B:11:0x0094, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            r9 = this;
            r3 = 0
            X.C04220Ms.A0B(r10, r3)
            super.onViewCreated(r10, r11)
            r0 = 2131296370(0x7f090072, float:1.8210655E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r10, r0)
            X.Bza r0 = X.C24044D6t.A00(r0)
            android.view.View r6 = r0.BLC()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            boolean r1 = r9.A03
            boolean r0 = r9.A04
            if (r1 != 0) goto L_0x00a0
            if (r0 == 0) goto L_0x01f5
            android.content.Context r1 = r9.requireContext()
            r5 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.3Ya r4 = new X.3Ya
            r4.<init>(r1, r0, r0)
            X.0Oa r2 = r9.A0A
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r2)
            X.1z6 r7 = X.C35692Ol.A00(r0)
            java.lang.String r1 = r9.A07
            com.facebook.common.callercontext.CallerContext r0 = r9.A05
            X.C04220Ms.A05(r0)
            boolean r0 = r7.A05(r0, r1)
            if (r0 != 0) goto L_0x0098
            X.0i6 r8 = X.AnonymousClass0wJ.A0U(r2)
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r0 = 36326339468338693(0x810e9d00002605, double:3.0362615819810705E-306)
            boolean r0 = X.C63803iN.A0E(r7, r8, r0)
            if (r0 == 0) goto L_0x0098
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r9)
            r0 = 2131835584(0x7f113ac0, float:1.930431E38)
        L_0x005d:
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131232915(0x7f080893, float:1.8081953E38)
            r4.A03(r5, r1, r0)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r9)
            r0 = 2131835563(0x7f113aab, float:1.9304268E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131233063(0x7f080927, float:1.8082253E38)
            r4.A03(r5, r1, r0)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r9)
            r0 = 2131835565(0x7f113aad, float:1.9304272E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131232921(0x7f080899, float:1.8081965E38)
            java.util.List r0 = X.C62263Ya.A01(r4, r5, r1, r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x008e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02ee
            X.C18240wQ.A0x(r6, r1)
            goto L_0x008e
        L_0x0098:
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r9)
            r0 = 2131835564(0x7f113aac, float:1.930427E38)
            goto L_0x005d
        L_0x00a0:
            if (r0 == 0) goto L_0x010e
            android.content.Context r1 = r9.requireContext()
            r8 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            X.3Ya r7 = new X.3Ya
            r7.<init>(r1, r0, r0)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r9)
            r0 = 2131835576(0x7f113ab8, float:1.9304294E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131232915(0x7f080893, float:1.8081953E38)
            r7.A03(r8, r1, r0)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r9)
            r0 = 2131835574(0x7f113ab6, float:1.930429E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 2131233063(0x7f080927, float:1.8082253E38)
            r7.A03(r8, r1, r0)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r9)
            r0 = 2131835575(0x7f113ab7, float:1.9304292E38)
            java.lang.String r5 = r1.getString(r0)
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x00fc
            X.0Oa r0 = r9.A0A
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r0)
            X.0TJ r2 = X.C18250wR.A0D(r4, r3)
            r0 = 36326837684610837(0x810f1100012715, double:3.03657665595773E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x00fc
            r0 = 2131232536(0x7f080718, float:1.8081184E38)
            r7.A03(r8, r5, r0)
        L_0x00fc:
            java.util.List r0 = r7.A02()
            java.util.Iterator r1 = r0.iterator()
        L_0x0104:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0357
            X.C18240wQ.A0x(r6, r1)
            goto L_0x0104
        L_0x010e:
            r4 = 2131297635(0x7f090563, float:1.821322E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r10, r4)
            r0.setVisibility(r3)
            android.view.View r1 = r10.requireViewById(r4)
            r0 = 2131299028(0x7f090ad4, float:1.8216046E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r1 = r9.requireContext()
            r0 = 2131232877(0x7f08086d, float:1.8081876E38)
            X.C18180wK.A0r(r1, r2, r0)
            android.view.View r1 = r10.requireViewById(r4)
            r0 = 2131299023(0x7f090acf, float:1.8216036E38)
            android.view.View r6 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            X.0Oa r4 = r9.A0A
            X.0i6 r7 = X.AnonymousClass0wJ.A0U(r4)
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x01ed
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36323620754038745(0x810c2400001fd9, double:3.0345422561103996E-306)
            boolean r0 = X.C63803iN.A0E(r2, r7, r0)
            if (r0 == 0) goto L_0x01e5
            r0 = 2131829574(0x7f112346, float:1.929212E38)
            java.lang.String r5 = X.C18180wK.A0g(r9, r0)
            X.C18180wK.A0z(r6)
            r0 = 2131835577(0x7f113ab9, float:1.9304296E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r9, r5, r0)
            android.text.SpannableStringBuilder r2 = X.C18200wM.A0E(r0)
            r1 = 6
            com.facebook.redex.IDxCSpanShape5S0200000_1_I2 r0 = new com.facebook.redex.IDxCSpanShape5S0200000_1_I2
            r0.<init>(r1, r9, r7)
            X.AnonymousClass3Zw.A01(r2, r0, r5)
        L_0x0171:
            X.C04220Ms.A06(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
        L_0x0176:
            r6.setText(r2)
            r5 = 2131297634(0x7f090562, float:1.8213218E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r10, r5)
            r0.setVisibility(r3)
            android.view.View r1 = r10.requireViewById(r5)
            r0 = 2131299028(0x7f090ad4, float:1.8216046E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r1, r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            android.content.Context r1 = r9.requireContext()
            r0 = 2131232486(0x7f0806e6, float:1.8081083E38)
            X.C18180wK.A0r(r1, r2, r0)
            android.view.View r0 = r10.requireViewById(r5)
            r5 = 2131299023(0x7f090acf, float:1.8216036E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0J(r0, r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131835574(0x7f113ab6, float:1.930429E38)
            r1.setText(r0)
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x0357
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r4)
            X.0TJ r2 = X.C18250wR.A0D(r4, r3)
            r0 = 36326837684610837(0x810f1100012715, double:3.03657665595773E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x0357
            r0 = 2131297633(0x7f090561, float:1.8213216E38)
            android.view.View r4 = r10.requireViewById(r0)
            r0 = 2131299028(0x7f090ad4, float:1.8216046E38)
            android.widget.ImageView r2 = X.C18200wM.A0J(r4, r0)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131232536(0x7f080718, float:1.8081184E38)
            X.C18180wK.A0r(r1, r2, r0)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r4, r5)
            r0 = 2131835575(0x7f113ab7, float:1.9304292E38)
            goto L_0x02d6
        L_0x01e5:
            r0 = 2131835576(0x7f113ab8, float:1.9304294E38)
            java.lang.String r2 = r9.getString(r0)
            goto L_0x0171
        L_0x01ed:
            r0 = 2131835581(0x7f113abd, float:1.9304305E38)
            java.lang.String r2 = r9.getString(r0)
            goto L_0x0176
        L_0x01f5:
            r0 = 2131297635(0x7f090563, float:1.821322E38)
            android.view.View r8 = r10.requireViewById(r0)
            r7 = 2131299028(0x7f090ad4, float:1.8216046E38)
            android.widget.ImageView r2 = X.C18200wM.A0J(r8, r7)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131232915(0x7f080893, float:1.8081953E38)
            X.C18180wK.A0r(r1, r2, r0)
            X.0Oa r5 = r9.A0A
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r5)
            X.1z6 r2 = X.C35692Ol.A00(r0)
            java.lang.String r1 = r9.A07
            com.facebook.common.callercontext.CallerContext r0 = r9.A05
            X.C04220Ms.A05(r0)
            boolean r0 = r2.A05(r0, r1)
            if (r0 != 0) goto L_0x02e2
            X.0i6 r4 = X.AnonymousClass0wJ.A0U(r5)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36326339468338693(0x810e9d00002605, double:3.0362615819810705E-306)
            boolean r0 = X.C63803iN.A0E(r2, r4, r0)
            if (r0 == 0) goto L_0x02e2
            r6 = 2131299023(0x7f090acf, float:1.8216036E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r8, r6)
            r0 = 2131835584(0x7f113ac0, float:1.930431E38)
        L_0x023f:
            r1.setText(r0)
            r8.setVisibility(r3)
            r0 = 2131297634(0x7f090562, float:1.8213218E38)
            android.view.View r4 = r10.requireViewById(r0)
            android.widget.ImageView r2 = X.C18200wM.A0J(r4, r7)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131233063(0x7f080927, float:1.8082253E38)
            X.C18180wK.A0r(r1, r2, r0)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r4, r6)
            r0 = 2131835563(0x7f113aab, float:1.9304268E38)
            r1.setText(r0)
            r4.setVisibility(r3)
            r0 = 2131297631(0x7f09055f, float:1.8213212E38)
            android.view.View r4 = r10.requireViewById(r0)
            android.widget.ImageView r2 = X.C18200wM.A0J(r4, r7)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131233122(0x7f080962, float:1.8082373E38)
            X.C18180wK.A0r(r1, r2, r0)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r4, r6)
            r0 = 2131835561(0x7f113aa9, float:1.9304264E38)
            r1.setText(r0)
            r4.setVisibility(r3)
            r0 = 2131300722(0x7f091172, float:1.8219482E38)
            android.widget.TextView r2 = X.AnonymousClass0wJ.A0L(r4, r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r5)
            X.3ER r0 = X.C36372Rb.A00(r0)
            int r1 = r0.A00
            r0 = 999(0x3e7, float:1.4E-42)
            if (r1 <= r0) goto L_0x02dd
            java.lang.String r0 = r9.A08
        L_0x02a0:
            r2.setText(r0)
            r2.setVisibility(r3)
            r0 = 2131300720(0x7f091170, float:1.8219478E38)
            android.widget.ImageView r1 = X.C18200wM.A0J(r4, r0)
            r0 = 102(0x66, float:1.43E-43)
            r1.setImageAlpha(r0)
            r1.setVisibility(r3)
            r0 = 120(0x78, float:1.68E-43)
            X.AnonymousClass0wJ.A17(r4, r0, r9)
            r0 = 2131297636(0x7f090564, float:1.8213223E38)
            android.view.View r4 = r10.requireViewById(r0)
            android.widget.ImageView r2 = X.C18200wM.A0J(r4, r7)
            android.content.Context r1 = r9.requireContext()
            r0 = 2131232921(0x7f080899, float:1.8081965E38)
            X.C18180wK.A0r(r1, r2, r0)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r4, r6)
            r0 = 2131835565(0x7f113aad, float:1.9304272E38)
        L_0x02d6:
            r1.setText(r0)
            r4.setVisibility(r3)
            goto L_0x0357
        L_0x02dd:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            goto L_0x02a0
        L_0x02e2:
            r6 = 2131299023(0x7f090acf, float:1.8216036E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r8, r6)
            r0 = 2131835564(0x7f113aac, float:1.930427E38)
            goto L_0x023f
        L_0x02ee:
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r2)
            X.3ER r0 = X.C36372Rb.A00(r0)
            int r4 = r0.A00
            if (r4 <= 0) goto L_0x0357
            X.0i6 r5 = X.AnonymousClass0wJ.A0U(r2)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36327567828985922(0x810fbb00002842, double:3.0370384022005894E-306)
            boolean r0 = X.C63803iN.A0E(r2, r5, r0)
            if (r0 == 0) goto L_0x0357
            X.0Oa r0 = r9.A09
            java.lang.Object r1 = X.C18190wL.A0f(r0)
            X.0nS r1 = (X.C13330nS) r1
            java.lang.String r0 = "follow_request_entrypoint_impression"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 656(0x290, float:9.19E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            java.lang.String r0 = "privacy_switch_bottom_sheet"
            X.C18230wP.A1H(r1, r0)
            r1.Bb4()
            r0 = 2131297632(0x7f090560, float:1.8213214E38)
            android.view.View r2 = r10.requireViewById(r0)
            r2.setVisibility(r3)
            r0 = 2131300722(0x7f091172, float:1.8219482E38)
            android.widget.TextView r1 = X.AnonymousClass0wJ.A0L(r2, r0)
            r0 = 999(0x3e7, float:1.4E-42)
            if (r4 <= r0) goto L_0x0372
            java.lang.String r0 = r9.A08
        L_0x033e:
            r1.setText(r0)
            r0 = 119(0x77, float:1.67E-43)
            X.AnonymousClass0wJ.A17(r2, r0, r9)
            X.C18210wN.A0y(r2)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r9)
            r0 = 2131689746(0x7f0f0112, float:1.9008516E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0m(r1, r4, r0)
            r2.setContentDescription(r0)
        L_0x0357:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0371
            r0 = 2131297652(0x7f090574, float:1.8213255E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r10, r0)
            r0.setVisibility(r3)
            r0 = 2131297651(0x7f090573, float:1.8213253E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0K(r10, r0)
            r0 = 8
            r1.setVisibility(r0)
        L_0x0371:
            return
        L_0x0372:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            goto L_0x033e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22441Yc.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0A);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(372024924);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getBoolean("ARG_PRIVACY_SWITCH_TO_PRIVATE");
        this.A04 = C18240wQ.A1S(requireArguments, "ARG_IS_REDESIGN");
        C14030oh.A09(-1757357923, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(439125371);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.privacy_switch_bottom_sheet_redesigned_layout, viewGroup, false);
        C14030oh.A09(1420095908, A022);
        return inflate;
    }
}
