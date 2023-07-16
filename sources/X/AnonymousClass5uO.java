package X;

import android.os.Handler;
import com.facebook.tigon.TigonError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.KtLambdaShape1S0100200_I2;
import kotlin.jvm.internal.KtLambdaShape3S0100100_I2;

/* renamed from: X.5uO  reason: invalid class name */
public final class AnonymousClass5uO extends K8N {
    public int A00;
    public boolean A01;
    public final Handler A02;
    public final C110656m3 A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5uO(X.J83 r14, X.C36400JTj r15, com.facebook.tigon.TigonXplatService r16, com.facebook.tigon.iface.TigonRequest r17, com.instagram.api.tigon.IGTigonQuickPerformanceLogger r18, X.C36491JXy r19, X.GXK r20, X.C10300i6 r21, X.C39839L2p[] r22, boolean r23) {
        /*
            r13 = this;
            r0 = 6
            r10 = r22
            X.C04220Ms.A0B(r10, r0)
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r11 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = 10
            kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2 r1 = new kotlin.jvm.internal.IDxRImplShape189S0000000_2_I2
            r1.<init>(r5, r0)
            X.6m3 r0 = new X.6m3
            r0.<init>(r1)
            r13.A03 = r0
            android.os.Looper r1 = X.C1189773a.A00(r21)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r13.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5uO.<init>(X.J83, X.JTj, com.facebook.tigon.TigonXplatService, com.facebook.tigon.iface.TigonRequest, com.instagram.api.tigon.IGTigonQuickPerformanceLogger, X.JXy, X.GXK, X.0i6, X.L2p[], boolean):void");
    }

    public final void onBody(ByteBuffer byteBuffer) {
        C04220Ms.A0B(byteBuffer, 0);
        this.A00 += byteBuffer.remaining();
        if (!this.A01) {
            this.A02.post(new C954760w(new KtLambdaShape3S0100100_I2(this.A04.logger.currentMonotonicTimestampNanos(), this, 3)));
            this.A01 = true;
        }
        C110656m3 r2 = this.A03;
        ReentrantLock reentrantLock = r2.A04;
        reentrantLock.lock();
        try {
            r2.A02.add(byteBuffer);
            r2.A03.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void onBodyBytesGenerated(long j) {
        A0D(new KtLambdaShape3S0100100_I2(j, this, 4));
    }

    /* JADX INFO: finally extract failed */
    public final void onEOM(C39476KuL kuL) {
        C04220Ms.A0B(kuL, 0);
        C110656m3 r2 = this.A03;
        ReentrantLock reentrantLock = r2.A04;
        reentrantLock.lock();
        try {
            r2.A01 = true;
            r2.A03.signalAll();
            reentrantLock.unlock();
            A0D(C86154wM.A11(kuL, this, 40));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void onFirstByteFlushed(long j) {
        A0D(new KtLambdaShape3S0100100_I2(j, this, 5));
    }

    public final void onHeaderBytesReceived(long j, long j2) {
        A0D(new KtLambdaShape1S0100200_I2(this, 0, j, j2));
    }

    public final void onLastByteAcked(long j, long j2) {
        A0D(new KtLambdaShape1S0100200_I2(this, 1, j, j2));
    }

    public final void onResponse(C36024JDp jDp) {
        C04220Ms.A0B(jDp, 0);
        A0D(C86154wM.A11(jDp, this, 41));
    }

    public final int A0B() {
        return this.A00;
    }

    /* JADX INFO: finally extract failed */
    public final void onError(TigonError tigonError, C39476KuL kuL) {
        AnonymousClass0wJ.A1N(tigonError, kuL);
        C110656m3 r2 = this.A03;
        IOException A0V = C86154wM.A0V(tigonError.mAnalyticsDetail);
        ReentrantLock reentrantLock = r2.A04;
        reentrantLock.lock();
        try {
            r2.A00 = A0V;
            r2.A03.signalAll();
            reentrantLock.unlock();
            A0D(C86154wM.A15(tigonError, this, kuL, 21));
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void onWillRetry(TigonError tigonError, C39476KuL kuL) {
        AnonymousClass0wJ.A1N(tigonError, kuL);
        A0D(C86154wM.A15(tigonError, this, kuL, 22));
    }
}
