package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.60A  reason: invalid class name */
public final class AnonymousClass60A extends AnonymousClass1lO {
    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        ((C88825Av) m5o).A00.setText(((C131797sp) mfV).A00);
    }

    public final Class modelClass() {
        return C131797sp.class;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.branded_contnet_partner_promotion_title_row);
        ((TextView) A0H).setTypeface(C86154wM.A0C(viewGroup.getContext()));
        return new C88825Av(A0H);
    }
}
