package X;

import android.os.SystemClock;

/* renamed from: X.0aR  reason: invalid class name and case insensitive filesystem */
public final class C06830aR implements C03170Es {
    public final /* synthetic */ AnonymousClass0NA A00;
    public final /* synthetic */ AnonymousClass0Q4 A01;

    public C06830aR(AnonymousClass0NA r1, AnonymousClass0Q4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void BnV(C016507v r14) {
        long j;
        AnonymousClass0NA r7 = this.A00;
        AnonymousClass0Q4 r6 = this.A01;
        if (!AnonymousClass0PE.A04) {
            AnonymousClass0PE.A07.A07("We received a hooked binder on pause call when we are not supposed to be hooked. Marking it on.", new Object[0]);
            AnonymousClass0PE.A04 = true;
        }
        AnonymousClass012 r0 = AnonymousClass012.A07;
        AnonymousClass012 r1 = r14.A0D;
        if (r0.equals(r1)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long currentTimeMillis = System.currentTimeMillis();
            try {
                AnonymousClass0QT r5 = (AnonymousClass0QT) r14;
                boolean z = AnonymousClass0PE.A05;
                r5.A02();
                boolean z2 = r5.A03;
                r5.A02();
                long j2 = -6;
                AnonymousClass0PE.A06 = z2;
                AnonymousClass0PE.A01 = uptimeMillis;
                AnonymousClass0PE.A00 = currentTimeMillis;
                if (z) {
                    j = -6;
                } else {
                    j = -2;
                }
                AnonymousClass0PE.A03 = j;
                if (!z) {
                    j2 = -2;
                }
                AnonymousClass0PE.A02 = j2;
                r5.A02();
                r5.A02();
                r7.CAS(r5);
                C06040Xk r72 = r6.A03;
                C002801h.A02(r72, "Did you call SessionManager.init()?");
                r72.A08(uptimeMillis, currentTimeMillis, z2);
            } catch (AnonymousClass0F9 | ClassCastException e) {
                AnonymousClass0PE.A00(e, "Failed to parse binder info given to on pause. Info: %s", r14);
                C04790Pd.A00();
            }
        } else {
            AnonymousClass0PE.A07.A07("Got binder info from the wrong Activity lifecycle state %s (expected on pause). \n\t State: %s \n\t \n\t Info: %s", r1.A03, r1, r14);
        }
    }
}
