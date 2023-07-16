package X;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Callable;

/* renamed from: X.0gt  reason: invalid class name and case insensitive filesystem */
public final class C09890gt implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewTreeObserver A02;
    public final /* synthetic */ Callable A03;

    public C09890gt(Handler handler, View view, ViewTreeObserver viewTreeObserver, Callable callable) {
        this.A00 = handler;
        this.A02 = viewTreeObserver;
        this.A01 = view;
        this.A03 = callable;
    }

    public final boolean onPreDraw() {
        this.A00.removeCallbacksAndMessages((Object) null);
        ViewTreeObserver viewTreeObserver = this.A02;
        if (!viewTreeObserver.isAlive()) {
            viewTreeObserver = this.A01.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        try {
            return ((Boolean) this.A03.call()).booleanValue();
        } catch (Exception e) {
            C10450iM.A06("ViewUtil#runOnNextPreDrawWithTimeout", e.getMessage(), e);
            return true;
        }
    }
}
