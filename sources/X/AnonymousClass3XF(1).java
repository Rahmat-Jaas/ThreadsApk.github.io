package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import java.util.List;
import java.util.Map;

/* renamed from: X.3XF  reason: invalid class name */
public final class AnonymousClass3XF {
    public static final List A00 = AnonymousClass0wJ.A0v();
    public static final Map A01 = AnonymousClass0wJ.A0y();

    public static View A00(View view, String str) {
        String str2;
        Object tag = view.getTag(R.id.view_tag_native_id);
        if ((tag instanceof String) && (str2 = (String) tag) != null && str2.equals(str)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View A002 = A00(viewGroup.getChildAt(i), str);
            if (A002 != null) {
                return A002;
            }
        }
        return null;
    }
}
