package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.5By  reason: invalid class name and case insensitive filesystem */
public final class C89115By extends M5O implements C27909EvK {
    public final IgImageView A00;
    public final View A01;
    public final TextView A02;

    public final RectF B2t() {
        return C09860go.A0C(this.A00);
    }

    public final void BPD() {
        this.A00.setVisibility(4);
    }

    public final void Ctt() {
        this.A00.setVisibility(0);
    }

    public C89115By(View view) {
        super(view);
        this.A01 = view;
        this.A00 = (IgImageView) AnonymousClass0wJ.A0J(view, R.id.top_media_preview);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(view, R.id.tap_to_preview);
    }
}
