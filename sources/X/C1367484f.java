package X;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: X.84f  reason: invalid class name and case insensitive filesystem */
public final class C1367484f implements Callable {
    public final /* synthetic */ C41253M5p A00;
    public final /* synthetic */ String A01;

    public C1367484f(C41253M5p m5p, String str) {
        this.A00 = m5p;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C41253M5p m5p = this.A00;
        AnonymousClass7JN r3 = m5p.A08;
        C28051Exi acquire = r3.acquire();
        C86144wL.A1F(acquire, this.A01, 1);
        C41259M6w m6w = m5p.A07;
        m6w.beginTransaction();
        try {
            Unit A14 = C86124wJ.A14(m6w, acquire);
            r3.release(acquire);
            return A14;
        } catch (Throwable th) {
            m6w.endTransaction();
            r3.release(acquire);
            throw th;
        }
    }
}
