package X;

/* renamed from: X.7U3  reason: invalid class name */
public final class AnonymousClass7U3 implements C146248lu {
    public final long A00;
    public final long A01;
    public final C147238p1 A02;

    private final C1203479u A00(C1203479u r10, C1203479u r11, C1203479u r12, long j) {
        C1203479u r5 = r11;
        long j2 = this.A01;
        long j3 = this.A00;
        if (j + j2 <= j3) {
            return r5;
        }
        return BKW(r10, r5, r12, j3 - j2);
    }

    public final long AeN(C1203479u r3, C1203479u r4, C1203479u r5) {
        return Long.MAX_VALUE;
    }

    public final /* synthetic */ C1203479u Afu(C1203479u r7, C1203479u r8, C1203479u r9) {
        AnonymousClass0wJ.A1O(r7, r8);
        C04220Ms.A0B(r9, 3);
        return BKW(r7, r8, r9, AeN(r7, r8, r9));
    }

    public final boolean BV1() {
        return true;
    }

    public final C1203479u BKM(C1203479u r19, C1203479u r20, C1203479u r21, long j) {
        C1203479u r7 = r19;
        C1203479u r9 = r20;
        AnonymousClass0wJ.A1O(r7, r9);
        C1203479u r8 = r21;
        C04220Ms.A0B(r8, 3);
        C147238p1 r12 = this.A02;
        long j2 = j;
        long j3 = j + this.A01;
        long j4 = 0;
        if (j3 > 0) {
            long j5 = this.A00;
            j4 = j3 - ((j3 / j5) * j5);
        }
        return r12.BKM(r7, r9, A00(r7, r8, r9, j2), j4);
    }

    public final C1203479u BKW(C1203479u r19, C1203479u r20, C1203479u r21, long j) {
        C1203479u r7 = r19;
        C1203479u r9 = r20;
        AnonymousClass0wJ.A1O(r7, r9);
        C1203479u r8 = r21;
        C04220Ms.A0B(r8, 3);
        C147238p1 r12 = this.A02;
        long j2 = j;
        long j3 = j + this.A01;
        long j4 = 0;
        if (j3 > 0) {
            long j5 = this.A00;
            j4 = j3 - ((j3 / j5) * j5);
        }
        return r12.BKW(r7, r9, A00(r7, r8, r9, j2), j4);
    }

    public AnonymousClass7U3(C147238p1 r5, long j) {
        this.A02 = r5;
        this.A00 = ((long) (r5.Ack() + r5.AeJ())) * 1000000;
        this.A01 = j * 1000000;
    }
}
