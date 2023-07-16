package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.5BZ  reason: invalid class name */
public final class AnonymousClass5BZ extends M5O {
    public final ViewGroup A00;
    public final IgTextView A01;
    public final IgImageView A02;

    public AnonymousClass5BZ(View view) {
        super(view);
        this.A00 = (ViewGroup) view;
        this.A02 = (IgImageView) AnonymousClass0wJ.A0I(view, R.id.alt_text_carousel_image_view);
        this.A01 = (IgTextView) AnonymousClass0wJ.A0I(view, R.id.alt_text_carousel_text_view);
    }
}
