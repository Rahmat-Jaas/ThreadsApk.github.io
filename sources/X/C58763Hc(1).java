package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.3Hc  reason: invalid class name and case insensitive filesystem */
public final class C58763Hc {
    public int A00 = -2;
    public int A01 = -2;
    public int A02 = -2;
    public int A03 = -2;
    public int A04 = -2;
    public ColorFilter A05;
    public ColorFilter A06;
    public Drawable A07;
    public Drawable A08;
    public View.OnClickListener A09;
    public boolean A0A = true;
    public final Integer A0B;

    public final C24758DYo A00() {
        Drawable drawable = this.A08;
        Drawable drawable2 = this.A07;
        int i = this.A04;
        int i2 = this.A00;
        int i3 = this.A01;
        return new C24758DYo(this.A05, this.A06, drawable, drawable2, this.A09, this.A0B, -2, i, -2, i2, i3, -2, -2, true);
    }

    public final void A01(int i) {
        this.A08 = new ColorDrawable(i);
    }

    public C58763Hc(Integer num) {
        this.A0B = num;
    }
}
