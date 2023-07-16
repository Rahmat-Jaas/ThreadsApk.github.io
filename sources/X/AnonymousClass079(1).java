package X;

import android.os.SystemClock;

/* renamed from: X.079  reason: invalid class name */
public final class AnonymousClass079 extends AnonymousClass0DX {
    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03() {
        return new AnonymousClass07M();
    }

    public final /* bridge */ /* synthetic */ boolean A04(AnonymousClass0DW r3) {
        AnonymousClass07M r32 = (AnonymousClass07M) r3;
        AnonymousClass0DZ.A00(r32);
        r32.A00 = SystemClock.elapsedRealtime();
        r32.A01 = SystemClock.uptimeMillis();
        return true;
    }
}
