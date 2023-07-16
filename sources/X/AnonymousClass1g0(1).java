package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.switchbutton.IgSwitch;

/* renamed from: X.1g0  reason: invalid class name */
public final class AnonymousClass1g0 extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1g0(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1632894223);
        C50342sq.A00((C57583Bq) obj2, (C201713k) view.getTag(), (C81734oH) null, (AnonymousClass4MC) obj);
        C14030oh.A0A(1152304681, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(1016398208);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_switch_item);
        C201713k r0 = new C201713k(A0H);
        A0H.setTag(r0);
        IgSwitch igSwitch = r0.A06;
        AnonymousClass0wJ.A1N(A0H, igSwitch);
        AnonymousClass0wJ.A16(A0H, 465, igSwitch);
        C14030oh.A0A(-1261371611, A03);
        return A0H;
    }
}
