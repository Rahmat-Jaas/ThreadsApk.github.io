package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.3Xk  reason: invalid class name and case insensitive filesystem */
public final class C62153Xk {
    public float A00;
    public int A01;
    public Drawable A02;
    public View.OnClickListener A03;
    public CharSequence A04;
    public CharSequence A05;
    public boolean A06 = false;
    public boolean A07;
    public boolean A08;

    public C62153Xk(CharSequence charSequence) {
        this.A05 = charSequence;
    }

    public C62153Xk(View.OnClickListener onClickListener, int i) {
        this.A01 = i;
        this.A03 = onClickListener;
    }

    public C62153Xk(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.A05 = charSequence;
        this.A03 = onClickListener;
    }
}
