package X;

/* renamed from: X.6rd  reason: invalid class name and case insensitive filesystem */
public final class C113566rd {
    public int A00 = -1;
    public short[] A01 = new short[15];

    public final void A00(short s) {
        short[] sArr = this.A01;
        int length = sArr.length;
        if (length == this.A00 + 1) {
            short[] sArr2 = new short[(length << 1)];
            System.arraycopy(sArr, 0, sArr2, 0, length);
            this.A01 = sArr2;
            sArr = sArr2;
        }
        int i = this.A00 + 1;
        this.A00 = i;
        sArr[i] = s;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("<ShortStack vector:[");
        int i = 0;
        while (true) {
            short[] sArr = this.A01;
            if (i >= sArr.length) {
                return C18180wK.A0i("]>", A0s);
            }
            if (i != 0) {
                A0s.append(" ");
            }
            int i2 = this.A00;
            if (i == i2) {
                A0s.append(">>");
            }
            A0s.append(sArr[i]);
            if (i == i2) {
                A0s.append("<<");
            }
            i++;
        }
    }
}
