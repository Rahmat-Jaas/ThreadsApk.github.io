package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.1lL  reason: invalid class name */
public final class AnonymousClass1lL extends C18523Agw {
    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(layoutInflater, 1);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.customized_benefit_selection_row);
        C04220Ms.A06(A0H);
        return new AnonymousClass128(A0H);
    }

    public final Class modelClass() {
        return AnonymousClass193.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass193 r4 = (AnonymousClass193) mfV;
        AnonymousClass128 r5 = (AnonymousClass128) m5o;
        AnonymousClass0wJ.A1N(r4, r5);
        IgdsListCell igdsListCell = r5.A00;
        igdsListCell.A0F(AnonymousClass24V.TYPE_CHECKBOX, r4.A01);
        igdsListCell.A06(r4.A00);
        igdsListCell.setChecked(r4.A02);
    }
}
