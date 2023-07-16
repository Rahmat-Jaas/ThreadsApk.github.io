package X;

import android.text.Layout;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;

/* renamed from: X.6G7  reason: invalid class name */
public final class AnonymousClass6G7 {
    public static final boolean A00(AnonymousClass601 r3, C63893iY r4) {
        boolean A1Y = AnonymousClass0wJ.A1Y(r4, r3);
        View A0J = C63893iY.A03(r4, A1Y ? 1 : 0).A0J(r3.A00);
        if (A0J instanceof RCTextView) {
            RCTextView rCTextView = (RCTextView) A0J;
            if (rCTextView.A08) {
                return true;
            }
            Layout layout = rCTextView.A06;
            int i = 0;
            while (i < layout.getLineCount()) {
                if (layout.getEllipsisCount(i) <= 0) {
                    i++;
                } else if (i != -1) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        C30967GcS.A02("bk.action.text.IsTruncated", "called on non-text component");
        return A1Y;
    }
}
