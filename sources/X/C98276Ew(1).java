package X;

/* renamed from: X.6Ew  reason: invalid class name and case insensitive filesystem */
public abstract class C98276Ew {
    public static final int A00(long j, long j2) {
        boolean A1V = C18180wK.A1V((int) (j & 4294967295L));
        if (A1V == C18180wK.A1V((int) (j2 & 4294967295L))) {
            return (int) Math.signum(C86124wJ.A02(j) - C86124wJ.A02(j2));
        }
        if (A1V) {
            return -1;
        }
        return 1;
    }
}
