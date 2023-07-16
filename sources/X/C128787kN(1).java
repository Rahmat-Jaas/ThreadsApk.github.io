package X;

import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.7kN  reason: invalid class name and case insensitive filesystem */
public final class C128787kN implements C143658h6 {
    public final int A00;
    public final C143668h7 A01;

    public C128787kN(C143668h7 r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final M5O Bse(ViewGroup viewGroup) {
        C89065Bt r2 = new C89065Bt(AnonymousClass0wJ.A0H(C86124wJ.A0K(viewGroup.getContext(), this.A00), viewGroup, R.layout.hub_item_row));
        r2.A05 = this.A01.Bsi(r2.A00);
        return r2;
    }
}
