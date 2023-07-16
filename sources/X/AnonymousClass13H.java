package X;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.13H  reason: invalid class name */
public final class AnonymousClass13H extends M5O {
    public final ProgressBar A00;
    public final TextView A01;
    public final TextView A02;

    public AnonymousClass13H(View view) {
        super(view);
        this.A01 = AnonymousClass0wJ.A0L(view, R.id.row_large_button);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.row_large_button_description);
        this.A00 = (ProgressBar) view.requireViewById(R.id.row_large_button_loading_indicator);
    }
}
