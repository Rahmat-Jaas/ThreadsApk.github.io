package X;

import com.instagram.service.session.UserSession;
import java.util.List;

/* renamed from: X.57I  reason: invalid class name */
public final class AnonymousClass57I extends C62793ak {
    public final AnonymousClass37V A00;
    public final C110926mV A01;
    public final UserSession A02;
    public final List A03;

    public /* synthetic */ AnonymousClass57I(AnonymousClass37V r6, UserSession userSession, boolean z) {
        C110926mV A002 = C33462Fu.A00(userSession);
        C04220Ms.A0B(A002, 4);
        this.A02 = userSession;
        this.A00 = r6;
        this.A01 = A002;
        int i = 3;
        Integer[] numArr = new Integer[3];
        if (z) {
            C86164wN.A1O(numArr, 1, 0);
            C86164wN.A1O(numArr, 2, 1);
        } else {
            C86164wN.A1O(numArr, 10, 0);
            C86164wN.A1O(numArr, 20, 1);
            i = 30;
        }
        C86164wN.A1O(numArr, i, 2);
        this.A03 = C06750aI.A17(numArr);
    }
}
