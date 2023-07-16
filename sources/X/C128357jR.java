package X;

/* renamed from: X.7jR  reason: invalid class name and case insensitive filesystem */
public final class C128357jR implements AnonymousClass8e7 {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C128357jR) && C04220Ms.A0I(this.A00, ((C128357jR) obj).A00));
    }

    public final int hashCode() {
        return C18180wK.A03(this.A00);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("UriTransitionInfo(uri=");
        A0s.append(this.A00);
        C86134wK.A1U(A0s, ", forceThirdPartyApp=");
        return AnonymousClass0wJ.A0u(A0s);
    }

    public C128357jR(String str) {
        this.A00 = str;
    }
}
