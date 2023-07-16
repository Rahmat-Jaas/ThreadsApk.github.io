package X;

import java.io.File;

/* renamed from: X.0XB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0XB implements Runnable {
    public final /* synthetic */ AnonymousClass0XE A00;

    public /* synthetic */ AnonymousClass0XB(AnonymousClass0XE r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass0XE r0 = this.A00;
        synchronized (r0.A06) {
            File A002 = AnonymousClass0XA.A00(r0.A04);
            if (A002.exists()) {
                File[] listFiles = A002.listFiles();
                if (listFiles != null) {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
                A002.delete();
            }
        }
    }
}
