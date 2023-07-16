package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.60P  reason: invalid class name */
public final class AnonymousClass60P extends AnonymousClass1lO {
    public final C11630kW A00;
    public final AnonymousClass0YY A01;

    public final Class modelClass() {
        return AnonymousClass60X.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass60X r4 = (AnonymousClass60X) mfV;
        C88725Aj r5 = (C88725Aj) m5o;
        AnonymousClass0wJ.A1N(r4, r5);
        C150388wA r2 = r5.A00;
        AnonymousClass3I1 r1 = new AnonymousClass3I1();
        r1.A02(r4.A00);
        r2.A04(r1);
    }

    public AnonymousClass60P(C11630kW r1, AnonymousClass0YY r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C88725Aj(C18180wK.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_horizontal_scroll_item, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)), this.A00, this.A01);
    }
}
