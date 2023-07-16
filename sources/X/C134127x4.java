package X;

import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7x4  reason: invalid class name and case insensitive filesystem */
public final class C134127x4 implements C39790Kzz {
    public final C132127tN A00;
    public final /* synthetic */ UserSession A01;

    public C134127x4(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AnonymousClass5vV.A00(userSession);
    }

    public final /* bridge */ /* synthetic */ Object ADd(Object obj, Object obj2) {
        List emptyList;
        List list = (List) obj2;
        if (list == null) {
            list = Collections.emptyList();
        }
        if (obj != null) {
            emptyList = (List) obj;
        } else {
            emptyList = Collections.emptyList();
        }
        ArrayList A0k = C18240wQ.A0k(C86164wN.A06(list, emptyList.size()));
        A0k.addAll(emptyList);
        for (Object next : list) {
            if (!emptyList.contains(next)) {
                A0k.add(next);
            }
        }
        return A0k;
    }

    public final Object CYc(String str) {
        List A02 = this.A00.A02(str);
        ArrayList A0t = C18200wM.A0t(A02);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            C36421JUf jUf = new C36421JUf(C19274Atd.A00(C18180wK.A0k(it)));
            jUf.A04 = C18180wK.A0Y();
            A0t.add(jUf.A00());
        }
        return A0t;
    }

    public final /* bridge */ /* synthetic */ Object AJR() {
        return Collections.emptyList();
    }
}
