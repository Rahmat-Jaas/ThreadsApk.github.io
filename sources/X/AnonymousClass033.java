package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt$descendants$1;

/* renamed from: X.033  reason: invalid class name */
public final class AnonymousClass033 {
    public static final C146838mw A01(ViewGroup viewGroup) {
        C04220Ms.A0B(viewGroup, 0);
        return C102616Vw.A00(new ViewGroupKt$descendants$1(viewGroup, (C146958n9) null));
    }

    public static final View A00(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException(AnonymousClass00U.A01(i, viewGroup.getChildCount(), "Index: ", ", Size: "));
    }
}
