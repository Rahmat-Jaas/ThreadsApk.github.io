package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.7Vw  reason: invalid class name and case insensitive filesystem */
public final class C123207Vw implements C146858my {
    public AtomicLong A00 = new AtomicLong(1);
    public AnonymousClass0ZU A01;
    public AnonymousClass0YY A02;
    public AnonymousClass0YY A03;
    public AnonymousClass0YY A04;
    public AnonymousClass0YY A05;
    public AnonymousClass0YM A06;
    public AnonymousClass0Y0 A07;
    public boolean A08;
    public final C147368pE A09 = C86104wH.A0I(AnonymousClass7WR.A00, AnonymousClass4WJ.A0A(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    public final List A0A = AnonymousClass0wJ.A0v();
    public final Map A0B = C18220wO.A0y();

    public final List A00(C146508mM r4) {
        if (!this.A08) {
            C86144wL.A1Q(C86164wN.A0u(r4, 10), this.A0A, 8);
            this.A08 = true;
        }
        return this.A0A;
    }

    public final void D8V(C145708kx r4) {
        Map map = this.A0B;
        Long valueOf = Long.valueOf(((C123197Vu) r4).A02);
        if (map.containsKey(valueOf)) {
            this.A0A.remove(r4);
            map.remove(valueOf);
            AnonymousClass0YY r0 = this.A02;
            if (r0 != null) {
                r0.invoke(valueOf);
            }
        }
    }
}
