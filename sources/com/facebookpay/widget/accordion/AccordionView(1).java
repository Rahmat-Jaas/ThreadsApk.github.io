package com.facebookpay.widget.accordion;

import X.AnonymousClass01J;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass5j3;
import X.AnonymousClass69U;
import X.AnonymousClass7Kx;
import X.C04220Ms;
import X.C12560m7;
import X.C14030oh;
import X.C18180wK;
import X.C18220wO;
import X.C41823MeE;
import X.C86134wK;
import X.C86144wL;
import X.C886359v;
import X.C91585gT;
import X.M5O;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebookpay.common.recyclerview.adapteritems.InlineFormItem;
import com.fbpay.logging.LoggingContext;
import com.google.common.collect.HashMultimap;
import com.instagram.barcelona.R;
import java.util.Iterator;
import java.util.Map;

public class AccordionView extends FrameLayout {
    public FrameLayout A00;
    public LinearLayout A01;
    public ConstraintLayout A02;
    public M5O A03;
    public AnonymousClass69U A04;
    public Map A05;
    public AnonymousClass0YP A06;
    public Boolean A07;
    public final int A08;
    public final C41823MeE A09;
    public final Map A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        this.A0A = C18220wO.A0y();
        this.A09 = new HashMultimap();
        this.A08 = C86144wL.A06(context);
        FrameLayout.inflate(context, R.layout.fbpay_ui_accordion_view, this);
        setImportantForAccessibility(2);
        this.A00 = (FrameLayout) AnonymousClass0wJ.A0I(this, R.id.accordion_summary_container);
        this.A01 = (LinearLayout) AnonymousClass0wJ.A0I(this, R.id.accordion_expanded_container);
        this.A02 = (ConstraintLayout) AnonymousClass0wJ.A0I(this, R.id.accordion_view_container);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setBackground(X.C108826j0 r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x004a
            java.lang.Integer r0 = r7.A02
            int r5 = r7.A00
            int r4 = r7.A01
            if (r0 == 0) goto L_0x002d
            int r3 = r0.intValue()
            if (r5 == r3) goto L_0x004a
            r2 = 0
            X.8bH r0 = X.AnonymousClass8bI.A0C(r2, r5)
            boolean r1 = r0.A06(r3)
            r0 = r3
            if (r1 == 0) goto L_0x001e
            int r0 = r4 - r3
        L_0x001e:
            int r4 = r0 + -1
            X.8bH r0 = X.AnonymousClass8bI.A0C(r2, r5)
            boolean r0 = r0.A06(r3)
            if (r0 == 0) goto L_0x002d
            int r5 = r5 - r3
            int r5 = r5 + -1
        L_0x002d:
            if (r4 == 0) goto L_0x004a
            if (r5 != 0) goto L_0x0042
            java.lang.Integer r2 = X.AnonymousClass006.A01
        L_0x0033:
            android.content.Context r0 = X.C18190wL.A0A(r6)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r6.A02
            if (r1 != 0) goto L_0x004d
            java.lang.String r0 = "accordionContainer"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0042:
            if (r5 != r4) goto L_0x0047
            java.lang.Integer r2 = X.AnonymousClass006.A0N
            goto L_0x0033
        L_0x0047:
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            goto L_0x0033
        L_0x004a:
            java.lang.Integer r2 = X.AnonymousClass006.A00
            goto L_0x0033
        L_0x004d:
            r3 = 0
            r5 = 8
            r4 = r3
            X.C121047Dv.A01(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.widget.accordion.AccordionView.setBackground(X.6j0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r0.getChildCount() <= 0) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        if (r2 == null) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setExpansionState(boolean r13) {
        /*
            r12 = this;
            androidx.constraintlayout.widget.ConstraintLayout r7 = r12.A02
            if (r7 != 0) goto L_0x000b
            java.lang.String r6 = "accordionContainer"
        L_0x0006:
            X.C04220Ms.A0E(r6)
        L_0x0009:
            r0 = 0
            throw r0
        L_0x000b:
            int r4 = r7.getMeasuredHeight()
            r3 = 0
            java.lang.String r1 = "expandedContainer"
            if (r13 == 0) goto L_0x001f
            android.widget.LinearLayout r0 = r12.A01
            if (r0 == 0) goto L_0x0031
            int r0 = r0.getChildCount()
            r5 = 1
            if (r0 > 0) goto L_0x0020
        L_0x001f:
            r5 = 0
        L_0x0020:
            r11 = 8
            java.lang.String r6 = "summaryContainer"
            if (r5 == 0) goto L_0x0035
            android.widget.FrameLayout r0 = r12.A00
            if (r0 == 0) goto L_0x0006
            r0.setVisibility(r11)
            android.widget.LinearLayout r2 = r12.A01
            if (r2 != 0) goto L_0x0041
        L_0x0031:
            X.C04220Ms.A0E(r1)
            goto L_0x0009
        L_0x0035:
            android.widget.LinearLayout r0 = r12.A01
            if (r0 == 0) goto L_0x0031
            r0.setVisibility(r11)
            android.widget.FrameLayout r2 = r12.A00
            if (r2 != 0) goto L_0x0041
            goto L_0x0006
        L_0x0041:
            r2.setVisibility(r3)
            java.lang.Boolean r1 = r12.A07
            if (r1 == 0) goto L_0x005e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = X.C04220Ms.A0I(r0, r1)
            if (r0 != 0) goto L_0x005e
            android.view.ViewTreeObserver r1 = r12.getViewTreeObserver()
            X.7Rp r0 = new X.7Rp
            r0.<init>(r2, r7, r12, r4)
            r1.addOnGlobalLayoutListener(r0)
        L_0x005e:
            X.69U r1 = r12.A04
            if (r1 != 0) goto L_0x0065
            java.lang.String r6 = "itemViewType"
            goto L_0x0006
        L_0x0065:
            X.69U r0 = X.AnonymousClass69U.A0Q
            if (r1 != r0) goto L_0x00cb
            r0 = 27
        L_0x006b:
            X.AnonymousClass7Kz.A0T(r7, r0)
            if (r5 == 0) goto L_0x0087
            android.content.Context r6 = X.C18190wL.A0A(r12)
            java.lang.Integer r8 = X.AnonymousClass006.A00
            r9 = 0
            r0 = 61
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            X.C121047Dv.A01(r6, r7, r8, r9, r10, r11)
        L_0x0080:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r12.A07 = r0
            return
        L_0x0087:
            android.content.Context r4 = X.C18190wL.A0A(r12)
            android.graphics.drawable.Drawable r0 = r7.getBackground()
            boolean r1 = r0 instanceof android.graphics.drawable.LayerDrawable
            java.lang.String r2 = X.C28174Ezk.A00(r3)
            if (r1 == 0) goto L_0x00c6
            android.graphics.drawable.Drawable r1 = r7.getBackground()
            r0 = 7
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C04220Ms.A0C(r1, r0)
            android.graphics.drawable.LayerDrawable r1 = (android.graphics.drawable.LayerDrawable) r1
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r3)
        L_0x00a9:
            X.C04220Ms.A0C(r3, r2)
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
            r2 = 60
            r0 = 1
            X.C04220Ms.A0B(r3, r0)
            r0 = 2130969520(0x7f0403b0, float:1.7547724E38)
            int r1 = X.AnonymousClass7IS.A00(r4, r0)
            r3.mutate()
            int r0 = X.AnonymousClass7Kz.A00(r4, r2)
            r3.setStroke(r1, r0)
            goto L_0x0080
        L_0x00c6:
            android.graphics.drawable.Drawable r3 = r7.getBackground()
            goto L_0x00a9
        L_0x00cb:
            r0 = 25
            if (r5 == 0) goto L_0x006b
            r0 = 26
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.widget.accordion.AccordionView.setExpansionState(boolean):void");
    }

    public final void onAttachedToWindow() {
        C91585gT r5;
        int A062 = C14030oh.A06(-1800267921);
        super.onAttachedToWindow();
        Iterator A0t = C86134wK.A0t(this.A09.AKR());
        while (A0t.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0t);
            Map map = this.A05;
            if (map == null) {
                C04220Ms.A0E("viewBinders");
                throw null;
            }
            C886359v r52 = (C886359v) map.get(A0o.getKey());
            if ((r52 instanceof C91585gT) && (r5 = (C91585gT) r52) != null) {
                Object obj = this.A0A.get(A0o.getValue());
                C04220Ms.A0C(obj, "null cannot be cast to non-null type com.fbpay.util.resource.FBPayResource<kotlin.Any>");
                AnonymousClass7Kx r1 = (AnonymousClass7Kx) obj;
                Object value = A0o.getValue();
                C04220Ms.A06(value);
                boolean A1Z = AnonymousClass0wJ.A1Z(r1, value);
                InlineFormItem inlineFormItem = (InlineFormItem) r1.A01;
                if (inlineFormItem != null) {
                    Bundle A063 = C18180wK.A06();
                    A063.putParcelable("ECP_FORM_FRAGMENT_PARAMS", inlineFormItem.A00);
                    LoggingContext loggingContext = r5.A03;
                    A063.putString("ECP_SESSION_ID", loggingContext.A02);
                    A063.putString("ECP_PRODUCT_ID", String.valueOf(loggingContext.A00));
                    A063.putString("ECP_CLIENT_RECEIVER_ID", inlineFormItem.A01);
                    A063.putParcelable("logging_context", loggingContext);
                    AnonymousClass5j3 r3 = new AnonymousClass5j3();
                    r3.setArguments(A063);
                    AnonymousClass0YY r0 = r5.A04;
                    C04220Ms.A0B(r0, 0);
                    r3.A0I = r0;
                    r5.A03.put(value, r3);
                    AnonymousClass01J r2 = new AnonymousClass01J(r5.A01);
                    r2.A0G = A1Z;
                    r2.A0G(r3, r5.A02, r5.A00);
                    r2.A08();
                }
            }
        }
        C14030oh.A0D(-401434757, A062);
    }

    public final void onDetachedFromWindow() {
        C91585gT r4;
        int A062 = C14030oh.A06(-27158710);
        super.onDetachedFromWindow();
        Iterator A0t = C86134wK.A0t(this.A09.AKR());
        while (A0t.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0t);
            Map map = this.A05;
            if (map == null) {
                C04220Ms.A0E("viewBinders");
                throw null;
            }
            C886359v r42 = (C886359v) map.get(A0o.getKey());
            if ((r42 instanceof C91585gT) && (r4 = (C91585gT) r42) != null) {
                Object value = A0o.getValue();
                C04220Ms.A06(value);
                C12560m7 r2 = r4.A01;
                Fragment A0O = r2.A0O(r4.A02);
                if (A0O != null && C04220Ms.A0I(r4.A03.get(value), A0O)) {
                    AnonymousClass01J r0 = new AnonymousClass01J(r2);
                    r0.A04(A0O);
                    r0.A09();
                }
            }
        }
        C14030oh.A0D(-674520643, A062);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccordionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
