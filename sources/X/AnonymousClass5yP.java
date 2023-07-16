package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.barcelona.R;

/* renamed from: X.5yP  reason: invalid class name */
public final class AnonymousClass5yP extends AnonymousClass436 {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass5yP(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A002 = AnonymousClass436.A00(-334485096, view);
        if (view.getTag() != null) {
            Object tag = view.getTag();
            C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productcollection.ProductCollectionHeaderShimmerBinderGroup.Holder");
            ((C88775Ap) tag).A00.A04();
        }
        C14030oh.A0A(-1982567602, A002);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(429283071, viewGroup);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.shopping_loading_placeholder, viewGroup, false);
        C04220Ms.A0C(inflate, AnonymousClass000.A00(1));
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        LinearLayout linearLayout = (LinearLayout) AnonymousClass0wJ.A0J(shimmerFrameLayout, R.id.container);
        linearLayout.setOrientation(0);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.product_collection_header_shimmer, linearLayout, false);
        int A08 = C09860go.A08(context);
        C09860go.A0Y(inflate2, A08);
        C09860go.A0O(inflate2, (int) (((float) A08) * 0.75f));
        linearLayout.addView(inflate2);
        shimmerFrameLayout.setTag(new C88775Ap(shimmerFrameLayout));
        C14030oh.A0A(-1998547308, A002);
        return shimmerFrameLayout;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }
}
