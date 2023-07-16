package X;

import android.content.Intent;

/* renamed from: X.4Rf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C73174Rf implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ C63863iT A01;

    public /* synthetic */ C73174Rf(Intent intent, C63863iT r2) {
        this.A01 = r2;
        this.A00 = intent;
    }

    public final void run() {
        C63863iT r3 = this.A01;
        Intent intent = this.A00;
        if (C31156GhE.A01() == 0) {
            C10450iM.A03("ModalActivityLauncher", String.format("Status bar height is zero: %s: %s", new Object[]{C18210wN.A0e(r3.A0G), r3.A0H}));
        }
        C10650ih.A02(r3.A0G, intent);
    }
}
