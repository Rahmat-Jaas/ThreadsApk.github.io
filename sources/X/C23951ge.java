package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1ge  reason: invalid class name and case insensitive filesystem */
public final class C23951ge extends AnonymousClass436 {
    public final Context A00;
    public final C82214pG A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C23951ge(Context context, C82214pG r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C14030oh.A0A(-498159038, C14030oh.A03(-2113265202));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(2032474297);
        Context context = this.A00;
        C82214pG r3 = this.A01;
        View inflate = LayoutInflater.from(context).inflate(R.layout.create_page_row, viewGroup, false);
        AnonymousClass0wJ.A16(inflate, 108, r3);
        C18210wN.A0y(inflate);
        C14030oh.A0A(-325348662, A03);
        return inflate;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C14030oh.A03(611388344);
        if (view == null) {
            Context context = this.A00;
            C82214pG r3 = this.A01;
            view = LayoutInflater.from(context).inflate(R.layout.create_page_row, viewGroup, false);
            AnonymousClass0wJ.A16(view, 108, r3);
            C18210wN.A0y(view);
        }
        C14030oh.A0A(-1372452845, A03);
        return view;
    }
}
