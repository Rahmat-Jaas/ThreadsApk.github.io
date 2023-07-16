package X;

import com.instagram.barcelona.R;

/* renamed from: X.5I9  reason: invalid class name */
public final class AnonymousClass5I9 extends AnonymousClass0Sf {
    public static final AnonymousClass5I9 A05 = new AnonymousClass5I9(C94525vd.A00, R.drawable.barcelona_activity_outline_26, R.drawable.barcelona_activity_filled_26, 2131822206);
    public static final AnonymousClass5I9 A06 = new AnonymousClass5I9(AnonymousClass5w0.A00, R.drawable.barcelona_creation_filled_26, R.drawable.barcelona_creation_filled_26, 2131822207);
    public static final AnonymousClass5I9 A07 = new AnonymousClass5I9(C94575vi.A00, R.drawable.barcelona_home_outline_26, R.drawable.barcelona_home_filled_26, 2131822208);
    public static final AnonymousClass5I9 A08 = new AnonymousClass5I9(C94615vm.A00, R.drawable.barcelona_profile_outline_26, R.drawable.barcelona_profile_filled_26, 2131822209);
    public static final AnonymousClass5I9 A09 = new AnonymousClass5I9(C94705vv.A00, R.drawable.barcelona_search_filled_26, R.drawable.barcelona_search_filled_26, 2131822210);
    public final int A00;
    public final int A01;
    public final int A02;
    public final C147368pE A03 = C86104wH.A0I(AnonymousClass7WR.A00, C18180wK.A0X(), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    public final C1193875c A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5I9) {
                AnonymousClass5I9 r5 = (AnonymousClass5I9) obj;
                if (!(C04220Ms.A0I(this.A04, r5.A04) && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((C18210wN.A04(this.A04) + this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public AnonymousClass5I9(C1193875c r4, int i, int i2, int i3) {
        this.A04 = r4;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }
}
