package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.6rw  reason: invalid class name and case insensitive filesystem */
public final class C113666rw {
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;

    public C113666rw(ImmutableList immutableList, ImmutableList immutableList2, String str) {
        AnonymousClass3ZT.A02(immutableList, "emailAddresses");
        this.A00 = immutableList;
        this.A02 = str;
        AnonymousClass3ZT.A02(immutableList2, "phoneNumbers");
        this.A01 = immutableList2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C113666rw) {
                C113666rw r5 = (C113666rw) obj;
                if (!AnonymousClass3ZT.A03(this.A00, r5.A00) || !AnonymousClass3ZT.A03(this.A02, r5.A02) || !AnonymousClass3ZT.A03(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((C86124wJ.A0E(this.A00) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A01);
    }
}
