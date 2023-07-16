package X;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.66D  reason: invalid class name */
public final class AnonymousClass66D extends InputStream {
    public Long A00;
    public final ByteBuffer A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicBoolean A03;
    public final Condition A04;
    public final Condition A05;
    public final Lock A06;

    private void A00(String str, Condition condition) {
        try {
            if (!condition.await(this.A00.longValue(), TimeUnit.MILLISECONDS)) {
                throw C86154wM.A0V(str);
            }
        } catch (InterruptedException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A01() {
        AtomicBoolean atomicBoolean = this.A03;
        atomicBoolean.set(true);
        Lock lock = this.A06;
        lock.lock();
        try {
            ByteBuffer byteBuffer = this.A01;
            byteBuffer.flip();
            this.A04.signalAll();
            A00("Timeout while waiting for read.", this.A05);
            byteBuffer.clear();
            lock.unlock();
            atomicBoolean.set(false);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public final int available() {
        return this.A01.position();
    }

    /* JADX INFO: finally extract failed */
    public final int read() {
        AtomicBoolean atomicBoolean = this.A02;
        if (!atomicBoolean.get()) {
            Lock lock = this.A06;
            lock.lock();
            do {
                try {
                    if (this.A03.get() && this.A01.hasRemaining()) {
                        break;
                    }
                    this.A05.signalAll();
                    if (!atomicBoolean.get()) {
                        A00("Timeout while waiting for write.", this.A04);
                    }
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            } while (!atomicBoolean.get());
            lock.unlock();
            if (!atomicBoolean.get()) {
                return this.A01.get() & 255;
            }
        }
        return -1;
    }

    public AnonymousClass66D(Long l, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.A06 = reentrantLock;
        this.A04 = reentrantLock.newCondition();
        this.A03 = new AtomicBoolean(false);
        this.A05 = reentrantLock.newCondition();
        this.A00 = l;
        this.A01 = ByteBuffer.allocate(i);
    }

    public final void close() {
        A01();
        this.A02.set(true);
        Lock lock = this.A06;
        lock.lock();
        try {
            this.A04.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
