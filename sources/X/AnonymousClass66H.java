package X;

import com.instagram.barcelona.R;

/* renamed from: X.66H  reason: invalid class name */
public enum AnonymousClass66H {
    A04("DEFAULT", 0, R.attr.fbpay_divider_color),
    A06("FOCUS", 1, R.attr.fbpay_focus_color),
    A03("BOX_INPUT_FOCUS", 2, R.attr.fbpay_box_input_focus_color),
    A05("ERROR", 3, R.attr.fbpay_error_text_color);
    
    public final int A00;
    public final Integer A01;
    public final Integer A02;

    /* access modifiers changed from: public */
    static {
        A04 = new AnonymousClass66H((Integer) null, (Integer) null, "DEFAULT", 0, R.attr.fbpay_divider_color);
        A06 = new AnonymousClass66H((Integer) null, (Integer) null, "FOCUS", 1, R.attr.fbpay_focus_color);
        A03 = new AnonymousClass66H((Integer) null, (Integer) null, "BOX_INPUT_FOCUS", 2, R.attr.fbpay_box_input_focus_color);
        A05 = new AnonymousClass66H(47, 6, "ERROR", 3, R.attr.fbpay_error_text_color);
    }

    /* access modifiers changed from: public */
    AnonymousClass66H(String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = r1;
        this.A01 = r2;
    }
}
