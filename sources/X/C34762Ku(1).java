package X;

import android.content.res.Resources;
import android.widget.FrameLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.2Ku  reason: invalid class name and case insensitive filesystem */
public final class C34762Ku {
    public static final void A00(IgImageView igImageView) {
        Resources resources = igImageView.getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material), resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material));
        layoutParams.gravity = 17;
        igImageView.setLayoutParams(layoutParams);
        igImageView.setBackground(resources.getDrawable(R.drawable.black_50_transparent_oval));
        igImageView.setPadding(resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material), resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material), resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material), resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material));
        igImageView.setImageResource(R.drawable.instagram_play_pano_filled_24);
        igImageView.setColorFilter(resources.getColor(R.color.canvas_bottom_sheet_description_text_color));
        igImageView.setVisibility(8);
    }
}
