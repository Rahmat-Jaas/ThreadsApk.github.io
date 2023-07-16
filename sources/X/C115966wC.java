package X;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/* renamed from: X.6wC  reason: invalid class name and case insensitive filesystem */
public final class C115966wC {
    public static final void A00(StaticLayout.Builder builder, int i, int i2) {
        LineBreakConfig build = new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build();
        C04220Ms.A06(build);
        builder.setLineBreakConfig(build);
    }

    public static final boolean A01(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }
}
