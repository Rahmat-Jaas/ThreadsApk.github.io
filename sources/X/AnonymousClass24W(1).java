package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24W  reason: invalid class name */
public enum AnonymousClass24W {
    BELOW_THUMBNAIL("below_thumbnail"),
    ON_THUMBNAIL_TOP("on_thumbnail_top"),
    ON_THUMBNAIL_TOP_EMPHASIZED("on_thumbnail_top_emphasized"),
    ON_THUMBNAIL_BOTTOM("on_thumbnail_bottom"),
    ON_THUMBNAIL_BOTTOM_EMPHASIZED("on_thumbnail_bottom_emphasized");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (AnonymousClass24W r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    AnonymousClass24W(String str) {
        this.A00 = str;
    }
}
