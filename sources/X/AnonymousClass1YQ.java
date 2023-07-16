package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1YQ  reason: invalid class name */
public final class AnonymousClass1YQ extends C34640IcN {
    public static final String __redex_internal_original_name = "IgLiveModeratorViewerWarningFragment";
    public UserSession A00;
    public User A01;
    public String A02;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (!(bundle2 == null || (string = bundle2.getString("args.broadcaster_id")) == null)) {
            this.A02 = string;
        }
        UserSession userSession = this.A00;
        if (userSession != null) {
            User A03 = AnonymousClass6VR.A00(userSession).A03(this.A02);
            this.A01 = A03;
            if (A03 != null) {
                ((IgdsHeadline) AnonymousClass0wJ.A0J(view, R.id.moderator_viewer_warning_headline)).setBody(AnonymousClass0wJ.A0o(this, A03.BK7(), 2131829853), (View.OnClickListener) null);
                return;
            }
            return;
        }
        C18210wN.A0m();
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-414454675);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(-341089181, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1769732199);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_iglive_moderator_viewer_warning_fragment, viewGroup, false);
        C14030oh.A09(871788802, A022);
        return inflate;
    }
}
