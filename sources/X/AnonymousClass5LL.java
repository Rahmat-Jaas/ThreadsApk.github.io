package X;

/* renamed from: X.5LL  reason: invalid class name */
public final class AnonymousClass5LL extends AnonymousClass0Sf implements AnonymousClass8eZ {
    public final C40289Lbs A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LL) {
                AnonymousClass5LL r5 = (AnonymousClass5LL) obj;
                if (this.A00 == r5.A00) {
                    String A002 = AnonymousClass000.A00(921);
                    if (!A002.equals(A002) || !C04220Ms.A0I(this.A01, r5.A01)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((C18210wN.A04(this.A00) + 1472629345) * 31 * 31) + C18200wM.A09(this.A01);
    }

    public /* synthetic */ AnonymousClass5LL(C40289Lbs lbs, String str) {
        this.A00 = lbs;
        this.A01 = str;
    }
}
