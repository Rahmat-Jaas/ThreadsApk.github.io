package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import kotlin.Unit;

public class KtSLambdaShape1S0700000_I2 extends C39142Kno implements AnonymousClass0YP {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape1S0700000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, C146958n9 r8, int i) {
        super(2, r8);
        this.A07 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A06 = obj3;
        this.A04 = obj4;
        this.A03 = obj5;
        this.A02 = obj6;
    }

    public final C146958n9 create(Object obj, C146958n9 r11) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i;
        C146958n9 r7 = r11;
        switch (this.A07) {
            case 0:
                obj2 = this.A01;
                obj3 = this.A00;
                obj4 = this.A06;
                obj5 = this.A04;
                obj6 = this.A03;
                obj7 = this.A02;
                i = 0;
                break;
            case 1:
                obj4 = this.A06;
                obj2 = this.A01;
                obj7 = this.A02;
                obj6 = this.A03;
                obj3 = this.A00;
                obj5 = this.A04;
                i = 1;
                break;
            case 2:
                obj4 = this.A06;
                obj2 = this.A01;
                obj7 = this.A02;
                obj6 = this.A03;
                obj3 = this.A00;
                obj5 = this.A04;
                i = 2;
                break;
            case 3:
                obj3 = this.A00;
                obj7 = this.A02;
                obj2 = this.A01;
                obj6 = this.A03;
                obj4 = this.A06;
                obj5 = this.A04;
                i = 3;
                break;
            default:
                obj7 = this.A02;
                obj3 = this.A00;
                obj4 = this.A06;
                obj2 = this.A01;
                obj5 = this.A04;
                obj6 = this.A03;
                i = 4;
                break;
        }
        KtSLambdaShape1S0700000_I2 ktSLambdaShape1S0700000_I2 = new KtSLambdaShape1S0700000_I2(obj2, obj3, obj4, obj5, obj6, obj7, r7, i);
        ktSLambdaShape1S0700000_I2.A05 = obj;
        return ktSLambdaShape1S0700000_I2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x02a5, code lost:
        X.C04220Ms.A0E(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02a9, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005c, code lost:
        r5.setOnClickListener(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0143  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.A07
            X.AnonymousClass0OU.A00(r19)
            switch(r1) {
                case 0: goto L_0x0096;
                case 1: goto L_0x00d9;
                case 2: goto L_0x0117;
                case 3: goto L_0x0248;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.Object r4 = r0.A05
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            java.lang.Object r5 = r0.A02
            X.0MJ r5 = (X.AnonymousClass0MJ) r5
            java.lang.Object r1 = r5.A00
            X.Dwq r1 = (X.C25975Dwq) r1
            if (r1 == 0) goto L_0x0026
            r3 = 0
            android.view.View r2 = r1.A07
            r2.setAccessibilityDelegate(r3)
            android.view.View$OnAttachStateChangeListener r1 = r1.A06
            r2.removeOnAttachStateChangeListener(r1)
            r2.setOnTouchListener(r3)
        L_0x0026:
            java.lang.Object r2 = r0.A00
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            if (r4 == 0) goto L_0x0062
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r2.setScaleType(r1)
            java.lang.Object r6 = r0.A06
            X.IcN r6 = (X.C34640IcN) r6
            r2.setUrl(r4, r6)
            r1 = 21
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r4 = new kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56
            r4.<init>(r6, r1)
            X.Dre r3 = new X.Dre
            r3.<init>(r2)
            r2 = 0
            com.instagram.common.ui.widget.bouncylistener.IDxTListenerShape137S0100000_1_I2 r1 = new com.instagram.common.ui.widget.bouncylistener.IDxTListenerShape137S0100000_1_I2
            r1.<init>(r4, r2)
            r3.A02 = r1
            X.Dwq r1 = r3.A03()
            r5.A00 = r1
            java.lang.Object r5 = r0.A01
            android.view.View r5 = (android.view.View) r5
            r0 = 458(0x1ca, float:6.42E-43)
        L_0x0058:
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r6, r0)
        L_0x005c:
            r5.setOnClickListener(r0)
        L_0x005f:
            kotlin.Unit r0 = kotlin.Unit.A00
            return r0
        L_0x0062:
            r2.A09()
            java.lang.Object r1 = r0.A04
            android.widget.ImageView$ScaleType r1 = (android.widget.ImageView.ScaleType) r1
            r2.setScaleType(r1)
            java.lang.Object r1 = r0.A03
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r2.setImageDrawable(r1)
            java.lang.Object r6 = r0.A06
            r1 = 22
            kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56 r4 = new kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56
            r4.<init>(r6, r1)
            X.Dre r3 = new X.Dre
            r3.<init>(r2)
            r2 = 0
            com.instagram.common.ui.widget.bouncylistener.IDxTListenerShape137S0100000_1_I2 r1 = new com.instagram.common.ui.widget.bouncylistener.IDxTListenerShape137S0100000_1_I2
            r1.<init>(r4, r2)
            r3.A02 = r1
            X.Dwq r1 = r3.A03()
            r5.A00 = r1
            java.lang.Object r5 = r0.A01
            android.view.View r5 = (android.view.View) r5
            r0 = 459(0x1cb, float:6.43E-43)
            goto L_0x0058
        L_0x0096:
            java.lang.Object r4 = r0.A05
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2 r4 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2) r4
            r3 = 8
            r2 = 0
            java.lang.Object r1 = r0.A01
            android.view.View r1 = (android.view.View) r1
            if (r4 != 0) goto L_0x00ae
            r1.setVisibility(r3)
            java.lang.Object r0 = r0.A00
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r2)
            goto L_0x005f
        L_0x00ae:
            r1.setVisibility(r2)
            java.lang.Object r1 = r0.A00
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r3)
            java.lang.Object r3 = r0.A06
            X.IcN r3 = (X.C34640IcN) r3
            java.lang.Object r2 = r0.A04
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            java.lang.Object r1 = r0.A03
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r5 = r0.A02
            android.view.View r5 = (android.view.View) r5
            java.lang.String r0 = r4.A02
            X.C18230wP.A1J(r3, r2, r0)
            java.lang.String r0 = r4.A01
            r1.setText(r0)
            r0 = 37
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = X.C18190wL.A0H(r3, r0)
            goto L_0x005c
        L_0x00d9:
            java.lang.Object r4 = r0.A05
            X.4qz r4 = (X.C83224qz) r4
            java.lang.Object r8 = r0.A06
            X.1bZ r8 = (X.AnonymousClass1bZ) r8
            X.10Y r1 = r8.A02
            java.lang.String r5 = "viewModel"
            r12 = 0
            if (r1 != 0) goto L_0x00ec
            X.C04220Ms.A0E(r5)
            throw r12
        L_0x00ec:
            X.4tk r3 = r1.A02
            r2 = 24
            kotlin.coroutines.jvm.internal.KtSLambdaShape7S0200000_I2_2 r1 = new kotlin.coroutines.jvm.internal.KtSLambdaShape7S0200000_I2_2
            r1.<init>(r8, r12, r2)
            X.C18230wP.A1T(r1, r4, r3)
            X.10Y r1 = r8.A02
            if (r1 != 0) goto L_0x0100
            X.C04220Ms.A0E(r5)
            throw r12
        L_0x0100:
            X.4wG r1 = r1.A0A
            java.lang.Object r6 = r0.A01
            java.lang.Object r11 = r0.A02
            java.lang.Object r10 = r0.A03
            java.lang.Object r7 = r0.A00
            java.lang.Object r9 = r0.A04
            r13 = 2
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0700000_I2 r5 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0700000_I2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.C18230wP.A1T(r5, r4, r1)
            goto L_0x005f
        L_0x0117:
            java.lang.Object r5 = r0.A05
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2 r5 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2) r5
            boolean r1 = r5.A02
            java.lang.String r11 = "subtitleView"
            java.lang.String r10 = "viewModel"
            java.lang.String r9 = "titleView"
            r3 = 0
            r6 = 8
            if (r1 == 0) goto L_0x0159
            java.lang.Object r4 = r0.A06
            X.1bZ r4 = (X.AnonymousClass1bZ) r4
            X.10Y r1 = r4.A02
            if (r1 == 0) goto L_0x0240
            int r2 = r1.A00
            r1 = 1
            if (r2 == r1) goto L_0x0156
            r1 = 2
            if (r2 != r1) goto L_0x013f
            java.lang.Object r1 = r0.A02
        L_0x013a:
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r3)
        L_0x013f:
            android.widget.TextView r1 = r4.A01
            if (r1 == 0) goto L_0x0244
            r1.setVisibility(r6)
            android.widget.TextView r1 = r4.A00
            if (r1 == 0) goto L_0x02a5
            r1.setVisibility(r6)
            java.lang.Object r0 = r0.A03
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r6)
            goto L_0x005f
        L_0x0156:
            java.lang.Object r1 = r0.A01
            goto L_0x013a
        L_0x0159:
            java.lang.Object r1 = r0.A01
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r6)
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r6)
            java.lang.Object r13 = r0.A06
            X.1bZ r13 = (X.AnonymousClass1bZ) r13
            android.widget.TextView r1 = r13.A01
            if (r1 == 0) goto L_0x0244
            r1.setVisibility(r3)
            android.widget.TextView r1 = r13.A00
            if (r1 == 0) goto L_0x02a5
            r1.setVisibility(r3)
            java.lang.Object r1 = r0.A03
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r3)
            java.lang.Object r1 = r5.A01
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2 r1 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2) r1
            java.lang.Object r8 = r1.A03
            java.lang.Number r8 = (java.lang.Number) r8
            java.lang.Object r4 = r1.A01
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r7 = r1.A02
            java.lang.Number r7 = (java.lang.Number) r7
            java.lang.Object r14 = r1.A00
            X.20j r14 = (X.C302720j) r14
            android.widget.TextView r1 = r13.A01
            if (r1 == 0) goto L_0x0244
            r1.setVisibility(r6)
            android.widget.TextView r1 = r13.A00
            if (r1 == 0) goto L_0x02a5
            r1.setVisibility(r6)
            if (r8 == 0) goto L_0x01b6
            android.widget.TextView r1 = r13.A01
            if (r1 == 0) goto L_0x0244
            r1.setVisibility(r3)
            android.widget.TextView r2 = r13.A01
            if (r2 == 0) goto L_0x0244
            int r1 = r8.intValue()
            X.C18180wK.A10(r2, r13, r1)
        L_0x01b6:
            if (r4 == 0) goto L_0x01fb
            android.widget.TextView r1 = r13.A00
            if (r1 == 0) goto L_0x02a5
            r1.setVisibility(r3)
            if (r7 == 0) goto L_0x0234
            if (r14 == 0) goto L_0x0234
            int r1 = r7.intValue()
            java.lang.String r8 = X.C18180wK.A0g(r13, r1)
            int r1 = r4.intValue()
            java.lang.String r7 = X.AnonymousClass0wJ.A0o(r13, r8, r1)
            X.C04220Ms.A06(r7)
            android.widget.TextView r6 = r13.A00
            if (r6 == 0) goto L_0x02a5
            android.content.Context r4 = r6.getContext()
            android.content.Context r2 = r13.getContext()
            r1 = 2130971027(0x7f040993, float:1.755078E38)
            int r1 = X.C121907Is.A02(r2, r1)
            int r17 = r4.getColor(r1)
            java.lang.Integer r15 = X.AnonymousClass006.A01
            X.03m r12 = X.C008103m.A0I
            X.1fA r11 = new X.1fA
            r16 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.AnonymousClass3Zw.A03(r11, r6, r8, r7)
        L_0x01fb:
            java.lang.Object r4 = r0.A00
            X.11F r4 = (X.AnonymousClass11F) r4
            java.lang.Object r2 = r5.A00
            java.util.Collection r2 = (java.util.Collection) r2
            X.C04220Ms.A0B(r2, r3)
            java.util.List r1 = r4.A01
            r1.clear()
            r1.addAll(r2)
            r4.notifyDataSetChanged()
            X.10Y r1 = r13.A02
            if (r1 == 0) goto L_0x0240
            X.4wG r1 = r1.A09
            java.lang.Object r1 = r1.getValue()
            boolean r1 = X.AnonymousClass0wJ.A1X(r1)
            if (r1 == 0) goto L_0x005f
            java.lang.Object r3 = r0.A04
            android.view.View r3 = (android.view.View) r3
            android.view.ViewTreeObserver r2 = r3.getViewTreeObserver()
            r1 = 1
            com.facebook.redex.IDxLListenerShape126S0200000_1_I2 r0 = new com.facebook.redex.IDxLListenerShape126S0200000_1_I2
            r0.<init>(r1, r13, r3)
            r2.addOnGlobalLayoutListener(r0)
            goto L_0x005f
        L_0x0234:
            android.widget.TextView r2 = r13.A00
            if (r2 == 0) goto L_0x02a5
            int r1 = r4.intValue()
            X.C18180wK.A10(r2, r13, r1)
            goto L_0x01fb
        L_0x0240:
            X.C04220Ms.A0E(r10)
            goto L_0x02a8
        L_0x0244:
            X.C04220Ms.A0E(r9)
            goto L_0x02a8
        L_0x0248:
            java.lang.Object r5 = r0.A05
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2 r5 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2) r5
            java.lang.Object r4 = r0.A00
            com.instagram.igds.components.textcell.IgdsListCell r4 = (com.instagram.igds.components.textcell.IgdsListCell) r4
            java.lang.Object r2 = r5.A01
            X.24x r1 = X.C312624x.INDEFINITE
            r3 = 1
            boolean r1 = X.C18180wK.A1Z(r2, r1)
            r4.setChecked(r1)
            java.lang.Object r2 = r0.A02
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            java.lang.Object r4 = r5.A01
            X.24x r4 = (X.C312624x) r4
            X.24x r1 = X.C312624x.ONE_MONTH
            boolean r1 = X.C18180wK.A1Z(r4, r1)
            r2.setChecked(r1)
            java.lang.Object r2 = r0.A01
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            X.24x r1 = X.C312624x.ONE_DAY
            boolean r1 = X.C18180wK.A1Z(r4, r1)
            r2.setChecked(r1)
            java.lang.Object r2 = r0.A03
            com.instagram.igds.components.textcell.IgdsListCell r2 = (com.instagram.igds.components.textcell.IgdsListCell) r2
            X.24x r1 = X.C312624x.ONE_WEEK
            if (r4 == r1) goto L_0x0283
            r3 = 0
        L_0x0283:
            r2.setChecked(r3)
            java.lang.Object r5 = r0.A06
            X.1aq r5 = (X.AnonymousClass1aq) r5
            java.lang.Object r6 = r0.A04
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            int r1 = r4.ordinal()
            r0 = 0
            if (r1 != r0) goto L_0x02aa
            r0 = 2131825839(0x7f1114af, float:1.9284545E38)
            r6.setText(r0)
        L_0x029f:
            X.34D r0 = r5.A00
            if (r0 != 0) goto L_0x02d3
            java.lang.String r11 = "delegate"
        L_0x02a5:
            X.C04220Ms.A0E(r11)
        L_0x02a8:
            r0 = 0
            throw r0
        L_0x02aa:
            r1 = 13
            int r0 = r4.A00
            r7.add(r1, r0)
            r3 = 2131825840(0x7f1114b0, float:1.9284548E38)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = "MMM d, yyyy"
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            r2.<init>(r0, r1)
            long r0 = r7.getTimeInMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = r2.format(r0)
            java.lang.String r0 = X.AnonymousClass0wJ.A0o(r5, r0, r3)
            r6.setText(r0)
            goto L_0x029f
        L_0x02d3:
            X.1bs r3 = r0.A00
            X.0zW r0 = X.C23071bs.A00(r3)
            X.4wE r0 = r0.A08
            r0.CrC(r4)
            X.0Oa r2 = r3.A0A
            java.lang.Object r1 = r2.getValue()
            X.20y r0 = X.AnonymousClass20y.Broadcast
            if (r1 != r0) goto L_0x0324
            X.0Oa r0 = r3.A0I
            X.49Y r2 = X.C18240wQ.A0P(r0)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = X.AnonymousClass49Y.A00(r2)
            boolean r0 = X.AnonymousClass0wJ.A1U(r4)
            if (r0 == 0) goto L_0x005f
            com.instagram.service.session.UserSession r0 = r2.A03
            java.lang.String r0 = r0.getUserId()
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
            java.lang.String r0 = "actor_id"
            r4.A0S(r0, r1)
            X.2AE r0 = X.AnonymousClass2AE.A0U
            X.AnonymousClass2A4.A00(r0, r4)
            X.Lci r0 = X.C40328Lci.A04
            java.lang.String r3 = X.AnonymousClass2AG.A00(r0, r4, r2)
        L_0x0312:
            r2 = 9
            r1 = 10
            r0 = 55
            java.lang.String r0 = X.AnonymousClass3QI.A00(r2, r1, r0)
            r4.A0T(r0, r3)
            r4.Bb4()
            goto L_0x005f
        L_0x0324:
            java.lang.Object r1 = r2.getValue()
            X.20y r0 = X.AnonymousClass20y.Social
            if (r1 != r0) goto L_0x005f
            X.0Oa r0 = r3.A0J
            java.lang.Object r2 = r0.getValue()
            X.49W r2 = (X.AnonymousClass49W) r2
            X.0nS r0 = r2.A02
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r4 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A0D(r0)
            boolean r0 = X.AnonymousClass0wJ.A1U(r4)
            if (r0 == 0) goto L_0x005f
            com.instagram.service.session.UserSession r0 = r2.A03
            java.lang.String r0 = r0.getUserId()
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
            java.lang.String r0 = "actor_id"
            r4.A0S(r0, r1)
            X.2AB r1 = X.AnonymousClass2AB.A0M
            java.lang.String r0 = "event"
            X.AnonymousClass2A3.A00(r1, r4, r0)
            X.Lcg r0 = X.C40326Lcg.A04
            java.lang.String r3 = X.AnonymousClass2AH.A00(r0, r4, r2)
            goto L_0x0312
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape1S0700000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape1S0700000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
