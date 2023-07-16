package X;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.KtLambdaShape27S0100000_I2_7;

/* renamed from: X.545  reason: invalid class name */
public final class AnonymousClass545 extends C115286uo implements C145728kz {
    public final Drawable A00;
    public final C147368pE A01;
    public final C147368pE A02;
    public final C04530Oa A03;

    public final void Bzv() {
        Drawable drawable = this.A00;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback((Drawable.Callback) null);
    }

    public final void CFR() {
        Drawable drawable = this.A00;
        drawable.setCallback((Drawable.Callback) this.A03.getValue());
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public AnonymousClass545(Drawable drawable) {
        long j;
        this.A00 = drawable;
        AnonymousClass7WR r4 = AnonymousClass7WR.A00;
        this.A01 = C86104wH.A0I(r4, 0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            j = AnonymousClass7JK.A01;
        } else {
            j = C86104wH.A0C((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
        this.A02 = C86104wH.A0I(r4, new AnonymousClass7JK(j), "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        this.A03 = AnonymousClass0OY.A02(new KtLambdaShape27S0100000_I2_7(this, 1));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            C86124wJ.A1C(drawable);
        }
    }

    public final void Biz() {
        Bzv();
    }
}
