package X;

import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.3bP  reason: invalid class name and case insensitive filesystem */
public final class C63063bP {
    public int A00;
    public int A01 = 1;
    public int A02;
    public String A03;
    public final float A04;
    public final int A05;
    public final View.OnClickListener A06;

    public C63063bP(View.OnClickListener onClickListener, int i) {
        this.A02 = i;
        this.A06 = onClickListener;
        this.A05 = R.color.igds_primary_text;
        this.A04 = 1.0f;
    }

    public C63063bP(View.OnClickListener onClickListener, String str, int i) {
        this.A03 = str;
        this.A06 = onClickListener;
        this.A05 = i;
        this.A04 = 1.0f;
    }

    public C63063bP(View.OnClickListener onClickListener, float f, int i, int i2) {
        this.A02 = i;
        this.A06 = onClickListener;
        this.A05 = i2;
        this.A04 = f;
    }

    public C63063bP(View.OnClickListener onClickListener, String str, float f, int i, int i2, int i3, int i4) {
        this.A03 = str;
        this.A06 = onClickListener;
        this.A05 = R.color.igds_primary_text;
        this.A04 = 1.0f;
        this.A00 = 0;
        this.A01 = i4;
    }

    public C63063bP(View.OnClickListener onClickListener, String str, int i, int i2) {
        this.A03 = str;
        this.A06 = onClickListener;
        this.A05 = i;
        this.A04 = 1.0f;
        this.A00 = i2;
    }
}
