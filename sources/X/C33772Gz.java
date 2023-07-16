package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCallbackShape48S0400000_1_I2;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

/* renamed from: X.2Gz  reason: invalid class name and case insensitive filesystem */
public final class C33772Gz {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        C10300i6 A0F = C63913ic.A0F(r9);
        C18200wM.A1R(A0F);
        UserSession userSession = (UserSession) A0F;
        FragmentActivity A05 = C63913ic.A05(r9);
        C11630kW A0A = C63913ic.A0A(r9);
        Object A0B = C63893iY.A0B(r10, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        Object A0B2 = C63893iY.A0B(r10, A1Z ? 1 : 0);
        A0B2.getClass();
        C04220Ms.A0C(A0B2, "null cannot be cast to non-null type kotlin.String");
        C18330wh A00 = C18330wh.A00(A05);
        C13950oZ.A00(A00);
        AnonymousClass2NZ.A00(new IDxCallbackShape48S0400000_1_I2(A05, A0A, userSession, A00, 0), userSession, (String) A0B);
        return Unit.A00;
    }
}
