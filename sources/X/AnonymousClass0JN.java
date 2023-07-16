package X;

import com.facebook.profilo.ipc.TraceContext;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.0JN  reason: invalid class name */
public final class AnonymousClass0JN implements C08010ca {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();

    public final boolean AC3(TraceContext traceContext, File file) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            if (!((C08010ca) it.next()).AC3(traceContext, file)) {
                return false;
            }
        }
        return true;
    }

    public final void BrS() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C08010ca) it.next()).BrS();
        }
    }

    public final void C8y() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C08010ca) it.next()).C8y();
        }
    }

    public final void CDl(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C08010ca) it.next()).CDl(traceContext);
        }
    }

    public final void CDm(TraceContext traceContext, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C08010ca) it.next()).CDm(traceContext, i);
        }
    }

    public final void CPo(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C08010ca) it.next()).CPo(traceContext);
        }
    }

    public final void CPp(int i, int i2, int i3, int i4) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C08010ca) it.next()).CPp(i, i2, i3, i4);
        }
    }

    public final void CPq(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C08010ca) it.next()).CPq(traceContext);
        }
    }

    public final void CPr(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C08010ca) it.next()).CPr(traceContext);
        }
    }

    public final void CPt(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C08010ca) it.next()).CPt(traceContext);
        }
    }

    public final void CPv(TraceContext traceContext, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AnonymousClass0V4) it.next()).CPv(traceContext, i);
        }
    }

    public final void CPw(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AnonymousClass0V4) it.next()).CPw(traceContext);
        }
    }

    public final void CPx(TraceContext traceContext, Throwable th) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AnonymousClass0V4) it.next()).CPx(traceContext, th);
        }
    }

    public final void CPy(TraceContext traceContext) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((AnonymousClass0V4) it.next()).CPy(traceContext);
        }
    }

    public final void CRs(File file, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C05600Uj) it.next()).CRs(file, i);
        }
    }

    public final void CRw(File file) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C05600Uj) it.next()).CRw(file);
        }
    }
}
