package X;

import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.7jg  reason: invalid class name and case insensitive filesystem */
public final class C128487jg implements C143578gy {
    public final int A00;
    public final C143568gx A01;
    public final C143568gx A02;
    public final C143568gx A03;

    public final C89105Bx Bsh(ViewGroup viewGroup) {
        RecyclerView recyclerView;
        C04220Ms.A0B(viewGroup, 0);
        if (viewGroup instanceof RecyclerView) {
            RecyclerView recyclerView2 = new RecyclerView(new ContextThemeWrapper(viewGroup.getContext(), this.A00));
            C18190wL.A1D(recyclerView2);
            recyclerView = recyclerView2;
        } else if (viewGroup instanceof LinearLayout) {
            LinearLayout linearLayout = new LinearLayout(new ContextThemeWrapper(viewGroup.getContext(), this.A00));
            linearLayout.setLayoutParams(viewGroup.getLayoutParams());
            recyclerView = linearLayout;
        } else {
            recyclerView = viewGroup;
        }
        C92575ij r2 = new C92575ij(C18200wM.A0F(C86124wJ.A0K(viewGroup.getContext(), this.A00), recyclerView, R.layout.list_cell_item_row, false));
        C143568gx r1 = this.A01;
        if (r1 != null) {
            r2.A00 = r1.Bsg(r2.A03);
        }
        C143568gx r12 = this.A02;
        if (r12 != null) {
            r2.A01 = r12.Bsg(r2.A04);
        }
        C143568gx r13 = this.A03;
        if (r13 != null) {
            r2.A02 = r13.Bsg(r2.A05);
        }
        return r2;
    }

    public C128487jg(C143568gx r1, C143568gx r2, C143568gx r3, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
    }

    public C128487jg() {
        this((C143568gx) null, (C143568gx) null, (C143568gx) null, 0);
    }
}
