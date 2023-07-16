package X;

import java.util.List;

/* renamed from: X.80T  reason: invalid class name */
public final class AnonymousClass80T implements Runnable {
    public final /* synthetic */ AnonymousClass513 A00;
    public final /* synthetic */ String A01;

    public AnonymousClass80T(AnonymousClass513 r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void run() {
        List<C143248gM> list = this.A00.A05;
        synchronized (list) {
            for (C143248gM CS2 : list) {
                CS2.CS2(this.A01);
            }
        }
    }
}
