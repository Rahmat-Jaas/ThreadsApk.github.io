package X;

import android.content.Context;

/* renamed from: X.1jG  reason: invalid class name */
public final class AnonymousClass1jG extends C30814GWv {
    public final Context A00;

    public final /* bridge */ /* synthetic */ Object A03(Object[] objArr) {
        C61383Sz A002 = C61383Sz.A00(this.A00);
        if (A002 == null) {
            AnonymousClass0LU.A0B(C67363zQ.__redex_internal_original_name, "error fetching AttributionIdentifiers");
            C10450iM.A03("facebook-sdk", "failed to fetch AttributionIdentifiers");
            return null;
        }
        if (A002.A01 != null) {
            C08360dF.A00().A00(A002.A01);
        }
        C08350dD A003 = C08360dF.A00();
        AnonymousClass0wJ.A13(C18220wO.A0B(A003), "opt_out_ads", A002.A03);
        return null;
    }

    public AnonymousClass1jG(Context context) {
        this.A00 = context;
    }
}
