package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Li  reason: invalid class name and case insensitive filesystem */
public final class C59573Li {
    public static final Drawable A01(Context context, AnonymousClass252 r3, boolean z) {
        int i;
        switch (C18230wP.A04(r3, 2)) {
            case 0:
                i = R.drawable.instagram_users_pano_filled_24;
                break;
            case 1:
                i = R.drawable.instagram_eye_off_pano_outline_24;
                break;
            case 2:
                i = R.drawable.instagram_crown_pano_outline_24;
                break;
            case 3:
                return C19557AyI.A01(context);
            case 4:
                i = R.drawable.instagram_user_requested_pano_filled_24;
                break;
            case 5:
                i = R.drawable.instagram_app_instagram_pano_outline_24;
                break;
            default:
                i = 0;
                break;
        }
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            drawable.mutate();
            int i2 = R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_bold_text_color;
            if (z) {
                i2 = R.color.igds_icon_on_color;
            }
            drawable.setTint(context.getColor(i2));
        }
        return drawable;
    }

    public static final int A00(UserSession userSession, AnonymousClass252 r3, boolean z) {
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, r3);
        switch (r3.ordinal()) {
            case 0:
                if (!z) {
                    return 2131828663;
                }
                if (C18190wL.A1Z(AnonymousClass0wJ.A0Y(userSession).A0k(), A1Z)) {
                    return 2131829732;
                }
                return 2131829733;
            case 1:
                return 2131828660;
            case 2:
                return 2131828668;
            case 3:
                return 2131828651;
            case 4:
                return 2131828653;
            case 5:
                return 2131828656;
            default:
                throw new UnsupportedOperationException("Cannot get title for unsupported audience mode");
        }
    }
}
