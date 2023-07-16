package X;

import java.util.HashMap;

/* renamed from: X.0AW  reason: invalid class name */
public abstract class AnonymousClass0AW {
    public final HashMap A00 = new HashMap();

    public final synchronized AnonymousClass0AV A02(Object obj) {
        AnonymousClass0AV r1;
        HashMap hashMap = this.A00;
        r1 = (AnonymousClass0AV) hashMap.get(obj);
        if (r1 == null) {
            r1 = A03(obj);
            hashMap.put(obj, r1);
        }
        r1.A00++;
        return r1;
    }

    public abstract AnonymousClass0AV A03(Object obj);

    public static AnonymousClass0AW A00(boolean z) {
        AnonymousClass0AW r0;
        if (!z) {
            return AnonymousClass0M3.A01();
        }
        synchronized (AnonymousClass0Ry.class) {
            r0 = AnonymousClass0Ry.A00;
            if (r0 == null) {
                r0 = new AnonymousClass0Ry();
                AnonymousClass0Ry.A00 = r0;
            }
        }
        return r0;
    }
}
