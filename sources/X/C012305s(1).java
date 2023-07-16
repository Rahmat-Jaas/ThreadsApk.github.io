package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.05s  reason: invalid class name and case insensitive filesystem */
public final class C012305s {
    public static final C012305s A02 = new C012305s(AnonymousClass4WJ.A0A(), AnonymousClass4WM.A05());
    public final Map A00;
    public final Set A01;

    public C012305s(Map map, Set set) {
        this.A01 = set;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        this.A00 = linkedHashMap;
    }
}
