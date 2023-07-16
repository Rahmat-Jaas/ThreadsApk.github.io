package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.13K  reason: invalid class name */
public final class AnonymousClass13K extends M5O {
    public View A00;
    public CheckBox A01;
    public TextView A02;

    public AnonymousClass13K(View view) {
        super(view);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.row_simple_text_textview);
        this.A00 = view.requireViewById(R.id.row_divider);
        this.A01 = (CheckBox) view.requireViewById(R.id.checkbox);
    }
}
