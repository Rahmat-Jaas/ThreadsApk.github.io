package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.0vg  reason: invalid class name and case insensitive filesystem */
public abstract class C17870vg {
    public final C17530v6 A00;
    public final ExecutorService A01;
    public final C17780vW A02;

    public final synchronized void A00(C17510v2 r8) {
        C17530v6 r6 = this.A00;
        C17510v2 A002 = r6.A00(r8);
        if (A002 != null) {
            r6.A04(A002, new C17510v2(A002.A02, A002.A00(), A002.A01 - 10, A002.A00 + 1));
            r6.A02();
        }
    }

    public C17870vg(C12800mV r3, C17780vW r4, ExecutorService executorService) {
        this.A01 = executorService;
        this.A02 = r4;
        this.A00 = new C17530v6(r3.A00(AnonymousClass006.A00));
    }
}
