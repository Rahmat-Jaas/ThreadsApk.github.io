package X;

import com.instagram.service.session.UserSession;
import java.io.File;
import java.io.InputStream;

/* renamed from: X.0Ou  reason: invalid class name and case insensitive filesystem */
public final class C04710Ou extends MIS {
    public final UserSession A00;

    public C04710Ou(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* renamed from: A0C */
    public final C04690Os A08(String str) {
        C04220Ms.A0B(str, 0);
        return C04700Ot.A00(C18987Aon.A00.A08(str), this.A00);
    }

    /* renamed from: A0A */
    public final C04690Os A06(File file) {
        return C04700Ot.A00(C18987Aon.A00.A06(file), this.A00);
    }

    /* renamed from: A0B */
    public final C04690Os A07(InputStream inputStream) {
        return C04700Ot.A00(C18987Aon.A00.A07(inputStream), this.A00);
    }

    /* renamed from: A0D */
    public final C04690Os A09(byte[] bArr) {
        return C04700Ot.A00(C18987Aon.A00.A09(bArr), this.A00);
    }
}
