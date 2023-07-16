package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.508  reason: invalid class name */
public final class AnonymousClass508 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ AnonymousClass7Rj A00;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public AnonymousClass508(AnonymousClass7Rj r1) {
        this.A00 = r1;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        double max;
        AnonymousClass7Rj r4 = this.A00;
        Integer num = r4.A00;
        if (num == AnonymousClass006.A0N) {
            return false;
        }
        double d = (double) f2;
        if (num == AnonymousClass006.A0C) {
            max = Math.min(d, -2000.0d);
        } else {
            max = Math.max(d, 2000.0d);
        }
        AnonymousClass7Rj.A00(r4, max);
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Integer num;
        AnonymousClass7Rj r4 = this.A00;
        if (f2 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            num = AnonymousClass006.A0C;
        } else {
            num = AnonymousClass006.A00;
        }
        r4.A00 = num;
        View view = r4.A01;
        float max = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, view.getTranslationY() - f2);
        if (Float.compare(max, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) == 0) {
            r4.A00 = AnonymousClass006.A0N;
        }
        view.setTranslationY(max);
        return true;
    }
}
