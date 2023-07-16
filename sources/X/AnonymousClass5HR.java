package X;

import com.instagram.api.schemas.MonetizationEligibilityDecision;

/* renamed from: X.5HR  reason: invalid class name */
public final class AnonymousClass5HR extends AnonymousClass0Sf {
    public final MonetizationEligibilityDecision A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r3 == com.instagram.api.schemas.MonetizationEligibilityDecision.AT_RISK_OF_BECOMING_INELIGIBLE) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass5HR(com.instagram.api.schemas.MonetizationEligibilityDecision r3, boolean r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            r0 = 2
            X.C04220Ms.A0B(r3, r0)
            r2.<init>()
            r2.A02 = r4
            r2.A00 = r3
            r2.A01 = r5
            r2.A03 = r6
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = com.instagram.api.schemas.MonetizationEligibilityDecision.ELIGIBLE
            if (r3 == r0) goto L_0x0018
            com.instagram.api.schemas.MonetizationEligibilityDecision r1 = com.instagram.api.schemas.MonetizationEligibilityDecision.AT_RISK_OF_BECOMING_INELIGIBLE
            r0 = 0
            if (r3 != r1) goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            r2.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5HR.<init>(com.instagram.api.schemas.MonetizationEligibilityDecision, boolean, boolean, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5HR) {
                AnonymousClass5HR r5 = (AnonymousClass5HR) obj;
                if (!(this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A02;
        int i = 1;
        if (z) {
            z = true;
        }
        int A05 = AnonymousClass0wJ.A05(this.A00, (z ? 1 : 0) * true) * 31;
        boolean z2 = this.A01;
        if (z2) {
            z2 = true;
        }
        int i2 = (A05 + (z2 ? 1 : 0)) * 31;
        if (!this.A03) {
            i = 0;
        }
        return i2 + i;
    }
}
