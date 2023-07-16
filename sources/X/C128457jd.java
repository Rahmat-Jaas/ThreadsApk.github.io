package X;

import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.7jd  reason: invalid class name and case insensitive filesystem */
public final class C128457jd implements C143578gy {
    public final int A00;
    public final SparseArray A01;

    public final C89105Bx Bsh(ViewGroup viewGroup) {
        RecyclerView recyclerView;
        C04220Ms.A0B(viewGroup, 0);
        if (viewGroup instanceof RecyclerView) {
            RecyclerView recyclerView2 = new RecyclerView(new ContextThemeWrapper(viewGroup.getContext(), this.A00));
            C18190wL.A1D(recyclerView2);
            recyclerView = recyclerView2;
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout frameLayout = new FrameLayout(new ContextThemeWrapper(viewGroup.getContext(), this.A00));
            frameLayout.setLayoutParams(viewGroup.getLayoutParams());
            recyclerView = frameLayout;
        } else {
            recyclerView = viewGroup;
        }
        return new C92555ih(this.A01, C18200wM.A0F(C86124wJ.A0K(viewGroup.getContext(), this.A00), recyclerView, R.layout.container_cell_item_row, false));
    }

    public C128457jd(SparseArray sparseArray, int i) {
        this.A00 = i;
        this.A01 = sparseArray;
    }
}
