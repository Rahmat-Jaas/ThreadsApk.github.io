package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.13J  reason: invalid class name */
public final class AnonymousClass13J extends M5O {
    public TextView A00;
    public ColorFilterAlphaImageView A01;
    public ColorFilterAlphaImageView A02;

    public AnonymousClass13J(View view) {
        super(view);
        this.A00 = AnonymousClass0wJ.A0L(view, R.id.row_simple_link_textview);
        this.A02 = (ColorFilterAlphaImageView) view.requireViewById(R.id.row_simple_link_image_start);
        this.A01 = (ColorFilterAlphaImageView) view.requireViewById(R.id.row_simple_link_image_end);
    }
}
