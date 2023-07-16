package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.5y5  reason: invalid class name */
public final class AnonymousClass5y5 extends C19862BDo {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5y5) {
                AnonymousClass5y5 r5 = (AnonymousClass5y5) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !"".equals("") || !C04220Ms.A0I(this.A00, r5.A00)) {
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
        return "";
    }

    public final boolean A06() {
        return false;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A07(this.A03, AnonymousClass0wJ.A07(this.A02, C18180wK.A03(this.A01))) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Person(id=");
        A0s.append(this.A01);
        A0s.append(", primaryText=");
        A0s.append(this.A02);
        A0s.append(", secondaryText=");
        A0s.append(this.A03);
        A0s.append(", tertiaryText=");
        A0s.append("");
        A0s.append(", imageUrl=");
        A0s.append(this.A00);
        C86134wK.A1U(A0s, ", isChecked=");
        return AnonymousClass0wJ.A0u(A0s);
    }

    public /* synthetic */ AnonymousClass5y5(ImageUrl imageUrl, String str, String str2, String str3) {
        AnonymousClass0wJ.A1Q(str2, str3);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = imageUrl;
    }
}
