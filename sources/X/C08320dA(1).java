package X;

import com.instagram.service.session.UserSession;
import java.io.File;

/* renamed from: X.0dA  reason: invalid class name and case insensitive filesystem */
public final class C08320dA {
    public static C32165H8c A00(UserSession userSession, File file) {
        H1T h1t = new H1T(userSession);
        h1t.A0F(AnonymousClass006.A0N);
        h1t.A0J("loom/fetch_config/");
        h1t.A09(new EAc(AnonymousClass9Jn.A00(), file));
        return h1t.A02();
    }

    public static C32165H8c A01(UserSession userSession, File file, String str) {
        H1T h1t = new H1T(userSession);
        h1t.A0F(AnonymousClass006.A01);
        h1t.A0J("loom/upload_trace/");
        h1t.A0O("type", "loom");
        h1t.A0A(file);
        h1t.A0O(AnonymousClass00T.A00(0, 9, 90), str);
        h1t.A0B(C85814vo.class, AnonymousClass3Za.class);
        h1t.A0U("file");
        return h1t.A02();
    }
}
