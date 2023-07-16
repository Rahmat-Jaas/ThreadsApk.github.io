package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.13Y  reason: invalid class name */
public final class AnonymousClass13Y extends M5O {
    public final Drawable A00;
    public final TextView A01;
    public final IgImageView A02;
    public final GradientSpinnerAvatarView A03;

    public AnonymousClass13Y(View view) {
        super(view);
        this.A01 = (TextView) AnonymousClass0wJ.A0J(view, R.id.row_reaction_author_tv);
        this.A03 = (GradientSpinnerAvatarView) AnonymousClass0wJ.A0J(view, R.id.row_reaction_avatar_iv);
        this.A00 = view.getContext().getDrawable(R.drawable.avatar_bottom_badge);
        this.A02 = (IgImageView) AnonymousClass0wJ.A0J(view, R.id.row_reaction_iv);
    }
}
