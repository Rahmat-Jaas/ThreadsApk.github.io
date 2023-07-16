package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5y7  reason: invalid class name */
public final class AnonymousClass5y7 extends C19862BDo {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5y7) {
                AnonymousClass5y7 r5 = (AnonymousClass5y7) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A00, r5.A00) || this.A06 != r5.A06 || !C04220Ms.A0I(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ImageUrl A00() {
        return this.A00;
    }

    public final String A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }

    public final String A04() {
        return this.A04;
    }

    public final boolean A06() {
        return this.A06;
    }

    public final int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A02, C18180wK.A03(this.A01))));
        return C18210wN.A05(this.A05, (AnonymousClass0wJ.A05(this.A00, A07) + (C86164wN.A1S(this.A06) ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Remix(id=");
        A0s.append(this.A01);
        A0s.append(", primaryText=");
        A0s.append(this.A02);
        A0s.append(", secondaryText=");
        A0s.append(this.A03);
        A0s.append(", tertiaryText=");
        A0s.append(this.A04);
        A0s.append(", imageUrl=");
        A0s.append(this.A00);
        A0s.append(", isChecked=");
        A0s.append(this.A06);
        A0s.append(", userId=");
        A0s.append(this.A05);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass5y7(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, boolean z) {
        AnonymousClass0wJ.A1Q(str2, str3);
        C86104wH.A1P(str4, 4, str5);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = imageUrl;
        this.A06 = z;
        this.A05 = str5;
    }
}
