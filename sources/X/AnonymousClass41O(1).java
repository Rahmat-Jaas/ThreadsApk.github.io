package X;

import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.41O  reason: invalid class name */
public final class AnonymousClass41O implements C41836MeS, Serializable {
    public final List A00;

    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.A00;
            if (i >= list.size()) {
                return true;
            }
            if (!((C41836MeS) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass41O) {
            return this.A00.equals(((AnonymousClass41O) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.A00;
        StringBuilder A0s = C18190wL.A0s("Predicates.");
        A0s.append("and");
        A0s.append('(');
        boolean z = true;
        for (Object next : list) {
            if (!z) {
                A0s.append(BasicHeaderValueParser.ELEM_DELIMITER);
            }
            A0s.append(next);
            z = false;
        }
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass41O(List list) {
        this.A00 = list;
    }
}
