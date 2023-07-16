package X;

import android.view.View;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.endtoend.EndToEnd;

/* renamed from: X.0hO  reason: invalid class name */
public final class AnonymousClass0hO {
    public static final AnonymousClass0hO A00 = new AnonymousClass0hO();

    public final void A01(View view, int i, int i2) {
        String str;
        String A0S;
        C04220Ms.A0B(view, 1);
        if (EndToEnd.isRunningEndToEndTest()) {
            if (!EndToEnd.isRunningEndToEndTest()) {
                A0S = null;
            } else {
                if (i2 == i - 1) {
                    str = "_page_last_item";
                } else {
                    str = "";
                }
                A0S = AnonymousClass00U.A0S("scrollable_view_child_", str, i2);
            }
            view.setContentDescription(A0S);
        }
    }

    public static final void A00(View view) {
        if (view != null && EndToEnd.isRunningEndToEndTest()) {
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription == null || !AnonymousClass8bP.A0j(contentDescription, "jest_test_", false)) {
                if (view instanceof ListView) {
                    view.setContentDescription("jest_test_vertically_scrollable_view");
                }
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    M6x layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager == null || !layoutManager.A1b()) {
                        recyclerView.setContentDescription("jest_test_vertically_scrollable_view");
                    } else {
                        recyclerView.setContentDescription("jest_test_horizontally_scrollable_view");
                    }
                }
            }
        }
    }
}
