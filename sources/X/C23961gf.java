package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1gf  reason: invalid class name and case insensitive filesystem */
public final class C23961gf extends AnonymousClass436 {
    public boolean A00 = true;
    public final Context A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C23961gf(Context context) {
        this.A01 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1475737840);
        C554333e r1 = (C554333e) view.getTag();
        if (r1 != null) {
            r1.A00.setVisibility(C18190wL.A00(this.A00 ? 1 : 0));
        }
        C14030oh.A0A(2099073307, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-1027185958);
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A01), viewGroup, R.layout.suggest_business_loadmore_indicator);
        A0H.setTag(new C554333e(A0H));
        C14030oh.A0A(-1178305366, A03);
        return A0H;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C14030oh.A03(1117662939);
        if (view == null) {
            view = AnonymousClass0wJ.A0H(LayoutInflater.from(this.A01), viewGroup, R.layout.suggest_business_loadmore_indicator);
            view.setTag(new C554333e(view));
        }
        C14030oh.A0A(-1658779055, A03);
        return view;
    }
}
