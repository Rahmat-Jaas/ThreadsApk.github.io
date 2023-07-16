package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.forker.Process;

/* renamed from: X.1gm  reason: invalid class name and case insensitive filesystem */
public final class C24031gm extends AnonymousClass436 {
    public C83124qp A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C24031gm(C83124qp r1) {
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C14030oh.A0A(1318481406, C14030oh.A03(1273585218));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(670328445);
        View rowView = this.A00.getRowView();
        C14030oh.A0A(1921137213, A03);
        return rowView;
    }
}
