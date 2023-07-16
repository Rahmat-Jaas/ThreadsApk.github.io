package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.452  reason: invalid class name */
public final class AnonymousClass452 implements C82384pX {
    public final Map Aow() {
        List A17 = C06750aI.A17(C61153Sc.A00("Basic 9:16 Video Ad", "clips_916_ad.json", (String) null), C61153Sc.A00("Basic non 9:16 Video Ad", "clips_non_916_ad.json", (String) null), C61153Sc.A00("PBIA Ad", "clips_pbia_ad.json", (String) null), C61153Sc.A00("Showreel Composition Image Ad", "clips_showreel_composition_image_ad.json", (String) null), C61153Sc.A00("Showreel Native Ad", "clips_showreel_native_ad.json", (String) null), C61153Sc.A00("Zoetrope Ad with Audio", "clips_zoetrope_ad_with_audio.json", (String) null), C61153Sc.A00("Basic Ad with Disclaimer URL", "clips_disclaimer_url_ad.json", (String) null), C61153Sc.A00("Basic Ad with Disclaimer Text", "clips_disclaimer_text_ad.json", (String) null), C61153Sc.A00("Mid-Scene V2 with Embedded CTA", "clips_mid_scene_v2_embedded_cta.json", (String) null), C61153Sc.A00("Mid-Scene V2 with Attached Module", "clips_mid_scene_v2_attached_module.json", (String) null), C61153Sc.A00("Carousel Ad", "clips_carousel_ad.json", (String) null));
        ArrayList A0x = AnonymousClass0wJ.A0x(A17, 10);
        int i = 0;
        for (Object next : A17) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            }
            C61153Sc r5 = (C61153Sc) next;
            String str = r5.A01;
            if (str == null) {
                str = C18190wL.A0p(C81074n3.A07(r5.A00, ".", 0), 0);
            }
            A0x.add(new AnonymousClass4O1(AnonymousClass006.A0j, str, AnonymousClass00U.A0L("reels_ads/", r5.A00), r5.A02));
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
