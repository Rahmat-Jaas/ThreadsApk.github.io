package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.79G  reason: invalid class name */
public final class AnonymousClass79G {
    public static final AnonymousClass79G A01 = new AnonymousClass79G(new AnonymousClass86X(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
    public final AnonymousClass86X A00;

    public /* synthetic */ AnonymousClass79G(AnonymousClass86X r2) {
        this.A00 = r2;
        if (!(!Float.isNaN(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER))) {
            throw C18190wL.A0a("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass79G) && C04220Ms.A0I(this.A00, ((AnonymousClass79G) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A00, C86134wK.A03(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("ProgressBarRangeInfo(current=");
        A0s.append(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        A0s.append(", range=");
        A0s.append(this.A00);
        A0s.append(", steps=");
        A0s.append(0);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
