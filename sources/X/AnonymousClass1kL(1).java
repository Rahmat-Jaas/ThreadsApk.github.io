package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1kL  reason: invalid class name */
public final class AnonymousClass1kL extends AnonymousClass1lO {
    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C04220Ms.A0B((Object) null, 0);
        throw null;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(viewGroup, 0);
        View inflate = C18180wK.A0C(viewGroup).inflate(R.layout.row_custom_text, viewGroup, false);
        AnonymousClass12T r1 = new AnonymousClass12T(inflate);
        inflate.setTag(r1);
        C04220Ms.A0C(r1, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleCustomTextRowViewBinder.Holder");
        return r1;
    }

    public final Class modelClass() {
        return C210918w.class;
    }
}
