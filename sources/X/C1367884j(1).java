package X;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: X.84j  reason: invalid class name and case insensitive filesystem */
public final class C1367884j implements Callable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C25633DpA A01;
    public final /* synthetic */ String A02;

    public C1367884j(C25633DpA dpA, String str, float f) {
        this.A01 = dpA;
        this.A00 = f;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C25633DpA dpA = this.A01;
        AnonymousClass7JN r4 = dpA.A05;
        C28051Exi acquire = r4.acquire();
        acquire.AAY(1, (double) this.A00);
        C86144wL.A1F(acquire, this.A02, 2);
        C41259M6w m6w = dpA.A02;
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
