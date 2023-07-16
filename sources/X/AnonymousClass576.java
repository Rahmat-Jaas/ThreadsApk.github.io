package X;

import java.util.Map;

/* renamed from: X.576  reason: invalid class name */
public final class AnonymousClass576 extends C62793ak {
    public final M5J A00;
    public final C121177En A01;

    public AnonymousClass576(C121177En r5) {
        M5J r1;
        C04220Ms.A0B(r5, 1);
        this.A01 = r5;
        Map map = r5.A02;
        Object obj = map.get("clipsAdvancedSettingsConfig");
        if (!(obj instanceof C880856r) || (r1 = (M5J) obj) == null) {
            Map map2 = r5.A03;
            if (map2.containsKey("clipsAdvancedSettingsConfig")) {
                r1 = new C880656p(r5, map2.get("clipsAdvancedSettingsConfig"));
            } else {
                r1 = new C880656p(r5);
            }
            map.put("clipsAdvancedSettingsConfig", r1);
        }
        this.A00 = r1;
    }
}
