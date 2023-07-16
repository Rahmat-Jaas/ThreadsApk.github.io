package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0lL  reason: invalid class name */
public final class AnonymousClass0lL implements C33330Hlk {
    public final /* synthetic */ CountDownLatch A00;
    public final /* synthetic */ AtomicReference A01;

    public AnonymousClass0lL(CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.A01 = atomicReference;
        this.A00 = countDownLatch;
    }

    public final void Br7(GIL gil, Exception exc) {
        if (gil != null) {
            try {
                ModelPathsHolder A002 = gil.A00(VersionedCapability.IiFaceTracker);
                if (A002 != null) {
                    this.A01.set(C116816xb.A01(C29126FiU.A00(A002)));
                    this.A00.countDown();
                }
            } catch (Throwable th) {
                this.A00.countDown();
                throw th;
            }
        }
        this.A01.set(C116816xb.A00(exc));
        this.A00.countDown();
    }
}
