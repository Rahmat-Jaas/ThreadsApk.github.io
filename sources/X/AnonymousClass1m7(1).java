package X;

import android.content.Context;

/* renamed from: X.1m7  reason: invalid class name */
public final class AnonymousClass1m7 extends AnonymousClass0gG {
    public final /* synthetic */ Context A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1m7(Context context) {
        super(188, 5, false, false);
        this.A00 = context;
    }

    public final void run() {
        C61383Sz A002;
        if (C18200wM.A0h(C18200wM.A0C(), "google_ad_id") == null && (A002 = C61383Sz.A00(this.A00)) != null) {
            if (A002.A02 != null) {
                C08350dD A003 = C08360dF.A00();
                C18180wK.A0v(C18220wO.A0B(A003), "fb_attribution_id", A002.A02);
            }
            if (A002.A01 != null) {
                C08360dF.A00().A00(A002.A01);
            }
            C08350dD A004 = C08360dF.A00();
            AnonymousClass0wJ.A13(C18220wO.A0B(A004), "opt_out_ads", A002.A03);
        }
    }
}
