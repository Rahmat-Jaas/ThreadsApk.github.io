package X;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: X.84g  reason: invalid class name and case insensitive filesystem */
public final class C1367584g implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C25736Dr2 A01;

    public C1367584g(C25736Dr2 dr2, long j) {
        this.A01 = dr2;
        this.A00 = j;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C25736Dr2 dr2 = this.A01;
        AnonymousClass7JN r4 = dr2.A05;
        C28051Exi acquire = r4.acquire();
        acquire.AAa(1, this.A00);
        C41259M6w m6w = dr2.A02;
        m6w.beginTransaction();
        try {
            Unit A14 = C86124wJ.A14(m6w, acquire);
            r4.release(acquire);
            return A14;
        } catch (Throwable th) {
            m6w.endTransaction();
            r4.release(acquire);
            throw th;
        }
    }
}
