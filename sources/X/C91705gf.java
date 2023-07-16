package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebookpay.widget.accordion.AccordionView;
import com.fbpay.logging.LoggingContext;
import java.util.Map;

/* renamed from: X.5gf  reason: invalid class name and case insensitive filesystem */
public final class C91705gf extends C886359v {
    public final Map A00;
    public final AnonymousClass0YP A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91705gf(AnonymousClass69U r2, LoggingContext loggingContext, Map map, AnonymousClass0YP r5) {
        super(r2, loggingContext, false);
        C04220Ms.A0B(r2, 2);
        this.A00 = map;
        this.A01 = r5;
    }

    public static AnonymousClass7JJ A06() {
        return AnonymousClass7Kz.A05();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f9, code lost:
        if (r2.A01.isPartialView() == false) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.C91715gg r14, X.AnonymousClass7Kx r15) {
        /*
            boolean r5 = X.AnonymousClass0wJ.A1Y(r15, r14)
            java.lang.Object r4 = r15.A01
            com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem r4 = (com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem) r4
            if (r4 == 0) goto L_0x017b
            com.facebookpay.widget.accordion.AccordionView r3 = r14.A00
            X.6j0 r0 = r4.A00
            r3.setBackground(r0)
            X.7Kx r8 = r4.A01
            java.util.Map r1 = r3.A05
            r6 = 0
            if (r1 != 0) goto L_0x001e
            java.lang.String r0 = "viewBinders"
            X.C04220Ms.A0E(r0)
            throw r6
        L_0x001e:
            java.lang.Object r0 = r8.A01
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r0 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r0
            if (r0 == 0) goto L_0x0048
            X.69U r0 = r0.AqR()
        L_0x0028:
            java.lang.Object r7 = r1.get(r0)
            X.59v r7 = (X.C886359v) r7
            if (r7 == 0) goto L_0x0038
            r0 = 32
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = X.C86134wK.A0P(r3, r0)
            r7.A00 = r0
        L_0x0038:
            X.M5O r0 = r3.A03
            if (r0 != 0) goto L_0x0063
            java.lang.String r2 = "summaryContainer"
            if (r7 == 0) goto L_0x004f
            android.widget.FrameLayout r0 = r3.A00
            if (r0 != 0) goto L_0x004a
            X.C04220Ms.A0E(r2)
            throw r6
        L_0x0048:
            r0 = r6
            goto L_0x0028
        L_0x004a:
            X.M5O r0 = r7.A08(r0)
            goto L_0x0050
        L_0x004f:
            r0 = r6
        L_0x0050:
            r3.A03 = r0
            if (r0 == 0) goto L_0x0063
            android.view.View r1 = r0.itemView
            if (r1 == 0) goto L_0x0063
            android.widget.FrameLayout r0 = r3.A00
            if (r0 != 0) goto L_0x0060
            X.C04220Ms.A0E(r2)
            throw r6
        L_0x0060:
            r0.addView(r1)
        L_0x0063:
            X.M5O r0 = r3.A03
            if (r0 == 0) goto L_0x006c
            if (r7 == 0) goto L_0x006c
            r7.A09(r0, r8)
        L_0x006c:
            java.util.List r8 = r4.A02
            java.util.Map r13 = r3.A0A
            r13.clear()
            android.widget.LinearLayout r7 = r3.A01
            java.lang.String r0 = "expandedContainer"
            if (r7 == 0) goto L_0x00a1
            r7.removeAllViews()
            com.google.common.collect.HashMultimap r11 = new com.google.common.collect.HashMultimap
            r11.<init>()
            java.util.Iterator r15 = r8.iterator()
        L_0x0085:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r12 = r15.next()
            X.7Kx r12 = (X.AnonymousClass7Kx) r12
            java.lang.Object r0 = X.AnonymousClass7Kx.A0D(r12)
            com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem r0 = (com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem) r0
            X.69U r10 = r0.AqR()
            java.util.Map r0 = r3.A05
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "viewBinders"
        L_0x00a1:
            X.C04220Ms.A0E(r0)
            throw r6
        L_0x00a5:
            java.lang.Object r9 = r0.get(r10)
            X.59v r9 = (X.C886359v) r9
            if (r9 == 0) goto L_0x0085
            X.MeE r14 = r3.A09
            java.util.Collection r1 = r14.AO8(r10)
            if (r1 == 0) goto L_0x00e5
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x00d5
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = X.AnonymousClass00J.A0G(r1, r5)
        L_0x00bf:
            X.M5O r2 = (X.M5O) r2
            if (r2 == 0) goto L_0x00e5
            r14.remove(r10, r2)
        L_0x00c6:
            android.view.View r0 = r2.itemView
            r7.addView(r0)
            r11.CYQ(r10, r2)
            r13.put(r2, r12)
            r9.A09(r2, r12)
            goto L_0x0085
        L_0x00d5:
            r2 = 0
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r2 = r1.next()
            goto L_0x00bf
        L_0x00e5:
            X.M5O r2 = r9.A08(r7)
            goto L_0x00c6
        L_0x00ea:
            X.MeE r10 = r3.A09
            boolean r0 = r10 instanceof com.google.common.collect.ImmutableMultimap
            if (r0 == 0) goto L_0x0132
            r2 = r10
            com.google.common.collect.ImmutableMultimap r2 = (com.google.common.collect.ImmutableMultimap) r2
            com.google.common.collect.ImmutableMap r0 = r2.A01
            boolean r0 = r0.isPartialView()
            if (r0 != 0) goto L_0x0132
        L_0x00fb:
            r1 = 4
            com.facebook.redex.IDxPredicateShape352S0100000_2_I2 r0 = new com.facebook.redex.IDxPredicateShape352S0100000_2_I2
            r0.<init>(r11, r1)
            X.MeE r0 = X.C40420Lg1.A00(r0, r2)
            java.util.Collection r0 = r0.AKR()
            java.util.Iterator r9 = X.C86134wK.A0t(r0)
        L_0x010d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0137
            java.util.Map$Entry r2 = X.C18180wK.A0o(r9)
            java.lang.Object r1 = r2.getValue()
            boolean r0 = r1 instanceof X.C89095Bw
            if (r0 == 0) goto L_0x0126
            X.5Bw r1 = (X.C89095Bw) r1
            if (r1 == 0) goto L_0x0126
            r1.A00()
        L_0x0126:
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r10.remove(r1, r0)
            goto L_0x010d
        L_0x0132:
            com.google.common.collect.ImmutableListMultimap r2 = com.google.common.collect.ImmutableListMultimap.A01(r10)
            goto L_0x00fb
        L_0x0137:
            r10.CYV(r11)
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L_0x0176
            boolean r0 = r8.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r8.get(r5)
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r0 = r0.A01
            boolean r0 = r0 instanceof com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r8.get(r5)
            X.7Kx r0 = (X.AnonymousClass7Kx) r0
            java.lang.Object r1 = r0.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem"
            X.C04220Ms.A0C(r1, r0)
            com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem r1 = (com.facebookpay.common.recyclerview.adapteritems.SelectionHeaderItem) r1
            java.lang.Integer r1 = r1.A02
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            if (r1 != r0) goto L_0x016b
            r2 = 0
        L_0x016b:
            android.view.View r1 = r7.getChildAt(r5)
            if (r2 == 0) goto L_0x017c
            r0 = 31
            X.C86104wH.A1C(r1, r0, r3)
        L_0x0176:
            boolean r0 = r4.A03
            r3.setExpansionState(r0)
        L_0x017b:
            return
        L_0x017c:
            r1.setOnClickListener(r6)
            goto L_0x0176
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91705gf.A07(X.5gg, X.7Kx):void");
    }

    public final C89095Bw A0A(ViewGroup viewGroup) {
        AnonymousClass7JJ A06 = A06();
        Context A0A = C18190wL.A0A(viewGroup);
        AnonymousClass69U r3 = this.A02;
        View A05 = A06.A05(A0A, viewGroup, r3);
        C04220Ms.A0C(A05, "null cannot be cast to non-null type com.facebookpay.widget.accordion.AccordionView");
        AccordionView accordionView = (AccordionView) A05;
        Map map = this.A00;
        AnonymousClass0YP r0 = this.A01;
        accordionView.A04 = r3;
        accordionView.A05 = map;
        accordionView.A06 = r0;
        return new C91715gg(this, accordionView);
    }
}
