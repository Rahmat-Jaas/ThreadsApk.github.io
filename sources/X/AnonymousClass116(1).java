package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape11S0101000_6_I2;
import java.util.List;

/* renamed from: X.116  reason: invalid class name */
public final class AnonymousClass116 extends C41030Luu {
    public final C34632IcB A00;
    public final Context A01;
    public final List A02;

    public final void onBindViewHolder(M5O m5o, int i) {
        String str = ((AQ4) this.A02.get(i)).A01.A03;
        str.getClass();
        AnonymousClass3PD.A01(AnonymousClass4MA.A01(new IDxCListenerShape11S0101000_6_I2(this, i, 4), str), new C57583Bq(C18180wK.A1W(i), AnonymousClass0wJ.A1T(i, getItemCount() - 1), false, true), (AnonymousClass13K) m5o);
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        return AnonymousClass3PD.A00(this.A01, viewGroup);
    }

    public AnonymousClass116(Context context, C34632IcB icB, List list) {
        this.A01 = context;
        this.A02 = list;
        this.A00 = icB;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(1699282687);
        int size = this.A02.size();
        C14030oh.A0A(-432974295, A03);
        return size;
    }
}
