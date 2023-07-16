package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7A1  reason: invalid class name */
public final class AnonymousClass7A1 {
    public final C114406tF A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;

    public final AnonymousClass7A1 A00(Map map) {
        Map map2 = map;
        if (map.isEmpty() && this.A02.isEmpty()) {
            return this;
        }
        return new AnonymousClass7A1(this.A00, this.A05, this.A03, this.A06, map2, this.A01, this.A04);
    }

    public final AnonymousClass7A1 A01(Map map) {
        HashMap A0j = C86164wN.A0j(this.A06);
        A0j.putAll(map);
        return new AnonymousClass7A1(this.A00, this.A05, this.A03, A0j, this.A02, this.A01, this.A04);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass7A1)) {
            return false;
        }
        AnonymousClass7A1 r4 = (AnonymousClass7A1) obj;
        if (this.A03 == r4.A03 && this.A02 == r4.A02 && this.A05 == r4.A05 && this.A06.equals(r4.A06) && this.A01.equals(r4.A01) && this.A00.equals(r4.A00) && this.A04 == r4.A04) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.A05.hashCode() ^ this.A03.hashCode()) ^ this.A06.hashCode()) ^ this.A02.hashCode()) ^ this.A01.hashCode()) ^ this.A00.hashCode()) ^ this.A04.hashCode();
    }

    public AnonymousClass7A1(C114406tF r1, Map map, Map map2, Map map3, Map map4, Map map5, Map map6) {
        this.A05 = map;
        this.A03 = map2;
        this.A06 = map3;
        this.A02 = map4;
        this.A01 = map5;
        this.A00 = r1;
        this.A04 = map6;
    }

    public AnonymousClass7A1() {
        this.A05 = Collections.emptyMap();
        this.A03 = Collections.emptyMap();
        this.A06 = Collections.emptyMap();
        this.A02 = Collections.emptyMap();
        this.A01 = Collections.emptyMap();
        this.A00 = AnonymousClass6Q8.A00(Collections.emptyMap());
        this.A04 = Collections.emptyMap();
    }
}
