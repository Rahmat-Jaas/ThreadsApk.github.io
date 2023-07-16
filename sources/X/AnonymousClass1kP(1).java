package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: X.1kP  reason: invalid class name */
public final class AnonymousClass1kP extends AnonymousClass1lO {
    public final Class modelClass() {
        return C165619mI.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C165619mI r6 = (C165619mI) mfV;
        boolean A1Z = AnonymousClass0wJ.A1Z(r6, m5o);
        Object tag = m5o.itemView.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.search.NoResultsRowViewBinder.Holder");
        AnonymousClass39B r3 = (AnonymousClass39B) tag;
        AnonymousClass3I0 r2 = r6.A00;
        C04220Ms.A0B(r3, 0);
        C04220Ms.A0B(r2, A1Z ? 1 : 0);
        TextView textView = r3.A01;
        Resources resources = r3.A00.getResources();
        C04220Ms.A06(resources);
        textView.setText(C59513Lc.A00(resources, r2));
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass0wJ.A1N(viewGroup, layoutInflater);
        return new C197611q(C50362ss.A00(layoutInflater, viewGroup));
    }
}
