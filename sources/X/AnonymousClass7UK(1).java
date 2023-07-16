package X;

import android.view.View;
import android.widget.Magnifier;

/* renamed from: X.7UK  reason: invalid class name */
public final class AnonymousClass7UK implements C146968nA {
    public static final AnonymousClass7UK A00 = new AnonymousClass7UK();

    public final boolean AW2() {
        return true;
    }

    public final /* bridge */ /* synthetic */ C142688fQ AFG(View view, AnonymousClass79V r10, C147168nV r11, float f) {
        Magnifier build;
        AnonymousClass0wJ.A1N(r10, view);
        C04220Ms.A0B(r11, 2);
        if (r10.equals(AnonymousClass79V.A02)) {
            build = new Magnifier(view);
        } else {
            long D7K = r11.D7K(r10.A00);
            float CxL = r11.CxL(Float.NaN);
            float CxL2 = r11.CxL(Float.NaN);
            Magnifier.Builder builder = new Magnifier.Builder(view);
            if (D7K != AnonymousClass7JK.A01) {
                builder.setSize(AnonymousClass8bA.A02(AnonymousClass7JK.A02(D7K)), AnonymousClass8bA.A02(AnonymousClass7JK.A00(D7K)));
            }
            if (!Float.isNaN(CxL)) {
                builder.setCornerRadius(CxL);
            }
            if (!Float.isNaN(CxL2)) {
                builder.setElevation(CxL2);
            }
            if (!Float.isNaN(f)) {
                builder.setInitialZoom(f);
            }
            builder.setClippingEnabled(true);
            build = builder.build();
            C04220Ms.A06(build);
        }
        return new AnonymousClass52d(build);
    }
}
