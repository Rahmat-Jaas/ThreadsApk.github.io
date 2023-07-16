package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.barcelona.R;

/* renamed from: X.6PZ  reason: invalid class name */
public final class AnonymousClass6PZ {
    public static final int A00(Context context) {
        View findViewById;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i = dimensionPixelSize % 3;
        if (i != 0) {
            dimensionPixelSize += 3 - i;
        }
        int i2 = dimensionPixelSize * 2;
        int A01 = C09850gn.A01(context);
        if (!(!(context instanceof Activity) || (findViewById = ((Activity) context).findViewById(R.id.ls_nav_bar)) == null || findViewById.getVisibility() == 8)) {
            A01 -= findViewById.getWidth();
        }
        return (A01 - i2) / 3;
    }
}
