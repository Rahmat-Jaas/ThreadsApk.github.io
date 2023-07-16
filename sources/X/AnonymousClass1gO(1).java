package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1gO  reason: invalid class name */
public final class AnonymousClass1gO extends AnonymousClass436 {
    public final Context A00;
    public final C83074qk A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gO(Context context, C83074qk r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(1245708554);
        C61883We.A01((C63613hu) obj, this.A01, (C201613j) view.getTag());
        C14030oh.A0A(-804117233, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-1657554821);
        View view = C61883We.A00(this.A00, viewGroup, true).itemView;
        C14030oh.A0A(-1520953929, A03);
        return view;
    }
}
