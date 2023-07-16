package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.3JI  reason: invalid class name */
public final class AnonymousClass3JI {
    public static final Set A00(ViewGroup viewGroup, AnonymousClass3JI r8, int i) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (C04220Ms.A0I(childAt.getTag(R.id.bk_extension_viewtag_int), Integer.valueOf(i))) {
                linkedHashSet.add(childAt);
            }
            if (childAt instanceof ViewGroup) {
                linkedHashSet.addAll(A00((ViewGroup) childAt, r8, i));
            }
        }
        return linkedHashSet;
    }
}
