package X;

import android.view.View;
import com.facebook.redex.IDxIListenerShape289S0100000_1_I2;
import com.instagram.barcelona.R;

/* renamed from: X.3B1  reason: invalid class name */
public final class AnonymousClass3B1 {
    public C19577Ayd A00;
    public C57703Cd A01;
    public C19577Ayd A02;

    public AnonymousClass3B1(View view) {
        this.A01 = new C57703Cd(view);
        C19577Ayd A0U = C18190wL.A0U(view, R.id.selectable_user_row_checkbox_view_stub);
        this.A02 = A0U;
        A0U.A02 = new IDxIListenerShape289S0100000_1_I2(this, 1);
        this.A00 = C18190wL.A0U(view, R.id.selectable_user_row_action_button_view_stub);
    }
}
