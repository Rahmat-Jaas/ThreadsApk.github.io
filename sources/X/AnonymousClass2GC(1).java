package X;

import java.util.HashMap;
import java.util.Set;

/* renamed from: X.2GC  reason: invalid class name */
public final class AnonymousClass2GC {
    public static final Object A00(AnonymousClass601 r14, C63893iY r15) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r15, r14);
        String A0D = C63893iY.A0D(r15, 0);
        C09120et A0X = C18190wL.A0X();
        C10300i6 A0F = C63913ic.A0F(r14);
        C04220Ms.A0C(A0F, "null cannot be cast to non-null type com.instagram.service.session.LoggedOutSession");
        C63533hk A02 = C63533hk.A02(A0F);
        C04220Ms.A06(A02);
        new AnonymousClass3LL();
        if (!(!C63173fJ.A05(AnonymousClass0TJ.A05, 2324151492723875342L))) {
            return false;
        }
        C08410dK r2 = A0X.A06;
        AnonymousClass0ZU r1 = r2.A00;
        if (((Set) r1.invoke()).contains(A0D) || A02.A0I(A0D) || !A02.A0H()) {
            return false;
        }
        C18240wQ.A1D(r2, AnonymousClass4WL.A03(A0D, (Set) r1.invoke()));
        C04220Ms.A0B(A0F, 0);
        AnonymousClass3LL.A00(A0F, "login_password_saving_eligible", "login_spi", "spi", "home_page", (String) null, (HashMap) null);
        return Boolean.valueOf(A1Z);
    }
}
