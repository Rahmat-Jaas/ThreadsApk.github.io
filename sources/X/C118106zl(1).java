package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6zl  reason: invalid class name and case insensitive filesystem */
public final class C118106zl {
    public static final void A00(Context context, View view, View view2, View view3, ImageUrl imageUrl) {
        float dimension = context.getResources().getDimension(R.dimen.abc_floating_window_z);
        float dimension2 = context.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        float A01 = C86154wM.A01(context, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        float height = ((((float) view.getHeight()) - ((float) view2.getHeight())) - dimension) - A01;
        float width = ((float) view.getWidth()) - (((float) 2) * dimension2);
        float height2 = ((float) imageUrl.getHeight()) / ((float) imageUrl.getWidth());
        float f = width * height2;
        if (f > height) {
            width = height / height2;
        } else {
            height = f;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) width, (int) height);
        int i = (int) dimension2;
        layoutParams.setMargins(i, (int) A01, i, (int) dimension);
        view3.setLayoutParams(layoutParams);
    }
}
