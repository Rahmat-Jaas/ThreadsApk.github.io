package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.barcelona.R;

/* renamed from: X.5yK  reason: invalid class name */
public final class AnonymousClass5yK extends AnonymousClass436 {
    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A5K(0);
        }
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C88785Aq r1;
        int A03 = C14030oh.A03(-389241267);
        Object obj3 = null;
        if (view != null) {
            obj3 = view.getTag();
        }
        if ((obj3 instanceof C88785Aq) && (r1 = (C88785Aq) obj3) != null) {
            r1.A00.A04();
        }
        C14030oh.A0A(183163192, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        Context context;
        int A03 = C14030oh.A03(-2101694311);
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(context), viewGroup, R.layout.product_collection_header_redesigned_shimmer);
        C04220Ms.A0C(A0H, AnonymousClass000.A00(1));
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) A0H;
        shimmerFrameLayout.setTag(new C88785Aq(shimmerFrameLayout));
        C14030oh.A0A(1382772811, A03);
        return shimmerFrameLayout;
    }
}
