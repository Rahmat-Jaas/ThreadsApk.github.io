package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.6iJ  reason: invalid class name and case insensitive filesystem */
public final class C108406iJ {
    public TextView A00;
    public TextView A01;

    public C108406iJ(View view) {
        this.A01 = (TextView) AnonymousClass0wJ.A0I(view, R.id.title);
        this.A00 = (TextView) AnonymousClass0wJ.A0I(view, R.id.subtitle);
        AnonymousClass0h8.A04(this.A01, C86164wN.A0D(view).getDimensionPixelSize(R.dimen.add_partner_empty_state_title_line_height));
    }
}
