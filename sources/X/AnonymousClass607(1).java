package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.607  reason: invalid class name */
public final class AnonymousClass607 extends AnonymousClass1lO {
    public final Class modelClass() {
        return AnonymousClass60Y.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass60Y r3 = (AnonymousClass60Y) mfV;
        C88705Ah r4 = (C88705Ah) m5o;
        AnonymousClass0wJ.A1N(r3, r4);
        IgTextView igTextView = r4.A00;
        igTextView.setText(r3.A00);
        igTextView.setContentDescription(r3.A01);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C88705Ah(C18180wK.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_funding_balance, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
