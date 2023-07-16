package X;

import java.util.List;

/* renamed from: X.6ty  reason: invalid class name and case insensitive filesystem */
public final class C114836ty {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114836ty) {
                C114836ty r5 = (C114836ty) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, C18210wN.A04(this.A01));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("SourceAndDestinationConfig(sources=");
        A0s.append(this.A01);
        A0s.append(", destinations=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public C114836ty(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
