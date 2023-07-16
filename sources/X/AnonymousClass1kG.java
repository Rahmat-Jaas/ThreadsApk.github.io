package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1kG  reason: invalid class name */
public final class AnonymousClass1kG extends AnonymousClass1lO {
    public final Class modelClass() {
        return AnonymousClass195.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass195 r5 = (AnonymousClass195) mfV;
        AnonymousClass132 r6 = (AnonymousClass132) m5o;
        boolean A1Z = AnonymousClass0wJ.A1Z(r5, r6);
        r6.A01.setText(r5.A00);
        r6.A02.setText(r5.A01);
        View view = r6.A00;
        boolean z = r5.A03;
        view.setEnabled(z);
        AnonymousClass0wJ.A16(view, 418, r5);
        float f = 0.7f;
        if (z) {
            f = 1.0f;
        }
        view.setAlpha(f);
        view.setFocusable(A1Z);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass132(C18180wK.A0D(layoutInflater, viewGroup, R.layout.fan_club_gifting_price_button, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
