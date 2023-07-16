package X;

import java.util.Map;

/* renamed from: X.240  reason: invalid class name */
public enum AnonymousClass240 {
    EMOJIS_AND_STICKER_SET("emojis_and_sticker_set"),
    RECENT_EMOJIS_AND_STICKER_SET("recent_emojis_and_sticker_set"),
    RECENT_NAMETAG_EMOJIS_SET("recent_nametag_emojis_set");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass0wJ.A0y();
        for (AnonymousClass240 r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass240(String str) {
        this.A00 = str;
    }
}
