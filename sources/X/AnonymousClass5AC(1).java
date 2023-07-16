package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape201S0200000_2_I2;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5AC  reason: invalid class name */
public final class AnonymousClass5AC extends C41030Luu {
    public View.OnAttachStateChangeListener A00;
    public List A01 = AnonymousClass0ZV.A00;
    public final Map A02;
    public final Map A03;

    public final void A00(List list) {
        C04220Ms.A0B(list, 0);
        C41200Lyt A002 = C41069Lvu.A00(new C886159t(new C886259u(this.A03), this, this.A01, list));
        this.A01 = list;
        A002.A02(this);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C04220Ms.A0B(recyclerView, 0);
        IDxCListenerShape201S0200000_2_I2 iDxCListenerShape201S0200000_2_I2 = new IDxCListenerShape201S0200000_2_I2(2, this, recyclerView);
        this.A00 = iDxCListenerShape201S0200000_2_I2;
        recyclerView.addOnAttachStateChangeListener(iDxCListenerShape201S0200000_2_I2);
    }

    public final void onBindViewHolder(M5O m5o, int i) {
        C04220Ms.A0B(m5o, 0);
        int itemViewType = getItemViewType(i);
        ((C886359v) AnonymousClass4WJ.A07(Integer.valueOf(itemViewType), this.A02)).A09(m5o, (AnonymousClass7Kx) this.A01.get(i));
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        return ((C886359v) AnonymousClass4WJ.A07(Integer.valueOf(i), this.A02)).A08(viewGroup);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C04220Ms.A0B(recyclerView, 0);
        recyclerView.removeOnAttachStateChangeListener(this.A00);
    }

    public final void onViewRecycled(M5O m5o) {
        C89095Bw r2;
        C04220Ms.A0B(m5o, 0);
        if ((m5o instanceof C89095Bw) && (r2 = (C89095Bw) m5o) != null) {
            r2.A00();
        }
    }

    public AnonymousClass5AC(Map map) {
        this.A03 = map;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(map.size()));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(it);
            C86144wL.A1P(Integer.valueOf(((C886359v) A0o.getValue()).A02.A00), A0v, A0o);
        }
        this.A02 = A0v;
    }

    public final int getItemCount() {
        int A032 = C14030oh.A03(-1675150797);
        int size = this.A01.size();
        C14030oh.A0A(-1454497185, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = C14030oh.A03(1748641686);
        Map map = this.A03;
        Object obj = ((AnonymousClass7Kx) this.A01.get(i)).A01;
        C04220Ms.A0C(obj, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem");
        int i2 = ((C886359v) AnonymousClass4WJ.A07(((BaseCheckoutItem) obj).AqR(), map)).A02.A00;
        C14030oh.A0A(-906266706, A032);
        return i2;
    }
}
