package X;

import android.content.Context;
import android.util.TypedValue;
import com.facebook.redex.IDxObjectShape432S0100000_2_I2;
import com.fbpay.util.tooltip.TooltipInfo;

/* renamed from: X.5hc  reason: invalid class name and case insensitive filesystem */
public final class C92095hc extends C92325hz {
    public C92105hd A00;
    public final AnonymousClass0YY A01 = C86164wN.A0r(this, 27);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92095hc(Context context) {
        super(context);
        C04220Ms.A0B(context, 1);
    }

    public void setViewModel(C92005hR r2) {
        C04220Ms.A0B(r2, 0);
        super.setViewModel(r2);
        this.A00 = (C92105hd) r2;
    }

    /* access modifiers changed from: private */
    public final TooltipInfo getTooltipInfo() {
        return new TooltipInfo(2131823149, 0, 0, 0, 0, (int) TypedValue.applyDimension(1, 8.0f, C18230wP.A0E(C18190wL.A0A(this))));
    }

    public final void onAttachedToWindow() {
        int A06 = C14030oh.A06(445268877);
        super.onAttachedToWindow();
        C92105hd r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        r0.A00.A0E(new IDxObjectShape432S0100000_2_I2(0, this.A01));
        C14030oh.A0D(194202932, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = C14030oh.A06(-1880842770);
        super.onDetachedFromWindow();
        C92105hd r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        r0.A00.A0F(new IDxObjectShape432S0100000_2_I2(0, this.A01));
        C14030oh.A0D(-1486030538, A06);
    }

    public /* bridge */ /* synthetic */ void setViewModel(AnonymousClass7Ih r1) {
        setViewModel((C92005hR) r1);
    }
}
