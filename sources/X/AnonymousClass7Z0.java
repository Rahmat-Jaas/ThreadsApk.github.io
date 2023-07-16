package X;

/* renamed from: X.7Z0  reason: invalid class name */
public final class AnonymousClass7Z0 implements C146978nB {
    public final int A00;
    public final int A01;
    public final C146978nB A02;

    public final int CVm(int i) {
        int CVm = this.A02.CVm(i);
        if (CVm >= 0 && CVm <= this.A01) {
            return CVm;
        }
        StringBuilder A0s = C18190wL.A0s("OffsetMapping.originalToTransformed returned invalid mapping: ");
        A0s.append(i);
        A0s.append(" -> ");
        A0s.append(CVm);
        A0s.append(" is not in range of transformed text [0, ");
        A0s.append(this.A01);
        throw C18180wK.A0a(C86114wI.A0q(A0s, ']'));
    }

    public final int D7e(int i) {
        int D7e = this.A02.D7e(i);
        if (D7e >= 0 && D7e <= this.A00) {
            return D7e;
        }
        StringBuilder A0s = C18190wL.A0s("OffsetMapping.transformedToOriginal returned invalid mapping: ");
        A0s.append(i);
        A0s.append(" -> ");
        A0s.append(D7e);
        A0s.append(" is not in range of original text [0, ");
        A0s.append(this.A00);
        throw C18180wK.A0a(C86114wI.A0q(A0s, ']'));
    }

    public AnonymousClass7Z0(C146978nB r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }
}
