package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.3Ch  reason: invalid class name and case insensitive filesystem */
public final class C57743Ch {
    public final ViewGroup A00;
    public final CheckBox A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final CircularImageView A05;

    public C57743Ch(View view) {
        this.A03 = AnonymousClass0wJ.A0L(view, R.id.page_name);
        this.A04 = AnonymousClass0wJ.A0L(view, R.id.page_sub_title);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.page_description);
        this.A05 = (CircularImageView) view.requireViewById(R.id.page_profile_image);
        this.A00 = C18220wO.A0J(view, R.id.row_page_container);
        CheckBox checkBox = (CheckBox) view.requireViewById(R.id.checkbox);
        this.A01 = checkBox;
        AnonymousClass7FY.A02(checkBox, AnonymousClass006.A02);
    }
}
