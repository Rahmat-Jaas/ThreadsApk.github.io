package X;

import android.text.TextUtils;
import java.util.List;

/* renamed from: X.3FV  reason: invalid class name */
public final class AnonymousClass3FV {
    public String A00;
    public List A01;
    public List A02;

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("{ QPClause : clause_type: ");
        A0s.append(this.A00);
        A0s.append(", clauses : ");
        if (C18200wM.A0m(this.A01, A0s) == null) {
            return "null";
        }
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(TextUtils.join(" : ", this.A01));
        A0r.append(", filters : ");
        if (C18200wM.A0m(this.A02, A0r) != null) {
            return AnonymousClass00U.A0L(TextUtils.join(" : ", this.A02), "}");
        }
        return "null";
    }
}
