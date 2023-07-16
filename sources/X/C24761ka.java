package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.1ka  reason: invalid class name and case insensitive filesystem */
public final class C24761ka extends AnonymousClass1lO {
    public final C23421do A00;

    public final Class modelClass() {
        return AnonymousClass48L.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        int i;
        AnonymousClass48L r6 = (AnonymousClass48L) mfV;
        AnonymousClass134 r7 = (AnonymousClass134) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r6, r7);
        Integer num = r6.A00;
        boolean z = r6.A01;
        C04220Ms.A0B(num, A1Y ? 1 : 0);
        IgdsListCell igdsListCell = r7.A02;
        Context context = r7.A00;
        switch (num.intValue()) {
            case 0:
                i = 2131836334;
                break;
            case 1:
                i = 2131836333;
                break;
            default:
                i = 2131836332;
                break;
        }
        igdsListCell.A0H(AnonymousClass0wJ.A0k(context, i));
        igdsListCell.setChecked(z);
        igdsListCell.A0B(C18200wM.A0R(r7, num, 103));
    }

    public C24761ka(C23421do r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C18240wQ.A1H(viewGroup);
        Context A0A = C18190wL.A0A(viewGroup);
        IgdsListCell A0T = C18240wQ.A0T(A0A);
        A0T.A0F(AnonymousClass24V.TYPE_RADIO, true);
        return new AnonymousClass134(A0A, this.A00, A0T);
    }
}
