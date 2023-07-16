package X;

import com.fbpay.hub.transactions.api.UpcomingPayout;
import com.google.common.collect.ImmutableList;

/* renamed from: X.78p  reason: invalid class name and case insensitive filesystem */
public final class C1201178p {
    public final UpcomingPayout A00;
    public final ImmutableList A01;
    public final String A02;

    public C1201178p(UpcomingPayout upcomingPayout, ImmutableList immutableList, String str) {
        this.A02 = str;
        AnonymousClass3ZT.A02(immutableList, "transactions");
        this.A01 = immutableList;
        this.A00 = upcomingPayout;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1201178p) {
                C1201178p r5 = (C1201178p) obj;
                if (!AnonymousClass3ZT.A03(this.A02, r5.A02) || !AnonymousClass3ZT.A03(this.A01, r5.A01) || !AnonymousClass3ZT.A03(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((C86124wJ.A0E(this.A02) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A00);
    }

    public C1201178p(C107386gf r3) {
        this.A02 = r3.A01;
        ImmutableList immutableList = r3.A00;
        AnonymousClass3ZT.A02(immutableList, "transactions");
        this.A01 = immutableList;
        this.A00 = null;
    }
}
