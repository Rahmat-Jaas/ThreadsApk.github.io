package X;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.6m3  reason: invalid class name and case insensitive filesystem */
public final class C110656m3 {
    public IOException A00;
    public boolean A01;
    public final Queue A02 = new LinkedList();
    public final Condition A03;
    public final ReentrantLock A04;
    public final AnonymousClass0YY A05;

    public C110656m3(AnonymousClass0YY r2) {
        this.A05 = r2;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.A04 = reentrantLock;
        this.A03 = reentrantLock.newCondition();
    }
}
