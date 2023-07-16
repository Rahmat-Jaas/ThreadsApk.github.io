package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.79u  reason: invalid class name and case insensitive filesystem */
public abstract class C1203479u {
    public final float A01(int i) {
        if (this instanceof AnonymousClass52c) {
            AnonymousClass52c r1 = (AnonymousClass52c) this;
            if (i == 0) {
                return r1.A00;
            }
            if (i == 1) {
                return r1.A01;
            }
            if (i == 2) {
                return r1.A02;
            }
            if (i == 3) {
                return r1.A03;
            }
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else if (this instanceof AnonymousClass52b) {
            AnonymousClass52b r12 = (AnonymousClass52b) this;
            if (i == 0) {
                return r12.A00;
            }
            if (i == 1) {
                return r12.A01;
            }
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        } else {
            AnonymousClass52a r0 = (AnonymousClass52a) this;
            if (i == 0) {
                return r0.A00;
            }
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
    }

    public final int A02() {
        if (this instanceof AnonymousClass52c) {
            return 4;
        }
        if (this instanceof AnonymousClass52b) {
            return 2;
        }
        return 1;
    }

    public final C1203479u A03() {
        if (this instanceof AnonymousClass52c) {
            return new AnonymousClass52c(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        if (this instanceof AnonymousClass52b) {
            return new AnonymousClass52b(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        return new AnonymousClass52a(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final void A04(int i, float f) {
        if (this instanceof AnonymousClass52c) {
            AnonymousClass52c r1 = (AnonymousClass52c) this;
            if (i == 0) {
                r1.A00 = f;
            } else if (i == 1) {
                r1.A01 = f;
            } else if (i == 2) {
                r1.A02 = f;
            } else if (i == 3) {
                r1.A03 = f;
            }
        } else if (this instanceof AnonymousClass52b) {
            AnonymousClass52b r12 = (AnonymousClass52b) this;
            if (i == 0) {
                r12.A00 = f;
            } else if (i == 1) {
                r12.A01 = f;
            }
        } else {
            AnonymousClass52a r0 = (AnonymousClass52a) this;
            if (i == 0) {
                r0.A00 = f;
            }
        }
    }

    public static C1203479u A00(C1203479u r1) {
        C1203479u A03 = r1.A03();
        C04220Ms.A0C(A03, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return A03;
    }
}
