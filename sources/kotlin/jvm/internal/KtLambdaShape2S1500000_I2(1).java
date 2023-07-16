package kotlin.jvm.internal;

import X.Ah2;
import X.AnonymousClass000;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass5IX;
import X.AnonymousClass6VE;
import X.AnonymousClass9CM;
import X.AnonymousClass9CN;
import X.BKU;
import X.BPC;
import X.C02220Ah;
import X.C03940Lk;
import X.C04220Ms;
import X.C04530Oa;
import X.C109506k7;
import X.C140828Xz;
import X.C147368pE;
import X.C166339nU;
import X.C167269pF;
import X.C170829vd;
import X.C18180wK;
import X.C18240wQ;
import X.C18483AgF;
import X.C19174Arq;
import X.C19455Awc;
import X.C19457Awe;
import X.C2W;
import X.C86104wH;
import X.C86124wJ;
import X.C86154wM;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

public class KtLambdaShape2S1500000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S1500000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        super(1);
        this.A06 = i;
        this.A00 = obj;
        this.A05 = str;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A01 = obj5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CheckoutHandler checkoutHandler;
        Long l;
        switch (this.A06) {
            case 0:
                String str = (String) obj;
                C04220Ms.A0B(str, 0);
                long currentTimeMillis = System.currentTimeMillis();
                int hashCode = str.hashCode();
                if (hashCode != -1296412160) {
                    if (hashCode != 1081471986) {
                        if (hashCode == 1775435509 && str.equals("CONNECT_FAILURE")) {
                            CheckoutHandler checkoutHandler2 = (CheckoutHandler) this.A04;
                            CheckoutHandler.A0A(checkoutHandler2, "user_click_ecpentry_atomic", (Map) this.A01);
                            CheckoutHandler.A05((ECPPaymentRequest) this.A00, (TransactionInfo) this.A03, checkoutHandler2, (PaymentRequest) this.A02, "DEFAULT_VALUE", this.A05);
                            checkoutHandler2.A0N = true;
                            break;
                        }
                    } else if (str.equals("NOT_NOW_CLICKED")) {
                        checkoutHandler = (CheckoutHandler) this.A04;
                        CheckoutHandler.A0A(checkoutHandler, "user_click_ecpentry_atomic", (Map) this.A01);
                        CheckoutHandler.A05((ECPPaymentRequest) this.A00, (TransactionInfo) this.A03, checkoutHandler, (PaymentRequest) this.A02, "DEFAULT_VALUE", this.A05);
                        checkoutHandler.A0N = true;
                    }
                } else if (str.equals("BOTTOM_SHEET_CLOSED")) {
                    checkoutHandler = (CheckoutHandler) this.A04;
                    CheckoutHandler.A09(checkoutHandler, (String) C86154wM.A0e(checkoutHandler.A0X), "ABORTED", (Map) null, (Map) null);
                    CheckoutHandler.A06(checkoutHandler);
                }
                C04530Oa r5 = checkoutHandler.A0V.A05;
                C86154wM.A0B(r5).edit().putInt("meta_pay_connect_cancellation_count", C86154wM.A0B(r5).getInt("meta_pay_connect_cancellation_count", 0) + 1).apply();
                AnonymousClass0wJ.A12(C86154wM.A0B(r5).edit(), "meta_pay_connect_cooldown_start_time_ms", currentTimeMillis);
                break;
            case 1:
                float A002 = C18240wQ.A00(obj);
                C147368pE r3 = (C147368pE) this.A00;
                C147368pE.A02(r3, A002);
                if (C04220Ms.A0I(((AnonymousClass5IX) C86104wH.A0f(this.A04)).A08, this.A05)) {
                    C140828Xz.A00((C147368pE) this.A03, r3, (C147368pE) this.A02, (C147368pE) this.A01);
                    break;
                }
                break;
            default:
                C166339nU r7 = (C166339nU) this.A04;
                C2W c2w = r7.A03;
                C19457Awe A0T = C86154wM.A0T(c2w);
                C19174Arq arq = new C19174Arq(c2w.BDY().A06);
                arq.A04.put(((C18483AgF) this.A02).A01(), C170829vd.LOADED);
                UserSession userSession = r7.A00;
                Product product = c2w.BDY().A01;
                List A012 = c2w.BDY().A06.A01(c2w.BDY().A01, userSession);
                C04220Ms.A06(A012);
                BKU bku = (BKU) this.A03;
                ArrayList A0v = AnonymousClass0wJ.A0v();
                for (Object next : A012) {
                    C18483AgF agF = (C18483AgF) next;
                    if (!(agF instanceof C167269pF) || !C04220Ms.A0I(((C167269pF) agF).A01.A0f.A4Y, bku.A0f.A4Y)) {
                        A0v.add(next);
                    }
                }
                arq.A00(product, userSession, A0v);
                A0T.A06 = new C19455Awc(arq);
                C109506k7 r32 = c2w.BDY().A07;
                C04220Ms.A06(r32);
                new HashMap();
                new HashMap();
                new HashMap();
                Map map = r32.A00;
                C04220Ms.A0C(map, AnonymousClass000.A00(HttpStatus.SC_REQUEST_URI_TOO_LONG));
                Map A022 = C03940Lk.A02(map);
                Map map2 = r32.A02;
                Map map3 = r32.A01;
                C04220Ms.A0B(bku, 0);
                Iterator A0z = AnonymousClass0wJ.A0z(A022);
                while (A0z.hasNext()) {
                    BPC bpc = (BPC) C18180wK.A0o(A0z).getValue();
                    bpc.A0B(bku);
                    bpc.A07();
                }
                A0T.A07 = new C109506k7(A022, map2, map3);
                C86154wM.A1O(c2w, A0T);
                AnonymousClass6VE.A00(userSession).A00();
                Ah2 ah2 = r7.A02;
                BKU bku2 = (BKU) this.A01;
                AnonymousClass9CN r0 = ((AnonymousClass9CM) this.A00).A01;
                if (r0 != null) {
                    l = r0.A02;
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                FeaturedProductPermissionStatus featuredProductPermissionStatus = FeaturedProductPermissionStatus.CANCELED;
                String A0x = C86124wJ.A0x(c2w);
                String A0t = C86104wH.A0t(c2w, A0x);
                C04220Ms.A0A(A0t);
                ah2.A02(bku2, featuredProductPermissionStatus, valueOf, A0x, A0t, this.A05);
                break;
        }
        return Unit.A00;
    }
}
