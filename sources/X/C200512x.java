package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.12x  reason: invalid class name and case insensitive filesystem */
public final class C200512x extends M5O {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;

    public C200512x(View view) {
        super(view);
        this.A01 = (TextView) AnonymousClass0wJ.A0I(view, R.id.inspiration_section_title);
        this.A00 = (TextView) AnonymousClass0wJ.A0I(view, R.id.inspiration_section_description);
        this.A02 = (IgImageView) AnonymousClass0wJ.A0I(view, R.id.images_grid);
    }
}
