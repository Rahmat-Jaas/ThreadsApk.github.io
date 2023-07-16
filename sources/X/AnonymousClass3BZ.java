package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.3BZ  reason: invalid class name */
public final class AnonymousClass3BZ {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final CircularImageView A03;

    public AnonymousClass3BZ(View view) {
        this.A00 = view;
        this.A03 = (CircularImageView) AnonymousClass0wJ.A0J(view, R.id.row_newsfeed_user_imageview);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(view, R.id.business_conversion_reminder_message);
        this.A01 = (ImageView) AnonymousClass0wJ.A0J(view, R.id.cross_button);
    }
}
