package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;

/* renamed from: X.11Y  reason: invalid class name */
public final class AnonymousClass11Y extends C61803Vq {
    public final /* synthetic */ float A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ CTB A03;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C41006Ltt ltt) {
        C04220Ms.A0B(rect, 0);
        AnonymousClass0wJ.A1O(view, recyclerView);
        C04220Ms.A0B(ltt, 3);
        view.getLayoutParams();
        rect.set(0, 0, 0, 0);
        int A032 = RecyclerView.A03(view);
        if (A032 == -1) {
            view.setVisibility(4);
            return;
        }
        view.setVisibility(0);
        C41030Luu luu = recyclerView.A0F;
        if (luu != null) {
            int itemCount = luu.getItemCount();
            try {
                float f = this.A00;
                Context context = this.A01;
                int width = (this.A02.getWidth() - AnonymousClass8bA.A02(f * context.getResources().getDimension(R.dimen.media_thumbnail_preview_item_height))) / 2;
                int dimension = (int) context.getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
                if (A032 == 0) {
                    rect.left = width;
                    return;
                }
                rect.left = dimension;
                if (A032 == itemCount - 1) {
                    rect.right = width;
                }
            } catch (Resources.NotFoundException e) {
                this.A03.A0A.getValue();
                C14100oo ABJ = C10770iu.A00().ABJ("boost_media_picker_sub_tab_fragment", 817897926);
                ABJ.A8U("boost_media_picker_sub_tab_fragment", C18230wP.A0t("attaching the new instance to thumbnail recycler view caused an exception: ", e));
                ABJ.Ciu(e);
                ABJ.report();
            }
        } else {
            throw AnonymousClass0wJ.A0b();
        }
    }

    public AnonymousClass11Y(Context context, View view, CTB ctb, float f) {
        this.A00 = f;
        this.A01 = context;
        this.A02 = view;
        this.A03 = ctb;
    }
}
