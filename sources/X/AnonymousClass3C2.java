package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.3C2  reason: invalid class name */
public final class AnonymousClass3C2 {
    public final ViewGroup A00;
    public final CheckBox A01;
    public final TextView A02;
    public final TextView A03;
    public final CircularImageView A04;

    public AnonymousClass3C2(View view) {
        C04220Ms.A0B(view, 1);
        this.A03 = (TextView) AnonymousClass0wJ.A0J(view, R.id.row_page_name);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(view, R.id.row_page_category);
        this.A04 = (CircularImageView) AnonymousClass0wJ.A0J(view, R.id.row_page_imageview);
        CheckBox checkBox = (CheckBox) AnonymousClass0wJ.A0J(view, R.id.checkbox);
        this.A01 = checkBox;
        this.A00 = (ViewGroup) AnonymousClass0wJ.A0J(view, R.id.row_page_container);
        AnonymousClass7FY.A02(checkBox, AnonymousClass006.A02);
    }
}
