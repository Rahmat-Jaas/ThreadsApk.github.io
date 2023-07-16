package X;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;

/* renamed from: X.096  reason: invalid class name */
public final class AnonymousClass096 implements Runnable, AnonymousClass009, ViewTreeObserver.OnDrawListener {
    public boolean A00 = false;
    public Runnable A01;
    public final long A02 = (SystemClock.uptimeMillis() + 10000);
    public final /* synthetic */ ComponentActivity A03;

    public AnonymousClass096(ComponentActivity componentActivity) {
        this.A03 = componentActivity;
    }

    public final void A5H() {
        ComponentActivity componentActivity = this.A03;
        componentActivity.getWindow().getDecorView().removeCallbacks(this);
        componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    public final void DAW(View view) {
        if (!this.A00) {
            this.A00 = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public final void execute(Runnable runnable) {
        this.A01 = runnable;
        View decorView = this.A03.getWindow().getDecorView();
        if (!this.A00) {
            decorView.postOnAnimation(new AnonymousClass00A(this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    public final void onDraw() {
        ComponentActivity componentActivity;
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
            this.A01 = null;
            componentActivity = this.A03;
            if (componentActivity.mFullyDrawnReporter.A01()) {
                this.A00 = false;
            } else {
                return;
            }
        } else if (SystemClock.uptimeMillis() > this.A02) {
            this.A00 = false;
            componentActivity = this.A03;
        } else {
            return;
        }
        componentActivity.getWindow().getDecorView().post(this);
    }

    public final void run() {
        this.A03.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
