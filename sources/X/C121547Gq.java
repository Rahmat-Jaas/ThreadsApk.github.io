package X;

import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.7Gq  reason: invalid class name and case insensitive filesystem */
public final class C121547Gq {
    public final List A00;

    public final synchronized void A02(AnonymousClass68S r3, C143308gV r4, String str) {
        AnonymousClass0wJ.A1N(r4, r3);
        C04220Ms.A0B(str, 2);
        for (WeakReference weakReference : this.A00) {
            C143318gW r0 = (C143318gW) weakReference.get();
            if (r0 != null) {
                r0.BiS(r3, r4, str);
            }
        }
    }

    public static void A01(AnonymousClass68S r1, C143308gV r2, C121547Gq r3) {
        r3.A02(r1, r2, "no_use_case");
    }

    public C121547Gq(List list) {
        this.A00 = list;
    }

    public static void A00(AnonymousClass68S r1, AnonymousClass5IK r2, C143308gV r3, C121547Gq r4) {
        r4.A02(r1, r3, r2.A00());
    }

    public C121547Gq() {
        this(AnonymousClass0wJ.A0v());
    }
}
