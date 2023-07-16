package X;

/* renamed from: X.7U7  reason: invalid class name */
public final class AnonymousClass7U7 implements C147238p1 {
    public final int A00;
    public final int A01;
    public final C142658fN A02;
    public final AnonymousClass7U2 A03;

    public AnonymousClass7U7(C142658fN r3, int i, int i2) {
        C04220Ms.A0B(r3, 3);
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r3;
        this.A03 = new AnonymousClass7U2(new C122707Tn(new C122797Tw(r3, i, i2)));
    }

    public final /* synthetic */ C1203479u Afu(C1203479u r7, C1203479u r8, C1203479u r9) {
        AnonymousClass0wJ.A1O(r7, r8);
        C04220Ms.A0B(r9, 3);
        return BKW(r7, r8, r9, AeN(r7, r8, r9));
    }

    public final C1203479u BKM(C1203479u r7, C1203479u r8, C1203479u r9, long j) {
        AnonymousClass0wJ.A1O(r7, r8);
        C04220Ms.A0B(r9, 3);
        return this.A03.BKM(r7, r8, r9, j);
    }

    public final C1203479u BKW(C1203479u r7, C1203479u r8, C1203479u r9, long j) {
        AnonymousClass0wJ.A1O(r7, r8);
        C04220Ms.A0B(r9, 3);
        return this.A03.BKW(r7, r8, r9, j);
    }

    public final int Ack() {
        return this.A00;
    }

    public final int AeJ() {
        return this.A01;
    }

    public final /* synthetic */ boolean BV1() {
        return false;
    }

    public final /* synthetic */ long AeN(C1203479u r5, C1203479u r6, C1203479u r7) {
        return ((long) (Ack() + AeJ())) * 1000000;
    }

    public AnonymousClass7U7() {
        this(AnonymousClass6aT.A00, 300, 0);
    }
}
