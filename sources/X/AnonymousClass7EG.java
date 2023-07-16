package X;

/* renamed from: X.7EG  reason: invalid class name */
public class AnonymousClass7EG {
    public static final AnonymousClass7EG A04;
    public static final AnonymousClass7EG A05;
    public static final AnonymousClass7EG A06;
    public final C115606vY A00;
    public final C115606vY A01;
    public final C115606vY A02;
    public final C115606vY A03;

    static {
        C39928L8m l8m = GQI.A0G;
        A05 = new C877153v(l8m);
        C115606vY r1 = GQI.A02;
        A06 = new AnonymousClass7EG(l8m, r1);
        A04 = new AnonymousClass7EG(r1, l8m);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7EG(X.C115606vY r7, X.C115606vY r8) {
        /*
            r6 = this;
            long r1 = r7.A01
            long r4 = X.AnonymousClass74K.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0020
            X.Ltz r0 = X.C29923FwY.A01
            X.6vY r3 = X.M6S.A04(r7, r0)
        L_0x000e:
            long r1 = r8.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x001e
            X.Ltz r0 = X.C29923FwY.A01
            X.6vY r0 = X.M6S.A04(r8, r0)
        L_0x001a:
            r6.<init>(r7, r8, r3, r0)
            return
        L_0x001e:
            r0 = r8
            goto L_0x001a
        L_0x0020:
            r3 = r7
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7EG.<init>(X.6vY, X.6vY):void");
    }

    public long A00(float f, float f2, float f3, float f4) {
        float f5 = f4;
        if (this instanceof C877153v) {
            return C121657He.A04(this.A00, f, f2, f3, f4);
        }
        C115606vY r2 = this.A03;
        long A032 = r2.A03(f, f2, f3);
        return this.A02.A04(this.A00, C86104wH.A00(A032), Float.intBitsToFloat(C86104wH.A08(A032)), r2.A00(f, f2, f3), f5);
    }

    public AnonymousClass7EG(C115606vY r1, C115606vY r2, C115606vY r3, C115606vY r4) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }
}
