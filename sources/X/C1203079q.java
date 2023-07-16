package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.79q  reason: invalid class name and case insensitive filesystem */
public final class C1203079q {
    public static final C1203079q A08;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1203079q) {
                C1203079q r8 = (C1203079q) obj;
                if (!(Float.compare(this.A01, r8.A01) == 0 && Float.compare(this.A03, r8.A03) == 0 && Float.compare(this.A02, r8.A02) == 0 && Float.compare(this.A00, r8.A00) == 0 && this.A06 == r8.A06 && this.A07 == r8.A07 && this.A05 == r8.A05 && this.A04 == r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    static {
        long j = C1187372b.A00;
        long A0C = C86104wH.A0C(C86104wH.A00(j), Float.intBitsToFloat(C86104wH.A08(j)));
        A08 = new C1203079q(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A0C, A0C, A0C, A0C);
    }

    public final int hashCode() {
        return C86134wK.A06(C86104wH.A06(C86104wH.A06(C86104wH.A06(C86104wH.A05(C86104wH.A05(C86104wH.A05(C86134wK.A03(this.A01), this.A03), this.A02), this.A00), this.A06), this.A07), this.A05), this.A04);
    }

    public final String toString() {
        StringBuilder A0r;
        long j = this.A06;
        long j2 = this.A07;
        long j3 = this.A05;
        long j4 = this.A04;
        String A0j = AnonymousClass00U.A0j(C115856w1.A00(this.A01), ", ", C115856w1.A00(this.A03), ", ", C115856w1.A00(this.A02), ", ", C115856w1.A00(this.A00));
        if (C18180wK.A1W((j > j2 ? 1 : (j == j2 ? 0 : -1))) && j2 == j3 && j3 == j4) {
            float A002 = C86104wH.A00(j);
            float intBitsToFloat = Float.intBitsToFloat(C86104wH.A08(j));
            int i = (A002 > intBitsToFloat ? 1 : (A002 == intBitsToFloat ? 0 : -1));
            A0r = C18200wM.A0r();
            A0r.append("RoundRect(rect=");
            if (i == 0) {
                A0r.append(A0j);
                A0r.append(", radius=");
            } else {
                A0r.append(A0j);
                A0r.append(", x=");
                C115856w1.A01(A0r, A002);
                A0r.append(", y=");
                A002 = intBitsToFloat;
            }
            C115856w1.A01(A0r, A002);
        } else {
            A0r = C18200wM.A0r();
            A0r.append("RoundRect(rect=");
            A0r.append(A0j);
            A0r.append(", topLeft=");
            A0r.append(C1187372b.A00(j));
            A0r.append(", topRight=");
            A0r.append(C1187372b.A00(j2));
            A0r.append(", bottomRight=");
            A0r.append(C1187372b.A00(j3));
            A0r.append(", bottomLeft=");
            A0r.append(C1187372b.A00(j4));
        }
        return C86114wI.A0q(A0r, ')');
    }

    public C1203079q(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A04 = j4;
    }
}
