package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.7wo  reason: invalid class name and case insensitive filesystem */
public final class C133977wo implements C27981EwV {
    public final RectF A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ B5b A02;

    public final void BOv() {
    }

    public final boolean Ct4() {
        return true;
    }

    public final void CtS(C11630kW r1) {
    }

    public C133977wo(View view, AK6 ak6, B5b b5b) {
        this.A01 = view;
        this.A02 = b5b;
        this.A00 = C09860go.A0C(ak6.A00);
    }

    public final RectF ASW() {
        return this.A00;
    }

    public final View ASa() {
        View view = this.A01;
        C04220Ms.A05(view);
        return view;
    }

    public final GradientSpinner B6R() {
        GradientSpinner gradientSpinner;
        ViewGroup viewGroup;
        View view = this.A01;
        View view2 = null;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            view2 = viewGroup.getChildAt(0);
        }
        if (!(view2 instanceof GradientSpinner) || (gradientSpinner = (GradientSpinner) view2) == null) {
            return new GradientSpinner(this.A02.A02());
        }
        return gradientSpinner;
    }
}
