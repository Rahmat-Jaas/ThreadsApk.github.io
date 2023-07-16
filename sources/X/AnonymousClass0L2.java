package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0L2  reason: invalid class name */
public final class AnonymousClass0L2 {
    public static AnonymousClass0L2 A02;
    public C05130Ra A00;
    public final Map A01 = new HashMap();

    public AnonymousClass0L2(C05130Ra r8) {
        long j;
        this.A00 = r8;
        C11910l0 r1 = C07520be.A03;
        if (AnonymousClass0MI.A04 == null) {
            j = 0;
        } else {
            j = AnonymousClass0MI.A04.A00;
        }
        r1.markerStart(157825012, 0, j, TimeUnit.MILLISECONDS);
        A01(new AnonymousClass0L0(r8), C05140Rb.IG_EARLY_NATIVE);
    }

    public static synchronized AnonymousClass0L2 A00(C05130Ra r2) {
        AnonymousClass0L2 r0;
        synchronized (AnonymousClass0L2.class) {
            r0 = A02;
            if (r0 == null) {
                r0 = new AnonymousClass0L2(r2);
                A02 = r0;
            }
            r0.A00 = r2;
        }
        return r0;
    }

    public final void A01(C07490bb r3, C05140Rb r4) {
        Map map = this.A01;
        List list = (List) map.get(r4);
        if (list == null) {
            list = new ArrayList();
            map.put(r4, list);
        }
        list.add(r3);
    }

    public final void A02(C05140Rb r11) {
        String name = r11.name();
        AnonymousClass0LU.A0O("Fixie", "Initialize %s on thread: %s", name, Thread.currentThread().getName());
        List<C07490bb> list = (List) this.A01.get(r11);
        if (list == null) {
            AnonymousClass0LU.A0O("Fixie", "No fixes for %s", name);
            return;
        }
        C11910l0 r4 = C07520be.A03;
        StringBuilder sb = new StringBuilder();
        sb.append(r11);
        sb.append("_start");
        r4.markerPoint(157825012, sb.toString());
        for (C07490bb r2 : list) {
            if (r2 != null) {
                String A09 = r2.A09();
                try {
                    AnonymousClass0LU.A0O("Fixie", "Initialize %s", A09);
                    r4.markerPoint(157825012, AnonymousClass00U.A0L(A09, "_start"));
                    r2.A0A();
                    r4.markerPoint(157825012, AnonymousClass00U.A0L(A09, "_end"));
                    AnonymousClass0RZ.A00.put(A09, true);
                } catch (Throwable th) {
                    AnonymousClass0LU.A0G("Fixie", "init failed", th);
                    C07520be r0 = (C07520be) this.A00;
                    C14090on r1 = r0.A00;
                    if (r1 == null) {
                        r1 = r0.A01();
                        r0.A00 = r1;
                    }
                    C14100oo ABJ = r1.ABJ(A09, 817901561);
                    ABJ.Ciu(th);
                    ABJ.report();
                }
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : new ConcurrentHashMap(AnonymousClass0RZ.A00).entrySet()) {
            Object key = entry.getKey();
            if (((Boolean) entry.getValue()).booleanValue()) {
                jSONArray.put(key);
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("enabled", jSONArray);
            AnonymousClass0MI.A06(AnonymousClass0MU.A5G, jSONObject.toString());
            jSONObject.toString();
        } catch (JSONException unused) {
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r11);
        sb2.append("_end");
        r4.markerPoint(157825012, sb2.toString());
    }
}
