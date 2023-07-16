package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.5BG  reason: invalid class name */
public final class AnonymousClass5BG extends M5O {
    public final C150388wA A00;
    public final Context A01;

    public AnonymousClass5BG(View view, AnonymousClass5xc r6, C11630kW r7) {
        super(view);
        Context context = view.getContext();
        this.A01 = context;
        C18489AgL A002 = C150388wA.A00(context);
        A002.A06.addAll(C06750aI.A17(new AnonymousClass60O(r6, r7), new AnonymousClass605()));
        C150388wA A003 = A002.A00();
        this.A00 = A003;
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.horizontal_scroll_recycler_view);
        recyclerView.setAdapter(A003);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
    }
}
