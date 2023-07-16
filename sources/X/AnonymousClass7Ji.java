package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7Ji  reason: invalid class name */
public final class AnonymousClass7Ji {
    public final Map A00 = AnonymousClass0wJ.A0y();

    public static void A01(AnonymousClass7Ji r5, int i, boolean z) {
        if (i != -1) {
            Map map = r5.A00;
            synchronized (map) {
                C112526pk r4 = (C112526pk) C18200wM.A0f(map, i);
                if (r4 != null) {
                    Set set = r4.A02;
                    if (!set.contains("is_success")) {
                        AnonymousClass01V.A0p.markerAnnotate(r4.A00, "is_success", z);
                        set.add("is_success");
                    }
                }
            }
        }
    }

    public static void A04(AnonymousClass7Ji r2, String str, int i) {
        if (i != -1) {
            Map map = r2.A00;
            synchronized (map) {
                C112526pk r0 = (C112526pk) C18200wM.A0f(map, i);
                if (r0 != null) {
                    AnonymousClass01V.A0p.markerPoint(r0.A00, str);
                }
            }
        }
    }

    public static void A00(AnonymousClass7Ji r5, int i) {
        Map map = r5.A00;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            C112526pk r3 = (C112526pk) map.remove(valueOf);
            AnonymousClass01V.A0p.markerPoint(r3.A00, "NEW_START_FOUND");
            r3.A00();
        }
        C112526pk r1 = new C112526pk(i);
        map.put(valueOf, r1);
        AnonymousClass01V r0 = AnonymousClass01V.A0p;
        int i2 = r1.A00;
        r0.markerStart(i2);
        AnonymousClass01V.A0p.markerAnnotate(i2, "hashtag_version", "v3");
    }

    public static void A02(AnonymousClass7Ji r9, String str) {
        Map map = r9.A00;
        synchronized (map) {
            Iterator A14 = C86104wH.A14(map);
            while (A14.hasNext()) {
                C112526pk r5 = (C112526pk) A14.next();
                Set set = r5.A02;
                if (!set.contains("is_success")) {
                    AnonymousClass01V.A0p.markerAnnotate(r5.A00, "is_success", false);
                    set.add("is_success");
                }
                String str2 = str;
                AnonymousClass01V r1 = AnonymousClass01V.A0p;
                int i = r5.A00;
                if (str == null) {
                    str2 = "Unknown";
                }
                r1.markerPoint(i, "EXIT_NAVIGATION", str2);
                r5.A00();
            }
            map.clear();
        }
    }

    public static void A03(AnonymousClass7Ji r3, String str, int i) {
        Map map = r3.A00;
        synchronized (map) {
            A00(r3, i);
            ((C112526pk) C18200wM.A0f(map, i)).A01.put("tab", str);
        }
    }

    public static void A05(AnonymousClass7Ji r3, String str, int i) {
        Map map = r3.A00;
        synchronized (map) {
            C112526pk r2 = (C112526pk) C18200wM.A0f(map, i);
            if (r2 != null) {
                AnonymousClass01V r1 = AnonymousClass01V.A0p;
                int i2 = r2.A00;
                r1.markerPoint(i2, str);
                r2.A00();
                map.remove(Integer.valueOf(i2));
            }
        }
    }
}
