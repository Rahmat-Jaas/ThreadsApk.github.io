package X;

import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.bds.components.header.EnterAlwaysState;

/* renamed from: X.7XH  reason: invalid class name */
public final class AnonymousClass7XH implements C146088lc {
    public final /* synthetic */ EnterAlwaysState A00;

    public AnonymousClass7XH(EnterAlwaysState enterAlwaysState) {
        this.A00 = enterAlwaysState;
    }

    public final Object CBn(C146958n9 r4, long j, long j2) {
        EnterAlwaysState enterAlwaysState = this.A00;
        if (!enterAlwaysState.A00) {
            return new AnonymousClass7HA(AnonymousClass7HA.A01);
        }
        return enterAlwaysState.A02(enterAlwaysState.A02, r4, Float.intBitsToFloat(C86104wH.A08(j2)));
    }

    public final long CBp(long j, long j2, int i) {
        EnterAlwaysState enterAlwaysState = this.A00;
        if (!enterAlwaysState.A00 || AnonymousClass7KC.A02(j2) < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return AnonymousClass7KC.A03;
        }
        return C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, enterAlwaysState.A01(EnterAlwaysState.A00(enterAlwaysState) - AnonymousClass7KC.A02(j2)));
    }

    public final /* synthetic */ Object CBr(C146958n9 r4, long j) {
        return new AnonymousClass7HA(AnonymousClass7HA.A01);
    }

    public final long CBu(long j, int i) {
        EnterAlwaysState enterAlwaysState = this.A00;
        if (!enterAlwaysState.A00 || AnonymousClass7KC.A02(j) > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return AnonymousClass7KC.A03;
        }
        return C86104wH.A0C(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, enterAlwaysState.A01(EnterAlwaysState.A00(enterAlwaysState) - AnonymousClass7KC.A02(j)));
    }
}
