package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.60O  reason: invalid class name */
public final class AnonymousClass60O extends AnonymousClass1lO {
    public final AnonymousClass5xc A00;
    public final C11630kW A01;

    public final Class modelClass() {
        return C131857sv.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C131857sv r4 = (C131857sv) mfV;
        C89005Bn r5 = (C89005Bn) m5o;
        AnonymousClass0wJ.A1N(r4, r5);
        r5.A03.setUrl(C18250wR.A0K(r4.A05), this.A01);
        r5.A02.setText(r4.A03);
        r5.A01.setText(r4.A02);
        C86104wH.A1D(r5.A00, 48, r4, this);
    }

    public AnonymousClass60O(AnonymousClass5xc r1, C11630kW r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C89005Bn(C18180wK.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_reels_item, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
