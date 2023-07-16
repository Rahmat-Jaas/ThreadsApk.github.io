package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.435  reason: invalid class name */
public abstract class AnonymousClass435 implements L2E {
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return 0;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return 0;
    }

    public final String getViewSubTypeName(int i, Object obj) {
        return null;
    }

    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
    }

    public final void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
    }

    public final void onViewRecycled(View view, int i, Object obj, Object obj2) {
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(86546705);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AnonymousClass00U.A0d(C18210wN.A0e(this), " was used in a RecyclerView adapter but doesn't implement ", "bindView", "!"));
        C14030oh.A0A(-195732508, A03);
        throw unsupportedOperationException;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-2142740490);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AnonymousClass00U.A0d(C18210wN.A0e(this), " was used in a RecyclerView adapter but doesn't implement ", "createView", "!"));
        C14030oh.A0A(1444493804, A03);
        throw unsupportedOperationException;
    }

    public final String getBinderGroupName() {
        return C18210wN.A0e(this);
    }

    public final String getViewTypeName(int i) {
        return AnonymousClass00U.A04(i, C18210wN.A0e(this), "[", "]");
    }
}
