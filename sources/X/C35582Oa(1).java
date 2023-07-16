package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import com.instagram.barcelona.R;

/* renamed from: X.2Oa  reason: invalid class name and case insensitive filesystem */
public final class C35582Oa {
    public static void A00(ImageView imageView, int i) {
        String A0m;
        imageView.setActivated(C18180wK.A1X(i));
        imageView.setImageLevel(Math.min(i, 10000));
        Context context = imageView.getContext();
        if (i == 0) {
            A0m = context.getString(2131831912);
        } else {
            Resources resources = context.getResources();
            if (i < 99) {
                A0m = AnonymousClass0wJ.A0m(resources, i, R.plurals.notification_badge_description_plural);
            } else {
                A0m = AnonymousClass0wJ.A0m(resources, 99, R.plurals.notification_badge_description_more_than);
            }
        }
        imageView.setContentDescription(A0m);
    }
}
