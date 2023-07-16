package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Oh  reason: invalid class name and case insensitive filesystem */
public final class C100696Oh {
    public static final Object A00(AnonymousClass601 r7, C63893iY r8) {
        UserFlowLogger A00;
        String valueOf;
        UserSession userSession;
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r7);
        Object A0B = C63893iY.A0B(r8, 0);
        A0B.getClass();
        int A04 = AnonymousClass0wJ.A04(A0B);
        int A042 = AnonymousClass0wJ.A04(C63893iY.A0C(r8, "null cannot be cast to non-null type kotlin.Number", A1Z ? 1 : 0));
        Object A09 = C63893iY.A09(r8);
        C04220Ms.A0C(A09, C18170wI.A00(442));
        Map map = (Map) A09;
        C10300i6 A0F = C63913ic.A0F(r7);
        if (!(A0F instanceof UserSession) || (userSession = (UserSession) A0F) == null) {
            A00 = AnonymousClass6JR.A00();
        } else {
            A00 = AnonymousClass6JQ.A00(userSession);
        }
        if (map != null) {
            long generateFlowId = A00.generateFlowId(A04, A042);
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                Object value = A0o.getValue();
                if (value instanceof Number) {
                    A00.flowAnnotate(generateFlowId, C18200wM.A0p(A0o), AnonymousClass0wJ.A04(A0o.getValue()));
                } else {
                    boolean z = value instanceof Boolean;
                    String A0p = C18200wM.A0p(A0o);
                    Object value2 = A0o.getValue();
                    if (z) {
                        A00.flowAnnotate(generateFlowId, A0p, AnonymousClass0wJ.A1X(value2));
                    } else {
                        if (value2 instanceof Number) {
                            valueOf = value2.toString();
                        } else {
                            valueOf = String.valueOf(value2);
                        }
                        A00.flowAnnotate(generateFlowId, A0p, valueOf);
                    }
                }
            }
        }
        return null;
    }
}
