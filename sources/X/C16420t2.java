package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0t2  reason: invalid class name and case insensitive filesystem */
public final class C16420t2 {
    public static C16420t2 A0I;
    public static final C16820tn A0J = new C16820tn();
    public static final C16350su A0K = new C16350su();
    public static final C16250sj A0L = new C16250sj();
    public AnonymousClass05M A00 = null;
    public AnonymousClass05J A01 = null;
    public AnonymousClass0EN A02 = null;
    public AnonymousClass058 A03 = null;
    public AnonymousClass0EJ A04 = null;
    public AnonymousClass04L A05 = null;
    public C012205q A06 = null;
    public AnonymousClass05P A07 = null;
    public AnonymousClass05L A08 = null;
    public AnonymousClass059 A09 = null;
    public AnonymousClass057 A0A = null;
    public AnonymousClass0EK A0B = null;
    public Map A0C = new HashMap();
    public Map A0D = new HashMap();
    public final List A0E = Collections.unmodifiableList(C16320sq.A00);
    public final List A0F = C16310sp.A00;
    public final Map A0G = new HashMap();
    public final Map A0H = new HashMap();

    private synchronized AnonymousClass0EK A02() {
        AnonymousClass0EK r3;
        r3 = this.A0B;
        if (r3 == null) {
            r3 = new AnonymousClass0EK(A0K, A0L, A0J);
            this.A0B = r3;
        }
        return r3;
    }

    public static synchronized AnonymousClass04H A03(C16420t2 r5, C15780rs r6) {
        AnonymousClass04H r0;
        synchronized (r5) {
            Map map = r5.A0C;
            if (!map.containsKey(r6)) {
                map.put(r6, new AnonymousClass04H(A0K, A0L, A0J, r6));
            }
            r0 = (AnonymousClass04H) map.get(r6);
        }
        return r0;
    }

    public final synchronized C012205q A04() {
        C012205q r2;
        synchronized (this) {
            r2 = this.A06;
            if (r2 == null) {
                AnonymousClass0EN r3 = this.A02;
                if (r3 == null) {
                    r3 = new AnonymousClass0EN(A0K, A0L, A0J);
                    this.A02 = r3;
                }
                r2 = new C012205q(r3, this.A0F, this.A0E);
                this.A06 = r2;
            }
        }
        return r2;
    }

    public final synchronized AnonymousClass05P A05() {
        AnonymousClass05P r2;
        synchronized (this) {
            r2 = this.A07;
            if (r2 == null) {
                AnonymousClass058 r3 = this.A03;
                if (r3 == null) {
                    r3 = new AnonymousClass058(A0K, A0L, A0J);
                    this.A03 = r3;
                }
                r2 = new AnonymousClass05P(r3, this.A0F, this.A0E);
                this.A07 = r2;
            }
        }
        return r2;
    }

    public final synchronized AnonymousClass05M A06() {
        AnonymousClass05M r3;
        r3 = this.A00;
        if (r3 == null) {
            r3 = new AnonymousClass05M(A0B(), this.A0F, this.A0E);
            this.A00 = r3;
        }
        return r3;
    }

    public final synchronized AnonymousClass05L A07() {
        AnonymousClass05L r3;
        r3 = this.A08;
        if (r3 == null) {
            r3 = new AnonymousClass05L(A02(), this.A0F, this.A0E);
            this.A08 = r3;
        }
        return r3;
    }

    public final synchronized AnonymousClass05L A08(String str) {
        AnonymousClass05L r4;
        r4 = this.A08;
        if (r4 == null) {
            r4 = new AnonymousClass05L(A02(), this.A0F, this.A0E);
            this.A08 = r4;
        }
        return new AnonymousClass05L(r4.A00, str, r4.A03, r4.A02);
    }

    public final synchronized AnonymousClass059 A09() {
        AnonymousClass059 r2;
        synchronized (this) {
            r2 = this.A09;
            if (r2 == null) {
                AnonymousClass04L r3 = this.A05;
                if (r3 == null) {
                    r3 = new AnonymousClass04L(A0K, A0L, A0J);
                    this.A05 = r3;
                }
                r2 = new AnonymousClass059(r3, this.A0F, this.A0E);
                this.A09 = r2;
            }
        }
        return r2;
    }

    public final synchronized AnonymousClass0EO A0A(C15780rs r7) {
        Map map;
        map = this.A0G;
        if (!map.containsKey(r7)) {
            map.put(r7, new AnonymousClass0EO(A03(this, r7), (String) null, this.A0F, this.A0E));
        }
        return (AnonymousClass0EO) map.get(r7);
    }

    public final synchronized AnonymousClass057 A0B() {
        AnonymousClass057 r3;
        r3 = this.A0A;
        if (r3 == null) {
            r3 = new AnonymousClass057(A0K, A0L, A0J);
            this.A0A = r3;
        }
        return r3;
    }

    public static synchronized C16420t2 A00() {
        C16420t2 A012;
        synchronized (C16420t2.class) {
            A012 = A01((C16240si) null, (Integer) null);
        }
        return A012;
    }

    public static synchronized C16420t2 A01(C16240si r3, Integer num) {
        C16420t2 r0;
        synchronized (C16420t2.class) {
            if (A0I == null) {
                A0I = new C16420t2();
            }
            synchronized (A0L) {
            }
            if (num != null) {
                C16350su r1 = A0K;
                synchronized (r1) {
                    r1.A00 = num;
                }
            }
            if (r3 != null) {
                C16820tn r12 = A0J;
                synchronized (r12) {
                    r12.A00 = r3;
                }
            }
            r0 = A0I;
        }
        return r0;
    }
}
