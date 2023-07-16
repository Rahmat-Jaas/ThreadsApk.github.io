package X;

/* renamed from: X.40z  reason: invalid class name and case insensitive filesystem */
public final class C678940z implements C84724tl {
    public final float AxK(C72384Ny r7, float f, int i) {
        int i2 = r7.A09;
        int i3 = i - i2;
        boolean z = false;
        if (Math.abs(i3) <= r7.A0A) {
            z = true;
        }
        if (z) {
            return 1.0f;
        }
        if (i3 < r7.A08 && i2 - i < r7.A07) {
            return f;
        }
        if (i > i2) {
            return ((float) r7.A03) + 1.0f;
        }
        return 1.0f - ((float) r7.A04);
    }
}
