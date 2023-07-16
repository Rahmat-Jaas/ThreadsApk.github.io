package X;

import android.app.Activity;
import com.instagram.model.venue.Venue;
import com.instagram.service.session.UserSession;

/* renamed from: X.1uc  reason: invalid class name and case insensitive filesystem */
public final class C28571uc extends AnonymousClass9UH {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ McB A01;
    public final /* synthetic */ C11630kW A02;
    public final /* synthetic */ Venue A03;
    public final /* synthetic */ UserSession A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28571uc(Activity activity, C12560m7 r2, McB mcB, C11630kW r4, Venue venue, UserSession userSession) {
        super(r2);
        this.A01 = mcB;
        this.A04 = userSession;
        this.A02 = r4;
        this.A03 = venue;
        this.A00 = activity;
    }

    public final void onFail(AnonymousClass3XX r10) {
        int A032 = C14030oh.A03(-653215108);
        C63813iO.A0E(this.A00, "fetch_location_permalink_failed");
        C63673i6.A09(this.A02, this.A04, this.A03.getId(), "map_location_detail_overflow_menu", "qr_code", r10.A01);
        C14030oh.A0A(1702983195, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-1084700062);
        C21751Sa r11 = (C21751Sa) obj;
        int A033 = C14030oh.A03(350736887);
        this.A01.apply(r11.A00);
        C63673i6.A0A(this.A02, this.A04, this.A03.getId(), "map_location_detail_overflow_menu", "qr_code", r11.A00);
        C14030oh.A0A(-660870512, A033);
        C14030oh.A0A(165530387, A032);
    }
}
