package X;

/* renamed from: X.7ZO  reason: invalid class name */
public final class AnonymousClass7ZO implements C143128g9 {
    public final long A00;
    public final AnonymousClass67A A01;

    public final long ABd(C115096uV r9, AnonymousClass69J r10, long j, long j2) {
        long j3;
        int A07;
        int i;
        int i2;
        int ordinal = this.A01.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                int i3 = r9.A01;
                j3 = this.A00;
                i = i3 + ((int) (j3 >> 32));
                i2 = (int) (j2 >> 32);
            } else if (ordinal == 2) {
                int i4 = r9.A01;
                j3 = this.A00;
                i = i4 + ((int) (j3 >> 32));
                i2 = ((int) (j2 >> 32)) / 2;
            } else {
                throw AnonymousClass4VZ.A00();
            }
            A07 = i - i2;
        } else {
            int i5 = r9.A01;
            j3 = this.A00;
            A07 = i5 + C86104wH.A07(j3);
        }
        return AnonymousClass7Hh.A00(A07, r9.A03 + C86104wH.A08(j3));
    }

    public AnonymousClass7ZO(AnonymousClass67A r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
