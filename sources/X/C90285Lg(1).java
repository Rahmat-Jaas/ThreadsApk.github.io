package X;

import com.instagram.api.schemas.LineType;

/* renamed from: X.5Lg  reason: invalid class name and case insensitive filesystem */
public final class C90285Lg extends AnonymousClass0Sf implements C146628mY {
    public final LineType A00;
    public final C970267q A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public /* synthetic */ C90285Lg(LineType lineType, C970267q r3, String str, String str2, String str3, String str4, String str5, boolean z) {
        C18230wP.A1R(str, 1, lineType);
        C04220Ms.A0B(r3, 10);
        this.A05 = str;
        this.A06 = str2;
        this.A02 = str3;
        this.A07 = z;
        this.A03 = str4;
        this.A00 = lineType;
        this.A04 = str5;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90285Lg) {
                C90285Lg r5 = (C90285Lg) obj;
                if (!C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A02, r5.A02) || this.A07 != r5.A07 || !C04220Ms.A0I(this.A03, r5.A03) || this.A00 != r5.A00 || !C04220Ms.A0I(this.A04, r5.A04) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String B2L() {
        return this.A02;
    }

    public final String B7K() {
        return this.A04;
    }

    public final String BGL() {
        return this.A05;
    }

    public final String BGO() {
        return this.A06;
    }

    public final C970267q BIh() {
        return this.A01;
    }

    public final boolean BSX() {
        return this.A07;
    }

    public final boolean BWz() {
        return false;
    }

    public final boolean BZW() {
        return false;
    }

    public final Object getKey() {
        return C100156Mf.A00(this, "replyToContext");
    }

    public final int hashCode() {
        int A072 = AnonymousClass0wJ.A07(this.A06, C18180wK.A03(this.A05));
        return C18220wO.A06(this.A01, (AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A07(this.A03, (AnonymousClass0wJ.A07(this.A02, A072) + (C86164wN.A1S(this.A07) ? 1 : 0)) * 31)) + AnonymousClass0wJ.A06(this.A04)) * 31 * 31 * 31);
    }
}
