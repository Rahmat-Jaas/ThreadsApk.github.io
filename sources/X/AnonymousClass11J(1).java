package X;

import android.view.ViewGroup;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.redex.IDxCCallbackShape483S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgRadioButton;
import java.util.List;

/* renamed from: X.11J  reason: invalid class name */
public final class AnonymousClass11J extends C41030Luu {
    public int A00;
    public C39769Kzd A01;
    public final C58143Ed A02;
    public final List A03;

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        return new AnonymousClass13Z(C18200wM.A0F(C18180wK.A0C(viewGroup), viewGroup, R.layout.layout_account_row, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        AnonymousClass13Z r7 = (AnonymousClass13Z) m5o;
        C04220Ms.A0B(r7, 0);
        List list = this.A03;
        String str = ((AnonymousClass3CV) list.get(r7.getBindingAdapterPosition())).A02;
        String str2 = ((AnonymousClass3CV) list.get(r7.getBindingAdapterPosition())).A00;
        TextView textView = r7.A02;
        if (str != null) {
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
        TextView textView2 = r7.A01;
        if (str2 != null) {
            int i2 = 2131836220;
            if ("FB_USER".equals(str2)) {
                i2 = 2131836221;
            }
            textView2.setText(i2);
        } else {
            textView2.setVisibility(8);
        }
        if (((AnonymousClass3CV) list.get(r7.getBindingAdapterPosition())).A04 != null) {
            this.A01 = new IDxCCallbackShape483S0100000_1_I2(r7, 0);
            C37030Jj7 A0A = C37744K2e.A01().A0A(C18250wR.A0K(((AnonymousClass3CV) list.get(r7.getBindingAdapterPosition())).A04), (String) null);
            A0A.A02(this.A01);
            A0A.A01();
        }
        IgRadioButton igRadioButton = r7.A03;
        igRadioButton.setChecked(AnonymousClass0wJ.A1T(r7.getBindingAdapterPosition(), this.A00));
        AnonymousClass0wJ.A18(r7.A00, HttpStatus.SC_MULTI_STATUS, this, r7);
        AnonymousClass0wJ.A18(igRadioButton, 208, this, r7);
    }

    public AnonymousClass11J(C58143Ed r2, List list, int i) {
        this.A03 = list;
        this.A02 = r2;
        this.A00 = i;
        if (C18190wL.A1a(list) && r2 != null) {
            r2.A00((AnonymousClass3CV) list.get(this.A00));
        }
    }

    public static int A00(IDxCListenerShape70S0200000_1_I2 iDxCListenerShape70S0200000_1_I2, int i) {
        int A05 = C14030oh.A05(i);
        AnonymousClass11J r3 = (AnonymousClass11J) iDxCListenerShape70S0200000_1_I2.A01;
        r3.A00 = ((M5O) iDxCListenerShape70S0200000_1_I2.A00).getBindingAdapterPosition();
        r3.notifyDataSetChanged();
        C58143Ed r2 = r3.A02;
        if (r2 != null) {
            r2.A00((AnonymousClass3CV) r3.A03.get(r3.A00));
        }
        return A05;
    }

    public final int getItemCount() {
        int A032 = C14030oh.A03(312531636);
        int size = this.A03.size();
        C14030oh.A0A(-2002972716, A032);
        return size;
    }
}
