package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6vY  reason: invalid class name and case insensitive filesystem */
public abstract class C115606vY {
    public final int A00;
    public final long A01;
    public final String A02;

    public boolean A05() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C115606vY r6 = (C115606vY) obj;
        if (this.A00 != r6.A00 || !C04220Ms.A0I(this.A02, r6.A02)) {
            return false;
        }
        return C18180wK.A1W((this.A01 > r6.A01 ? 1 : (this.A01 == r6.A01 ? 0 : -1)));
    }

    public float A00(float f, float f2, float f3) {
        float f4;
        if (this instanceof C877053u) {
            return AnonymousClass8bI.A01(f3, -2.0f, 2.0f);
        }
        float A012 = ((AnonymousClass8bI.A01(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 100.0f) + 16.0f) / 116.0f) - (AnonymousClass8bI.A01(f3, -128.0f, 128.0f) * 0.005f);
        if (A012 > 0.20689656f) {
            f4 = A012 * A012;
        } else {
            f4 = 0.12841855f;
            A012 -= 0.13793103f;
        }
        return f4 * A012 * C29923FwY.A04[2];
    }

    public float A01(int i) {
        if (this instanceof C877053u) {
            return 2.0f;
        }
        if (i == 0) {
            return 100.0f;
        }
        return 128.0f;
    }

    public float A02(int i) {
        if (this instanceof C877053u) {
            return -2.0f;
        }
        if (i == 0) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        return -128.0f;
    }

    public long A03(float f, float f2, float f3) {
        float f4;
        float f5;
        if (this instanceof C877053u) {
            return C86104wH.A0C(AnonymousClass8bI.A01(f, -2.0f, 2.0f), AnonymousClass8bI.A01(f2, -2.0f, 2.0f));
        }
        float A012 = (AnonymousClass8bI.A01(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 100.0f) + 16.0f) / 116.0f;
        float A013 = (AnonymousClass8bI.A01(f, -128.0f, 128.0f) * 0.002f) + A012;
        if (A013 > 0.20689656f) {
            f4 = A013 * A013 * A013;
        } else {
            f4 = (A013 - 0.13793103f) * 0.12841855f;
        }
        if (A012 > 0.20689656f) {
            f5 = A012 * A012 * A012;
        } else {
            f5 = 0.12841855f * (A012 - 0.13793103f);
        }
        float[] fArr = C29923FwY.A04;
        float f6 = f4 * fArr[0];
        float f7 = f5 * fArr[1];
        return (((long) Float.floatToIntBits(f6)) << 32) | (((long) Float.floatToIntBits(f7)) & 4294967295L);
    }

    public long A04(C115606vY r9, float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float A012;
        float A013;
        float A014;
        if (this instanceof C877053u) {
            C04220Ms.A0B(r9, 4);
            A012 = AnonymousClass8bI.A01(f, -2.0f, 2.0f);
            A013 = AnonymousClass8bI.A01(f2, -2.0f, 2.0f);
            A014 = AnonymousClass8bI.A01(f3, -2.0f, 2.0f);
        } else {
            C04220Ms.A0B(r9, 4);
            float[] fArr = C29923FwY.A04;
            float f8 = f / fArr[0];
            float f9 = f2 / fArr[1];
            float f10 = f3 / fArr[2];
            if (f8 > 0.008856452f) {
                f5 = (float) Math.pow((double) f8, (double) 0.33333334f);
            } else {
                f5 = (f8 * 7.787037f) + 0.13793103f;
            }
            if (f9 > 0.008856452f) {
                f6 = (float) Math.pow((double) f9, (double) 0.33333334f);
            } else {
                f6 = (f9 * 7.787037f) + 0.13793103f;
            }
            if (f10 > 0.008856452f) {
                f7 = (float) Math.pow((double) f10, (double) 0.33333334f);
            } else {
                f7 = (f10 * 7.787037f) + 0.13793103f;
            }
            A012 = AnonymousClass8bI.A01((116.0f * f6) - 16.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 100.0f);
            A013 = AnonymousClass8bI.A01((f5 - f6) * 500.0f, -128.0f, 128.0f);
            A014 = AnonymousClass8bI.A01((f6 - f7) * 200.0f, -128.0f, 128.0f);
        }
        return C121657He.A04(r9, A012, A013, A014, f4);
    }

    public int hashCode() {
        return C86104wH.A06(C18180wK.A03(this.A02), this.A01) + this.A00;
    }

    public C115606vY(int i, String str, long j) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = i;
        if (str.length() == 0) {
            throw C18190wL.A0a("The name of a color space cannot be null and must contain at least 1 character");
        }
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(this.A02);
        A0r.append(" (id=");
        A0r.append(this.A00);
        A0r.append(", model=");
        return C86104wH.A0y(AnonymousClass74K.A00(this.A01), A0r);
    }
}
