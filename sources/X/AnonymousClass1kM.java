package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/* renamed from: X.1kM  reason: invalid class name */
public final class AnonymousClass1kM extends AnonymousClass1lO {
    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(viewGroup, 0);
        RadioGroup radioGroup = new RadioGroup(viewGroup.getContext());
        C18200wM.A1C(radioGroup);
        AnonymousClass12X r1 = new AnonymousClass12X(radioGroup);
        C04220Ms.A0C(r1, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleRadioGroupRowViewBinder.Holder");
        return r1;
    }

    public final Class modelClass() {
        return C211118y.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C211118y r3 = (C211118y) mfV;
        AnonymousClass12X r4 = (AnonymousClass12X) m5o;
        AnonymousClass0wJ.A1N(r3, r4);
        C50332sp.A00(C18240wQ.A0B(r4), r3.A00, r4);
    }
}
