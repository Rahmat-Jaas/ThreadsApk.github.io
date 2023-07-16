package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000100_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.60G  reason: invalid class name */
public final class AnonymousClass60G extends AnonymousClass1lO {
    public final C105436dQ A00;

    public final Class modelClass() {
        return C131817sr.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C131817sr r5 = (C131817sr) mfV;
        AnonymousClass5BH r6 = (AnonymousClass5BH) m5o;
        AnonymousClass0wJ.A1N(r5, r6);
        CircularImageView circularImageView = r6.A01;
        KtCSuperShape0S2000100_I2 ktCSuperShape0S2000100_I2 = r5.A00;
        circularImageView.setUrl(C18250wR.A0K(ktCSuperShape0S2000100_I2.A02), r5.A01);
        r6.A00.setText(ktCSuperShape0S2000100_I2.A01);
        C86104wH.A1D(r6.itemView, 52, r5, this);
    }

    public AnonymousClass60G(C105436dQ r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass5BH(C18200wM.A0F(layoutInflater, viewGroup, R.layout.artists_search_list_item, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
