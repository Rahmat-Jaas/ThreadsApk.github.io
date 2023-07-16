package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.reels.store.ReelStore;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7pS  reason: invalid class name */
public final class AnonymousClass7pS implements C145498kb {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C95355zy A01;
    public final /* synthetic */ AnonymousClass601 A02;
    public final /* synthetic */ UserSession A03;

    public final void CGI(String str) {
    }

    public AnonymousClass7pS(FragmentActivity fragmentActivity, C95355zy r2, AnonymousClass601 r3, UserSession userSession) {
        this.A03 = userSession;
        this.A01 = r2;
        this.A00 = fragmentActivity;
        this.A02 = r3;
    }

    public final void CGk(C171229wH r9, List list) {
        if (!list.isEmpty()) {
            boolean z = false;
            String str = ((BKU) list.get(0)).A0f.A4Y;
            UserSession userSession = this.A03;
            User A2Z = ((BKU) list.get(0)).A2Z(userSession);
            A2Z.getClass();
            C171229wH r6 = r9;
            if (r9 == C171229wH.A0L) {
                z = true;
            }
            C19554AyF.A02();
            this.A01.A01(C86134wK.A0E(), this.A00, C63913ic.A0A(this.A02), ReelStore.A02(userSession).A0H(new C20098BOf(A2Z), str, list, z), r6, userSession);
        }
    }
}
