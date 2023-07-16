package X;

import android.view.View;

/* renamed from: X.7zd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135527zd implements Runnable {
    public final /* synthetic */ View A00;

    public /* synthetic */ C135527zd(View view) {
        this.A00 = view;
    }

    public final void run() {
        View view = this.A00;
        View view2 = (View) view.getParent();
        if (view2 != null) {
            view2.post(new C20439BbU(view, view2));
        }
    }
}
