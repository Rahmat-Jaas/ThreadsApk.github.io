package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3UU  reason: invalid class name */
public final class AnonymousClass3UU {
    public boolean A00;
    public final ImmutableMap A01;

    public final String toString() {
        return this.A01.toString();
    }

    public AnonymousClass3UU(Map map) {
        ImmutableMap copyOf;
        if (map == null) {
            copyOf = RegularImmutableMap.A02;
        } else {
            HashMap A0y = AnonymousClass0wJ.A0y();
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                if (!(A0o.getKey() == null || A0o.getValue() == null)) {
                    C18210wN.A1Q(A0y, A0o);
                }
            }
            copyOf = ImmutableMap.copyOf(A0y);
        }
        this.A01 = copyOf;
    }

    public AnonymousClass3UU() {
        this.A01 = RegularImmutableMap.A02;
    }
}
