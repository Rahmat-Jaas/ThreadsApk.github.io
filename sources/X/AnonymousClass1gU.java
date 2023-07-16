package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.reels.dashboard.fragment.ReelDashboardFragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.1gU  reason: invalid class name */
public final class AnonymousClass1gU extends AnonymousClass436 {
    public final C11630kW A00;
    public final ReelDashboardFragment A01;
    public final UserSession A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gU(C11630kW r2, ReelDashboardFragment reelDashboardFragment, UserSession userSession) {
        AnonymousClass0wJ.A1O(r2, userSession);
        C04220Ms.A0B(reelDashboardFragment, 3);
        this.A00 = r2;
        this.A02 = userSession;
        this.A01 = reelDashboardFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-900766233);
        AnonymousClass0wJ.A1O(view, obj);
        ((RecyclerView) view).setAdapter(new C150198vr(this.A00, (BKH) obj, this.A01, this.A02));
        C14030oh.A0A(-208278546, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(-1279879149, viewGroup);
        View inflate = C18180wK.A0C(viewGroup).inflate(R.layout.reel_dashboard_prompt_replies, viewGroup, false);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) inflate;
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        C14030oh.A0A(-1094609322, A002);
        return recyclerView;
    }
}
