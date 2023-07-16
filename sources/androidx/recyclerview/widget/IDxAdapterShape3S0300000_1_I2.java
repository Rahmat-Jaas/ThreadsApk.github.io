package androidx.recyclerview.widget;

import X.AnonymousClass0wJ;
import X.AnonymousClass12G;
import X.AnonymousClass12K;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C41030Luu;
import X.C64593r8;
import X.M5O;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape14S1100000_1_I2;
import com.instagram.barcelona.R;
import java.util.List;

public class IDxAdapterShape3S0300000_1_I2 extends C41030Luu {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxAdapterShape3S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final int getItemCount() {
        int A032;
        int size;
        int i;
        if (this.A03 != 0) {
            A032 = C14030oh.A03(247116821);
            size = ((List) this.A02).size();
            i = 1167249860;
        } else {
            A032 = C14030oh.A03(780541276);
            size = ((List) this.A02).size();
            i = -1439972312;
        }
        C14030oh.A0A(i, A032);
        return size;
    }

    public final void onBindViewHolder(M5O m5o, int i) {
        if (this.A03 != 0) {
            String A0p = C18190wL.A0p((List) this.A02, i);
            if (m5o instanceof AnonymousClass12K) {
                C64593r8 r1 = new C64593r8(this, A0p, i);
                AnonymousClass12K r5 = (AnonymousClass12K) m5o;
                r5.A00.setText(A0p);
                r5.itemView.setOnClickListener(r1);
                return;
            }
            return;
        }
        String A0p2 = C18190wL.A0p((List) this.A02, i);
        ((TextView) m5o.itemView).setText(A0p2);
        m5o.itemView.setOnClickListener(new IDxCListenerShape14S1100000_1_I2(A0p2, (Object) this, 11));
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.A03 != 0) {
            return new AnonymousClass12K(AnonymousClass0wJ.A0H(C18180wK.A0C(viewGroup), viewGroup, R.layout.username_suggestion_row_view));
        }
        Context context = (Context) this.A01;
        TextView textView = new TextView(context);
        textView.setTextSize(2, context.getResources().getDimension(R.dimen.add_payment_bottom_sheet_row_subtitle_size) / C18230wP.A0E(context).density);
        textView.setBackgroundResource(R.drawable.reg_username_suggestion_button);
        C18180wK.A0s(context, textView, R.color.igds_secondary_text);
        return new AnonymousClass12G(textView, this);
    }
}
