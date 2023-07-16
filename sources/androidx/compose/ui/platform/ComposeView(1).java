package androidx.compose.ui.platform;

import X.AnonymousClass0YP;
import X.AnonymousClass7WR;
import X.C04220Ms;
import X.C147368pE;
import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import X.C86104wH;
import X.C871950n;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ComposeView extends C871950n {
    public boolean A00;
    public final C147368pE A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C04220Ms.A0B(context, 1);
        this.A01 = C86104wH.A0I(AnonymousClass7WR.A00, (Object) null, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public final void setContent(AnonymousClass0YP r2) {
        C04220Ms.A0B(r2, 0);
        this.A00 = true;
        this.A01.CrC(r2);
        if (!isAttachedToWindow()) {
            return;
        }
        if (this.A00 != null || isAttachedToWindow()) {
            C871950n.A02(this);
            return;
        }
        throw C18180wK.A0a("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A00;
    }

    public CharSequence getAccessibilityClassName() {
        String A0q = C18220wO.A0q(this);
        C04220Ms.A06(A0q);
        return A0q;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context) {
        this(context, (AttributeSet) null, 0);
        C04220Ms.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C04220Ms.A0B(context, 1);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, C18210wN.A0D(attributeSet, i2), C18220wO.A00(i2, i));
    }
}
