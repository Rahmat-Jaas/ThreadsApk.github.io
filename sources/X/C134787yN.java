package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.7yN  reason: invalid class name and case insensitive filesystem */
public final class C134787yN implements Comparable {
    public final long A00;
    public final String A01;
    public final Set A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C134787yN r8 = (C134787yN) obj;
            if (this.A00 == r8.A00) {
                Set set = this.A02;
                Set set2 = r8.A02;
                if (set != null) {
                    return set.equals(set2);
                }
                return set2 == null;
            }
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C134787yN r7 = (C134787yN) obj;
        r7.getClass();
        long j = this.A00;
        long j2 = r7.A00;
        if (j < j2) {
            return -1;
        }
        if (j != j2) {
            return 1;
        }
        Set set = this.A02;
        if (set == null) {
            set = Collections.emptySet();
        }
        ArrayList A0s = C18200wM.A0s(set);
        Set set2 = r7.A02;
        if (set2 == null) {
            set2 = Collections.emptySet();
        }
        ArrayList A0s2 = C18200wM.A0s(set2);
        Collections.sort(A0s);
        Collections.sort(A0s2);
        int i = 0;
        while (i < A0s.size() && i < A0s2.size()) {
            int compareTo = ((C28964Ff5) A0s.get(i)).compareTo((C28964Ff5) A0s2.get(i));
            if (compareTo != 0) {
                return compareTo;
            }
            i++;
        }
        return 0;
    }

    public final int hashCode() {
        int i;
        int A022 = C18190wL.A02(this.A00) * 31;
        Set set = this.A02;
        if (set != null) {
            i = set.hashCode();
        } else {
            i = 0;
        }
        return A022 + i;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Eligibility{mFirstEligibleTime=");
        A0s.append(this.A00);
        A0s.append(", mRequiredConditions=");
        A0s.append(this.A02);
        A0s.append(", mSource=");
        A0s.append(this.A01);
        return C18190wL.A0o(A0s);
    }

    public C134787yN(String str, Set set, long j) {
        this.A00 = j;
        this.A02 = Collections.unmodifiableSet(set);
        this.A01 = str;
    }

    public final boolean A00(GWa gWa) {
        if (this.A00 > System.currentTimeMillis() || (this.A02.contains(C28964Ff5.NETWORK) && !gWa.A03(false))) {
            return false;
        }
        return true;
    }
}
