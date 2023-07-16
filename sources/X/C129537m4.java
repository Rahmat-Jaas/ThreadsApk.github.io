package X;

import java.util.Map;

/* renamed from: X.7m4  reason: invalid class name and case insensitive filesystem */
public final class C129537m4 implements C39504Kuo {
    public static final Map A01 = new C013306f();
    public volatile Map A00;

    public final Object DBw(String str) {
        Map map = this.A00;
        if (map != null) {
            return map.get(str);
        }
        throw new NullPointerException(I17.A00(765));
    }
}
