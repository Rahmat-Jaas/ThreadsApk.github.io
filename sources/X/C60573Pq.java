package X;

import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: X.3Pq  reason: invalid class name and case insensitive filesystem */
public final class C60573Pq {
    public static final void A01(UserSession userSession, Integer num, long j) {
        LinkedList linkedList;
        ArrayList A0s;
        C04220Ms.A0B(userSession, 2);
        HashMap A0G = AnonymousClass3WS.A01(userSession).A0G();
        String A00 = C54432zR.A00(num);
        if (A0G.containsKey(A00)) {
            ArrayList arrayList = (ArrayList) A0G.get(A00);
            if (arrayList == null) {
                A0s = AnonymousClass0wJ.A0v();
                A0s.add(Long.valueOf(j));
            } else {
                long A03 = C63803iN.A03(AnonymousClass0TJ.A05, userSession, 36599744201624773L);
                linkedList = new LinkedList(arrayList);
                while (!linkedList.isEmpty() && ((long) linkedList.size()) >= A03) {
                    linkedList.removeFirst();
                }
                linkedList.addLast(Long.valueOf(j));
                A0s = C18200wM.A0s(linkedList);
            }
        } else {
            linkedList = new LinkedList();
            linkedList.addLast(Long.valueOf(j));
            A0s = C18200wM.A0s(linkedList);
        }
        A0G.put(A00, A0s);
        C28161tl A01 = AnonymousClass3WS.A01(userSession);
        C18180wK.A0v(C28161tl.A02(A01), "nudge_tracker_map", C18220wO.A0p(A0G));
    }

    public static final ArrayList A00(UserSession userSession, Integer num) {
        ArrayList arrayList;
        HashMap A0G = AnonymousClass3WS.A01(userSession).A0G();
        String A00 = C54432zR.A00(num);
        if (!A0G.containsKey(A00) || (arrayList = (ArrayList) A0G.get(A00)) == null) {
            return AnonymousClass0wJ.A0v();
        }
        return arrayList;
    }
}
