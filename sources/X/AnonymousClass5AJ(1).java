package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5AJ  reason: invalid class name */
public final class AnonymousClass5AJ extends C61803Vq {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C28765Fao A01;

    public AnonymousClass5AJ(Context context, C28765Fao fao) {
        this.A01 = fao;
        this.A00 = context;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        C41030Luu luu = recyclerView.A0F;
        if (luu != null && RecyclerView.A03(view) != luu.getItemCount() - 1) {
            rect.right = C18240wQ.A01(this.A00, 5);
        }
    }
}
