package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1kI  reason: invalid class name */
public final class AnonymousClass1kI extends AnonymousClass1lO {
    public final Class modelClass() {
        return AnonymousClass1lB.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass1lB r3 = (AnonymousClass1lB) mfV;
        AnonymousClass12A r4 = (AnonymousClass12A) m5o;
        AnonymousClass0wJ.A1N(r3, r4);
        r4.A00.setText(r3.A00);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass12A(C18180wK.A0D(layoutInflater, viewGroup, R.layout.user_group_header_text, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
