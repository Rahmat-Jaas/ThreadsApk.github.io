package X;

import com.instagram.service.session.UserSession;
import java.io.File;

/* renamed from: X.0Os  reason: invalid class name and case insensitive filesystem */
public final class C04690Os extends C40110LNv {
    public static final C04700Ot A02 = new C04700Ot();
    public final UserSession A00;
    public final C04750Oy A01;

    public static final C04690Os A00(UserSession userSession, File file) {
        return A02.A02(userSession, file);
    }

    public C04690Os(MMo mMo, UserSession userSession, C04750Oy r3) {
        super(mMo);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public /* synthetic */ C04690Os(MMo mMo, UserSession userSession) {
        this(mMo, userSession, new C04750Oy());
    }
}
