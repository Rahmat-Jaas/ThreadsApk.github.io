package X;

import java.util.Map;

/* renamed from: X.24g  reason: invalid class name and case insensitive filesystem */
public enum C311124g {
    BOTTOM_WITH_ICON_STACKED("bottom_with_icon_stacked"),
    BOTTOM_WITH_ICON_HORIZONTAL("bottom_with_icon_horizontal"),
    BOTTOM_WITH_TOP_RIGHT_ICON("bottom_with_top_right_icon"),
    BOTTOM("bottom"),
    TOP_RIGHT_CIRCLE("top_right"),
    TOP_RIGHT_ICON("top_right_icon"),
    NO_DESIGN("no_design");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = AnonymousClass0wJ.A0y();
        for (C311124g r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C311124g(String str) {
        this.A00 = str;
    }
}
