package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Set;

/* renamed from: X.40Z  reason: invalid class name */
public final class AnonymousClass40Z implements C81984oq {
    public final String A00;
    public final Set A01;

    public final ImmutableMap ABC() {
        ImmutableMap of;
        Set set = this.A01;
        if (set.isEmpty()) {
            of = RegularImmutableMap.A02;
        } else {
            of = ImmutableMap.of(this.A00, C18200wM.A0l(", ", set));
        }
        C04220Ms.A06(of);
        return of;
    }

    public AnonymousClass40Z(Set set, String str) {
        this.A00 = str;
        this.A01 = set;
    }
}
