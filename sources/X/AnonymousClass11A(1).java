package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape6S0101000_1_I2;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.11A  reason: invalid class name */
public final class AnonymousClass11A extends C41030Luu {
    public C82604py A00;
    public final List A01 = AnonymousClass0wJ.A0v();

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        return new AnonymousClass12F(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.action_sheet_row, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        int i2;
        AnonymousClass12F r6 = (AnonymousClass12F) m5o;
        C04220Ms.A0B(r6, 0);
        Context A0B = C18240wQ.A0B(r6);
        if (getItemViewType(i) == 0) {
            List list = this.A01;
            C63063bP r3 = (C63063bP) list.get(i);
            int i3 = r3.A02;
            TextView textView = r6.A00;
            if (i3 != 0) {
                textView.setText(i3);
            } else {
                textView.setText(r3.A03);
            }
            C18180wK.A0s(A0B, textView, ((C63063bP) list.get(i)).A05);
            if (i == getItemCount() - 1) {
                i2 = A0B.getResources().getDimensionPixelSize(R.dimen.account_permission_section_vertical_padding);
            } else {
                i2 = 0;
            }
            C09860go.A0M(textView, i2);
            textView.setMaxLines(r3.A01);
            if (this.A00 != null) {
                C18210wN.A0y(textView);
                textView.setOnClickListener(new IDxCListenerShape6S0101000_1_I2(this, i, 3));
            }
        }
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(-1182979538);
        int size = this.A01.size();
        C14030oh.A0A(-1397289239, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        C14030oh.A0A(-2128965550, C14030oh.A03(-490792699));
        return 0;
    }
}
