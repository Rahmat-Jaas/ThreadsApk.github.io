package X;

import com.instagram.barcelona.app.BarcelonaAppShell;

/* renamed from: X.0n4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C13130n4 implements Runnable {
    public final /* synthetic */ BarcelonaAppShell A00;

    public /* synthetic */ C13130n4(BarcelonaAppShell barcelonaAppShell) {
        this.A00 = barcelonaAppShell;
    }

    public final void run() {
        BarcelonaAppShell barcelonaAppShell = this.A00;
        if (C07960cV.A05(AnonymousClass0e5.A00(36320768896080088L))) {
            AnonymousClass0UI.A01 = true;
            AnonymousClass0MM A002 = AnonymousClass0MM.A00();
            C15910s8 r0 = new C15910s8(barcelonaAppShell);
            synchronized (A002) {
                A002.A00 = r0;
            }
        }
    }
}
