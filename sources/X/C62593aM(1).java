package X;

import android.view.View;

/* renamed from: X.3aM  reason: invalid class name and case insensitive filesystem */
public class C62593aM {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View.OnClickListener A06;
    public CharSequence A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;
    public final String A0B;

    public C62593aM(View.OnClickListener onClickListener, int i) {
        this(onClickListener, (String) null, i, 0, false);
    }

    public C62593aM(View.OnClickListener onClickListener, CharSequence charSequence, String str, boolean z) {
        this.A0A = false;
        this.A08 = charSequence;
        this.A09 = z;
        this.A0B = str;
        this.A06 = onClickListener;
    }

    public C62593aM(View.OnClickListener onClickListener, CharSequence charSequence, CharSequence charSequence2, String str) {
        this.A0A = false;
        this.A08 = charSequence;
        this.A07 = charSequence2;
        this.A09 = false;
        this.A0B = str;
        this.A06 = onClickListener;
    }

    public C62593aM(View.OnClickListener onClickListener, String str, int i, int i2, boolean z) {
        this.A0A = false;
        this.A04 = i;
        this.A06 = onClickListener;
        this.A03 = i2;
        this.A09 = z;
        this.A0B = str;
    }
}
