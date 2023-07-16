package X;

import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.5Bo  reason: invalid class name and case insensitive filesystem */
public final class C89015Bo extends M5O {
    public final IgLinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final SpinnerImageView A03;

    public C89015Bo(View view) {
        super(view);
        this.A00 = (IgLinearLayout) AnonymousClass0wJ.A0J(view, R.id.pack_item);
        this.A02 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.title);
        this.A01 = (IgTextView) AnonymousClass0wJ.A0J(view, R.id.price);
        this.A03 = (SpinnerImageView) AnonymousClass0wJ.A0J(view, R.id.loading);
    }
}
