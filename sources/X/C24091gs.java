package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1gs  reason: invalid class name and case insensitive filesystem */
public final class C24091gs extends AnonymousClass436 {
    public final Context A00;
    public final CharSequence A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C24091gs(Context context, CharSequence charSequence, String str) {
        this.A00 = context;
        this.A02 = str;
        this.A01 = charSequence;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C14030oh.A0A(1194273579, C14030oh.A03(-1731603856));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(517910725);
        View A002 = C34542Jy.A00(this.A00, viewGroup, this.A01, this.A02);
        C14030oh.A0A(172057248, A03);
        return A002;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C14030oh.A03(818097147);
        if (view == null) {
            view = C34542Jy.A00(this.A00, viewGroup, this.A01, this.A02);
        }
        C14030oh.A0A(-902283417, A03);
        return view;
    }

    public C24091gs(Context context, String str, String str2) {
        this.A00 = context;
        this.A01 = str2;
        this.A02 = str;
    }
}
