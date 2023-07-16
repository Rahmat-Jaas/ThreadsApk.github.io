package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.selectableview.SingleSelectableAvatar;

/* renamed from: X.3CR  reason: invalid class name */
public final class AnonymousClass3CR {
    public final ViewGroup A00;
    public final CheckBox A01;
    public final TextView A02;
    public final TextView A03;
    public final SingleSelectableAvatar A04;

    public AnonymousClass3CR(View view) {
        this.A00 = C18220wO.A0J(view, R.id.row_user_container);
        this.A03 = AnonymousClass0wJ.A0L(view, R.id.row_user_username);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.row_user_info);
        this.A04 = (SingleSelectableAvatar) view.requireViewById(R.id.row_single_user_imageview);
        this.A01 = (CheckBox) view.requireViewById(R.id.row_user_checkbox);
    }
}
