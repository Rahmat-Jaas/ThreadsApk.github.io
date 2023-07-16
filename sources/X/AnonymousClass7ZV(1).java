package X;

import android.view.View;
import com.facebookpay.widget.listcell.ListCell;

/* renamed from: X.7ZV  reason: invalid class name */
public final class AnonymousClass7ZV implements C009003z {
    public final /* synthetic */ ListCell A00;

    public AnonymousClass7ZV(ListCell listCell) {
        this.A00 = listCell;
    }

    public final boolean CWW(View view, C008903y r5) {
        ListCell listCell = this.A00;
        AnonymousClass51G r0 = listCell.A0M;
        if (r0 == null || !r0.hasOnClickListeners()) {
            return listCell.performClick();
        }
        AnonymousClass51G r02 = listCell.A0M;
        if (r02 != null) {
            return r02.performClick();
        }
        throw AnonymousClass0wJ.A0b();
    }
}
