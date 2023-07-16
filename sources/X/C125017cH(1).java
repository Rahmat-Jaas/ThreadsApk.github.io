package X;

import androidx.paging.PageFetcher;
import androidx.paging.PageFetcherSnapshot;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.KtLambdaShape167S0100000_I2;

/* renamed from: X.7cH  reason: invalid class name and case insensitive filesystem */
public final class C125017cH implements C143188gF {
    public final PageFetcherSnapshot A00;
    public final /* synthetic */ PageFetcher A01;

    public C125017cH(PageFetcher pageFetcher, PageFetcherSnapshot pageFetcherSnapshot) {
        this.A01 = pageFetcher;
        this.A00 = pageFetcherSnapshot;
    }

    public final void A53(C1202279h r6) {
        C885959j r1;
        C110276lP r4 = this.A00.A00.A00;
        if (r6 instanceof C885959j) {
            r1 = (C885959j) r6;
        } else {
            r1 = null;
        }
        KtLambdaShape167S0100000_I2 A0u = C86164wN.A0u(r6, 26);
        ReentrantLock reentrantLock = r4.A03;
        reentrantLock.lock();
        if (r1 != null) {
            try {
                r4.A00 = r1;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        A0u.invoke(r4.A02, r4.A01);
        reentrantLock.unlock();
    }
}
