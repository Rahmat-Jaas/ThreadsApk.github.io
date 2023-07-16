package X;

import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.13e  reason: invalid class name and case insensitive filesystem */
public final class C201113e extends M5O {
    public final CheckBox A00;
    public final TextView A01;
    public final TextView A02;
    public final ConstraintLayout A03;
    public final IgSimpleImageView A04;
    public final GradientSpinnerAvatarView A05;

    public C201113e(ConstraintLayout constraintLayout) {
        super(constraintLayout);
        this.A03 = constraintLayout;
        this.A00 = (CheckBox) AnonymousClass0wJ.A0J(constraintLayout, R.id.edit_icon);
        this.A05 = (GradientSpinnerAvatarView) AnonymousClass0wJ.A0J(constraintLayout, R.id.image_view);
        this.A01 = (TextView) AnonymousClass0wJ.A0J(constraintLayout, R.id.header);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(constraintLayout, R.id.sub_header);
        this.A04 = (IgSimpleImageView) AnonymousClass0wJ.A0J(constraintLayout, R.id.right_drag_handle);
    }
}
