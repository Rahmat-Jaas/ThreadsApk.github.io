package X;

/* renamed from: X.6p1  reason: invalid class name and case insensitive filesystem */
public final class C112116p1 {
    public int A00;
    public String A01 = "";

    public final void A00(Integer num, boolean z) {
        int i = this.A00;
        int intValue = 1 << num.intValue();
        int i2 = intValue | i;
        if (!z) {
            i2 = (intValue ^ -1) & i;
        }
        this.A00 = i2;
    }
}
