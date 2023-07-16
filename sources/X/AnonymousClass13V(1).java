package X;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.13V  reason: invalid class name */
public final class AnonymousClass13V extends M5O {
    public CardView A00;
    public IgLinearLayout A01;
    public IgTextView A02;
    public IgTextView A03;

    public AnonymousClass13V(View view) {
        super(view);
        this.A00 = (CardView) view.findViewById(R.id.accounts_center_link_container);
        this.A03 = (IgTextView) view.findViewById(R.id.accounts_center_link_textview);
        this.A02 = (IgTextView) view.findViewById(R.id.accounts_center_learn_more_link_textview);
        this.A01 = (IgLinearLayout) view.findViewById(R.id.accounts_center_payments_row);
    }
}
