package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.3I9  reason: invalid class name */
public final class AnonymousClass3I9 {
    public final String A00;
    public final Map A01;
    public final Set A02;
    public final Set A03;

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass3I9) {
            AnonymousClass3I9 r5 = (AnonymousClass3I9) obj;
            if (C04220Ms.A0I(this.A00, r5.A00) && C04220Ms.A0I(this.A01, r5.A01) && C04220Ms.A0I(this.A02, r5.A02)) {
                Set set2 = this.A03;
                if (set2 == null || (set = r5.A03) == null) {
                    return true;
                }
                return set2.equals(set);
            }
        }
        return false;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A02, AnonymousClass0wJ.A05(this.A01, C18180wK.A03(this.A00)));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("TableInfo{name='");
        A0s.append(this.A00);
        A0s.append("', columns=");
        A0s.append(this.A01);
        A0s.append(", foreignKeys=");
        A0s.append(this.A02);
        A0s.append(", indices=");
        A0s.append(this.A03);
        return C18190wL.A0o(A0s);
    }

    public AnonymousClass3I9(String str, Map map, Set set, Set set2) {
        this.A00 = str;
        this.A01 = map;
        this.A02 = set;
        this.A03 = set2;
    }
}
