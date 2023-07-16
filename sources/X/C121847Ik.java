package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Ik  reason: invalid class name and case insensitive filesystem */
public final class C121847Ik {
    public static final AnonymousClass7YG A00(C147778pt r4, int i) {
        AnonymousClass7IW r0;
        AnonymousClass7YG r1 = ((AnonymousClass7YG) r4).A03;
        if (r1.A08) {
            AnonymousClass7YG r3 = r1.A04;
            AnonymousClass7Y3 A01 = A01(r4);
            while (A01 != null) {
                if ((A01.A0a.A02.A00 & i) != 0) {
                    while (r3 != null) {
                        if ((r3.A01 & i) != 0) {
                            return r3;
                        }
                        r3 = r3.A04;
                    }
                }
                A01 = A01.A09();
                if (A01 == null || (r0 = A01.A0a) == null) {
                    r3 = null;
                } else {
                    r3 = r0.A05;
                }
            }
            return null;
        }
        throw C18180wK.A0a("Check failed.");
    }

    public static final AnonymousClass7Y3 A01(C147778pt r1) {
        C04220Ms.A0B(r1, 0);
        AnonymousClass54T r0 = ((AnonymousClass7YG) r1).A03.A06;
        if (r0 != null) {
            return r0.A0H;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final AnonymousClass54T A02(C147778pt r2, int i) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass54T r1 = ((AnonymousClass7YG) r2).A03.A06;
        C04220Ms.A0A(r1);
        if (r1.A0L() != r2 || (i & 128) == 0) {
            return r1;
        }
        AnonymousClass54T r12 = r1.A06;
        C04220Ms.A0A(r12);
        return r12;
    }

    public static final List A04(C147778pt r5, int i) {
        AnonymousClass7YG r1 = ((AnonymousClass7YG) r5).A03;
        if (r1.A08) {
            AnonymousClass7YG r4 = r1.A04;
            AnonymousClass7Y3 A01 = A01(r5);
            ArrayList arrayList = null;
            while (true) {
                if ((A01.A0a.A02.A00 & i) != 0) {
                    while (r4 != null) {
                        if ((r4.A01 & i) != 0) {
                            if (arrayList == null) {
                                arrayList = AnonymousClass0wJ.A0v();
                            }
                            arrayList.add(r4);
                        }
                        r4 = r4.A04;
                    }
                }
                A01 = A01.A09();
                if (A01 == null) {
                    return arrayList;
                }
                AnonymousClass7IW r0 = A01.A0a;
                if (r0 != null) {
                    r4 = r0.A05;
                } else {
                    r4 = null;
                }
            }
        } else {
            throw C18180wK.A0a("Check failed.");
        }
    }

    public static final C147098nO A03(C147778pt r0) {
        C147098nO r02 = A01(r0).A0A;
        if (r02 != null) {
            return r02;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final void A05(AnonymousClass84X r3, AnonymousClass7YG r4) {
        AnonymousClass84X A08 = A01(r4).A08();
        int i = A08.A00;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = A08.A01;
            do {
                r3.A0C(((AnonymousClass7Y3) objArr[i2]).A0a.A02);
                i2--;
            } while (i2 >= 0);
        }
    }
}
