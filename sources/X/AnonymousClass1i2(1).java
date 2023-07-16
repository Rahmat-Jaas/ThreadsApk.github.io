package X;

import android.net.Uri;
import com.facebook.AccessToken;
import com.instagram.nux.cal.model.NuxConnectResponse;
import java.util.Collection;
import java.util.Date;

/* renamed from: X.1i2  reason: invalid class name */
public final class AnonymousClass1i2 extends C63873iU {
    public final /* synthetic */ AnonymousClass1cR A00;

    public AnonymousClass1i2(AnonymousClass1cR r1) {
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r3) {
        C14030oh.A0A(1626020126, C14030oh.A03(1737342761));
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(-1523275232);
        super.onFinish();
        C18330wh r0 = this.A00.A07;
        if (r0 != null) {
            r0.hide();
        }
        C14030oh.A0A(874880490, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-1200553072);
        super.onStart();
        C18330wh r0 = this.A00.A07;
        if (r0 != null) {
            C13950oZ.A00(r0);
        }
        C14030oh.A0A(1446258348, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(814320771);
        NuxConnectResponse nuxConnectResponse = (NuxConnectResponse) obj;
        int A032 = C14030oh.A03(-125908266);
        if (!AnonymousClass0hA.A08(nuxConnectResponse.A00) && !AnonymousClass0hA.A08(nuxConnectResponse.A02)) {
            AccessToken accessToken = new AccessToken(AnonymousClass006.A1C, nuxConnectResponse.A02, C60943Re.A02, nuxConnectResponse.A00, C29771zH.A02.A00, (Collection) null, (Date) null, new Date());
            if (!C63173fJ.A05(AnonymousClass0TJ.A05, 18310802792522733L)) {
                C67363zQ.A0A(accessToken, this.A00.A06, true);
            }
        }
        AnonymousClass1cR r1 = this.A00;
        if (r1.getActivity() != null) {
            new C18480xG((Uri) null, r1.A01, 0).execute(new Void[0]);
        }
        C14030oh.A0A(1505290076, A032);
        C14030oh.A0A(286186993, A03);
    }
}
