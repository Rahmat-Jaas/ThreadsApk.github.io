package X;

import com.facebook.graphql.impls.FBPayReceiverInfoImpl;
import com.facebookpay.expresscheckout.models.CheckoutAvailability;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.google.common.collect.ImmutableList;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7AE  reason: invalid class name */
public final class AnonymousClass7AE {
    public ECPPaymentResponseParams A00 = null;
    public PaymentRequest A01 = null;
    public PaymentRequest A02 = null;
    public C115316ur A03 = null;
    public AnonymousClass7Kx A04 = null;
    public Boolean A05 = null;
    public String A06 = null;

    public /* synthetic */ AnonymousClass7AE(ECPPaymentResponseParams eCPPaymentResponseParams, PaymentRequest paymentRequest, PaymentRequest paymentRequest2, C115316ur r5, AnonymousClass7Kx r6, Boolean bool, String str, DefaultConstructorMarker defaultConstructorMarker, int i) {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7AE) {
                AnonymousClass7AE r5 = (AnonymousClass7AE) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final PaymentReceiverInfo A00() {
        CheckoutAvailability checkoutAvailability;
        FBPayReceiverInfoImpl fBPayReceiverInfoImpl;
        AnonymousClass7Kx r0 = this.A04;
        if (r0 == null || (checkoutAvailability = (CheckoutAvailability) r0.A01) == null || (fBPayReceiverInfoImpl = checkoutAvailability.A00.A04) == null) {
            return null;
        }
        return new PaymentReceiverInfo(C18220wO.A0m(fBPayReceiverInfoImpl), C18220wO.A0l(fBPayReceiverInfoImpl), fBPayReceiverInfoImpl.getStringValue("image"), (String) null);
    }

    public final Set A01() {
        CheckoutAvailability checkoutAvailability;
        ImmutableList enumList;
        AnonymousClass7Kx r0 = this.A04;
        if (r0 == null || (checkoutAvailability = (CheckoutAvailability) r0.A01) == null || (enumList = checkoutAvailability.A00.A03.getEnumList("supported_container_types", AnonymousClass66Z.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null) {
            return null;
        }
        return AnonymousClass00J.A0c(C122157Kv.A0L(enumList));
    }

    public final int hashCode() {
        return (((((((((((AnonymousClass0wJ.A03(this.A01) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A03(this.A05)) * 31) + AnonymousClass0wJ.A06(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + C18200wM.A07(this.A02);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("CheckoutSessionData(availabilityRequest=");
        A0s.append(this.A01);
        A0s.append(", availabilityResponse=");
        A0s.append(this.A04);
        A0s.append(", userInfo=");
        A0s.append(this.A03);
        A0s.append(", isNUXUser=");
        A0s.append(this.A05);
        A0s.append(", orderId=");
        A0s.append(this.A06);
        A0s.append(", ecpPaymentResponseParams=");
        A0s.append(this.A00);
        A0s.append(", paymentRequest=");
        return C86104wH.A0y(this.A02, A0s);
    }

    public AnonymousClass7AE() {
    }
}
