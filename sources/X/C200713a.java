package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.13a  reason: invalid class name and case insensitive filesystem */
public final class C200713a extends M5O {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;

    public C200713a(View view) {
        super(view);
        this.A00 = view;
        this.A04 = AnonymousClass0wJ.A0L(view, R.id.row_simple_text_title);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.row_simple_text_description);
        this.A01 = C18200wM.A0J(view, R.id.row_address_dot);
        this.A03 = AnonymousClass0wJ.A0L(view, R.id.row_simple_text_extra_info);
    }
}
