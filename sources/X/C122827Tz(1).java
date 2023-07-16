package X;

import androidx.compose.ui.Alignment;
import java.util.Map;

/* renamed from: X.7Tz  reason: invalid class name and case insensitive filesystem */
public final class C122827Tz implements C145678ku {
    public C81784oM A00;
    public Alignment A01;
    public AnonymousClass69J A02;
    public final C115556vT A03;
    public final C147368pE A04 = C86104wH.A0I(AnonymousClass7WR.A00, new C114336t4(0), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    public final Map A05 = C18220wO.A0y();

    public static long A00(C122827Tz r2) {
        C81784oM r0 = (C81784oM) r2.A05.get(r2.A03.A06.getValue());
        if (r0 != null) {
            return ((C114336t4) r0.getValue()).A00;
        }
        return 0;
    }

    public final Object Aot() {
        return ((C145678ku) this.A03.A04.getValue()).Aot();
    }

    public final Object BFg() {
        return ((C145678ku) this.A03.A04.getValue()).BFg();
    }

    public C122827Tz(C115556vT r4, Alignment alignment, AnonymousClass69J r6) {
        AnonymousClass0wJ.A1Q(alignment, r6);
        this.A03 = r4;
        this.A01 = alignment;
        this.A02 = r6;
    }

    public static long A01(C122827Tz r6, int i) {
        long A002 = AnonymousClass7FV.A00(i, i);
        C81784oM r0 = r6.A00;
        if (r0 == null) {
            r0 = r6.A04;
        }
        return r6.A01.A88(AnonymousClass69J.Ltr, A002, ((C114336t4) r0.getValue()).A00);
    }

    public final /* synthetic */ boolean BZF(Object obj, Object obj2) {
        if (!C04220Ms.A0I(obj, Aot()) || !C04220Ms.A0I(obj2, BFg())) {
            return false;
        }
        return true;
    }
}
