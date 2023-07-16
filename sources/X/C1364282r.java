package X;

import com.facebookpay.expresscheckout.models.FulfillmentOptions;
import com.facebookpay.expresscheckout.models.PickupInfo;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.expresscheckout.models.ShippingOptions;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import java.util.ArrayList;

/* renamed from: X.82r  reason: invalid class name and case insensitive filesystem */
public final class C1364282r implements Runnable {
    public final /* synthetic */ C111186mv A00;
    public final /* synthetic */ C113996sW A01;
    public final /* synthetic */ ArrayList A02;
    public final /* synthetic */ ArrayList A03;

    public C1364282r(C111186mv r1, C113996sW r2, ArrayList arrayList, ArrayList arrayList2) {
        this.A01 = r2;
        this.A03 = arrayList;
        this.A02 = arrayList2;
        this.A00 = r1;
    }

    public final void run() {
        C113996sW r3 = this.A01;
        r3.A02.A0G(AnonymousClass7Kx.A0A(new TransactionInfo(new FulfillmentOptions(this.A00.A04, r3.A04.A01), (PickupInfo) null, new PromoCodeList(r3.A07), (ShippingOptions) null, (Integer) null, (Integer) null, "USD", "US", (String) null, this.A03, this.A02, r3.A08)));
    }
}
