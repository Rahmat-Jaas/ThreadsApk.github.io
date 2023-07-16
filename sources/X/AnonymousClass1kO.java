package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1kO  reason: invalid class name */
public final class AnonymousClass1kO extends AnonymousClass1lO {
    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(viewGroup, 0);
        View inflate = C18180wK.A0C(viewGroup).inflate(R.layout.row_text, viewGroup, false);
        AnonymousClass12Z r1 = new AnonymousClass12Z(inflate);
        inflate.setTag(r1);
        C04220Ms.A0C(r1, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleTextRowViewBinder.Holder");
        return r1;
    }

    public final Class modelClass() {
        return AnonymousClass190.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass190 r2 = (AnonymousClass190) mfV;
        AnonymousClass12Z r3 = (AnonymousClass12Z) m5o;
        AnonymousClass0wJ.A1N(r2, r3);
        C50352sr.A00(r3, r2.A00);
    }
}
