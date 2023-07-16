package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1kW  reason: invalid class name */
public final class AnonymousClass1kW extends AnonymousClass1lO {
    public final AnonymousClass0YY A00;

    public final Class modelClass() {
        return AnonymousClass19I.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass19I r3 = (AnonymousClass19I) mfV;
        AnonymousClass0wJ.A1N(r3, m5o);
        C18250wR.A0A(m5o.itemView).setText(r3.A01);
    }

    public AnonymousClass1kW(AnonymousClass0YY r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass125(C18200wM.A0F(layoutInflater, viewGroup, R.layout.muted_word_list_item, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)), this.A00);
    }
}
