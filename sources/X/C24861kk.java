package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1kk  reason: invalid class name and case insensitive filesystem */
public final class C24861kk extends AnonymousClass1lO {
    public final AnonymousClass0YY A00;
    public final AnonymousClass0YY A01;

    public final Class modelClass() {
        return AnonymousClass19H.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass19H r3 = (AnonymousClass19H) mfV;
        AnonymousClass13Q r4 = (AnonymousClass13Q) m5o;
        AnonymousClass0wJ.A1N(r3, r4);
        r4.A00.setText(r3.A01);
    }

    public C24861kk(AnonymousClass0YY r1, AnonymousClass0YY r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass13Q(C18200wM.A0F(layoutInflater, viewGroup, R.layout.muted_word_list_item_editable, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)), this.A00, this.A01);
    }
}
