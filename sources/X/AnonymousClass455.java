package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.455  reason: invalid class name */
public final class AnonymousClass455 implements C82384pX {
    public final Map Aow() {
        int i = 0;
        List A17 = C06750aI.A17(C61153Sc.A00("Bakeoff", "bakeoff.json", (String) null), C61153Sc.A00("Ad4Ad Image", "ad4ad_image.json", (String) null), C61153Sc.A00("Ad4Ad Video", "ad4ad_video.json", (String) null), C61153Sc.A00("Suggested Users", "suggested_users_shuffle.json", (String) null), C61153Sc.A00("Quality Survey", "netego_quality_survey.json", (String) null), C61153Sc.A00("Story Creation Upsell", "story_creation_upsell.json", (String) null), C61153Sc.A00("Suggested Clips", "suggested_clips.json", (String) null), C61153Sc.A00("Products For You", "products_for_you.json", (String) null), C61153Sc.A00("Affiliate Top Brands", "affiliate_top_brands.json", (String) null), C61153Sc.A00("Shops You Might Like", "shops_you_might_like.json", (String) null), C61153Sc.A00("Ads Consent Growth", "ig_ads_consent_growth.json", (String) null));
        ArrayList A0x = AnonymousClass0wJ.A0x(A17, 10);
        for (Object next : A17) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            }
            C61153Sc r2 = (C61153Sc) next;
            String str = r2.A01;
            if (str == null) {
                str = AnonymousClass00U.A0J("stories_netego_", i);
            }
            A0x.add(new AnonymousClass4O1(AnonymousClass006.A0C, str, AnonymousClass00U.A0L("stories_netego/", r2.A00), r2.A02));
            i = i2;
        }
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(C02260Al.A0z(A0x, 10)));
        Iterator it = A0x.iterator();
        while (it.hasNext()) {
            AnonymousClass4O1.A00(A0v, it);
        }
        return A0v;
    }
}
