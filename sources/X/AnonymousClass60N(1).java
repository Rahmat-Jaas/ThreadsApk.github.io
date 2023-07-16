package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.60N  reason: invalid class name */
public final class AnonymousClass60N extends AnonymousClass1lO {
    public final AnonymousClass5xc A00;
    public final C11630kW A01;

    public final Class modelClass() {
        return C131767sm.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C131767sm r4 = (C131767sm) mfV;
        AnonymousClass5BG r5 = (AnonymousClass5BG) m5o;
        AnonymousClass0wJ.A1N(r4, r5);
        List A0X = AnonymousClass00J.A0X(new AnonymousClass60W(), r4.A00);
        C150388wA r1 = r5.A00;
        AnonymousClass3I1 r0 = new AnonymousClass3I1();
        r0.A02(A0X);
        r1.A04(r0);
    }

    public AnonymousClass60N(AnonymousClass5xc r1, C11630kW r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass5BG(C18180wK.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_horizontal_scroll_item, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)), this.A00, this.A01);
    }
}
