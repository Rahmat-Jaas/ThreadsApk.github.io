package com.instagram.igds.components.mediabutton;

import X.AnonymousClass0wJ;
import X.AnonymousClass21G;
import X.AnonymousClass257;
import X.AnonymousClass25V;
import X.C04220Ms;
import X.C18210wN;
import X.C18220wO;
import X.C308423e;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsMediaToggleButton extends IgdsMediaButton {
    public AnonymousClass257 A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsMediaToggleButton(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    public final void setToggleButtonStyle(AnonymousClass257 r2) {
        C04220Ms.A0B(r2, 0);
        this.A00 = r2;
        A00(r2);
    }

    public final void A05(View.OnClickListener onClickListener) {
        super.setOnClickListener(new IDxCListenerShape70S0200000_1_I2(onClickListener, this, 120));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new IDxCListenerShape70S0200000_1_I2(onClickListener, this, 119));
    }

    private final void A00(AnonymousClass257 r4) {
        AnonymousClass25V r0;
        GradientDrawable gradientDrawable;
        if (!isSelected()) {
            r0 = r4.A01;
        } else if (this.A00.A00 == 0) {
            Drawable background = getBackground();
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setColor(getContext().getColor(R.color.igds_primary_button));
            }
            A04();
            return;
        } else {
            r0 = r4.A02;
        }
        setButtonStyle(r0);
    }

    public int getLabelColor() {
        if (!isSelected() || !C04220Ms.A0I(this.A00.toString(), AnonymousClass257.A04.toString())) {
            return super.getLabelColor();
        }
        return getContext().getColor(R.color.canvas_bottom_sheet_description_text_color);
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        A00(this.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r2 == 3) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgdsMediaToggleButton(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            r5 = 1
            X.C04220Ms.A0B(r7, r5)
            r6.<init>(r7, r8, r9)
            X.257 r4 = X.AnonymousClass257.A04
            r6.A00 = r4
            if (r8 == 0) goto L_0x0046
            android.content.res.Resources$Theme r2 = r7.getTheme()
            int[] r1 = X.C29934Fwk.A1R
            r0 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r8, r1, r9, r0)
            int r2 = r3.getInt(r0, r0)     // Catch:{ all -> 0x003e }
            if (r2 == r0) goto L_0x002d
            X.257 r1 = X.AnonymousClass257.A05     // Catch:{ all -> 0x003e }
            if (r2 == r5) goto L_0x002c
            X.257 r1 = X.AnonymousClass257.A06     // Catch:{ all -> 0x003e }
            r0 = 2
            if (r2 == r0) goto L_0x002c
            X.257 r1 = X.AnonymousClass257.A07     // Catch:{ all -> 0x003e }
            r0 = 3
            if (r2 != r0) goto L_0x002d
        L_0x002c:
            r4 = r1
        L_0x002d:
            r6.A00 = r4     // Catch:{ all -> 0x003e }
            r0 = 4
            boolean r0 = r3.hasValue(r0)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = "IgdsMediaToggleButton"
            java.lang.String r0 = "For media toggle buttons, please set mediaToggleButtonStyle instead of mediaButtonStyle attribute."
            X.C10450iM.A03(r1, r0)     // Catch:{ all -> 0x003e }
            goto L_0x0043
        L_0x003e:
            r0 = move-exception
            r3.recycle()
            throw r0
        L_0x0043:
            r3.recycle()
        L_0x0046:
            X.257 r0 = r6.A00
            r6.setToggleButtonStyle(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.mediabutton.IgdsMediaToggleButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsMediaToggleButton(Context context, AnonymousClass257 r3, C308423e r4, AnonymousClass21G r5) {
        super(context, r3.A01, r4, r5);
        AnonymousClass0wJ.A1O(context, r3);
        AnonymousClass0wJ.A1R(r4, r5);
        this.A00 = AnonymousClass257.A04;
        setToggleButtonStyle(r3);
    }

    public /* synthetic */ IgdsMediaToggleButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsMediaToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }
}
