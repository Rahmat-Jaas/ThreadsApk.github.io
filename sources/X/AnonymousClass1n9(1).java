package X;

import android.content.Context;

/* renamed from: X.1n9  reason: invalid class name */
public final class AnonymousClass1n9 extends C12140lP {
    public final /* synthetic */ C697249u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1n9(C697249u r7) {
        super("maybeInitializeMobileBoostProvider", 384, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        C697249u r0 = this.A00;
        try {
            Context context = r0.A05;
            C40082LJs.A00(context).A03(context, AnonymousClass01V.A0p, r0.A06);
        } catch (Throwable th) {
            C10450iM.A06(C697249u.__redex_internal_original_name, "failed to initialize mobileboost", th);
        }
    }
}
