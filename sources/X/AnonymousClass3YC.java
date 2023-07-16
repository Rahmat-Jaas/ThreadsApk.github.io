package X;

import com.instagram.service.session.UserSession;
import java.util.Set;

/* renamed from: X.3YC  reason: invalid class name */
public final class AnonymousClass3YC {
    public static final AnonymousClass3YC A03;
    public final AnonymousClass0IB A00;
    public final C09810gi A01;
    public final AnonymousClass2T4 A02;

    static {
        C09810gi r3 = C09820gj.A00;
        AnonymousClass0IB A002 = C10450iM.A00();
        C04220Ms.A06(A002);
        A03 = new AnonymousClass3YC(A002, r3, new AnonymousClass2T4());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3YC() {
        /*
            r3 = this;
            X.0gi r2 = X.C09820gj.A00
            X.0IB r1 = X.C10450iM.A00()
            X.C04220Ms.A06(r1)
            X.2T4 r0 = new X.2T4
            r0.<init>()
            r3.<init>(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YC.<init>():void");
    }

    public final AnonymousClass3TF A00(UserSession userSession) {
        UserSession userSession2 = userSession;
        AnonymousClass0TJ A0J = C18180wK.A0J(userSession2);
        if (!C63803iN.A0E(A0J, userSession2, 2342156094413014321L)) {
            return null;
        }
        Class<AnonymousClass3TF> cls = AnonymousClass3TF.class;
        AnonymousClass3TF r1 = (AnonymousClass3TF) userSession2.A00(cls);
        long currentTimeMillis = System.currentTimeMillis();
        if (r1 != null && r1.A00 >= currentTimeMillis) {
            return r1;
        }
        boolean A0E = C63803iN.A0E(A0J, userSession2, 36313085200762174L);
        String A0C = C63803iN.A0C(A0J, userSession2, 36876035152805979L);
        AnonymousClass0IB r3 = this.A00;
        Set A002 = AnonymousClass3O5.A00(r3, A0C);
        Set A012 = AnonymousClass3O5.A01(r3, C63803iN.A0C(A0J, userSession2, 36876035152871516L));
        Set A013 = AnonymousClass3O5.A01(r3, C63803iN.A0C(A0J, userSession2, 36876035153854561L));
        String A0C2 = C63803iN.A0C(A0J, userSession2, 36876035153592415L);
        AnonymousClass0IB A003 = C10450iM.A00();
        C04220Ms.A06(A003);
        Set A004 = AnonymousClass3O5.A00(A003, A0C2);
        Set A014 = AnonymousClass3O5.A01(r3, C63803iN.A0C(A0J, userSession2, 36876035153657952L));
        Set A015 = AnonymousClass3O5.A01(r3, C63803iN.A0C(A0J, userSession2, 36876035154051170L));
        Set A005 = AnonymousClass3O5.A00(r3, C63803iN.A0C(A0J, userSession2, 36876035153461341L));
        Set A016 = AnonymousClass3O5.A01(r3, C63803iN.A0C(A0J, userSession2, 36876035153526878L));
        Set A017 = AnonymousClass3O5.A01(r3, C63803iN.A0C(A0J, userSession2, 36876035154116707L));
        Set A018 = AnonymousClass4WL.A01(A005, AnonymousClass4WL.A01(A004, A002));
        Set A019 = AnonymousClass4WL.A01(A016, AnonymousClass4WL.A01(A014, A012));
        Set A0110 = AnonymousClass4WL.A01(A017, AnonymousClass4WL.A01(A015, A013));
        if (A018.isEmpty()) {
            return null;
        }
        if (A0110.isEmpty() && A019.isEmpty()) {
            return null;
        }
        AnonymousClass3TF r14 = new AnonymousClass3TF(A018, A019, A0110, System.currentTimeMillis() + 600000, A0E);
        userSession2.A04(cls, r14);
        return r14;
    }

    public AnonymousClass3YC(AnonymousClass0IB r1, C09810gi r2, AnonymousClass2T4 r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
