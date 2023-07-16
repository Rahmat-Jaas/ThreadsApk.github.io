package X;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.6uj  reason: invalid class name and case insensitive filesystem */
public final class C115236uj {
    public boolean A00;
    public final List A01 = AnonymousClass0wJ.A0v();
    public final ReentrantLock A02 = new ReentrantLock();
    public final AnonymousClass0ZU A03;
    public final AnonymousClass0YY A04;

    public final void A00(Object obj) {
        AnonymousClass0ZU r0 = this.A03;
        boolean z = true;
        if (r0 != null && AnonymousClass0wJ.A1X(r0.invoke())) {
            A02();
        }
        if (!this.A00) {
            ReentrantLock reentrantLock = this.A02;
            reentrantLock.lock();
            try {
                if (!this.A00) {
                    this.A01.add(obj);
                    z = false;
                }
                if (!z) {
                    return;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        this.A04.invoke(obj);
    }

    public final void A01(Object obj) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            this.A01.remove(obj);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean A02() {
        boolean z = false;
        if (!this.A00) {
            ReentrantLock reentrantLock = this.A02;
            reentrantLock.lock();
            try {
                if (this.A00) {
                    return false;
                }
                z = true;
                this.A00 = true;
                List list = this.A01;
                List<Object> A0N = AnonymousClass00J.A0N(list);
                list.clear();
                reentrantLock.unlock();
                AnonymousClass0YY r2 = this.A04;
                for (Object invoke : A0N) {
                    r2.invoke(invoke);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return z;
    }

    public C115236uj(AnonymousClass0ZU r2, AnonymousClass0YY r3) {
        this.A04 = r3;
        this.A03 = r2;
    }
}
