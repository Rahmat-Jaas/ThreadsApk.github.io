package X;

import com.instagram.bloks.hosting.intf.IgBloksScreenRequestCallback;

/* renamed from: X.4OJ  reason: invalid class name */
public final class AnonymousClass4OJ implements Runnable {
    public final /* synthetic */ AnonymousClass1c8 A00;

    public AnonymousClass4OJ(AnonymousClass1c8 r1) {
        this.A00 = r1;
    }

    public final void run() {
        IgBloksScreenRequestCallback igBloksScreenRequestCallback = this.A00.A0B;
        if (igBloksScreenRequestCallback != null) {
            igBloksScreenRequestCallback.A01();
        }
    }
}
