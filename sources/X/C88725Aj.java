package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.5Aj  reason: invalid class name and case insensitive filesystem */
public final class C88725Aj extends M5O {
    public final C150388wA A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88725Aj(View view, C11630kW r7, AnonymousClass0YY r8) {
        super(view);
        I7p i7p;
        C04220Ms.A0B(r8, 3);
        C18489AgL A002 = C150388wA.A00(view.getContext());
        A002.A06.addAll(C18180wK.A0n(new C40194LXt(r7, r8)));
        A002.A04 = true;
        C150388wA A003 = A002.A00();
        this.A00 = A003;
        View requireViewById = view.requireViewById(R.id.horizontal_scroll_recycler_view);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.setAdapter(A003);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        C04220Ms.A06(requireViewById);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.abc_floating_window_z);
        recyclerView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        M0E m0e = recyclerView.A0G;
        if ((m0e instanceof I7p) && (i7p = (I7p) m0e) != null) {
            i7p.A00 = false;
        }
        recyclerView.A0U = true;
    }
}
