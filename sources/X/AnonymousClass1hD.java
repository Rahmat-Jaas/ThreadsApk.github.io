package X;

import com.facebook.AccessToken;
import com.instagram.nux.cal.model.NuxConnectResponse;
import java.util.Collection;
import java.util.Date;

/* renamed from: X.1hD  reason: invalid class name */
public final class AnonymousClass1hD extends C63873iU {
    public final /* synthetic */ AnonymousClass1cQ A00;

    public AnonymousClass1hD(AnonymousClass1cQ r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = C14030oh.A03(1978194670);
        NuxConnectResponse nuxConnectResponse = (NuxConnectResponse) obj;
        int A032 = C14030oh.A03(-380042792);
        C04220Ms.A0B(nuxConnectResponse, 0);
        String str2 = nuxConnectResponse.A00;
        if (str2 != null && !AnonymousClass8bQ.A0n(str2) && (str = nuxConnectResponse.A02) != null && !AnonymousClass8bQ.A0n(str)) {
            AccessToken accessToken = new AccessToken(AnonymousClass006.A1C, nuxConnectResponse.A02, C60943Re.A02, nuxConnectResponse.A00, C29771zH.A02.A00, (Collection) null, (Date) null, new Date());
            boolean A05 = C63173fJ.A05(AnonymousClass0TJ.A05, 18310506439975701L);
            C10300i6 A0U = AnonymousClass0wJ.A0U(this.A00.A06);
            if (A05) {
                C67363zQ.A0A(accessToken, A0U, false);
            } else {
                C67363zQ.A09(accessToken, A0U, AnonymousClass006.A0C);
            }
        }
        AnonymousClass1cQ r1 = this.A00;
        if (r1.getActivity() != null) {
            AnonymousClass1cQ.A01(r1);
        }
        C14030oh.A0A(612133284, A032);
        C14030oh.A0A(113542554, A03);
    }

    public final void onFail(AnonymousClass3XX r3) {
        C14030oh.A0A(-602239103, C14030oh.A03(1460102579));
    }
}
