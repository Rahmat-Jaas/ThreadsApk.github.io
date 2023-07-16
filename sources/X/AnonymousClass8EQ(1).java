package X;

import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.Unit;

/* renamed from: X.8EQ  reason: invalid class name */
public final class AnonymousClass8EQ extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ C81784oM A00;
    public final /* synthetic */ C81784oM A01;
    public final /* synthetic */ C81784oM A02;
    public final /* synthetic */ C81784oM A03;
    public final /* synthetic */ C81784oM A04;
    public final /* synthetic */ C146638ma A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8EQ(C81784oM r2, C81784oM r3, C81784oM r4, C81784oM r5, C81784oM r6, C146638ma r7, boolean z, boolean z2) {
        super(0);
        this.A04 = r2;
        this.A00 = r3;
        this.A07 = z;
        this.A06 = z2;
        this.A03 = r4;
        this.A01 = r5;
        this.A05 = r7;
        this.A02 = r6;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Long l;
        String id;
        C81784oM r4 = this.A02;
        String A0e = C86164wN.A0e(r4);
        UserSession userSession = (UserSession) this.A04.getValue();
        C11630kW r6 = (C11630kW) this.A00.getValue();
        C04220Ms.A0B(A0e, 0);
        AnonymousClass0wJ.A1O(userSession, r6);
        BKU A0W = C86114wI.A0W(userSession, A0e);
        if (A0W != null) {
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r6, userSession), "barcelona_organic_repost_button_tap"), 80);
            User A0Z = C86104wH.A0Z(A0I, r6, A0W, C86114wI.A0n(A0I, r6));
            if (A0Z == null || (id = A0Z.getId()) == null) {
                l = null;
            } else {
                l = AnonymousClass0wJ.A0d(id);
            }
            A0I.A0S("media_author_id", l);
            A0I.Bb4();
        }
        if (this.A07 || this.A06) {
            this.A05.Bh9(C86164wN.A0e(r4));
        } else {
            RepostRestrictedReason repostRestrictedReason = (RepostRestrictedReason) this.A03.getValue();
            if (repostRestrictedReason != null && repostRestrictedReason.ordinal() == 1) {
                C63813iO.A03((Context) this.A01.getValue(), (String) null, 2131834828, 0);
            }
        }
        return Unit.A00;
    }
}
