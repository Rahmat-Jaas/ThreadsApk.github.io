package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.606  reason: invalid class name */
public final class AnonymousClass606 extends AnonymousClass1lO {
    public final Class modelClass() {
        return AnonymousClass5MK.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass5MK r4 = (AnonymousClass5MK) mfV;
        AnonymousClass5BX r5 = (AnonymousClass5BX) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r4, r5);
        r5.A00.setText(r4.A00);
        r5.A01.setText(r4.A01);
        r5.A02.A0J(r4.A02, A1Y);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass5BX(C18180wK.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_monthly_earnings, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
