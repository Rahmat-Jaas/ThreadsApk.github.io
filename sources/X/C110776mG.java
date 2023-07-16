package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.feed.widget.IgProgressImageView;
import kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56;

/* renamed from: X.6mG  reason: invalid class name and case insensitive filesystem */
public final class C110776mG {
    public final ViewStub A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgProgressImageView A04;
    public final C04530Oa A05 = AnonymousClass0OY.A02(new KtLambdaShape76S0100000_I2_56(this, 5));

    public C110776mG(View view) {
        this.A04 = (IgProgressImageView) AnonymousClass0wJ.A0J(view, R.id.preview_image);
        this.A03 = (CircularImageView) AnonymousClass0wJ.A0J(view, R.id.feed_preview_profile_picture);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(view, R.id.feed_preview_username);
        this.A01 = (TextView) AnonymousClass0wJ.A0J(view, R.id.feed_preview_subtitle);
        this.A00 = (ViewStub) AnonymousClass0wJ.A0J(view, R.id.feed_preview_icon_view_stub);
    }
}
