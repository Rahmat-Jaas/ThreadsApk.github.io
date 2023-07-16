package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.13W  reason: invalid class name */
public final class AnonymousClass13W extends M5O {
    public final TextView A00;
    public final TextView A01;
    public final IgSwitch A02;
    public final GradientSpinnerAvatarView A03;

    public AnonymousClass13W(View view) {
        super(view);
        this.A03 = (GradientSpinnerAvatarView) AnonymousClass0wJ.A0J(view, R.id.avatar);
        this.A00 = (TextView) AnonymousClass0wJ.A0J(view, R.id.primary_text);
        this.A01 = (TextView) AnonymousClass0wJ.A0J(view, R.id.secondary_text);
        this.A02 = (IgSwitch) AnonymousClass0wJ.A0J(view, R.id.switch_button);
    }
}
