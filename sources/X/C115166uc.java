package X;

/* renamed from: X.6uc  reason: invalid class name and case insensitive filesystem */
public final class C115166uc {
    public final int A00;
    public final C146928n6 A01;
    public final String A02;
    public final AnonymousClass0ZU A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115166uc) {
                C115166uc r5 = (C115166uc) obj;
                if (this.A00 != r5.A00 || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A01, AnonymousClass0wJ.A05(this.A03, this.A00 * 31)) + AnonymousClass0wJ.A06(this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TitleBarAction(iconType=");
        A0s.append(this.A00);
        A0s.append(", clickListener=");
        A0s.append(this.A03);
        A0s.append(AnonymousClass000.A00(230));
        A0s.append(this.A01);
        A0s.append(", testKey=");
        A0s.append(this.A02);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C115166uc(C146928n6 r1, String str, AnonymousClass0ZU r3, int i) {
        this.A00 = i;
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = str;
    }
}
