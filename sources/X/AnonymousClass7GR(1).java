package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.7GR  reason: invalid class name */
public final class AnonymousClass7GR {
    public static final AnonymousClass7GR A00 = new AnonymousClass7GR();
    public static final C11630kW A01 = new C15720rm("bloks_follow_button");

    public static final void A00(AnonymousClass3HX r4, C127397h3 r5, UserSession userSession, FollowButton followButton, User user) {
        C11630kW r1;
        C11630kW r3;
        boolean z = r4.A02 instanceof C130667qT;
        if (z) {
            r1 = C63913ic.A09(r4);
        } else {
            r1 = A01;
        }
        C25917DvL dvL = followButton.A03;
        if (z) {
            r3 = C63913ic.A09(r4);
        } else {
            r3 = A01;
        }
        dvL.A06 = new C964865d(r3, r4, r5, userSession, followButton);
        dvL.A02(r1, userSession, user);
    }

    public static final void A01(C127397h3 r4, FollowButton followButton) {
        Typeface typeface;
        String A0C = C127397h3.A0C(r4);
        if (A0C != null) {
            int hashCode = A0C.hashCode();
            if (hashCode != -838103385) {
                if (hashCode == 3556653 && A0C.equals("text")) {
                    typeface = Typeface.DEFAULT;
                } else {
                    return;
                }
            } else if (A0C.equals("bold_text")) {
                typeface = Typeface.DEFAULT_BOLD;
            } else {
                return;
            }
            followButton.setGravity(19);
            followButton.setPadding(0, 0, 0, 0);
            followButton.setMinHeight(0);
            followButton.setBackground((Drawable) null);
            Context context = followButton.getContext();
            followButton.setTextSize(0, C86154wM.A01(context, R.dimen.abc_text_size_menu_header_material));
            followButton.setTypeface(typeface);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C121907Is.A00(context, R.attr.inverseUpdatableSecondaryLighterButtonStyle), new int[]{16842904});
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(0);
            if (colorStateList != null) {
                followButton.setTextColor(colorStateList);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
