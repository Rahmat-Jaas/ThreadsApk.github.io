package X;

import android.view.View;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.3Id  reason: invalid class name and case insensitive filesystem */
public final class C58923Id {
    public View A00;
    public C35394Iu2 A01;
    public IgdsBottomButtonLayout A02;

    public C58923Id(View view, C35394Iu2 iu2) {
        C04220Ms.A0B(iu2, 2);
        this.A01 = iu2;
        this.A00 = iu2.ordinal() == 39 ? view.findViewById(R.id.connect_button_container) : view;
    }

    public final void A00() {
        View view = this.A00;
        if (view != null) {
            this.A02 = C18230wP.A0W(view, R.id.action_bottom_button);
        }
    }

    public final void A01(int i) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionText(igdsBottomButtonLayout.getResources().getString(i));
        }
    }

    public final void A02(C82254pK r3) {
        IDxCListenerShape70S0200000_1_I2 A0R = C18200wM.A0R(this, r3, 42);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(A0R);
        }
    }

    public final void A03(boolean z) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(z);
        }
    }

    public final void A04(boolean z) {
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A02;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionIsLoading(z);
        }
    }
}
