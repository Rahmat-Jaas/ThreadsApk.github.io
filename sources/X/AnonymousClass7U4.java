package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7U4  reason: invalid class name */
public final class AnonymousClass7U4 implements C145038jj {
    public C1203479u A00;
    public C1203479u A01;
    public C1203479u A02;
    public final AnonymousClass8cV A03;

    public final C1203479u BKX(C1203479u r19, C1203479u r20, long j) {
        float f;
        float f2;
        C1203479u r1 = r19;
        C04220Ms.A0B(r1, 1);
        C1203479u r9 = this.A01;
        if (r9 == null) {
            r9 = C1203479u.A00(r1);
            this.A01 = r9;
        }
        if (r9 == null) {
            C04220Ms.A0E("velocityVector");
            throw null;
        }
        int A022 = r9.A02();
        for (int i = 0; i < A022; i++) {
            AnonymousClass8cV r2 = this.A03;
            float A012 = r20.A01(i);
            long j2 = j / 1000000;
            C1195475u r0 = ((C122807Tx) r2).A00;
            double A002 = C1195475u.A00(r0, A012);
            double d = (double) AnonymousClass6WJ.A00;
            double d2 = d - 1.0d;
            float A003 = (float) (((double) (r0.A00 * r0.A01)) * C86164wN.A00(d / d2, A002));
            long exp = (long) (Math.exp(A002 / d2) * 1000.0d);
            if (exp > 0) {
                f = ((float) j2) / ((float) exp);
            } else {
                f = 1.0f;
            }
            float f3 = (float) 100;
            int i2 = (int) (f3 * f);
            if (i2 < 100) {
                float f4 = ((float) i2) / f3;
                int i3 = i2 + 1;
                float f5 = ((float) i3) / f3;
                float[] fArr = AnonymousClass6WI.A00;
                f2 = (fArr[i3] - fArr[i2]) / (f5 - f4);
            } else {
                f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            }
            r9.A04(i, (((f2 * Math.signum(A012)) * A003) / ((float) exp)) * 1000.0f);
        }
        return r9;
    }

    public final C1203479u BFh(C1203479u r19, C1203479u r20) {
        C1203479u r12 = r19;
        C1203479u r11 = r20;
        AnonymousClass0wJ.A1N(r12, r11);
        C1203479u r10 = this.A02;
        if (r10 == null) {
            r10 = C1203479u.A00(r12);
            this.A02 = r10;
        }
        if (r10 == null) {
            C04220Ms.A0E("targetVector");
            throw null;
        }
        int A022 = r10.A02();
        for (int i = 0; i < A022; i++) {
            AnonymousClass8cV r0 = this.A03;
            float A012 = r12.A01(i);
            float A013 = r11.A01(i);
            C1195475u r2 = ((C122807Tx) r0).A00;
            double A002 = C1195475u.A00(r2, A013);
            double d = (double) AnonymousClass6WJ.A00;
            r10.A04(i, A012 + (((float) (((double) (r2.A00 * r2.A01)) * C86164wN.A00(d / (d - 1.0d), A002))) * Math.signum(A013)));
        }
        return r10;
    }

    public AnonymousClass7U4(AnonymousClass8cV r1) {
        this.A03 = r1;
    }
}
