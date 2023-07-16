package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.media.EffectPreview;

/* renamed from: X.5y8  reason: invalid class name */
public final class AnonymousClass5y8 extends C19862BDo {
    public final ImageUrl A00;
    public final EffectPreview A01;
    public final BKU A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5y8) {
                AnonymousClass5y8 r5 = (AnonymousClass5y8) obj;
                if (!C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A00, r5.A00) || this.A07 != r5.A07 || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
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
        return this.A03;
    }

    public final String A02() {
        return this.A04;
    }

    public final String A03() {
        return this.A05;
    }

    public final String A04() {
        return this.A06;
    }

    public final boolean A06() {
        return this.A07;
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A06, AnonymousClass0wJ.A07(this.A05, AnonymousClass0wJ.A07(this.A04, C18180wK.A03(this.A03))));
        return C18220wO.A06(this.A02, AnonymousClass0wJ.A05(this.A01, (AnonymousClass0wJ.A05(this.A00, A072) + (C86164wN.A1S(this.A07) ? 1 : 0)) * 31));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Effect(id=");
        A0s.append(this.A03);
        A0s.append(", primaryText=");
        A0s.append(this.A04);
        A0s.append(", secondaryText=");
        A0s.append(this.A05);
        A0s.append(", tertiaryText=");
        A0s.append(this.A06);
        A0s.append(", imageUrl=");
        A0s.append(this.A00);
        A0s.append(", isChecked=");
        A0s.append(this.A07);
        A0s.append(", config=");
        A0s.append(this.A01);
        A0s.append(", media=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public AnonymousClass5y8(ImageUrl imageUrl, EffectPreview effectPreview, BKU bku, String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass0wJ.A1R(str3, str4);
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = imageUrl;
        this.A07 = z;
        this.A01 = effectPreview;
        this.A02 = bku;
    }
}
