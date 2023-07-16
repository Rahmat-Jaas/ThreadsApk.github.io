package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.5yM  reason: invalid class name */
public final class AnonymousClass5yM extends AnonymousClass436 {
    public final AnonymousClass5yH A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        r2.A5K(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public AnonymousClass5yM(AnonymousClass5yH r1) {
        this.A00 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(-1438633347);
        Object tag = view.getTag();
        tag.getClass();
        C107936hY r3 = (C107936hY) tag;
        C109206jd r8 = (C109206jd) obj;
        AnonymousClass5yH r2 = this.A00;
        r3.A01.setText(r8.A01);
        C86104wH.A1D(r3.A00, 63, r2, r8);
        C14030oh.A0A(1760544426, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C14030oh.A03(-692580878);
        View A0H = AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_service_partner);
        A0H.setTag(new C107936hY(A0H));
        C14030oh.A0A(2036491207, A03);
        return A0H;
    }
}
