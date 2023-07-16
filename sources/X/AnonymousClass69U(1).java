package X;

import ch.boye.httpclientandroidlib.util.LangUtils;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.69U  reason: invalid class name */
public enum AnonymousClass69U {
    ;
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0M(r4));
        for (AnonymousClass69U r2 : values()) {
            A0v.put(Integer.valueOf(r2.A00), r2);
        }
        A01 = A0v;
    }

    public static AnonymousClass69U A00(String str, int i) {
        return new AnonymousClass69U(str, i, i);
    }

    /* access modifiers changed from: public */
    AnonymousClass69U(int i) {
        this.A00 = i;
    }

    public final String A01() {
        AnonymousClass69P r0;
        switch (ordinal()) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                r0 = AnonymousClass69P.PAYMENT_METHOD;
                break;
            case 13:
                r0 = AnonymousClass69P.SHIPPING_ADDRESS;
                break;
            case 14:
                r0 = AnonymousClass69P.CONTACT_INFORMATION;
                break;
            case 15:
                r0 = AnonymousClass69P.FULFILLMENT_OPTIONS;
                break;
            case 16:
                r0 = AnonymousClass69P.ORDER_SUMMARY;
                break;
            case LangUtils.HASH_SEED /*17*/:
                r0 = AnonymousClass69P.PICKUP_CONTACT_INFO;
                break;
            default:
                throw C18190wL.A0a(AnonymousClass0wJ.A0t("ItemType is not found for identifier => ", this));
        }
        return r0.name();
    }
}
