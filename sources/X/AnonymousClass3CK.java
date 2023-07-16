package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.3CK  reason: invalid class name */
public final class AnonymousClass3CK {
    public final LinearLayout A00;
    public final TextView A01;
    public final TextView A02;
    public final IgCheckBox A03;
    public final CircularImageView A04;

    public AnonymousClass3CK(ViewGroup viewGroup) {
        this.A04 = (CircularImageView) viewGroup.requireViewById(R.id.avatar_image_view);
        this.A02 = AnonymousClass0wJ.A0L(viewGroup, R.id.title);
        this.A01 = AnonymousClass0wJ.A0L(viewGroup, R.id.full_name);
        this.A03 = (IgCheckBox) viewGroup.requireViewById(R.id.list_view_item_checkbox);
        this.A00 = (LinearLayout) viewGroup.requireViewById(R.id.multiple_account_user_row);
    }
}
