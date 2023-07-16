package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.11O  reason: invalid class name */
public final class AnonymousClass11O extends C61803Vq {
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        int i;
        AnonymousClass0wJ.A1N(rect, view);
        AnonymousClass0wJ.A1Q(recyclerView, ltt);
        C61803Vq.A00(view, rect);
        try {
            i = C18250wR.A00(view.getContext().getResources());
        } catch (Resources.NotFoundException unused) {
            i = 0;
        }
        int A03 = RecyclerView.A03(view);
        rect.right = i;
        if (A03 == 0) {
            rect.left = i << 1;
        } else if (A03 == recyclerView.getChildCount()) {
            rect.right = i << 1;
        }
    }
}
