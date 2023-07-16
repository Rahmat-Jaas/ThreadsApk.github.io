package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.60E  reason: invalid class name */
public final class AnonymousClass60E extends AnonymousClass1lO {
    public final C105346dH A00;

    public AnonymousClass60E(C105346dH r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final Class modelClass() {
        return C131867sw.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        SpinnerImageView spinnerImageView;
        AnonymousClass69F r0;
        C131867sw r4 = (C131867sw) mfV;
        C89015Bo r5 = (C89015Bo) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r4, r5);
        r5.A02.setText(r4.A04);
        boolean z = r4.A05;
        IgTextView igTextView = r5.A01;
        if (z) {
            igTextView.setVisibility(8);
            spinnerImageView = r5.A03;
            r0 = AnonymousClass69F.LOADING;
        } else {
            igTextView.setText(r4.A01);
            igTextView.setVisibility(A1Y ? 1 : 0);
            spinnerImageView = r5.A03;
            r0 = AnonymousClass69F.SUCCESS;
        }
        spinnerImageView.setLoadingStatus(r0);
        IgLinearLayout igLinearLayout = r5.A00;
        AnonymousClass7FY.A01(igLinearLayout, r5.itemView.getResources().getString(2131821380));
        igLinearLayout.setContentDescription(r4.A00);
        C86104wH.A1D(igLinearLayout, 49, r4, this);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C89015Bo(C18180wK.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_pack_item, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
