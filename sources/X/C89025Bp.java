package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.5Bp  reason: invalid class name and case insensitive filesystem */
public final class C89025Bp extends M5O {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgSimpleImageView A03;

    public C89025Bp(View view) {
        super(view);
        this.A03 = (IgSimpleImageView) AnonymousClass0wJ.A0J(view, R.id.new_release_notification_item_image_view);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(view, R.id.new_release_notification_item_track_name);
        this.A01 = (TextView) AnonymousClass0wJ.A0J(view, R.id.new_release_notification_item_artist_name);
        this.A00 = AnonymousClass0wJ.A0K(view, R.id.new_release_notification_item_camera_button);
    }
}
