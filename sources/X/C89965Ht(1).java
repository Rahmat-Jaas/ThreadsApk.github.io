package X;

import java.util.List;

/* renamed from: X.5Ht  reason: invalid class name and case insensitive filesystem */
public final class C89965Ht extends AnonymousClass0Sf {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89965Ht) {
                C89965Ht r5 = (C89965Ht) obj;
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
        StringBuilder A0s = C18190wL.A0s("ViewState(suggestedAudioTracks=");
        A0s.append(this.A01);
        A0s.append(", preSelectedAudio=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public C89965Ht(List list, List list2) {
        AnonymousClass0wJ.A1O(list, list2);
        this.A01 = list;
        this.A00 = list2;
    }
}
