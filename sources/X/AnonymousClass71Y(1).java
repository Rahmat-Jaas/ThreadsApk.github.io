package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.71Y  reason: invalid class name */
public final class AnonymousClass71Y {
    public static final String A00(Context context, Integer num) {
        int i;
        if (num == AnonymousClass006.A00) {
            i = 2131836047;
        } else if (num == AnonymousClass006.A01) {
            i = 2131836045;
        } else if (num != AnonymousClass006.A0C) {
            return "";
        } else {
            i = 2131836046;
        }
        return AnonymousClass0wJ.A0k(context, i);
    }

    public static final String A01(User user, Integer num) {
        C146558mR A0A;
        C146558mR A09;
        if (num == AnonymousClass006.A00) {
            A09 = user.A0B();
        } else if (num == AnonymousClass006.A01) {
            A09 = user.A09();
        } else if (num != AnonymousClass006.A0C || user.A0A() == null || (A0A = user.A0A()) == null) {
            return "";
        } else {
            A0A.B08();
            return "";
        }
        if (A09 != null) {
            return A09.B08();
        }
        return "";
    }
}
