package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.1YY  reason: invalid class name */
public final class AnonymousClass1YY extends C34640IcN {
    public static final String __redex_internal_original_name = "RecommendToFacebookOptimizedUpsellFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public C310524a A02;
    public IgdsHeadline A03;
    public AnonymousClass3TG A04;
    public final C04530Oa A05 = C80644m9.A00(this);

    public final String getModuleName() {
        return "recommend_to_facebook_optimization_upsell";
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            r6 = 0
            X.C04220Ms.A0B(r11, r6)
            super.onViewCreated(r11, r12)
            android.view.View r1 = r10.requireView()
            r0 = 2131301361(0x7f0913f1, float:1.8220778E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r1, r0)
            com.instagram.igds.components.headline.IgdsHeadline r0 = (com.instagram.igds.components.headline.IgdsHeadline) r0
            r10.A03 = r0
            X.24a r1 = r10.A02
            java.lang.String r9 = "xarUpsellDesignVariant"
            if (r1 == 0) goto L_0x0132
            X.24a r0 = X.C310524a.XAR_UPSELL_VARIANT_BUTTON_TEST
            if (r1 == r0) goto L_0x0084
            X.24a r0 = X.C310524a.XAR_UPSELL_REBRAND_VARIANT_1
            if (r1 == r0) goto L_0x0084
            X.24a r0 = X.C310524a.XAR_UPSELL_REBRAND_VARIANT_2
            if (r1 == r0) goto L_0x0084
            android.view.View r1 = r10.requireView()
            r0 = 2131297589(0x7f090535, float:1.8213127E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r1, r0)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r4 = (com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout) r4
            r4.setVisibility(r6)
            android.content.Context r2 = r10.requireContext()
            X.3TG r0 = r10.A04
            java.lang.String r5 = "params"
            if (r0 == 0) goto L_0x007f
            X.2AC r1 = r0.A01
            X.2AC r3 = X.AnonymousClass2AC.A0J
            r0 = 2131823686(0x7f110c46, float:1.9280179E38)
            if (r1 != r3) goto L_0x004e
            r0 = 2131823688(0x7f110c48, float:1.9280183E38)
        L_0x004e:
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r2, r0)
            r0 = 232(0xe8, float:3.25E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r10, r0)
            r4.setPrimaryAction(r1, r0)
            android.content.Context r2 = r10.requireContext()
            X.3TG r0 = r10.A04
            if (r0 == 0) goto L_0x007f
            X.2AC r1 = r0.A01
            r0 = 2131823690(0x7f110c4a, float:1.9280187E38)
            if (r1 != r3) goto L_0x006d
            r0 = 2131823687(0x7f110c47, float:1.928018E38)
        L_0x006d:
            java.lang.String r1 = X.AnonymousClass0wJ.A0k(r2, r0)
            r0 = 233(0xe9, float:3.27E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r10, r0)
            r4.setSecondaryAction(r1, r0)
            X.24a r1 = r10.A02
            if (r1 != 0) goto L_0x0137
            r5 = r9
        L_0x007f:
            X.C04220Ms.A0E(r5)
        L_0x0082:
            r4 = 0
            throw r4
        L_0x0084:
            android.view.View r1 = r10.requireView()
            r0 = 2131302217(0x7f091749, float:1.8222514E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0K(r1, r0)
            r3.setVisibility(r6)
            r0 = 2131297360(0x7f090450, float:1.8212663E38)
            android.view.View r8 = X.AnonymousClass0wJ.A0J(r3, r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 2131297361(0x7f090451, float:1.8212665E38)
            android.view.View r2 = X.AnonymousClass0wJ.A0J(r3, r0)
            r0 = 2131297363(0x7f090453, float:1.8212669E38)
            android.view.View r7 = X.AnonymousClass0wJ.A0J(r3, r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 2131300741(0x7f091185, float:1.821952E38)
            android.view.View r4 = X.AnonymousClass0wJ.A0J(r3, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            X.24a r1 = r10.A02
            if (r1 == 0) goto L_0x0132
            X.24a r0 = X.C310524a.XAR_UPSELL_REBRAND_VARIANT_1
            if (r1 == r0) goto L_0x00c0
            X.24a r0 = X.C310524a.XAR_UPSELL_REBRAND_VARIANT_2
            if (r1 != r0) goto L_0x00d1
        L_0x00c0:
            r0 = 8
            r7.setVisibility(r0)
            r0 = 2131297364(0x7f090454, float:1.821267E38)
            android.view.View r7 = X.AnonymousClass0wJ.A0K(r3, r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setVisibility(r6)
        L_0x00d1:
            r0 = 234(0xea, float:3.28E-43)
            X.AnonymousClass0wJ.A16(r2, r0, r10)
            android.content.Context r2 = r10.requireContext()
            X.3TG r0 = r10.A04
            java.lang.String r5 = "params"
            if (r0 == 0) goto L_0x007f
            X.2AC r1 = r0.A01
            X.2AC r3 = X.AnonymousClass2AC.A0J
            r0 = 2131823686(0x7f110c46, float:1.9280179E38)
            if (r1 != r3) goto L_0x00ec
            r0 = 2131823688(0x7f110c48, float:1.9280183E38)
        L_0x00ec:
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r2, r0)
            r8.setText(r0)
            r0 = 235(0xeb, float:3.3E-43)
            X.AnonymousClass0wJ.A16(r7, r0, r10)
            android.content.Context r2 = r10.requireContext()
            X.3TG r0 = r10.A04
            if (r0 == 0) goto L_0x007f
            X.2AC r1 = r0.A01
            r0 = 2131823690(0x7f110c4a, float:1.9280187E38)
            if (r1 != r3) goto L_0x010a
            r0 = 2131823687(0x7f110c47, float:1.928018E38)
        L_0x010a:
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r2, r0)
            r7.setText(r0)
            android.content.res.Resources r3 = X.AnonymousClass0wJ.A0B(r10)
            X.C04220Ms.A06(r3)
            r1 = 2131834521(0x7f113699, float:1.9302155E38)
            r0 = 2131834481(0x7f113671, float:1.9302074E38)
            java.lang.String r2 = X.C18180wK.A0g(r10, r0)
            android.text.Spanned r0 = X.C18210wN.A0C(r3, r2, r1)
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r0)
            r0 = 2
            X.AnonymousClass3Zw.A02(r1, r10, r2, r0)
            r4.setText(r1)
            goto L_0x0145
        L_0x0132:
            X.C04220Ms.A0E(r9)
            goto L_0x0082
        L_0x0137:
            X.24a r0 = X.C310524a.XAR_UPSELL_VARIANT_V2
            if (r1 != r0) goto L_0x0277
            r0 = 2131834536(0x7f1136a8, float:1.9302185E38)
            java.lang.String r0 = r10.getString(r0)
            r4.setFooterText(r0)
        L_0x0145:
            com.instagram.igds.components.headline.IgdsHeadline r1 = r10.A03
            java.lang.String r7 = "headlineView"
            r4 = 0
            if (r1 == 0) goto L_0x02b3
            r0 = 2131232008(0x7f080508, float:1.8080113E38)
            r1.A08(r0, r6)
            com.instagram.igds.components.headline.IgdsHeadline r3 = r10.A03
            if (r3 == 0) goto L_0x02b3
            X.0Oa r5 = r10.A05
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r5)
            X.C04220Ms.A0B(r0, r6)
            X.24a r0 = X.C63783iL.A00(r0)
            int r2 = r0.ordinal()
            r0 = 2
            if (r2 == r0) goto L_0x0272
            r1 = 1
            r0 = 2131838140(0x7f1144bc, float:1.9309495E38)
            if (r2 == r1) goto L_0x0173
            r0 = 2131823696(0x7f110c50, float:1.9280199E38)
        L_0x0173:
            r3.setHeadline((int) r0)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r5)
            X.24a r0 = X.C63783iL.A00(r0)
            int r2 = r0.ordinal()
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L_0x021e
            if (r2 == r1) goto L_0x01ed
            r0 = 2131823691(0x7f110c4b, float:1.9280189E38)
            java.lang.String r1 = r10.getString(r0)
            r0 = 2131232607(0x7f08075f, float:1.8081328E38)
            kotlin.Pair r3 = X.AnonymousClass0wJ.A10(r1, r0)
            r2 = 2131823693(0x7f110c4d, float:1.9280193E38)
            X.0Ok r1 = X.C06810aP.A01
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r5)
            java.lang.String r0 = X.C18200wM.A0k(r0, r1)
            java.lang.String r1 = X.AnonymousClass0wJ.A0o(r10, r0, r2)
            r0 = 2131233118(0x7f08095e, float:1.8082364E38)
            kotlin.Pair r2 = X.AnonymousClass0wJ.A10(r1, r0)
            r0 = 2131823694(0x7f110c4e, float:1.9280195E38)
            java.lang.String r1 = r10.getString(r0)
            r0 = 2131232453(0x7f0806c5, float:1.8081016E38)
        L_0x01b8:
            kotlin.Pair r0 = X.AnonymousClass0wJ.A10(r1, r0)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r3, r2, r0)
        L_0x01c0:
            com.instagram.igds.components.headline.IgdsHeadline r5 = r10.A03
            if (r5 == 0) goto L_0x02b3
            android.content.Context r0 = r10.requireContext()
            X.3Ya r3 = X.C62263Ya.A00(r0)
            X.C04220Ms.A09(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x01d3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0299
            java.lang.Object r0 = r2.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.A00
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.Object r0 = r0.A01
            int r0 = X.AnonymousClass0wJ.A04(r0)
            r3.A03(r4, r1, r0)
            goto L_0x01d3
        L_0x01ed:
            r0 = 2131823692(0x7f110c4c, float:1.928019E38)
            java.lang.String r1 = r10.getString(r0)
            r0 = 2131232607(0x7f08075f, float:1.8081328E38)
            kotlin.Pair r3 = X.AnonymousClass0wJ.A10(r1, r0)
            r2 = 2131823693(0x7f110c4d, float:1.9280193E38)
            X.0Ok r1 = X.C06810aP.A01
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r5)
            java.lang.String r0 = X.C18200wM.A0k(r0, r1)
            java.lang.String r1 = X.AnonymousClass0wJ.A0o(r10, r0, r2)
            r0 = 2131233118(0x7f08095e, float:1.8082364E38)
            kotlin.Pair r2 = X.AnonymousClass0wJ.A10(r1, r0)
            r0 = 2131823694(0x7f110c4e, float:1.9280195E38)
            java.lang.String r1 = r10.getString(r0)
            r0 = 2131232921(0x7f080899, float:1.8081965E38)
            goto L_0x01b8
        L_0x021e:
            android.content.res.Resources r3 = X.AnonymousClass0wJ.A0B(r10)
            r2 = 2131838136(0x7f1144b8, float:1.9309487E38)
            X.0Ok r1 = X.C06810aP.A01
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r5)
            java.lang.String r0 = X.C18200wM.A0k(r0, r1)
            android.text.Spanned r1 = X.C18210wN.A0C(r3, r0, r2)
            r0 = 2131232607(0x7f08075f, float:1.8081328E38)
            kotlin.Pair r5 = X.AnonymousClass0wJ.A10(r1, r0)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r10)
            r0 = 2131838137(0x7f1144b9, float:1.9309489E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.Spanned r1 = android.text.Html.fromHtml(r0)
            r0 = 2131233118(0x7f08095e, float:1.8082364E38)
            kotlin.Pair r3 = X.AnonymousClass0wJ.A10(r1, r0)
            r0 = 2131838138(0x7f1144ba, float:1.930949E38)
            java.lang.String r1 = r10.getString(r0)
            r0 = 2131232915(0x7f080893, float:1.8081953E38)
            kotlin.Pair r2 = X.AnonymousClass0wJ.A10(r1, r0)
            r0 = 2131838139(0x7f1144bb, float:1.9309493E38)
            java.lang.String r1 = r10.getString(r0)
            r0 = 2131232241(0x7f0805f1, float:1.8080586E38)
            kotlin.Pair r0 = X.AnonymousClass0wJ.A10(r1, r0)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r5, r3, r2, r0)
            goto L_0x01c0
        L_0x0272:
            r0 = 2131838141(0x7f1144bd, float:1.9309497E38)
            goto L_0x0173
        L_0x0277:
            android.content.res.Resources r3 = X.AnonymousClass0wJ.A0B(r10)
            X.C04220Ms.A06(r3)
            r1 = 2131834521(0x7f113699, float:1.9302155E38)
            r0 = 2131834481(0x7f113671, float:1.9302074E38)
            java.lang.String r2 = X.C18180wK.A0g(r10, r0)
            android.text.Spanned r0 = X.C18210wN.A0C(r3, r2, r1)
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r0)
            r0 = 2
            X.AnonymousClass3Zw.A02(r1, r10, r2, r0)
            r4.setFooterAboveActionText(r1)
            goto L_0x0145
        L_0x0299:
            java.util.List r0 = r3.A02()
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x02a5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02af
            X.C18210wN.A1P(r2, r1)
            goto L_0x02a5
        L_0x02af:
            r5.setBulletList(r2)
            return
        L_0x02b3:
            X.C04220Ms.A0E(r7)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YY.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        C310524a r0;
        int A022 = C14030oh.A02(1455746905);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("ARG_MEDIA_SOURCE_TYPE");
        if (string != null) {
            C23949D2u valueOf = C23949D2u.valueOf(string);
            String string2 = requireArguments.getString("ARG_UPSELL_ENTRY_POINT");
            if (string2 != null) {
                AnonymousClass2AC valueOf2 = AnonymousClass2AC.valueOf(string2);
                String string3 = requireArguments.getString("ARG_UPSELL_VARIANT");
                if (string3 != null) {
                    AnonymousClass3TG r3 = new AnonymousClass3TG(valueOf2, AnonymousClass2AD.valueOf(string3), valueOf, requireArguments.getString("ARG_WATERFALL_ID"), requireArguments.getString("ARG_MODULE_NAME"), requireArguments.getString("ARG_DESIGN_VARIANT"), 0);
                    this.A04 = r3;
                    String str = r3.A04;
                    if (str == null || (r0 = (C310524a) C310524a.A01.get(str)) == null) {
                        r0 = C310524a.XAR_UPSELL_VARIANT_V1;
                    }
                    this.A02 = r0;
                    C14030oh.A09(-2146927142, A022);
                    return;
                }
                illegalStateException = C18180wK.A0a("Required value was null.");
                i = 1815154985;
            } else {
                illegalStateException = C18180wK.A0a("Required value was null.");
                i = 111865633;
            }
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = 435041721;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1205262106);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_share_to_fb_upsell_bottom_sheet, viewGroup, false);
        C14030oh.A09(534464755, A022);
        return inflate;
    }
}
