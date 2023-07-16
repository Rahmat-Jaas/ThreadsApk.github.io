package X;

import java.util.Iterator;

/* renamed from: X.7U2  reason: invalid class name */
public final class AnonymousClass7U2 implements C146248lu {
    public C1203479u A00;
    public C1203479u A01;
    public C1203479u A02;
    public final C142648fM A03;

    public final long AeN(C1203479u r9, C1203479u r10, C1203479u r11) {
        C04220Ms.A0B(r9, 0);
        AnonymousClass0wJ.A1O(r10, r11);
        Iterator it = AnonymousClass8bI.A0C(0, r9.A02()).iterator();
        long j = 0;
        while (it.hasNext()) {
            int A002 = ((C1367083z) it).A00();
            j = Math.max(j, this.A03.ANq(A002).AeM(r9.A01(A002), r10.A01(A002), r11.A01(A002)));
        }
        return j;
    }

    public final /* synthetic */ boolean BV1() {
        return false;
    }

    public AnonymousClass7U2(C142648fM r1) {
        this.A03 = r1;
    }

    public final C1203479u Afu(C1203479u r9, C1203479u r10, C1203479u r11) {
        AnonymousClass0wJ.A1N(r9, r10);
        C04220Ms.A0B(r11, 2);
        C1203479u r0 = this.A00;
        if (r0 == null) {
            r0 = C1203479u.A00(r11);
            this.A00 = r0;
        }
        int i = 0;
        if (r0 != null) {
            int A022 = r0.A02();
            while (true) {
                if (i < A022) {
                    C1203479u r4 = this.A00;
                    if (r4 == null) {
                        break;
                    }
                    r4.A04(i, this.A03.ANq(i).Aft(r9.A01(i), r10.A01(i), r11.A01(i)));
                    i++;
                } else {
                    C1203479u r02 = this.A00;
                    if (r02 != null) {
                        return r02;
                    }
                }
            }
        }
        C04220Ms.A0E("endVelocityVector");
        throw null;
    }

    public final C1203479u BKM(C1203479u r12, C1203479u r13, C1203479u r14, long j) {
        AnonymousClass0wJ.A1O(r12, r13);
        C04220Ms.A0B(r14, 3);
        C1203479u r0 = this.A01;
        if (r0 == null) {
            r0 = C1203479u.A00(r12);
            this.A01 = r0;
        }
        int i = 0;
        if (r0 != null) {
            int A022 = r0.A02();
            while (true) {
                if (i < A022) {
                    C1203479u r1 = this.A01;
                    if (r1 == null) {
                        break;
                    }
                    r1.A04(i, this.A03.ANq(i).BKL(r12.A01(i), r13.A01(i), r14.A01(i), j));
                    i++;
                } else {
                    C1203479u r02 = this.A01;
                    if (r02 != null) {
                        return r02;
                    }
                }
            }
        }
        C04220Ms.A0E("valueVector");
        throw null;
    }

    public final C1203479u BKW(C1203479u r12, C1203479u r13, C1203479u r14, long j) {
        AnonymousClass0wJ.A1O(r12, r13);
        C04220Ms.A0B(r14, 3);
        C1203479u r0 = this.A02;
        if (r0 == null) {
            r0 = C1203479u.A00(r14);
            this.A02 = r0;
        }
        int i = 0;
        if (r0 != null) {
            int A022 = r0.A02();
            while (true) {
                if (i < A022) {
                    C1203479u r1 = this.A02;
                    if (r1 == null) {
                        break;
                    }
                    r1.A04(i, this.A03.ANq(i).BKV(r12.A01(i), r13.A01(i), r14.A01(i), j));
                    i++;
                } else {
                    C1203479u r02 = this.A02;
                    if (r02 != null) {
                        return r02;
                    }
                }
            }
        }
        C04220Ms.A0E("velocityVector");
        throw null;
    }
}
