package X;

import java.util.List;

/* renamed from: X.5Mp  reason: invalid class name and case insensitive filesystem */
public final class C90595Mp extends AnonymousClass0Sf implements C144818jK {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final C90595Mp D55() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90595Mp) {
                C90595Mp r5 = (C90595Mp) obj;
                if (!C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass0wJ.A07(this.A01, AnonymousClass0wJ.A03(this.A04) * 31);
        return C18210wN.A05(this.A03, (AnonymousClass0wJ.A07(this.A02, A07) + C18200wM.A07(this.A00)) * 31);
    }

    public C90595Mp(Integer num, String str, String str2, String str3, List list) {
        AnonymousClass0wJ.A1Q(str, str2);
        C04220Ms.A0B(str3, 5);
        this.A04 = list;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = str3;
    }
}
