package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0lK  reason: invalid class name and case insensitive filesystem */
public final class C12110lK implements C33331Hll {
    public final /* synthetic */ CountDownLatch A00;
    public final /* synthetic */ AtomicReference A01;

    public C12110lK(CountDownLatch countDownLatch, AtomicReference atomicReference) {
        this.A01 = atomicReference;
        this.A00 = countDownLatch;
    }

    public final void C7X(C31541GrF grF) {
        C04220Ms.A0B(grF, 0);
        grF.A02(new AnonymousClass0lL(this.A00, this.A01), ImmutableList.of(VersionedCapability.IiFaceTracker));
    }
}
