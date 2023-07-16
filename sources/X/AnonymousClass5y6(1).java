package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5y6  reason: invalid class name */
public final class AnonymousClass5y6 extends C19862BDo {
    public final ImageUrl A00;
    public final BKU A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public /* synthetic */ AnonymousClass5y6(ImageUrl imageUrl, BKU bku, String str, String str2, String str3) {
        C04220Ms.A0B(str2, 2);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = imageUrl;
        this.A01 = bku;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5y6) {
                AnonymousClass5y6 r5 = (AnonymousClass5y6) obj;
                if (!C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || !"".equals("") || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
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
        return this.A02;
    }

    public final String A02() {
        return this.A03;
    }

    public final String A03() {
        return this.A04;
    }

    public final String A04() {
        return "";
    }

    public final boolean A06() {
        return false;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A07(this.A04, AnonymousClass0wJ.A07(this.A03, C18180wK.A03(this.A02))) * 31) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Location(id=");
        A0s.append(this.A02);
        A0s.append(", primaryText=");
        A0s.append(this.A03);
        A0s.append(", secondaryText=");
        A0s.append(this.A04);
        A0s.append(", tertiaryText=");
        A0s.append("");
        A0s.append(", imageUrl=");
        A0s.append(this.A00);
        C86134wK.A1U(A0s, ", isChecked=");
        A0s.append(", media=");
        return C86104wH.A0y(this.A01, A0s);
    }
}
