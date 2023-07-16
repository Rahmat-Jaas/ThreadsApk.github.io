package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.11W  reason: invalid class name */
public final class AnonymousClass11W extends C61803Vq {
    public final int A00;
    public final int A01;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        int i;
        C04220Ms.A0B(rect, 0);
        AnonymousClass0wJ.A1O(view, recyclerView);
        int A03 = RecyclerView.A03(view);
        rect.top = 0;
        rect.bottom = 0;
        if (A03 == 0) {
            i = this.A01;
        } else {
            i = this.A00;
        }
        rect.left = i;
        C41030Luu luu = recyclerView.A0F;
        if (luu != null) {
            if (A03 == luu.getItemCount() - 1) {
                rect.right = this.A01;
            } else {
                rect.right = 0;
            }
        }
        if (AnonymousClass0hB.A02(view.getContext())) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
    }

    public AnonymousClass11W(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
