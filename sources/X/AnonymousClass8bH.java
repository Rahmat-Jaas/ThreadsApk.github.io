package X;

/* renamed from: X.8bH  reason: invalid class name */
public final class AnonymousClass8bH extends C134937yc implements C146038lW {
    public static final AnonymousClass8bH A00 = A02(1, 0);

    public AnonymousClass8bH(int i, int i2) {
        super(i, i2, 1);
    }

    public static C1367083z A01(int i, int i2) {
        return new AnonymousClass8bH(i, i2).iterator();
    }

    public static AnonymousClass8bH A02(int i, int i2) {
        return new AnonymousClass8bH(i, i2);
    }

    public final Integer A04() {
        return Integer.valueOf(this.A01);
    }

    public final Integer A05() {
        return Integer.valueOf(this.A00);
    }

    public final boolean A06(int i) {
        if (this.A00 > i || i > this.A01) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Comparable Afl() {
        return Integer.valueOf(this.A01);
    }

    public final /* bridge */ /* synthetic */ Comparable BDJ() {
        return Integer.valueOf(this.A00);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass8bH)) {
            return false;
        }
        if (isEmpty() && ((C134937yc) obj).isEmpty()) {
            return true;
        }
        C134937yc r3 = (C134937yc) obj;
        if (this.A00 == r3.A00 && this.A01 == r3.A01) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return AnonymousClass00U.A0K("..", this.A00, this.A01);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.A00 * 31) + this.A01;
    }
}
