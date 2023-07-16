package X;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.6rr  reason: invalid class name and case insensitive filesystem */
public final class C113636rr {
    public long A00 = AnonymousClass7KC.A03;
    public final C1199477t A01 = new C1199477t((Integer) null, (DefaultConstructorMarker) null, 3, false);
    public final C1199477t A02 = new C1199477t((Integer) null, (DefaultConstructorMarker) null, 3, false);

    public final void A00() {
        C1199477t r2 = this.A01;
        C114536tS[] r1 = r2.A02;
        Arrays.fill(r1, 0, r1.length, (Object) null);
        r2.A00 = 0;
        C1199477t r22 = this.A02;
        C114536tS[] r12 = r22.A02;
        Arrays.fill(r12, 0, r12.length, (Object) null);
        r22.A00 = 0;
    }

    public final void A01(long j, long j2) {
        C1199477t r1 = this.A01;
        float A012 = AnonymousClass7KC.A01(j2);
        int i = (r1.A00 + 1) % 20;
        r1.A00 = i;
        C114536tS[] r12 = r1.A02;
        C114536tS r0 = r12[i];
        if (r0 == null) {
            r12[i] = new C114536tS(j, A012);
        } else {
            r0.A01 = j;
            r0.A00 = A012;
        }
        C1199477t r13 = this.A02;
        float A022 = AnonymousClass7KC.A02(j2);
        int i2 = (r13.A00 + 1) % 20;
        r13.A00 = i2;
        C114536tS[] r14 = r13.A02;
        C114536tS r02 = r14[i2];
        if (r02 == null) {
            r14[i2] = new C114536tS(j, A022);
            return;
        }
        r02.A01 = j;
        r02.A00 = A022;
    }
}
