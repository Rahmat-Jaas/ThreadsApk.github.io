package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.1kQ  reason: invalid class name */
public final class AnonymousClass1kQ extends AnonymousClass1lO {
    public final Class modelClass() {
        return AnonymousClass48G.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass13T r5 = (AnonymousClass13T) m5o;
        AnonymousClass0wJ.A1N(mfV, r5);
        IgTextView igTextView = r5.A02;
        C18200wM.A17(igTextView.getResources(), igTextView, 2131835898);
        IgTextView igTextView2 = r5.A01;
        C18200wM.A17(igTextView2.getResources(), igTextView2, 2131835897);
        IgImageView igImageView = r5.A03;
        C18180wK.A0r(igImageView.getContext(), igImageView, R.drawable.ufi_save_icon);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass13T(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.empty_recon_section_title, C18200wM.A1Y(viewGroup)));
    }
}
