package X;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7Rq  reason: invalid class name */
public final class AnonymousClass7Rq implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C112486pg A01;
    public final /* synthetic */ C105746dv A02;
    public final /* synthetic */ AtomicBoolean A03;

    public AnonymousClass7Rq(View view, C112486pg r2, C105746dv r3, AtomicBoolean atomicBoolean) {
        this.A02 = r3;
        this.A00 = view;
        this.A03 = atomicBoolean;
        this.A01 = r2;
    }

    public final void onGlobalLayout() {
        View view = this.A00;
        this.A03.set(C18180wK.A1X((((double) (view.getRootView().getHeight() - view.getHeight())) > (((double) view.getRootView().getHeight()) * 0.15d) ? 1 : (((double) (view.getRootView().getHeight() - view.getHeight())) == (((double) view.getRootView().getHeight()) * 0.15d) ? 0 : -1))));
        this.A01.A00();
    }
}
