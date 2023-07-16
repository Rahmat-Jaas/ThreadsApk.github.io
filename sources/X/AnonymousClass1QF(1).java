package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.barcelona.R;

/* renamed from: X.1QF  reason: invalid class name */
public final class AnonymousClass1QF extends FLW {
    public final boolean A03() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Drawable drawable;
        ImageView imageView;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A00 != null && (drawable = requireContext().getDrawable(R.drawable.instagram_arrow_left_pano_outline_24)) != null && (imageView = this.A05) != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final int A01() {
        return R.layout.xmds_photo_requirements_item;
    }

    public final int A02() {
        return R.layout.xmds_photo_requirements_view;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-2108376814);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.xmds_capture_overlay_fragment, viewGroup, false);
        C14030oh.A09(-153114560, A02);
        return inflate;
    }
}
