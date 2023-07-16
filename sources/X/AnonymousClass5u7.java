package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.5u7  reason: invalid class name */
public final class AnonymousClass5u7 extends AnonymousClass1j3 {
    public List A00;

    public final List A00() {
        List list = this.A00;
        if (list != null) {
            List unmodifiableList = Collections.unmodifiableList(list);
            C04220Ms.A06(unmodifiableList);
            return unmodifiableList;
        }
        C04220Ms.A0E("_whitelistedUsers");
        throw null;
    }
}
