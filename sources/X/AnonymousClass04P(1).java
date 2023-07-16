package X;

import java.util.List;

/* renamed from: X.04P  reason: invalid class name */
public final class AnonymousClass04P implements Runnable {
    public final /* synthetic */ AnonymousClass010 A00;
    public final /* synthetic */ C13370nZ A01;
    public final /* synthetic */ List A02;

    public AnonymousClass04P(AnonymousClass010 r1, C13370nZ r2, List list) {
        this.A00 = r1;
        this.A02 = list;
        this.A01 = r2;
    }

    public final void run() {
        List list = this.A02;
        C13370nZ r2 = this.A01;
        if (list.contains(r2)) {
            list.remove(r2);
            C011505i.A02(r2.A04.mView, r2.A00);
        }
    }
}
