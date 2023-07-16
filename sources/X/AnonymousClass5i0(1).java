package X;

import android.content.Context;
import android.util.AttributeSet;
import com.facebookpay.form.view.FormLayout;

/* renamed from: X.5i0  reason: invalid class name */
public final class AnonymousClass5i0 extends FormLayout implements C143538gu {
    public C92055hW A00;
    public final C143158gC A01 = C86114wI.A0Q(this, 63);

    public AnonymousClass5i0(Context context) {
        super(context, (AttributeSet) null);
    }

    public C92055hW getViewModel() {
        return this.A00;
    }

    public void setViewModel(C92055hW r3) {
        this.A00 = r3;
        r3.A02.A0E(this.A01);
    }

    public final void onAttachedToWindow() {
        int A06 = C14030oh.A06(-2054195638);
        super.onAttachedToWindow();
        C14030oh.A0D(15793888, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = C14030oh.A06(1917710127);
        super.onDetachedFromWindow();
        this.A00.A02.A0F(this.A01);
        C14030oh.A0D(-610178429, A06);
    }
}
