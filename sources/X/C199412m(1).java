package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.12m  reason: invalid class name and case insensitive filesystem */
public final class C199412m extends M5O {
    public final RecyclerView A00;
    public final C150388wA A01;

    public C199412m(View view, C11630kW r6) {
        super(view);
        C150388wA A0Z = C18220wO.A0Z(C150388wA.A00(C18240wQ.A0B(this)), new AnonymousClass9WS(r6));
        this.A01 = A0Z;
        RecyclerView recyclerView = (RecyclerView) view;
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.A0y(new AnonymousClass11W(C18220wO.A03(this.itemView.getResources()), this.itemView.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material)));
        recyclerView.setAdapter(A0Z);
        this.A00 = recyclerView;
    }
}
