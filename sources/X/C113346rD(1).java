package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.6rD  reason: invalid class name and case insensitive filesystem */
public abstract class C113346rD {
    public Map A00;

    public final void A01(String str, Object obj) {
        Map map = this.A00;
        if (map == null) {
            map = Collections.synchronizedMap(AnonymousClass0wJ.A0y());
            this.A00 = map;
        }
        map.put(str, obj);
    }

    public Object A00(boolean z) {
        A01(AnonymousClass000.A00(956), Boolean.valueOf(z));
        return this;
    }
}
