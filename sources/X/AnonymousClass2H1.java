package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxCListenerShape217S0100000_1_I2;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

/* renamed from: X.2H1  reason: invalid class name */
public final class AnonymousClass2H1 {
    public static final Object A00(AnonymousClass601 r7, C63893iY r8) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r7);
        Object A0B = C63893iY.A0B(r8, 0);
        A0B.getClass();
        C18240wQ.A1I(A0B);
        FragmentActivity A05 = C63913ic.A05(r7);
        C10300i6 A0F = C63913ic.A0F(r7);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("creator_user_id", A0B);
        C63743iE A02 = C63743iE.A02("com.instagram.user_pay.fan_club.screens.fan_onboarding_welcome", A0y);
        IgBloksScreenConfig A0N = C18190wL.A0N(A0F);
        A0N.A0e = A1Z;
        A0N.A0S = "";
        AnonymousClass1c8 A022 = C62853b1.A02(A0N, A02);
        C25828Dsm A0W = C18190wL.A0W(A05);
        A0W.A02 = "In-App Purchase";
        A0W.A0p("Purchase successful?");
        A0W.A0c(C18250wR.A0E(A05, A022, A0F, 6), "Yes");
        A0W.A0b(new IDxCListenerShape217S0100000_1_I2(A05, 9), "No");
        AnonymousClass0wJ.A1K(A0W);
        return null;
    }
}
