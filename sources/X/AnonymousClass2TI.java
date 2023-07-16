package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.2TI  reason: invalid class name */
public final class AnonymousClass2TI {
    public static final void A00(UserSession userSession, Context context, boolean z) {
        Drawable drawable;
        boolean A1Z = AnonymousClass0wJ.A1Z(context, userSession);
        int i = R.drawable.instagram_warning_pano_outline_24;
        int i2 = 2131830210;
        int i3 = 2131830209;
        int i4 = R.dimen.add_to_story_dual_destination_share_sheet_story_row_height;
        if (z) {
            i = R.drawable.instagram_draft_pano_outline_24;
            i2 = 2131830213;
            i3 = 2131830212;
            i4 = R.dimen.action_bar_item_spacing_left;
        }
        if (!new GWa(context).A03(false) && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36327705267939448L)) {
            Drawable drawable2 = context.getDrawable(i);
            if (drawable2 != null) {
                drawable = drawable2.mutate();
                if (drawable != null) {
                    drawable.setTint(context.getColor(R.color.igds_icon_on_color));
                }
            } else {
                drawable = null;
            }
            C63733iD A01 = C63733iD.A01();
            C63733iD.A07(context, A01, i2);
            A01.A0J = A1Z;
            C63733iD.A06(context, drawable, A01, i3);
            A01.A0C();
            A01.A0G = A1Z;
            A01.A02 = context.getResources().getDimensionPixelOffset(i4);
            A01.A0M = A1Z;
            C63733iD.A0A(A01);
        }
    }
}
