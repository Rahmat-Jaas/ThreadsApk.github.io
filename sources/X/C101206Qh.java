package X;

import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape22S0101000_I2_1;
import kotlin.jvm.internal.KtLambdaShape3S1201000_I2;

/* renamed from: X.6Qh  reason: invalid class name and case insensitive filesystem */
public final class C101206Qh {
    public static final void A00(C147188nY r10, UserSession userSession, String str, AnonymousClass0YP r13, int i) {
        UserSession userSession2 = userSession;
        String str2 = str;
        boolean A1Z = AnonymousClass0wJ.A1Z(str, userSession);
        AnonymousClass0YP r6 = r13;
        C04220Ms.A0B(r13, 2);
        r10.Cvd(108153909);
        AnonymousClass534 r4 = C1189973c.A00;
        boolean A0y = C147188nY.A0y(r10, str);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r10;
        Object A13 = r2.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A13 = AnonymousClass7W3.A0Q(r2, str, 12);
        }
        int i2 = i;
        AnonymousClass7JR.A05(r10, new KtLambdaShape22S0101000_I2_1(r13, i, A1Z ? 1 : 0), new AnonymousClass7DS[]{AnonymousClass7DS.A00(r4, new AnonymousClass7q3(AnonymousClass7W3.A09(r2, A13, false)), A1Z), AnonymousClass7DS.A00(AnonymousClass7CZ.A00, userSession, A1Z)}, 1690103669);
        C147178nW AKE = r10.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S1201000_I2((Object) r6, (Object) userSession2, str2, i2, 12));
        }
    }
}
