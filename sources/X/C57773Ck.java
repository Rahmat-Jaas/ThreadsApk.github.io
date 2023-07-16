package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.3Ck  reason: invalid class name and case insensitive filesystem */
public final class C57773Ck {
    public final Drawable A00;
    public final Drawable A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final ImageView A05;

    public C57773Ck(View view, Context context) {
        Drawable drawable;
        this.A02 = AnonymousClass0wJ.A0I(view, R.id.row_add_to_exclusive_story_container);
        ImageView imageView = (ImageView) AnonymousClass0wJ.A0I(view, R.id.icon);
        this.A05 = imageView;
        this.A04 = C18250wR.A0A(((ViewStub) view.findViewById(R.id.show_fans_label_stub)).inflate());
        this.A03 = C18200wM.A0I(view);
        this.A00 = C18200wM.A0D(context);
        this.A01 = C19587Ayn.A01(context, R.drawable.unchecked, context.getColor(R.color.direct_light_mode_glyph_color_tertiary));
        Drawable drawable2 = context.getDrawable(R.drawable.exclusive_story_recipient_picker);
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
    }
}
