package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;

/* renamed from: X.55P  reason: invalid class name */
public final class AnonymousClass55P extends C872050o {
    public AnonymousClass0YY A00;
    public AnonymousClass0YY A01;
    public AnonymousClass0YY A02;
    public C142858fi A03;
    public final View A04;
    public final C146078lb A05;
    public final NestedScrollDispatcher A06;
    public final String A07;

    public static final void A01(AnonymousClass55P r1) {
        r1.setSaveableRegistryEntry((C142858fi) null);
    }

    public final void setReleaseBlock(AnonymousClass0YY r2) {
        C04220Ms.A0B(r2, 0);
        this.A00 = r2;
        setRelease(C86154wM.A13(this, 42));
    }

    public final void setResetBlock(AnonymousClass0YY r2) {
        C04220Ms.A0B(r2, 0);
        this.A01 = r2;
        setReset(C86154wM.A13(this, 43));
    }

    public final void setUpdateBlock(AnonymousClass0YY r2) {
        C04220Ms.A0B(r2, 0);
        this.A02 = r2;
        setUpdate(C86154wM.A13(this, 44));
    }

    private final void setSaveableRegistryEntry(C142858fi r2) {
        C142858fi r0 = this.A03;
        if (r0 != null) {
            r0.D8F();
        }
        this.A03 = r2;
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.A06;
    }

    public final AnonymousClass0YY getReleaseBlock() {
        return this.A00;
    }

    public final AnonymousClass0YY getResetBlock() {
        return this.A01;
    }

    public /* synthetic */ C871950n getSubCompositionView() {
        return null;
    }

    public final View getTypedView() {
        return this.A04;
    }

    public final AnonymousClass0YY getUpdateBlock() {
        return this.A02;
    }

    public View getViewRoot() {
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55P(Context context, C115506vH r5, C146078lb r6, NestedScrollDispatcher nestedScrollDispatcher, String str, AnonymousClass0YY r9) {
        super(context, r5, nestedScrollDispatcher);
        SparseArray sparseArray;
        AnonymousClass0wJ.A1O(context, r9);
        C18230wP.A1R(nestedScrollDispatcher, 4, str);
        View view = (View) r9.invoke(context);
        this.A04 = view;
        this.A06 = nestedScrollDispatcher;
        this.A05 = r6;
        this.A07 = str;
        setClipChildren(false);
        setView$ui_release(view);
        Object AEF = r6 != null ? r6.AEF(str) : null;
        if ((AEF instanceof SparseArray) && (sparseArray = (SparseArray) AEF) != null) {
            view.restoreHierarchyState(sparseArray);
        }
        C146078lb r2 = this.A05;
        if (r2 != null) {
            setSaveableRegistryEntry(r2.CaL(this.A07, C86154wM.A13(this, 41)));
        }
        AnonymousClass0YY r0 = C1191773v.A00;
        this.A02 = r0;
        this.A01 = r0;
        this.A00 = r0;
    }
}
