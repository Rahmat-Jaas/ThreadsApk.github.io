package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.barcelona.R;

/* renamed from: X.60K  reason: invalid class name */
public final class AnonymousClass60K extends AnonymousClass1lO {
    public final Context A00;

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(viewGroup, 0);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.threebar_brand_row_shimmer, viewGroup, false);
        C04220Ms.A0C(inflate, AnonymousClass000.A00(1));
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        float f = (float) 2;
        float A02 = ((((float) C18230wP.A0E(context).widthPixels) - (((float) C18210wN.A02(context)) * f)) - (((float) context.getResources().getDimensionPixelSize(R.dimen.audition_audio_item_selected_stroke_border_width)) * f)) / ((float) 3);
        View A0K = AnonymousClass0wJ.A0K(shimmerFrameLayout, R.id.threebar_image_0_shimmer);
        int i = (int) A02;
        C09860go.A0Y(A0K, i);
        C09860go.A0O(A0K, i);
        View A0K2 = AnonymousClass0wJ.A0K(shimmerFrameLayout, R.id.threebar_image_1_shimmer);
        C09860go.A0Y(A0K2, i);
        C09860go.A0O(A0K2, i);
        View A0K3 = AnonymousClass0wJ.A0K(shimmerFrameLayout, R.id.threebar_image_2_shimmer);
        C09860go.A0Y(A0K3, i);
        C09860go.A0O(A0K3, i);
        return new C88805As(shimmerFrameLayout);
    }

    public final Class modelClass() {
        return C131897sz.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C88805As r4 = (C88805As) m5o;
        C04220Ms.A0B(r4, 1);
        ShimmerFrameLayout shimmerFrameLayout = r4.A00;
        if (!shimmerFrameLayout.A08()) {
            shimmerFrameLayout.A04();
        }
    }

    public AnonymousClass60K(Context context) {
        this.A00 = context;
    }
}
