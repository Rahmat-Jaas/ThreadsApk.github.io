package ch.boye.httpclientandroidlib.impl.conn.tsccm;

import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import java.util.Date;
import java.util.concurrent.locks.Condition;

public class WaitingThread {
    public boolean aborted;
    public final Condition cond;
    public final RouteSpecificPool pool;
    public Thread waiter;

    public void interrupt() {
        this.aborted = true;
        this.cond.signalAll();
    }

    public boolean await(Date date) {
        boolean z;
        if (this.waiter != null) {
            StringBuilder A0s = C18190wL.A0s("A thread is already waiting on this object.\ncaller: ");
            A0s.append(Thread.currentThread());
            A0s.append("\nwaiter: ");
            throw C18180wK.A0a(C18200wM.A0m(this.waiter, A0s));
        } else if (!this.aborted) {
            this.waiter = Thread.currentThread();
            if (date != null) {
                z = this.cond.awaitUntil(date);
            } else {
                try {
                    this.cond.await();
                    z = true;
                } catch (Throwable th) {
                    this.waiter = null;
                    throw th;
                }
            }
            if (!this.aborted) {
                this.waiter = null;
                return z;
            }
            throw new InterruptedException("Operation interrupted");
        } else {
            throw new InterruptedException("Operation interrupted");
        }
    }

    public final Condition getCondition() {
        return this.cond;
    }

    public final RouteSpecificPool getPool() {
        return this.pool;
    }

    public final Thread getThread() {
        return this.waiter;
    }

    public void wakeup() {
        if (this.waiter != null) {
            this.cond.signalAll();
            return;
        }
        throw C18180wK.A0a("Nobody waiting on this object.");
    }

    public WaitingThread(Condition condition, RouteSpecificPool routeSpecificPool) {
        if (condition != null) {
            this.cond = condition;
            this.pool = routeSpecificPool;
            return;
        }
        throw C18190wL.A0a("Condition must not be null.");
    }
}
