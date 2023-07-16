package X;

import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.share.facebook.widget.FindPeopleButton;

/* renamed from: X.3D4  reason: invalid class name */
public final class AnonymousClass3D4 {
    public final View A00;
    public final View A01;
    public final FindPeopleButton A02;
    public final FindPeopleButton A03;
    public final FindPeopleButton A04;
    public final FindPeopleButton A05;
    public final FindPeopleButton A06;

    public AnonymousClass3D4(View view) {
        this.A01 = view;
        this.A04 = (FindPeopleButton) AnonymousClass0wJ.A0J(view, R.id.facebook_button);
        this.A02 = (FindPeopleButton) AnonymousClass0wJ.A0J(view, R.id.contacts_button);
        this.A06 = (FindPeopleButton) AnonymousClass0wJ.A0J(view, R.id.sync_button);
        this.A05 = (FindPeopleButton) AnonymousClass0wJ.A0J(view, R.id.share_profile_button);
        this.A03 = (FindPeopleButton) AnonymousClass0wJ.A0J(view, R.id.discover_top_accounts_button);
        this.A00 = AnonymousClass0wJ.A0K(view, R.id.row_find_people_buttons_bottom_divider);
    }
}
