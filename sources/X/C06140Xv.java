package X;

/* renamed from: X.0Xv  reason: invalid class name and case insensitive filesystem */
public final class C06140Xv implements C04440Nq {
    public final /* synthetic */ C06150Xw A00;

    public final byte AUm(int i) {
        if (i == 2) {
            return this.A00.A0A;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0J("Not a byte field: ", i));
    }

    public final int AyA() {
        return 3;
    }

    public final short BB3(int i) {
        if (i == 1) {
            return this.A00.A0H;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0J("Not a short field: ", i));
    }

    public final int BCL(int i) {
        int i2 = 4;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    return 1;
                }
                throw new IllegalArgumentException();
            }
        }
        return i2;
    }

    public C06140Xv(C06150Xw r1) {
        this.A00 = r1;
    }

    public final int ApQ(int i) {
        if (i == 0) {
            return 0;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0J("Not an int field: ", i));
    }

    public final long At5(int i) {
        throw new IllegalArgumentException("No long field");
    }
}
