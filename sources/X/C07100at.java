package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0at  reason: invalid class name and case insensitive filesystem */
public final class C07100at implements AnonymousClass0PC {
    public final C04100Mg A00;

    public final void start() {
        C07080ar r7 = new C07080ar(this);
        C020109i.A01.add(r7);
        Set set = C020109i.A00;
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                it.next();
                C07100at r6 = r7.A00;
                C04170Mn r5 = new C04170Mn((Throwable) null);
                try {
                    Iterator it2 = Collections.unmodifiableSet(new HashSet(set)).iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        th = new NullPointerException("getScopeName");
                        throw th;
                    }
                    r5.A03(AnonymousClass0MU.A90, AnonymousClass00U.A0L("[", "]").replace(",]", "]"));
                    C04100Mg r1 = r6.A00;
                    r1.A07(r5, AnonymousClass0ND.CRITICAL_REPORT, r6);
                    r1.A07(r5, AnonymousClass0ND.LARGE_REPORT, r6);
                } catch (Throwable th) {
                    th = th;
                }
            }
        }
    }

    public C07100at(C04100Mg r1) {
        this.A00 = r1;
    }

    public final /* synthetic */ C06820aQ As3() {
        return null;
    }

    public final AnonymousClass0PD Awx() {
        return AnonymousClass0PD.USER_PERCEPTIBLE_SCOPE;
    }
}
