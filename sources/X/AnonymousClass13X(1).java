package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.13X  reason: invalid class name */
public final class AnonymousClass13X extends M5O {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public CircularImageView A03;

    public AnonymousClass13X(View view) {
        super(view);
        this.A03 = (CircularImageView) view.requireViewById(R.id.row_user_avatar);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.row_user_username);
        this.A00 = AnonymousClass0wJ.A0L(view, R.id.row_user_fullname);
        this.A01 = AnonymousClass0wJ.A0L(view, R.id.row_user_detail);
    }
}
