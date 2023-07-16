package X;

import android.view.View;
import com.instagram.business.model.FeedAfterPartyPromoteEligibilityStatusEnum;
import com.instagram.service.session.UserSession;

/* renamed from: X.5yj  reason: invalid class name and case insensitive filesystem */
public final class C95065yj extends C63873iU {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C146358m7 A01;
    public final /* synthetic */ BKU A02;
    public final /* synthetic */ C21839C2o A03;
    public final /* synthetic */ C20066BMj A04;
    public final /* synthetic */ UserSession A05;

    public C95065yj(View view, C146358m7 r2, BKU bku, C21839C2o c2o, C20066BMj bMj, UserSession userSession) {
        this.A02 = bku;
        this.A05 = userSession;
        this.A01 = r2;
        this.A04 = bMj;
        this.A00 = view;
        this.A03 = c2o;
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A002 = AnonymousClass0wJ.A00(-91926445, r6);
        super.onFail(r6);
        C37741K2b.A01(this.A05).A0O(C35394Iu2.A0f, "promote_tooltip_fetch", r6.A01);
        C14030oh.A0A(2102386564, A002);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-1309032892);
        C93915sr r13 = (C93915sr) obj;
        int A002 = AnonymousClass0wJ.A00(-1484015167, r13);
        super.onSuccess(r13);
        C105766dx r0 = r13.A01;
        if (r0 == null) {
            C18250wR.A0m();
            throw null;
        }
        if (r0.A00 == FeedAfterPartyPromoteEligibilityStatusEnum.FEED_AFTER_PARTY_ELIGIBLE) {
            BKU bku = this.A02;
            bku.A0f.A2g = true;
            C37741K2b A012 = C37741K2b.A01(this.A05);
            C35394Iu2 iu2 = C35394Iu2.A0f;
            A012.A01 = "home_screen";
            A012.A0L(iu2, "feed_uploaded_tooltip");
            this.A01.Ctu(this.A00, bku, this.A04, AnonymousClass006.A01, this.A03.getModuleName());
        }
        C14030oh.A0A(-1166078199, A002);
        C14030oh.A0A(417759994, A032);
    }
}
