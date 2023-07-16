package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.436  reason: invalid class name */
public abstract class AnonymousClass436 implements L2E {
    public static void A01(C83434rN r1) {
        C04220Ms.A0B(r1, 0);
        r1.A5K(0);
    }

    public int getIdentifier(int i, Object obj, Object obj2) {
        return Integer.MAX_VALUE;
    }

    public int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MAX_VALUE;
    }

    public String getViewSubTypeName(int i, Object obj) {
        return null;
    }

    public boolean isEnabled(int i, Object obj, Object obj2) {
        return true;
    }

    public void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
    }

    public void onViewDetachedFromWindow(View view, int i, Object obj, Object obj2) {
    }

    public void onViewRecycled(View view, int i, Object obj, Object obj2) {
    }

    public static int A00(int i, Object obj) {
        int A03 = C14030oh.A03(i);
        C04220Ms.A0B(obj, 1);
        return A03;
    }

    public String getBinderGroupName() {
        return C18210wN.A0e(this);
    }

    public View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-2048425802);
        if (view == null) {
            view = createView(i, viewGroup);
        }
        bindView(i, view, obj, obj2);
        C14030oh.A0A(1534779901, A03);
        return view;
    }

    public String getViewTypeName(int i) {
        return AnonymousClass00U.A04(i, getBinderGroupName(), "[", "]");
    }
}
