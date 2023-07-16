package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.1uB  reason: invalid class name and case insensitive filesystem */
public class C28381uB extends C23091bu {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenWithCircularImageFragment";
    public CircularImageView A00;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1903742807);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_fullscreen_fragment, viewGroup, false);
        CircularImageView circularImageView = (CircularImageView) C23091bu.A00(inflate, this);
        this.A00 = circularImageView;
        this.A05 = circularImageView;
        this.A00 = inflate.findViewById(R.id.content_container);
        C14030oh.A09(-896488725, A02);
        return inflate;
    }
}
