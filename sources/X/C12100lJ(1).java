package X;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0lJ  reason: invalid class name and case insensitive filesystem */
public final class C12100lJ {
    public static final Map A00(Context context, C10300i6 r6) {
        C04220Ms.A0B(r6, 1);
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        GU3.A00(context, r6).A01(new C12110lK(countDownLatch, atomicReference), D3R.A01);
        try {
            countDownLatch.await();
            C112136p3 r0 = (C112136p3) atomicReference.get();
            if (r0 != null) {
                return r0.A00();
            }
            throw new AnonymousClass6CQ("Model load failed due to an unspecified error.");
        } catch (InterruptedException e) {
            throw new AnonymousClass6CQ("Model load was interrupted.", e);
        }
    }

    public static final void A01(Context context, C33330Hlk hlk, C10300i6 r4) {
        GU3.A00(context, r4).A01(new C12130lN(hlk), D3R.A01);
    }
}
