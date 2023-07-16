package X;

import com.facebookpay.form.cell.label.LabelCellParams;
import com.fbpay.logging.LoggingContext;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1;

/* renamed from: X.7j6  reason: invalid class name and case insensitive filesystem */
public final class C128177j6 implements C142168e4 {
    public final LabelCellParams A00(LoggingContext loggingContext, int i, int i2, boolean z, boolean z2) {
        int i3;
        C128957ke.A04(C18180wK.A0I(C86104wH.A0K(AnonymousClass7JJ.A00().A00, "client_load_terms_init"), 372), loggingContext, new KtLambdaShape4S1200000_I2_1((Object) null, loggingContext, "nux_checkout", 1));
        if (!AnonymousClass7HK.A01()) {
            i3 = 2131826510;
        } else if (z) {
            i3 = 2131826574;
            if (z2) {
                i3 = 2131826573;
            }
        } else {
            i3 = 2131826572;
            if (z2) {
                i3 = 2131826570;
            }
        }
        return AnonymousClass7BI.A02(i3, R.attr.fbpay_hub_header_item_margin_top, i, i2);
    }
}
