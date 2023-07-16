package androidx.recyclerview.widget;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C41006Ltt;
import X.C41030Luu;
import X.C61803Vq;
import android.graphics.Rect;
import android.view.View;

public class IDxIDecorationShape0S0001000_1_I2 extends C61803Vq {
    public int A00;
    public final int A01;

    public IDxIDecorationShape0S0001000_1_I2(int i, int i2) {
        this.A01 = i2;
        this.A00 = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        int i;
        if (2 - this.A01 != 0) {
            boolean A1Y = AnonymousClass0wJ.A1Y(rect, view);
            C18180wK.A1P(recyclerView, 2, ltt);
            view.getLayoutParams();
            rect.set(A1Y ? 1 : 0, A1Y, A1Y, A1Y);
            int i2 = this.A00;
            int i3 = (i2 << 1) / 3;
            int A03 = RecyclerView.A03(view) % 3;
            rect.bottom = i2;
            if (A03 == 0) {
                rect.left = A1Y;
            } else if (A03 != 2) {
                i3 /= 2;
                rect.left = i3;
            } else {
                rect.left = i3;
                rect.right = A1Y;
                return;
            }
            rect.right = i3;
            return;
        }
        boolean A1Z = AnonymousClass0wJ.A1Z(rect, view);
        C04220Ms.A0B(recyclerView, 2);
        RecyclerView.A03(view);
        boolean z = true;
        int A032 = RecyclerView.A03(view);
        C41030Luu luu = recyclerView.A0F;
        if (luu != null) {
            i = luu.getItemCount();
        } else {
            i = 0;
        }
        if (A032 != i - (A1Z ? 1 : 0)) {
            z = false;
        }
        rect.top = 0;
        int i4 = this.A00;
        Integer valueOf = Integer.valueOf(i4);
        if (!z || valueOf == null) {
            i4 = 0;
        }
        rect.bottom = i4;
    }
}
