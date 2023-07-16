package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* renamed from: X.2tA  reason: invalid class name and case insensitive filesystem */
public final class C50542tA {
    public static void A00(Context context, C11630kW r11, C84234sm r12, AnonymousClass3B1 r13, C57713Ce r14, boolean z, boolean z2) {
        if (z && context != null) {
            C57703Cd r3 = r13.A01;
            r3.A00.getLayoutParams().height = context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = r3.A01;
            gradientSpinnerAvatarView.getLayoutParams().height = context.getResources().getDimensionPixelSize(R.dimen._self_serve_linking_artist_avatar_search_size);
            gradientSpinnerAvatarView.getLayoutParams().width = C18220wO.A01(context, R.dimen._self_serve_linking_artist_avatar_search_size);
            gradientSpinnerAvatarView.A06 = C18220wO.A01(context, R.dimen._self_serve_linking_artist_avatar_search_size);
            gradientSpinnerAvatarView.A05 = 0;
            GradientSpinnerAvatarView.A02(gradientSpinnerAvatarView);
            gradientSpinnerAvatarView.A08 = true;
            gradientSpinnerAvatarView.A09 = false;
            gradientSpinnerAvatarView.A06();
        }
        C57703Cd r6 = r13.A01;
        User user = r14.A01;
        C11630kW r4 = r11;
        C50552tB.A00(r4, user.B4M(), r6, r14.A02, r14.A03, r14.A04, user.BZi());
        if (z2) {
            r14.A00 = true;
        }
        ((CompoundButton) r13.A02.A08()).setChecked(r14.A00);
        ViewGroup viewGroup = r6.A00;
        C18200wM.A1E(viewGroup, r12, r13, r14, 77);
        r13.A00.A08().setVisibility(8);
        viewGroup.setAlpha(C18230wP.A00(r12.BYF(user) ? 1 : 0));
    }
}
