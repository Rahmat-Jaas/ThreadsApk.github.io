package X;

import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0321000_I2;

/* renamed from: X.3Qh  reason: invalid class name and case insensitive filesystem */
public final class C60733Qh {
    public static final C04530Oa A00 = AnonymousClass0OY.A02(C74824bD.A00);

    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        UserSession userSession;
        boolean A1Y = AnonymousClass0wJ.A1Y(r9, r8);
        boolean A01 = AnonymousClass3WF.A01(r9, A1Y ? 1 : 0);
        AnonymousClass3HX A0D = C63913ic.A0D(r8);
        C10300i6 A0E = C63913ic.A0E(A0D);
        if (!(A0E instanceof UserSession) || (userSession = (UserSession) A0E) == null) {
            throw C18190wL.A0a("User session must not be null");
        }
        AnonymousClass3ZL A03 = AnonymousClass3Zu.A03(userSession);
        boolean A08 = A03.A08();
        A03.A05(A01);
        C38039KHq A002 = AnonymousClass3LY.A00(userSession);
        Integer num = AnonymousClass006.A00;
        A002.A04(new E6U(num, num, A01, A1Y));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0321000_I2(A03, A0D, userSession, (C146958n9) null, A1Y, A08, A01), (C83224qz) A00.getValue(), 3);
        return null;
    }
}
