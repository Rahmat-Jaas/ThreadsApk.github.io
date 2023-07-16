package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Callable;

/* renamed from: X.0gr  reason: invalid class name */
public final class AnonymousClass0gr implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener A01;
    public final /* synthetic */ ViewTreeObserver A02;
    public final /* synthetic */ Callable A03;

    public AnonymousClass0gr(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener, ViewTreeObserver viewTreeObserver, Callable callable) {
        this.A02 = viewTreeObserver;
        this.A01 = onPreDrawListener;
        this.A00 = view;
        this.A03 = callable;
    }

    public final void run() {
        ViewTreeObserver viewTreeObserver = this.A02;
        if (!viewTreeObserver.isAlive()) {
            viewTreeObserver = this.A00.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this.A01);
        try {
            this.A03.call();
        } catch (Exception e) {
            C10450iM.A06("ViewUtil#runOnNextPreDrawWithTimeout", e.getMessage(), e);
        }
    }
}
