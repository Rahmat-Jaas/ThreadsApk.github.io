package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.1fx  reason: invalid class name and case insensitive filesystem */
public final class C23901fx extends AnonymousClass436 {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C23901fx(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1351461835);
        AnonymousClass0wJ.A1O(view, obj);
        Object tag = view.getTag();
        C04220Ms.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleIgdsListCellItemViewBinder.Holder");
        C50302sm.A00((C57693Cc) obj, (AnonymousClass12V) tag);
        C14030oh.A0A(-1598330656, A03);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r1, Object obj, Object obj2) {
        AnonymousClass436.A01(r1);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A002 = AnonymousClass436.A00(-2119022373, viewGroup);
        IgdsListCell A0T = C18240wQ.A0T(this.A00);
        A0T.setTag(new AnonymousClass12V(A0T));
        C14030oh.A0A(-1570285780, A002);
        return A0T;
    }
}
