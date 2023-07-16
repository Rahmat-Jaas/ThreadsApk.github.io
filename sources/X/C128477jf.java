package X;

import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.7jf  reason: invalid class name and case insensitive filesystem */
public final class C128477jf implements C143578gy {
    public final C143568gx A00;
    public final C143568gx A01;

    public final C89105Bx Bsh(ViewGroup viewGroup) {
        C04220Ms.A0B(viewGroup, 0);
        C92565ii r2 = new C92565ii(C18200wM.A0F(C86124wJ.A0K(viewGroup.getContext(), 0), viewGroup, R.layout.card_cell_item_row, false));
        C143568gx r1 = this.A01;
        if (r1 != null) {
            r2.A01 = r1.Bsg(r2.A03);
        }
        C143568gx r12 = this.A00;
        if (r12 != null) {
            r2.A00 = r12.Bsg(r2.A02);
        }
        return r2;
    }

    public /* synthetic */ C128477jf(C143568gx r1, C143568gx r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public C128477jf() {
        this.A01 = null;
        this.A00 = null;
    }
}
