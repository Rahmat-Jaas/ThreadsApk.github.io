package X;

import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.2Gc  reason: invalid class name and case insensitive filesystem */
public final class C33542Gc {
    public static final Object A00(AnonymousClass601 r20, C63893iY r21) {
        HashMap A0y;
        HashMap hashMap;
        Number number;
        AnonymousClass601 r9 = r20;
        C63893iY r2 = r21;
        boolean A1Z = AnonymousClass0wJ.A1Z(r2, r9);
        AnonymousClass3HX A01 = C63893iY.A01(r2, 0);
        Boolean valueOf = Boolean.valueOf(A1Z);
        Object A0B = C63893iY.A0B(r2, A1Z ? 1 : 0);
        A0B.getClass();
        C18240wQ.A1I(A0B);
        C109326jp A06 = C63893iY.A06(r2, 2);
        int A04 = AnonymousClass0wJ.A04(C63893iY.A0A(r2, 3));
        C10300i6 A0E = C63913ic.A0E(A01);
        C18200wM.A1R(A0E);
        UserSession userSession = (UserSession) A0E;
        long currentTimeMillis = System.currentTimeMillis();
        long j = (long) 1000;
        long j2 = ((long) A04) * j;
        AnonymousClass36K A042 = C63703i9.A04(userSession);
        if (A042 == null || (hashMap = A042.A00) == null || (number = (Number) hashMap.get(A0B)) == null) {
            AnonymousClass3VO A00 = AnonymousClass3VO.A00();
            A00.A02(valueOf, 0);
            C63893iY.A0F(r9, A00, A06, (Object) null, A1Z);
            if (A042 == null) {
                A042 = new AnonymousClass36K();
                A0y = AnonymousClass0wJ.A0y();
                A0y.put(A0B, Long.valueOf(currentTimeMillis));
                A042.A00 = A0y;
                C63703i9.A08(userSession, A042);
                return null;
            }
        } else {
            long longValue = currentTimeMillis - number.longValue();
            if (0 > j2 || j2 >= longValue) {
                AnonymousClass3VO A002 = AnonymousClass3VO.A00();
                A002.A02(false, 0);
                C63893iY.A0F(r9, A002, A06, Long.valueOf(longValue / j), A1Z);
                return null;
            }
            AnonymousClass3VO A003 = AnonymousClass3VO.A00();
            A003.A02(valueOf, 0);
            C63893iY.A0F(r9, A003, A06, Long.valueOf(longValue / j), A1Z);
        }
        A0y = A042.A00;
        if (A0y == null) {
            A0y = AnonymousClass0wJ.A0y();
        }
        A0y.put(A0B, Long.valueOf(currentTimeMillis));
        A042.A00 = A0y;
        C63703i9.A08(userSession, A042);
        return null;
    }
}
