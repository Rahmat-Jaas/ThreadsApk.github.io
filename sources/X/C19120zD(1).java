package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.0zD  reason: invalid class name and case insensitive filesystem */
public final class C19120zD extends ConstraintLayout {
    public View A00;
    public IgTextView A01;
    public CircularImageView A02;

    public void setMetricOnly(String str) {
        this.A01.setText(str);
    }

    public void setWithAvatarImage(C11630kW r3, ImageUrl imageUrl, String str) {
        CircularImageView circularImageView = this.A02;
        circularImageView.setUrl(imageUrl, r3);
        circularImageView.setVisibility(0);
        this.A01.setText(str);
    }

    public C19120zD(Context context) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(R.layout.insights_media_overlay_view, this);
        this.A00 = inflate;
        this.A02 = (CircularImageView) inflate.findViewById(R.id.media_owner_image);
        IgTextView A0L = C18250wR.A0L(this.A00, R.id.media_metric_value);
        this.A01 = A0L;
        A0L.setTextColor(-1);
        this.A01.setGravity(17);
        this.A01.setMaxLines(1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(context.getColor(R.color.grey_9_10_transparent));
        gradientDrawable.setCornerRadius(((float) (this.A01.getLineHeight() + (C18250wR.A00(context.getResources()) << 1))) / 2.0f);
        this.A00.setBackground(gradientDrawable);
        setImportantForAccessibility(2);
        this.A01.setImportantForAccessibility(2);
    }

    public void setWithEyeIcon(String str) {
        Drawable drawable = getContext().getDrawable(R.drawable.instagram_eye_outline_18);
        if (drawable != null) {
            C63393hP.A05(drawable, -1);
        }
        IgTextView igTextView = this.A01;
        igTextView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        igTextView.setCompoundDrawablePadding(getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
        igTextView.setText(str);
    }
}
