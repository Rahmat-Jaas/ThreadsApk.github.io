package com.facebookpay.widget.button;

import X.AnonymousClass006;
import X.AnonymousClass69C;
import X.AnonymousClass7Fd;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C116836xd;
import X.C121097Ec;
import X.C18180wK;
import X.C29934Fwk;
import X.C99126If;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FBPayButton extends Button {
    public AnonymousClass69C A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FBPayButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, AnonymousClass69C.A07);
        C04220Ms.A0B(context, 1);
    }

    public final void setButtonStyle(AnonymousClass69C r11) {
        C04220Ms.A0B(r11, 0);
        this.A00 = r11;
        C99126If.A00(this, r11.A04);
        AnonymousClass69C r8 = this.A00;
        C04220Ms.A0B(r8, 1);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AnonymousClass7Kz.A0G().A02(r8.A04), C29934Fwk.A0b);
        C04220Ms.A06(obtainStyledAttributes);
        StateListDrawable stateListDrawable = new StateListDrawable();
        AnonymousClass7Kz.A0G();
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        C121097Ec A0G = AnonymousClass7Kz.A0G();
        int i = r8.A00;
        C121097Ec.A00(context, drawable, A0G, i);
        stateListDrawable.addState(new int[]{-16842910}, drawable);
        AnonymousClass7Kz.A0G();
        Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
        C121097Ec A0G2 = AnonymousClass7Kz.A0G();
        int i2 = r8.A03;
        C121097Ec.A00(context, drawable2, A0G2, i2);
        stateListDrawable.addState(new int[]{16842919}, drawable2);
        AnonymousClass7Kz.A0G();
        Drawable drawable3 = obtainStyledAttributes.getDrawable(1);
        C121097Ec.A00(context, drawable3, AnonymousClass7Kz.A0G(), i);
        stateListDrawable.addState(new int[]{-16842919}, drawable3);
        AnonymousClass7Kz.A0G();
        Drawable drawable4 = obtainStyledAttributes.getDrawable(1);
        C121097Ec.A00(context, drawable4, AnonymousClass7Kz.A0G(), i2);
        stateListDrawable.addState(new int[]{16842908}, drawable4);
        AnonymousClass7Kz.A0G();
        Drawable drawable5 = obtainStyledAttributes.getDrawable(1);
        C121097Ec.A00(context, drawable5, AnonymousClass7Kz.A0G(), i);
        stateListDrawable.addState(new int[]{-16842908}, drawable5);
        setBackground(stateListDrawable);
        obtainStyledAttributes.recycle();
        AnonymousClass7Fd.A02(this, this.A00.A05);
        AnonymousClass69C r0 = this.A00;
        setTextColor(new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}}, new int[]{AnonymousClass7Kz.A00(context, r0.A02), AnonymousClass7Kz.A00(context, r0.A01)}));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FBPayButton(Context context) {
        this(context, (AttributeSet) null);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FBPayButton(Context context, AttributeSet attributeSet, int i, AnonymousClass69C r7) {
        super(context, attributeSet, i);
        C18180wK.A1Q(context, 1, r7);
        this.A00 = r7;
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C116836xd.A01(this, AnonymousClass006.A01, (String) null);
        AnonymousClass7Kz.A0T(this, this.A00.A04);
        setButtonStyle(this.A00);
        setFocusable(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FBPayButton(Context context, AttributeSet attributeSet, int i, AnonymousClass69C r5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, i, (i2 & 8) != 0 ? AnonymousClass69C.A07 : r5);
    }
}
