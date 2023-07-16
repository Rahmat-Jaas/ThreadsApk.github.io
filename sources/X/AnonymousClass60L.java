package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.barcelona.R;

/* renamed from: X.60L  reason: invalid class name */
public final class AnonymousClass60L extends AnonymousClass1lO {
    public final Context A00;

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(viewGroup, 0);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.shopping_loading_placeholder, viewGroup, false);
        C04220Ms.A0C(inflate, AnonymousClass000.A00(1));
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        shimmerFrameLayout.getLayoutParams().width = -2;
        int A08 = C09860go.A08(context);
        shimmerFrameLayout.setTag(new AnonymousClass5At(shimmerFrameLayout));
        ViewGroup A0J = C18220wO.A0J(shimmerFrameLayout, R.id.container);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.product_collection_header_shimmer, A0J, false);
        C09860go.A0Y(inflate2, A08);
        C09860go.A0O(inflate2, (int) (((float) A08) * 0.75f));
        A0J.addView(inflate2);
        Object tag = shimmerFrameLayout.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.shimmer.ProductCollectionHeaderShimmerViewBinder.Holder");
        return (M5O) tag;
    }

    public final Class modelClass() {
        return C167419pV.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass5At r3 = (AnonymousClass5At) m5o;
        C04220Ms.A0B(r3, 1);
        r3.A00.A04();
    }

    public AnonymousClass60L(Context context) {
        this.A00 = context;
    }
}
