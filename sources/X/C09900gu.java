package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Callable;

/* renamed from: X.0gu  reason: invalid class name and case insensitive filesystem */
public final class C09900gu implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewTreeObserver A01;
    public final /* synthetic */ Callable A02;

    public C09900gu(View view, ViewTreeObserver viewTreeObserver, Callable callable) {
        this.A01 = viewTreeObserver;
        this.A00 = view;
        this.A02 = callable;
    }

    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.A01;
        if (!viewTreeObserver.isAlive()) {
            viewTreeObserver = this.A00.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        try {
            return ((Boolean) this.A02.call()).booleanValue();
        } catch (Exception unused) {
            return true;
        }
    }
}
