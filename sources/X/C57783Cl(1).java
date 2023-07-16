package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.instagram.barcelona.R;

/* renamed from: X.3Cl  reason: invalid class name and case insensitive filesystem */
public final class C57783Cl {
    public final Context A00;
    public final Drawable A01;
    public final Drawable A02;
    public final View A03;
    public final ImageView A04;
    public final ImageView A05;

    public C57783Cl(View view, Context context) {
        this.A00 = context;
        this.A03 = AnonymousClass0wJ.A0I(view, R.id.row_save_story_to_archive_container);
        this.A04 = (ImageView) AnonymousClass0wJ.A0I(view, R.id.icon);
        this.A05 = C18200wM.A0I(view);
        this.A01 = C18200wM.A0D(context);
        this.A02 = C19587Ayn.A01(context, R.drawable.unchecked, context.getColor(R.color.grey_3));
    }
}
