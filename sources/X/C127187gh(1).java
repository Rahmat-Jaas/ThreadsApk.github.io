package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: X.7gh  reason: invalid class name and case insensitive filesystem */
public final class C127187gh implements C145848lD {
    public final int A00;
    public final Random A01 = new Random();
    public final AnonymousClass6U9 A02;
    public final C04530Oa A03;
    public final C04530Oa A04;

    public final C146298m0 AgA(Integer num) {
        C146298m0 r2;
        C04220Ms.A0B(num, 0);
        int i = this.A00;
        if (i <= 0 || this.A01.nextInt(i) != 0) {
            return new C127197gi();
        }
        if (num.equals(AnonymousClass006.A0N)) {
            r2 = new C127207gj(this.A02, num, this.A03);
        } else {
            r2 = new C127217gk(this.A02, num, this.A04);
        }
        return r2;
    }

    public final void Cdc(Exception exc, Integer num, Map map) {
        C04220Ms.A0B(num, 0);
        C146298m0 AgA = AgA(num);
        if (AgA.isSampled()) {
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                AgA.A8X(C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
            AgA.A64(exc);
            AgA.report();
        }
    }

    public C127187gh(AnonymousClass6U9 r2, C04530Oa r3, C04530Oa r4, int i) {
        this.A04 = r3;
        this.A03 = r4;
        this.A02 = r2;
        this.A00 = i;
    }

    public final void Cd9(Integer num, String str, Map map) {
        AnonymousClass0wJ.A1N(num, str);
        C146298m0 AgA = AgA(num);
        if (AgA.isSampled()) {
            Iterator A0z = AnonymousClass0wJ.A0z(map);
            while (A0z.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(A0z);
                AgA.A8X(C18200wM.A0p(A0o), C18230wP.A0u(A0o));
            }
            AgA.A6h(str);
            AgA.report();
        }
    }
}
