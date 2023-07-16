package X;

import android.content.DialogInterface;
import com.instagram.service.session.UserSession;

/* renamed from: X.1qf  reason: invalid class name and case insensitive filesystem */
public final class C26451qf extends C24301hr {
    public final UserSession A00;
    public final DialogInterface.OnDismissListener A01;
    public final C34640IcN A02;
    public final BKU A03;

    public C26451qf(DialogInterface.OnDismissListener onDismissListener, C34640IcN icN, BKU bku, UserSession userSession) {
        super(onDismissListener, icN, bku, userSession, "isDeleting");
        this.A02 = icN;
        this.A00 = userSession;
        this.A03 = bku;
        this.A01 = onDismissListener;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-937031344);
        int A033 = C14030oh.A03(-106077553);
        BKU bku = this.A00;
        bku.A04 = 2;
        bku.AAy(this.A00);
        C14030oh.A0A(521469954, A033);
        C14030oh.A0A(1808879901, A032);
    }
}
