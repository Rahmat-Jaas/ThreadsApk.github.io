package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.instagram.barcelona.R;

/* renamed from: X.3tf  reason: invalid class name and case insensitive filesystem */
public final class C65573tf implements View.OnLayoutChangeListener {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AutoCompleteTextView A02;

    public C65573tf(Resources resources, View view, AutoCompleteTextView autoCompleteTextView) {
        this.A00 = resources;
        this.A02 = autoCompleteTextView;
        this.A01 = view;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Resources resources = this.A00;
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.account_recs_header_image_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.menu_popup_panel_shadow_offset);
        AutoCompleteTextView autoCompleteTextView = this.A02;
        autoCompleteTextView.setDropDownWidth(this.A01.getWidth() + (dimensionPixelOffset2 * -2) + (dimensionPixelOffset << 1));
        autoCompleteTextView.setDropDownHorizontalOffset(dimensionPixelOffset2 - dimensionPixelOffset);
    }
}
