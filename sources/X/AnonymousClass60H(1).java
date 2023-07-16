package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.60H  reason: invalid class name */
public final class AnonymousClass60H extends AnonymousClass1lO {
    public final Context A00;

    public final Class modelClass() {
        return AnonymousClass5MN.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass5MN r4 = (AnonymousClass5MN) mfV;
        AnonymousClass5BJ r5 = (AnonymousClass5BJ) m5o;
        int A1Y = AnonymousClass0wJ.A1Y(r4, r5);
        TextView textView = r5.A01;
        String str = r4.A02;
        if (str != null) {
            textView.setText(str);
        } else {
            A1Y = 8;
        }
        textView.setVisibility(A1Y);
        TextView textView2 = r5.A00;
        textView2.setText(r4.A00);
        C18180wK.A0z(textView2);
        textView2.setHighlightColor(textView2.getContext().getColor(R.color.fds_transparent));
    }

    public AnonymousClass60H(Context context) {
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass5BJ(C18200wM.A0F(layoutInflater, viewGroup, R.layout.branded_content_partner_promotion_info_item, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
