package X;

import java.util.HashMap;

/* renamed from: X.3Em  reason: invalid class name and case insensitive filesystem */
public final class C58203Em {
    public final long A00;
    public final HashMap A01 = AnonymousClass0wJ.A0y();

    public C58203Em(Iterable iterable, long j) {
        this.A00 = j;
        for (Object A08 : iterable) {
            long A082 = C18190wL.A08(A08);
            HashMap hashMap = this.A01;
            long j2 = A082 / this.A00;
            if (A082 < 0) {
                j2--;
            }
            hashMap.put(Long.valueOf(j2), 3L);
        }
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("BucketizedHashMap(bucketSize=");
        A0s.append(this.A00);
        A0s.append(", bucketIndices=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
