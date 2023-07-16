package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.451  reason: invalid class name */
public final class AnonymousClass451 implements C82384pX {
    public final Map Aow() {
        int i = 0;
        List A17 = C06750aI.A17(C61153Sc.A00("Feed Ad vs Feed Organic Bakeoff", "feed_ad_vs_organic_bakeoff.json", (String) null), C61153Sc.A00("Mlex Survey", "feed_mlex_survey.json", (String) null), C61153Sc.A00("Mlex Survey 2", "feed_mlex_survey_2.json", (String) null), C61153Sc.A00("ASQ Survey", "feed_asq_survey.json", (String) null), C61153Sc.A00("Inline Survey (IG-WYT)", "feed_inline_survey.json", (String) null), C61153Sc.A00("Ad Likeness Survey", "feed_ad_likeness_survey.json", (String) null), C61153Sc.A00("Feed Organic vs Feed Organic Bakeoff", "feed_organic_vs_organic_bakeoff.json", (String) null), C61153Sc.A00("Story Sentiment Survey", "feed_story_sentiment_survey.json", (String) null), C61153Sc.A00("ACQS (Story Ads User Sentiment) Survey", "feed_acqs_survey.json", (String) null), C61153Sc.A00("Suggested Users", "feed_su.json", (String) null), C61153Sc.A00("Clips Netego", "feed_clips_netego.json", (String) null), C61153Sc.A00("Ad4ad", "ad4ad.json", (String) null), C61153Sc.A00("Follow Requests", "follow_requests.json", (String) null), C61153Sc.A00("Follow Requests (updated social context", "follow_requests_updated_social_context.json", (String) null));
        ArrayList A0x = AnonymousClass0wJ.A0x(A17, 10);
        for (Object next : A17) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            }
            C61153Sc r4 = (C61153Sc) next;
            String str = r4.A01;
            if (str == null) {
                str = AnonymousClass00U.A0J("feed_netego_", i);
            }
            A0x.add(new AnonymousClass4O1(AnonymousClass006.A0Y, str, AnonymousClass00U.A0L("feed_netego/", r4.A00), r4.A02));
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
