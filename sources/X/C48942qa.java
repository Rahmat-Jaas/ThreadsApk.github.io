package X;

import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.2qa  reason: invalid class name and case insensitive filesystem */
public final class C48942qa {
    public static final void A00(C34640IcN icN, C63873iU r6, RegFlowExtras regFlowExtras, C07530bf r8) {
        AnonymousClass0wJ.A1N(r8, icN);
        String str = regFlowExtras.A0J;
        AnonymousClass4KS r3 = new AnonymousClass4KS(icN, r6, regFlowExtras, r8);
        if (str == null || !AnonymousClass0RA.A0C.A09(new AnonymousClass4KI(), (C04850Pk) null, r3, str)) {
            C10450iM.A03("SecondaryAccountApi", AnonymousClass00U.A0L("Failed to add create secondary account operation in non-linking simple SAC. Last logged-in userid is: ", str));
        }
    }
}
