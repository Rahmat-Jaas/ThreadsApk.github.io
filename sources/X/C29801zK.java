package X;

import java.util.Locale;

/* renamed from: X.1zK  reason: invalid class name and case insensitive filesystem */
public enum C29801zK {
    LIGHT_MODE("image"),
    DARK_MODE("dark_mode_image");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        LIGHT_MODE = new C29801zK("LIGHT_MODE", 0, "image");
        DARK_MODE = new C29801zK("DARK_MODE", 1, "dark_mode_image");
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C29801zK(String str) {
        this.A00 = str.toLowerCase(Locale.ROOT);
    }
}
