package X;

import android.net.Uri;
import com.instagram.service.session.UserSession;
import java.io.File;

/* renamed from: X.4CY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4CY implements C82584pw {
    public final /* synthetic */ AnonymousClass4Aj A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass4CY(AnonymousClass4Aj r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void BrW() {
        AnonymousClass4Aj r2 = this.A00;
        AnonymousClass4Aj.A01(Uri.fromFile(new File(this.A01)), r2, 1);
        AnonymousClass49I A002 = C35832Oz.A00(r2.A09);
        UserSession userSession = A002.A01;
        AnonymousClass0TJ r22 = AnonymousClass0TJ.A05;
        if ((!C63803iN.A0E(r22, userSession, 2342157812399868061L) || !A002.A00.A02 || AnonymousClass49I.A00(A002, false) || !C63803iN.A0E(r22, userSession, 36314794596501657L)) && C63803iN.A0E(r22, userSession, 2342157812399868061L) && A002.A00.A03 && !AnonymousClass49I.A00(A002, false)) {
            C63803iN.A0E(r22, userSession, 36314798891468956L);
        }
    }
}
