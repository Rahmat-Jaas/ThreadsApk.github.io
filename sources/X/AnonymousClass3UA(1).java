package X;

import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S1601000_I2;

/* renamed from: X.3UA  reason: invalid class name */
public final class AnonymousClass3UA {
    public static final AnonymousClass3UA A00 = new AnonymousClass3UA();
    public static final C04530Oa A01 = AnonymousClass0OY.A02(C74814bC.A00);

    public final Object A00(AnonymousClass601 r11, C63893iY r12) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r12, r11);
        C10300i6 A0F = C63913ic.A0F(r11);
        C18200wM.A1R(A0F);
        List list = r12.A00;
        Object obj = list.get(0);
        C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        List list2 = (List) obj;
        Object obj2 = list.get(A1Z ? 1 : 0);
        C18240wQ.A1I(obj2);
        list2.isEmpty();
        C109326jp A06 = C63893iY.A06(r12, 2);
        C109326jp A062 = C63893iY.A06(r12, 3);
        C62523aB.A00();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S1601000_I2(r11, A06, A062, (UserSession) A0F, (String) obj2, list2, (C146958n9) null), (C83224qz) A01.getValue(), 3);
        return null;
    }
}
