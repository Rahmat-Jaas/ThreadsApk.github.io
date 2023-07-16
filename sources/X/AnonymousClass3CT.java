package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.3CT  reason: invalid class name */
public final class AnonymousClass3CT {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final C19577Ayd A03;
    public final GradientSpinnerAvatarView A04;

    public AnonymousClass3CT(View view) {
        this.A00 = AnonymousClass0wJ.A0K(view, R.id.row_user_container);
        this.A04 = (GradientSpinnerAvatarView) AnonymousClass0wJ.A0J(view, R.id.selectable_user_row_avatar);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(view, R.id.row_user_username);
        this.A01 = (TextView) AnonymousClass0wJ.A0J(view, R.id.row_user_info);
        View requireViewById = view.requireViewById(R.id.selectable_user_row_checkbox_view_stub);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.view.ViewStub");
        C19577Ayd ayd = new C19577Ayd((ViewStub) requireViewById);
        this.A03 = ayd;
        ayd.A02 = AnonymousClass4AH.A00;
        ayd.A09(0);
    }
}
