package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1kJ  reason: invalid class name */
public final class AnonymousClass1kJ extends AnonymousClass1lO {
    public final Class modelClass() {
        return AnonymousClass1lK.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass1lK r5 = (AnonymousClass1lK) mfV;
        C199112j r6 = (C199112j) m5o;
        boolean A1Z = AnonymousClass0wJ.A1Z(r5, r6);
        TextView textView = r6.A01;
        Resources resources = r6.A00.getResources();
        C04220Ms.A06(resources);
        C57943Dd r0 = r5.A00;
        C04220Ms.A0B(r0, A1Z ? 1 : 0);
        textView.setText(r0.A01(resources));
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C199112j(C18180wK.A0D(layoutInflater, viewGroup, R.layout.subscription_list_education, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
