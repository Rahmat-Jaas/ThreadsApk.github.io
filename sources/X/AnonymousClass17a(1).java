package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.17a  reason: invalid class name */
public final class AnonymousClass17a extends AnonymousClass0Sf {
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public View.OnClickListener A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;
    public Integer A08;
    public Integer A09;
    public boolean A0A;

    public AnonymousClass17a() {
        this((View.OnClickListener) null, (CharSequence) null, 0, 0, 4095, false);
    }

    public /* synthetic */ AnonymousClass17a(View.OnClickListener onClickListener, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        String str;
        z = (i3 & 1) != 0 ? true : z;
        int i4 = 0;
        i = (i3 & 2) != 0 ? 0 : i;
        charSequence = (i3 & 32) != 0 ? null : charSequence;
        if ((i3 & 64) != 0) {
            str = "";
        } else {
            str = null;
        }
        onClickListener = (i3 & 128) != 0 ? null : onClickListener;
        i4 = (i3 & 256) == 0 ? i2 : i4;
        C04220Ms.A0B(str, 7);
        this.A0A = z;
        this.A02 = i;
        this.A01 = 0;
        this.A03 = null;
        this.A06 = charSequence;
        this.A07 = str;
        this.A04 = onClickListener;
        this.A00 = i4;
        this.A08 = null;
        this.A09 = null;
        this.A05 = null;
    }

    public static AnonymousClass17a A00(C37032Jj9 jj9) {
        jj9.A00 = 0.75f;
        jj9.A0P = Float.valueOf(0.75f);
        jj9.A0a = true;
        jj9.A0T = true;
        jj9.A0c = true;
        AnonymousClass17a r1 = new AnonymousClass17a((View.OnClickListener) null, (CharSequence) null, 0, 0, 4095, false);
        r1.A02 = R.drawable.instagram_x_pano_outline_24;
        return r1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass17a) {
                AnonymousClass17a r5 = (AnonymousClass17a) obj;
                if (this.A0A != r5.A0A || this.A02 != r5.A02 || this.A01 != r5.A01 || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A04, r5.A04) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A09, r5.A09) || !C04220Ms.A0I(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C36311JPd A01() {
        CharSequence charSequence;
        View.OnClickListener onClickListener;
        boolean z = this.A0A;
        int i = this.A02;
        int i2 = this.A01;
        Drawable drawable = this.A03;
        CharSequence charSequence2 = this.A06;
        if (this.A07.length() == 0) {
            charSequence = this.A06;
            if (charSequence == null) {
                charSequence = "";
            }
        } else {
            charSequence = this.A07;
        }
        CharSequence charSequence3 = null;
        if (this.A0A) {
            onClickListener = this.A04;
        } else {
            onClickListener = null;
        }
        int i3 = this.A00;
        Integer num = this.A08;
        Integer num2 = this.A09;
        CharSequence charSequence4 = this.A05;
        if (charSequence4 != null && !AnonymousClass8bQ.A0n(charSequence4)) {
            charSequence3 = this.A05;
        }
        return new C36311JPd(drawable, onClickListener, charSequence2, charSequence, charSequence3, num, num2, i, i2, i3, z);
    }

    public final int hashCode() {
        boolean z = this.A0A;
        if (z) {
            z = true;
        }
        return ((((((((AnonymousClass0wJ.A05(this.A07, (((((((((z ? 1 : 0) * true) + this.A02) * 31) + this.A01) * 31 * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + this.A00) * 31) + AnonymousClass0wJ.A03(this.A08)) * 31) + AnonymousClass0wJ.A03(this.A09)) * 31) + C18200wM.A07(this.A05);
    }
}
