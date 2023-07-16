package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6qS  reason: invalid class name and case insensitive filesystem */
public final class C112946qS {
    public double A00;
    public double A01;
    public double A02;
    public double A03 = Math.sqrt(50.0d);
    public float A04 = 1.0f;
    public float A05 = 1.0f;
    public boolean A06;

    public final long A00(float f, float f2, long j) {
        double A002;
        double d;
        double d2;
        double d3;
        double d4;
        if (!this.A06) {
            if (this.A05 == Float.MAX_VALUE) {
                throw C18180wK.A0a(AnonymousClass000.A00(646));
            }
            float f3 = this.A04;
            double d5 = (double) f3;
            double d6 = d5 * d5;
            if (f3 > 1.0f) {
                double d7 = this.A03;
                double d8 = ((double) (-f3)) * d7;
                double sqrt = d7 * Math.sqrt(d6 - ((double) 1));
                this.A02 = d8 + sqrt;
                this.A01 = d8 - sqrt;
            } else if (f3 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && f3 < 1.0f) {
                this.A00 = this.A03 * Math.sqrt(((double) 1) - d6);
            }
            this.A06 = true;
        }
        float f4 = this.A05;
        float f5 = f4;
        float f6 = f - f4;
        double d9 = ((double) j) / 1000.0d;
        float f7 = this.A04;
        float f8 = f2;
        if (f7 > 1.0f) {
            double d10 = (double) f6;
            double d11 = this.A01;
            double d12 = this.A02;
            double d13 = ((d11 * d10) - ((double) f8)) / (d11 - d12);
            double d14 = d10 - d13;
            double A003 = C86164wN.A00(d11, d9);
            double A004 = C86164wN.A00(d12, d9);
            d = (A003 * d14) + (A004 * d13);
            d4 = (d14 * d11 * A003) + (d13 * d12 * A004);
        } else {
            if (f7 == 1.0f) {
                double d15 = this.A03;
                double d16 = (double) f6;
                A002 = ((double) f8) + (d15 * d16);
                double d17 = d16 + (A002 * d9);
                double d18 = -d15;
                d3 = C86164wN.A00(d18, d9);
                d = d3 * d17;
                d2 = d * d18;
            } else {
                double d19 = this.A00;
                double d20 = (double) f7;
                double d21 = d20;
                double d22 = this.A03;
                double d23 = (double) f6;
                double d24 = (((double) 1) / d19) * ((d20 * d22 * d23) + ((double) f8));
                A002 = C86164wN.A00(((double) (-f7)) * d22, d9);
                double d25 = d19 * d9;
                double cos = Math.cos(d25);
                double sin = Math.sin(d25);
                d = A002 * ((cos * d23) + (sin * d24));
                d2 = (-d22) * d * d21;
                d3 = ((-d19) * d23 * sin) + (d24 * d19 * cos);
            }
            d4 = d2 + (A002 * d3);
        }
        return C86104wH.A0C((float) (d + ((double) f5)), (float) d4);
    }
}
