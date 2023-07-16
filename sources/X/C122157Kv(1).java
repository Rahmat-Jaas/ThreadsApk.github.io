package X;

import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl;
import com.facebook.graphql.impls.FBPayBloksComponentImpl;
import com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl;
import com.facebook.graphql.impls.FBPayConfirmationSectionImpl;
import com.facebook.graphql.impls.FBPayECPAvailabilityImpl;
import com.facebook.graphql.impls.FBPayECPHandleCheckoutEventMutationResponseImpl;
import com.facebook.graphql.impls.FBPayECPPriceInfoImpl;
import com.facebook.graphql.impls.FBPayECPShippingOptionFragmentImpl;
import com.facebook.graphql.impls.FBPayECPShippingOptionsFragmentImpl;
import com.facebook.graphql.impls.FBPayLinkAvailabilityImpl;
import com.facebook.graphql.impls.FBPayLoggingPolicyImpl;
import com.facebook.graphql.impls.FBPayPaymentConfigImpl;
import com.facebook.graphql.impls.FBPayReceiverInfoImpl;
import com.facebook.graphql.impls.NewCreditCardOptionImpl;
import com.facebook.graphql.impls.NewPaypalBillingAgreementImpl;
import com.facebook.graphql.impls.PaymentMethodComponentImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellAction;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellSection;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.FulfillmentOptions;
import com.facebookpay.expresscheckout.models.FulfillmentPickupOption;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.PickupInfo;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.expresscheckout.models.ShippingOption;
import com.facebookpay.expresscheckout.models.ShippingOptions;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.offsite.models.message.OffsiteShippingType$Companion;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.fbpay.logging.ClientSuppressionPolicy;
import com.fbpay.logging.LoggingPolicy;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* renamed from: X.7Kv  reason: invalid class name and case insensitive filesystem */
public final class C122157Kv {
    public static final CheckoutConfiguration A08(FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl) {
        ImmutableList A00 = AnonymousClass69P.A00(fBPayCheckoutScreenConfigImpl);
        C04220Ms.A06(A00);
        Set A0N = A0N(A00);
        ImmutableList enumList = fBPayCheckoutScreenConfigImpl.getEnumList("request_fields", C29991ze.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C04220Ms.A06(enumList);
        return new CheckoutConfiguration((APMConfiguration) null, (C969767l) null, (C969767l) null, false, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, fBPayCheckoutScreenConfigImpl.getStringValue("checkout_button_label"), (String) null, A0N, A0O(enumList), fBPayCheckoutScreenConfigImpl.getBooleanValue("full_billing_required"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.expresscheckout.models.CheckoutResponse A09(X.C110606ly r6) {
        /*
            r3 = 0
            if (r6 == 0) goto L_0x005d
            com.facebook.graphql.impls.FBPayECPAvailabilityImpl r1 = r6.A01
            java.lang.String r0 = "is_ecp_available"
            java.lang.Boolean r5 = X.C18250wR.A0S(r1, r0)
            com.facebook.graphql.impls.FBPayLinkAvailabilityImpl r1 = r6.A02
            if (r1 == 0) goto L_0x005e
            java.lang.String r0 = "is_link_available"
            java.lang.Boolean r4 = X.C18250wR.A0S(r1, r0)
        L_0x0015:
            com.facebook.graphql.impls.FBPayLinkAvailabilityImpl r2 = r6.A02
            if (r2 == 0) goto L_0x0054
            java.lang.Class<com.facebook.graphql.impls.FBPayLinkAvailabilityImpl$LinkUnavailableReason> r1 = com.facebook.graphql.impls.FBPayLinkAvailabilityImpl.LinkUnavailableReason.class
            java.lang.String r0 = "link_unavailable_reason"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0054
            java.lang.Class<com.facebook.graphql.impls.ECPUserFacingErrorImpl> r0 = com.facebook.graphql.impls.ECPUserFacingErrorImpl.class
            com.facebook.pando.TreeJNI r2 = r1.reinterpret(r0)
            if (r2 == 0) goto L_0x0054
            java.lang.Class<com.facebook.graphql.impls.ECPUserFacingErrorImpl$UserFacingError> r1 = com.facebook.graphql.impls.ECPUserFacingErrorImpl.UserFacingError.class
            java.lang.String r0 = "user_facing_error"
            com.facebook.pando.TreeJNI r0 = r2.getTreeValue(r0, r1)
            if (r0 == 0) goto L_0x0054
            com.facebook.pando.TreeJNI r1 = X.C86124wJ.A0T(r0)
            if (r1 == 0) goto L_0x0054
            java.lang.String r0 = "error_description"
            java.lang.String r2 = r1.getStringValue(r0)
            if (r2 == 0) goto L_0x0054
        L_0x0043:
            java.lang.Boolean r1 = X.C18180wK.A0X()
            boolean r0 = X.C04220Ms.A0I(r5, r1)
            if (r0 != 0) goto L_0x0063
            boolean r0 = X.C04220Ms.A0I(r4, r1)
            if (r0 != 0) goto L_0x0063
            return r3
        L_0x0054:
            com.facebook.graphql.impls.FBPayECPAvailabilityImpl r1 = r6.A01
            java.lang.String r0 = "ecp_availability_reason"
            java.lang.String r2 = r1.getStringValue(r0)
            goto L_0x0043
        L_0x005d:
            r5 = r3
        L_0x005e:
            r4 = r3
            if (r6 != 0) goto L_0x0015
            r2 = r3
            goto L_0x0043
        L_0x0063:
            java.lang.String r1 = "CHECKOUT_NOT_AVAILABLE"
            com.facebookpay.expresscheckout.models.CheckoutResponse r0 = new com.facebookpay.expresscheckout.models.CheckoutResponse
            r0.<init>(r3, r3, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122157Kv.A09(X.6ly):com.facebookpay.expresscheckout.models.CheckoutResponse");
    }

    public static final ECPConfirmationConfiguration A0A(FBPayConfirmationSectionImpl fBPayConfirmationSectionImpl) {
        String name;
        String name2;
        if (fBPayConfirmationSectionImpl == null) {
            return null;
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ImmutableList treeList = fBPayConfirmationSectionImpl.getTreeList("upsell_actions", FBPayConfirmationSectionImpl.UpsellActions.class);
        if (treeList != null) {
            C1366783w it = treeList.iterator();
            while (it.hasNext()) {
                TreeJNI treeJNI = (TreeJNI) it.next();
                AnonymousClass66P r2 = AnonymousClass66P.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                AnonymousClass66P r0 = (AnonymousClass66P) C86104wH.A0a(treeJNI, r2, "type");
                if (r0 == null || (name = r0.name()) == null) {
                    throw C18180wK.A0a("Required value was null.");
                }
                AnonymousClass66P r02 = (AnonymousClass66P) C86104wH.A0a(treeJNI, r2, "type");
                if (r02 == null || (name2 = r02.name()) == null) {
                    throw C18180wK.A0a("Required value was null.");
                }
                String stringValue = treeJNI.getStringValue("icon_name");
                if (stringValue != null) {
                    String A0g = C86164wN.A0g(treeJNI);
                    if (A0g != null) {
                        A0v.add(new ECPConfirmationUpsellAction(name, name2, stringValue, A0g, treeJNI.getStringValue("link_uri")));
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            }
            String stringValue2 = fBPayConfirmationSectionImpl.getStringValue("upsell_section_title");
            if (stringValue2 != null) {
                ECPConfirmationUpsellSection eCPConfirmationUpsellSection = new ECPConfirmationUpsellSection(stringValue2, A0v);
                String stringValue3 = fBPayConfirmationSectionImpl.getStringValue("cta_type");
                if (stringValue3 != null) {
                    return new ECPConfirmationConfiguration(eCPConfirmationUpsellSection, stringValue3);
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: com.facebook.pando.TreeJNI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: com.facebook.pando.TreeJNI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.facebook.pando.TreeJNI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: com.facebook.pando.TreeJNI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.84Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.84Y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.facebookpay.expresscheckout.models.ECPPaymentRequest A0E(com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation r30, com.facebookpay.expresscheckout.models.ECPPaymentRequest r31) {
        /*
            r14 = 0
            r15 = 1
            r12 = r31
            X.C04220Ms.A0B(r12, r15)
            r13 = r30
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$ReceiverInfo r1 = r13.A00()
            r11 = 0
            if (r1 == 0) goto L_0x00a4
            java.lang.Class<com.facebook.graphql.impls.FBPayReceiverInfoImpl> r0 = com.facebook.graphql.impls.FBPayReceiverInfoImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            if (r0 == 0) goto L_0x00a4
            java.lang.String r3 = X.C18220wO.A0m(r0)
        L_0x001c:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$ReceiverInfo r1 = r13.A00()
            if (r1 == 0) goto L_0x00a2
            java.lang.Class<com.facebook.graphql.impls.FBPayReceiverInfoImpl> r0 = com.facebook.graphql.impls.FBPayReceiverInfoImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            if (r0 == 0) goto L_0x00a2
            java.lang.String r2 = X.C18220wO.A0l(r0)
        L_0x002e:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$ReceiverInfo r1 = r13.A00()
            if (r1 == 0) goto L_0x00a0
            java.lang.Class<com.facebook.graphql.impls.FBPayReceiverInfoImpl> r0 = com.facebook.graphql.impls.FBPayReceiverInfoImpl.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r0)
            if (r1 == 0) goto L_0x00a0
            java.lang.String r0 = "image"
            java.lang.String r1 = r1.getStringValue(r0)
        L_0x0042:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r12.A05
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = r0.A00
        L_0x0048:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r10 = new com.facebookpay.expresscheckout.models.PaymentReceiverInfo
            r10.<init>(r3, r2, r1, r0)
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$TransactionInfo> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.TransactionInfo.class
            java.lang.String r0 = "transaction_info"
            com.facebook.pando.TreeJNI r1 = r13.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0065
            java.lang.Class<com.facebook.graphql.impls.FBPayTransactionInfoImpl> r0 = com.facebook.graphql.impls.FBPayTransactionInfoImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayTransactionInfoImpl r0 = (com.facebook.graphql.impls.FBPayTransactionInfoImpl) r0
            if (r0 == 0) goto L_0x0065
            com.facebookpay.expresscheckout.models.TransactionInfo r14 = A0H(r0)
        L_0x0065:
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$CheckoutScreenConfig> r5 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.CheckoutScreenConfig.class
            java.lang.String r3 = "checkout_screen_config"
            com.facebook.pando.TreeJNI r1 = r13.getTreeValue(r3, r5)
            if (r1 == 0) goto L_0x00a7
            java.lang.Class<com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl> r0 = com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            if (r0 == 0) goto L_0x00a7
            com.google.common.collect.ImmutableList r0 = X.AnonymousClass69P.A00(r0)
            if (r0 == 0) goto L_0x00a7
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r0.iterator()
        L_0x0085:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = r1.next()
            X.69P r0 = (X.AnonymousClass69P) r0
            X.C04220Ms.A04(r0)
            X.68M r0 = A06(r0)
            if (r0 == 0) goto L_0x0085
            r2.add(r0)
            goto L_0x0085
        L_0x009e:
            r0 = r11
            goto L_0x0048
        L_0x00a0:
            r1 = r11
            goto L_0x0042
        L_0x00a2:
            r2 = r11
            goto L_0x002e
        L_0x00a4:
            r3 = r11
            goto L_0x001c
        L_0x00a7:
            r4 = r11
            goto L_0x00ad
        L_0x00a9:
            java.util.Set r4 = X.AnonymousClass00J.A0c(r2)
        L_0x00ad:
            com.facebook.pando.TreeJNI r1 = r13.getTreeValue(r3, r5)
            if (r1 == 0) goto L_0x00e6
            java.lang.Class<com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl> r0 = com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl.class
            com.facebook.pando.TreeJNI r2 = r1.reinterpret(r0)
            if (r2 == 0) goto L_0x00e6
            X.1ze r1 = X.C29991ze.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "request_fields"
            com.google.common.collect.ImmutableList r0 = r2.getEnumList(r0, r1)
            if (r0 == 0) goto L_0x00e6
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r0.iterator()
        L_0x00cd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r1.next()
            X.1ze r0 = (X.C29991ze) r0
            X.C04220Ms.A04(r0)
            X.68F r0 = A07(r0)
            if (r0 == 0) goto L_0x00cd
            r2.add(r0)
            goto L_0x00cd
        L_0x00e6:
            r3 = r11
            goto L_0x00ec
        L_0x00e8:
            java.util.Set r3 = X.AnonymousClass00J.A0c(r2)
        L_0x00ec:
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$EmbeddedBloksApmButtons> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.EmbeddedBloksApmButtons.class
            java.lang.String r0 = "embedded_bloks_apm_buttons"
            com.facebook.pando.TreeJNI r2 = r13.getTreeValue(r0, r1)
            if (r2 == 0) goto L_0x0226
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$EmbeddedBloksApmButtons$Component> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.EmbeddedBloksApmButtons.Component.class
            java.lang.String r0 = "component"
            com.facebook.pando.TreeJNI r1 = r2.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0226
            java.lang.Class<com.facebook.graphql.impls.FBPayBloksComponentImpl> r0 = com.facebook.graphql.impls.FBPayBloksComponentImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            X.8q4 r0 = (X.C147878q4) r0
            if (r0 == 0) goto L_0x0226
            com.facebookpay.expresscheckout.models.APMConfiguration r9 = new com.facebookpay.expresscheckout.models.APMConfiguration
            r9.<init>(r0)
        L_0x010f:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r12.A01
            java.lang.String r16 = "Required value was null."
            if (r0 == 0) goto L_0x0222
            if (r9 != 0) goto L_0x0119
            com.facebookpay.expresscheckout.models.APMConfiguration r9 = r0.A00
        L_0x0119:
            java.util.Set<X.68M> r1 = r0.A0B
            X.84Y r2 = X.AnonymousClass84Y.A00
            java.util.Set r1 = X.AnonymousClass00J.A0f(r2, r1)
            if (r4 != 0) goto L_0x0124
            r4 = r2
        L_0x0124:
            java.util.Set r8 = X.AnonymousClass00J.A0f(r1, r4)
            java.util.Set<X.68F> r1 = r0.A0C
            java.util.Set r1 = X.AnonymousClass00J.A0f(r2, r1)
            if (r3 != 0) goto L_0x0131
            r3 = r2
        L_0x0131:
            java.util.Set r7 = X.AnonymousClass00J.A0f(r1, r3)
            java.lang.String r1 = r0.A0A
            r21 = r1
            java.lang.String r1 = r0.A08
            r20 = r1
            boolean r1 = r0.A0D
            r19 = r1
            X.67l r1 = r0.A01
            r18 = r1
            X.67l r6 = r0.A02
            java.lang.Boolean r5 = r0.A05
            java.lang.Boolean r4 = r0.A06
            java.lang.Boolean r3 = r0.A03
            java.lang.Boolean r2 = r0.A07
            java.lang.String r1 = r0.A09
            java.lang.Boolean r0 = r0.A04
            X.AnonymousClass0wJ.A1M(r8, r15, r7)
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r17 = new com.facebookpay.expresscheckout.models.CheckoutConfiguration
            r25 = r0
            r26 = r21
            r27 = r20
            r28 = r1
            r29 = r8
            r30 = r7
            r31 = r19
            r19 = r18
            r20 = r6
            r21 = r5
            r22 = r4
            r23 = r3
            r24 = r2
            r18 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x0177:
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r5 = r12.A03
            if (r5 == 0) goto L_0x017f
            com.facebookpay.common.models.CurrencyAmount r0 = r5.A00
            if (r0 != 0) goto L_0x01a1
        L_0x017f:
            if (r14 == 0) goto L_0x01a1
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$PaymentConfig> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.PaymentConfig.class
            java.lang.String r0 = "payment_config"
            com.facebook.pando.TreeJNI r1 = r13.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0220
            java.lang.Class<com.facebook.graphql.impls.FBPayPaymentConfigImpl> r0 = com.facebook.graphql.impls.FBPayPaymentConfigImpl.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayPaymentConfigImpl r1 = (com.facebook.graphql.impls.FBPayPaymentConfigImpl) r1
            if (r1 == 0) goto L_0x0220
            java.lang.String r0 = "order_id"
            java.lang.String r0 = r13.getStringValue(r0)
            if (r0 == 0) goto L_0x0229
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r5 = A0C(r1, r14, r0)
        L_0x01a1:
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$EcpCustomFields> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.EcpCustomFields.class
            java.lang.String r0 = "ecp_custom_fields"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r13, r1, r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x01ad:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01c7
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.facebook.pando.TreeJNI r2 = (com.facebook.pando.TreeJNI) r2
            X.66q r1 = X.C967766q.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "key"
            java.lang.Enum r1 = X.C86104wH.A0a(r2, r1, r0)
            X.66q r0 = X.C967766q.DEVELOPER_TOS_URI
            if (r1 != r0) goto L_0x01ad
            r11 = r3
        L_0x01c7:
            com.facebook.pando.TreeJNI r11 = (com.facebook.pando.TreeJNI) r11
            if (r11 == 0) goto L_0x01d9
            java.lang.String r0 = "value"
            java.lang.String r1 = r11.getStringValue(r0)
            if (r1 == 0) goto L_0x01d9
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r12.A04
            com.facebookpay.expresscheckout.models.ItemDetails r0 = r0.A09
            r0.A00 = r1
        L_0x01d9:
            java.lang.String r7 = r12.A0A
            java.lang.String r6 = r12.A08
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r4 = r12.A04
            java.lang.String r0 = "order_id"
            java.lang.String r21 = r13.getStringValue(r0)
            java.lang.String r3 = r12.A09
            int r2 = r12.A00
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$LoggingPolicy> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.LoggingPolicy.class
            java.lang.String r0 = "logging_policy"
            com.facebook.pando.TreeJNI r1 = r13.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0203
            java.lang.Class<com.facebook.graphql.impls.FBPayLoggingPolicyImpl> r0 = com.facebook.graphql.impls.FBPayLoggingPolicyImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayLoggingPolicyImpl r0 = (com.facebook.graphql.impls.FBPayLoggingPolicyImpl) r0
            if (r0 == 0) goto L_0x0203
            com.fbpay.logging.LoggingPolicy r1 = A0J(r0)
            if (r1 != 0) goto L_0x0205
        L_0x0203:
            com.fbpay.logging.LoggingPolicy r1 = r12.A06
        L_0x0205:
            com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration r0 = r12.A02
            r23 = 0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r11 = new com.facebookpay.expresscheckout.models.ECPPaymentRequest
            r12 = r17
            r13 = r0
            r14 = r5
            r15 = r4
            r16 = r10
            r17 = r1
            r18 = r7
            r19 = r6
            r20 = r3
            r22 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r11
        L_0x0220:
            r5 = r11
            goto L_0x01a1
        L_0x0222:
            r17 = r11
            goto L_0x0177
        L_0x0226:
            r9 = r11
            goto L_0x010f
        L_0x0229:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122157Kv.A0E(com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation, com.facebookpay.expresscheckout.models.ECPPaymentRequest):com.facebookpay.expresscheckout.models.ECPPaymentRequest");
    }

    public static final TransactionInfo A0G(FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.PaymentDetailsUpdates paymentDetailsUpdates, TransactionInfo transactionInfo) {
        String str;
        TreeJNI treeJNI;
        ShippingOptions shippingOptions;
        List list;
        ImmutableList stringList;
        String stringValue;
        String stringValue2;
        FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.PaymentDetailsUpdates paymentDetailsUpdates2 = paymentDetailsUpdates;
        C04220Ms.A0B(paymentDetailsUpdates2, 0);
        Class<FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.PaymentDetailsUpdates.PriceItems> cls = FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.PaymentDetailsUpdates.PriceItems.class;
        Class<FBPayECPPriceInfoImpl> cls2 = FBPayECPPriceInfoImpl.class;
        TreeJNI treeValue = ((TreeJNI) paymentDetailsUpdates2.getTreeList("price_items", cls).get(0)).reinterpret(cls2).getTreeValue("amount", FBPayECPPriceInfoImpl.Amount.class);
        if (treeValue != null) {
            str = treeValue.getStringValue("currency");
        } else {
            str = null;
        }
        if (str != null) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            ImmutableList treeList = paymentDetailsUpdates2.getTreeList("price_items", cls);
            if (treeList != null) {
                C1366783w it = treeList.iterator();
                while (it.hasNext()) {
                    FBPayECPPriceInfoImpl fBPayECPPriceInfoImpl = (FBPayECPPriceInfoImpl) ((TreeJNI) it.next()).reinterpret(cls2);
                    C04220Ms.A06(fBPayECPPriceInfoImpl);
                    A0P(fBPayECPPriceInfoImpl, A0v);
                }
                TreeJNI treeValue2 = paymentDetailsUpdates2.getTreeValue("shipping_options", FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.PaymentDetailsUpdates.ShippingOptions.class);
                if (treeValue2 != null) {
                    treeJNI = treeValue2.reinterpret(FBPayECPShippingOptionsFragmentImpl.class);
                } else {
                    treeJNI = null;
                }
                ArrayList A0v2 = AnonymousClass0wJ.A0v();
                if (treeJNI != null) {
                    C1366783w A0G = C18250wR.A0G(treeJNI, FBPayECPShippingOptionsFragmentImpl.ShippingOptions.class, "shipping_options");
                    while (A0G.hasNext()) {
                        TreeJNI reinterpret = ((TreeJNI) A0G.next()).reinterpret(FBPayECPShippingOptionFragmentImpl.class);
                        String A0X = C18250wR.A0X(reinterpret);
                        if (A0X != null) {
                            String lowerCase = String.valueOf(C86104wH.A0a(reinterpret, AnonymousClass66R.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "type")).toLowerCase();
                            C04220Ms.A06(lowerCase);
                            Integer A00 = C116886xi.A00(lowerCase);
                            String A0j = C86154wM.A0j(reinterpret);
                            if (A0j != null) {
                                Class<FBPayECPShippingOptionFragmentImpl.Price> cls3 = FBPayECPShippingOptionFragmentImpl.Price.class;
                                TreeJNI treeValue3 = reinterpret.getTreeValue("price", cls3);
                                if (treeValue3 == null || (stringValue = treeValue3.getStringValue("currency_code")) == null) {
                                    throw C18180wK.A0a("Required value was null.");
                                }
                                TreeJNI treeValue4 = reinterpret.getTreeValue("price", cls3);
                                if (treeValue4 == null || (stringValue2 = treeValue4.getStringValue("amount")) == null) {
                                    throw C18180wK.A0a("Required value was null.");
                                }
                                CurrencyAmount currencyAmount = new CurrencyAmount(stringValue, stringValue2);
                                String stringValue3 = reinterpret.getStringValue(DevServerEntity.COLUMN_DESCRIPTION);
                                if (stringValue3 != null) {
                                    A0v2.add(new ShippingOption(currencyAmount, A00, A0X, A0j, stringValue3));
                                } else {
                                    throw C18180wK.A0a("Required value was null.");
                                }
                            } else {
                                throw C18180wK.A0a("Required value was null.");
                            }
                        } else {
                            throw C18180wK.A0a("Required value was null.");
                        }
                    }
                    shippingOptions = new ShippingOptions(treeJNI.getStringValue(C18170wI.A00(974)), A0v2);
                } else {
                    shippingOptions = null;
                }
                TransactionInfo transactionInfo2 = transactionInfo;
                String str2 = transactionInfo2.A06;
                ArrayList<PriceInfo> arrayList = transactionInfo2.A08;
                PromoCodeList promoCodeList = transactionInfo2.A02;
                TreeJNI treeValue5 = paymentDetailsUpdates2.getTreeValue("offer_credential_ids", FBPayECPHandleCheckoutEventMutationResponseImpl.HandleCheckoutEvent.PaymentDetailsUpdates.OfferCredentialIds.class);
                if (treeValue5 == null || (stringList = treeValue5.getStringList("credential_ids")) == null) {
                    list = AnonymousClass0ZV.A00;
                } else {
                    list = AnonymousClass00J.A0N(stringList);
                }
                return new TransactionInfo((FulfillmentOptions) null, (PickupInfo) null, promoCodeList, shippingOptions, transactionInfo2.A05, (Integer) null, str, str2, transactionInfo2.A07, A0v, arrayList, list);
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public static final C40307LcE A0I(PaymentMethodComponentImpl.NewPaymentCredentialOptions newPaymentCredentialOptions) {
        C40307LcE lcE;
        C04220Ms.A0B(newPaymentCredentialOptions, 0);
        C40307LcE lcE2 = null;
        if (newPaymentCredentialOptions.A00() != null) {
            NewCreditCardOptionImpl A00 = newPaymentCredentialOptions.A00();
            if (A00 == null || (lcE2 = (C40307LcE) C86104wH.A0a(A00, C40307LcE.A07, "credential_type")) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
        } else if (newPaymentCredentialOptions.A01() != null) {
            NewPaypalBillingAgreementImpl A01 = newPaymentCredentialOptions.A01();
            if (A01 != null && (lcE = (C40307LcE) C86104wH.A0a(A01, C40307LcE.A07, "credential_type")) != null) {
                return lcE;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        return lcE2;
    }

    public static final boolean A0Q(CheckoutSetupMutationResponseImpl checkoutSetupMutationResponseImpl) {
        CheckoutSetupMutationResponseImpl.CheckoutSetupMutation A00;
        TreeJNI A0K;
        TreeJNI reinterpret;
        CheckoutSetupMutationResponseImpl.CheckoutSetupMutation A002;
        TreeJNI treeValue;
        TreeJNI reinterpret2;
        ImmutableList<Object> A003;
        if (checkoutSetupMutationResponseImpl == null || (A00 = checkoutSetupMutationResponseImpl.A00()) == null || (A0K = C86164wN.A0K(A00)) == null || (reinterpret = A0K.reinterpret(FBPayECPAvailabilityImpl.class)) == null || !reinterpret.getBooleanValue("is_ecp_available") || (A002 = checkoutSetupMutationResponseImpl.A00()) == null || (treeValue = A002.getTreeValue("checkout_screen_config", CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.CheckoutScreenConfig.class)) == null || (reinterpret2 = treeValue.reinterpret(FBPayCheckoutScreenConfigImpl.class)) == null || (A003 = AnonymousClass69P.A00(reinterpret2)) == null) {
            return false;
        }
        AnonymousClass69P r2 = AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION;
        for (Object obj : A003) {
            if (obj == r2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A0R(ECPPaymentRequest eCPPaymentRequest, AnonymousClass69P r8) {
        Set<AnonymousClass68M> set;
        AnonymousClass68M r0;
        boolean z;
        AnonymousClass68F r02;
        C04220Ms.A0B(eCPPaymentRequest, 0);
        C04220Ms.A0B(r8, 1);
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        Set<AnonymousClass68F> set2 = null;
        if (checkoutConfiguration != null) {
            set = checkoutConfiguration.A0B;
            set2 = checkoutConfiguration.A0C;
        } else {
            set = null;
        }
        int ordinal = r8.ordinal();
        if (ordinal != 23) {
            if (ordinal != 24) {
                if (ordinal != 10) {
                    if (ordinal == 5) {
                        z = false;
                        if (set2 == null) {
                            return false;
                        }
                        if (!set2.contains(AnonymousClass68F.REQUEST_PAYER_NAME) && !set2.contains(AnonymousClass68F.REQUEST_PAYER_EMAIL)) {
                            r02 = AnonymousClass68F.REQUEST_PAYER_PHONE;
                        }
                        return true;
                    } else if (ordinal != 21) {
                        if (ordinal != 19) {
                            return true;
                        }
                        z = false;
                        if (set2 == null) {
                            return false;
                        }
                        if (!set2.contains(AnonymousClass68F.REQUEST_PICKUP_NAME) && !set2.contains(AnonymousClass68F.REQUEST_PICKUP_EMAIL)) {
                            r02 = AnonymousClass68F.REQUEST_PICKUP_PHONE;
                        }
                        return true;
                    } else if (set == null) {
                        return false;
                    } else {
                        r0 = AnonymousClass68M.UX_PROMO_CODE;
                    }
                    if (set2.contains(r02)) {
                        return true;
                    }
                    return z;
                } else if (checkoutConfiguration != null && C18190wL.A1Z(checkoutConfiguration.A05, true)) {
                    return true;
                } else {
                    if (set == null || !set.contains(AnonymousClass68M.UX_INCENTIVES)) {
                        return false;
                    }
                    return true;
                }
            } else if (set == null) {
                return false;
            } else {
                r0 = AnonymousClass68M.UX_FULFILLMENT_OPTIONS;
            }
        } else if (set == null) {
            return false;
        } else {
            r0 = AnonymousClass68M.UX_SHIPPING_ADDRESS;
        }
        return set.contains(r0);
    }

    public static final GQLCallInputCInputShape1S0000000 A01(ECPPaymentResponseParams eCPPaymentResponseParams, String str) {
        GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000;
        String str2;
        CurrencyAmount currencyAmount;
        String str3;
        String str4;
        ShippingAddress shippingAddress = eCPPaymentResponseParams.A06;
        GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S00000002 = null;
        if (shippingAddress == null || (str4 = shippingAddress.A04) == null) {
            gQLCallInputCInputShape0S0000000 = null;
        } else {
            gQLCallInputCInputShape0S0000000 = GraphQlCallInput.A00();
            gQLCallInputCInputShape0S0000000.A0B(A00(shippingAddress), "address");
            gQLCallInputCInputShape0S0000000.A0F(str4, "address_id");
        }
        GQLCallInputCInputShape0S0000000 A00 = GraphQlCallInput.A00();
        String str5 = eCPPaymentResponseParams.A0F;
        if (str5 != null) {
            A00.A0F(str5, "payer_name");
        }
        String str6 = eCPPaymentResponseParams.A0E;
        if (str6 != null) {
            A00.A0F(str6, "payer_email");
        }
        String str7 = eCPPaymentResponseParams.A0G;
        if (str7 != null) {
            A00.A0F(str7, "payer_phone");
        }
        if (gQLCallInputCInputShape0S0000000 != null) {
            A00.A0B(gQLCallInputCInputShape0S0000000, "shipping_address_details");
        }
        ShippingOption shippingOption = eCPPaymentResponseParams.A01;
        if (shippingOption != null) {
            GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
            A002.A0F(shippingOption.A03, "id");
            int intValue = shippingOption.A01.intValue();
            if (intValue == 0) {
                str3 = "SHIPPING";
            } else if (intValue != 1) {
                str3 = "PICKUP";
            } else {
                str3 = OffsiteShippingType$Companion.DELIVERY;
            }
            A002.A0F(str3, "type");
            A002.A0F(shippingOption.A04, "label");
            GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
            CurrencyAmount currencyAmount2 = shippingOption.A00;
            A003.A0F(currencyAmount2.A01, "amount");
            A003.A0F(currencyAmount2.A00, "currency_code");
            A002.A0B(A003, "price");
            A002.A0F(shippingOption.A02, DevServerEntity.COLUMN_DESCRIPTION);
            A00.A0B(A002, "selected_shipping_option");
        }
        FulfillmentOption fulfillmentOption = eCPPaymentResponseParams.A00;
        if (fulfillmentOption != null) {
            GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
            A004.A0F(fulfillmentOption.A00(), "id");
            boolean z = fulfillmentOption instanceof FulfillmentPickupOption;
            if (z) {
                str2 = ((FulfillmentPickupOption) fulfillmentOption).A04;
            } else {
                str2 = fulfillmentOption.A01;
            }
            A004.A0F(str2, "label");
            GQLCallInputCInputShape0S0000000 A005 = GraphQlCallInput.A00();
            if (z) {
                currencyAmount = ((FulfillmentPickupOption) fulfillmentOption).A00;
            } else {
                currencyAmount = fulfillmentOption.A00;
            }
            A005.A0F(currencyAmount.A01, "amount");
            A005.A0F(currencyAmount.A00, "currency_code");
            A004.A0B(A005, "price");
            A00.A0B(A004, "selected_shipping_option");
        }
        A00.A0D("email_optin_checkbox_value", Boolean.valueOf(eCPPaymentResponseParams.A0R));
        GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
        A0L.A0D(eCPPaymentResponseParams.A0P, AnonymousClass7C5.A00(21, 10, 59));
        GQLCallInputCInputShape0S0000000 A006 = GraphQlCallInput.A00();
        if (str == null) {
            str = eCPPaymentResponseParams.A0D;
        }
        A006.A0F(str, "order_id");
        A006.A0F(eCPPaymentResponseParams.A0N, "receiver_id");
        A006.A0F(eCPPaymentResponseParams.A0M, "product_id");
        A006.A0F(eCPPaymentResponseParams.A0O, TraceFieldType.RequestID);
        A006.A0F(eCPPaymentResponseParams.A0A, "payment_container_id");
        A006.A0B(A00, "return_fields");
        A0L.A0A("submit_payment_container_input_list", C18180wK.A0n(A006));
        AnonymousClass73F.A00(A0L);
        OtcInput otcInput = eCPPaymentResponseParams.A04;
        if (otcInput != null) {
            gQLCallInputCInputShape0S00000002 = C116936xr.A00(otcInput);
        }
        A0L.A0B(gQLCallInputCInputShape0S00000002, "one_time_checkout_input");
        return A0L;
    }

    public static final CurrencyAmount A02(CurrencyAmount currencyAmount, AnonymousClass7Kx r7) {
        ArrayList<PriceInfo> arrayList;
        float parseFloat = Float.parseFloat(currencyAmount.A01);
        TransactionInfo transactionInfo = (TransactionInfo) r7.A01;
        if (!(transactionInfo == null || (arrayList = transactionInfo.A09) == null)) {
            ArrayList<PriceInfo> A0v = AnonymousClass0wJ.A0v();
            Iterator<PriceInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                PriceInfo next = it.next();
                if (next.A01 == C973068v.DISCOUNT) {
                    A0v.add(next);
                }
            }
            ArrayList A0w = AnonymousClass0wJ.A0w(A0v);
            for (PriceInfo priceInfo : A0v) {
                parseFloat -= Float.parseFloat(priceInfo.A00.A01);
                A0w.add(Unit.A00);
            }
        }
        return new CurrencyAmount(currencyAmount.A00, String.valueOf(parseFloat));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r2 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r2 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.common.models.CurrencyAmount A03(com.facebookpay.expresscheckout.models.TransactionInfo r5) {
        /*
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r0 = r5.A09
            r4 = 0
            if (r0 == 0) goto L_0x0025
            java.util.Iterator r3 = r0.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0023
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebookpay.expresscheckout.models.PriceInfo r0 = (com.facebookpay.expresscheckout.models.PriceInfo) r0
            X.68v r1 = r0.A01
            X.68v r0 = X.C973068v.TOTAL
            if (r1 != r0) goto L_0x0009
        L_0x001c:
            com.facebookpay.expresscheckout.models.PriceInfo r2 = (com.facebookpay.expresscheckout.models.PriceInfo) r2
            if (r2 == 0) goto L_0x0025
        L_0x0020:
            com.facebookpay.common.models.CurrencyAmount r0 = r2.A00
            return r0
        L_0x0023:
            r2 = r4
            goto L_0x001c
        L_0x0025:
            java.util.ArrayList<com.facebookpay.expresscheckout.models.PriceInfo> r0 = r5.A08
            if (r0 == 0) goto L_0x0047
            java.util.Iterator r3 = r0.iterator()
        L_0x002d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebookpay.expresscheckout.models.PriceInfo r0 = (com.facebookpay.expresscheckout.models.PriceInfo) r0
            X.68v r1 = r0.A01
            X.68v r0 = X.C973068v.TOTAL
            if (r1 != r0) goto L_0x002d
            r4 = r2
        L_0x0041:
            r2 = r4
            com.facebookpay.expresscheckout.models.PriceInfo r2 = (com.facebookpay.expresscheckout.models.PriceInfo) r2
            if (r2 == 0) goto L_0x0047
            goto L_0x0020
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122157Kv.A03(com.facebookpay.expresscheckout.models.TransactionInfo):com.facebookpay.common.models.CurrencyAmount");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        if (r13 == null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        if (r7 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        r0 = r7.A06;
        r6 = X.AnonymousClass0wJ.A0x(r0, 10);
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        if (r1.hasNext() == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a1, code lost:
        r6.add(r1.next().name());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
        r14 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        if (r14 != null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        r14 = X.C86134wK.A0T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b9, code lost:
        r0 = r5.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bb, code lost:
        if (r0 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bd, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bf, code lost:
        if (r1 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c1, code lost:
        r1 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d6, code lost:
        return new X.C121207Et(r9, r10, r11, r12, r13, r14, r15, r16, r4, r2, r3, r1, r20, (java.lang.String) null, r5.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ X.C121207Et A04(com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r17, com.facebookpay.expresscheckout.models.ECPPaymentRequest r18, com.facebookpay.otc.models.OtcInput r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23) {
        /*
            r3 = r22
            r10 = r17
            r11 = r19
            r16 = r21
            r0 = r23 & 2
            r22 = 0
            if (r0 == 0) goto L_0x0010
            r16 = r22
        L_0x0010:
            r0 = r23 & 4
            if (r0 == 0) goto L_0x0016
            r11 = r22
        L_0x0016:
            r0 = r23 & 8
            if (r0 == 0) goto L_0x001c
            r10 = r22
        L_0x001c:
            r0 = r23 & 16
            if (r0 == 0) goto L_0x0022
            java.lang.String r3 = "REGULAR"
        L_0x0022:
            r0 = 0
            r5 = r18
            X.C18190wL.A1S(r5, r0, r3)
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r7 = r5.A03
            if (r7 == 0) goto L_0x0082
            com.facebookpay.common.models.CurrencyAmount r0 = r7.A00
            if (r0 == 0) goto L_0x0082
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A00
            if (r2 == 0) goto L_0x0082
            if (r1 == 0) goto L_0x0082
            com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000 r9 = com.facebook.graphql.calls.GraphQlCallInput.A00()
            java.lang.String r0 = "amount"
            r9.A0F(r2, r0)
            java.lang.String r0 = "currency_code"
            r9.A0F(r1, r0)
        L_0x0046:
            java.lang.String r15 = r5.A0A
            if (r16 != 0) goto L_0x0050
            java.util.concurrent.atomic.AtomicLong r0 = X.AnonymousClass73F.A00
            java.lang.String r16 = X.C86124wJ.A0y(r0)
        L_0x0050:
            java.lang.String r4 = r5.A08
            com.google.common.collect.ImmutableList r12 = X.C86134wK.A0T()
            if (r7 == 0) goto L_0x005e
            X.68b r0 = r7.A02
            java.lang.String r2 = r0.A00
            if (r2 != 0) goto L_0x0062
        L_0x005e:
            X.68b r0 = X.C971368b.LIVE
            java.lang.String r2 = r0.A00
        L_0x0062:
            r6 = 10
            if (r7 == 0) goto L_0x008b
            java.util.ArrayList<X.692> r0 = r7.A07
            java.util.ArrayList r8 = X.AnonymousClass0wJ.A0x(r0, r6)
            java.util.Iterator r1 = r0.iterator()
        L_0x0070:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r1.next()
            X.692 r0 = (X.AnonymousClass692) r0
            java.lang.String r0 = r0.A00
            r8.add(r0)
            goto L_0x0070
        L_0x0082:
            r9 = r22
            goto L_0x0046
        L_0x0085:
            com.google.common.collect.ImmutableList r13 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r8)
            if (r13 != 0) goto L_0x0091
        L_0x008b:
            com.google.common.collect.ImmutableList r13 = X.C86134wK.A0T()
            if (r7 == 0) goto L_0x00b5
        L_0x0091:
            java.util.ArrayList<X.67H> r0 = r7.A06
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0x(r0, r6)
            java.util.Iterator r1 = r0.iterator()
        L_0x009b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r0 = r1.next()
            X.67H r0 = (X.AnonymousClass67H) r0
            java.lang.String r0 = r0.name()
            r6.add(r0)
            goto L_0x009b
        L_0x00af:
            com.google.common.collect.ImmutableList r14 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r6)
            if (r14 != 0) goto L_0x00b9
        L_0x00b5:
            com.google.common.collect.ImmutableList r14 = X.C86134wK.A0T()
        L_0x00b9:
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r0 = r5.A05
            if (r0 == 0) goto L_0x00d7
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto L_0x00c3
            java.lang.String r1 = r0.A02
        L_0x00c3:
            java.lang.String r0 = r5.A07
            X.7Et r8 = new X.7Et
            r21 = r20
            r20 = r1
            r23 = r0
            r19 = r3
            r18 = r2
            r17 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r8
        L_0x00d7:
            r1 = r22
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122157Kv.A04(com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000, com.facebookpay.expresscheckout.models.ECPPaymentRequest, com.facebookpay.otc.models.OtcInput, java.lang.String, java.lang.String, java.lang.String, int):X.7Et");
    }

    public static final C121207Et A05(ECPAvailabilityRequestParams eCPAvailabilityRequestParams, String str) {
        String str2;
        ECPAvailabilityRequestParams eCPAvailabilityRequestParams2 = eCPAvailabilityRequestParams;
        String str3 = eCPAvailabilityRequestParams2.A06;
        String str4 = eCPAvailabilityRequestParams2.A04;
        String str5 = eCPAvailabilityRequestParams2.A03;
        ImmutableList A0T = C86134wK.A0T();
        ECPPaymentConfiguration eCPPaymentConfiguration = eCPAvailabilityRequestParams2.A00;
        String str6 = eCPPaymentConfiguration.A02.A00;
        ArrayList<AnonymousClass692> arrayList = eCPPaymentConfiguration.A07;
        ArrayList A0x = AnonymousClass0wJ.A0x(arrayList, 10);
        Iterator<AnonymousClass692> it = arrayList.iterator();
        while (it.hasNext()) {
            A0x.add(it.next().A00);
        }
        ImmutableList A0S = C18220wO.A0S(A0x);
        ArrayList<AnonymousClass67H> arrayList2 = eCPPaymentConfiguration.A06;
        ArrayList A0x2 = AnonymousClass0wJ.A0x(arrayList2, 10);
        Iterator<AnonymousClass67H> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            A0x2.add(it2.next().name());
        }
        ImmutableList A0S2 = C18220wO.A0S(A0x2);
        GQLCallInputCInputShape0S0000000 A00 = GraphQlCallInput.A00();
        CurrencyAmount currencyAmount = eCPPaymentConfiguration.A00;
        String str7 = null;
        if (currencyAmount != null) {
            str2 = currencyAmount.A01;
        } else {
            str2 = null;
        }
        A00.A0F(str2, "amount");
        if (currencyAmount != null) {
            str7 = currencyAmount.A00;
        }
        A00.A0F(str7, "currency_code");
        return new C121207Et(A00, (GQLCallInputCInputShape0S0000000) null, (OtcInput) null, A0T, A0S, A0S2, str3, str4, str5, str6, "REGULAR", eCPAvailabilityRequestParams2.A01.A02, (String) null, str, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r4 == null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.expresscheckout.models.ECPPaymentConfiguration A0C(com.facebook.graphql.impls.FBPayPaymentConfigImpl r9, com.facebookpay.expresscheckout.models.TransactionInfo r10, java.lang.String r11) {
        /*
            X.66Y r1 = X.AnonymousClass66Y.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "payment_mode"
            java.lang.Enum r0 = X.C86104wH.A0a(r9, r1, r0)
            X.66Y r0 = (X.AnonymousClass66Y) r0
            if (r0 == 0) goto L_0x001a
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0053
            r0 = 2
            if (r1 != r0) goto L_0x0053
            X.68b r4 = X.C971368b.TEST
        L_0x0018:
            if (r4 != 0) goto L_0x001c
        L_0x001a:
            X.68b r4 = X.C971368b.LIVE
        L_0x001c:
            java.lang.String r0 = "security_origin"
            java.lang.String r6 = r9.getStringValue(r0)
            X.66X r1 = X.AnonymousClass66X.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "payment_action_types"
            com.google.common.collect.ImmutableList r0 = r9.getEnumList(r0, r1)
            X.C04220Ms.A06(r0)
            java.util.ArrayList r7 = A0M(r0)
            if (r10 == 0) goto L_0x0051
            com.facebookpay.common.models.CurrencyAmount r2 = A03(r10)
        L_0x0037:
            X.66Z r1 = X.AnonymousClass66Z.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "supported_container_types"
            com.google.common.collect.ImmutableList r0 = r9.getEnumList(r0, r1)
            X.C04220Ms.A06(r0)
            java.util.ArrayList r8 = A0L(r0)
            r3 = 0
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r1 = new com.facebookpay.expresscheckout.models.ECPPaymentConfiguration
            r5 = r11
            r9 = r3
            r10 = r3
            r11 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        L_0x0051:
            r2 = 0
            goto L_0x0037
        L_0x0053:
            X.68b r4 = X.C971368b.LIVE
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122157Kv.A0C(com.facebook.graphql.impls.FBPayPaymentConfigImpl, com.facebookpay.expresscheckout.models.TransactionInfo, java.lang.String):com.facebookpay.expresscheckout.models.ECPPaymentConfiguration");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.facebook.pando.TreeJNI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.facebook.pando.TreeJNI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.facebook.pando.TreeJNI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.facebook.pando.TreeJNI} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.expresscheckout.models.ECPPaymentRequest A0D(com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation r17, com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration r18, com.facebookpay.expresscheckout.models.EcpUIConfiguration r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
        /*
            r4 = r20
            r3 = r21
            r12 = r18
            X.AnonymousClass0wJ.A1O(r4, r3)
            r0 = 3
            r14 = r19
            r2 = r22
            X.C18190wL.A1S(r2, r0, r14)
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$CheckoutScreenConfig> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.CheckoutScreenConfig.class
            java.lang.String r0 = "checkout_screen_config"
            r6 = r17
            com.facebook.pando.TreeJNI r1 = r6.getTreeValue(r0, r1)
            java.lang.String r9 = "Required value was null."
            if (r1 == 0) goto L_0x013e
            java.lang.Class<com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl> r0 = com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl r0 = (com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl) r0
            X.C04220Ms.A06(r0)
            r7 = 0
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r11 = A08(r0)
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$TransactionInfo> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.TransactionInfo.class
            java.lang.String r0 = "transaction_info"
            com.facebook.pando.TreeJNI r1 = r6.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0139
            java.lang.Class<com.facebook.graphql.impls.FBPayTransactionInfoImpl> r0 = com.facebook.graphql.impls.FBPayTransactionInfoImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayTransactionInfoImpl r0 = (com.facebook.graphql.impls.FBPayTransactionInfoImpl) r0
            X.C04220Ms.A06(r0)
            com.facebookpay.expresscheckout.models.TransactionInfo r8 = A0H(r0)
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$PaymentConfig> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.PaymentConfig.class
            java.lang.String r0 = "payment_config"
            com.facebook.pando.TreeJNI r1 = r6.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0134
            java.lang.Class<com.facebook.graphql.impls.FBPayPaymentConfigImpl> r0 = com.facebook.graphql.impls.FBPayPaymentConfigImpl.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayPaymentConfigImpl r1 = (com.facebook.graphql.impls.FBPayPaymentConfigImpl) r1
            X.C04220Ms.A06(r1)
            java.lang.String r5 = "order_id"
            java.lang.String r0 = r6.getStringValue(r5)
            if (r0 == 0) goto L_0x012f
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r13 = A0C(r1, r8, r0)
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$LoggingPolicy> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.LoggingPolicy.class
            java.lang.String r0 = "logging_policy"
            com.facebook.pando.TreeJNI r1 = r6.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x012b
            java.lang.Class<com.facebook.graphql.impls.FBPayLoggingPolicyImpl> r0 = com.facebook.graphql.impls.FBPayLoggingPolicyImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayLoggingPolicyImpl r0 = (com.facebook.graphql.impls.FBPayLoggingPolicyImpl) r0
            if (r0 == 0) goto L_0x012b
            com.fbpay.logging.LoggingPolicy r16 = A0J(r0)
        L_0x0081:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$ReceiverInfo r1 = r6.A00()
            if (r1 == 0) goto L_0x0128
            java.lang.Class<com.facebook.graphql.impls.FBPayReceiverInfoImpl> r0 = com.facebook.graphql.impls.FBPayReceiverInfoImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r9 = X.C18220wO.A0m(r0)
        L_0x0093:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$ReceiverInfo r1 = r6.A00()
            if (r1 == 0) goto L_0x0125
            java.lang.Class<com.facebook.graphql.impls.FBPayReceiverInfoImpl> r0 = com.facebook.graphql.impls.FBPayReceiverInfoImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            if (r0 == 0) goto L_0x0125
            java.lang.String r8 = X.C18220wO.A0l(r0)
        L_0x00a5:
            com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$ReceiverInfo r1 = r6.A00()
            if (r1 == 0) goto L_0x0123
            java.lang.Class<com.facebook.graphql.impls.FBPayReceiverInfoImpl> r0 = com.facebook.graphql.impls.FBPayReceiverInfoImpl.class
            com.facebook.pando.TreeJNI r1 = r1.reinterpret(r0)
            if (r1 == 0) goto L_0x0123
            java.lang.String r0 = "image"
            java.lang.String r1 = r1.getStringValue(r0)
        L_0x00b9:
            r0 = 0
            com.facebookpay.expresscheckout.models.PaymentReceiverInfo r15 = new com.facebookpay.expresscheckout.models.PaymentReceiverInfo
            r15.<init>(r9, r8, r1, r0)
            if (r18 != 0) goto L_0x00d7
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$ConfirmationSection> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.ConfirmationSection.class
            java.lang.String r0 = "confirmation_section"
            com.facebook.pando.TreeJNI r1 = r6.getTreeValue(r0, r1)
            if (r1 == 0) goto L_0x0121
            java.lang.Class<com.facebook.graphql.impls.FBPayConfirmationSectionImpl> r0 = com.facebook.graphql.impls.FBPayConfirmationSectionImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayConfirmationSectionImpl r0 = (com.facebook.graphql.impls.FBPayConfirmationSectionImpl) r0
        L_0x00d3:
            com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration r12 = A0A(r0)
        L_0x00d7:
            java.lang.Class<com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation$EcpCustomFields> r1 = com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.EcpCustomFields.class
            java.lang.String r0 = "ecp_custom_fields"
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r6, r1, r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x00e3:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r9 = r10.next()
            r8 = r9
            com.facebook.pando.TreeJNI r8 = (com.facebook.pando.TreeJNI) r8
            X.66q r1 = X.C967766q.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "key"
            java.lang.Enum r1 = X.C86104wH.A0a(r8, r1, r0)
            X.66q r0 = X.C967766q.DEVELOPER_TOS_URI
            if (r1 != r0) goto L_0x00e3
            r7 = r9
        L_0x00fd:
            com.facebook.pando.TreeJNI r7 = (com.facebook.pando.TreeJNI) r7
            if (r7 == 0) goto L_0x010d
            java.lang.String r0 = "value"
            java.lang.String r1 = r7.getStringValue(r0)
            if (r1 == 0) goto L_0x010d
            com.facebookpay.expresscheckout.models.ItemDetails r0 = r14.A09
            r0.A00 = r1
        L_0x010d:
            java.lang.String r20 = r6.getStringValue(r5)
            r21 = 0
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r10 = new com.facebookpay.expresscheckout.models.ECPPaymentRequest
            r22 = r21
            r19 = r3
            r18 = r2
            r17 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r10
        L_0x0121:
            r0 = r7
            goto L_0x00d3
        L_0x0123:
            r1 = r7
            goto L_0x00b9
        L_0x0125:
            r8 = r7
            goto L_0x00a5
        L_0x0128:
            r9 = r7
            goto L_0x0093
        L_0x012b:
            r16 = r7
            goto L_0x0081
        L_0x012f:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0134:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x0139:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        L_0x013e:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122157Kv.A0D(com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl$CheckoutSetupMutation, com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration, com.facebookpay.expresscheckout.models.EcpUIConfiguration, java.lang.String, java.lang.String, java.lang.String):com.facebookpay.expresscheckout.models.ECPPaymentRequest");
    }

    public static final ECPPaymentRequest A0F(C110606ly r29, ECPPaymentRequest eCPPaymentRequest, TransactionInfo transactionInfo) {
        String str;
        AnonymousClass84Y r4;
        AnonymousClass84Y r3;
        CheckoutConfiguration checkoutConfiguration;
        C110606ly r14 = r29;
        FBPayReceiverInfoImpl fBPayReceiverInfoImpl = r14.A04;
        String A0m = C18220wO.A0m(fBPayReceiverInfoImpl);
        String A0l = C18220wO.A0l(fBPayReceiverInfoImpl);
        String stringValue = fBPayReceiverInfoImpl.getStringValue("image");
        ECPPaymentRequest eCPPaymentRequest2 = eCPPaymentRequest;
        PaymentReceiverInfo paymentReceiverInfo = eCPPaymentRequest2.A05;
        APMConfiguration aPMConfiguration = null;
        if (paymentReceiverInfo != null) {
            str = paymentReceiverInfo.A00;
        } else {
            str = null;
        }
        PaymentReceiverInfo paymentReceiverInfo2 = new PaymentReceiverInfo(A0m, A0l, stringValue, str);
        FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl = r14.A00;
        ImmutableList A00 = AnonymousClass69P.A00(fBPayCheckoutScreenConfigImpl);
        if (A00 != null) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                AnonymousClass69P r0 = (AnonymousClass69P) it.next();
                C04220Ms.A04(r0);
                AnonymousClass68M A06 = A06(r0);
                if (A06 != null) {
                    A0v.add(A06);
                }
            }
            r4 = AnonymousClass00J.A0c(A0v);
        } else {
            r4 = null;
        }
        ImmutableList enumList = fBPayCheckoutScreenConfigImpl.getEnumList("request_fields", C29991ze.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (enumList != null) {
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            Iterator it2 = enumList.iterator();
            while (it2.hasNext()) {
                C29991ze r02 = (C29991ze) it2.next();
                C04220Ms.A04(r02);
                AnonymousClass68F A07 = A07(r02);
                if (A07 != null) {
                    A0v2.add(A07);
                }
            }
            r3 = AnonymousClass00J.A0c(A0v2);
        } else {
            r3 = null;
        }
        CheckoutConfiguration checkoutConfiguration2 = eCPPaymentRequest2.A01;
        if (checkoutConfiguration2 != null) {
            APMConfiguration aPMConfiguration2 = checkoutConfiguration2.A00;
            if (aPMConfiguration2 == null) {
                C147878q4 r1 = r14.A05;
                if (r1 != null) {
                    aPMConfiguration = new APMConfiguration(r1);
                }
            } else {
                aPMConfiguration = aPMConfiguration2;
            }
            Set<AnonymousClass68M> set = checkoutConfiguration2.A0B;
            AnonymousClass84Y r2 = AnonymousClass84Y.A00;
            Set A0f = AnonymousClass00J.A0f(r2, set);
            if (r4 == null) {
                r4 = r2;
            }
            Set A0f2 = AnonymousClass00J.A0f(A0f, r4);
            Set A0f3 = AnonymousClass00J.A0f(r2, checkoutConfiguration2.A0C);
            if (r3 == null) {
                r3 = r2;
            }
            Set A0f4 = AnonymousClass00J.A0f(A0f3, r3);
            String str2 = checkoutConfiguration2.A08;
            boolean z = checkoutConfiguration2.A0D;
            String str3 = checkoutConfiguration2.A0A;
            C969767l r7 = checkoutConfiguration2.A01;
            C969767l r6 = checkoutConfiguration2.A02;
            Boolean bool = checkoutConfiguration2.A05;
            Boolean bool2 = checkoutConfiguration2.A06;
            Boolean bool3 = checkoutConfiguration2.A03;
            Boolean bool4 = checkoutConfiguration2.A07;
            String str4 = checkoutConfiguration2.A09;
            Boolean bool5 = checkoutConfiguration2.A04;
            AnonymousClass0wJ.A1O(A0f2, A0f4);
            APMConfiguration aPMConfiguration3 = aPMConfiguration;
            C969767l r18 = r7;
            checkoutConfiguration = new CheckoutConfiguration(aPMConfiguration3, r18, r6, bool, bool2, bool3, bool4, bool5, str3, str2, str4, A0f2, A0f4, z);
        } else {
            checkoutConfiguration = null;
        }
        ECPPaymentConfiguration eCPPaymentConfiguration = eCPPaymentRequest2.A03;
        if (eCPPaymentConfiguration == null) {
            FBPayPaymentConfigImpl fBPayPaymentConfigImpl = r14.A03;
            TransactionInfo transactionInfo2 = transactionInfo;
            if (transactionInfo != null) {
                String str5 = eCPPaymentRequest2.A07;
                if (str5 != null) {
                    eCPPaymentConfiguration = A0C(fBPayPaymentConfigImpl, transactionInfo2, str5);
                } else {
                    throw C18180wK.A0a("Required value was null.");
                }
            } else {
                throw C18180wK.A0a("Required value was null.");
            }
        }
        String str6 = eCPPaymentRequest2.A0A;
        String str7 = eCPPaymentRequest2.A08;
        EcpUIConfiguration ecpUIConfiguration = eCPPaymentRequest2.A04;
        String str8 = eCPPaymentRequest2.A07;
        return new ECPPaymentRequest(checkoutConfiguration, eCPPaymentRequest2.A02, eCPPaymentConfiguration, ecpUIConfiguration, paymentReceiverInfo2, eCPPaymentRequest2.A06, str6, str7, eCPPaymentRequest2.A09, str8, eCPPaymentRequest2.A00, false);
    }

    public static final LoggingPolicy A0J(FBPayLoggingPolicyImpl fBPayLoggingPolicyImpl) {
        String stringValue = fBPayLoggingPolicyImpl.getStringValue("logging_policy_product");
        if (stringValue == null) {
            return null;
        }
        ImmutableList A0P = C18230wP.A0P(fBPayLoggingPolicyImpl, FBPayLoggingPolicyImpl.ClientSuppressionPolicy.class, "client_suppression_policy");
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = A0P.iterator();
        while (it.hasNext()) {
            TreeJNI A0G = C18210wN.A0G(it);
            AnonymousClass67J r3 = (AnonymousClass67J) C86104wH.A0a(A0G, AnonymousClass67J.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "suppression_mode");
            if (r3 != null) {
                A0v.add(new ClientSuppressionPolicy(r3, (C40304LcA) C86104wH.A0a(A0G, C40304LcA.A01, "payload_field"), A0G.getStringValue("event_name")));
            }
        }
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        AnonymousClass00J.A0h(A0v, A0v2);
        return new LoggingPolicy(stringValue, A0v2);
    }

    public static String A0K(TreeJNI treeJNI, ECPRepositoryImpl eCPRepositoryImpl, String str) {
        ImmutableList enumList = treeJNI.getEnumList("optional_fields", AnonymousClass69P.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C04220Ms.A06(enumList);
        Set A0N = A0N(enumList);
        ImmutableList enumList2 = treeJNI.getEnumList("request_fields", C29991ze.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C04220Ms.A06(enumList2);
        if (eCPRepositoryImpl.A0A(str, A0N, A0O(enumList2))) {
            return "NUX";
        }
        return "PUX";
    }

    public static final void A0P(FBPayECPPriceInfoImpl fBPayECPPriceInfoImpl, ArrayList arrayList) {
        String str;
        String stringValue;
        AnonymousClass23V r5;
        Class<FBPayECPPriceInfoImpl.Amount> cls = FBPayECPPriceInfoImpl.Amount.class;
        TreeJNI treeValue = fBPayECPPriceInfoImpl.getTreeValue("amount", cls);
        if (treeValue != null) {
            str = treeValue.getStringValue("currency");
        } else {
            str = null;
        }
        if (str != null) {
            TreeJNI treeValue2 = fBPayECPPriceInfoImpl.getTreeValue("amount", cls);
            if (treeValue2 == null || (stringValue = treeValue2.getStringValue("amount")) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            CurrencyAmount currencyAmount = new CurrencyAmount(str, stringValue);
            C30011zg r2 = C30011zg.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
            if (C86104wH.A0a(fBPayECPPriceInfoImpl, r2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS) != null) {
                String valueOf = String.valueOf(C86104wH.A0a(fBPayECPPriceInfoImpl, r2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS));
                C04220Ms.A0B(valueOf, 0);
                r5 = (AnonymousClass23V) AnonymousClass23V.A01.get(valueOf);
                if (r5 == null) {
                    throw C18190wL.A0a(AnonymousClass00U.A0L("PriceInfoStatus is not found for identifier => ", valueOf));
                }
            } else {
                r5 = null;
            }
            String A0j = C86154wM.A0j(fBPayECPPriceInfoImpl);
            if (A0j != null) {
                String valueOf2 = String.valueOf(C86104wH.A0a(fBPayECPPriceInfoImpl, AnonymousClass66Q.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "type"));
                C04220Ms.A0B(valueOf2, 0);
                C973068v r6 = (C973068v) C973068v.A01.get(valueOf2);
                if (r6 != null) {
                    arrayList.add(new PriceInfo(currencyAmount, r5, r6, (Integer) null, A0j, (String) null, (String) null, (String) null));
                    return;
                }
                throw C18190wL.A0a(AnonymousClass00U.A0L("PriceInfoType is not found for identifier => ", valueOf2));
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }

    public static final GQLCallInputCInputShape0S0000000 A00(ShippingAddress shippingAddress) {
        GQLCallInputCInputShape0S0000000 A00 = GraphQlCallInput.A00();
        Boolean A0Y = C18180wK.A0Y();
        A00.A0D("is_default", A0Y);
        A00.A0F(shippingAddress.A05, "label");
        A00.A0F(shippingAddress.A00, "care_of");
        A00.A0F(shippingAddress.A08, "street_1");
        A00.A0F(shippingAddress.A09, "street_2");
        A00.A0F(shippingAddress.A01, ServerW3CShippingAddressConstants.CITY);
        A00.A0F(shippingAddress.A07, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        A00.A0F(shippingAddress.A06, "postal_code");
        A00.A0F(shippingAddress.A02, "country_code");
        A00.A0D("provide_suggestion", A0Y);
        return A00;
    }

    public static final AnonymousClass68M A06(AnonymousClass69P r1) {
        int ordinal = r1.ordinal();
        if (ordinal == 23) {
            return AnonymousClass68M.UX_SHIPPING_ADDRESS;
        }
        if (ordinal == 24) {
            return AnonymousClass68M.UX_FULFILLMENT_OPTIONS;
        }
        if (ordinal == 14) {
            return AnonymousClass68M.ONE_TIME_CHECKOUT_OPTION;
        }
        if (ordinal == 13) {
            return AnonymousClass68M.NUX_PAYMENT_RECEIVER;
        }
        if (ordinal != 10) {
            return null;
        }
        return AnonymousClass68M.UX_INCENTIVES;
    }

    public static final AnonymousClass68F A07(C29991ze r1) {
        int ordinal = r1.ordinal();
        if (ordinal == 6) {
            return AnonymousClass68F.REQUEST_PAYER_NAME;
        }
        if (ordinal == 4) {
            return AnonymousClass68F.REQUEST_PAYER_EMAIL;
        }
        if (ordinal == 7) {
            return AnonymousClass68F.REQUEST_PAYER_PHONE;
        }
        if (ordinal != 2) {
            return null;
        }
        return AnonymousClass68F.REQUEST_BILLING_ADDRESS;
    }

    public static final C110606ly A0B(CheckoutSetupMutationResponseImpl.CheckoutSetupMutation checkoutSetupMutation) {
        FBPayECPAvailabilityImpl fBPayECPAvailabilityImpl;
        FBPayReceiverInfoImpl fBPayReceiverInfoImpl;
        FBPayCheckoutScreenConfigImpl fBPayCheckoutScreenConfigImpl;
        FBPayPaymentConfigImpl fBPayPaymentConfigImpl;
        FBPayLinkAvailabilityImpl fBPayLinkAvailabilityImpl;
        TreeJNI treeValue;
        TreeJNI A0K = C86164wN.A0K(checkoutSetupMutation);
        C147878q4 r8 = null;
        if (A0K != null) {
            fBPayECPAvailabilityImpl = (FBPayECPAvailabilityImpl) A0K.reinterpret(FBPayECPAvailabilityImpl.class);
        } else {
            fBPayECPAvailabilityImpl = null;
        }
        if (fBPayECPAvailabilityImpl != null) {
            CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.ReceiverInfo A00 = checkoutSetupMutation.A00();
            if (A00 == null || (fBPayReceiverInfoImpl = (FBPayReceiverInfoImpl) A00.reinterpret(FBPayReceiverInfoImpl.class)) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            TreeJNI treeValue2 = checkoutSetupMutation.getTreeValue("checkout_screen_config", CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.CheckoutScreenConfig.class);
            if (treeValue2 == null || (fBPayCheckoutScreenConfigImpl = (FBPayCheckoutScreenConfigImpl) treeValue2.reinterpret(FBPayCheckoutScreenConfigImpl.class)) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            TreeJNI treeValue3 = checkoutSetupMutation.getTreeValue("payment_config", CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.PaymentConfig.class);
            if (treeValue3 == null || (fBPayPaymentConfigImpl = (FBPayPaymentConfigImpl) treeValue3.reinterpret(FBPayPaymentConfigImpl.class)) == null) {
                throw C18180wK.A0a("Required value was null.");
            }
            TreeJNI treeValue4 = checkoutSetupMutation.getTreeValue("link_availability", CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.LinkAvailability.class);
            if (treeValue4 != null) {
                fBPayLinkAvailabilityImpl = (FBPayLinkAvailabilityImpl) treeValue4.reinterpret(FBPayLinkAvailabilityImpl.class);
            } else {
                fBPayLinkAvailabilityImpl = null;
            }
            TreeJNI treeValue5 = checkoutSetupMutation.getTreeValue("embedded_bloks_apm_buttons", CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.EmbeddedBloksApmButtons.class);
            if (!(treeValue5 == null || (treeValue = treeValue5.getTreeValue("component", CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.EmbeddedBloksApmButtons.Component.class)) == null)) {
                r8 = (C147878q4) treeValue.reinterpret(FBPayBloksComponentImpl.class);
            }
            return new C110606ly(fBPayCheckoutScreenConfigImpl, fBPayECPAvailabilityImpl, fBPayLinkAvailabilityImpl, fBPayPaymentConfigImpl, fBPayReceiverInfoImpl, r8);
        }
        throw C18180wK.A0a("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r6 = com.facebook.graphql.impls.CurrencyAmountImpl.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00de, code lost:
        throw X.C18180wK.A0a("Required value was null.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.facebookpay.expresscheckout.models.TransactionInfo A0H(com.facebook.graphql.impls.FBPayTransactionInfoImpl r22) {
        /*
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.lang.Class<com.facebook.graphql.impls.FBPayTransactionInfoImpl$PriceItems> r1 = com.facebook.graphql.impls.FBPayTransactionInfoImpl.PriceItems.class
            java.lang.String r0 = "price_items"
            r4 = r22
            com.google.common.collect.ImmutableList r0 = r4.getTreeList(r0, r1)
            java.lang.String r10 = "Required value was null."
            if (r0 == 0) goto L_0x011d
            X.83w r3 = r0.iterator()
        L_0x0016:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r1 = r3.next()
            com.facebook.pando.TreeJNI r1 = (com.facebook.pando.TreeJNI) r1
            java.lang.Class<com.facebook.graphql.impls.FBPayECPPriceInfoImpl> r0 = com.facebook.graphql.impls.FBPayECPPriceInfoImpl.class
            com.facebook.pando.TreeJNI r0 = r1.reinterpret(r0)
            com.facebook.graphql.impls.FBPayECPPriceInfoImpl r0 = (com.facebook.graphql.impls.FBPayECPPriceInfoImpl) r0
            X.C04220Ms.A06(r0)
            A0P(r0, r2)
            goto L_0x0016
        L_0x0031:
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            java.lang.Class<com.facebook.graphql.impls.FBPayTransactionInfoImpl$ProductItems> r3 = com.facebook.graphql.impls.FBPayTransactionInfoImpl.ProductItems.class
            java.lang.String r0 = "product_items"
            com.google.common.collect.ImmutableList r0 = r4.getTreeList(r0, r3)
            if (r0 == 0) goto L_0x0118
            X.83w r9 = r0.iterator()
        L_0x0043:
            boolean r0 = r9.hasNext()
            r11 = 0
            if (r0 == 0) goto L_0x00df
            java.lang.Object r3 = r9.next()
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            java.lang.Class<com.facebook.graphql.impls.FBPayTransactionInfoImpl$ProductItems$Amount> r8 = com.facebook.graphql.impls.FBPayTransactionInfoImpl.ProductItems.Amount.class
            java.lang.String r7 = "amount"
            com.facebook.pando.TreeJNI r0 = r3.getTreeValue(r7, r8)
            if (r0 == 0) goto L_0x00da
            java.lang.Class<com.facebook.graphql.impls.CurrencyAmountImpl> r6 = com.facebook.graphql.impls.CurrencyAmountImpl.class
            com.facebook.pando.TreeJNI r5 = r0.reinterpret(r6)
            if (r5 == 0) goto L_0x00da
            java.lang.String r0 = "currency"
            java.lang.String r5 = r5.getStringValue(r0)
            if (r5 == 0) goto L_0x00da
            com.facebook.pando.TreeJNI r0 = r3.getTreeValue(r7, r8)
            if (r0 == 0) goto L_0x00d5
            com.facebook.pando.TreeJNI r0 = r0.reinterpret(r6)
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = r0.getStringValue(r7)
            if (r0 == 0) goto L_0x00d5
            com.facebookpay.common.models.CurrencyAmount r13 = new com.facebookpay.common.models.CurrencyAmount
            r13.<init>(r5, r0)
            X.1zg r6 = X.C30011zg.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ IllegalArgumentException -> 0x00ae }
            java.lang.String r5 = "status"
            java.lang.Enum r0 = X.C86104wH.A0a(r3, r6, r5)     // Catch:{ IllegalArgumentException -> 0x00ae }
            if (r0 == 0) goto L_0x00ae
            java.lang.Enum r0 = X.C86104wH.A0a(r3, r6, r5)     // Catch:{ IllegalArgumentException -> 0x00ae }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x00ae }
            r0 = 0
            X.C04220Ms.A0B(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00ae }
            java.util.Map r0 = X.AnonymousClass23V.A01     // Catch:{ IllegalArgumentException -> 0x00ae }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ IllegalArgumentException -> 0x00ae }
            X.23V r0 = (X.AnonymousClass23V) r0     // Catch:{ IllegalArgumentException -> 0x00ae }
            if (r0 == 0) goto L_0x00a2
            goto L_0x00ad
        L_0x00a2:
            java.lang.String r0 = "PriceInfoStatus is not found for identifier => "
            java.lang.String r0 = X.AnonymousClass00U.A0L(r0, r5)     // Catch:{ IllegalArgumentException -> 0x00ae }
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)     // Catch:{ IllegalArgumentException -> 0x00ae }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ae }
        L_0x00ad:
            r11 = r0
        L_0x00ae:
            java.lang.String r17 = X.C86154wM.A0j(r3)
            if (r17 == 0) goto L_0x00d0
            r15 = 0
            java.lang.String r0 = "description"
            java.lang.String r19 = r3.getStringValue(r0)
            java.lang.String r0 = "icon_uri"
            java.lang.String r20 = r3.getStringValue(r0)
            com.facebookpay.expresscheckout.models.PriceInfo r12 = new com.facebookpay.expresscheckout.models.PriceInfo
            r14 = r11
            r16 = r15
            r18 = r15
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r1.add(r12)
            goto L_0x0043
        L_0x00d0:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r10)
            throw r0
        L_0x00d5:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r10)
            throw r0
        L_0x00da:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r10)
            throw r0
        L_0x00df:
            java.lang.Class<com.facebook.graphql.impls.FBPayTransactionInfoImpl$CurrencyAmount> r3 = com.facebook.graphql.impls.FBPayTransactionInfoImpl.CurrencyAmount.class
            java.lang.String r0 = "currency_amount"
            com.facebook.pando.TreeJNI r3 = r4.getTreeValue(r0, r3)
            if (r3 == 0) goto L_0x0113
            java.lang.String r0 = "currency"
            java.lang.String r17 = r3.getStringValue(r0)
            if (r17 == 0) goto L_0x0113
            java.lang.String r0 = "country_code"
            java.lang.String r18 = r4.getStringValue(r0)
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            com.facebookpay.expresscheckout.models.PromoCodeList r13 = new com.facebookpay.expresscheckout.models.PromoCodeList
            r13.<init>(r0)
            java.util.ArrayList r22 = X.AnonymousClass0wJ.A0v()
            com.facebookpay.expresscheckout.models.TransactionInfo r10 = new com.facebookpay.expresscheckout.models.TransactionInfo
            r12 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r19 = r11
            r20 = r2
            r21 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r10
        L_0x0113:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r10)
            throw r0
        L_0x0118:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r10)
            throw r0
        L_0x011d:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122157Kv.A0H(com.facebook.graphql.impls.FBPayTransactionInfoImpl):com.facebookpay.expresscheckout.models.TransactionInfo");
    }

    public static final ArrayList A0L(List list) {
        AnonymousClass692 r0;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int ordinal = ((AnonymousClass66Z) it.next()).ordinal();
            if (ordinal == 1) {
                r0 = AnonymousClass692.BASIC_CARD_V1;
            } else if (ordinal == 4) {
                r0 = AnonymousClass692.FB_TOKEN_V1;
            } else if (ordinal == 3) {
                r0 = AnonymousClass692.ECOM_TOKEN_V1;
            } else if (ordinal == 5) {
                r0 = AnonymousClass692.META_PAYMENT_V1;
            } else if (ordinal == 6) {
                r0 = AnonymousClass692.PAYPAL_OTC_V1;
            } else {
                throw C18190wL.A0a("Unrecognized GraphQLPaymentContainerTypes");
            }
            A0w.add(r0);
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass00J.A0h(A0w, A0v);
        return A0v;
    }

    public static final ArrayList A0M(List list) {
        AnonymousClass67H r0;
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int ordinal = ((AnonymousClass66X) it.next()).ordinal();
            if (ordinal == 1) {
                r0 = AnonymousClass67H.AUTH;
            } else if (ordinal == 2) {
                r0 = AnonymousClass67H.CAPTURE;
            } else if (ordinal == 3) {
                r0 = AnonymousClass67H.CHARGE;
            } else {
                throw C18190wL.A0a("Unrecognized GraphQLPaymentContainerActionType");
            }
            A0w.add(r0);
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass00J.A0h(A0w, A0v);
        return A0v;
    }

    public static final Set A0N(List list) {
        LinkedHashSet A0u = C86134wK.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass68M A06 = A06((AnonymousClass69P) it.next());
            if (A06 != null) {
                A0u.add(A06);
            }
        }
        return A0u;
    }

    public static final Set A0O(List list) {
        LinkedHashSet A0u = C86134wK.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass68F A07 = A07((C29991ze) it.next());
            if (A07 != null) {
                A0u.add(A07);
            }
        }
        return A0u;
    }
}
