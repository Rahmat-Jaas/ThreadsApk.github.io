package X;

/* renamed from: X.7ZN  reason: invalid class name */
public final class AnonymousClass7ZN implements C143128g9 {
    public final AnonymousClass672 A00;

    public final long ABd(C115096uV r6, AnonymousClass69J r7, long j, long j2) {
        int A07;
        int A08;
        int ordinal = this.A00.ordinal();
        if (ordinal == 1) {
            int i = r6.A01;
            A07 = (i + ((r6.A02 - i) / 2)) - (C86104wH.A07(j2) / 2);
            A08 = (r6.A03 - C86104wH.A08(j2)) - ((int) ((float) 4));
        } else if (ordinal == 0) {
            int i2 = r6.A01;
            A07 = (i2 + ((r6.A02 - i2) / 2)) - (C86104wH.A07(j2) / 2);
            A08 = r6.A00 + ((int) ((float) 4));
        } else {
            throw AnonymousClass4VZ.A00();
        }
        return AnonymousClass7Hh.A00(A07, A08);
    }

    public AnonymousClass7ZN(AnonymousClass672 r1) {
        this.A00 = r1;
    }
}
