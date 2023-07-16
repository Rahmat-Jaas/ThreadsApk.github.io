package X;

import android.content.Context;

/* renamed from: X.61c  reason: invalid class name and case insensitive filesystem */
public final class C955361c extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C955361c(C697249u r7) {
        super("AttestationPlayIntegrityPeriodicCancel", 2030374634, 3, false, true);
        this.A00 = r7;
    }

    public final void loggedRun() {
        Context context = this.A00.A05;
        C04220Ms.A0B(context, 0);
        C41250M5i.A00(context).A09("PlayIntegrityAttestationScheduler");
    }
}
