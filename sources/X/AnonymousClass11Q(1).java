package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.11Q  reason: invalid class name */
public final class AnonymousClass11Q extends C61803Vq {
    public final int A00;

    public AnonymousClass11Q(Context context) {
        this.A00 = context.getResources().getDimensionPixelOffset(R.dimen.abc_dialog_padding_material);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        AnonymousClass0wJ.A1N(rect, view);
        AnonymousClass0wJ.A1Q(recyclerView, ltt);
        C61803Vq.A00(view, rect);
        if (RecyclerView.A03(view) == 0) {
            rect.left = this.A00;
        }
        rect.right = this.A00;
    }
}
