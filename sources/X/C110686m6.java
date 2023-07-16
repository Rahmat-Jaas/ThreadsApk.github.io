package X;

import android.graphics.PathMeasure;

/* renamed from: X.6m6  reason: invalid class name and case insensitive filesystem */
public final class C110686m6 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final C147018nF A03;
    public final C147018nF A04 = new AnonymousClass7X1(C86144wL.A0G());
    public final C142908fn A05;

    public C110686m6(float f) {
        M2h m2h = new M2h();
        m2h.A04("M82.61,97.64c11,-16.42 28.3,-20.76 42.08,-20.67 31.55,0.19 49.2,19.47 49.18,56.77 0,46.94 -20,64.9 -47.74,66.39 -22.14,1.19 -43.89,-10.06 -45.09,-32 -1.08,-20 15.73,-36 45.28,-37.69 47.35,-2.68 78.11,14.74 88.59,38.69 8.72,19.93 6.46,47.89 -15.26,69.17 -17.79,17.41 -40.3,26.9 -75.69,27.14C45.1,264.9 12.83,212.09 12.25,138.84 12.83,65.59 45.1,12.79 123.96,12.24c60.25,0.41 94.7,31.33 107.87,78.57");
        AnonymousClass7X1 r4 = new AnonymousClass7X1(C86144wL.A0G());
        m2h.A03(r4);
        this.A03 = r4;
        AnonymousClass7X2 r3 = new AnonymousClass7X2(new PathMeasure());
        PathMeasure pathMeasure = r3.A00;
        pathMeasure.setPath(r4.A01, false);
        this.A05 = r3;
        float length = pathMeasure.getLength();
        this.A00 = length;
        float f2 = length * 0.15f;
        this.A01 = f2;
        this.A02 = f2 * f;
    }
}
