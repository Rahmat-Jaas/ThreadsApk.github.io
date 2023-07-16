package X;

import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.13D  reason: invalid class name */
public final class AnonymousClass13D extends M5O {
    public final IgTextView A00;
    public final IgTextView A01;
    public final CircularImageView A02;

    public AnonymousClass13D(View view) {
        super(view);
        this.A02 = (CircularImageView) AnonymousClass0wJ.A0J(view, R.id.avatar_pic);
        this.A01 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.visibility_header);
        this.A00 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.visibility_body);
    }
}
