package X;

import com.google.common.collect.ImmutableList;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.64C  reason: invalid class name */
public final class AnonymousClass64C extends AnonymousClass5NL implements C146478mJ {
    public final C144758jE APW() {
        return (C144758jE) getTreeValue("additional_candidates", AnonymousClass64B.class);
    }

    public final C144768jF AQk() {
        return (C144768jF) getTreeValue("animated_thumbnail_spritesheet_info_candidates", AnonymousClass64E.class);
    }

    public final List AWI() {
        ImmutableList optionalTreeList = getOptionalTreeList("candidates", AnonymousClass62X.class);
        if (optionalTreeList == null) {
            return null;
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(optionalTreeList);
        Iterator it = optionalTreeList.iterator();
        while (it.hasNext()) {
            AnonymousClass62X r1 = (AnonymousClass62X) it.next();
            C04220Ms.A04(r1);
            A0w.add(new ExtendedImageUrl(r1));
        }
        return A0w;
    }

    public final C144768jF B9A() {
        return (C144768jF) getTreeValue("scrubber_spritesheet_info_candidates", AnonymousClass64E.class);
    }

    public final Boolean BCS() {
        return getOptionalBooleanValue("smart_thumbnail_enabled");
    }

    public final String BHl() {
        return getStringValue("trace_token");
    }

    public final ImageInfo D4s() {
        AdditionalCandidates additionalCandidates;
        SpriteSheetInfoCandidates spriteSheetInfoCandidates;
        C144758jE APW = APW();
        SpriteSheetInfoCandidates spriteSheetInfoCandidates2 = null;
        if (APW != null) {
            additionalCandidates = APW.D4r();
        } else {
            additionalCandidates = null;
        }
        C144768jF AQk = AQk();
        if (AQk != null) {
            spriteSheetInfoCandidates = AQk.D4u();
        } else {
            spriteSheetInfoCandidates = null;
        }
        List AWI = AWI();
        C144768jF B9A = B9A();
        if (B9A != null) {
            spriteSheetInfoCandidates2 = B9A.D4u();
        }
        return new ImageInfo(additionalCandidates, spriteSheetInfoCandidates, spriteSheetInfoCandidates2, getOptionalBooleanValue("smart_thumbnail_enabled"), getStringValue("trace_token"), AWI);
    }
}
