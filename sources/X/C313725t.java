package X;

import java.util.Set;

/* renamed from: X.25t  reason: invalid class name and case insensitive filesystem */
public enum C313725t {
    ONE_TAP(0),
    ONE_TAP_BACKUP(1),
    ALL_ONE_TAP(2),
    SMART_LOCK(3),
    GOOGLE(4),
    PROFILE(5),
    FX_MANI_IG_LOGGED_IN(6),
    CACHEABLE(7);
    
    public final C313725t[] A00;

    public static final void A00(C313725t r4, Set set) {
        C313725t[] r3 = r4.A00;
        int length = r3.length;
        int i = 0;
        if (length == 0) {
            set.add(r4);
            return;
        }
        do {
            A00(r3[i], set);
            i++;
        } while (i < length);
    }

    /* access modifiers changed from: public */
    C313725t(int i) {
        this.A00 = r2;
    }
}
