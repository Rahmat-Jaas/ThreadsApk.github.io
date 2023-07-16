package X;

import android.content.Context;

/* renamed from: X.80V  reason: invalid class name */
public final class AnonymousClass80V implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass7Ep A01;

    public AnonymousClass80V(Context context, AnonymousClass7Ep r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    public final void run() {
        AnonymousClass7Ep r2 = this.A01;
        Context context = this.A00;
        int i = r2.A00 - 1;
        r2.A00 = i;
        if (i == 0 && r2.A01 != null) {
            if (r2.A06 != null) {
                synchronized (r2) {
                    if (r2.A04 != null) {
                        AnonymousClass0MI.A05(AnonymousClass0MU.A6N);
                        AnonymousClass0MI.A05(AnonymousClass0MU.A6M);
                        r2.A04 = null;
                    }
                }
                context.unbindService(r2.A01);
            }
            r2.A03.quit();
            r2.A01 = null;
            r2.A06 = null;
            r2.A03 = null;
            r2.A02 = null;
        }
    }
}
