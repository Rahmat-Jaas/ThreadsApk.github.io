package X;

import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.25M  reason: invalid class name */
public enum AnonymousClass25M {
    IMAGE("image"),
    VIDEO(MediaStreamTrack.VIDEO_TRACK_KIND),
    UNKNOWN_ITEM_TYPE("unknown_type");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass0wJ.A0y();
        for (AnonymousClass25M r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AnonymousClass25M(String str) {
        this.A00 = str;
    }
}
