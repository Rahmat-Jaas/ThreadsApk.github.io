package X;

import com.facebook.login.LoginClient$Request;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.3XS  reason: invalid class name */
public final class AnonymousClass3XS {
    public static volatile AnonymousClass3XS A01;
    public LoginClient$Request A00;

    public static LoginClient$Request A00(String str, Collection collection) {
        HashSet A0u;
        String str2 = str;
        boolean A1W = AnonymousClass0wJ.A1W(C62603aO.A00(str));
        if (collection != null) {
            A0u = new HashSet(collection);
        } else {
            A0u = C18200wM.A0u();
        }
        return new LoginClient$Request(C60943Re.A02, C18180wK.A0e(), str2, Collections.unmodifiableSet(A0u), A1W);
    }

    public static AnonymousClass3XS A01() {
        if (A01 == null) {
            synchronized (AnonymousClass3XS.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass3XS();
                }
            }
        }
        return A01;
    }
}
