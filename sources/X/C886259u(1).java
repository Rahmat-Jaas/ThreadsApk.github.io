package X;

import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import java.util.Map;

/* renamed from: X.59u  reason: invalid class name and case insensitive filesystem */
public final class C886259u extends JWT {
    public final Map A00;

    public C886259u(Map map) {
        this.A00 = map;
    }

    /* renamed from: A00 */
    public final boolean areContentsTheSame(AnonymousClass7Kx r6, AnonymousClass7Kx r7) {
        BaseCheckoutItem baseCheckoutItem;
        boolean A1Y = AnonymousClass0wJ.A1Y(r6, r7);
        if (!r6.equals(r7)) {
            return A1Y;
        }
        Map map = this.A00;
        Object obj = r6.A01;
        AnonymousClass69U r2 = null;
        if ((obj instanceof BaseCheckoutItem) && (baseCheckoutItem = (BaseCheckoutItem) obj) != null) {
            r2 = baseCheckoutItem.AqR();
        }
        if (map.get(r2) == null || r6.A00 != r7.A00 || obj == null || !obj.equals(r7.A01)) {
            return false;
        }
        return true;
    }

    /* renamed from: A01 */
    public final boolean areItemsTheSame(AnonymousClass7Kx r6, AnonymousClass7Kx r7) {
        BaseCheckoutItem baseCheckoutItem;
        AnonymousClass0wJ.A1N(r6, r7);
        boolean z = false;
        if (r6.equals(r7) && (!AnonymousClass7Kx.A0P(r6) || r6.A00 != r7.A00)) {
            Map map = this.A00;
            Object obj = r6.A01;
            AnonymousClass69U r2 = null;
            if ((obj instanceof BaseCheckoutItem) && (baseCheckoutItem = (BaseCheckoutItem) obj) != null) {
                r2 = baseCheckoutItem.AqR();
            }
            if (map.get(r2) != null) {
                if (r6.A00 != r7.A00) {
                    return false;
                }
                z = true;
                if (!C04220Ms.A0I(obj, r7.A01)) {
                    return false;
                }
            }
        }
        return z;
    }
}
