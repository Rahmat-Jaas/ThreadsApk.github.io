package X;

import com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl;
import com.facebook.graphql.impls.FBPayECPAvailabilityImpl;
import com.facebook.graphql.impls.FBPayLinkAvailabilityImpl;
import com.facebook.graphql.impls.FBPayPaymentConfigImpl;
import com.facebook.graphql.impls.FBPayReceiverInfoImpl;

/* renamed from: X.6ly  reason: invalid class name and case insensitive filesystem */
public final class C110606ly {
    public final FBPayCheckoutScreenConfigImpl A00;
    public final FBPayECPAvailabilityImpl A01;
    public final FBPayLinkAvailabilityImpl A02;
    public final FBPayPaymentConfigImpl A03;
    public final FBPayReceiverInfoImpl A04;
    public final C147878q4 A05;

    public C110606ly(FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl, FBPayECPAvailabilityImpl fBPayECPAvailabilityImpl, FBPayLinkAvailabilityImpl fBPayLinkAvailabilityImpl, FBPayPaymentConfigImpl fBPayPaymentConfigImpl, FBPayReceiverInfoImpl fBPayReceiverInfoImpl, C147878q4 r6) {
        this.A01 = fBPayECPAvailabilityImpl;
        this.A04 = fBPayReceiverInfoImpl;
        this.A00 = fBPayCheckoutScreenConfigImpl;
        this.A03 = fBPayPaymentConfigImpl;
        this.A02 = fBPayLinkAvailabilityImpl;
        this.A05 = r6;
    }
}
