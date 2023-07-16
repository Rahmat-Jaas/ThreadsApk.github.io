package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.5Ak  reason: invalid class name and case insensitive filesystem */
public final class C88735Ak extends M5O {
    public final RoundedCornerImageView A00;

    public C88735Ak(View view, boolean z) {
        super(view);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AnonymousClass0wJ.A0J(view, R.id.campaign_controls_media_thumbnail);
        this.A00 = roundedCornerImageView;
        if (z) {
            ViewGroup.LayoutParams layoutParams = roundedCornerImageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (layoutParams.height * 9) >> 4;
                roundedCornerImageView.setLayoutParams(layoutParams);
                return;
            }
            throw AnonymousClass0wJ.A0b();
        }
    }
}
