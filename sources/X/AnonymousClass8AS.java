package X;

/* renamed from: X.8AS  reason: invalid class name */
public final class AnonymousClass8AS extends C1367083z {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;

    public final boolean hasNext() {
        return this.A01;
    }

    public AnonymousClass8AS(int i, int i2, int i3) {
        this.A03 = i3;
        this.A02 = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.A01 = z;
        this.A00 = !z ? i2 : i;
    }
}
