package X;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.58g  reason: invalid class name and case insensitive filesystem */
public final class C884858g extends F72 implements AnonymousClass8eG {
    public final Semaphore A00 = new Semaphore(0);
    public final Set A01;

    public final void A03() {
        this.A00.drainPermits();
        A02();
    }

    public final /* bridge */ /* synthetic */ Object A07() {
        int i = 0;
        for (AnonymousClass7AL r1 : this.A01) {
            if (r1 instanceof C93285lJ) {
                C146548mQ r0 = ((C93285lJ) r1).A01;
                if (r0 != null && r0.DBr(this)) {
                    i++;
                }
            } else {
                throw C18240wQ.A0j();
            }
        }
        try {
            this.A00.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public C884858g(Context context, Set set) {
        super(context);
        this.A01 = set;
    }
}
