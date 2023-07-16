package X;

import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.54B  reason: invalid class name */
public final class AnonymousClass54B extends C115536vN {
    public C109656kM A00;
    public C146508mM A01;
    public boolean A02 = true;
    public boolean A03 = true;
    public boolean A04;
    public final AnonymousClass84X A05 = AnonymousClass84X.A01(new C114206sr[16]);
    public final C147728po A06;
    public final Map A07 = C18220wO.A0y();

    public AnonymousClass54B(C147728po r3) {
        C04220Ms.A0B(r3, 1);
        this.A06 = r3;
    }

    public final void A02(C112316pN r10) {
        super.A02(r10);
        C109656kM r7 = this.A00;
        if (r7 != null) {
            this.A04 = this.A02;
            List list = r7.A03;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C121197Es A0P = C86124wJ.A0P(list, i);
                if (!A0P.A0A && (!r10.A00(A0P.A04) || !this.A02)) {
                    this.A05.A0E(new C114206sr(A0P.A04));
                }
            }
            this.A02 = false;
            this.A03 = AnonymousClass0wJ.A1T(r7.A00, 5);
        }
    }

    public final boolean A04(C112316pN r41, C146508mM r42, Map map, boolean z) {
        Object obj;
        boolean z2;
        C109656kM r0;
        boolean z3;
        int i;
        int i2;
        float f;
        C112316pN r9 = r41;
        C146508mM r7 = r42;
        Map map2 = map;
        boolean A042 = super.A04(r9, r7, map2, z);
        C147728po r1 = this.A06;
        if (!((AnonymousClass7YG) r1).A03.A08) {
            return true;
        }
        this.A01 = C121847Ik.A02(r1, 16);
        Iterator A0z = AnonymousClass0wJ.A0z(map2);
        while (true) {
            if (!A0z.hasNext()) {
                break;
            }
            Map.Entry A0o = C18180wK.A0o(A0z);
            long j = ((C114206sr) A0o.getKey()).A00;
            C121197Es r4 = (C121197Es) A0o.getValue();
            if (this.A05.A0D(new C114206sr(j))) {
                ArrayList A0v = AnonymousClass0wJ.A0v();
                List list = r4.A02;
                if (list == null) {
                    list = AnonymousClass0ZV.A00;
                }
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C112016oq r02 = (C112016oq) list.get(i3);
                    long j2 = r02.A01;
                    C146508mM r13 = this.A01;
                    C04220Ms.A0A(r13);
                    A0v.add(new C112016oq(j2, r13.Bay(r7, r02.A00)));
                }
                Map map3 = this.A07;
                C114206sr r2 = new C114206sr(j);
                C146508mM r5 = this.A01;
                C04220Ms.A0A(r5);
                long Bay = r5.Bay(r7, r4.A06);
                C146508mM r52 = this.A01;
                C04220Ms.A0A(r52);
                long Bay2 = r52.Bay(r7, r4.A05);
                long j3 = r4.A04;
                long j4 = r4.A09;
                boolean z4 = r4.A0A;
                long j5 = r4.A07;
                boolean z5 = r4.A0B;
                int i4 = r4.A03;
                long j6 = r4.A08;
                Float f2 = r4.A01;
                if (f2 != null) {
                    f = f2.floatValue();
                } else {
                    f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                }
                C121197Es r21 = new C121197Es(A0v, f, i4, j3, j4, Bay2, j5, Bay, j6, z4, z5);
                r21.A00 = r4.A00;
                map3.put(r2, r21);
            }
        }
        Map map4 = this.A07;
        if (map4.isEmpty()) {
            this.A05.A05();
            this.A00.A05();
            return true;
        }
        AnonymousClass84X r53 = this.A05;
        for (int i5 = r53.A00 - 1; -1 < i5; i5--) {
            if (!map2.containsKey(new C114206sr(((C114206sr) r53.A01[i5]).A00))) {
                r53.A03(i5);
            }
        }
        C109656kM r3 = new C109656kM(r9, AnonymousClass00J.A0N(map4.values()));
        List list2 = r3.A03;
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj = null;
                break;
            }
            obj = list2.get(i6);
            if (r9.A00(((C121197Es) obj).A04)) {
                break;
            }
            i6++;
        }
        C121197Es r43 = (C121197Es) obj;
        if (r43 != null) {
            if (!z) {
                this.A02 = false;
                z3 = false;
            } else {
                z3 = this.A02;
                if (!z3 && (r43.A0A || r43.A0B)) {
                    C146508mM r03 = this.A01;
                    C04220Ms.A0A(r03);
                    z3 = !C121667Hg.A03(r43, r03.BCI());
                    this.A02 = z3;
                }
            }
            boolean z6 = this.A04;
            if (z3 == z6 || !((i2 = r3.A00) == 3 || i2 == 4 || i2 == 5)) {
                int i7 = r3.A00;
                if (i7 != 4 ? !(i7 != 5 || !z3 || !r43.A0A) : !(!z6 || this.A03)) {
                    i = 3;
                }
            } else {
                i = 5;
                if (z3) {
                    i = 4;
                }
            }
            r3.A00 = i;
        }
        if (!A042 && r3.A00 == 3 && (r0 = this.A00) != null) {
            List list3 = r0.A03;
            if (list3.size() == list2.size()) {
                int size3 = list2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size3) {
                        z2 = false;
                        break;
                    }
                    if (C86124wJ.A0P(list3, i8).A05 != C86124wJ.A0P(list2, i8).A05) {
                        break;
                    }
                    i8++;
                }
            }
        }
        z2 = true;
        this.A00 = r3;
        return z2;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Node(pointerInputFilter=");
        A0s.append(this.A06);
        A0s.append(AnonymousClass000.A00(508));
        A0s.append(this.A00);
        A0s.append(", pointerIds=");
        return C86104wH.A0y(this.A05, A0s);
    }
}
