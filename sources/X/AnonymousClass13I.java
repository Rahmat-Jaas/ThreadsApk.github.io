package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.13I  reason: invalid class name */
public final class AnonymousClass13I extends M5O {
    public View A00;
    public ImageView A01;
    public TextView A02;

    public AnonymousClass13I(View view) {
        super(view);
        this.A02 = AnonymousClass0wJ.A0L(view, R.id.row_simple_text_textview);
        this.A00 = view.requireViewById(R.id.row_divider);
        this.A01 = C18220wO.A0K(view, R.id.row_simple_text_end_imageview);
    }
}
