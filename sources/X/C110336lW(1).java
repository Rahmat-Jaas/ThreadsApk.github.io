package X;

import com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl;
import com.facebook.graphql.impls.FBPayECPAvailabilityImpl;
import com.facebook.graphql.impls.FBPayLoggingPolicyImpl;
import com.facebook.graphql.impls.FBPayPaymentConfigImpl;
import com.facebook.graphql.impls.FBPayReceiverInfoImpl;

/* renamed from: X.6lW  reason: invalid class name and case insensitive filesystem */
public final class C110336lW {
    public final FBPayCheckoutScreenConfigImpl A00;
    public final FBPayECPAvailabilityImpl A01;
    public final FBPayLoggingPolicyImpl A02;
    public final FBPayPaymentConfigImpl A03;
    public final FBPayReceiverInfoImpl A04;

    public C110336lW(FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl, FBPayECPAvailabilityImpl fBPayECPAvailabilityImpl, FBPayLoggingPolicyImpl fBPayLoggingPolicyImpl, FBPayPaymentConfigImpl fBPayPaymentConfigImpl, FBPayReceiverInfoImpl fBPayReceiverInfoImpl) {
        this.A04 = fBPayReceiverInfoImpl;
        this.A01 = fBPayECPAvailabilityImpl;
        this.A00 = fBPayCheckoutScreenConfigImpl;
        this.A03 = fBPayPaymentConfigImpl;
        this.A02 = fBPayLoggingPolicyImpl;
    }
}
