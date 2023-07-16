package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.3AP  reason: invalid class name */
public final class AnonymousClass3AP {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;

    public AnonymousClass3AP(View view) {
        IgImageView A0M = C18250wR.A0M(view, R.id.autocomplete_user_row_imageview);
        this.A02 = A0M;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A0M.getLayoutParams();
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A0M.setLayoutParams(marginLayoutParams);
        A0M.setVisibility(0);
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.autocomplete_user_row_username);
        this.A01 = A0L;
        A0L.getPaint().setFakeBoldText(true);
        this.A00 = AnonymousClass0wJ.A0L(view, R.id.autocomplete_user_row_fullname);
    }
}
