package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.1kR  reason: invalid class name */
public final class AnonymousClass1kR extends AnonymousClass1lO {
    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass39B r2 = (AnonymousClass39B) m5o.itemView.getTag();
        String str = ((AnonymousClass1lG) mfV).A00;
        C04220Ms.A0B(r2, 0);
        r2.A01.setText(str);
    }

    public final Class modelClass() {
        return AnonymousClass1lG.class;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C197811u(C50362ss.A00(layoutInflater, viewGroup));
    }
}
