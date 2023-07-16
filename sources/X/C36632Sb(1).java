package X;

import com.instagram.quickpromotion.intf.Trigger;

/* renamed from: X.2Sb  reason: invalid class name and case insensitive filesystem */
public final class C36632Sb {
    public static final Trigger A00(String str) {
        C04220Ms.A0B(str, 0);
        for (Trigger trigger : Trigger.values()) {
            if (C04220Ms.A0I(trigger.A01, str)) {
                return trigger;
            }
        }
        return null;
    }
}
