package X;

import android.os.SystemClock;

/* renamed from: X.0jV  reason: invalid class name and case insensitive filesystem */
public final class C11100jV implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C36988JiL A01;
    public final /* synthetic */ C15320r7 A02;

    public C11100jV(C36988JiL jiL, C15320r7 r2, long j) {
        this.A02 = r2;
        this.A01 = jiL;
        this.A00 = j;
    }

    public final void run() {
        this.A01.A02();
        C15320r7 r4 = this.A02;
        r4.A01 = SystemClock.elapsedRealtime();
        r4.A00.edit().putLong("analytics_phoneid_last_sync_timestamp", this.A00).putBoolean("analytics_is_phoneid_fully_synced", true).apply();
        r4.A08.set(false);
    }
}
