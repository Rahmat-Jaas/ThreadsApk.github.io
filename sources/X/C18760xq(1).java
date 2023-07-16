package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.0xq  reason: invalid class name and case insensitive filesystem */
public final class C18760xq extends View {
    public final Drawable A00;

    public void setIsSwirlAnimating(boolean z) {
        Drawable drawable = this.A00;
        if (drawable instanceof C28194F0t) {
            ((C28194F0t) drawable).A01(z);
        }
    }

    public C18760xq(Context context, AnonymousClass3HX r6, Integer num, Integer num2, int i, int i2) {
        super(context);
        boolean z;
        boolean A01 = AnonymousClass3JD.A01(context, r6);
        if (5 - C18240wQ.A06(num2, 0) != 0) {
            z = false;
        } else {
            z = true;
        }
        float f = (float) i2;
        if (z) {
            this.A00 = new C28183F0c(i, f);
            setLayerType(2, (Paint) null);
            setAlpha(0.08f);
        } else {
            C28194F0t f0t = new C28194F0t(context, f, i, A01);
            this.A00 = f0t;
            if (num.equals(AnonymousClass006.A01)) {
                f0t.A01(true);
            }
        }
        setBackground(this.A00);
    }

    public final void A00(int i, int i2) {
        setMeasuredDimension(i, i2);
    }
}
