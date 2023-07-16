package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.11R  reason: invalid class name */
public final class AnonymousClass11R extends C61803Vq {
    public final int A00;

    public AnonymousClass11R(Context context) {
        this.A00 = (int) (((((double) C09860go.A08(context)) - (((double) context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height)) * 4.5d)) - ((double) (context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material) << 1))) / Math.ceil(4.5d));
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
