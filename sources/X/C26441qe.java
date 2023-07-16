package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1qe  reason: invalid class name and case insensitive filesystem */
public final class C26441qe extends C24301hr {
    public final UserSession A00;
    public final AnonymousClass3FC A01;

    public C26441qe(Fragment fragment, BKU bku, UserSession userSession) {
        super((DialogInterface.OnDismissListener) null, fragment, bku, userSession, "isDeleting");
        this.A00 = userSession;
        this.A01 = new AnonymousClass3FC(userSession, fragment.requireActivity());
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-1755980763);
        int A032 = C14030oh.A03(1755957368);
        BKU bku = this.A00;
        bku.A04 = 1;
        bku.A0f.A3L = 1;
        UserSession userSession = this.A00;
        bku.AAy(userSession);
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        A0Y.A1i(A0Y.A05() - 1);
        C18210wN.A1J(userSession, A0Y);
        this.A01.A00((DialogInterface.OnDismissListener) null, false);
        C14030oh.A0A(-1999145642, A032);
        C14030oh.A0A(1692862402, A03);
    }
}
