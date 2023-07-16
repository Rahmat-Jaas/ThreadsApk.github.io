package X;

import android.view.Choreographer;
import java.lang.ref.WeakReference;

/* renamed from: X.0hh  reason: invalid class name and case insensitive filesystem */
public final class C10080hh implements Choreographer.FrameCallback {
    public boolean A00;
    public final long A01;
    public final WeakReference A02;

    public final void A00() {
        if (!this.A00) {
            this.A00 = true;
            Choreographer.getInstance().postFrameCallbackDelayed(this, this.A01);
        }
    }

    public final void doFrame(long j) {
        Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) this.A02.get();
        if (frameCallback != null) {
            frameCallback.doFrame(j);
            if (this.A00) {
                Choreographer.getInstance().postFrameCallbackDelayed(this, this.A01);
            }
        }
    }

    public C10080hh(Choreographer.FrameCallback frameCallback, long j) {
        this.A02 = new WeakReference(frameCallback);
        this.A01 = j;
    }
}
