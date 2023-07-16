package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1kg  reason: invalid class name and case insensitive filesystem */
public final class C24821kg extends AnonymousClass1lO {
    public final AnonymousClass3IU A00;

    public C24821kg(AnonymousClass3IU r2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
    }

    public final Class modelClass() {
        return AnonymousClass48M.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        int i;
        AnonymousClass48M r6 = (AnonymousClass48M) mfV;
        AnonymousClass13O r7 = (AnonymousClass13O) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r6, r7);
        View view = r7.A01;
        view.setVisibility(A1Y ? 1 : 0);
        int A03 = C18210wN.A03(r6.A01.A03);
        int i2 = A03 - r6.A00;
        if (i2 == A03) {
            r7.A02.setText(AnonymousClass0wJ.A0m(r7.A00.getResources(), i2, R.plurals.view_x_replies));
            i = 71;
        } else if (i2 > 0) {
            r7.A02.setText(AnonymousClass0wJ.A0m(r7.A00.getResources(), i2, R.plurals.view_x_previous_replies));
            i = 72;
        } else {
            r7.A02.setText(2131828329);
            i = 73;
        }
        C18200wM.A1E(view, r7, r6, this, i);
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass13O(C18180wK.A0D(layoutInflater, viewGroup, R.layout.row_view_replies, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }
}
