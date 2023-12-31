package X;

import com.facebook.graphql.impls.APMOptionImpl;
import com.facebook.graphql.impls.AREffectBlockFragmentImpl;
import com.facebook.graphql.impls.AREffectConsentStateQueryResponseImpl;
import com.facebook.graphql.impls.AccountAdminsFragmentImpl;
import com.facebook.graphql.impls.AdditionalFieldsImpl;
import com.facebook.graphql.impls.AlternativePaymentMethodImpl;
import com.facebook.graphql.impls.ArEffectsFlmCapabilityQueryResponseImpl;
import com.facebook.graphql.impls.AuthDialogScreenImpl;
import com.facebook.graphql.impls.AuthFactorRequirementImpl;
import com.facebook.graphql.impls.AvailableCardTypesImpl;
import com.facebook.graphql.impls.BIOAuthFactorImpl;
import com.facebook.graphql.impls.BalanceInfoFragmentImpl;
import com.facebook.graphql.impls.BillingAddressImpl;
import com.facebook.graphql.impls.BreakDownImpl;
import com.facebook.graphql.impls.CSCAuthFactorImpl;
import com.facebook.graphql.impls.CapabilityLatestVersionQueryResponseImpl;
import com.facebook.graphql.impls.CareLinkFragmentImpl;
import com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl;
import com.facebook.graphql.impls.CompleteLinkPaypalMutationResponseImpl;
import com.facebook.graphql.impls.ComponentDataMutationResponseImpl;
import com.facebook.graphql.impls.ContactInformationComponentImpl;
import com.facebook.graphql.impls.CostBreakDownFragmentImpl;
import com.facebook.graphql.impls.CreatePayContainerMutationResponseImpl;
import com.facebook.graphql.impls.CredentialResponseImpl;
import com.facebook.graphql.impls.CreditCardCredentialImpl;
import com.facebook.graphql.impls.CrossPostingContentCompatibilityConfigV2ResponseImpl;
import com.facebook.graphql.impls.CurrencyAmountImpl;
import com.facebook.graphql.impls.DcpFeaturesUploadResponseImpl;
import com.facebook.graphql.impls.DisclaimerImpl;
import com.facebook.graphql.impls.ECPPayPalConsentBottomSheetFragmentImpl;
import com.facebook.graphql.impls.ECPReceiverInfoFragmentImpl;
import com.facebook.graphql.impls.ECPUserFacingErrorImpl;
import com.facebook.graphql.impls.ECPUserFacingErrorMaybeDeadImpl;
import com.facebook.graphql.impls.EarningDetailImpl;
import com.facebook.graphql.impls.EarningsBreakdownFragmentImpl;
import com.facebook.graphql.impls.EarningsImpl;
import com.facebook.graphql.impls.EarningsSummaryFragmentImpl;
import com.facebook.graphql.impls.EditLinksFragmentImpl;
import com.facebook.graphql.impls.EffectBestInstanceFragmentImpl;
import com.facebook.graphql.impls.EmailOptInComponentImpl;
import com.facebook.graphql.impls.EmailResponseImpl;
import com.facebook.graphql.impls.ErrorCallToActionImpl;
import com.facebook.graphql.impls.ExternalShippingAddressImpl;
import com.facebook.graphql.impls.FBPayAddAddressMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayAddAddressMutationResponseImpl;
import com.facebook.graphql.impls.FBPayAddEmailMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayAddEmailMutationResponseImpl;
import com.facebook.graphql.impls.FBPayAddPhoneMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayAddPhoneMutationResponseImpl;
import com.facebook.graphql.impls.FBPayAddShopPayBottomSheetQueryFragmentImpl;
import com.facebook.graphql.impls.FBPayAddressFormConfigFragmentImpl;
import com.facebook.graphql.impls.FBPayAddressQueryFragmentImpl;
import com.facebook.graphql.impls.FBPayAddressQueryResponseImpl;
import com.facebook.graphql.impls.FBPayAuthFactorImpl;
import com.facebook.graphql.impls.FBPayAuthFlowsContentQueryFragmentImpl;
import com.facebook.graphql.impls.FBPayAuthTicketFragmentImpl;
import com.facebook.graphql.impls.FBPayAuthTicketQueryResponseImpl;
import com.facebook.graphql.impls.FBPayAuthenticationFlowImpl;
import com.facebook.graphql.impls.FBPayBloksComponentImpl;
import com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl;
import com.facebook.graphql.impls.FBPayCompleteShopPayAccountLinkingMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl;
import com.facebook.graphql.impls.FBPayConfirmationSectionImpl;
import com.facebook.graphql.impls.FBPayContactInfoQueryFragmentImpl;
import com.facebook.graphql.impls.FBPayContactInfoQueryResponseImpl;
import com.facebook.graphql.impls.FBPayCreateAuthTicketBasedFactorMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayCreatePINMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayCreatePINMutationResponseImpl;
import com.facebook.graphql.impls.FBPayDeleteAddressMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayDeleteAddressMutationResponseImpl;
import com.facebook.graphql.impls.FBPayDeleteAuthTicketMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayDeleteAuthTicketMutationResponseImpl;
import com.facebook.graphql.impls.FBPayDeleteEmailMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayDeleteEmailMutationResponseImpl;
import com.facebook.graphql.impls.FBPayDeletePhoneMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayDeletePhoneMutationResponseImpl;
import com.facebook.graphql.impls.FBPayDisablePINMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayDisablePINMutationResponseImpl;
import com.facebook.graphql.impls.FBPayECPAvailabilityImpl;
import com.facebook.graphql.impls.FBPayECPHandleCheckoutEventMutationResponseImpl;
import com.facebook.graphql.impls.FBPayECPPriceInfoImpl;
import com.facebook.graphql.impls.FBPayECPShippingOptionFragmentImpl;
import com.facebook.graphql.impls.FBPayECPShippingOptionsFragmentImpl;
import com.facebook.graphql.impls.FBPayEmailFragmentImpl;
import com.facebook.graphql.impls.FBPayEmailImpl;
import com.facebook.graphql.impls.FBPayEnablePINMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayEnablePINMutationResponseImpl;
import com.facebook.graphql.impls.FBPayFormValidationRulesImpl;
import com.facebook.graphql.impls.FBPayGetServerEncryptionKeyMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayGetServerEncryptionKeyMutationResponseImpl;
import com.facebook.graphql.impls.FBPayIconImpl;
import com.facebook.graphql.impls.FBPayLinkAccountMutationResponseImpl;
import com.facebook.graphql.impls.FBPayLinkAvailabilityImpl;
import com.facebook.graphql.impls.FBPayLinkableTextImpl;
import com.facebook.graphql.impls.FBPayLoggingPolicyImpl;
import com.facebook.graphql.impls.FBPayMerchantServicesEarningsDetailsQueryResponseImpl;
import com.facebook.graphql.impls.FBPayMerchantServicesEarningsQueryResponseImpl;
import com.facebook.graphql.impls.FBPayMerchantServicesPayoutsQueryResponseImpl;
import com.facebook.graphql.impls.FBPayNonAuthStepUpImpl;
import com.facebook.graphql.impls.FBPayOneTimeEmailImpl;
import com.facebook.graphql.impls.FBPayOneTimePhoneNumberImpl;
import com.facebook.graphql.impls.FBPayPaymentConfigImpl;
import com.facebook.graphql.impls.FBPayPaymentsUserFacingErrorCallToActionFragmentImpl;
import com.facebook.graphql.impls.FBPayPaymentsUserFacingErrorFragmentImpl;
import com.facebook.graphql.impls.FBPayPhoneFragmentImpl;
import com.facebook.graphql.impls.FBPayPhoneNumberImpl;
import com.facebook.graphql.impls.FBPayReceiverInfoImpl;
import com.facebook.graphql.impls.FBPayShippingAddressFragmentImpl;
import com.facebook.graphql.impls.FBPayShopPayInitLinkMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayTransactionInfoImpl;
import com.facebook.graphql.impls.FBPayTransactionsQueryFragmentImpl;
import com.facebook.graphql.impls.FBPayUpdateAddressMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayUpdateAddressMutationResponseImpl;
import com.facebook.graphql.impls.FBPayUpdateEmailMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayUpdateEmailMutationResponseImpl;
import com.facebook.graphql.impls.FBPayUpdatePhoneMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayUpdatePhoneMutationResponseImpl;
import com.facebook.graphql.impls.FBPayUserFacingErrorFragmentImpl;
import com.facebook.graphql.impls.FBPayVerifyFactorMutationFragmentImpl;
import com.facebook.graphql.impls.FBPayVerifyFactorMutationResponseImpl;
import com.facebook.graphql.impls.FamilyDeviceIDAppScopedDeviceIDSyncMutationResponseImpl;
import com.facebook.graphql.impls.FbpayConvertPaypalBaToCibResponseImpl;
import com.facebook.graphql.impls.FetchAddressDetailsQueryResponseImpl;
import com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl;
import com.facebook.graphql.impls.FetchBlockV5MetadataQueryResponseImpl;
import com.facebook.graphql.impls.FetchPaymentDetailsQueryResponseImpl;
import com.facebook.graphql.impls.FetchProductConfigQueryResponseImpl;
import com.facebook.graphql.impls.FetchSingleMaskEffectQueryResponseImpl;
import com.facebook.graphql.impls.FinancialEntitiesFragmentImpl;
import com.facebook.graphql.impls.FinancialEntityImpl;
import com.facebook.graphql.impls.HomeRootQueryResponseImpl;
import com.facebook.graphql.impls.IncentiveItemInfoImpl;
import com.facebook.graphql.impls.IncentivesComponentImpl;
import com.facebook.graphql.impls.InfoDetailsImpl;
import com.facebook.graphql.impls.InitLinkPaypalResponseImpl;
import com.facebook.graphql.impls.LinkableTextFragmentImpl;
import com.facebook.graphql.impls.MetaPayConnectAddressDetailsImpl;
import com.facebook.graphql.impls.MetaPayConnectCredentialImpl;
import com.facebook.graphql.impls.MetaPayConnectQueryResponseImpl;
import com.facebook.graphql.impls.NMLMLCapabilityLatestAimVersionQueryResponseImpl;
import com.facebook.graphql.impls.NativeFeatureImpl;
import com.facebook.graphql.impls.NewCreditCardOptionImpl;
import com.facebook.graphql.impls.NewPaypalBillingAgreementImpl;
import com.facebook.graphql.impls.NotificationActionFragmentImpl;
import com.facebook.graphql.impls.NotificationFragmentImpl;
import com.facebook.graphql.impls.NotificationHubQueryResponseImpl;
import com.facebook.graphql.impls.NotificationIconFragmentImpl;
import com.facebook.graphql.impls.OfferInfoFieldsImpl;
import com.facebook.graphql.impls.OffsiteSendFirstPartyEventResponseImpl;
import com.facebook.graphql.impls.OnDeviceFLFeaturesResponseImpl;
import com.facebook.graphql.impls.OnDeviceFLMetadataResponseImpl;
import com.facebook.graphql.impls.OtcOptionComponentImpl;
import com.facebook.graphql.impls.OverviewFragmentImpl;
import com.facebook.graphql.impls.OverviewQueryResponseImpl;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;
import com.facebook.graphql.impls.PAYTextWithEntitiesFragmentImpl;
import com.facebook.graphql.impls.PAYTextWithLinksFragmentImpl;
import com.facebook.graphql.impls.PINAuthFactorImpl;
import com.facebook.graphql.impls.PINRecoveryWithPasswordScreenImpl;
import com.facebook.graphql.impls.PINScreenImpl;
import com.facebook.graphql.impls.PaginationInfoImpl;
import com.facebook.graphql.impls.PayButtonComponentImpl;
import com.facebook.graphql.impls.PayeeFragmentImpl;
import com.facebook.graphql.impls.PayerNameResponseImpl;
import com.facebook.graphql.impls.PaymentCredentialImpl;
import com.facebook.graphql.impls.PaymentMethodComponentImpl;
import com.facebook.graphql.impls.PaymentsTabsFragmentImpl;
import com.facebook.graphql.impls.PayoutAccountInfoFragmentImpl;
import com.facebook.graphql.impls.PayoutActivityItemImpl;
import com.facebook.graphql.impls.PayoutAmountRowImpl;
import com.facebook.graphql.impls.PayoutDetailImpl;
import com.facebook.graphql.impls.PayoutDetailsImpl;
import com.facebook.graphql.impls.PayoutMethodsFragmentImpl;
import com.facebook.graphql.impls.PayoutOwnerFragmentImpl;
import com.facebook.graphql.impls.PayoutRecordDetailsViewQueryResponseImpl;
import com.facebook.graphql.impls.PayoutRecordImpl;
import com.facebook.graphql.impls.PayoutRecordItemImpl;
import com.facebook.graphql.impls.PayoutReleaseDetailsViewQueryResponseImpl;
import com.facebook.graphql.impls.PayoutSettingsQueryResponseImpl;
import com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl;
import com.facebook.graphql.impls.PayoutsSummaryFragmentImpl;
import com.facebook.graphql.impls.PaypalBAImpl;
import com.facebook.graphql.impls.PhoneResponseImpl;
import com.facebook.graphql.impls.PreprocessingMutationResponseImpl;
import com.facebook.graphql.impls.PromoCodeComponentImpl;
import com.facebook.graphql.impls.SDCAuthFactorImpl;
import com.facebook.graphql.impls.ScriptingPackagesLatestVersionQueryResponseImpl;
import com.facebook.graphql.impls.SharedNativeMLModelBatchedQueryResponseImpl;
import com.facebook.graphql.impls.SharedPaymentsErrorImpl;
import com.facebook.graphql.impls.SharedPaymentsErrorMaybeDeadImpl;
import com.facebook.graphql.impls.ShippingAddressComponentImpl;
import com.facebook.graphql.impls.ShippingAddressResponseImpl;
import com.facebook.graphql.impls.ShippingAddressesImpl;
import com.facebook.graphql.impls.StatusInfoDetailsImpl;
import com.facebook.graphql.impls.SubmitPayContainerMutationResponseImpl;
import com.facebook.graphql.impls.SummaryDetailsImpl;
import com.facebook.graphql.impls.SummaryImpl;
import com.facebook.graphql.impls.SupportImpl;
import com.facebook.graphql.impls.TaxInfoFragmentImpl;
import com.facebook.graphql.impls.TermsComponentImpl;
import com.facebook.graphql.impls.ThreeDSAuthFactorImpl;
import com.facebook.graphql.impls.TimelineEventImpl;
import com.facebook.graphql.impls.TokenizedCardCredentialImpl;
import com.facebook.graphql.impls.TopLevelDialogImpl;
import com.facebook.graphql.impls.TransactionAmountImpl;
import com.facebook.graphql.impls.TransactionDateImpl;
import com.facebook.graphql.impls.TransactionFragmentImpl;
import com.facebook.graphql.impls.TransactionLabelImpl;
import com.facebook.graphql.impls.TransactionRowAccessibilityImpl;
import com.facebook.graphql.impls.TransactionUriImpl;
import com.facebook.graphql.impls.TrustedDeviceAuthFactorImpl;
import com.facebook.graphql.impls.TypeaheadAddressDetailsImpl;
import com.facebook.graphql.impls.TypeaheadAttributionIconImpl;
import com.facebook.graphql.impls.TypeaheadMatchedStringImpl;
import com.facebook.graphql.impls.UpdateOffsiteOrderMutationResponseImpl;
import com.facebook.graphql.impls.UserInfoSectionImpl;
import com.facebook.graphql.impls.ZeroDayLanguageSignalUploadResponseImpl;

/* renamed from: X.6H6  reason: invalid class name */
public final class AnonymousClass6H6 {
    public static Class A00(int i) {
        switch (i) {
            case -2078243045:
                return FBPayAuthFlowsContentQueryFragmentImpl.class;
            case -2064779922:
                return FBPayVerifyFactorMutationResponseImpl.class;
            case -2055568776:
                return UserInfoSectionImpl.class;
            case -2052632900:
                return NewCreditCardOptionImpl.class;
            case -2050503928:
                return AccountAdminsFragmentImpl.class;
            case -2019110159:
                return FetchSingleMaskEffectQueryResponseImpl.class;
            case -1965407372:
                return FBPayLinkAccountMutationResponseImpl.class;
            case -1930157512:
                return FBPayCompleteShopPayAccountLinkingMutationFragmentImpl.class;
            case -1925217936:
                return PAYTextWithLinksFragmentImpl.class;
            case -1876875093:
                return FBPayMerchantServicesPayoutsQueryResponseImpl.class;
            case -1863107388:
                return FBPayAuthTicketQueryResponseImpl.class;
            case -1810271927:
                return FBPayAddEmailMutationFragmentImpl.class;
            case -1795234325:
                return FBPayDeleteAuthTicketMutationFragmentImpl.class;
            case -1659328637:
                return FBPayAddressFormConfigFragmentImpl.class;
            case -1604306151:
                return FBPayIconImpl.class;
            case -1597880601:
                return NotificationIconFragmentImpl.class;
            case -1573102255:
                return TermsComponentImpl.class;
            case -1563793709:
                return FBPayAuthTicketFragmentImpl.class;
            case -1561251211:
                return EarningDetailImpl.class;
            case -1536400265:
                return FetchAddressDetailsQueryResponseImpl.class;
            case -1503034778:
                return FBPayLoggingPolicyImpl.class;
            case -1501721608:
                return SupportImpl.class;
            case -1500910584:
                return CheckoutSetupMutationResponseImpl.class;
            case -1399310252:
                return PayoutSettingsQueryResponseImpl.class;
            case -1368888522:
                return NativeFeatureImpl.class;
            case -1333706087:
                return FBPayCheckoutScreenConfigImpl.class;
            case -1312993960:
                return FBPayPaymentsUserFacingErrorFragmentImpl.class;
            case -1308276365:
                return TypeaheadAddressDetailsImpl.class;
            case -1284681296:
                return FBPayTransactionsQueryFragmentImpl.class;
            case -1282972953:
                return ComponentDataMutationResponseImpl.class;
            case -1240874203:
                return FBPayUpdateAddressMutationResponseImpl.class;
            case -1235561061:
                return ShippingAddressesImpl.class;
            case -1229562524:
                return FBPayNonAuthStepUpImpl.class;
            case -1224713448:
                return FBPayEmailFragmentImpl.class;
            case -1212573813:
                return MetaPayConnectCredentialImpl.class;
            case -1188209066:
                return PaypalBAImpl.class;
            case -1181832456:
                return FBPayMerchantServicesEarningsQueryResponseImpl.class;
            case -1173390614:
                return FBPayDeleteAddressMutationResponseImpl.class;
            case -1102795965:
                return CareLinkFragmentImpl.class;
            case -1068275742:
                return EffectBestInstanceFragmentImpl.class;
            case -1055014915:
                return ContactInformationComponentImpl.class;
            case -1030959618:
                return BalanceInfoFragmentImpl.class;
            case -1028067872:
                return FBPayUserFacingErrorFragmentImpl.class;
            case -1008644242:
                return FBPayUpdateEmailMutationResponseImpl.class;
            case -992342626:
                return AvailableCardTypesImpl.class;
            case -984072569:
                return EarningsBreakdownFragmentImpl.class;
            case -936895091:
                return FBPayComponentDataQueryResponseImpl.class;
            case -910949838:
                return FetchBlockV5MetadataQueryResponseImpl.class;
            case -880022907:
                return FBPayPaymentsUserFacingErrorCallToActionFragmentImpl.class;
            case -849872429:
                return NMLMLCapabilityLatestAimVersionQueryResponseImpl.class;
            case -833574982:
                return OfferInfoFieldsImpl.class;
            case -830474888:
                return FBPayGetServerEncryptionKeyMutationFragmentImpl.class;
            case -818158878:
                return OverviewFragmentImpl.class;
            case -806265702:
                return TransactionAmountImpl.class;
            case -783000412:
                return PaymentsTabsFragmentImpl.class;
            case -761296294:
                return PayoutDetailImpl.class;
            case -735820653:
                return AREffectBlockFragmentImpl.class;
            case -719928312:
                return PayButtonComponentImpl.class;
            case -717154134:
                return FetchAddressSuggestionsQueryResponseImpl.class;
            case -717077272:
                return FBPayDisablePINMutationResponseImpl.class;
            case -708877377:
                return FBPayBloksComponentImpl.class;
            case -687358097:
                return FBPayAuthenticationFlowImpl.class;
            case -634042555:
                return CapabilityLatestVersionQueryResponseImpl.class;
            case -633919572:
                return FBPayECPAvailabilityImpl.class;
            case -593915778:
                return PayoutTransactionQueryResponseImpl.class;
            case -587304647:
                return PaymentCredentialImpl.class;
            case -563950722:
                return NotificationHubQueryResponseImpl.class;
            case -523897260:
                return PINScreenImpl.class;
            case -510131583:
                return FBPayCreatePINMutationFragmentImpl.class;
            case -507874568:
                return ShippingAddressResponseImpl.class;
            case -498669657:
                return FBPayOneTimePhoneNumberImpl.class;
            case -496969063:
                return CostBreakDownFragmentImpl.class;
            case -487581838:
                return FBPayReceiverInfoImpl.class;
            case -481316464:
                return PaginationInfoImpl.class;
            case -476136082:
                return NotificationFragmentImpl.class;
            case -472636032:
                return FBPayContactInfoQueryResponseImpl.class;
            case -464193101:
                return PayoutsSummaryFragmentImpl.class;
            case -434343875:
                return TransactionRowAccessibilityImpl.class;
            case -424439604:
                return PayoutActivityItemImpl.class;
            case -403440481:
                return FBPayDeletePhoneMutationResponseImpl.class;
            case -391262911:
                return PayoutAmountRowImpl.class;
            case -381148244:
                return EmailOptInComponentImpl.class;
            case -352726209:
                return ZeroDayLanguageSignalUploadResponseImpl.class;
            case -329559150:
                return CreatePayContainerMutationResponseImpl.class;
            case -267821038:
                return FBPayUpdateEmailMutationFragmentImpl.class;
            case -250274220:
                return FBPayECPHandleCheckoutEventMutationResponseImpl.class;
            case -249277202:
                return ECPPayPalConsentBottomSheetFragmentImpl.class;
            case -240793478:
                return UpdateOffsiteOrderMutationResponseImpl.class;
            case -235391489:
                return AuthDialogScreenImpl.class;
            case -231024740:
                return ArEffectsFlmCapabilityQueryResponseImpl.class;
            case -213238710:
                return OffsiteSendFirstPartyEventResponseImpl.class;
            case -192063486:
                return FBPayAddShopPayBottomSheetQueryFragmentImpl.class;
            case -191180958:
                return FbpayConvertPaypalBaToCibResponseImpl.class;
            case -185049991:
                return PINAuthFactorImpl.class;
            case -178893102:
                return ECPUserFacingErrorMaybeDeadImpl.class;
            case -173343578:
                return PayoutRecordItemImpl.class;
            case -151995282:
                return HomeRootQueryResponseImpl.class;
            case -91375789:
                return PhoneResponseImpl.class;
            case -88303303:
                return FBPayEnablePINMutationResponseImpl.class;
            case 8946366:
                return FBPayLinkableTextImpl.class;
            case 23078303:
                return ShippingAddressComponentImpl.class;
            case 26908574:
                return FinancialEntityImpl.class;
            case 33156198:
                return OnDeviceFLMetadataResponseImpl.class;
            case 41959267:
                return TypeaheadMatchedStringImpl.class;
            case 52078083:
                return SharedNativeMLModelBatchedQueryResponseImpl.class;
            case 65064496:
                return FBPayAddressQueryFragmentImpl.class;
            case 74475057:
                return AdditionalFieldsImpl.class;
            case 95386404:
                return PayoutReleaseDetailsViewQueryResponseImpl.class;
            case 98567921:
                return CurrencyAmountImpl.class;
            case 111918791:
                return PayoutDetailsImpl.class;
            case 115444621:
                return NotificationActionFragmentImpl.class;
            case 161013023:
                return TaxInfoFragmentImpl.class;
            case 172983857:
                return FBPayConfirmationSectionImpl.class;
            case 254825634:
                return PAYTextWithEntitiesFragmentImpl.class;
            case 261424452:
                return FBPayDeleteAddressMutationFragmentImpl.class;
            case 271775793:
                return TransactionDateImpl.class;
            case 273585968:
                return PINRecoveryWithPasswordScreenImpl.class;
            case 274333477:
                return FBPayDeleteAuthTicketMutationResponseImpl.class;
            case 289198793:
                return ECPUserFacingErrorImpl.class;
            case 302189443:
                return ECPReceiverInfoFragmentImpl.class;
            case 325005158:
                return NewPaypalBillingAgreementImpl.class;
            case 332146597:
                return FBPayShippingAddressFragmentImpl.class;
            case 367420230:
                return APMOptionImpl.class;
            case 396921940:
                return ErrorCallToActionImpl.class;
            case 400744973:
                return FBPayAddressQueryResponseImpl.class;
            case 426943934:
                return MetaPayConnectAddressDetailsImpl.class;
            case 429363839:
                return TimelineEventImpl.class;
            case 462423341:
                return ScriptingPackagesLatestVersionQueryResponseImpl.class;
            case 466185842:
                return FinancialEntitiesFragmentImpl.class;
            case 518611595:
                return TransactionLabelImpl.class;
            case 561485201:
                return BIOAuthFactorImpl.class;
            case 582166836:
                return PayoutAccountInfoFragmentImpl.class;
            case 601229952:
                return IncentiveItemInfoImpl.class;
            case 613254091:
                return FBPayDeleteEmailMutationResponseImpl.class;
            case 615152216:
                return FBPayAddAddressMutationFragmentImpl.class;
            case 623680241:
                return EmailResponseImpl.class;
            case 629315294:
                return InitLinkPaypalResponseImpl.class;
            case 632115787:
                return OverviewQueryResponseImpl.class;
            case 641502205:
                return StatusInfoDetailsImpl.class;
            case 650091212:
                return FBPayAddEmailMutationResponseImpl.class;
            case 661837268:
                return FamilyDeviceIDAppScopedDeviceIDSyncMutationResponseImpl.class;
            case 672632885:
                return TypeaheadAttributionIconImpl.class;
            case 678135786:
                return FBPayECPShippingOptionFragmentImpl.class;
            case 683090785:
                return TrustedDeviceAuthFactorImpl.class;
            case 693675366:
                return FBPayEmailImpl.class;
            case 710338203:
                return InfoDetailsImpl.class;
            case 723759619:
                return SummaryDetailsImpl.class;
            case 736683160:
                return SharedPaymentsErrorImpl.class;
            case 743457060:
                return FBPayCreatePINMutationResponseImpl.class;
            case 744827364:
                return PayoutMethodsFragmentImpl.class;
            case 754339802:
                return FBPayECPPriceInfoImpl.class;
            case 819094042:
                return FBPayTransactionInfoImpl.class;
            case 836039204:
                return FBPayUpdatePhoneMutationFragmentImpl.class;
            case 838886095:
                return PayoutRecordImpl.class;
            case 842839933:
                return FBPayUpdateAddressMutationFragmentImpl.class;
            case 854119483:
                return OnDeviceFLFeaturesResponseImpl.class;
            case 860570050:
                return FBPayOneTimeEmailImpl.class;
            case 866789463:
                return PayoutOwnerFragmentImpl.class;
            case 886313837:
                return PayeeFragmentImpl.class;
            case 908798739:
                return PayerNameResponseImpl.class;
            case 916810890:
                return DisclaimerImpl.class;
            case 929086265:
                return EditLinksFragmentImpl.class;
            case 944864869:
                return AlternativePaymentMethodImpl.class;
            case 982179812:
                return FBPayEnablePINMutationFragmentImpl.class;
            case 1012555557:
                return ExternalShippingAddressImpl.class;
            case 1023914967:
                return FBPayAddPhoneMutationResponseImpl.class;
            case 1026760416:
                return FBPayPhoneFragmentImpl.class;
            case 1105991069:
                return MetaPayConnectQueryResponseImpl.class;
            case 1160954853:
                return FBPayCreateAuthTicketBasedFactorMutationFragmentImpl.class;
            case 1203961218:
                return IncentivesComponentImpl.class;
            case 1278893400:
                return TransactionFragmentImpl.class;
            case 1287181796:
                return SummaryImpl.class;
            case 1311770078:
                return FBPayDeleteEmailMutationFragmentImpl.class;
            case 1343275932:
                return CSCAuthFactorImpl.class;
            case 1363505257:
                return AuthFactorRequirementImpl.class;
            case 1367251747:
                return FBPayPaymentConfigImpl.class;
            case 1383334962:
                return FBPayGetServerEncryptionKeyMutationResponseImpl.class;
            case 1388533533:
                return FBPayContactInfoQueryFragmentImpl.class;
            case 1394617558:
                return DcpFeaturesUploadResponseImpl.class;
            case 1420136883:
                return LinkableTextFragmentImpl.class;
            case 1435096333:
                return FBPayLinkAvailabilityImpl.class;
            case 1439320915:
                return AREffectConsentStateQueryResponseImpl.class;
            case 1455687911:
                return CreditCardCredentialImpl.class;
            case 1459717772:
                return FBPayMerchantServicesEarningsDetailsQueryResponseImpl.class;
            case 1460520019:
                return EarningsSummaryFragmentImpl.class;
            case 1468523178:
                return ThreeDSAuthFactorImpl.class;
            case 1477488599:
                return SDCAuthFactorImpl.class;
            case 1501924927:
                return CrossPostingContentCompatibilityConfigV2ResponseImpl.class;
            case 1545804947:
                return OtcOptionComponentImpl.class;
            case 1562779654:
                return FBPayDisablePINMutationFragmentImpl.class;
            case 1583642295:
                return PromoCodeComponentImpl.class;
            case 1648362188:
                return FBPayUpdatePhoneMutationResponseImpl.class;
            case 1653097835:
                return BillingAddressImpl.class;
            case 1658776164:
                return PaymentMethodComponentImpl.class;
            case 1726465009:
                return FetchProductConfigQueryResponseImpl.class;
            case 1730710994:
                return FBPayAddAddressMutationResponseImpl.class;
            case 1741235608:
                return FBPayPhoneNumberImpl.class;
            case 1760272567:
                return PreprocessingMutationResponseImpl.class;
            case 1769228525:
                return FBPayAddPhoneMutationFragmentImpl.class;
            case 1773996009:
                return SubmitPayContainerMutationResponseImpl.class;
            case 1825808236:
                return PAYLinkableTextFragmentImpl.class;
            case 1840438060:
                return FetchPaymentDetailsQueryResponseImpl.class;
            case 1854628280:
                return EarningsImpl.class;
            case 1858461834:
                return FBPayFormValidationRulesImpl.class;
            case 1860193274:
                return FBPayDeletePhoneMutationFragmentImpl.class;
            case 1878249461:
                return CredentialResponseImpl.class;
            case 1903095879:
                return BreakDownImpl.class;
            case 1921271336:
                return TransactionUriImpl.class;
            case 1954646997:
                return FBPayAuthFactorImpl.class;
            case 1977287373:
                return FBPayECPShippingOptionsFragmentImpl.class;
            case 1990009656:
                return PayoutRecordDetailsViewQueryResponseImpl.class;
            case 2020604171:
                return SharedPaymentsErrorMaybeDeadImpl.class;
            case 2021521241:
                return FBPayVerifyFactorMutationFragmentImpl.class;
            case 2049713287:
                return TokenizedCardCredentialImpl.class;
            case 2060456807:
                return CompleteLinkPaypalMutationResponseImpl.class;
            case 2063789877:
                return TopLevelDialogImpl.class;
            case 2065636552:
                return FBPayShopPayInitLinkMutationFragmentImpl.class;
            default:
                throw new ClassNotFoundException(AnonymousClass00U.A0J("Unexpected type tag: ", i));
        }
    }
}
