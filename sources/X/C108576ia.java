package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6ia  reason: invalid class name and case insensitive filesystem */
public final class C108576ia {
    public final C134887yX A00;
    public final AnonymousClass7HT A01;
    public final Set A02 = C86134wK.A0u();

    public C108576ia(AnonymousClass7HT r7, Map map) {
        AnonymousClass0wJ.A1O(r7, map);
        this.A01 = r7;
        this.A00 = r7.A05;
        List A0A = r7.A0A();
        int size = A0A.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass7HT r2 = (AnonymousClass7HT) A0A.get(i);
            if (map.containsKey(Integer.valueOf(r2.A02))) {
                this.A02.add(Integer.valueOf(r2.A02));
            }
        }
    }
}
