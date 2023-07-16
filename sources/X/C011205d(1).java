package X;

import java.util.ArrayList;

/* renamed from: X.05d  reason: invalid class name and case insensitive filesystem */
public final class C011205d implements Runnable {
    public final /* synthetic */ C13370nZ A00;
    public final /* synthetic */ C011605j A01;

    public C011205d(C13370nZ r1, C011605j r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        ArrayList arrayList = this.A01.A03;
        C13370nZ r2 = this.A00;
        if (arrayList.contains(r2)) {
            C011505i.A02(r2.A04.mView, r2.A00);
        }
    }
}
