package X;

import com.facebook.dcp.model.DcpContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.7e1  reason: invalid class name and case insensitive filesystem */
public final class C125797e1 implements C145188k1 {
    public ArrayList A00 = AnonymousClass0wJ.A0v();
    public final C145188k1 A01;
    public final ReentrantLock A02 = new ReentrantLock();

    public C125797e1(C145188k1 r2) {
        C04220Ms.A0B(r2, 2);
        this.A01 = r2;
    }

    public final void A00(DcpContext dcpContext) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            AnonymousClass5Id ALA = this.A01.ALA(dcpContext);
            if (ALA.A02) {
                A0v.addAll((Collection) ALA.A00);
            }
            this.A00 = A0v;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final AnonymousClass5Id ALA(DcpContext dcpContext) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            if (this.A00.isEmpty()) {
                A00(dcpContext);
            }
            return AnonymousClass5Id.A00(this.A00);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String getId() {
        return "CachedAll";
    }
}
