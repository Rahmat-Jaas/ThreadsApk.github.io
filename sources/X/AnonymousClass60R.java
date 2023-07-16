package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.60R  reason: invalid class name */
public final class AnonymousClass60R extends AnonymousClass1lO {
    public final AnonymousClass5x7 A00;
    public final Context A01;

    public final Class modelClass() {
        return AnonymousClass199.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass199 r4 = (AnonymousClass199) mfV;
        AnonymousClass5BI r5 = (AnonymousClass5BI) m5o;
        AnonymousClass0wJ.A1N(r4, r5);
        TextView textView = r5.A01;
        textView.setText(r4.A00);
        C18180wK.A0s(textView.getContext(), textView, R.color.default_cta_dominate_color);
        C86104wH.A1C(r5.A00, 96, this);
    }

    public AnonymousClass60R(Context context, AnonymousClass5x7 r2) {
        this.A01 = context;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass5BI(C18200wM.A0F(layoutInflater, viewGroup, R.layout.bca_action_row, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
