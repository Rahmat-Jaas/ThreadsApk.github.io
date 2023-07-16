package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.1g2  reason: invalid class name */
public final class AnonymousClass1g2 extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1g2(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1435793838);
        view.getTag().getClass();
        ((C561736b) view.getTag()).A00.setAdapter((C41030Luu) obj);
        C14030oh.A0A(1445118952, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-854433616);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.login_activity_map_row, viewGroup, false);
        C561736b r3 = new C561736b((RecyclerView) inflate.requireViewById(R.id.login_activity_map_recycler_view));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        RecyclerView recyclerView = r3.A00;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.A0y(new AnonymousClass11W(0, C18250wR.A00(context.getResources())));
        inflate.setTag(r3);
        C14030oh.A0A(-1006679674, A03);
        return inflate;
    }
}
