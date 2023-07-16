package X;

import java.util.Map;

/* renamed from: X.23I  reason: invalid class name */
public enum AnonymousClass23I {
    WITH_IMAGE_AND_CONTEXT("with_image_and_context");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass0wJ.A0y();
        for (AnonymousClass23I r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass23I(String str) {
        this.A00 = str;
    }
}
