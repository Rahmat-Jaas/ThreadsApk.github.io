package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.6ps  reason: invalid class name and case insensitive filesystem */
public final class C112596ps {
    public final int A00;
    public final C147288p6 A01;
    public final AnonymousClass8ch A02;
    public final C147598pb A03;

    public final C113156qq A00(int i, int i2, long j) {
        int i3 = i;
        Object Aql = this.A01.Aql(i3);
        long j2 = j;
        List Bg1 = this.A03.Bg1(j2, i3);
        int A022 = Constraints.A02(j2);
        int A04 = Constraints.A04(j2);
        if (A022 == A04 || Constraints.A01(j2) == (A04 = Constraints.A03(j2))) {
            AnonymousClass7VS r1 = (AnonymousClass7VS) this.A02;
            C04220Ms.A0B(Aql, 1);
            AnonymousClass69J layoutDirection = r1.A04.getLayoutDirection();
            boolean z = r1.A05;
            boolean z2 = r1.A06;
            return new C113156qq(r1.A03, layoutDirection, Aql, Bg1, i3, A04, i2, r1.A01, r1.A00, r1.A02, z, z2);
        }
        throw C18190wL.A0a("Failed requirement.");
    }

    public C112596ps(C147288p6 r1, AnonymousClass8ch r2, C147598pb r3, int i) {
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = i;
        this.A02 = r2;
    }
}
