package X;

import com.facebook.graphql.impls.ECPReceiverInfoFragmentImpl;
import com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl;
import com.facebook.graphql.impls.FBPayConfirmationSectionImpl;
import com.facebook.graphql.impls.FBPayECPAvailabilityImpl;
import com.facebook.graphql.impls.FBPayLinkAvailabilityImpl;
import com.facebook.graphql.impls.FBPayLoggingPolicyImpl;
import com.facebook.graphql.impls.FBPayPaymentConfigImpl;
import com.facebook.graphql.impls.FBPayReceiverInfoImpl;
import com.facebook.graphql.impls.FBPayTransactionInfoImpl;
import com.facebook.graphql.impls.FetchPaymentDetailsQueryResponseImpl;
import com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.otc.models.OtcInput;
import com.fbpay.logging.LoggingPolicy;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Pair;

/* renamed from: X.7aB  reason: invalid class name and case insensitive filesystem */
public final class C123977aB implements C143158gC {
    public final /* synthetic */ C882557i A00;
    public final /* synthetic */ EcpUIConfiguration A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C123977aB(C882557i r1, EcpUIConfiguration ecpUIConfiguration, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A01 = ecpUIConfiguration;
        this.A02 = str4;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C880856r r2;
        Object obj2;
        AnonymousClass7JD r0;
        FetchProductConfigQueryResponseImpl fetchProductConfigQueryResponseImpl;
        FetchProductConfigQueryResponseImpl.FetchProductConfig A002;
        Class cls;
        TreeJNI treeValue;
        Class cls2;
        TreeJNI reinterpret;
        TreeJNI treeJNI;
        Class cls3;
        TreeJNI treeValue2;
        TreeJNI treeValue3;
        TreeJNI reinterpret2;
        TreeJNI treeValue4;
        String str;
        FBPayConfirmationSectionImpl fBPayConfirmationSectionImpl;
        LoggingPolicy loggingPolicy;
        Set set;
        Set set2;
        FBPayECPAvailabilityImpl fBPayECPAvailabilityImpl;
        FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl;
        FBPayPaymentConfigImpl fBPayPaymentConfigImpl;
        String str2;
        FBPayLoggingPolicyImpl fBPayLoggingPolicyImpl;
        TreeJNI reinterpret3;
        Pair pair = (Pair) obj;
        C04220Ms.A0B(pair, 0);
        AnonymousClass7Kx r1 = (AnonymousClass7Kx) pair.A00;
        if (!(!AnonymousClass7Kx.A0R(r1) || (fetchProductConfigQueryResponseImpl = (FetchProductConfigQueryResponseImpl) r1.A01) == null || (A002 = fetchProductConfigQueryResponseImpl.A00()) == null || (treeValue = A002.getTreeValue("ecp_availability", cls)) == null || (reinterpret = treeValue.reinterpret(cls2)) == null || !reinterpret.getBooleanValue("is_ecp_available"))) {
            AnonymousClass7Kx r12 = (AnonymousClass7Kx) pair.A01;
            if (!(!AnonymousClass7Kx.A0R(r12) || (treeJNI = (TreeJNI) r12.A01) == null || (treeValue2 = treeJNI.getTreeValue("fetch_payment_details(input:$input)", (cls3 = FetchPaymentDetailsQueryResponseImpl.FetchPaymentDetails.class))) == null || (treeValue3 = treeValue2.getTreeValue("link_availability", FetchPaymentDetailsQueryResponseImpl.FetchPaymentDetails.LinkAvailability.class)) == null || (reinterpret2 = treeValue3.reinterpret(FBPayLinkAvailabilityImpl.class)) == null || !reinterpret2.getBooleanValue("is_link_available"))) {
                FBPayLoggingPolicyImpl fBPayLoggingPolicyImpl2 = null;
                FetchProductConfigQueryResponseImpl.FetchProductConfig A003 = fetchProductConfigQueryResponseImpl.A00();
                if (A003 == null) {
                    throw C18180wK.A0a("Required value was null.");
                } else if (treeJNI == null || (treeValue4 = treeJNI.getTreeValue("fetch_payment_details(input:$input)", cls3)) == null) {
                    throw C18180wK.A0a("Required value was null.");
                } else {
                    TreeJNI treeValue5 = treeValue4.getTreeValue("transaction_info", FetchPaymentDetailsQueryResponseImpl.FetchPaymentDetails.TransactionInfo.class);
                    if (treeValue5 != null) {
                        FBPayTransactionInfoImpl fBPayTransactionInfoImpl = (FBPayTransactionInfoImpl) treeValue5.reinterpret(FBPayTransactionInfoImpl.class);
                        C04220Ms.A06(fBPayTransactionInfoImpl);
                        TransactionInfo A0H = C122157Kv.A0H(fBPayTransactionInfoImpl);
                        String str3 = this.A04;
                        TreeJNI treeValue6 = treeValue4.getTreeValue("receiver_info", FetchPaymentDetailsQueryResponseImpl.FetchPaymentDetails.ReceiverInfo.class);
                        if (treeValue6 == null || (reinterpret3 = treeValue6.reinterpret(ECPReceiverInfoFragmentImpl.class)) == null || (str = C18220wO.A0l(reinterpret3)) == null) {
                            str = "";
                        }
                        PaymentReceiverInfo paymentReceiverInfo = new PaymentReceiverInfo(str3, str, (String) null, (String) null);
                        TreeJNI treeValue7 = treeValue4.getTreeValue("confirmation_section", FetchPaymentDetailsQueryResponseImpl.FetchPaymentDetails.ConfirmationSection.class);
                        if (treeValue7 != null) {
                            fBPayConfirmationSectionImpl = (FBPayConfirmationSectionImpl) treeValue7.reinterpret(FBPayConfirmationSectionImpl.class);
                        } else {
                            fBPayConfirmationSectionImpl = null;
                        }
                        ECPConfirmationConfiguration A0A = C122157Kv.A0A(fBPayConfirmationSectionImpl);
                        String A0n = C18190wL.A0n(C03480Iw.A00());
                        String str4 = this.A05;
                        String str5 = this.A03;
                        EcpUIConfiguration ecpUIConfiguration = this.A01;
                        EcpUIConfiguration ecpUIConfiguration2 = ecpUIConfiguration;
                        String str6 = this.A02;
                        C04220Ms.A0B(ecpUIConfiguration, 6);
                        Class<FetchProductConfigQueryResponseImpl.FetchProductConfig.CheckoutScreenConfig> cls4 = FetchProductConfigQueryResponseImpl.FetchProductConfig.CheckoutScreenConfig.class;
                        TreeJNI treeValue8 = A003.getTreeValue("checkout_screen_config", cls4);
                        if (treeValue8 != null) {
                            Class<FBPayCheckoutScreenConfigImpl> cls5 = FBPayCheckoutScreenConfigImpl.class;
                            FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl2 = (FBPayCheckoutScreenConfigImpl) treeValue8.reinterpret(cls5);
                            if (fBPayCheckoutScreenConfigImpl2 != null) {
                                CheckoutConfiguration A08 = C122157Kv.A08(fBPayCheckoutScreenConfigImpl2);
                                Class<FetchProductConfigQueryResponseImpl.FetchProductConfig.PaymentConfig> cls6 = FetchProductConfigQueryResponseImpl.FetchProductConfig.PaymentConfig.class;
                                TreeJNI treeValue9 = A003.getTreeValue("payment_config", cls6);
                                if (treeValue9 != null) {
                                    Class<FBPayPaymentConfigImpl> cls7 = FBPayPaymentConfigImpl.class;
                                    FBPayPaymentConfigImpl fBPayPaymentConfigImpl2 = (FBPayPaymentConfigImpl) treeValue9.reinterpret(cls7);
                                    C04220Ms.A06(fBPayPaymentConfigImpl2);
                                    ECPPaymentConfiguration A0C = C122157Kv.A0C(fBPayPaymentConfigImpl2, A0H, str6);
                                    Class<FetchProductConfigQueryResponseImpl.FetchProductConfig.LoggingPolicy> cls8 = FetchProductConfigQueryResponseImpl.FetchProductConfig.LoggingPolicy.class;
                                    TreeJNI treeValue10 = A003.getTreeValue("logging_policy", cls8);
                                    if (treeValue10 == null || (fBPayLoggingPolicyImpl = (FBPayLoggingPolicyImpl) treeValue10.reinterpret(FBPayLoggingPolicyImpl.class)) == null) {
                                        loggingPolicy = null;
                                    } else {
                                        loggingPolicy = C122157Kv.A0J(fBPayLoggingPolicyImpl);
                                    }
                                    ECPPaymentRequest eCPPaymentRequest = new ECPPaymentRequest(A08, A0A, A0C, ecpUIConfiguration2, paymentReceiverInfo, loggingPolicy, str4, str5, A0n, str6, 0, false);
                                    ECPRepositoryImpl A022 = AnonymousClass7JJ.A02();
                                    CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
                                    if (checkoutConfiguration != null) {
                                        set = checkoutConfiguration.A0B;
                                        set2 = checkoutConfiguration.A0C;
                                    } else {
                                        set = AnonymousClass84Y.A00;
                                        set2 = set;
                                    }
                                    boolean A0A2 = A022.A0A(str5, set, set2);
                                    TreeJNI treeValue11 = A003.getTreeValue("ecp_availability", (cls = FetchProductConfigQueryResponseImpl.FetchProductConfig.EcpAvailability.class));
                                    if (treeValue11 != null) {
                                        fBPayECPAvailabilityImpl = (FBPayECPAvailabilityImpl) treeValue11.reinterpret((cls2 = FBPayECPAvailabilityImpl.class));
                                    } else {
                                        fBPayECPAvailabilityImpl = null;
                                    }
                                    TreeJNI treeValue12 = A003.getTreeValue("checkout_screen_config", cls4);
                                    if (treeValue12 != null) {
                                        fBPayCheckoutScreenConfigImpl = (FBPayCheckoutScreenConfigImpl) treeValue12.reinterpret(cls5);
                                    } else {
                                        fBPayCheckoutScreenConfigImpl = null;
                                    }
                                    TreeJNI treeValue13 = A003.getTreeValue("payment_config", cls6);
                                    if (treeValue13 != null) {
                                        fBPayPaymentConfigImpl = (FBPayPaymentConfigImpl) treeValue13.reinterpret(cls7);
                                    } else {
                                        fBPayPaymentConfigImpl = null;
                                    }
                                    TreeJNI treeValue14 = A003.getTreeValue("logging_policy", cls8);
                                    if (treeValue14 != null) {
                                        fBPayLoggingPolicyImpl2 = (FBPayLoggingPolicyImpl) treeValue14.reinterpret(FBPayLoggingPolicyImpl.class);
                                    }
                                    C110336lW r14 = new C110336lW(fBPayCheckoutScreenConfigImpl, fBPayECPAvailabilityImpl, fBPayLoggingPolicyImpl2, fBPayPaymentConfigImpl, (FBPayReceiverInfoImpl) null);
                                    if (A0A2) {
                                        str2 = "NUX";
                                    } else {
                                        str2 = "PUX";
                                    }
                                    ArrayList A012 = AnonymousClass7JB.A01(r14, (OtcInput) null, (LoggingPolicy) null, str4, str5, str3, str2, false);
                                    if (A0A2) {
                                        C121277Fh.A03(C121277Fh.A00(A012), new IDxObserverShape55S0300000_2_I2(8, (Object) this.A00, (Object) A0H, (Object) eCPPaymentRequest));
                                        return;
                                    }
                                    r2 = this.A00.A06;
                                    obj2 = C18180wK.A0p(eCPPaymentRequest, A0H);
                                    r0 = new AnonymousClass7JD(obj2);
                                    r2.A0H(r0);
                                }
                                throw C18180wK.A0a("Required value was null.");
                            }
                        }
                        throw C18180wK.A0a("Required value was null.");
                    }
                    throw C18180wK.A0a("Required value was null.");
                }
            }
        }
        Throwable th = ((AnonymousClass7Kx) pair.A01).A02;
        if (th == null || !(th instanceof C92875kA)) {
            r2 = this.A00.A05;
            obj2 = new C1373788i(0, "", "");
            r0 = new AnonymousClass7JD(obj2);
            r2.A0H(r0);
        }
        r2 = this.A00.A05;
        r0 = new AnonymousClass7JD(th);
        r2.A0H(r0);
    }
}
