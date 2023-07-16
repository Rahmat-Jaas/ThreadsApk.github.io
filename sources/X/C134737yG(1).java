package X;

/* renamed from: X.7yG  reason: invalid class name and case insensitive filesystem */
public final class C134737yG implements CharSequence {
    public final char A00;

    public final int length() {
        return 1;
    }

    public final char charAt(int i) {
        if (i == 0) {
            return this.A00;
        }
        throw new IndexOutOfBoundsException();
    }

    public final CharSequence subSequence(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return "";
            }
            if (i2 == 1) {
                return this;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public C134737yG(char c) {
        this.A00 = c;
    }
}
