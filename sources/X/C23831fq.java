package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape73S0200000_4_I2;
import com.instagram.barcelona.R;
import com.instagram.model.venue.Venue;

/* renamed from: X.1fq  reason: invalid class name and case insensitive filesystem */
public final class C23831fq extends AnonymousClass436 {
    public final C22266CRf A00;

    public final int getViewTypeCount() {
        return 2;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C83434rN r2, Object obj, Object obj2) {
        int i;
        if (obj instanceof Venue) {
            i = 0;
        } else if (obj instanceof C30141zt) {
            i = 1;
        } else {
            throw C18240wQ.A0j();
        }
        r2.A5K(i);
    }

    public C23831fq(C22266CRf cRf) {
        this.A00 = cRf;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C14030oh.A03(1818537103);
        if (i == 0) {
            Venue venue = (Venue) obj;
            AnonymousClass3CB r6 = (AnonymousClass3CB) C18210wN.A0X(view);
            C22266CRf cRf = this.A00;
            r6.A04.setText(venue.A00.A0K);
            r6.A00.setVisibility(8);
            r6.A02.setVisibility(C18190wL.A00(cRf.A0Q ? 1 : 0));
            boolean isEmpty = TextUtils.isEmpty(venue.A00.A0E);
            TextView textView = r6.A03;
            if (!isEmpty) {
                textView.setText(venue.A00.A0E);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            r6.A01.setOnClickListener(new IDxCListenerShape73S0200000_4_I2(100, (Object) cRf, (Object) venue));
        } else if (i == 1) {
            AnonymousClass39B r1 = (AnonymousClass39B) C18210wN.A0X(view);
            C04220Ms.A0B(r1, 0);
            r1.A01.setText(2131831761);
        } else {
            UnsupportedOperationException A0j = C18240wQ.A0j();
            C14030oh.A0A(613757879, A03);
            throw A0j;
        }
        C14030oh.A0A(-1644468071, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View A0H;
        int i2;
        int A03 = C14030oh.A03(220848562);
        LayoutInflater A0C = C18180wK.A0C(viewGroup);
        if (i == 0) {
            A0H = AnonymousClass0wJ.A0H(A0C, viewGroup, R.layout.row_venue);
            A0H.setTag(new AnonymousClass3CB(A0H));
            i2 = 552295785;
        } else if (i == 1) {
            A0H = C50362ss.A00(A0C, viewGroup);
            i2 = -93093454;
        } else {
            UnsupportedOperationException A0j = C18240wQ.A0j();
            C14030oh.A0A(562943766, A03);
            throw A0j;
        }
        C14030oh.A0A(i2, A03);
        return A0H;
    }
}
