package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.25N  reason: invalid class name */
public enum AnonymousClass25N {
    STORIES_NETEGO("stories_netego"),
    TRENDING_PROMPTS_SURFACE("trending_prompts_surface"),
    STORY_CREATION_FLOW_SHUFFLE_SUGGESTIONS("story_creation_flow_shuffle_suggestions");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(r3));
        for (AnonymousClass25N r1 : values()) {
            A0v.put(r1.A00, r1);
        }
        A01 = A0v;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    AnonymousClass25N(String str) {
        this.A00 = str;
    }
}
