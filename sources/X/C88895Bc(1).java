package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.5Bc  reason: invalid class name and case insensitive filesystem */
public final class C88895Bc extends M5O {
    public final TextView A00;
    public final TextView A01;
    public final RoundedCornerImageView A02;

    public C88895Bc(View view) {
        super(view);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) view.requireViewById(R.id.product_image);
        this.A02 = roundedCornerImageView;
        roundedCornerImageView.A03 = C303120n.CENTER_CROP;
        TextView A0L = AnonymousClass0wJ.A0L(view, R.id.product_name);
        this.A01 = A0L;
        A0L.getPaint().setFakeBoldText(true);
        this.A00 = AnonymousClass0wJ.A0L(view, R.id.merchant_name);
    }
}
