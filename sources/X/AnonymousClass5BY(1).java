package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.5BY  reason: invalid class name */
public final class AnonymousClass5BY extends M5O {
    public final ConstraintLayout A00;
    public final IgTextView A01;
    public final IgImageView A02;

    public AnonymousClass5BY(View view) {
        super(view);
        this.A00 = (ConstraintLayout) AnonymousClass0wJ.A0J(view, R.id.gift_container);
        this.A02 = (IgImageView) AnonymousClass0wJ.A0J(view, R.id.gift_image);
        this.A01 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.star_price);
    }
}
