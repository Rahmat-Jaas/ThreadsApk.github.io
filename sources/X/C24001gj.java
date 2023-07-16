package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.forker.Process;

/* renamed from: X.1gj  reason: invalid class name and case insensitive filesystem */
public final class C24001gj extends AnonymousClass436 {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return 0;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Process.WAIT_RESULT_TIMEOUT;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C24001gj(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(2086997493);
        C61883We.A02((C63613hu) obj, (C201613j) view.getTag(), ((AnonymousClass36S) obj2).A00);
        C14030oh.A0A(-13880068, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-2038080600);
        View view = C61883We.A00(this.A00, viewGroup, false).itemView;
        C14030oh.A0A(-562385633, A03);
        return view;
    }
}
