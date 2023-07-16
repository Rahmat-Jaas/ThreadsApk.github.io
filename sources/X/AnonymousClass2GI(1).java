package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2GI  reason: invalid class name */
public final class AnonymousClass2GI {
    public static final Object A00(AnonymousClass601 r13, C63893iY r14) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r14, r13);
        Object A0B = C63893iY.A0B(r14, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        Object A0B2 = C63893iY.A0B(r14, A1Z ? 1 : 0);
        A0B2.getClass();
        C04220Ms.A0C(A0B2, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A0B2;
        String str2 = (String) C63893iY.A0C(r14, "null cannot be cast to non-null type kotlin.String", 2);
        C109326jp A06 = C63893iY.A06(r14, 3);
        C09120et A0X = C18190wL.A0X();
        C10300i6 A0F = C63913ic.A0F(r13);
        C63533hk A02 = C63533hk.A02(A0F);
        C04220Ms.A06(A02);
        List A08 = A02.A08(A0F);
        if (!(A08 instanceof Collection) || !A08.isEmpty()) {
            Iterator it = A08.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C18250wR.A0Q(it).A05.equals(str)) {
                        A02.A0A(C63913ic.A0A(r13), A0F, AnonymousClass006.A0C, str, "BKBloksActionCaaLoginRemoveProfileImpl");
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        List A00 = AnonymousClass3WX.A00();
        if (!(A00 instanceof Collection) || !A00.isEmpty()) {
            Iterator it2 = A00.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((AnonymousClass3Uc) it2.next()).A00().equals(str)) {
                    List A002 = AnonymousClass3WX.A00();
                    Iterator it3 = A002.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((AnonymousClass3Uc) it3.next()).A00().equals(str)) {
                                it3.remove();
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    AnonymousClass3WX.A02(A002);
                }
            }
        }
        if (!A0X.A0E().contains(str)) {
            A0X.A0G(AnonymousClass4WL.A03(str, A0X.A0E()));
        }
        if (str2.equals("local_auth")) {
            C08410dK r2 = A0X.A05;
            AnonymousClass0ZU r1 = r2.A00;
            if (!((Set) r1.invoke()).contains(str)) {
                C18240wQ.A1D(r2, AnonymousClass4WL.A03(str, (Set) r1.invoke()));
            }
        }
        C63893iY.A0F(r13, AnonymousClass3VO.A00(), A06, A0B, 0);
        return null;
    }
}
