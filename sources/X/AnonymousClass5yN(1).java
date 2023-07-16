package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.5yN  reason: invalid class name */
public final class AnonymousClass5yN extends AnonymousClass436 {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass5yN(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-249219376);
        AnonymousClass0wJ.A1O(view, obj);
        String str = (String) obj;
        Object tag = view.getTag();
        if (tag != null) {
            ((C106036eO) tag).A00.setText(str);
            C14030oh.A0A(1676690919, A03);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(1850461735, viewGroup);
        View A0D = C18180wK.A0D(LayoutInflater.from(this.A00), viewGroup, R.layout.searchable_list_filter_header_row, false);
        A0D.setTag(new C106036eO(A0D));
        C14030oh.A0A(1589222643, A002);
        return A0D;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }
}
