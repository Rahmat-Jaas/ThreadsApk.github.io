package X;

import android.text.TextUtils;
import com.instagram.quickpromotion.model.FilterType;
import java.util.List;

/* renamed from: X.3HP  reason: invalid class name */
public final class AnonymousClass3HP {
    public FilterType A00 = FilterType.A0u;
    public C58473Fu A01;
    public String A02;
    public List A03;

    public final C58473Fu A00(String str) {
        List<C58473Fu> list = this.A03;
        if (list == null) {
            return null;
        }
        for (C58473Fu r1 : list) {
            if (str.equals(r1.A02)) {
                return r1;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("{ QPFilter: value: ");
        A0s.append(this.A01);
        A0s.append(", filter_type:");
        A0s.append(this.A00);
        A0s.append(", unknown_action:");
        A0s.append(this.A02);
        A0s.append(", extra_data: ");
        if (C18200wM.A0m(this.A03, A0s) == null) {
            return null;
        }
        return AnonymousClass00U.A0A(TextUtils.join(" : ", this.A03), '}');
    }
}
