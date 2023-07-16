package X;

import android.content.SharedPreferences;

/* renamed from: X.80B  reason: invalid class name */
public final class AnonymousClass80B implements Runnable {
    public final /* synthetic */ C131597sS A00;

    public AnonymousClass80B(C131597sS r1) {
        this.A00 = r1;
    }

    public final void run() {
        C131597sS r8 = this.A00;
        SharedPreferences A0C = C18200wM.A0C();
        long A05 = C18180wK.A05(A0C, "device_info_last_reported_time_foreground");
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass0LU.A0B("fatal", "runForegroundReporters");
        if (currentTimeMillis > A05 + 43200000) {
            for (C144868jQ r4 : r8.A03) {
                AnonymousClass0gN.A00().AKp(new AnonymousClass61I(r8, r4));
            }
            AnonymousClass0wJ.A12(A0C.edit(), "device_info_last_reported_time_foreground", currentTimeMillis);
        }
    }
}
