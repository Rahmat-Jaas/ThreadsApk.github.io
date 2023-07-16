package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6RG  reason: invalid class name */
public final class AnonymousClass6RG {
    public static final boolean A00(C114846tz r7, AnonymousClass69O r8) {
        AnonymousClass680 r4;
        C114836ty r6 = (C114836ty) r7.A00.get(r8);
        if (r6 != null) {
            List<C115276un> list = r6.A01;
            boolean z = list instanceof Collection;
            if (!z || !list.isEmpty()) {
                for (C115276un r2 : list) {
                    if (r2.A00 == AnonymousClass22C.IG && r2.A04.contains(AnonymousClass22D.REELS) && r2.A01 == AnonymousClass680.IGNORE) {
                        return true;
                    }
                }
            }
            if (!z || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C115276un r22 = (C115276un) it.next();
                    if (r22.A00 == AnonymousClass22C.IG) {
                        List list2 = r22.A04;
                        AnonymousClass22D r5 = AnonymousClass22D.REELS;
                        if (list2.contains(r5) && r22.A01 == (r4 = AnonymousClass680.ALLOW)) {
                            List<C115276un> list3 = r6.A00;
                            if ((list3 instanceof Collection) && list3.isEmpty()) {
                                return false;
                            }
                            for (C115276un r23 : list3) {
                                if (r23.A00 == AnonymousClass22C.FB && r23.A04.contains(r5) && AnonymousClass00J.A0k(C06750aI.A17(r4, AnonymousClass680.IGNORE), r23.A01)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
