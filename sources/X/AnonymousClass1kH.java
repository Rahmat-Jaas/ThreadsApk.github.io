package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1kH  reason: invalid class name */
public final class AnonymousClass1kH extends AnonymousClass1lO {
    public final Class modelClass() {
        return AnonymousClass1l9.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass1l9 r4 = (AnonymousClass1l9) mfV;
        AnonymousClass133 r5 = (AnonymousClass133) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r4, r5);
        C57943Dd r2 = r4.A00;
        C04220Ms.A0B(r2, A1Y ? 1 : 0);
        r5.A02.setText(C59523Ld.A00(C18190wL.A0A(r5.A01), r2));
        r5.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass133(C18180wK.A0D(layoutInflater, viewGroup, R.layout.fan_club_empty_results, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
