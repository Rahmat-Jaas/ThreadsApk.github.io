package X;

import com.instagram.model.reels.Reel;
import com.instagram.service.session.UserSession;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Ti  reason: invalid class name and case insensitive filesystem */
public final class C61413Ti {
    public static final String A00(Collection collection) {
        C04220Ms.A0B(collection, 0);
        StringWriter A0d = C18230wP.A0d();
        MMp A04 = C18987Aon.A00.A04(A0d);
        A04.A0I();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A04.A0Y(C18180wK.A0k(it));
        }
        A04.A0F();
        A04.close();
        return C18190wL.A0n(A0d);
    }

    public final String A01(UserSession userSession, List list) {
        C04220Ms.A0B(userSession, 0);
        StringWriter A0d = C18230wP.A0d();
        MMp A04 = C18987Aon.A00.A04(A0d);
        A04.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            ArrayList A0v = AnonymousClass0wJ.A0v();
            for (BKH bkh : reel.A0P(userSession)) {
                BKU bku = bkh.A0M;
                if (bku != null) {
                    String str = bku.A0N;
                    C04220Ms.A06(str);
                    A0v.add(str);
                }
            }
            if (C18250wR.A1K(A0v)) {
                A04.A0J();
                A04.A0d("reel_id", reel.getId());
                A04.A0d("media_count", String.valueOf(A0v.size()));
                A04.A0c("timestamp", reel.A03);
                A04.A0d("media_ids", A00(A0v));
                A04.A0G();
            }
        }
        A04.A0F();
        A04.close();
        return C18190wL.A0n(A0d);
    }
}
