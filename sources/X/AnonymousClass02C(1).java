package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.02C  reason: invalid class name */
public final class AnonymousClass02C {
    public final AnonymousClass02B A00;

    public final boolean A00(MotionEvent motionEvent) {
        return ((AnonymousClass036) this.A00).A00.onTouchEvent(motionEvent);
    }

    public AnonymousClass02C(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.A00 = new AnonymousClass036(context, onGestureListener, handler);
    }
}
