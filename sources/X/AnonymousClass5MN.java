package X;

/* renamed from: X.5MN  reason: invalid class name */
public final class AnonymousClass5MN extends AnonymousClass0Sf implements C41882MfV {
    public final CharSequence A00;
    public final String A01;
    public final String A02;

    public AnonymousClass5MN(CharSequence charSequence, String str, String str2) {
        C04220Ms.A0B(charSequence, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5MN) {
                AnonymousClass5MN r5 = (AnonymousClass5MN) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, (C18180wK.A03(this.A01) + AnonymousClass0wJ.A06(this.A02)) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("PartnerPromotionInfoItemViewModel(id=");
        A0s.append(this.A01);
        A0s.append(", title=");
        A0s.append(this.A02);
        A0s.append(AnonymousClass000.A00(509));
        return C86104wH.A0y(this.A00, A0s);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
