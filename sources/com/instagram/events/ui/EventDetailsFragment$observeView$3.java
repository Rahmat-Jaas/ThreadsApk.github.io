package com.instagram.events.ui;

import X.AnonymousClass0YP;
import X.C04220Ms;
import X.C146958n9;
import X.C18220wO;
import X.C22771Zk;
import X.C39142Kno;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.pando.TreeJNI;
import com.instagram.arlink.ui.GridPatternView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.igtv.widget.ExpandableTextView;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.events.ui.EventDetailsFragment$observeView$3", f = "EventDetailsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventDetailsFragment$observeView$3 extends C39142Kno implements AnonymousClass0YP {
    public /* synthetic */ Object A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewGroup A03;
    public final /* synthetic */ ViewGroup A04;
    public final /* synthetic */ LinearLayout A05;
    public final /* synthetic */ GridPatternView A06;
    public final /* synthetic */ IgTextView A07;
    public final /* synthetic */ IgTextView A08;
    public final /* synthetic */ IgTextView A09;
    public final /* synthetic */ IgImageView A0A;
    public final /* synthetic */ IgImageView A0B;
    public final /* synthetic */ IgImageView A0C;
    public final /* synthetic */ RoundedCornerImageView A0D;
    public final /* synthetic */ C22771Zk A0E;
    public final /* synthetic */ IgdsListCell A0F;
    public final /* synthetic */ IgdsListCell A0G;
    public final /* synthetic */ ExpandableTextView A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventDetailsFragment$observeView$3(View view, View view2, ViewGroup viewGroup, ViewGroup viewGroup2, LinearLayout linearLayout, GridPatternView gridPatternView, IgTextView igTextView, IgTextView igTextView2, IgTextView igTextView3, IgImageView igImageView, IgImageView igImageView2, IgImageView igImageView3, RoundedCornerImageView roundedCornerImageView, C22771Zk r16, IgdsListCell igdsListCell, IgdsListCell igdsListCell2, ExpandableTextView expandableTextView, C146958n9 r20) {
        super(2, r20);
        this.A02 = view;
        this.A0E = r16;
        this.A01 = view2;
        this.A03 = viewGroup;
        this.A07 = igTextView;
        this.A0H = expandableTextView;
        this.A0D = roundedCornerImageView;
        this.A06 = gridPatternView;
        this.A08 = igTextView2;
        this.A0A = igImageView;
        this.A0G = igdsListCell;
        this.A0F = igdsListCell2;
        this.A04 = viewGroup2;
        this.A09 = igTextView3;
        this.A0C = igImageView2;
        this.A0B = igImageView3;
        this.A05 = linearLayout;
    }

    public final C146958n9 create(Object obj, C146958n9 r34) {
        View view = this.A02;
        View view2 = this.A01;
        ViewGroup viewGroup = this.A03;
        IgTextView igTextView = this.A07;
        ExpandableTextView expandableTextView = this.A0H;
        RoundedCornerImageView roundedCornerImageView = this.A0D;
        GridPatternView gridPatternView = this.A06;
        IgTextView igTextView2 = this.A08;
        IgImageView igImageView = this.A0A;
        IgdsListCell igdsListCell = this.A0G;
        IgdsListCell igdsListCell2 = this.A0F;
        ViewGroup viewGroup2 = this.A04;
        IgTextView igTextView3 = this.A09;
        IgImageView igImageView2 = this.A0C;
        IgImageView igImageView3 = this.A0B;
        IgImageView igImageView4 = igImageView;
        IgImageView igImageView5 = igImageView2;
        IgImageView igImageView6 = igImageView3;
        IgTextView igTextView4 = igTextView;
        IgTextView igTextView5 = igTextView2;
        IgTextView igTextView6 = igTextView3;
        ViewGroup viewGroup3 = viewGroup2;
        LinearLayout linearLayout = this.A05;
        GridPatternView gridPatternView2 = gridPatternView;
        View view3 = view2;
        ViewGroup viewGroup4 = viewGroup;
        View view4 = view;
        EventDetailsFragment$observeView$3 eventDetailsFragment$observeView$3 = new EventDetailsFragment$observeView$3(view4, view3, viewGroup4, viewGroup3, linearLayout, gridPatternView2, igTextView4, igTextView5, igTextView6, igImageView4, igImageView5, igImageView6, roundedCornerImageView, this.A0E, igdsListCell, igdsListCell2, expandableTextView, r34);
        eventDetailsFragment$observeView$3.A00 = obj;
        return eventDetailsFragment$observeView$3;
    }

    public static String A00(TreeJNI treeJNI, Object obj) {
        C04220Ms.A06(obj);
        String stringValue = treeJNI.getStringValue("button_text");
        C04220Ms.A06(stringValue);
        return stringValue;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventDetailsFragment$observeView$3) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01cb, code lost:
        if (r2 == X.AnonymousClass253.MAYBE) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0217, code lost:
        r5 = r1.inflate(com.instagram.barcelona.R.layout.primary_cta_button, r3, false);
        X.C04220Ms.A0C(r5, X.I17.A00(0));
        r5 = (android.widget.TextView) r5;
        r5.setText(r9);
        r5.setOnClickListener(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x023a, code lost:
        r5 = r1.inflate(com.instagram.barcelona.R.layout.secondary_cta_button, r3, false);
        X.C04220Ms.A0C(r5, X.I17.A00(0));
        r5 = (android.widget.TextView) r5;
        r5.setText(r9);
        r5.setOnClickListener(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0250, code lost:
        r3.addView(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            X.AnonymousClass0OU.A00(r19)
            r9 = r18
            java.lang.Object r8 = r9.A00
            X.2O1 r8 = (X.AnonymousClass2O1) r8
            boolean r0 = r8 instanceof X.AnonymousClass1p7
            r7 = 0
            if (r0 == 0) goto L_0x0016
            android.view.View r0 = r9.A02
            r0.setVisibility(r7)
        L_0x0013:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0016:
            boolean r0 = r8 instanceof X.AnonymousClass1p8
            r3 = 8
            if (r0 == 0) goto L_0x0049
            android.view.View r0 = r9.A02
            r0.setVisibility(r3)
            X.1Zk r1 = r9.A0E
            X.1p8 r8 = (X.AnonymousClass1p8) r8
            java.lang.String r2 = r8.A00
            if (r2 == 0) goto L_0x002f
            int r0 = r2.length()
            if (r0 != 0) goto L_0x003a
        L_0x002f:
            android.content.Context r1 = r1.requireContext()
            r0 = 2131836071(0x7f113ca7, float:1.9305298E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x003a:
            X.C04220Ms.A09(r2)
            X.KHr r1 = X.C38040KHr.A01
            X.3iD r0 = X.C63733iD.A02()
            r0.A0A = r2
            X.C63733iD.A09(r1, r0)
            goto L_0x0013
        L_0x0049:
            boolean r0 = r8 instanceof X.AnonymousClass1p9
            if (r0 == 0) goto L_0x0013
            android.view.View r0 = r9.A02
            r0.setVisibility(r3)
            android.view.View r0 = r9.A01
            r0.setVisibility(r7)
            X.1Zk r6 = r9.A0E
            android.view.ViewGroup r11 = r9.A03
            X.1p9 r8 = (X.AnonymousClass1p9) r8
            boolean r0 = r8.A0F
            boolean r4 = r8.A0G
            r14 = 2131833810(0x7f1133d2, float:1.9300713E38)
            if (r0 == 0) goto L_0x0069
            r14 = 2131832786(0x7f112fd2, float:1.9298636E38)
        L_0x0069:
            r15 = 0
            if (r0 == 0) goto L_0x006f
            r15 = 2131232769(0x7f080801, float:1.8081657E38)
        L_0x006f:
            if (r4 == 0) goto L_0x0286
            r13 = 0
        L_0x0072:
            r1 = 403(0x193, float:5.65E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r2 = X.C18190wL.A0H(r6, r1)
            X.E2V r1 = new X.E2V
            r1.<init>(r2, r11)
            X.41n r10 = new X.41n
            r12 = r6
            r16 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r1.A0S(r10)
            com.instagram.common.ui.base.IgTextView r2 = r9.A07
            java.lang.String r1 = r8.A0B
            r2.setText(r1)
            com.instagram.igtv.widget.ExpandableTextView r5 = r9.A0H
            java.lang.String r4 = r8.A03
            if (r4 == 0) goto L_0x00b2
            int r1 = r4.length()
            if (r1 == 0) goto L_0x00b2
            X.0Oa r1 = r6.A07
            com.instagram.service.session.UserSession r2 = X.AnonymousClass0wJ.A0X(r1)
            r1 = 0
            r5.setExpandableText(r4, r2, r1)
            r5.setVisibility(r7)
            r6.A00 = r7
            com.facebook.redex.IDxCListenerShape8S1200000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape8S1200000_1_I2
            r1.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.String) r4, (int) r3)
            r5.setOnClickListener(r1)
        L_0x00b2:
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r4 = r9.A0D
            java.lang.String r5 = r8.A08
            java.lang.String r1 = r8.A09
            if (r1 == 0) goto L_0x0255
            X.C18230wP.A1J(r6, r4, r1)
        L_0x00bd:
            com.instagram.arlink.ui.GridPatternView r2 = r9.A06
            java.lang.String r1 = r8.A02
            r2.setEmoji(r1)
            android.content.Context r10 = r6.requireContext()
            com.instagram.common.ui.base.IgTextView r5 = r9.A08
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r9.A0A
            java.lang.String r3 = r8.A06
            java.util.List r2 = r8.A0D
            java.lang.String r13 = "event_details_fragment"
            r15 = 1
            int r11 = X.C18200wM.A02(r15, r5, r4)
            r12 = 5
            X.C04220Ms.A0B(r13, r12)
            if (r3 == 0) goto L_0x00e6
            X.3Tw r1 = X.C61553Tw.A00
            android.text.SpannableStringBuilder r1 = r1.A00(r10, r3)
            r5.setText(r1)
        L_0x00e6:
            android.graphics.drawable.Drawable r1 = X.C25578DoE.A02(r10, r13, r2)
            r4.setImageDrawable(r1)
            X.251 r2 = r8.A01
            X.251 r1 = X.AnonymousClass251.NONE
            if (r2 == r1) goto L_0x0168
            com.instagram.igds.components.textcell.IgdsListCell r10 = r9.A0G
            java.lang.String r5 = r8.A05
            com.instagram.igds.components.textcell.IgdsListCell r4 = r9.A0F
            java.lang.String r3 = r8.A04
            r1 = 405(0x195, float:5.68E-43)
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r2 = X.C18190wL.A0H(r6, r1)
            X.C04220Ms.A0B(r10, r7)
            r16 = 2
            X.C04220Ms.A0B(r4, r11)
            if (r5 == 0) goto L_0x0117
            int r1 = r5.length()
            if (r1 == 0) goto L_0x0117
            r10.A0H(r5)
            r10.setVisibility(r7)
        L_0x0117:
            if (r3 == 0) goto L_0x0128
            int r1 = r3.length()
            if (r1 == 0) goto L_0x0128
            r4.A0H(r3)
            r4.setVisibility(r7)
            r4.setOnClickListener(r2)
        L_0x0128:
            android.content.Context r11 = r6.requireContext()
            android.view.ViewGroup r10 = r9.A04
            com.instagram.common.ui.base.IgTextView r14 = r9.A09
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r9.A0C
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r9.A0B
            java.lang.String r3 = r8.A07
            java.util.List r1 = r8.A0E
            r17 = r1
            r2 = 3
            com.facebook.redex.IDxCListenerShape2S0110000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape2S0110000_1_I2
            r1.<init>(r2, r6, r0)
            X.C04220Ms.A0B(r10, r15)
            r0 = r16
            X.C04220Ms.A0B(r14, r0)
            X.C18180wK.A1Q(r5, r2, r4)
            if (r3 == 0) goto L_0x0156
            X.3Tw r0 = X.C61553Tw.A00
            android.text.SpannableStringBuilder r0 = r0.A00(r11, r3)
            r14.setText(r0)
        L_0x0156:
            r0 = r17
            android.graphics.drawable.Drawable r0 = X.C25578DoE.A02(r11, r13, r0)
            r5.setImageDrawable(r0)
            r4.setVisibility(r7)
            r10.setVisibility(r7)
            r10.setOnClickListener(r1)
        L_0x0168:
            android.widget.LinearLayout r3 = r9.A05
            java.util.List r0 = r8.A0C
            X.253 r2 = r8.A00
            java.lang.String r4 = r8.A0A
            r3.removeAllViews()
            if (r0 == 0) goto L_0x0013
            android.view.LayoutInflater r1 = X.C18230wP.A0F(r6)
            java.util.Iterator r10 = r0.iterator()
        L_0x017d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0013
            com.facebook.pando.TreeJNI r8 = X.C18210wN.A0G(r10)
            X.20O r5 = X.AnonymousClass20O.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "button_type"
            java.lang.Enum r0 = r8.getEnumValue(r0, r5)
            X.20O r0 = (X.AnonymousClass20O) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x0199;
                case 2: goto L_0x020b;
                case 3: goto L_0x022e;
                case 4: goto L_0x01a4;
                case 5: goto L_0x0198;
                case 6: goto L_0x01ab;
                case 7: goto L_0x01b2;
                case 8: goto L_0x01ba;
                case 9: goto L_0x0204;
                default: goto L_0x0198;
            }
        L_0x0198:
            goto L_0x017d
        L_0x0199:
            java.lang.String r9 = A00(r8, r1)
            com.facebook.redex.IDxCListenerShape14S1100000_1_I2 r8 = new com.facebook.redex.IDxCListenerShape14S1100000_1_I2
            r8.<init>((X.C22771Zk) r6, (java.lang.String) r4, (int) r12)
            goto L_0x023a
        L_0x01a4:
            java.lang.String r9 = A00(r8, r1)
            android.view.View$OnClickListener r8 = r6.A02
            goto L_0x0217
        L_0x01ab:
            java.lang.String r9 = A00(r8, r1)
            android.view.View$OnClickListener r8 = r6.A03
            goto L_0x0217
        L_0x01b2:
            java.lang.String r9 = A00(r8, r1)
            X.3t4 r8 = X.C65333t4.A00
            goto L_0x023a
        L_0x01ba:
            X.C04220Ms.A06(r1)
            X.C04220Ms.A0B(r2, r7)
            X.253 r0 = X.AnonymousClass253.GOING
            if (r2 == r0) goto L_0x01cd
            X.253 r0 = X.AnonymousClass253.CANT_GO
            if (r2 == r0) goto L_0x01cd
            X.253 r5 = X.AnonymousClass253.MAYBE
            r0 = 0
            if (r2 != r5) goto L_0x01ce
        L_0x01cd:
            r0 = 1
        L_0x01ce:
            r5 = r0 ^ 1
            java.lang.String r0 = "button_text"
            java.lang.String r9 = r8.getStringValue(r0)
            X.C04220Ms.A06(r9)
            android.view.View$OnClickListener r8 = r6.A04
            r0 = 2131497043(0x7f0c1053, float:1.8617668E38)
            if (r5 == 0) goto L_0x01e3
            r0 = 2131496109(0x7f0c0cad, float:1.8615774E38)
        L_0x01e3:
            android.view.View r5 = r1.inflate(r0, r3, r7)
            java.lang.String r0 = X.I17.A00(r7)
            X.C04220Ms.A0C(r5, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setText(r9)
            r5.setOnClickListener(r8)
            r0 = 2131232406(0x7f080696, float:1.808092E38)
            r5.setCompoundDrawablesWithIntrinsicBounds(r7, r7, r0, r7)
            int r0 = X.C25578DoE.A00(r2)
            X.C18180wK.A10(r5, r6, r0)
            goto L_0x0250
        L_0x0204:
            java.lang.String r9 = A00(r8, r1)
            android.view.View$OnClickListener r8 = r6.A05
            goto L_0x0217
        L_0x020b:
            java.lang.String r9 = A00(r8, r1)
            java.lang.String r5 = "accepted"
            r0 = 6
            com.facebook.redex.IDxCListenerShape14S1100000_1_I2 r8 = new com.facebook.redex.IDxCListenerShape14S1100000_1_I2
            r8.<init>((X.C22771Zk) r6, (java.lang.String) r5, (int) r0)
        L_0x0217:
            r0 = 2131496109(0x7f0c0cad, float:1.8615774E38)
            android.view.View r5 = r1.inflate(r0, r3, r7)
            java.lang.String r0 = X.I17.A00(r7)
            X.C04220Ms.A0C(r5, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setText(r9)
            r5.setOnClickListener(r8)
            goto L_0x0250
        L_0x022e:
            java.lang.String r9 = A00(r8, r1)
            java.lang.String r5 = "declined"
            r0 = 6
            com.facebook.redex.IDxCListenerShape14S1100000_1_I2 r8 = new com.facebook.redex.IDxCListenerShape14S1100000_1_I2
            r8.<init>((X.C22771Zk) r6, (java.lang.String) r5, (int) r0)
        L_0x023a:
            r0 = 2131497043(0x7f0c1053, float:1.8617668E38)
            android.view.View r5 = r1.inflate(r0, r3, r7)
            java.lang.String r0 = X.I17.A00(r7)
            X.C04220Ms.A0C(r5, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r5.setText(r9)
            r5.setOnClickListener(r8)
        L_0x0250:
            r3.addView(r5)
            goto L_0x017d
        L_0x0255:
            if (r5 == 0) goto L_0x025d
            int r1 = r5.length()
            if (r1 != 0) goto L_0x025f
        L_0x025d:
            java.lang.String r5 = "😀"
        L_0x025f:
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r6)
            r1 = 2131165257(0x7f070049, float:1.7944726E38)
            int r3 = r2.getDimensionPixelSize(r1)
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r6)
            r1 = 2131165303(0x7f070077, float:1.794482E38)
            int r2 = r2.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = X.AnonymousClass0wJ.A0B(r6)
            int r1 = X.C18250wR.A00(r1)
            android.graphics.Bitmap r1 = X.C25578DoE.A01(r5, r3, r2, r1)
            r4.setImageBitmap(r1)
            goto L_0x00bd
        L_0x0286:
            android.content.res.Resources r2 = X.AnonymousClass0wJ.A0B(r6)
            r1 = 2131165216(0x7f070020, float:1.7944643E38)
            int r13 = r2.getDimensionPixelSize(r1)
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.events.ui.EventDetailsFragment$observeView$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
