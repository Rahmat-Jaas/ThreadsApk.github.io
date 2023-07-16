package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;

/* renamed from: X.0xB  reason: invalid class name and case insensitive filesystem */
public final class C18430xB extends Drawable {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final Drawable A03;
    public final Drawable A04;
    public final Drawable A05;
    public final boolean A06;

    public final void draw(Canvas canvas) {
        C04220Ms.A0B(canvas, 0);
        this.A03.draw(canvas);
        this.A02.draw(canvas);
        this.A04.draw(canvas);
        this.A05.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        this.A02.setAlpha(i);
        this.A04.setAlpha(i);
        this.A05.setAlpha(i);
    }

    public C18430xB(Context context, boolean z) {
        this.A06 = z;
        this.A01 = C18240wQ.A02(context, 18);
        this.A00 = C18240wQ.A02(context, 8);
        int color = context.getColor(R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color);
        Drawable drawable = context.getDrawable(R.drawable.barcelona_heart_outline_20);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            C63393hP.A05(mutate, color);
            this.A03 = mutate;
            Drawable drawable2 = context.getDrawable(R.drawable.barcelona_comment_outline_20);
            if (drawable2 != null) {
                Drawable mutate2 = drawable2.mutate();
                C63393hP.A05(mutate2, color);
                this.A02 = mutate2;
                Drawable drawable3 = context.getDrawable(R.drawable.barcelona_reshare_outline_20);
                if (drawable3 != null) {
                    Drawable mutate3 = drawable3.mutate();
                    C63393hP.A05(mutate3, color);
                    this.A04 = mutate3;
                    Drawable drawable4 = context.getDrawable(R.drawable.barcelona_share_outline_20);
                    if (drawable4 != null) {
                        Drawable mutate4 = drawable4.mutate();
                        C63393hP.A05(mutate4, color);
                        this.A05 = mutate4;
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

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i2 + i4)) / 2.0f;
        int i5 = this.A01;
        float f2 = ((float) i5) / 2.0f;
        int A022 = AnonymousClass8bA.A02(f - f2);
        int A023 = AnonymousClass8bA.A02(f + f2);
        boolean z = this.A06;
        if (z) {
            i = i3 - i5;
        }
        this.A03.setBounds(i, A022, i5 + i, A023);
        int i6 = i5 + this.A00;
        int i7 = i + i6;
        if (z) {
            i7 = i - i6;
        }
        this.A02.setBounds(i7, A022, i5 + i7, A023);
        int i8 = i7 + i6;
        if (z) {
            i8 = i7 - i6;
        }
        this.A04.setBounds(i8, A022, i5 + i8, A023);
        int i9 = i8 + i6;
        if (z) {
            i9 = i8 - i6;
        }
        this.A05.setBounds(i9, A022, i5 + i9, A023);
    }
}
