package X;

import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape153S0100000_I2_8;

/* renamed from: X.706  reason: invalid class name */
public final class AnonymousClass706 {
    public static final C19877BEd A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (C19877BEd) userSession.A01(C19877BEd.class, AnonymousClass8HZ.A00);
    }

    public static final List A01(List list, List list2) {
        String str;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            BKU bku = ((AnonymousClass9CZ) it.next()).A01;
            if (!(bku == null || (str = bku.A0N) == null)) {
                A0v.add(str);
            }
        }
        Set A0c = AnonymousClass00J.A0c(A0v);
        ArrayList A0s = C18200wM.A0s(list);
        C000300e.A0v(new KtLambdaShape153S0100000_I2_8(A0c, 25), A0s);
        return A0s;
    }
}
