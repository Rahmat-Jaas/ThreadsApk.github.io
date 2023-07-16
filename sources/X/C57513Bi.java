package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Set;

/* renamed from: X.3Bi  reason: invalid class name and case insensitive filesystem */
public final class C57513Bi {
    public View A00;
    public RecyclerView A01;
    public Set A02 = C18200wM.A0u();
    public final SearchEditText A03;

    public C57513Bi(View view, SearchEditText searchEditText) {
        this.A00 = view.findViewById(R.id.username_suggestions_container_vscroll);
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.username_suggestions_vscroll);
        this.A01 = recyclerView;
        Context context = view.getContext();
        C18200wM.A1H(recyclerView, 1);
        C34195I7r i7r = new C34195I7r(context);
        i7r.A00(context.getDrawable(R.drawable.horizontal_divider_1px));
        this.A01.A0y(i7r);
        this.A03 = searchEditText;
    }
}
