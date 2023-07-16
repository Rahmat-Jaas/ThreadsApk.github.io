package X;

import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.10N  reason: invalid class name */
public abstract class AnonymousClass10N extends C62793ak {
    public final C86074wE A00 = C18190wL.A0z(C25951pi.A00);
    public final C86074wE A01 = C18190wL.A0z(AnonymousClass4To.A00());

    public final void A01() {
        Object value;
        LinkedHashMap linkedHashMap;
        C86074wE r3 = this.A01;
        do {
            value = r3.getValue();
            Map map = (Map) value;
            C04220Ms.A0B(map, 0);
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.clear();
        } while (!r3.ADi(value, linkedHashMap));
    }

    public final void A02(User user) {
        Object value;
        LinkedHashMap linkedHashMap;
        C86074wE r4 = this.A01;
        do {
            value = r4.getValue();
            Map map = (Map) value;
            C04220Ms.A0B(map, 0);
            linkedHashMap = new LinkedHashMap(map);
            boolean containsKey = linkedHashMap.containsKey(user.BK7());
            String BK7 = user.BK7();
            if (containsKey) {
                linkedHashMap.remove(BK7);
            } else {
                linkedHashMap.put(BK7, user);
            }
        } while (!r4.ADi(value, linkedHashMap));
    }
}
