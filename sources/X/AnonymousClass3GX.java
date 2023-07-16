package X;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.3GX  reason: invalid class name */
public final class AnonymousClass3GX {
    public final /* synthetic */ C18340wi A00;

    public AnonymousClass3GX(C18340wi r1) {
        this.A00 = r1;
    }

    public final void A01(C41706Ma1 ma1) {
        C18340wi r1 = this.A00;
        r1.A09.A06.A08();
        if (ma1 == C18340wi.A0I) {
            if (!r1.A0D) {
                r1.A05(AnonymousClass006.A00);
            }
            r1.A03();
        }
    }

    public final void A00(View view, int i) {
        int height;
        float f;
        AnonymousClass1Xb r0;
        C18950yD r5;
        C86384xa r3;
        C86384xa r02;
        int top = view.getTop();
        C18340wi r4 = this.A00;
        if (r4.A0E) {
            height = i;
        } else {
            height = view.getHeight();
        }
        if (!r4.A0A || height == 0) {
            f = 1.0f;
        } else {
            f = ((float) (i - top)) / ((float) height);
        }
        r4.A00 = f;
        AnonymousClass32B r03 = r4.A05;
        if (!(r03 == null || (r0 = r03.A00.A07) == null || (r5 = AnonymousClass1Xb.A00(r0).A02) == null || (r3 = r5.A03) == null)) {
            if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                r3.A00(C31163GhW.A06(r5.A01, (int) (((float) r5.A00) * Math.min(f, 1.0f))));
                r02 = r5.A03;
            } else {
                r02 = null;
            }
            r5.setForeground(r02);
        }
        if (r4.A0A) {
            C18340wi.A01(r4, r4.A00);
        }
    }
}
