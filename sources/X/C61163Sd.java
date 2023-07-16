package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.3Sd  reason: invalid class name and case insensitive filesystem */
public final class C61163Sd {
    public final double A00;
    public final String A01;
    public final Map A02;

    public C61163Sd(String str, Map map, double d) {
        C04220Ms.A0B(str, 1);
        this.A01 = str;
        this.A00 = d;
        this.A02 = map;
    }

    public static String A00(List list, int i) {
        return ((C61163Sd) list.get(i)).A01;
    }
}
