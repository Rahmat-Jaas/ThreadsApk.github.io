package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Tw  reason: invalid class name and case insensitive filesystem */
public final class C122797Tw implements C147228p0 {
    public final int A00;
    public final int A01;
    public final C142658fN A02;

    public C122797Tw(C142658fN r2, int i, int i2) {
        C04220Ms.A0B(r2, 3);
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r2;
    }

    public final /* synthetic */ float Aft(float f, float f2, float f3) {
        return BKV(f, f2, f3, AeM(f, f2, f3));
    }

    public final long AeM(float f, float f2, float f3) {
        return ((long) (this.A00 + this.A01)) * 1000000;
    }

    public final /* bridge */ /* synthetic */ C146248lu DAN(AnonymousClass8cW r3) {
        return new AnonymousClass7U2(new C122707Tn(this));
    }

    public final float BKL(float f, float f2, float f3, long j) {
        int i = this.A01;
        float D7X = this.A02.D7X(AnonymousClass8bI.A01(((float) AnonymousClass8bI.A07((j / 1000000) - ((long) this.A00), 0, (long) i)) / ((float) i), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f));
        return C86144wL.A00(f, ((float) 1) - D7X, f2, D7X);
    }

    public final float BKV(float f, float f2, float f3, long j) {
        long A07 = AnonymousClass8bI.A07((j / 1000000) - ((long) this.A00), 0, (long) this.A01);
        if (A07 < 0) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        float f4 = f3;
        if (A07 == 0) {
            return f3;
        }
        float f5 = f2;
        return (BKL(f, f5, f4, A07 * 1000000) - BKL(f, f5, f4, (A07 - 1) * 1000000)) * 1000.0f;
    }

    public C122797Tw() {
        this(AnonymousClass6aT.A00, 300, 0);
    }
}
