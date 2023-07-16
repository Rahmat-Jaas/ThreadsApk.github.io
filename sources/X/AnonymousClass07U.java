package X;

import com.facebook.profilo.ipc.TraceContext;
import java.io.File;

/* renamed from: X.07U  reason: invalid class name */
public final class AnonymousClass07U extends AnonymousClass0JP {
    public final /* synthetic */ AnonymousClass0UG A00;

    public AnonymousClass07U(AnonymousClass0UG r1) {
        this.A00 = r1;
    }

    public final boolean AC3(TraceContext traceContext, File file) {
        boolean z;
        String str = traceContext.A0D;
        AnonymousClass0UG r2 = this.A00;
        if (!str.equals(r2.A01)) {
            return true;
        }
        synchronized (r2) {
            r2.A02 = true;
            r2.A00 = file;
            r2.notifyAll();
            C08000cZ.A00().A07(this);
            z = r2.A03;
        }
        return z;
    }

    public final void CPv(TraceContext traceContext, int i) {
        AnonymousClass0UG r1 = this.A00;
        synchronized (r1) {
            r1.A02 = true;
            r1.notifyAll();
            C08000cZ.A00().A07(this);
        }
    }
}
