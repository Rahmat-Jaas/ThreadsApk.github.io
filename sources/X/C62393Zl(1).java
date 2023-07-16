package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3Zl  reason: invalid class name and case insensitive filesystem */
public final class C62393Zl {
    public static final Drawable A00(Context context, Bitmap bitmap, String str) {
        return A01(context, bitmap, str, context.getResources().getDimensionPixelSize(R.dimen._self_serve_linking_artist_avatar_search_size), 0, 0);
    }

    public static final Drawable A02(Context context, ImageUrl imageUrl, String str) {
        C04220Ms.A0B(context, 0);
        Resources resources = context.getResources();
        return A03(context, imageUrl, str, resources.getDimensionPixelSize(R.dimen.business_card_profile_pic_size), resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), context.getColor(R.color.canvas_bottom_sheet_description_text_color));
    }

    public static final Drawable A01(Context context, Bitmap bitmap, String str, int i, int i2, int i3) {
        C86794yH r0 = new C86794yH((ImageUrl) null, str, i, context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height), context.getColor(R.color.facepile_inner_stroke_color), i2, i3, 0, false);
        r0.A01(bitmap);
        return r0;
    }

    public static final Drawable A03(Context context, ImageUrl imageUrl, String str, int i, int i2, int i3) {
        return new C86794yH(imageUrl, str, i, context.getResources().getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height), context.getColor(R.color.facepile_inner_stroke_color), i2, i3, 0, true);
    }
}
