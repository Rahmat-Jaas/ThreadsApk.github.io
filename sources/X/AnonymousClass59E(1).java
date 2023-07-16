package X;

import androidx.navigation.Navigator$Name;
import com.instagram.service.session.UserSession;

@Navigator$Name("barcelonaComposable")
/* renamed from: X.59E  reason: invalid class name */
public final class AnonymousClass59E extends C114586tX {
    public final C147368pE A00;
    public final C147368pE A01;
    public final C112186p9 A02;

    public AnonymousClass59E(C10300i6 r6) {
        Boolean A0X = C18180wK.A0X();
        C112186p9 r3 = null;
        AnonymousClass7WR r2 = AnonymousClass7WR.A00;
        this.A01 = C86104wH.A0I(r2, A0X, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A00 = C86104wH.A0I(r2, A0X, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A02 = r6 instanceof UserSession ? AnonymousClass6N7.A00((UserSession) r6) : r3;
    }
}
