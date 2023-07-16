package X;

import java.util.ArrayList;

/* renamed from: X.3HB  reason: invalid class name */
public final class AnonymousClass3HB {
    public ArrayList A00 = AnonymousClass0wJ.A0v();
    public boolean A01 = false;
    public final C67493ze A02;

    public final void A01() {
        this.A01 = true;
        this.A02.A00.A03("use_fx_upsell_eligibility_checker", true);
    }

    public final C67113yt A00() {
        ArrayList arrayList = this.A00;
        return new C67113yt(this, (String[]) arrayList.toArray(new String[arrayList.size()]), this.A01);
    }

    public AnonymousClass3HB() {
        C67493ze r3 = new C67493ze();
        Boolean A0X = C18180wK.A0X();
        C67463zb r2 = r3.A00;
        r2.A03("ig_story_xpost_upsell", A0X);
        r2.A03("ig_profile_photo_change", A0X);
        r2.A03("ig_profile_photo_completeness", A0X);
        r2.A03("ig_feed_xpost_upsell", A0X);
        r2.A03("ig_discover_people_upsell", A0X);
        r2.A03("ig_import_from_fb", A0X);
        r2.A03("use_fx_upsell_eligibility_checker", A0X);
        Boolean A0Y = C18180wK.A0Y();
        r2.A03("impression_limit_check_enabled", A0Y);
        r2.A03("recently_seen_check_enabled", A0Y);
        this.A02 = r3;
    }
}
