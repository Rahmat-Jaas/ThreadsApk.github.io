package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.13c  reason: invalid class name and case insensitive filesystem */
public final class C200913c extends M5O {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final ConstrainedImageView A05;

    public C200913c(View view) {
        super(view);
        this.A00 = AnonymousClass0wJ.A0K(view, R.id.scheduled_content_item_container);
        this.A05 = (ConstrainedImageView) AnonymousClass0wJ.A0J(view, R.id.scheduled_content_image);
        this.A03 = (TextView) AnonymousClass0wJ.A0J(view, R.id.scheduled_content_caption);
        this.A02 = (ImageView) AnonymousClass0wJ.A0J(view, R.id.scheduled_content_scheduled_publish_time_icon);
        this.A04 = (TextView) AnonymousClass0wJ.A0J(view, R.id.scheduled_content_scheduled_publish_time);
        this.A01 = (ImageView) AnonymousClass0wJ.A0J(view, R.id.scheduled_content_scheduled_more_button);
    }
}
