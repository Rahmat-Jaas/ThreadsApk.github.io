package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1fl  reason: invalid class name and case insensitive filesystem */
public final class C23781fl extends AnonymousClass436 {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C23781fl(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C14030oh.A0A(1227150176, C14030oh.A03(-77554925));
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(1977195792, viewGroup);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_divider_thick);
        C04220Ms.A06(A0H);
        C14030oh.A0A(-945090249, A002);
        return A0H;
    }
}
