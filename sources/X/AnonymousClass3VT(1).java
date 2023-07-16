package X;

import java.util.List;

/* renamed from: X.3VT  reason: invalid class name */
public final class AnonymousClass3VT {
    public String A00;
    public List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3VT) {
                AnonymousClass3VT r5 = (AnonymousClass3VT) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18180wK.A03(this.A00));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FxSourceIdentityWithDestinations(sourceIdentityId=");
        A0s.append(this.A00);
        A0s.append(", destinationIdentities=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass3VT(String str, List list) {
        AnonymousClass0wJ.A1O(str, list);
        this.A00 = str;
        this.A01 = list;
    }

    public AnonymousClass3VT() {
        this("", AnonymousClass0ZV.A00);
    }
}
