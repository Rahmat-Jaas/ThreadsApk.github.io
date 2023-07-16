package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.5BL  reason: invalid class name */
public final class AnonymousClass5BL extends M5O {
    public final TextView A00;
    public final RecyclerView A01;

    public AnonymousClass5BL(View view) {
        super(view);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0I(view, R.id.content);
        this.A01 = recyclerView;
        this.A00 = (TextView) AnonymousClass0wJ.A0I(view, R.id.selected_value);
        recyclerView.setItemAnimator((M0E) null);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
    }
}
