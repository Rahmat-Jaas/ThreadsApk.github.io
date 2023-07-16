package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.3CL  reason: invalid class name */
public final class AnonymousClass3CL {
    public final View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final CircularImageView A04;

    public AnonymousClass3CL(ViewGroup viewGroup) {
        this.A00 = viewGroup;
        this.A04 = (CircularImageView) viewGroup.requireViewById(R.id.avatar_image_view);
        this.A03 = AnonymousClass0wJ.A0L(viewGroup, R.id.title);
        View requireViewById = viewGroup.requireViewById(R.id.login_button);
        this.A01 = requireViewById;
        C18210wN.A0y(requireViewById);
        this.A02 = viewGroup.requireViewById(R.id.option_button);
    }
}
