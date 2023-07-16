package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.11P  reason: invalid class name */
public final class AnonymousClass11P extends C61803Vq {
    public final int A00;

    public AnonymousClass11P(int i) {
        this.A00 = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        boolean A1Z = AnonymousClass0wJ.A1Z(rect, view);
        AnonymousClass0wJ.A1Q(recyclerView, ltt);
        C61803Vq.A00(view, rect);
        int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.abc_floating_window_z) >> 1;
        int measuredWidth = (recyclerView.getMeasuredWidth() - this.A00) >> 1;
        int A03 = RecyclerView.A03(view);
        if (A03 <= 0) {
            rect.left = measuredWidth;
        } else {
            C41030Luu luu = recyclerView.A0F;
            if (luu == null || A03 != luu.getItemCount() - (A1Z ? 1 : 0)) {
                rect.left = dimensionPixelOffset;
            } else {
                rect.left = dimensionPixelOffset;
                rect.right = measuredWidth;
                return;
            }
        }
        rect.right = dimensionPixelOffset;
    }
}
