package X;

import android.content.Context;
import java.security.InvalidParameterException;

/* renamed from: X.2tD  reason: invalid class name and case insensitive filesystem */
public final class C50572tD {
    public static final String A00(Context context, C309523p r4) {
        int i;
        boolean A1Z = AnonymousClass0wJ.A1Z(context, r4);
        int ordinal = r4.ordinal();
        if (ordinal == 0) {
            i = 2131827619;
        } else if (ordinal == A1Z) {
            i = 2131827618;
        } else if (ordinal == 2) {
            i = 2131827617;
        } else {
            throw new InvalidParameterException(AnonymousClass0wJ.A0t("Invalid sorting option in FollowFragment", r4));
        }
        return AnonymousClass0wJ.A0k(context, i);
    }
}
