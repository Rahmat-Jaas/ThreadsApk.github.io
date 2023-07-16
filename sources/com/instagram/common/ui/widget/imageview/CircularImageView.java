package com.instagram.common.ui.widget.imageview;

import X.AnonymousClass4xO;
import X.C04220Ms;
import X.C14030oh;
import X.C18210wN;
import X.C18220wO;
import X.C29934Fwk;
import X.C63393hP;
import X.C86134wK;
import X.C86164wN;
import X.C86364xY;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.redex.IDxOProviderShape4S0000000_2_I2;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class CircularImageView extends IgImageView {
    public int A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public int A04;
    public AnonymousClass4xO A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        this.A08 = C86134wK.A0D();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C29934Fwk.A0G);
            C04220Ms.A06(obtainStyledAttributes);
            int color = obtainStyledAttributes.getColor(2, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.A07 = obtainStyledAttributes.getBoolean(3, false);
            this.A02 = obtainStyledAttributes.getBoolean(4, false);
            this.A03 = obtainStyledAttributes.getColor(1, 1711276032);
            this.A01 = obtainStyledAttributes.getBoolean(0, false);
            this.A06 = false;
            obtainStyledAttributes.recycle();
            A0F(dimensionPixelSize, color);
        }
        setOutlineProvider(new IDxOProviderShape4S0000000_2_I2(3));
        setClipToOutline(true);
    }

    public void onDraw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        super.onDraw(canvas);
        AnonymousClass4xO r0 = this.A05;
        if (r0 != null) {
            r0.draw(canvas);
        }
    }

    private final Rect getPaddingAffordanceRect() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.A07) {
            i = getPaddingLeft();
            i2 = getPaddingTop();
            i3 = getPaddingRight();
            i4 = getPaddingBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        return C86164wN.A0F(i, i2, i3, i4);
    }

    public final void A0F(int i, int i2) {
        if (i != 0) {
            this.A04 = i;
            AnonymousClass4xO r0 = this.A05;
            if (r0 == null) {
                AnonymousClass4xO r02 = new AnonymousClass4xO(i, i2);
                this.A05 = r02;
                this.A00 = r02.A00.getAlpha();
            } else {
                r0.A00.setStrokeWidth((float) i);
                AnonymousClass4xO r03 = this.A05;
                if (r03 != null) {
                    r03.A00.setColor(i2);
                }
            }
        }
        invalidate();
    }

    public final int getStrokeWidth() {
        return this.A04;
    }

    public void setImageBitmap(Bitmap bitmap) {
        C86364xY r0;
        if (bitmap != null) {
            r0 = new C86364xY(bitmap, this.A01);
        } else {
            r0 = null;
        }
        super.setImageDrawable(r0);
    }

    public void setImageDrawable(Drawable drawable) {
        boolean z = drawable instanceof ColorDrawable;
        GradientDrawable gradientDrawable = drawable;
        if (z) {
            int color = ((ColorDrawable) drawable).getColor();
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(color);
            gradientDrawable2.setShape(1);
            gradientDrawable = gradientDrawable2;
        }
        super.setImageDrawable(gradientDrawable);
        A01(getPaddingAffordanceRect());
    }

    public void setImageResource(int i) {
        throw C86134wK.A0s("Use setImageDrawable or setImageBitmap");
    }

    public void setImageURI(Uri uri) {
        throw C86134wK.A0s("Use setImageDrawable or setImageBitmap");
    }

    public final void setStrokeAlpha(int i) {
        AnonymousClass4xO r0 = this.A05;
        if (r0 != null) {
            r0.setAlpha(i);
        }
    }

    private final void A01(Rect rect) {
        Drawable drawable = getDrawable();
        if (this.A02 && drawable != null) {
            Rect bounds = drawable.getBounds();
            C04220Ms.A06(bounds);
            int i = this.A04;
            drawable.setBounds(rect.left + bounds.left + i, rect.top + bounds.top + i, (bounds.right - rect.right) - i, (bounds.bottom - rect.bottom) - i);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Rect rect;
        int A062 = C14030oh.A06(229240072);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A05 != null) {
            if (getBackground() != null) {
                Drawable background = getBackground();
                rect = this.A08;
                background.getPadding(rect);
            } else {
                rect = this.A08;
                rect.set(0, 0, 0, 0);
            }
            Rect paddingAffordanceRect = getPaddingAffordanceRect();
            A01(paddingAffordanceRect);
            Rect A0F = C86164wN.A0F(paddingAffordanceRect.left + rect.left, paddingAffordanceRect.top + rect.top, (getWidth() - paddingAffordanceRect.bottom) - rect.right, (getHeight() - paddingAffordanceRect.top) - rect.bottom);
            AnonymousClass4xO r0 = this.A05;
            if (r0 != null) {
                r0.setBounds(A0F);
            }
        }
        C14030oh.A0D(1332306114, A062);
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        if (this.A06 && z) {
            setColorFilter(C63393hP.A00(this.A03));
        }
    }

    public final void setCenterCrop(boolean z) {
        this.A01 = z;
    }

    public final void setDarkenOnPress(boolean z) {
        this.A06 = z;
    }

    public final void setFitImageInsideStroke(boolean z) {
        this.A02 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CircularImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }

    public /* synthetic */ CircularImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }
}
