package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7X6  reason: invalid class name */
public abstract class AnonymousClass7X6 implements C142918fo {
    public final C142798fc A00;
    public final C142798fc A01;
    public final C142798fc A02;
    public final C142798fc A03;

    public final C98106Ef AG2(C147168nV r19, AnonymousClass69J r20, long j) {
        AnonymousClass69J r5 = r20;
        C04220Ms.A0B(r5, 1);
        C147168nV r1 = r19;
        long j2 = j;
        float CxM = this.A03.CxM(r1, j2);
        float CxM2 = this.A02.CxM(r1, j2);
        float CxM3 = this.A00.CxM(r1, j2);
        float CxM4 = this.A01.CxM(r1, j2);
        float A012 = AnonymousClass7JK.A01(j2);
        float f = CxM + CxM4;
        if (f > A012) {
            float f2 = A012 / f;
            CxM *= f2;
            CxM4 *= f2;
        }
        float f3 = CxM2 + CxM3;
        if (f3 > A012) {
            float f4 = A012 / f3;
            CxM2 *= f4;
            CxM3 *= f4;
        }
        if (CxM < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || CxM2 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || CxM3 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || CxM4 < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            StringBuilder A0s = C18190wL.A0s("Corner size in Px can't be negative(topStart = ");
            A0s.append(CxM);
            A0s.append(", topEnd = ");
            A0s.append(CxM2);
            A0s.append(", bottomEnd = ");
            A0s.append(CxM3);
            A0s.append(", bottomStart = ");
            A0s.append(CxM4);
            throw C18190wL.A0a(C18180wK.A0i(")!", A0s));
        }
        int i = ((CxM + CxM2 + CxM3 + CxM4) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : ((CxM + CxM2 + CxM3 + CxM4) == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1));
        long j3 = AnonymousClass7KC.A03;
        if (i == 0) {
            return new C876453o(AnonymousClass6EY.A00(j3, j2));
        }
        AnonymousClass7F6 A002 = AnonymousClass6EY.A00(j3, j2);
        AnonymousClass69J r12 = AnonymousClass69J.Ltr;
        float f5 = CxM2;
        if (r5 == r12) {
            f5 = CxM;
        }
        long A0C = C86104wH.A0C(f5, f5);
        if (r5 == r12) {
            CxM = CxM2;
        }
        long A0C2 = C86104wH.A0C(CxM, CxM);
        float f6 = CxM4;
        if (r5 == r12) {
            f6 = CxM3;
        }
        long A0C3 = C86104wH.A0C(f6, f6);
        if (r5 == r12) {
            CxM3 = CxM4;
        }
        return new C876853s(new C1203079q(A002.A01, A002.A03, A002.A02, A002.A00, A0C, A0C2, A0C3, C86104wH.A0C(CxM3, CxM3)));
    }

    public AnonymousClass7X6(C142798fc r1, C142798fc r2, C142798fc r3, C142798fc r4) {
        this.A03 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }
}
