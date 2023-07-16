package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.1ft  reason: invalid class name and case insensitive filesystem */
public final class C23861ft extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C23861ft(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(285517011);
        ((AnonymousClass12O) view.getTag()).A00.setBody(((AnonymousClass36O) obj).A00, C18180wK.A0X());
        C14030oh.A0A(-2037017086, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-774596249);
        IgdsBanner igdsBanner = new IgdsBanner(this.A00);
        AnonymousClass12O r0 = new AnonymousClass12O(igdsBanner);
        igdsBanner.setTag(r0);
        View view = r0.itemView;
        C14030oh.A0A(854044354, A03);
        return view;
    }
}
