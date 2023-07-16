package com.facebookpay.expresscheckout.checkouthelper;

import X.AnonymousClass0MJ;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass69P;
import X.AnonymousClass7Kx;
import X.AnonymousClass84Y;
import X.C110336lW;
import X.C110996mc;
import X.C121277Fh;
import X.C122157Kv;
import X.C146958n9;
import X.C18180wK;
import X.C18220wO;
import X.C29991ze;
import X.C39142Kno;
import X.C86164wN;
import X.D0E;
import X.M5J;
import com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl;
import com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl;
import com.facebook.graphql.impls.FBPayECPAvailabilityImpl;
import com.facebook.graphql.impls.FBPayReceiverInfoImpl;
import com.facebook.graphql.impls.FBPayTransactionInfoImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutResponse;
import com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.fbpay.logging.LoggingPolicy;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebookpay.expresscheckout.checkouthelper.ECPCheckoutHelper$showCheckoutBottomSheet$2", f = "ECPCheckoutHelper.kt", i = {}, l = {241}, m = "invokeSuspend", n = {}, s = {})
public final class ECPCheckoutHelper$showCheckoutBottomSheet$2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public final /* synthetic */ C110996mc A01;
    public final /* synthetic */ ECPConfirmationConfiguration A02;
    public final /* synthetic */ ECPPaymentRequest A03;
    public final /* synthetic */ EcpUIConfiguration A04;
    public final /* synthetic */ PaymentReceiverInfo A05;
    public final /* synthetic */ ECPRepositoryImpl A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ List A0E;
    public final /* synthetic */ AnonymousClass0MJ A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ECPCheckoutHelper$showCheckoutBottomSheet$2(C110996mc r3, ECPConfirmationConfiguration eCPConfirmationConfiguration, ECPPaymentRequest eCPPaymentRequest, EcpUIConfiguration ecpUIConfiguration, PaymentReceiverInfo paymentReceiverInfo, ECPRepositoryImpl eCPRepositoryImpl, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, C146958n9 r17, AnonymousClass0MJ r18) {
        super(2, r17);
        this.A06 = eCPRepositoryImpl;
        this.A0D = str;
        this.A09 = str2;
        this.A05 = paymentReceiverInfo;
        this.A0E = list;
        this.A08 = str3;
        this.A03 = eCPPaymentRequest;
        this.A0A = str4;
        this.A0F = r18;
        this.A01 = r3;
        this.A07 = str5;
        this.A0C = str6;
        this.A04 = ecpUIConfiguration;
        this.A02 = eCPConfirmationConfiguration;
        this.A0B = str7;
    }

    public final C146958n9 create(Object obj, C146958n9 r20) {
        ECPRepositoryImpl eCPRepositoryImpl = this.A06;
        String str = this.A0D;
        String str2 = this.A09;
        PaymentReceiverInfo paymentReceiverInfo = this.A05;
        List list = this.A0E;
        String str3 = this.A08;
        ECPPaymentRequest eCPPaymentRequest = this.A03;
        String str4 = this.A0A;
        AnonymousClass0MJ r0 = this.A0F;
        C110996mc r2 = this.A01;
        String str5 = this.A07;
        String str6 = this.A0C;
        return new ECPCheckoutHelper$showCheckoutBottomSheet$2(r2, this.A02, eCPPaymentRequest, this.A04, paymentReceiverInfo, eCPRepositoryImpl, str, str2, str3, str4, str5, str6, this.A0B, list, r20, r0);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        TreeJNI treeJNI;
        String str2;
        CheckoutResponse checkoutResponse;
        CheckoutSetupMutationResponseImpl.CheckoutSetupMutation A002;
        TreeJNI A0K;
        TreeJNI reinterpret;
        CheckoutSetupMutationResponseImpl.CheckoutSetupMutation checkoutSetupMutation;
        TreeJNI reinterpret2;
        C110996mc r5;
        Set set;
        Set set2;
        M5J A022;
        FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl;
        ImmutableList enumList;
        FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl2;
        ImmutableList A003;
        FBPayTransactionInfoImpl fBPayTransactionInfoImpl;
        CheckoutSetupMutationResponseImpl.CheckoutSetupMutation A004;
        TreeJNI A0K2;
        Object obj2 = obj;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        TransactionInfo transactionInfo = null;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj2);
        } else {
            AnonymousClass0OU.A00(obj2);
            ECPRepositoryImpl eCPRepositoryImpl = this.A06;
            String str3 = this.A0D;
            String str4 = this.A09;
            PaymentReceiverInfo paymentReceiverInfo = this.A05;
            if (paymentReceiverInfo == null || ((str = paymentReceiverInfo.A02) == null && (str = paymentReceiverInfo.A00) == null)) {
                throw C18180wK.A0a("Required value was null.");
            }
            List list = this.A0E;
            String str5 = this.A08;
            boolean A1U = C18220wO.A1U(this.A03);
            String str6 = this.A0A;
            this.A00 = 1;
            obj2 = ECPRepositoryImpl.A01(eCPRepositoryImpl, (LoggingPolicy) null, str3, str4, str, str5, str6, list, this, A1U, false);
            if (obj2 == d0e) {
                return d0e;
            }
        }
        AnonymousClass7Kx r7 = (AnonymousClass7Kx) obj2;
        AnonymousClass0MJ r52 = this.A0F;
        CheckoutSetupMutationResponseImpl checkoutSetupMutationResponseImpl = (CheckoutSetupMutationResponseImpl) r7.A01;
        if (checkoutSetupMutationResponseImpl == null || (A004 = checkoutSetupMutationResponseImpl.A00()) == null || (A0K2 = C86164wN.A0K(A004)) == null) {
            treeJNI = null;
        } else {
            treeJNI = A0K2.reinterpret(FBPayECPAvailabilityImpl.class);
        }
        r52.A00 = treeJNI;
        boolean A0O = AnonymousClass7Kx.A0O(r7);
        if (A0O || treeJNI == null || !treeJNI.getBooleanValue("is_ecp_available")) {
            C110996mc r3 = this.A01;
            if (A0O) {
                checkoutResponse = new CheckoutResponse((ECPPaymentResponseParams) null, (Integer) null, "CHECKOUT_FAILED", (String) null);
            } else {
                if (checkoutSetupMutationResponseImpl == null || (A002 = checkoutSetupMutationResponseImpl.A00()) == null || (A0K = C86164wN.A0K(A002)) == null || (reinterpret = A0K.reinterpret(FBPayECPAvailabilityImpl.class)) == null) {
                    str2 = null;
                } else {
                    str2 = reinterpret.getStringValue("ecp_availability_reason");
                }
                checkoutResponse = new CheckoutResponse((ECPPaymentResponseParams) null, (Integer) null, "CHECKOUT_NOT_AVAILABLE", str2);
            }
            r3.A00.Cix(checkoutResponse);
        } else {
            if (checkoutSetupMutationResponseImpl != null) {
                checkoutSetupMutation = checkoutSetupMutationResponseImpl.A00();
            } else {
                checkoutSetupMutation = null;
            }
            ECPPaymentRequest eCPPaymentRequest = this.A03;
            if (eCPPaymentRequest != null) {
                if (checkoutSetupMutation != null) {
                    ECPPaymentRequest A0E2 = C122157Kv.A0E(checkoutSetupMutation, eCPPaymentRequest);
                    r5 = this.A01;
                    A022 = r5.A04.A02(A0E2, this.A07);
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            } else if (checkoutSetupMutation != null) {
                if (checkoutSetupMutation.getStringValue("order_id") != null) {
                    ECPHandler eCPHandler = this.A01.A00;
                    TreeJNI treeValue = checkoutSetupMutation.getTreeValue("transaction_info", CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.TransactionInfo.class);
                    if (!(treeValue == null || (fBPayTransactionInfoImpl = (FBPayTransactionInfoImpl) treeValue.reinterpret(FBPayTransactionInfoImpl.class)) == null)) {
                        transactionInfo = C122157Kv.A0H(fBPayTransactionInfoImpl);
                    }
                    eCPHandler.Cqk(AnonymousClass7Kx.A0A(transactionInfo));
                }
                String str7 = this.A0D;
                String str8 = this.A0C;
                String str9 = this.A09;
                CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.ReceiverInfo A005 = checkoutSetupMutation.A00();
                if (A005 == null || (reinterpret2 = A005.reinterpret(FBPayReceiverInfoImpl.class)) == null) {
                    throw C18180wK.A0a("Required value was null.");
                }
                reinterpret2.getStringValue("strong_id__");
                reinterpret2.getStringValue(FXPFAccessLibraryDebugFragment.NAME);
                reinterpret2.getStringValue("image");
                ECPPaymentRequest A0D2 = C122157Kv.A0D(checkoutSetupMutation, this.A02, this.A04, str7, str8, str9);
                ECPRepositoryImpl eCPRepositoryImpl2 = this.A06;
                String str10 = this.A0B;
                r5 = this.A01;
                C110336lW A052 = eCPRepositoryImpl2.A05(str9, str10);
                if (A052 == null || (fBPayCheckoutScreenConfigImpl2 = A052.A00) == null || (A003 = AnonymousClass69P.A00(fBPayCheckoutScreenConfigImpl2)) == null) {
                    set = AnonymousClass84Y.A00;
                } else {
                    set = C122157Kv.A0N(A003);
                }
                C110336lW A053 = eCPRepositoryImpl2.A05(str9, str10);
                if (A053 == null || (fBPayCheckoutScreenConfigImpl = A053.A00) == null || (enumList = fBPayCheckoutScreenConfigImpl.getEnumList("request_fields", C29991ze.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) == null) {
                    set2 = AnonymousClass84Y.A00;
                } else {
                    set2 = C122157Kv.A0O(enumList);
                }
                if (eCPRepositoryImpl2.A0A(str9, set, set2)) {
                    C121277Fh.A03(C121277Fh.A00(eCPRepositoryImpl2.A03), C86164wN.A0O(r5, A0D2, 2));
                } else {
                    A022 = r5.A04.A02(A0D2, "DEFAULT_VALUE");
                }
            }
            A022.A0C(r5.A02, r5.A03);
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ECPCheckoutHelper$showCheckoutBottomSheet$2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
