package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.13U  reason: invalid class name */
public final class AnonymousClass13U extends M5O {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public View A03;

    public AnonymousClass13U(View view) {
        super(view);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.title);
        this.A00 = AnonymousClass0wJ.A0L(view, R.id.badge);
        this.A01 = AnonymousClass0wJ.A0L(view, R.id.badge_lowpri);
        this.A03 = view.requireViewById(R.id.row_divider);
    }
}
