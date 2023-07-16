package X;

import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.64B  reason: invalid class name */
public final class AnonymousClass64B extends AnonymousClass5NL implements C144758jE {
    public final AdditionalCandidates D4r() {
        ExtendedImageUrl extendedImageUrl;
        ExtendedImageUrl extendedImageUrl2;
        ExtendedImageUrl extendedImageUrl3;
        Class<AnonymousClass62X> cls = AnonymousClass62X.class;
        AnonymousClass62X r0 = (AnonymousClass62X) getTreeValueByHashCode(-702473442, cls);
        if (r0 != null) {
            extendedImageUrl = new ExtendedImageUrl(r0);
        } else {
            extendedImageUrl = null;
        }
        AnonymousClass62X r02 = (AnonymousClass62X) getTreeValueByHashCode(-1509059201, cls);
        if (r02 != null) {
            extendedImageUrl2 = new ExtendedImageUrl(r02);
        } else {
            extendedImageUrl2 = null;
        }
        AnonymousClass62X r03 = (AnonymousClass62X) getTreeValueByHashCode(-159946889, cls);
        if (r03 != null) {
            extendedImageUrl3 = new ExtendedImageUrl(r03);
        } else {
            extendedImageUrl3 = null;
        }
        return new AdditionalCandidates(extendedImageUrl, extendedImageUrl2, extendedImageUrl3);
    }
}
