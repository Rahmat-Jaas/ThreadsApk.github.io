package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.Map;

/* renamed from: X.3hP  reason: invalid class name and case insensitive filesystem */
public final class C63393hP {
    public static final Map A00 = AnonymousClass0wJ.A0y();

    public static SearchEditText A02(View view, Fragment fragment) {
        ColorFilter A002 = A00(fragment.requireContext().getColor(R.color.igds_secondary_text));
        SearchEditText searchEditText = (SearchEditText) view.findViewById(R.id.search);
        searchEditText.getCompoundDrawablesRelative()[0].mutate().setColorFilter(A002);
        searchEditText.setClearButtonColorFilter(A002);
        searchEditText.setText("");
        return searchEditText;
    }

    public static ColorFilter A00(int i) {
        Map map = A00;
        Integer valueOf = Integer.valueOf(i);
        ColorFilter colorFilter = (ColorFilter) map.get(valueOf);
        if (colorFilter != null) {
            return colorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        map.put(valueOf, porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    public static ColorFilter A01(Context context, int i) {
        return A00(context.getColor(i));
    }

    public static void A03(Context context, Drawable drawable, int i) {
        drawable.setColorFilter(A00(context.getColor(i)));
    }

    public static void A04(Context context, ImageView imageView, int i) {
        imageView.setColorFilter(A00(context.getColor(i)));
    }

    public static void A05(Drawable drawable, int i) {
        drawable.setColorFilter(A00(i));
    }
}
