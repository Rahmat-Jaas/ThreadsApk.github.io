package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.11a  reason: invalid class name and case insensitive filesystem */
public final class C196711a extends C61803Vq {
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        int i;
        int i2 = 0;
        C04220Ms.A0B(rect, 0);
        AnonymousClass0wJ.A1O(view, recyclerView);
        int A032 = RecyclerView.A03(view);
        rect.top = 0;
        rect.bottom = 0;
        boolean z = this.A03;
        if (A032 == 0) {
            i2 = this.A02;
        }
        if (z) {
            rect.right = i2;
        } else {
            rect.left = i2;
        }
        C41030Luu luu = recyclerView.A0F;
        if (luu != null) {
            if (A032 == luu.getItemCount() - 1) {
                i = this.A01;
            } else {
                i = this.A00;
            }
            if (z) {
                rect.left = i;
            } else {
                rect.right = i;
            }
        }
    }

    public C196711a(Context context, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A03 = AnonymousClass0hB.A02(context);
        this.A01 = i + i3;
    }
}
