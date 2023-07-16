package X;

import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4Sm  reason: invalid class name and case insensitive filesystem */
public final class C73454Sm implements Runnable {
    public final int A00;
    public final MobileConfigManagerHolderImpl A01;
    public final AnonymousClass35F A02;
    public final ScheduledExecutorService A03;

    public final void run() {
        AnonymousClass35F r2 = this.A02;
        String A002 = AnonymousClass2R0.A00();
        if (!A002.equals("EMPTY_FAMILY_DEVICE_ID")) {
            this.A01.setFamilyDeviceId(A002);
            return;
        }
        int i = this.A00;
        if (i > 0) {
            ScheduledExecutorService scheduledExecutorService = this.A03;
            scheduledExecutorService.schedule(new C73454Sm(this.A01, r2, scheduledExecutorService, i - 1), 100, TimeUnit.MILLISECONDS);
            return;
        }
        AnonymousClass0LU.A01(C73454Sm.class, "Used up all retries. Fail to update configs with non-empty fdid.");
    }

    public C73454Sm(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl, AnonymousClass35F r2, ScheduledExecutorService scheduledExecutorService, int i) {
        this.A00 = i;
        this.A01 = mobileConfigManagerHolderImpl;
        this.A02 = r2;
        this.A03 = scheduledExecutorService;
    }
}
