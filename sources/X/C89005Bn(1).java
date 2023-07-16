package X;

import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.5Bn  reason: invalid class name and case insensitive filesystem */
public final class C89005Bn extends M5O {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;

    public C89005Bn(View view) {
        super(view);
        this.A00 = view;
        this.A03 = (IgImageView) AnonymousClass0wJ.A0J(view, R.id.reels_item_image);
        this.A02 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.reels_item_earnings);
        this.A01 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.reels_item_date);
    }
}
