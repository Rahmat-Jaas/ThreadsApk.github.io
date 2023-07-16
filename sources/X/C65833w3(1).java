package X;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.instagram.barcelona.R;

/* renamed from: X.3w3  reason: invalid class name and case insensitive filesystem */
public final class C65833w3 implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ AnonymousClass1bJ A01;

    public C65833w3(Resources resources, AnonymousClass1bJ r2) {
        this.A01 = r2;
        this.A00 = resources;
    }

    public final View makeView() {
        AnonymousClass1bJ r7 = this.A01;
        TextView textView = new TextView(r7.getContext());
        Resources resources = this.A00;
        int A03 = C18220wO.A03(resources);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 1;
        textView.setLayoutParams(layoutParams);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.instagram_facebook_circle_filled_16, 0, 0, 0);
        textView.setCompoundDrawablePadding(AnonymousClass0wJ.A0B(r7).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
        textView.setPadding(A03, 0, A03, 0);
        textView.setGravity(17);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C18180wK.A0s(r7.getContext(), textView, R.color.design_dark_default_color_on_background);
        textView.setTextSize(0, resources.getDimension(R.dimen.abc_text_size_menu_header_material));
        textView.setTypeface((Typeface) null, 1);
        C63163fI.A03(textView, R.color.design_dark_default_color_on_background);
        return textView;
    }
}
