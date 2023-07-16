package X;

import com.instagram.service.session.UserSession;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.6To  reason: invalid class name and case insensitive filesystem */
public final class C102036To {
    public static final C32165H8c A00(UserSession userSession, String str) {
        String A0o = C86154wM.A0o(Locale.US, "music/track/%s/beats/", Arrays.copyOf(new Object[]{str}, 1));
        H1T A0P = AnonymousClass0wJ.A0P(userSession);
        A0P.A0J(A0o);
        A0P.A0O("product", C40299Lc5.CLIPS_CAMERA_FORMAT_V2.A00());
        A0P.A0B(C94045tf.class, AnonymousClass71P.class);
        A0P.A0E(AnonymousClass006.A0Y);
        A0P.A0I(A0o);
        return A0P.A02();
    }
}
