package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.2H0  reason: invalid class name */
public final class AnonymousClass2H0 {
    public static final Object A00(AnonymousClass601 r11, C63893iY r12) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r11);
        FragmentActivity A05 = C63913ic.A05(r11);
        C10300i6 A0F = C63913ic.A0F(r11);
        C18200wM.A1R(A0F);
        Object A0B = C63893iY.A0B(r12, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A0B;
        String str2 = (String) C63893iY.A0C(r12, "null cannot be cast to non-null type kotlin.String", A1Z ? 1 : 0);
        String str3 = (String) C63893iY.A0C(r12, "null cannot be cast to non-null type kotlin.String", 2);
        C37032Jj9 A0L = C18210wN.A0L(A0F);
        A0L.A01();
        A0L.A0G = new AnonymousClass17a().A01();
        C37383Jqm A00 = A0L.A00();
        AnonymousClass3WJ.A02();
        C04220Ms.A0B(A0F, 0);
        C04220Ms.A0B(str, A1Z);
        C18180wK.A1P(str2, 2, str3);
        C22551Yn r2 = new C22551Yn();
        Bundle A06 = C18180wK.A06();
        C18180wK.A0w(A06, A0F);
        A06.putString("creator_user_id", str);
        A06.putString("recipient_user_id", str2);
        A06.putString("origin", str3);
        r2.setArguments(A06);
        return C37383Jqm.A00(A05, r2, A00);
    }
}
