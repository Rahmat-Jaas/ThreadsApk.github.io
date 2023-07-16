package X;

import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.fbpay.logging.LoggingContext;
import java.util.List;

/* renamed from: X.5gu  reason: invalid class name and case insensitive filesystem */
public final class C91825gu extends C110616lz {
    public final BaseCheckoutItem A00;
    public final LoggingContext A01;
    public final List A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91825gu(BaseCheckoutItem baseCheckoutItem, LoggingContext loggingContext, List list, boolean z) {
        super(33);
        AnonymousClass0wJ.A1R(list, baseCheckoutItem);
        C04220Ms.A0B(loggingContext, 6);
        this.A02 = list;
        this.A00 = baseCheckoutItem;
        this.A01 = loggingContext;
        this.A03 = z;
        this.A03 = true;
    }
}
