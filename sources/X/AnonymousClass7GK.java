package X;

import kotlin.coroutines.jvm.internal.KtSLambdaShape8S0401000_I2;

/* renamed from: X.7GK  reason: invalid class name */
public final class AnonymousClass7GK {
    public static final AnonymousClass7GK A00 = new AnonymousClass7GK();

    public static /* synthetic */ void A00(GDL gdl, C146198lo r6) {
        AnonymousClass0gQ BQy = C18250wR.A0J((AnonymousClass0gW) null, 3).BQy(460, 3);
        GDL gdl2 = gdl;
        C04220Ms.A0B(gdl, 0);
        C146198lo r1 = r6;
        if (r6 != null) {
            r6.onStart();
        }
        C31155GhB.A06(BQy, new KtSLambdaShape8S0401000_I2(r1, gdl2, BQy, (C146958n9) null, 1));
    }

    public static final void A01(C146198lo r2, Object obj) {
        if (!(obj instanceof AnonymousClass0OW)) {
            C63643hy.A04(new C1360481d(r2, (String) obj));
        }
        Throwable A002 = AnonymousClass0OV.A00(obj);
        if (A002 == null) {
            return;
        }
        if (A002 instanceof RuntimeException) {
            throw A002;
        } else if (A002 instanceof Exception) {
            C63643hy.A04(new C1360581e(r2, A002));
        }
    }
}
