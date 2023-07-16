package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.3Fm  reason: invalid class name and case insensitive filesystem */
public final class C58413Fm {
    public final C021209x A00;
    public final AnonymousClass0YY A01;
    public final AnonymousClass0YY A02;
    public final AnonymousClass0YY A03;
    public final AnonymousClass0YY A04;

    public C58413Fm(C021209x r5) {
        AnonymousClass4Xx r3 = AnonymousClass4Xx.A00;
        AnonymousClass4Xy r2 = AnonymousClass4Xy.A00;
        AnonymousClass4Xz r1 = AnonymousClass4Xz.A00;
        AnonymousClass4Y0 r0 = AnonymousClass4Y0.A00;
        this.A00 = r5;
        this.A01 = r3;
        this.A03 = r2;
        this.A04 = r1;
        this.A02 = r0;
    }

    public final void A00(C81984oq r5, String str, String str2, boolean z) {
        String str3;
        if (z) {
            str3 = "Pass";
        } else {
            str3 = "Fail";
        }
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) this.A01.invoke(this.A00);
        if (AnonymousClass0wJ.A1U(uSLEBaseShape0S0000000)) {
            uSLEBaseShape0S0000000.A0S("promotion_id", AnonymousClass0wJ.A0d(str));
            C18190wL.A1I(uSLEBaseShape0S0000000, str2);
            uSLEBaseShape0S0000000.A0T("eligibility_result", str3);
            if (r5 != null) {
                ImmutableMap ABC = r5.ABC();
                if (!ABC.isEmpty()) {
                    uSLEBaseShape0S0000000.A1g(ABC);
                }
            }
            uSLEBaseShape0S0000000.Bb4();
        }
    }
}
