package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.78n  reason: invalid class name */
public final class AnonymousClass78n {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass78n r5 = (AnonymousClass78n) obj;
            if (this.A02 != r5.A02 || !this.A01.equals(r5.A01)) {
                return false;
            }
            String str = this.A00;
            String str2 = r5.A00;
            return str != null ? str.equals(str2) : str2 == null;
        }
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CaptionsState{availableTextLanguages=");
        A0s.append(this.A01);
        A0s.append(", selectedTextLanguage='");
        A0s.append(this.A00);
        A0s.append('\'');
        A0s.append(C18170wI.A00(545));
        A0s.append(this.A02);
        return C18190wL.A0o(A0s);
    }

    public AnonymousClass78n(String str, List list, boolean z) {
        this.A01 = C18200wM.A0s(list);
        this.A00 = str;
        this.A02 = z;
    }

    public AnonymousClass78n() {
        this((String) null, Collections.emptyList(), false);
    }
}
