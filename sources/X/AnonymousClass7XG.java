package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7XG  reason: invalid class name */
public final class AnonymousClass7XG implements C146088lc {
    public final C967266l A00;

    public AnonymousClass7XG(C967266l r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final long CBp(long j, long j2, int i) {
        if (i != 2) {
            return AnonymousClass7KC.A03;
        }
        C967266l r1 = this.A00;
        C04220Ms.A0B(r1, 1);
        if (r1 == C967266l.Vertical) {
            return C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, AnonymousClass7KC.A02(j2));
        }
        return C86104wH.A0C(AnonymousClass7KC.A01(j2), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final Object CBn(C146958n9 r4, long j, long j2) {
        long A0C;
        C967266l r1 = this.A00;
        C04220Ms.A0B(r1, 1);
        if (r1 == C967266l.Vertical) {
            A0C = C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Float.intBitsToFloat(C86104wH.A08(j2)));
        } else {
            A0C = C86104wH.A0C(C86104wH.A00(j2), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        return new AnonymousClass7HA(A0C);
    }

    public final /* synthetic */ Object CBr(C146958n9 r4, long j) {
        return new AnonymousClass7HA(AnonymousClass7HA.A01);
    }

    public final /* synthetic */ long CBu(long j, int i) {
        return AnonymousClass7KC.A03;
    }
}
