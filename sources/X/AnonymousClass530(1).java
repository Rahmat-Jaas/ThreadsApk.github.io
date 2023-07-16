package X;

import java.util.Set;

/* renamed from: X.530  reason: invalid class name */
public final class AnonymousClass530 extends C115506vH {
    public Set A00;
    public final int A01;
    public final C147368pE A02;
    public final Set A03 = C86134wK.A0u();
    public final boolean A04;
    public final /* synthetic */ AnonymousClass7W3 A05;

    public AnonymousClass530(AnonymousClass7W3 r4, int i, boolean z) {
        this.A05 = r4;
        this.A01 = i;
        this.A04 = z;
        C41622MVu mVu = C41622MVu.A02;
        C04220Ms.A0C(mVu, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        this.A02 = C86104wH.A0I(AnonymousClass7WR.A00, mVu, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public final void A0B() {
        Set<AnonymousClass7W3> set = this.A03;
        if (C18190wL.A1a(set)) {
            Set<Set> set2 = this.A00;
            if (set2 != null) {
                for (AnonymousClass7W3 r3 : set) {
                    for (Set remove : set2) {
                        remove.remove(r3.A0g);
                    }
                }
            }
            set.clear();
        }
    }
}
