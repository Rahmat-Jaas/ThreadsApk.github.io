package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.3CB  reason: invalid class name */
public final class AnonymousClass3CB {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;

    public AnonymousClass3CB(View view) {
        this.A01 = view;
        this.A04 = AnonymousClass0wJ.A0L(view, R.id.row_venue_title);
        this.A03 = AnonymousClass0wJ.A0L(view, R.id.row_venue_subtitle);
        this.A02 = C18200wM.A0J(view, R.id.row_place_icon);
        this.A00 = view.requireViewById(R.id.row_divider);
    }
}
