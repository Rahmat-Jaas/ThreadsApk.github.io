package X;

import com.instagram.service.session.UserSession;
import java.io.IOException;

/* renamed from: X.3Qf  reason: invalid class name and case insensitive filesystem */
public final class C60713Qf {
    public static final AnonymousClass3LX A00 = new AnonymousClass3LX();

    public static MMo A00(AnonymousClass601 r2, String str) {
        MMo A08;
        C04220Ms.A0B(r2, 0);
        C10300i6 A0F = C63913ic.A0F(r2);
        try {
            if (A0F instanceof UserSession) {
                A08 = new C04710Ou(C05030Qo.A02(A0F)).A08(str);
            } else if (C63913ic.A08(r2).A00) {
                A08 = C04740Ox.A00.A08(str);
            } else {
                A08 = C18987Aon.A00.A08(str);
            }
            A08.A0g();
            return A08;
        } catch (IOException e) {
            AnonymousClass0LU.A0E("IgBloksInitializer", "Error building delegate parser", e);
            throw new RuntimeException(e);
        }
    }
}
