package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5AQ  reason: invalid class name */
public final class AnonymousClass5AQ extends C113246qz {
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A00 = AnonymousClass0wJ.A00(1550324123, recyclerView);
        int childCount = recyclerView.getChildCount();
        if (childCount >= 0) {
            int i3 = 0;
            while (true) {
                if (recyclerView.getChildAt(i3) instanceof ViewGroup) {
                    AnonymousClass7Kz.A0M();
                }
                if (i3 == childCount) {
                    break;
                }
                i3++;
            }
        }
        C14030oh.A0A(2135194798, A00);
    }
}
