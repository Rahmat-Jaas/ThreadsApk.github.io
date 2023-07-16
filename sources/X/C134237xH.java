package X;

import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.7xH  reason: invalid class name and case insensitive filesystem */
public final class C134237xH implements C21487Bv9 {
    public final Fragment A00;
    public final UserSession A01;

    public final void BfU(Map map) {
        AnonymousClass3IR r3 = AnonymousClass3IR.A00;
        if (r3 != null) {
            r3.A00(this.A00.requireActivity(), this.A01, "2248469498800720", map);
        }
    }

    public C134237xH(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }
}
