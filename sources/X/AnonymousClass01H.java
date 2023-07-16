package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.01H  reason: invalid class name */
public final class AnonymousClass01H extends AnonymousClass04Z {
    public final Object A00;
    public final Object A01;
    public final boolean A02;

    public static AnonymousClass05Y A00(AnonymousClass01H r2, Object obj) {
        if (obj == null) {
            return null;
        }
        AnonymousClass05Y r1 = AnonymousClass05Q.A00;
        if (r1.A0H(obj)) {
            return r1;
        }
        AnonymousClass05Y r12 = AnonymousClass05Q.A01;
        if (r12 != null && r12.A0H(obj)) {
            return r12;
        }
        StringBuilder sb = new StringBuilder("Transition ");
        sb.append(obj);
        sb.append(" for fragment ");
        sb.append(r2.A00.A04);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }

    public AnonymousClass01H(C113806sA r4, C13370nZ r5, boolean z, boolean z2) {
        super(r4, r5);
        Object exitTransition;
        boolean z3;
        Object obj;
        Object enterTransition;
        Integer num = r5.A00;
        Integer num2 = AnonymousClass006.A01;
        Fragment fragment = r5.A04;
        if (num == num2) {
            if (z) {
                enterTransition = fragment.getReenterTransition();
            } else {
                enterTransition = fragment.getEnterTransition();
            }
            this.A01 = enterTransition;
            if (z) {
                z3 = fragment.getAllowReturnTransitionOverlap();
            } else {
                z3 = fragment.getAllowEnterTransitionOverlap();
            }
        } else {
            if (z) {
                exitTransition = fragment.getReturnTransition();
            } else {
                exitTransition = fragment.getExitTransition();
            }
            this.A01 = exitTransition;
            z3 = true;
        }
        this.A02 = z3;
        if (!z2) {
            obj = null;
        } else if (z) {
            obj = fragment.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        this.A00 = obj;
    }
}
