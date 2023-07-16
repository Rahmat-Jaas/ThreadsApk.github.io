package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.service.session.UserSession;

/* renamed from: X.2HM  reason: invalid class name */
public final class AnonymousClass2HM {
    public static final Object A00(AnonymousClass601 r6, C63893iY r7) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r7, r6);
        Object A0B = C63893iY.A0B(r7, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.Number");
        int A04 = AnonymousClass0wJ.A04(A0B);
        int A042 = AnonymousClass0wJ.A04(C63893iY.A0C(r7, "null cannot be cast to non-null type kotlin.Number", A1Z ? 1 : 0));
        String A0D = C63893iY.A0D(r7, 2);
        boolean A01 = AnonymousClass3WF.A01(r7, 3);
        C10300i6 A0F = C63913ic.A0F(r6);
        C18200wM.A1R(A0F);
        C90715dy A00 = AnonymousClass6JQ.A00((UserSession) A0F);
        A00.flowStartIfNotOngoing(A00.generateFlowId(A04, A042), new UserFlowConfig(A0D, A01));
        return null;
    }
}
