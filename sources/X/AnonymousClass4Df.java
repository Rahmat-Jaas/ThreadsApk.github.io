package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.model.venue.Venue;
import java.util.Map;

/* renamed from: X.4Df  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4Df implements C82644q2 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C67033yl A01;
    public final /* synthetic */ Venue A02;

    public /* synthetic */ AnonymousClass4Df(FragmentActivity fragmentActivity, C67033yl r2, Venue venue) {
        this.A01 = r2;
        this.A02 = venue;
        this.A00 = fragmentActivity;
    }

    public final void BpC(String str) {
        C67033yl r0 = this.A01;
        Venue venue = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass3VI r3 = new AnonymousClass3VI(r0.A02);
        String id = venue.getId();
        C15680ri r4 = new C15680ri();
        r4.A0D("report", str);
        r3.A01(r4, "information_page", "tap_component", "report_location", id, venue.A04(), (String) null, (Map) null);
        C63813iO.A00(fragmentActivity, 2131834825).show();
    }
}
