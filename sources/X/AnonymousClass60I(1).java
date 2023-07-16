package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape204S0100000_3_I2;
import com.instagram.barcelona.R;

/* renamed from: X.60I  reason: invalid class name */
public final class AnonymousClass60I extends AnonymousClass1lO {
    public final C17740ALs A00;

    public AnonymousClass60I(C17740ALs aLs) {
        C04220Ms.A0B(aLs, 1);
        this.A00 = aLs;
    }

    public final Class modelClass() {
        return C131757sl.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C88745Al r5 = (C88745Al) m5o;
        C04220Ms.A0B(r5, 1);
        r5.A00.setOnClickListener(new IDxCListenerShape204S0100000_3_I2((Object) this, 118));
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C88745Al(C18180wK.A0D(layoutInflater, viewGroup, R.layout.guide_grid_create_guide, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
