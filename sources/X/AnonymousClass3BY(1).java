package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.3BY  reason: invalid class name */
public final class AnonymousClass3BY {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;

    public AnonymousClass3BY(View view) {
        this.A00 = view.requireViewById(R.id.uhl_account_row);
        this.A03 = (CircularImageView) view.requireViewById(R.id.uhl_account_profile_image);
        this.A01 = AnonymousClass0wJ.A0L(view, R.id.uhl_account_full_name);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.uhl_account_username);
    }
}
