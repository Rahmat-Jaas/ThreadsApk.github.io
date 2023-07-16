package X;

import java.util.ArrayList;

/* renamed from: X.05e  reason: invalid class name and case insensitive filesystem */
public final class C011305e implements Runnable {
    public final /* synthetic */ C13370nZ A00;
    public final /* synthetic */ C011605j A01;

    public C011305e(C13370nZ r1, C011605j r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C011605j r2 = this.A01;
        ArrayList arrayList = r2.A03;
        C13370nZ r1 = this.A00;
        arrayList.remove(r1);
        r2.A04.remove(r1);
    }
}
