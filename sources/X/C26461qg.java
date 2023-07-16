package X;

import android.content.DialogInterface;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1qg  reason: invalid class name and case insensitive filesystem */
public final class C26461qg extends C24301hr {
    public final UserSession A00;
    public final DialogInterface.OnDismissListener A01;
    public final C34640IcN A02;
    public final BKU A03;

    public C26461qg(DialogInterface.OnDismissListener onDismissListener, C34640IcN icN, BKU bku, UserSession userSession) {
        super(onDismissListener, icN, bku, userSession, "isUpdating");
        this.A02 = icN;
        this.A00 = userSession;
        this.A03 = bku;
        this.A01 = onDismissListener;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(453962196);
        int A033 = C14030oh.A03(-2039300790);
        BKU bku = this.A00;
        bku.A04 = 0;
        bku.A0f.A3L = 0;
        UserSession userSession = this.A00;
        bku.AAy(userSession);
        User A0Y = AnonymousClass0wJ.A0Y(userSession);
        A0Y.A1i(A0Y.A05() + 1);
        C18210wN.A1J(userSession, A0Y);
        C14030oh.A0A(-965204429, A033);
        C14030oh.A0A(1364862331, A032);
    }
}
