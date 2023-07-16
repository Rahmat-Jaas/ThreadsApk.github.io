package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.Calendar;

/* renamed from: X.2HU  reason: invalid class name */
public final class AnonymousClass2HU {
    public static final Object A00(AnonymousClass601 r11, C63893iY r12) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r11);
        Object A0B = C63893iY.A0B(r12, A1Z ? 1 : 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.Number");
        long A08 = C18190wL.A08(A0B);
        int A04 = AnonymousClass0wJ.A04(C63893iY.A0C(r12, "null cannot be cast to non-null type kotlin.Number", 2));
        C10300i6 A0F = C63913ic.A0F(r11);
        C18200wM.A1R(A0F);
        UserSession userSession = (UserSession) A0F;
        FragmentActivity A05 = C63913ic.A05(r11);
        Calendar instance = Calendar.getInstance();
        C04220Ms.A06(instance);
        instance.setTimeInMillis(A08 * ((long) 1000));
        int A07 = C18240wQ.A07(instance);
        AnonymousClass06E A00 = AnonymousClass06E.A00(A05);
        C04220Ms.A0B(userSession, 0);
        H1T A0O = AnonymousClass0wJ.A0O(userSession);
        C18190wL.A1O(A0O, "age_platform/age_verification/start/", instance.get(A1Z), instance.get(2) + 1, A07);
        A0O.A0O("product_surface", String.valueOf(A04));
        C31155GhB.A01(A05, A00, AnonymousClass0wJ.A0S(A0O));
        return null;
    }
}
