package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.4DA  reason: invalid class name */
public final class AnonymousClass4DA implements C39777Kzl {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C13330nS A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C61913Wi A04;

    public final void onDismiss() {
    }

    public AnonymousClass4DA(Fragment fragment, C13330nS r2, UserSession userSession, User user, C61913Wi r5) {
        this.A04 = r5;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = user;
        this.A00 = fragment;
    }

    public final void onButtonClick(View view) {
        Fragment fragment = this.A00;
        FragmentActivity activity = fragment.getActivity();
        if (!fragment.isAdded() || activity == null) {
            C10450iM.A03("restrict_error", "Restrict button was clicked before fragment attached to activity");
            return;
        }
        C13330nS r5 = this.A01;
        User user = this.A03;
        C63773iK.A0A(r5, "click", "block_toast_upsell_learn_more_button", user.getId());
        UserSession userSession = this.A02;
        C307722x r8 = C307722x.PROFILE_BLOCK_UPSELL;
        AnonymousClass4NK r2 = new AnonymousClass4NK(fragment);
        AnonymousClass1dG A002 = C36480JXd.A02.A01().A00(user.B4M(), userSession, r8, user.getId(), user.BK7(), (JSONObject) null, false, false);
        A002.A05 = r2;
        C37032Jj9 A0L = C18210wN.A0L(userSession);
        A0L.A0J = null;
        C18200wM.A16(activity, A002, A0L);
    }

    public final void onShow() {
        AnonymousClass0wJ.A14(C28161tl.A04(this.A02), "restrict_block_upsell_snackbar_shown_count", 0);
        C63773iK.A0A(this.A01, "impression", "block_toast_upsell", this.A03.getId());
    }
}
