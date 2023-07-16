package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.7wp  reason: invalid class name and case insensitive filesystem */
public final class C133987wp implements C27981EwV {
    public final CircularImageView A00;
    public final RectF A01;
    public final GradientSpinner A02;
    public final /* synthetic */ C871850m A03;

    public final boolean Ct4() {
        return true;
    }

    public C133987wp(C871850m r2) {
        this.A03 = r2;
        CircularImageView circularImageView = r2.A04;
        this.A00 = circularImageView;
        this.A01 = C09860go.A0C(circularImageView);
        this.A02 = r2.A05;
    }

    public final RectF ASW() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ View ASa() {
        return this.A00;
    }

    public final GradientSpinner B6R() {
        return this.A02;
    }

    public final void BOv() {
        this.A03.A04.setVisibility(4);
    }

    public final void CtS(C11630kW r3) {
        this.A03.A04.setVisibility(0);
    }
}
