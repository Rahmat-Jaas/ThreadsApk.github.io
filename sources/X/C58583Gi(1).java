package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.barcelona.R;

/* renamed from: X.3Gi  reason: invalid class name and case insensitive filesystem */
public final class C58583Gi {
    public final ImageView A00;

    public C58583Gi(ImageView imageView) {
        C04220Ms.A0B(imageView, 1);
        this.A00 = imageView;
    }

    public final void A00() {
        this.A00.setVisibility(8);
    }

    public final void A01() {
        ImageView imageView = this.A00;
        imageView.setVisibility(0);
        imageView.setOnClickListener((View.OnClickListener) null);
        imageView.setFocusable(false);
        imageView.setClickable(false);
        imageView.setContentDescription((CharSequence) null);
        imageView.setImageResource(R.drawable.instagram_check_outline_16);
        C63163fI.A02(imageView, R.color.igds_success);
    }
}
