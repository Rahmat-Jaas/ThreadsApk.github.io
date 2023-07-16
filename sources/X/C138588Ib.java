package X;

import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.8Ib  reason: invalid class name and case insensitive filesystem */
public final class C138588Ib extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138588Ib(int i, float f, float f2) {
        super(1);
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GradientSpinner gradientSpinner = new GradientSpinner(C86154wM.A0A(obj));
        int i = this.A02;
        float f = this.A00;
        float f2 = this.A01;
        gradientSpinner.setSpinnerType(i);
        gradientSpinner.setActiveStrokeWidth(f);
        gradientSpinner.setInactiveStrokeWidth(f2);
        return gradientSpinner;
    }
}
