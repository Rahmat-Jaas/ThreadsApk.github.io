package X;

import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50;

/* renamed from: X.7HK  reason: invalid class name */
public final class AnonymousClass7HK {
    public final UserSession A00;
    public final C04530Oa A01;
    public final C04530Oa A02;

    public final List A02(String str) {
        C04530Oa r0;
        C04220Ms.A0B(str, 0);
        if (str.equals("NUX")) {
            r0 = this.A01;
        } else if (str.equals("PUX")) {
            r0 = this.A02;
        } else {
            throw C18180wK.A0a(AnonymousClass00U.A0L(str, AnonymousClass000.A00(17)));
        }
        return (List) r0.getValue();
    }

    public final boolean A03() {
        return C63803iN.A0E(AnonymousClass0TJ.A06, this.A00, 36317470363029270L);
    }

    public final boolean A04() {
        return C63803iN.A0E(AnonymousClass0TJ.A06, this.A00, 36317470363619099L);
    }

    public final boolean A05() {
        return C63803iN.A0E(AnonymousClass0TJ.A05, this.A00, 36317470364143391L);
    }

    public AnonymousClass7HK(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AnonymousClass0OY.A02(new KtLambdaShape70S0100000_I2_50(this, 38));
        this.A02 = AnonymousClass0OY.A02(new KtLambdaShape70S0100000_I2_50(this, 39));
    }

    public static UserSession A00() {
        return AnonymousClass7Kz.A0J().A00;
    }

    public static boolean A01() {
        return C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass7Kz.A0J().A00, 36319274247132229L);
    }

    public AnonymousClass7HK() {
    }
}
