package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgRadioButton;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.13Z  reason: invalid class name */
public final class AnonymousClass13Z extends M5O {
    public View A00;
    public TextView A01;
    public TextView A02;
    public IgRadioButton A03;
    public IgSimpleImageView A04;

    public AnonymousClass13Z(View view) {
        super(view);
        this.A04 = (IgSimpleImageView) AnonymousClass0wJ.A0J(view, R.id.facebook_profile_avatar);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(view, R.id.crossposting_destination_name);
        this.A01 = (TextView) AnonymousClass0wJ.A0J(view, R.id.crossposting_destination_type);
        this.A03 = (IgRadioButton) AnonymousClass0wJ.A0J(view, R.id.radio_account_selection);
        this.A00 = AnonymousClass0wJ.A0K(view, R.id.crossposting_destination_row);
    }
}
