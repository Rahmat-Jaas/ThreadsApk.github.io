package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.450  reason: invalid class name */
public final class AnonymousClass450 implements C82384pX {
    public final Map Aow() {
        C61153Sc[] r5 = new C61153Sc[38];
        System.arraycopy(new C61153Sc[]{C61153Sc.A00("Carousel Ad", "feed_carousel_ad.json", (String) null), C61153Sc.A00("DPA Carousel Ad", "feed_dpa_carousel_ad.json", (String) null), C61153Sc.A00("Carousel Ad On-Demand Loading", "feed_carousel_ad_with_on_demand_loading.json", (String) null), C61153Sc.A00("App Install Ad", "feed_ad_with_app_install.json", (String) null), C61153Sc.A00("DeepLink Ad", "feed_ad_with_deep_link.json", (String) null), C61153Sc.A00("PBIA Ad", "feed_pbia_ad.json", (String) null), C61153Sc.A00("Single Image Ad", "feed_standard_ad.json", (String) null), C61153Sc.A00("Single Video Ad", "feed_standard_video_ad.json", (String) null), C61153Sc.A00("Political Ad", "feed_political_ad.json", (String) null), C61153Sc.A00("Lead Ad", "feed_lead_gen_ad.json", (String) null), C61153Sc.A00("Canvas Ad", "feed_canvas_ad.json", (String) null), C61153Sc.A00("Disclaimer Text Page Ad", "feed_disclaimer_text_page_ad.json", (String) null), C61153Sc.A00("Disclaimer Web Page Ad", "feed_disclaimer_web_page_ad.json", (String) null), C61153Sc.A00("Disclaimer Carousel Ad", "feed_disclaimer_carousel_ad.json", (String) null), C61153Sc.A00("New Click to Messenger Flow Ad", "feed_ad_with_new_ctm_flow.json", (String) null), C61153Sc.A00("New Click to WhatsApp Flow Ad", "feed_ad_with_new_ctwa_flow.json", (String) null), C61153Sc.A00("New Click to Direct Flow Ad", "feed_ad_with_new_ctd_flow.json", (String) null), C61153Sc.A00("Non-tall Video Ad", "feed_previewable_video_ad.json", (String) null), C61153Sc.A00("Tall Video Ad", "feed_tall_video_ad.json", (String) null), C61153Sc.A00("Branded Content Ad", "feed_ad_with_branded_content.json", (String) null), C61153Sc.A00("Clips Video Internal Deeplink Ad", "feed_ad_with_clips_video_deeplink.json", (String) null), C61153Sc.A00("Audio Page Deeplink Ad", "feed_ad_with_audio_page_internal_deeplink.json", (String) null), C61153Sc.A00("Showreel Composition Image Feed Ad", "showreel_composition_image_feed_ad.json", (String) null), C61153Sc.A00("Showreel Native Feed Ad", "showreel_native_feed_ad.json", (String) null), C61153Sc.A00("Feed Video Ads End Scene", "feed_ads_end_scene.json", (String) null), C61153Sc.A00("DA Auto Tagging Onsite CTA", "feed_da_auto_tag_onsite_cta.json", (String) null), C61153Sc.A00("DA Auto Tagging Offsite CTA", "feed_da_auto_tag_offsite_cta.json", (String) null)}, 0, r5, 0, 27);
        System.arraycopy(new C61153Sc[]{C61153Sc.A00("Tappable Shop Collection Ad", "feed_tappable_collection_ad.json", (String) null), C61153Sc.A00("Tappable Collection Ad", "feed_tappable_IX_collection_ad.json", (String) null), C61153Sc.A00("Tappable Collection Ad (Rounded Border)", "feed_tappable_IX_collection_rounded_border.json", (String) null), C61153Sc.A00("Arts CTA Ad", "feed_arts_cta_ad.json", (String) null), C61153Sc.A00("IX Collection Arts Ad", "feed_IX_collection_arts_ad.json", (String) null), C61153Sc.A00("DSC Collection Arts Ad", "feed_DSC_collection_arts_ad.json", (String) null), C61153Sc.A00("Standalone Multi Ads", "feed_ad_with_standalone_multi_ads.json", (String) null), C61153Sc.A00("Post Engagement Multi ", "feed_ad_with_post_ad_engagement_multi_ads.json", (String) null), C61153Sc.A00("Retail Ad with Single ARTS", "feed_retail_ad_with_single_arts.json", "feed_retail_ad_with_single_arts"), C61153Sc.A00("Retail Ad with ARTS Motion", "feed_retail_ad_with_arts_motion.json", "feed_retail_ad_with_arts_motion"), C61153Sc.A00("Retail Ad with Single AwPT", "feed_retail_ad_with_single_awpt.json", "feed_retail_ad_with_single_awpt")}, 0, r5, 27, 11);
        List<C61153Sc> A17 = C06750aI.A17(r5);
        ArrayList A0x = AnonymousClass0wJ.A0x(A17, 10);
        for (C61153Sc r3 : A17) {
            String str = r3.A01;
            if (str == null) {
                str = C18190wL.A0p(C81074n3.A07(r3.A00, ".", 0), 0);
            }
            A0x.add(new AnonymousClass4O1(AnonymousClass006.A0N, str, AnonymousClass00U.A0L("feed_ads/", r3.A00), r3.A02));
        }
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0M(C02260Al.A0z(A0x, 10)));
        Iterator it = A0x.iterator();
        while (it.hasNext()) {
            AnonymousClass4O1.A00(A0v, it);
        }
        return A0v;
    }
}
