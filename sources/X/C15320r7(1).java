package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0r7  reason: invalid class name and case insensitive filesystem */
public final class C15320r7 implements C10270i0, C39290Kr1 {
    public SharedPreferences A00;
    public long A01;
    public Context A02;
    public C11640kX A03;
    public String A04;
    public final long A05;
    public final C11140ja A06;
    public final ExecutorService A07;
    public final AtomicBoolean A08 = new AtomicBoolean(false);

    public final void A08(C10300i6 r15) {
        long j;
        if (this.A08.compareAndSet(false, true)) {
            SharedPreferences sharedPreferences = this.A00;
            long j2 = sharedPreferences.getLong("analytics_phoneid_last_sync_timestamp", 0);
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - j2;
            if (sharedPreferences.getBoolean("analytics_is_phoneid_fully_synced", true)) {
                j = 604800000;
            } else {
                j = this.A05;
            }
            if (j3 >= j || currentTimeMillis < j2) {
                Context context = this.A02;
                this.A07.execute(new C11100jV(new C36988JiL(context, this, C15500rQ.A01(r15), new C11120jX(this, r15), C15500rQ.A01(r15), new C11130jZ(context, this.A03.Asq(r15))), this, currentTimeMillis));
            }
        }
    }

    public final void Bku(C10300i6 r1) {
    }

    public C15320r7(Context context, C11640kX r6, String str, long j) {
        this.A02 = context;
        this.A03 = r6;
        this.A04 = str;
        this.A00 = context.getSharedPreferences("analyticsprefs", 0);
        this.A05 = j * 1000;
        this.A07 = new AnonymousClass0gL(447668843, 5, false, false);
        this.A06 = new C11140ja(context);
    }

    private void A07(C10300i6 r3) {
        AnonymousClass3FH B1K = C15500rQ.A01(r3).B1K();
        if (B1K != null) {
            this.A06.A00(r3, B1K.A01);
        }
    }

    public final void Bks(C10300i6 r1) {
        A08(r1);
        A07(r1);
    }
}
