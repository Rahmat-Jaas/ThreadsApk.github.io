package X;

import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.17E  reason: invalid class name */
public final class AnonymousClass17E extends AnonymousClass0Sf {
    public final ImageView.ScaleType A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public AnonymousClass17E() {
        this(ImageView.ScaleType.CENTER, (ImageUrl) null, (String) null, (String) null, false, false, true, true, true, true, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass17E) {
                AnonymousClass17E r5 = (AnonymousClass17E) obj;
                if (!(C04220Ms.A0I(this.A03, r5.A03) && this.A07 == r5.A07 && C04220Ms.A0I(this.A02, r5.A02) && C04220Ms.A0I(this.A01, r5.A01) && this.A09 == r5.A09 && this.A05 == r5.A05 && this.A0B == r5.A0B && this.A00 == r5.A00 && this.A08 == r5.A08 && this.A0A == r5.A0A && this.A04 == r5.A04 && this.A06 == r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A062 = AnonymousClass0wJ.A06(this.A03) * 31;
        boolean z = this.A07;
        int i = 1;
        if (z) {
            z = true;
        }
        int A063 = (((((A062 + (z ? 1 : 0)) * 31) + AnonymousClass0wJ.A06(this.A02)) * 31) + C18200wM.A07(this.A01)) * 31;
        boolean z2 = this.A09;
        if (z2) {
            z2 = true;
        }
        int i2 = (A063 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.A05;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.A0B;
        if (z4) {
            z4 = true;
        }
        int A052 = AnonymousClass0wJ.A05(this.A00, (i3 + (z4 ? 1 : 0)) * 31);
        boolean z5 = this.A08;
        if (z5) {
            z5 = true;
        }
        int i4 = (A052 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.A0A;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.A04;
        if (z7) {
            z7 = true;
        }
        int i6 = (i5 + (z7 ? 1 : 0)) * 31;
        if (!this.A06) {
            i = 0;
        }
        return i6 + i;
    }

    public AnonymousClass17E(ImageView.ScaleType scaleType, ImageUrl imageUrl, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C04220Ms.A0B(scaleType, 8);
        this.A03 = str;
        this.A07 = z;
        this.A02 = str2;
        this.A01 = imageUrl;
        this.A09 = z2;
        this.A05 = z3;
        this.A0B = z4;
        this.A00 = scaleType;
        this.A08 = z5;
        this.A0A = z6;
        this.A04 = z7;
        this.A06 = z8;
    }
}
