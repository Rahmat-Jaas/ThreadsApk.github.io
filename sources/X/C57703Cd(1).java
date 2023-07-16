package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.3Cd  reason: invalid class name and case insensitive filesystem */
public final class C57703Cd {
    public ViewGroup A00;
    public GradientSpinnerAvatarView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public C57703Cd(View view) {
        C04220Ms.A0B(view, 1);
        this.A00 = (ViewGroup) AnonymousClass0wJ.A0J(view, R.id.row_user_container);
        this.A03 = (TextView) AnonymousClass0wJ.A0J(view, R.id.row_user_username);
        this.A04 = (TextView) AnonymousClass0wJ.A0J(view, R.id.row_user_info);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(view, R.id.user_social_context);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) AnonymousClass0wJ.A0J(view, R.id.selectable_user_row_avatar);
        this.A01 = gradientSpinnerAvatarView;
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
    }
}
