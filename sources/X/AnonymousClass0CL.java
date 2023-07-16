package X;

import android.os.PowerManager;

/* renamed from: X.0CL  reason: invalid class name */
public final class AnonymousClass0CL implements AnonymousClass0C0 {
    public final AnonymousClass0CD A00;
    public final /* synthetic */ AnonymousClass0CN A01;

    public AnonymousClass0CL(AnonymousClass0CD r1, AnonymousClass0CN r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void BxC() {
        PowerManager.WakeLock wakeLock = this.A01.A00;
        if (wakeLock != null) {
            C13750oF.A02(wakeLock);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r10.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CV4(boolean r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x0017
            X.0CN r1 = r10.A01
            X.0CJ r0 = r1.A07
            if (r0 == 0) goto L_0x0017
            X.0CD r2 = r10.A00
            int r5 = r1.A02
            java.lang.String r4 = r0.A02
            X.0By r3 = r1.A06
            long r6 = r0.A01
            long r8 = r0.A00
            r2.A02(r3, r4, r5, r6, r8)
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CL.CV4(boolean):void");
    }
}
