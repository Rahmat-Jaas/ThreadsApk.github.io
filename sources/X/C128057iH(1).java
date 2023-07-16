package X;

import android.view.View;
import android.widget.ImageView;

/* renamed from: X.7iH  reason: invalid class name and case insensitive filesystem */
public final class C128057iH implements C146998nD {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128057iH) {
                C128057iH r5 = (C128057iH) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || this.A02 != r5.A02 || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void Chv(View view) {
        throw new C97396Be(C28174Ezk.A00(27));
    }

    public final int hashCode() {
        int A06 = ((AnonymousClass0wJ.A06(this.A00) * 31) + C18200wM.A09(this.A01)) * 31;
        boolean z = this.A02;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A06 + (z ? 1 : 0)) * 31;
        if (!this.A03) {
            i = 0;
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("UrlImageResource(imageUrl=");
        A0s.append(this.A00);
        A0s.append(", imageUrlDark=");
        A0s.append(this.A01);
        A0s.append(", isCircular=");
        A0s.append(this.A02);
        A0s.append(", skipCancelRequestOnViewDetach=");
        A0s.append(this.A03);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C128057iH(String str, String str2, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void Bao(ImageView imageView) {
        String str;
        String A0P;
        String A0P2;
        AnonymousClass7Kz.A0Q();
        if (((C34822La.A00(C18190wL.A0A(imageView)) && (str = this.A01) != null && (A0P2 = AnonymousClass8bP.A0P(str)) != null && A0P2.length() != 0) || (str = this.A00) != null) && (A0P = AnonymousClass8bP.A0P(str)) != null && A0P.length() != 0) {
            C92895kC r1 = new C92895kC(AnonymousClass7Kz.A0L().A00, str, "ContentValues");
            r1.A07 = this.A02;
            r1.A08 = this.A03;
            r1.A02(imageView);
        }
    }
}
