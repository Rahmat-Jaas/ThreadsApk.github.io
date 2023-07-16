package X;

import com.instagram.service.session.UserSession;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.2GZ  reason: invalid class name */
public final class AnonymousClass2GZ {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        HashMap hashMap;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        AnonymousClass3HX A01 = C63893iY.A01(r10, 0);
        boolean z = true;
        C109326jp A06 = C63893iY.A06(r10, A1Z ? 1 : 0);
        AbstractCollection abstractCollection = (AbstractCollection) C63893iY.A09(r10);
        Object A0B = C63893iY.A0B(r10, 3);
        C10300i6 A0E = C63913ic.A0E(A01);
        C18200wM.A1R(A0E);
        UserSession userSession = (UserSession) A0E;
        AnonymousClass36L A05 = C63703i9.A05(userSession);
        if (abstractCollection == null || A0B == null) {
            if (A05 == null) {
                z = false;
            }
            C63893iY.A0F(r9, AnonymousClass3VO.A00(), A06, Boolean.valueOf(z), 0);
            return null;
        }
        C109326jp r4 = ((C105916eC) A0B).A00;
        AnonymousClass36K A04 = C63703i9.A04(userSession);
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            if (A04 == null || (hashMap = A04.A00) == null || hashMap.containsKey(A0k) != A1Z) {
                C04220Ms.A04(A0k);
                if (!C18250wR.A0h("\\d+").A04(A0k) || A05 == null) {
                    C63893iY.A0F(r9, AnonymousClass3VO.A00(), r4, A0k, 0);
                    return null;
                }
            }
        }
        C63893iY.A0F(r9, AnonymousClass3VO.A00(), r4, (Object) null, 0);
        return null;
    }
}
