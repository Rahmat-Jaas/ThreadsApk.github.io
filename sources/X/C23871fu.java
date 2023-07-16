package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1fu  reason: invalid class name and case insensitive filesystem */
public final class C23871fu extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C23871fu(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C14030oh.A0A(1321766316, C14030oh.A03(2013941362));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(170062843);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A00), viewGroup, R.layout.row_textless_header);
        C14030oh.A0A(-1759460042, A03);
        return A0H;
    }
}
