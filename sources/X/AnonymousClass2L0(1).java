package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2L0  reason: invalid class name */
public final class AnonymousClass2L0 {
    public static Drawable A00(Context context, String str, List list, int i, int i2) {
        Context context2 = context;
        Drawable A02 = C19557AyI.A02(context, R.drawable.close_friends_star_60);
        int color = context.getColor(R.color.grey_1);
        int i3 = i2;
        int i4 = i + (i2 << 1);
        InsetDrawable insetDrawable = new InsetDrawable(A02, i3);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        C63393hP.A05(shapeDrawable, -1);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, insetDrawable});
        List list2 = list;
        if (list2.isEmpty()) {
            return layerDrawable;
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(layerDrawable);
        int i5 = 0;
        while (i5 < list2.size()) {
            A0v.add(new C86794yH((ImageUrl) list2.get(i5), str, i4, i3, -1, color));
            i5++;
            if (i5 >= 3) {
                break;
            }
        }
        return new C18470xF(context2, AnonymousClass006.A00, A0v, 0.3f, i4, i4, 0);
    }
}
