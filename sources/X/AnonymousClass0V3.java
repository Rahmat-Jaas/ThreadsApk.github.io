package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0V3  reason: invalid class name */
public abstract class AnonymousClass0V3 {
    public Map A00 = new HashMap();

    public final void A04(C021109v r2, String str) {
        Map map = this.A00;
        Object obj = r2;
        if (r2 != null) {
            obj = r2.getValue();
        }
        map.put(str, obj);
    }

    public final void A05(AnonymousClass0A0 r2, String str) {
        Map map = this.A00;
        Object obj = r2;
        if (r2 != null) {
            obj = r2.D7I();
        }
        map.put(str, obj);
    }

    public final void A06(AnonymousClass0V3 r2, String str) {
        if (r2 == null) {
            this.A00.put(str, r2);
        } else {
            A0C(str, r2.A00);
        }
    }

    public final void A07(String str, Boolean bool) {
        this.A00.put(str, bool);
    }

    public final void A08(String str, Double d) {
        this.A00.put(str, d);
    }

    public final void A09(String str, Long l) {
        this.A00.put(str, l);
    }

    public final void A0A(String str, String str2) {
        this.A00.put(str, str2);
    }

    public final void A0B(String str, List list) {
        this.A00.put(str, list);
    }

    public final void A0C(String str, Map map) {
        this.A00.put(str, map);
    }
}
