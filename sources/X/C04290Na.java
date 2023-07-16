package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.0Na  reason: invalid class name and case insensitive filesystem */
public final class C04290Na implements Comparator {
    public final /* synthetic */ C04320Nd A00;
    public final /* synthetic */ Map A01;

    public C04290Na(C04320Nd r1, Map map) {
        this.A00 = r1;
        this.A01 = map;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Map map = this.A01;
        return (int) (((Number) map.get(obj)).longValue() - ((Number) map.get(obj2)).longValue());
    }
}
