package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.11U  reason: invalid class name */
public final class AnonymousClass11U extends C61803Vq {
    public final int A00;
    public final int A01;

    public AnonymousClass11U(Resources resources, int i) {
        this.A00 = C18220wO.A03(resources);
        this.A01 = resources.getDimensionPixelSize(i);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        AnonymousClass0wJ.A1N(rect, view);
        C04220Ms.A0B(recyclerView, 2);
        int i = this.A01 - (this.A00 << 1);
        rect.right = i;
        if (RecyclerView.A03(view) == 0) {
            rect.left = i;
        }
    }
}
