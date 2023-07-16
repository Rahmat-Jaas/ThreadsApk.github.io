package X;

import android.content.Context;

/* renamed from: X.7oQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7oQ implements C144008hg {
    public static final AnonymousClass7oQ A00 = new AnonymousClass7oQ();

    public final String ALB(Object obj) {
        Context context = (Context) obj;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature(AnonymousClass000.A00(286))) {
            return "auto";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }
}
