package com.instagram.debug.devoptions.cam;

import X.AnonymousClass006;
import X.AnonymousClass6DV;
import X.AnonymousClass7GN;
import X.AnonymousClass7W3;
import X.C112576pq;
import X.C120387Aa;
import X.C122677Tk;
import X.C122757Ts;
import X.C147188nY;
import X.C81784oM;
import com.facebook.react.uimanager.BaseViewManager;

public final class AnimationSpecKt {
    public static final int DEFAULT_DELAY_MS = 250;
    public static final int EASING_DURATION = 300;
    public static final C122757Ts FastInSlowOutEasing = new C122757Ts(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    public static final int IDLE_DURATION = 50;
    public static final float MAX_Y_OFFSET = 50.0f;
    public static final C122757Ts SlowInFastOutEasing = new C122757Ts(1.0f, 1.0f);

    public static final C81784oM animateHeight(int i, String str, C147188nY r13, int i2, int i3) {
        String str2 = str;
        C147188nY r8 = r13;
        r13.Cvb(-1912260204);
        if ((i3 & 2) != 0) {
            str2 = "animateHeight";
        }
        C112576pq A00 = C120387Aa.A00(r13, str2);
        boolean A12 = C147188nY.A12(r13, Float.valueOf(38.0f), C147188nY.A10(r13, Float.valueOf(10.0f), Integer.valueOf(i), 1618982084));
        AnonymousClass7W3 r5 = (AnonymousClass7W3) r8;
        Object A13 = r5.A13();
        if (A12 || A13 == AnonymousClass7GN.A00) {
            A13 = new AnimationSpecKt$animateHeight$1$1(10.0f, i, 38.0f);
            r5.A14(A13);
        }
        C81784oM A02 = C120387Aa.A02(new C122677Tk(AnonymousClass6DV.A00(AnonymousClass7W3.A0B(r5, A13, false)), AnonymousClass006.A00, (long) 0), A00, r8, str2, 10.0f, 10.0f);
        AnonymousClass7W3.A0w(r5, false);
        return A02;
    }

    public static final C81784oM animateOffset(int i, String str, C147188nY r13, int i2, int i3) {
        String str2 = str;
        C147188nY r8 = r13;
        r13.Cvb(-1925300224);
        if ((i3 & 2) != 0) {
            str2 = "animateOffset";
        }
        C112576pq A00 = C120387Aa.A00(r13, str2);
        boolean A10 = C147188nY.A10(r13, Float.valueOf(20.0f), Integer.valueOf(i), 511388516);
        AnonymousClass7W3 r5 = (AnonymousClass7W3) r8;
        Object A13 = r5.A13();
        if (A10 || A13 == AnonymousClass7GN.A00) {
            A13 = new AnimationSpecKt$animateOffset$1$1(20.0f, i);
            r5.A14(A13);
        }
        C81784oM A02 = C120387Aa.A02(new C122677Tk(AnonymousClass6DV.A00(AnonymousClass7W3.A0B(r5, A13, false)), AnonymousClass006.A00, (long) 0), A00, r8, str2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        AnonymousClass7W3.A0w(r5, false);
        return A02;
    }

    public static final C81784oM animateOffsetY(int i, String str, C147188nY r13, int i2, int i3) {
        String str2 = str;
        C147188nY r8 = r13;
        r13.Cvb(1408747597);
        if ((i3 & 2) != 0) {
            str2 = "animateOffsetY";
        }
        C112576pq A00 = C120387Aa.A00(r13, str2);
        boolean A0y = C147188nY.A0y(r13, Integer.valueOf(i));
        AnonymousClass7W3 r5 = (AnonymousClass7W3) r8;
        Object A13 = r5.A13();
        if (A0y || A13 == AnonymousClass7GN.A00) {
            A13 = new AnimationSpecKt$animateOffsetY$1$1(i);
            r5.A14(A13);
        }
        C81784oM A02 = C120387Aa.A02(new C122677Tk(AnonymousClass6DV.A00(AnonymousClass7W3.A0B(r5, A13, false)), AnonymousClass006.A00, (long) 0), A00, r8, str2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        AnonymousClass7W3.A0w(r5, false);
        return A02;
    }

    public static final C81784oM animateRotation(String str, C147188nY r9, int i, int i2) {
        C147188nY r7 = r9;
        r9.Cvb(24798472);
        if ((i2 & 1) != 0) {
            str = "animateRotation";
        }
        C81784oM A02 = C120387Aa.A02(new C122677Tk(AnonymousClass6DV.A00(AnimationSpecKt$animateRotation$1.INSTANCE), AnonymousClass006.A00, (long) 0), C120387Aa.A00(r9, str), r7, str, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        AnonymousClass7W3.A0z(r7, false);
        return A02;
    }
}
