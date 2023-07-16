package X;

import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Oi  reason: invalid class name and case insensitive filesystem */
public final class C100706Oi {
    public static final Object A00(AnonymousClass601 r8, C63893iY r9) {
        UserFlowLogger A00;
        String valueOf;
        UserSession userSession;
        boolean A1Z = AnonymousClass0wJ.A1Z(r9, r8);
        Object A0B = C63893iY.A0B(r9, 0);
        A0B.getClass();
        int A04 = AnonymousClass0wJ.A04(A0B);
        int A042 = AnonymousClass0wJ.A04(C63893iY.A0C(r9, "null cannot be cast to non-null type kotlin.Number", A1Z ? 1 : 0));
        Object A09 = C63893iY.A09(r9);
        C18240wQ.A1I(A09);
        String str = (String) A09;
        Map map = (Map) C63893iY.A0B(r9, 3);
        C10300i6 A0F = C63913ic.A0F(r8);
        if (!(A0F instanceof UserSession) || (userSession = (UserSession) A0F) == null) {
            A00 = AnonymousClass6JR.A00();
        } else {
            A00 = AnonymousClass6JQ.A00(userSession);
        }
        long generateFlowId = A00.generateFlowId(A04, A042);
        if (map == null) {
            A00.flowMarkPoint(generateFlowId, str);
            return null;
        }
        PointEditor markPointWithEditor = A00.markPointWithEditor(generateFlowId, str);
        Iterator A0z = AnonymousClass0wJ.A0z(map);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            Object value = A0o.getValue();
            if (value instanceof Number) {
                markPointWithEditor.addPointData(C18200wM.A0p(A0o), AnonymousClass0wJ.A04(A0o.getValue()));
            } else {
                boolean z = value instanceof Boolean;
                String A0p = C18200wM.A0p(A0o);
                Object value2 = A0o.getValue();
                if (z) {
                    markPointWithEditor.addPointData(A0p, AnonymousClass0wJ.A1X(value2));
                } else {
                    if (value2 instanceof Number) {
                        valueOf = value2.toString();
                    } else {
                        valueOf = String.valueOf(value2);
                    }
                    markPointWithEditor.addPointData(A0p, valueOf);
                }
            }
        }
        markPointWithEditor.markerEditingCompleted();
        return null;
    }
}
