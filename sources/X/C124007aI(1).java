package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.fbpay.logging.LoggingPolicy;
import java.util.ArrayList;

/* renamed from: X.7aI  reason: invalid class name and case insensitive filesystem */
public final class C124007aI implements C143158gC {
    public final /* synthetic */ CheckoutConfiguration A00;
    public final /* synthetic */ ECPPaymentConfiguration A01;
    public final /* synthetic */ EcpUIConfiguration A02;
    public final /* synthetic */ PaymentReceiverInfo A03;
    public final /* synthetic */ C113996sW A04;
    public final /* synthetic */ LoggingPolicy A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ ArrayList A07;
    public final /* synthetic */ ArrayList A08;

    public C124007aI(CheckoutConfiguration checkoutConfiguration, ECPPaymentConfiguration eCPPaymentConfiguration, EcpUIConfiguration ecpUIConfiguration, PaymentReceiverInfo paymentReceiverInfo, C113996sW r5, LoggingPolicy loggingPolicy, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.A04 = r5;
        this.A02 = ecpUIConfiguration;
        this.A03 = paymentReceiverInfo;
        this.A00 = checkoutConfiguration;
        this.A01 = eCPPaymentConfiguration;
        this.A05 = loggingPolicy;
        this.A06 = str;
        this.A08 = arrayList;
        this.A07 = arrayList2;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass7Kx r1 = (AnonymousClass7Kx) obj;
        if (AnonymousClass7Kx.A0R(r1) && r1.A01 != null) {
            AnonymousClass7Kz.A05();
            C113996sW r4 = this.A04;
            FragmentActivity fragmentActivity = r4.A00;
            C114966uD r2 = new C114966uD((Fragment) null, fragmentActivity);
            String A002 = C122037Js.A00();
            r2.A02(new ECPPaymentRequest(this.A00, (ECPConfirmationConfiguration) null, this.A01, this.A02, this.A03, this.A05, A002, "742725890006429", "88888", "742725890006429", 0, false), this.A06).A0C(fragmentActivity, new IDxObserverShape55S0300000_2_I2(12, (Object) r4, (Object) this.A08, (Object) this.A07));
        }
    }
}
