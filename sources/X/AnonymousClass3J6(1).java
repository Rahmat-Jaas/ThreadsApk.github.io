package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3J6  reason: invalid class name */
public final class AnonymousClass3J6 {
    public static C127397h3 A00(List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C127397h3 r1 = (C127397h3) it.next();
            if (r1.A03 == 14063) {
                return r1;
            }
        }
        return null;
    }

    public static String A01(Object obj) {
        if ((obj instanceof Number) || !(obj instanceof Boolean)) {
            return obj.toString();
        }
        if (AnonymousClass0wJ.A1X(obj)) {
            return RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        }
        return "0";
    }
}
