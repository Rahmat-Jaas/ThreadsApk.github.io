package X;

/* renamed from: X.7Ib  reason: invalid class name and case insensitive filesystem */
public final class C121777Ib {
    public final C146998nD A00;
    public final C146928n6 A01;
    public final AnonymousClass69Q A02;

    public static AnonymousClass5iL A00(C146928n6 r3, C92375iF r4, AnonymousClass69Q r5) {
        r4.A02 = new C121777Ib((C146998nD) null, r3, r5);
        r4.A03 = false;
        return new AnonymousClass5iL(r4);
    }

    public static AnonymousClass5iL A01(C146928n6 r3, C92375iF r4, AnonymousClass69Q r5) {
        r4.A04 = new C121777Ib((C146998nD) null, r3, r5);
        r4.A03 = false;
        return new AnonymousClass5iL(r4);
    }

    public static void A02(C146928n6 r2, C92375iF r3, AnonymousClass69Q r4) {
        r3.A04 = new C121777Ib((C146998nD) null, r2, r4);
    }

    public static void A03(C92375iF r3, AnonymousClass69Q r4, String str) {
        r3.A02 = new C121777Ib((C146998nD) null, new C128107it(str), r4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C121777Ib) {
                C121777Ib r5 = (C121777Ib) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A02 != r5.A02 || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A02, C18210wN.A04(this.A01)) + AnonymousClass0wJ.A03(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("StringResourceWithTextStyle(stringResource=");
        A0s.append(this.A01);
        A0s.append(", textStyle=");
        A0s.append(this.A02);
        A0s.append(", background=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public C121777Ib(C146998nD r1, C146928n6 r2, AnonymousClass69Q r3) {
        AnonymousClass0wJ.A1O(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
