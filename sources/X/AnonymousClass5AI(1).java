package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5AI  reason: invalid class name */
public final class AnonymousClass5AI extends C61803Vq {
    public final int A00;
    public final int A01;

    public AnonymousClass5AI(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        int i;
        AnonymousClass0wJ.A1N(rect, view);
        C04220Ms.A0B(recyclerView, 2);
        int A03 = RecyclerView.A03(view);
        int i2 = this.A00;
        if (A03 != 0) {
            i2 >>= 1;
        }
        rect.left = i2;
        int A032 = RecyclerView.A03(view);
        C41030Luu luu = recyclerView.A0F;
        if (luu != null) {
            i = luu.getItemCount();
        } else {
            i = 0;
        }
        int i3 = i - 1;
        int i4 = this.A01;
        if (A032 != i3) {
            i4 >>= 1;
        }
        rect.right = i4;
    }
}
