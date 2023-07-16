package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.switchbutton.IgSwitch;

/* renamed from: X.1kN  reason: invalid class name */
public final class AnonymousClass1kN extends AnonymousClass1lO {
    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C04220Ms.A0B(viewGroup, 0);
        View inflate = C18180wK.A0C(viewGroup).inflate(R.layout.row_switch_item, viewGroup, false);
        C201713k r2 = new C201713k(inflate);
        inflate.setTag(r2);
        IgSwitch igSwitch = r2.A06;
        AnonymousClass0wJ.A1N(inflate, igSwitch);
        AnonymousClass0wJ.A16(inflate, 465, igSwitch);
        C04220Ms.A0C(r2, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleSwitchRowViewBinder.Holder");
        return r2;
    }

    public final Class modelClass() {
        return C211218z.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        C211218z r3 = (C211218z) mfV;
        C201713k r4 = (C201713k) m5o;
        AnonymousClass0wJ.A1N(r3, r4);
        C50342sq.A00((C57583Bq) null, r4, (C81734oH) null, r3.A00);
    }
}
