package X;

import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape21S0101000_I2;
import kotlin.jvm.internal.KtLambdaShape3S1201000_I2;

/* renamed from: X.7BU  reason: invalid class name */
public final class AnonymousClass7BU {
    public static final void A00(C147188nY r11, IgFragmentActivity igFragmentActivity, String str, AnonymousClass0YP r14, int i) {
        int i2;
        IgFragmentActivity igFragmentActivity2 = igFragmentActivity;
        String str2 = str;
        boolean A1Z = AnonymousClass0wJ.A1Z(igFragmentActivity, str);
        AnonymousClass0YP r6 = r14;
        C04220Ms.A0B(r14, 2);
        r11.Cvd(1373518617);
        int i3 = i;
        if ((i & 112) == 0) {
            i2 = C147188nY.A0G(r11, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 896) == 0) {
            i2 |= C147188nY.A0B(r11, r14);
        }
        if ((i2 & 721) != 144 || !r11.BCM()) {
            AnonymousClass534 r3 = C1189973c.A00;
            boolean A0y = C147188nY.A0y(r11, str);
            AnonymousClass7W3 r2 = (AnonymousClass7W3) r11;
            Object A13 = r2.A13();
            if (A0y || A13 == AnonymousClass7GN.A00) {
                A13 = AnonymousClass7W3.A0Q(r2, str, 3);
            }
            AnonymousClass7JR.A05(r11, new KtLambdaShape21S0101000_I2(r14, i2, 18), AnonymousClass7DS.A01(r3, new C130367pq(AnonymousClass7W3.A09(r2, A13, false)), A1Z), 834059865);
        } else {
            r11.CuJ();
        }
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S1201000_I2((Object) r6, (Object) igFragmentActivity2, str2, i3, 0));
        }
    }

    public static final void A01(C147188nY r8, IgFragmentActivity igFragmentActivity, String str, AnonymousClass0YP r11, int i) {
        IgFragmentActivity igFragmentActivity2 = igFragmentActivity;
        String str2 = str;
        boolean A1Z = AnonymousClass0wJ.A1Z(igFragmentActivity, str);
        AnonymousClass0YP r3 = r11;
        C04220Ms.A0B(r11, 2);
        r8.Cvd(10559270);
        AnonymousClass7W3 r1 = (AnonymousClass7W3) r8;
        Object A13 = r1.A13();
        if (A13 == AnonymousClass7GN.A00) {
            A13 = C05030Qo.A02(C18200wM.A0W(igFragmentActivity));
            r1.A14(A13);
        }
        int i2 = i;
        A02(r8, (UserSession) A13, str, r11, ((i >> 3) & 14) | 64 | (i & 896));
        C147178nW AKE = r8.AKE();
        if (AKE != null) {
            ((AnonymousClass7WO) AKE).A06 = new KtLambdaShape3S1201000_I2((Object) r3, (Object) igFragmentActivity2, str2, i2, A1Z ? 1 : 0);
        }
    }

    public static final void A02(C147188nY r11, UserSession userSession, String str, AnonymousClass0YP r14, int i) {
        UserSession userSession2 = userSession;
        String str2 = str;
        boolean A1Z = AnonymousClass0wJ.A1Z(str, userSession);
        AnonymousClass0YP r6 = r14;
        C04220Ms.A0B(r14, 2);
        r11.Cvd(344963152);
        AnonymousClass534 r4 = C1189973c.A00;
        boolean A0y = C147188nY.A0y(r11, str);
        AnonymousClass7W3 r2 = (AnonymousClass7W3) r11;
        Object A13 = r2.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A13 = AnonymousClass7W3.A0Q(r2, str, 4);
        }
        int i2 = i;
        AnonymousClass7JR.A05(r11, new KtLambdaShape21S0101000_I2(r14, i, 20), new AnonymousClass7DS[]{AnonymousClass7DS.A00(r4, new C130367pq(AnonymousClass7W3.A09(r2, A13, false)), A1Z), AnonymousClass7DS.A00(C1190073d.A00, new C133117v9(str), A1Z), AnonymousClass7DS.A00(AnonymousClass7CZ.A00, userSession, A1Z)}, 748886928);
        C147178nW AKE = r11.AKE();
        if (AKE != null) {
            AKE.D9d(new KtLambdaShape3S1201000_I2((Object) r6, (Object) userSession2, str2, i2, 2));
        }
    }
}
