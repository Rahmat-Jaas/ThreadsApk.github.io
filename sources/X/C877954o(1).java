package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import com.facebook.forker.Process;

/* renamed from: X.54o  reason: invalid class name and case insensitive filesystem */
public final class C877954o extends C871950n implements C141848dI {
    public boolean A00;
    public boolean A01;
    public final Window A02;
    public final C147368pE A03 = C86104wH.A0I(AnonymousClass7WR.A00, AnonymousClass305.A00, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");

    public C877954o(Context context, Window window) {
        super(context, (AttributeSet) null, 0);
        this.A02 = window;
    }

    public final void A04(int i, int i2) {
        if (!this.A01) {
            Context context = getContext();
            float f = C18230wP.A0E(context).density;
            getContext();
            i = View.MeasureSpec.makeMeasureSpec(AnonymousClass8bA.A03((float) C86114wI.A0B(context).screenWidthDp, f), Process.WAIT_RESULT_TIMEOUT);
            getContext();
            float f2 = C18230wP.A0E(context).density;
            getContext();
            i2 = View.MeasureSpec.makeMeasureSpec(AnonymousClass8bA.A03((float) C86114wI.A0B(context).screenHeightDp, f2), Process.WAIT_RESULT_TIMEOUT);
        }
        super.A04(i, i2);
    }

    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A00;
    }

    public final void A06(boolean z, int i, int i2, int i3, int i4) {
        super.A06(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.A02.setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }
}
