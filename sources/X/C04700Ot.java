package X;

import com.instagram.service.session.UserSession;
import java.io.File;
import java.io.InputStream;

/* renamed from: X.0Ot  reason: invalid class name and case insensitive filesystem */
public final class C04700Ot {
    public static final C04690Os A00(MMo mMo, UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return new C04690Os(mMo, userSession);
    }

    public final C04690Os A02(UserSession userSession, File file) {
        C04220Ms.A0B(userSession, 0);
        C04220Ms.A0B(file, 1);
        return A01(C18987Aon.A00.A06(file), userSession);
    }

    public final C04690Os A03(UserSession userSession, InputStream inputStream) {
        C04220Ms.A0B(userSession, 0);
        C04220Ms.A0B(inputStream, 1);
        return A01(C18987Aon.A00.A07(inputStream), userSession);
    }

    public final C04690Os A04(UserSession userSession, String str) {
        C04220Ms.A0B(userSession, 0);
        C04220Ms.A0B(str, 1);
        return A01(C18987Aon.A00.A08(str), userSession);
    }

    public static final C04690Os A01(MMo mMo, UserSession userSession) {
        C04690Os r0 = new C04690Os(mMo, userSession);
        r0.A0g();
        return r0;
    }

    public final C04690Os A05(UserSession userSession, byte[] bArr) {
        return A01(C18987Aon.A00.A09(bArr), userSession);
    }
}
