package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3h2  reason: invalid class name and case insensitive filesystem */
public abstract class C63233h2 {
    public static final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public static C145828l9 A00() {
        return A02(C28174Ezk.A00(32));
    }

    public static C145828l9 A01() {
        return A02(I17.A00(54));
    }

    public static C145828l9 A02(String str) {
        C145828l9 r0 = (C145828l9) A00.get(str);
        if (r0 != null) {
            return r0;
        }
        throw C18250wR.A0V(AnonymousClass00U.A0L("No IPersistedQueryProvider has been initialized for ", str));
    }

    public static C145828l9 A03(boolean z) {
        AnonymousClass7Ko.A0B(z);
        return A02(C28174Ezk.A00(32));
    }

    public static C145828l9 A04(boolean z) {
        AnonymousClass7Ko.A0B(z);
        return A02(I17.A00(54));
    }
}
