package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1fz  reason: invalid class name */
public final class AnonymousClass1fz extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1fz(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(975300387);
        AnonymousClass3PD.A01((AnonymousClass4MA) obj, (C57583Bq) obj2, (AnonymousClass13K) view.getTag());
        C14030oh.A0A(270889923, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(1801229914);
        View view = AnonymousClass3PD.A00(this.A00, viewGroup).itemView;
        C14030oh.A0A(-1685952118, A03);
        return view;
    }
}
