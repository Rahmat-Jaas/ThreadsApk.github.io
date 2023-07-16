package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.51v  reason: invalid class name */
public final class AnonymousClass51v extends LinearLayout implements C143538gu {
    public C91965hN A00;

    public void setViewModel(C91965hN r11) {
        String str;
        C04220Ms.A0B(r11, 0);
        this.A00 = r11;
        IDxCListenerShape203S0100000_2_I2 iDxCListenerShape203S0100000_2_I2 = null;
        if (r11.A03) {
            Boolean bool = (Boolean) AnonymousClass7Ih.A0C(r11);
            if (bool == null || !bool.booleanValue()) {
                C91965hN r0 = this.A00;
                if (r0 == null) {
                    C04220Ms.A0E("viewModel");
                    throw null;
                }
                Integer num = r0.A02;
                if (num != null) {
                    str = AnonymousClass0wJ.A0l(getContext(), num, R.string.f0nameremoved);
                }
            }
            str = getContext().getString(R.string.f0nameremoved);
        } else {
            str = null;
        }
        AnonymousClass7Kz.A0M();
        Context context = getContext();
        C91965hN r02 = this.A00;
        if (r02 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        String string = context.getString(r02.A01);
        C91965hN r03 = this.A00;
        if (r03 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        String string2 = context.getString(r03.A00);
        C91965hN r04 = this.A00;
        if (r04 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        if (r04.A03) {
            iDxCListenerShape203S0100000_2_I2 = C86134wK.A0P(this, 16);
        }
        C04220Ms.A0B(string, 1);
        C19030yW r3 = new C19030yW(context);
        r3.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r3.A01(string);
        int i = (int) (((float) 33) * C18230wP.A0E(context).density);
        IgLinearLayout igLinearLayout = r3.A01;
        if (igLinearLayout == null) {
            C04220Ms.A0E("headerCellContainer");
            throw null;
        }
        igLinearLayout.setPadding(0, i, 0, 0);
        if (!(str == null || iDxCListenerShape203S0100000_2_I2 == null)) {
            r3.A03(str, iDxCListenerShape203S0100000_2_I2);
        }
        if (string2 != null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.fbpay_ui_address_list_header_body, (ViewGroup) null, false);
            C04220Ms.A0C(inflate, C18170wI.A00(5));
            TextView textView = (TextView) inflate;
            textView.setText(string2);
            textView.setLetterSpacing(-0.01f);
            r3.addView(textView);
        }
        r3.requestLayout();
        addView(r3);
    }

    private final View.OnClickListener getOnClickListener() {
        return C86134wK.A0P(this, 16);
    }

    public AnonymousClass51v(Context context) {
        super(context);
    }
}
