package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1gL  reason: invalid class name */
public final class AnonymousClass1gL extends AnonymousClass436 {
    public final Context A00;
    public final C83074qk A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass1gL(Context context, C83074qk r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-533945074);
        AnonymousClass0wJ.A1O(view, obj);
        Object tag = view.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleHeaderRowViewBinder.Holder");
        C61883We.A01((C63613hu) obj, this.A01, (C201613j) tag);
        C14030oh.A0A(1457643768, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-1604563871);
        C04220Ms.A0B(viewGroup, 1);
        View view = C61883We.A00(this.A00, viewGroup, true).itemView;
        C04220Ms.A06(view);
        C14030oh.A0A(-1097465207, A03);
        return view;
    }
}
