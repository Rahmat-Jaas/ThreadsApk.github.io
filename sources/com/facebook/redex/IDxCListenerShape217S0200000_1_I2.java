package com.facebook.redex;

import X.AnonymousClass1cM;
import X.AnonymousClass4tH;
import X.C09860go;
import X.C18220wO;
import X.C18230wP;
import X.C85924vz;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

public class IDxCListenerShape217S0200000_1_I2 implements View.OnFocusChangeListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape217S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onFocusChange(View view, boolean z) {
        View view2;
        int i;
        switch (this.A02) {
            case 0:
                view2 = (View) this.A01;
                i = R.drawable.input_highlighted;
                if (!z) {
                    view2.setBackgroundResource(R.drawable.input);
                    AnonymousClass1cM r2 = (AnonymousClass1cM) this.A00;
                    r2.A0S.removeMessages(1);
                    AnonymousClass1cM.A03(r2);
                    return;
                }
                break;
            case 1:
                if (z) {
                    ((C85924vz) this.A01).Bw0();
                    return;
                }
                return;
            case 2:
                int i2 = R.color.igds_separator;
                if (z) {
                    i2 = R.color.default_cta_dominate_color;
                }
                C18230wP.A0z(C18220wO.A0A(this.A01), (View) this.A00, i2);
                if (!z) {
                    C09860go.A0I(view);
                    return;
                }
                return;
            default:
                EditPhoneNumberView editPhoneNumberView = (EditPhoneNumberView) this.A00;
                AnonymousClass4tH r22 = (AnonymousClass4tH) this.A01;
                if (!editPhoneNumberView.A06) {
                    view2 = editPhoneNumberView.A00;
                    i = R.drawable.input;
                    if (z) {
                        view2.setBackgroundResource(R.drawable.input_highlighted);
                    }
                } else if (!z) {
                    return;
                }
                r22.CAo();
                return;
        }
        view2.setBackgroundResource(i);
    }
}
