package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.7mD  reason: invalid class name and case insensitive filesystem */
public final class C129627mD implements C143868hR, C143888hT, C143898hU {
    public final CountDownLatch A00 = new CountDownLatch(1);

    public final void Bnw() {
        this.A00.countDown();
    }

    public final void ByD(Exception exc) {
        this.A00.countDown();
    }

    public final void onSuccess(Object obj) {
        this.A00.countDown();
    }

    public /* synthetic */ C129627mD(AnonymousClass6Cv r3) {
    }

    public C129627mD() {
    }
}
