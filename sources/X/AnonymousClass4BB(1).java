package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.section.intf.DeveloperOptionsSection;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4BB  reason: invalid class name */
public final class AnonymousClass4BB implements DeveloperOptionsSection {
    public final boolean isEnabled(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return AnonymousClass2MV.A00(userSession).A02();
    }

    public final List getItems(UserSession userSession, FragmentActivity fragmentActivity) {
        AnonymousClass0wJ.A1N(userSession, fragmentActivity);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (AnonymousClass2MV.A00(userSession).A02()) {
            AnonymousClass4MA.A03(C18200wM.A0R(userSession, fragmentActivity, 71), A0v, 2131825623);
        }
        return A0v;
    }

    public final Integer getTitleRes() {
        return 2131825622;
    }
}
