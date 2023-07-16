package X;

import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7WW  reason: invalid class name */
public final class AnonymousClass7WW implements C81784oM {
    public long A00;
    public long A01;
    public C1203479u A02;
    public boolean A03;
    public final AnonymousClass8cW A04;
    public final C147368pE A05;

    public AnonymousClass7WW(C1203479u r3, AnonymousClass8cW r4, Object obj, long j, long j2, boolean z) {
        C1203479u A002;
        C04220Ms.A0B(r4, 1);
        this.A04 = r4;
        this.A05 = C86104wH.A0I(AnonymousClass7WR.A00, obj, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        if (r3 != null) {
            A002 = AnonymousClass6DX.A00(r3);
        } else {
            C1203479u A003 = AnonymousClass7U0.A00(r4, obj);
            C04220Ms.A0B(A003, 0);
            A002 = C1203479u.A00(A003);
        }
        this.A02 = A002;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = z;
    }

    public static AnonymousClass7WW A00(AnonymousClass7WW r9) {
        float f = ((AnonymousClass52a) r9.A02).A00;
        long j = r9.A01;
        long j2 = r9.A00;
        boolean z = r9.A03;
        return new AnonymousClass7WW(new AnonymousClass52a(f), r9.A04, Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER), j, j2, z);
    }

    public final Object A01() {
        return ((AnonymousClass7U0) this.A04).A00.invoke(this.A02);
    }

    public final Object getValue() {
        return this.A05.getValue();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("AnimationState(value=");
        A0s.append(this.A05.getValue());
        A0s.append(", velocity=");
        A0s.append(A01());
        A0s.append(", isRunning=");
        A0s.append(this.A03);
        A0s.append(", lastFrameTimeNanos=");
        A0s.append(this.A01);
        A0s.append(", finishedTimeNanos=");
        A0s.append(this.A00);
        return AnonymousClass0wJ.A0u(A0s);
    }
}
