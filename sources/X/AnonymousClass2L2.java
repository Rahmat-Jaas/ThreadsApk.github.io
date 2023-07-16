package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.2L2  reason: invalid class name */
public final class AnonymousClass2L2 {
    public static final void A00(Context context, View view, L2R l2r, BKU bku, C21839C2o c2o, UserSession userSession) {
        String BK7;
        C04220Ms.A0B(view, 1);
        AnonymousClass0wJ.A1Q(bku, userSession);
        C04220Ms.A0B(c2o, 5);
        if (bku.A2Z(userSession) == null) {
            C14100oo ABJ = C10770iu.A00().ABJ("Exception handling CommentCaptionHeaderHelper.bindView - media user is null", 817896325);
            ABJ.A8U("Media Id", bku.A0f.A4Y);
            ABJ.report();
            return;
        }
        User A2Z = bku.A2Z(userSession);
        if (A2Z != null) {
            TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.username);
            TextView textView2 = (TextView) AnonymousClass0wJ.A0J(view, R.id.info_separator);
            FollowButton followButton = (FollowButton) AnonymousClass0wJ.A0J(view, R.id.user_follow_button);
            Resources resources = context.getResources();
            C04220Ms.A06(resources);
            boolean A0E = C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36324050250768617L);
            int i = R.dimen.auth_title_text_size;
            if (A0E) {
                i = R.dimen.abc_text_size_menu_header_material;
            }
            textView.setTextSize(0, resources.getDimension(i));
            textView2.setTextSize(0, resources.getDimension(i));
            followButton.setTextSize(0, resources.getDimension(i));
            if (A2Z.A3e()) {
                BK7 = A2Z.Ak1();
            } else {
                BK7 = A2Z.BK7();
            }
            SpannableStringBuilder A0E2 = C18200wM.A0E(BK7);
            if (A2Z.BZi()) {
                C63563ho.A04(textView.getContext(), A0E2, true);
            }
            AnonymousClass0wJ.A18(textView, 54, A2Z, l2r);
            textView.setText(A0E2);
            C23894D0g A00 = C25917DvL.A00(userSession, A2Z);
            C23894D0g d0g = C23894D0g.FollowStatusNotFollowing;
            if (A00 != d0g || A2Z.A3e()) {
                followButton.setVisibility(8);
            } else {
                C23894D0g d0g2 = A2Z.A03;
                int i2 = R.color.igds_primary_text;
                if (d0g2 == d0g) {
                    i2 = R.color.igds_primary_button;
                }
                followButton.setCustomForegroundColor(i2);
                C25917DvL dvL = followButton.A03;
                dvL.A06 = new C29531yl(c2o, userSession, followButton);
                dvL.A03 = bku;
                dvL.A02(c2o, userSession, A2Z);
            }
            textView2.setVisibility(followButton.getVisibility());
        }
    }
}
