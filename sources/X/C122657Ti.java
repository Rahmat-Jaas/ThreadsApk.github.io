package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Ti  reason: invalid class name and case insensitive filesystem */
public final class C122657Ti implements C146448mG {
    public final long A00;
    public final C1203479u A01;
    public final C1203479u A02;
    public final C1203479u A03;
    public final AnonymousClass8cW A04;
    public final C145038jj A05;
    public final Object A06;
    public final Object A07;

    public C122657Ti(C1203479u r13, AnonymousClass8cU r14, AnonymousClass8cW r15, Object obj) {
        C04220Ms.A0B(r14, 1);
        AnonymousClass7U4 r8 = new AnonymousClass7U4(((C122717To) r14).A00);
        this.A05 = r8;
        this.A04 = r15;
        Object obj2 = obj;
        this.A06 = obj2;
        C1203479u A002 = AnonymousClass7U0.A00(r15, obj2);
        this.A02 = A002;
        this.A03 = AnonymousClass6DX.A00(r13);
        this.A07 = ((AnonymousClass7U0) this.A04).A00.invoke(r8.BFh(A002, r13));
        C04220Ms.A0B(A002, 0);
        C1203479u r0 = r8.A01;
        if (r0 == null) {
            r0 = C1203479u.A00(A002);
            r8.A01 = r0;
        }
        if (r0 == null) {
            C04220Ms.A0E("velocityVector");
            throw null;
        }
        int A022 = r0.A02();
        long j = 0;
        for (int i = 0; i < A022; i++) {
            AnonymousClass8cV r02 = r8.A03;
            j = Math.max(j, ((long) (Math.exp(C1195475u.A00(((C122807Tx) r02).A00, r13.A01(i)) / (((double) AnonymousClass6WJ.A00) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.A00 = j;
        C1203479u A003 = AnonymousClass6DX.A00(r8.BKX(A002, r13, j));
        this.A01 = A003;
        int A023 = A003.A02();
        for (int i2 = 0; i2 < A023; i2++) {
            C1203479u r3 = this.A01;
            r3.A04(i2, AnonymousClass8bI.A01(r3.A01(i2), -BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    public final long AeL() {
        return this.A00;
    }

    public final Object BFi() {
        return this.A07;
    }

    public final AnonymousClass8cW BJ4() {
        return this.A04;
    }

    public final Object BKK(long j) {
        float f;
        float f2;
        if (BUF(j)) {
            return this.A07;
        }
        AnonymousClass0YY r21 = ((AnonymousClass7U0) this.A04).A00;
        C145038jj r11 = this.A05;
        C1203479u r15 = this.A02;
        C1203479u r20 = this.A03;
        AnonymousClass7U4 r112 = (AnonymousClass7U4) r11;
        C04220Ms.A0B(r15, 1);
        C1203479u r10 = r112.A00;
        if (r10 == null) {
            r10 = C1203479u.A00(r15);
            r112.A00 = r10;
        }
        if (r10 == null) {
            C04220Ms.A0E("valueVector");
            throw null;
        }
        int A022 = r10.A02();
        for (int i = 0; i < A022; i++) {
            AnonymousClass8cV r2 = r112.A03;
            float A012 = r15.A01(i);
            float A013 = r20.A01(i);
            long j2 = j / 1000000;
            C1195475u r12 = ((C122807Tx) r2).A00;
            double A002 = C1195475u.A00(r12, A013);
            double d = (double) AnonymousClass6WJ.A00;
            double d2 = d - 1.0d;
            float A003 = (float) (((double) (r12.A00 * r12.A01)) * C86164wN.A00(d / d2, A002));
            long exp = (long) (Math.exp(A002 / d2) * 1000.0d);
            if (exp > 0) {
                f = ((float) j2) / ((float) exp);
            } else {
                f = 1.0f;
            }
            float signum = A003 * Math.signum(A013);
            float f3 = (float) 100;
            int i2 = (int) (f3 * f);
            if (i2 < 100) {
                float f4 = ((float) i2) / f3;
                int i3 = i2 + 1;
                float[] fArr = AnonymousClass6WI.A00;
                float f5 = fArr[i2];
                f2 = f5 + ((f - f4) * ((fArr[i3] - f5) / ((((float) i3) / f3) - f4)));
            } else {
                f2 = 1.0f;
            }
            r10.A04(i, A012 + (signum * f2));
        }
        return r21.invoke(r10);
    }

    public final boolean BV1() {
        return false;
    }

    public final C1203479u BKY(long j) {
        if (!BUF(j)) {
            return this.A05.BKX(this.A02, this.A03, j);
        }
        return this.A01;
    }

    public final /* synthetic */ boolean BUF(long j) {
        return C86114wI.A1S((j > AeL() ? 1 : (j == AeL() ? 0 : -1)));
    }
}
