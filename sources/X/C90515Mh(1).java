package X;

import java.util.List;

/* renamed from: X.5Mh  reason: invalid class name and case insensitive filesystem */
public final class C90515Mh extends AnonymousClass0Sf implements AnonymousClass8j2 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final C90515Mh D3x() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90515Mh) {
                C90515Mh r5 = (C90515Mh) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AnonymousClass0wJ.A06(this.A00) * 31) + AnonymousClass0wJ.A06(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + C18200wM.A09(this.A02);
    }

    public C90515Mh(String str, String str2, String str3, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = list;
        this.A02 = str3;
    }
}
