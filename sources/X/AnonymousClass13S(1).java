package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.13S  reason: invalid class name */
public final class AnonymousClass13S extends M5O {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final CircularImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass13S(ViewGroup viewGroup) {
        super(viewGroup);
        C04220Ms.A0B(viewGroup, 1);
        this.A03 = (CircularImageView) AnonymousClass0wJ.A0J(viewGroup, R.id.avatar_image_view);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(viewGroup, R.id.title);
        this.A00 = AnonymousClass0wJ.A0K(viewGroup, R.id.login_button);
        this.A01 = AnonymousClass0wJ.A0K(viewGroup, R.id.option_button);
    }
}
