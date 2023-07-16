package X;

import android.content.Context;
import com.instagram.barcelona.R;

/* renamed from: X.6nt  reason: invalid class name and case insensitive filesystem */
public final class C111566nt {
    public final int A00(Context context, int i) {
        int i2;
        if (i == 0) {
            i2 = R.color.igds_success;
        } else if (i != 1) {
            if (i != 3) {
                if (i == 5) {
                    i2 = R.color.activator_card_progress_bad;
                } else if (i == 14) {
                    i2 = R.color.igds_separator;
                } else if (i == 19) {
                    i2 = R.color.direct_widget_primary_background;
                } else if (i == 20) {
                    i2 = R.color.default_cta_dominate_color;
                } else if (i != 22) {
                    if (i == 23) {
                        i2 = R.color.igds_photo_border;
                    } else {
                        throw C18190wL.A0a(AnonymousClass00U.A0J("Invalid color type: ", i));
                    }
                }
            }
            i2 = R.color.fundraiser_sticker_consumption_sheet_donation_disclaimer_normal_text_color;
        } else {
            i2 = R.color.igds_error_or_destructive;
        }
        return context.getColor(i2);
    }
}
