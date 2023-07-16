package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.13L  reason: invalid class name */
public final class AnonymousClass13L extends M5O {
    public View A00;
    public TextView A01;
    public TextView A02;

    public AnonymousClass13L(View view) {
        super(view);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.row_simple_text_textview);
        this.A00 = view.requireViewById(R.id.row_divider);
        this.A01 = AnonymousClass0wJ.A0L(view, R.id.row_simple_text_metadata_textview);
        view.setTag(this);
    }
}
