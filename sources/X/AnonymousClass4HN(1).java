package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.4HN  reason: invalid class name */
public final class AnonymousClass4HN implements C82924qU {
    public final Fragment A00;
    public final UserSession A01;

    public final void BN1(Uri uri, Bundle bundle) {
        C31014GdU gdU = C548530j.A00;
        UserSession userSession = this.A01;
        if (gdU.A04(userSession)) {
            AnonymousClass49J A002 = AnonymousClass2M0.A00(userSession);
            A002.A00 = C18180wK.A0e();
            C319829s r8 = C319829s.PROFILE_QUICK_PROMOTION;
            AnonymousClass49J.A00(AnonymousClass28X.TAP, C319929t.CHAT_CREATION_SHEET_RENDERED, C320029u.CREATE_GROUP_CHAT_BUTTON, r8, A002, (Map) null);
            Class<ModalActivity> cls = ModalActivity.class;
            if (bundle == null) {
                bundle = C18180wK.A06();
            }
            Fragment fragment = this.A00;
            C63863iT.A02(fragment.requireActivity(), bundle, userSession, cls, "creator_messaging_selection_screen").A0I(fragment.getContext());
        }
    }

    public AnonymousClass4HN(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
