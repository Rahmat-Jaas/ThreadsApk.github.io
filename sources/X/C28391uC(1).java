package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.1uC  reason: invalid class name and case insensitive filesystem */
public final class C28391uC extends C23091bu {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenWithRectangularImageFragment";
    public IgImageView A00;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1047167028);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_fullscreen_rectangular_image_fragment, viewGroup, false);
        IgImageView igImageView = (IgImageView) C23091bu.A00(inflate, this);
        this.A00 = igImageView;
        this.A05 = igImageView;
        this.A00 = inflate.findViewById(R.id.content_container);
        C14030oh.A09(-1274390395, A02);
        return inflate;
    }
}
