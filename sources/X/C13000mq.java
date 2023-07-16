package X;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0mq  reason: invalid class name and case insensitive filesystem */
public final class C13000mq implements C13310nP {
    public final Set A00 = new HashSet();

    public final boolean CsB(Map map) {
        boolean z = true;
        for (C13310nP CsB : this.A00) {
            z &= CsB.CsB(map);
        }
        return z;
    }
}
