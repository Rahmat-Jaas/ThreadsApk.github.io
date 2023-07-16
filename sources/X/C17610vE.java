package X;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0vE  reason: invalid class name and case insensitive filesystem */
public abstract class C17610vE {
    public static final Map A00;
    public static final C12500m1 A01;
    public static final C12770mS A02 = new C12770mS();
    public static final Map A03 = new C09950hQ();
    public static final Map A04 = Collections.unmodifiableMap(new C17860vf());
    public static final Set A05 = new C09970hT();
    public static final Set A06 = Collections.unmodifiableSet(new C17840vd());
    public static final Set A07 = Collections.unmodifiableSet(new C18050w2());

    static {
        Map unmodifiableMap = Collections.unmodifiableMap(new C17850ve());
        A00 = unmodifiableMap;
        A01 = new C12500m1(unmodifiableMap);
    }

    public C17610vE() {
        throw null;
    }
}
