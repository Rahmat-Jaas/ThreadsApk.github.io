package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.barcelona.R;

/* renamed from: X.6Uk  reason: invalid class name and case insensitive filesystem */
public final class C102236Uk {
    public static final ShimmerFrameLayout A00(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.shopping_loading_placeholder, viewGroup, false);
        C04220Ms.A0C(inflate, AnonymousClass000.A00(1));
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        int A08 = C09860go.A08(context) - (context.getResources().getDimensionPixelOffset(R.dimen.abc_floating_window_z) << 1);
        shimmerFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.content_tile_shimmer, shimmerFrameLayout, false);
        C09860go.A0Y(inflate2, A08);
        C09860go.A0O(inflate2, (int) (((float) A08) / 1.33f));
        shimmerFrameLayout.addView(inflate2);
        shimmerFrameLayout.setTag(new C88795Ar(shimmerFrameLayout));
        return shimmerFrameLayout;
    }
}
