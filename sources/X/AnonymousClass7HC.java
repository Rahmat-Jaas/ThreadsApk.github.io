package X;

/* renamed from: X.7HC  reason: invalid class name */
public final class AnonymousClass7HC {
    public static final long A01 = AnonymousClass7Hi.A02(Float.NaN, 0);
    public static final C114346t5[] A02 = {new C114346t5(0), new C114346t5(4294967296L), new C114346t5(8589934592L)};
    public final long A00;

    public static final long A00(long j) {
        return A02[(int) ((j & 1095216660480L) >>> 32)].A00;
    }

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof AnonymousClass7HC) || j != ((AnonymousClass7HC) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18190wL.A02(this.A00);
    }

    public final String toString() {
        return A01(this.A00);
    }

    public /* synthetic */ AnonymousClass7HC(long j) {
        this.A00 = j;
    }

    public static String A01(long j) {
        StringBuilder A0r;
        String str;
        long A002 = A00(j);
        if (A002 == 0) {
            return "Unspecified";
        }
        if (A002 == 4294967296L) {
            A0r = C18200wM.A0r();
            A0r.append(Float.intBitsToFloat(C86104wH.A08(j)));
            str = ".sp";
        } else if (A002 != 8589934592L) {
            return "Invalid";
        } else {
            A0r = C18200wM.A0r();
            A0r.append(Float.intBitsToFloat(C86104wH.A08(j)));
            str = ".em";
        }
        return C18180wK.A0i(str, A0r);
    }
}
