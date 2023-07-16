package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.04f  reason: invalid class name and case insensitive filesystem */
public final class C009504f implements Runnable {
    public final /* synthetic */ Fragment A00;

    public C009504f(Fragment fragment) {
        this.A00 = fragment;
    }

    public final void run() {
        this.A00.callStartTransitionListener(false);
    }
}
