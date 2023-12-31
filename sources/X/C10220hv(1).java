package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: X.0hv  reason: invalid class name and case insensitive filesystem */
public final class C10220hv {
    public static void A00(Activity activity, Configuration configuration) {
        Resources resources = activity.getResources();
        Configuration configuration2 = resources.getConfiguration();
        int i = configuration2.orientation;
        int i2 = configuration.orientation;
        if (i != i2) {
            configuration2.orientation = i2;
            activity.createConfigurationContext(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            int i3 = displayMetrics.widthPixels;
            int i4 = displayMetrics.heightPixels;
            int max = Math.max(i3, i4);
            int min = Math.min(i3, i4);
            int i5 = configuration.orientation;
            if (i5 == 1) {
                displayMetrics.widthPixels = min;
                displayMetrics.heightPixels = max;
            } else if (i5 == 2) {
                displayMetrics.widthPixels = max;
                displayMetrics.heightPixels = min;
            }
        }
    }
}
