package X;

import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.BaseSelectionCheckoutItem;
import com.facebookpay.common.recyclerview.adapteritems.SelectionActionViewItem;
import com.fbpay.logging.LoggingContext;
import java.util.List;

/* renamed from: X.5hQ  reason: invalid class name and case insensitive filesystem */
public final class C91995hQ extends AnonymousClass7Ih {
    public final SelectionActionViewItem A00;
    public final LoggingContext A01;
    public final List A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91995hQ(BaseCheckoutItem baseCheckoutItem, LoggingContext loggingContext, List list, int i, int i2, boolean z, boolean z2) {
        super(i, true, z);
        C18230wP.A1R(baseCheckoutItem, 4, loggingContext);
        this.A02 = list;
        this.A01 = loggingContext;
        this.A03 = z2;
        this.A00 = new SelectionActionViewItem(AnonymousClass69U.A0g, (Integer) null, Integer.valueOf(i2), (String) null, (String) null);
        this.A04.put(i, baseCheckoutItem);
        A0L(baseCheckoutItem);
    }

    public final void A0L(BaseCheckoutItem baseCheckoutItem) {
        BaseSelectionCheckoutItem baseSelectionCheckoutItem;
        BaseSelectionCheckoutItem baseSelectionCheckoutItem2;
        C880756q r2 = this.A05;
        Object A08 = r2.A08();
        if ((A08 instanceof BaseSelectionCheckoutItem) && (baseSelectionCheckoutItem2 = (BaseSelectionCheckoutItem) A08) != null) {
            baseSelectionCheckoutItem2.Cpe(AnonymousClass006.A0N);
        }
        if ((baseCheckoutItem instanceof BaseSelectionCheckoutItem) && (baseSelectionCheckoutItem = (BaseSelectionCheckoutItem) baseCheckoutItem) != null) {
            baseSelectionCheckoutItem.Cpe(AnonymousClass006.A0C);
        }
        r2.A0H(baseCheckoutItem);
    }
}
