package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.3Cz  reason: invalid class name and case insensitive filesystem */
public final class C57913Cz {
    public Boolean A00;
    public final Drawable A01;
    public final Drawable A02;
    public final View A03;
    public final ImageView A04;
    public final TextView A05;
    public final CircularImageView A06;

    public C57913Cz(View view, Context context) {
        this.A03 = AnonymousClass0wJ.A0I(view, R.id.row_add_to_story_container);
        this.A06 = (CircularImageView) AnonymousClass0wJ.A0I(view, R.id.row_add_to_story_profile_picture);
        this.A05 = (TextView) AnonymousClass0wJ.A0I(view, R.id.sharing_preferences_label);
        this.A04 = C18200wM.A0I(view);
        this.A01 = C18200wM.A0D(context);
        this.A02 = C19587Ayn.A01(context, R.drawable.unchecked, context.getColor(R.color.grey_3));
    }
}
