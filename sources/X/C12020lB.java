package X;

import android.os.Looper;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0lB  reason: invalid class name and case insensitive filesystem */
public final class C12020lB {
    public final C09300fC A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public final long A02;
    public final C03720Kl A03;
    public final AnonymousClass0WT A04;
    public final Thread A05;
    public final Random A06;

    public static boolean A00(AnonymousClass0WA r3, C12020lB r4) {
        int i = (int) r3.A07;
        if (r3.A0L || i <= 1 || r4.A06.nextInt(i) == 0) {
            return false;
        }
        return true;
    }

    public final AnonymousClass0WA A01(int i) {
        AnonymousClass0WT r1 = this.A04;
        long j = this.A02;
        if (r1.CYu((int) j) == Integer.MAX_VALUE) {
            return null;
        }
        AnonymousClass0WA r3 = new AnonymousClass0WA();
        r3.A00 = i;
        r3.A0E = j;
        boolean z = false;
        if (this.A05 == Thread.currentThread()) {
            z = true;
        }
        r3.A0J = z;
        r3.A0F = this.A03.nowNanos();
        return r3;
    }

    public final void A03(AnonymousClass0WA r6) {
        r6.A07 = this.A04.B8d(r6.A00);
        if (!A00(r6, this)) {
            C09300fC r2 = this.A00;
            C09350fH A002 = C09300fC.A00(r6, r2, "MARKER_ANNOTATE_TIME", this.A03.nowNanos() - r6.A0F);
            if (C09300fC.A04(r2)) {
                r2.A00.execute(A002);
                r2.A02.set(false);
            }
        }
    }

    public final void A04(AnonymousClass0WA r6) {
        r6.A07 = this.A04.B8d(r6.A00);
        if (!A00(r6, this)) {
            C09300fC r2 = this.A00;
            C09350fH A002 = C09300fC.A00(r6, r2, "MARKER_POINT_TIME", this.A03.nowNanos() - r6.A0F);
            if (C09300fC.A04(r2)) {
                C09300fC.A02(r6, r2, A002);
                r2.A00.execute(A002);
                r2.A02.set(false);
            }
        }
    }

    public final void A06(Throwable th) {
        ((C14750q5) this.A00.A03.get()).A00.CuY("qpl", "error", th);
    }

    public C12020lB(C03720Kl r3, AnonymousClass0WT r4, C09300fC r5, Random random) {
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = random;
        this.A00 = r5;
        this.A02 = r4.B8d(27787270);
        this.A05 = Looper.getMainLooper().getThread();
    }

    public final void A02(AnonymousClass0WA r6) {
        if (!A00(r6, this)) {
            C09300fC r2 = this.A00;
            C09350fH A002 = C09300fC.A00(r6, r2, "MARK_EVENT_TIME", (this.A03.nowNanos() - r6.A0F) + r6.A02);
            if (C09300fC.A04(r2)) {
                C09300fC.A02(r6, r2, A002);
                r2.A00.execute(A002);
                r2.A02.set(false);
            }
        }
    }

    public final void A05(AnonymousClass0WA r5, long j) {
        if (!A00(r5, this)) {
            C09300fC r3 = this.A00;
            C09350fH A002 = C09300fC.A00(r5, r3, "MARKER_START_TIME", j - r5.A0F);
            if (C09300fC.A04(r3)) {
                A002.A05("event_was_restarted", r5.A0K);
                C09300fC.A02(r5, r3, A002);
                r3.A00.execute(A002);
                r3.A02.set(false);
            }
        }
    }
}
