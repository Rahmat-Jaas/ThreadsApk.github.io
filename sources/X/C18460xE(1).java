package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;

/* renamed from: X.0xE  reason: invalid class name and case insensitive filesystem */
public final class C18460xE extends Drawable {
    public int A00;
    public Integer A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Paint A05;
    public final RectF A06;
    public final Drawable A07;
    public final Drawable A08;
    public final Drawable A09;
    public final Drawable A0A;
    public final Drawable A0B;
    public final boolean A0C;
    public final int[] A0D;

    public final void draw(Canvas canvas) {
        Drawable drawable;
        C04220Ms.A0B(canvas, 0);
        if (this.A0C) {
            this.A0A.draw(canvas);
        }
        Paint paint = this.A05;
        paint.setColor(this.A02);
        RectF rectF = this.A06;
        float f = (float) this.A03;
        canvas.drawRoundRect(rectF, f, f, paint);
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            drawable = this.A0B;
        } else if (intValue == 1) {
            drawable = this.A07;
        } else if (intValue == 2) {
            drawable = this.A09;
        } else if (intValue == 3) {
            drawable = this.A08;
        } else {
            return;
        }
        drawable.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        C04220Ms.A0B(rect, 0);
        A00(rect, this);
    }

    public static final void A00(Rect rect, C18460xE r12) {
        RectF rectF;
        Drawable drawable;
        int i;
        int i2;
        int intrinsicWidth;
        int i3;
        int intrinsicHeight;
        int i4;
        int intValue = r12.A01.intValue();
        if (intValue == 0) {
            rectF = r12.A06;
            int i5 = rect.left;
            int i6 = r12.A04;
            int i7 = rect.top;
            drawable = r12.A0B;
            rectF.set((float) (i5 + i6), (float) ((i7 + drawable.getIntrinsicHeight()) - 1), (float) (rect.right - i6), (float) (rect.bottom - i6));
            int intrinsicWidth2 = r12.A00 - (drawable.getIntrinsicWidth() / 2);
            if (intrinsicWidth2 < 0) {
                intrinsicWidth2 = 0;
            }
            i2 = rect.top;
            intrinsicWidth = drawable.getIntrinsicWidth() + i;
            i3 = rect.top;
            intrinsicHeight = drawable.getIntrinsicHeight();
        } else if (intValue != 1) {
            if (intValue == 2) {
                rectF = r12.A06;
                int i8 = rect.left;
                int i9 = r12.A04;
                int i10 = rect.right;
                drawable = r12.A09;
                rectF.set((float) (i8 + i9), (float) (rect.top + i9), (float) ((i10 - drawable.getIntrinsicWidth()) + 1), (float) (rect.bottom - i9));
                i = rect.right - drawable.getIntrinsicWidth();
            } else if (intValue == 3) {
                rectF = r12.A06;
                int i11 = rect.left;
                drawable = r12.A08;
                float intrinsicWidth3 = (float) (i11 + drawable.getIntrinsicWidth() + 1);
                int i12 = rect.top;
                int i13 = r12.A04;
                rectF.set(intrinsicWidth3, (float) (i12 + i13), (float) (rect.right - i13), (float) (rect.bottom - i13));
                i = rect.left + 1;
            } else {
                throw AnonymousClass4VZ.A00();
            }
            if (i < 0) {
                i = 0;
            }
            i2 = rect.centerY() - (drawable.getIntrinsicHeight() / 2);
            intrinsicWidth = drawable.getIntrinsicWidth() + i;
            i3 = rect.centerY();
            intrinsicHeight = drawable.getIntrinsicHeight() / 2;
        } else {
            rectF = r12.A06;
            int i14 = rect.left;
            int i15 = r12.A04;
            int i16 = rect.bottom;
            drawable = r12.A07;
            rectF.set((float) (i14 + i15), (float) (rect.top + i15), (float) (rect.right - i15), (float) ((i16 - drawable.getIntrinsicHeight()) + 1));
            int intrinsicWidth4 = r12.A00 - (drawable.getIntrinsicWidth() / 2);
            if (intrinsicWidth4 < 0) {
                intrinsicWidth4 = 0;
            }
            i2 = rect.bottom - drawable.getIntrinsicHeight();
            intrinsicWidth = drawable.getIntrinsicWidth() + i;
            i4 = rect.bottom;
            drawable.setBounds(i, i2, intrinsicWidth, i4);
            Drawable drawable2 = r12.A0A;
            float f = rectF.left;
            int[] iArr = r12.A0D;
            drawable2.setBounds(AnonymousClass8bA.A02(f - ((float) iArr[0])), AnonymousClass8bA.A02(rectF.top - ((float) iArr[1])), AnonymousClass8bA.A02(rectF.right + ((float) iArr[2])), AnonymousClass8bA.A02(rectF.bottom + ((float) iArr[3])));
            r12.invalidateSelf();
        }
        i4 = i3 + intrinsicHeight;
        drawable.setBounds(i, i2, intrinsicWidth, i4);
        Drawable drawable22 = r12.A0A;
        float f2 = rectF.left;
        int[] iArr2 = r12.A0D;
        drawable22.setBounds(AnonymousClass8bA.A02(f2 - ((float) iArr2[0])), AnonymousClass8bA.A02(rectF.top - ((float) iArr2[1])), AnonymousClass8bA.A02(rectF.right + ((float) iArr2[2])), AnonymousClass8bA.A02(rectF.bottom + ((float) iArr2[3])));
        r12.invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.A0B.setAlpha(i);
        this.A07.setAlpha(i);
        this.A09.setAlpha(i);
        this.A08.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0B.setColorFilter(colorFilter);
        this.A07.setColorFilter(colorFilter);
        this.A09.setColorFilter(colorFilter);
        this.A08.setColorFilter(colorFilter);
    }

    public C18460xE(Context context, AnonymousClass3TC r7, boolean z) {
        boolean A1Z = C18200wM.A1Z(r7);
        this.A0C = z;
        Drawable drawable = context.getDrawable(R.drawable.tooltip_nub_top);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            C04220Ms.A06(mutate);
            this.A0B = mutate;
            Drawable drawable2 = context.getDrawable(R.drawable.tooltip_nub_bottom);
            if (drawable2 != null) {
                Drawable mutate2 = drawable2.mutate();
                C04220Ms.A06(mutate2);
                this.A07 = mutate2;
                Drawable drawable3 = context.getDrawable(R.drawable.tooltip_nub_right);
                if (drawable3 != null) {
                    Drawable mutate3 = drawable3.mutate();
                    C04220Ms.A06(mutate3);
                    this.A09 = mutate3;
                    Drawable drawable4 = context.getDrawable(R.drawable.tooltip_nub_left);
                    if (drawable4 != null) {
                        Drawable mutate4 = drawable4.mutate();
                        C04220Ms.A06(mutate4);
                        this.A08 = mutate4;
                        Drawable drawable5 = context.getDrawable(r7.A01);
                        if (drawable5 != null) {
                            Drawable mutate5 = drawable5.mutate();
                            C04220Ms.A06(mutate5);
                            this.A0A = mutate5;
                            this.A05 = new Paint(A1Z ? 1 : 0);
                            this.A06 = new RectF();
                            this.A04 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
                            this.A0D = new int[4];
                            this.A03 = context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
                            this.A02 = context.getColor(r7.A00);
                            this.A01 = AnonymousClass006.A01;
                            int i = 0;
                            do {
                                this.A0D[i] = context.getResources().getDimensionPixelSize(r7.A04[i]);
                                i++;
                            } while (i < 4);
                            C63393hP.A05(this, this.A02);
                            return;
                        }
                        throw C18180wK.A0a("Required value was null.");
                    }
                    throw C18180wK.A0a("Required value was null.");
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }
}
