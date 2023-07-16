package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.fbpay.logging.FBPayLoggerData;
import java.util.HashSet;

/* renamed from: X.6ON  reason: invalid class name */
public final class AnonymousClass6ON {
    public static final Object A00(AnonymousClass601 r13, C63893iY r14) {
        C25786Drz A0Q;
        C121817Ig A0K;
        String str;
        Fragment A00;
        boolean A1Z = AnonymousClass0wJ.A1Z(r14, r13);
        String A0D = C63893iY.A0D(r14, 0);
        String str2 = (String) C63893iY.A0B(r14, A1Z ? 1 : 0);
        C10300i6 A0F = C63913ic.A0F(r13);
        FragmentActivity A05 = C63913ic.A05(r13);
        Bundle A06 = C18180wK.A06();
        HashSet A0u = C18200wM.A0u();
        if (!A0u.contains("sessionId")) {
            HashSet hashSet = new HashSet(A0u);
            A0u = hashSet;
            hashSet.add("sessionId");
        }
        C86154wM.A1E(A06, new FBPayLoggerData((String) null, "fbpay_hub", (String) null, (String) null, str2, (String) null, A0u));
        if (A0D == null || !A0D.equalsIgnoreCase("PAYMENT_SETTINGS")) {
            String A002 = AnonymousClass000.A00(724);
            if (A0D != null && A0D.equalsIgnoreCase(A002)) {
                A06.putBoolean("should_log_view_load_success", A1Z);
                A0Q = C18180wK.A0Q(A05, A0F);
                A00 = AnonymousClass7Kz.A07().A06.A00(A06, "PIN_BIO_SETTINGS");
                A0Q.A03 = A00;
                A0Q.A05();
                return null;
            } else if (A0D != null && A0D.equalsIgnoreCase("WELCOME_PAGE")) {
                A06.putBoolean("show_branding_page", A1Z);
                A0Q = C18180wK.A0Q(A05, A0F);
                A0K = AnonymousClass7Kz.A0K();
                str = "home";
            } else if (A0D != null && A0D.equalsIgnoreCase("ORDER_HISTORY")) {
                A06.putString("sessionId", str2);
                A0Q = C18180wK.A0Q(A05, A0F);
                A0K = AnonymousClass7Kz.A0K();
                str = "order_list";
            } else if (A0D != null && A0D.equalsIgnoreCase("TRANSACTION_HISTORY")) {
                A0Q = C18180wK.A0Q(A05, A0F);
                A0K = AnonymousClass7Kz.A0K();
                str = "transactions_list";
            } else if (A0D != null && A0D.equalsIgnoreCase("PROMOTION_PAYMENTS")) {
                A0Q = C18180wK.A0Q(A05, A0F);
                A0Q.A03 = AnonymousClass7Kz.A0K().A04(A06, "promotion_payment");
                A0Q.A07 = "OrderAndPaymentsPromotionPayments.BACK_STACK_NAME";
                A0Q.A05();
                return null;
            } else if (A0D == null || !A0D.equalsIgnoreCase("DELIVERY_ADDRESS")) {
                if (A0D != null && A0D.equalsIgnoreCase("DELIVERY_CONTACT")) {
                    A0Q = C18180wK.A0Q(A05, A0F);
                    A0K = AnonymousClass7Kz.A0K();
                    str = "contact_info";
                }
                return null;
            } else {
                A0Q = C18180wK.A0Q(A05, A0F);
                A0K = AnonymousClass7Kz.A0K();
                str = "address";
            }
        } else {
            A0Q = C18180wK.A0Q(A05, A0F);
            A0K = AnonymousClass7Kz.A0K();
            str = "settings";
        }
        A00 = A0K.A04(A06, str);
        A0Q.A03 = A00;
        A0Q.A05();
        return null;
    }
}
