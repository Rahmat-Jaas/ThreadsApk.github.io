package kotlin.jvm.internal;

import X.AnonymousClass0MJ;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass3J5;
import X.AnonymousClass55P;
import X.AnonymousClass582;
import X.AnonymousClass77I;
import X.AnonymousClass7JB;
import X.AnonymousClass83A;
import X.C02220Ah;
import X.C04220Ms;
import X.C115506vH;
import X.C146078lb;
import X.C146958n9;
import X.C147368pE;
import X.C18180wK;
import X.C25237DiI;
import X.C25745DrH;
import X.C27952Ew2;
import X.C37383Jqm;
import X.C63643hy;
import X.C83224qz;
import X.GVD;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0201000_I2_2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2;

public class KtLambdaShape1S1500000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S1500000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        super(0);
        this.A06 = i;
        this.A00 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A04 = obj5;
        this.A05 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C37383Jqm A022;
        C37383Jqm A023;
        switch (this.A06) {
            case 0:
                C115506vH r2 = (C115506vH) this.A03;
                NestedScrollDispatcher nestedScrollDispatcher = (NestedScrollDispatcher) this.A01;
                return new AnonymousClass55P((Context) this.A00, r2, (C146078lb) this.A04, nestedScrollDispatcher, this.A05, (AnonymousClass0YY) this.A02).A0G;
            case 1:
                CheckoutHandler checkoutHandler = (CheckoutHandler) this.A04;
                ECPAvailabilityRequestParams eCPAvailabilityRequestParams = checkoutHandler.A02;
                if (eCPAvailabilityRequestParams != null) {
                    TransactionInfo transactionInfo = (TransactionInfo) this.A03;
                    String str = this.A05;
                    CheckoutHandler.A0A(checkoutHandler, "user_click_ecpentry_atomic", (Map) this.A01);
                    AnonymousClass7JB.A00.A04(eCPAvailabilityRequestParams, "PUX");
                    CheckoutHandler.A05((ECPPaymentRequest) this.A00, transactionInfo, checkoutHandler, (PaymentRequest) this.A02, "FORCE_PUX", str);
                    CheckoutHandler.A02(checkoutHandler).A05 = C18180wK.A0X();
                    checkoutHandler.A0N = true;
                    break;
                }
                break;
            case 2:
                AnonymousClass582 r4 = (AnonymousClass582) this.A04;
                r4.A01();
                C147368pE.A04((C147368pE) this.A02, false);
                Object obj = this.A00;
                C04220Ms.A0B(obj, 0);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0201000_I2_2(obj, (Object) r4, (C146958n9) null, 5), AnonymousClass3J5.A00(r4), 3);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1101000_I2(this.A03, this.A05, (C146958n9) null, 10), (C83224qz) this.A01, 3);
                break;
            default:
                User user = (User) ((AnonymousClass0MJ) this.A01).A00;
                GVD gvd = C25745DrH.A00;
                Activity activity = (Activity) this.A00;
                C25745DrH A012 = gvd.A01(activity);
                if (user == null) {
                    if (!(A012 == null || (A022 = C37383Jqm.A02(A012)) == null)) {
                        String str2 = this.A05;
                        if (str2 == null) {
                            A022.A06();
                            break;
                        } else {
                            A022.A0G(str2, false);
                            break;
                        }
                    }
                } else {
                    if (!(A012 == null || (A023 = C37383Jqm.A02(A012)) == null)) {
                        String str3 = this.A05;
                        if (str3 != null) {
                            A023.A0G(str3, false);
                        } else {
                            A023.A07();
                        }
                    }
                    C63643hy.A05(new AnonymousClass83A(activity, (AnonymousClass77I) this.A04, (UserSession) this.A03, user, this.A05, (AnonymousClass0MJ) this.A02));
                    break;
                }
        }
        return Unit.A00;
    }
}
