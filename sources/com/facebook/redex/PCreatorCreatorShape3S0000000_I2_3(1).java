package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass00U;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass23V;
import X.AnonymousClass67H;
import X.AnonymousClass67P;
import X.AnonymousClass68F;
import X.AnonymousClass68M;
import X.AnonymousClass692;
import X.AnonymousClass697;
import X.AnonymousClass69P;
import X.AnonymousClass69R;
import X.AnonymousClass69W;
import X.AnonymousClass7BF;
import X.C04220Ms;
import X.C116876xh;
import X.C116886xi;
import X.C116906xk;
import X.C147878q4;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18240wQ;
import X.C40307LcE;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C967666p;
import X.C969767l;
import X.C971368b;
import X.C973068v;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.impl.client.cache.CacheConfig;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.common.locale.Country;
import com.facebook.graphql.impls.AlternativePaymentMethodImpl;
import com.facebook.graphql.impls.CreditCardCredentialImpl;
import com.facebook.graphql.impls.PaypalBAImpl;
import com.facebook.graphql.impls.TokenizedCardCredentialImpl;
import com.facebook.graphql.modelutil.parcel.TreeParcelable;
import com.facebook.graphservice.interfaces.Tree;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.Distance;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellAction;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellSection;
import com.facebookpay.connect.models.ConnectAddressDetails;
import com.facebookpay.connect.models.ConnectBulletCellConfig;
import com.facebookpay.connect.models.ConnectContactDetails;
import com.facebookpay.connect.models.ConnectErrorDialogConfig;
import com.facebookpay.connect.models.ConnectExitConfirmationDialogConfig;
import com.facebookpay.connect.models.ConnectLearnMoreConfig;
import com.facebookpay.connect.models.ConnectNavigationBarStyle;
import com.facebookpay.connect.models.ConnectPayload;
import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.expresscheckout.models.AuthScreenStyle;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutResponse;
import com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue;
import com.facebookpay.expresscheckout.models.DefaultCreditCardFields;
import com.facebookpay.expresscheckout.models.DefaultPaymentMethodFields;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.expresscheckout.models.ECPAvailabilityResponseParams;
import com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration;
import com.facebookpay.expresscheckout.models.ECPOffer;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.expresscheckout.models.ECPPreselectedFBPayData;
import com.facebookpay.expresscheckout.models.EcpNuxLearnMoreScreenStyle;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.FulfillmentOptions;
import com.facebookpay.expresscheckout.models.FulfillmentPickupOption;
import com.facebookpay.expresscheckout.models.ItemDetails;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.expresscheckout.models.OffersList;
import com.facebookpay.expresscheckout.models.PaymentHandledResponseData;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.PickupInfo;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.expresscheckout.models.ShippingOption;
import com.facebookpay.expresscheckout.models.ShippingOptions;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.address.BriefAddressCellParams;
import com.facebookpay.form.cell.addresslist.AddressListCellParams;
import com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams;
import com.facebookpay.form.cell.checkbox.CheckboxCellParams;
import com.facebookpay.form.cell.contactinfo.ContactInfoCellParams;
import com.facebookpay.form.cell.creditcard.CardScannerCellParams;
import com.facebookpay.form.cell.creditcard.CreditCardCellParams;
import com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams;
import com.facebookpay.form.cell.label.LabelCellParams;
import com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams;
import com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams;
import com.facebookpay.form.cell.logging.FormCellFocusEvents;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.selector.SelectorCellParams;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.form.cell.text.formatter.CreditCardFormatter;
import com.facebookpay.form.cell.text.formatter.DateFormatter;
import com.facebookpay.form.cell.text.formatter.NameFormatter;
import com.facebookpay.form.cell.text.formatter.PhoneFormatter;
import com.facebookpay.form.cell.text.formatter.UpperCaseFormatter;
import com.facebookpay.form.cell.text.util.CvvTextFieldHandler;
import com.facebookpay.form.cell.toggle.SwitchCellParams;
import com.facebookpay.form.fragment.model.FeatureConfiguration;
import com.facebookpay.form.fragment.model.FormClickEvent;
import com.facebookpay.form.fragment.model.FormDisplayEvent;
import com.facebookpay.form.fragment.model.FormLoggingEvents;
import com.facebookpay.form.fragment.model.FormMutationEvent;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.fragment.model.ListCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.form.model.FormCountry;
import com.facebookpay.form.model.FormField;
import com.facebookpay.fulfillmentoption.model.FulfillmentOptionComponent;
import com.facebookpay.fulfillmentoption.model.FulfillmentPickupOptionComponent;
import com.facebookpay.fulfillmentoption.model.FulfillmentShippingOptionComponent;
import com.facebookpay.incentives.model.ECPOffsiteOffer;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.facebookpay.incentives.model.IncentiveCredentialList;
import com.facebookpay.incentives.model.IncentiveList;
import com.facebookpay.msc.logging.LoggingData;
import com.facebookpay.otc.models.OtcInput;
import com.facebookpay.otc.models.OtcOptionState;
import com.facebookpay.paymentmethod.model.APMCredential;
import com.facebookpay.paymentmethod.model.CreditCard;
import com.facebookpay.paymentmethod.model.PayPalCredential;
import com.facebookpay.paymentmethod.model.TokenizedCard;
import com.facebookpay.paypal.model.LinkableTextParams;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.fbpay.hub.common.link.LinkParams;
import com.fbpay.hub.contactinfo.address.api.FBPayAddress;
import com.fbpay.hub.form.params.FormDialogParams;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.merchantinfo.api.MerchantInfo;
import com.fbpay.hub.orders.api.FBPayOrder;
import com.fbpay.logging.LoggingPolicy;
import com.google.common.collect.ImmutableMap;
import com.instagram.debug.devoptions.cam.AnimationSpecKt;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.debug.devoptions.debughead.linechart.LineChartView;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class PCreatorCreatorShape3S0000000_I2_3 implements Parcelable.Creator {
    public final int A00;

    public PCreatorCreatorShape3S0000000_I2_3(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer A0b;
        Object createFromParcel;
        Tree A02;
        C969767l valueOf;
        C969767l valueOf2;
        Boolean valueOf3;
        Boolean valueOf4;
        Boolean valueOf5;
        Boolean valueOf6;
        Integer A002;
        AnonymousClass69W valueOf7;
        Object createFromParcel2;
        Object createFromParcel3;
        Object createFromParcel4;
        LinkedHashMap A0v;
        Object createFromParcel5;
        Object createFromParcel6;
        Object createFromParcel7;
        Object createFromParcel8;
        LinkedHashSet linkedHashSet;
        C40307LcE valueOf8;
        Long valueOf9;
        Object createFromParcel9;
        Integer num;
        C973068v valueOf10;
        AnonymousClass23V valueOf11;
        ArrayList A0k;
        ArrayList A0k2;
        Object createFromParcel10;
        Object createFromParcel11;
        Object createFromParcel12;
        Integer A003;
        Integer A004;
        AnonymousClass69W r0;
        ArrayList A0k3;
        ArrayList A0k4;
        Object createFromParcel13;
        Object createFromParcel14;
        Object createFromParcel15;
        ArrayList A0k5;
        ArrayList A0k6;
        Object createFromParcel16;
        Integer A0b2;
        Integer A0b3;
        Object createFromParcel17;
        AnonymousClass697 valueOf12;
        Object createFromParcel18;
        Object createFromParcel19;
        Integer A0b4;
        ArrayList A0k7;
        Integer num2;
        AnonymousClass69W valueOf13;
        Boolean valueOf14;
        Boolean valueOf15;
        Object createFromParcel20;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                String A0q = C86104wH.A0q(parcel2);
                int readInt = parcel2.readInt();
                ArrayList A0k8 = C18240wQ.A0k(readInt);
                for (int i = 0; i != readInt; i = C86124wJ.A0B(parcel2, ECPConfirmationUpsellAction.CREATOR, A0k8, i)) {
                }
                return new ECPConfirmationUpsellSection(A0q, A0k8);
            case 1:
                return new ConnectAddressDetails(C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 2:
                if (C86104wH.A09(parcel2) == 0) {
                    A0b = null;
                } else {
                    A0b = C86114wI.A0b(parcel2);
                }
                return new ConnectBulletCellConfig(A0b, parcel2.readString());
            case 3:
                return new ConnectContactDetails(C86104wH.A0q(parcel2), parcel2.readString());
            case 4:
                return new ConnectErrorDialogConfig(C86104wH.A09(parcel2), parcel2.readInt(), parcel2.readInt(), parcel2.readInt());
            case 5:
                return new ConnectExitConfirmationDialogConfig(C86104wH.A09(parcel2), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt());
            case 6:
                return new ConnectLearnMoreConfig(C86104wH.A0q(parcel2), parcel2.readString(), (AnonymousClass0ZU) parcel2.readSerializable());
            case 7:
                return ConnectNavigationBarStyle.valueOf(C86104wH.A0q(parcel2));
            case 8:
                String A0q2 = C86104wH.A0q(parcel2);
                String readString = parcel2.readString();
                int readInt2 = parcel2.readInt();
                ArrayList A0k9 = C18240wQ.A0k(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    A0k9.add(C18180wK.A0A(parcel2, ConnectPayload.class));
                }
                Object obj = null;
                if (parcel2.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = ConnectContactDetails.CREATOR.createFromParcel(parcel2);
                }
                ConnectContactDetails connectContactDetails = (ConnectContactDetails) createFromParcel;
                if (parcel2.readInt() != 0) {
                    obj = ConnectAddressDetails.CREATOR.createFromParcel(parcel2);
                }
                return new ConnectPayload((ConnectAddressDetails) obj, connectContactDetails, A0q2, readString, A0k9);
            case 9:
                return new ComponentLoggingData((ImmutableMap) parcel2.readSerializable(), C86104wH.A0q(parcel2), parcel2.readString());
            case 10:
                int A09 = C86104wH.A09(parcel2);
                if (A09 == 1) {
                    try {
                        TreeParcelable A005 = TreeParcelable.A00(parcel2);
                        if (!(A005 == null || (A02 = A005.A02()) == null)) {
                            return new APMConfiguration((C147878q4) A02);
                        }
                    } catch (Exception e) {
                        throw new IllegalArgumentException("Invalid parcel passed", e);
                    }
                } else if (A09 != -1) {
                    throw C18180wK.A0a(AnonymousClass00U.A0J("Invalid mode integer at beginning of parcel: ", A09));
                }
                throw AnonymousClass0wJ.A0b();
            case 11:
                return new AuthScreenStyle(C86104wH.A09(parcel2));
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                String A0q3 = C86104wH.A0q(parcel2);
                int readInt3 = parcel2.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt3);
                boolean z = false;
                for (int i3 = 0; i3 != readInt3; i3++) {
                    linkedHashSet2.add(AnonymousClass68M.valueOf(parcel2.readString()));
                }
                int readInt4 = parcel2.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(readInt4);
                for (int i4 = 0; i4 != readInt4; i4++) {
                    linkedHashSet3.add(AnonymousClass68F.valueOf(parcel2.readString()));
                }
                String readString2 = parcel2.readString();
                boolean A1W = C86104wH.A1W(parcel2);
                Boolean bool = null;
                if (parcel2.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = C969767l.valueOf(parcel2.readString());
                }
                if (parcel2.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = C969767l.valueOf(parcel2.readString());
                }
                if (parcel2.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(C86104wH.A1W(parcel2));
                }
                if (parcel2.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(C86104wH.A1W(parcel2));
                }
                if (parcel2.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = Boolean.valueOf(C86104wH.A1W(parcel2));
                }
                if (parcel2.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    valueOf6 = Boolean.valueOf(C86104wH.A1W(parcel2));
                }
                APMConfiguration aPMConfiguration = (APMConfiguration) C18180wK.A0A(parcel2, CheckoutConfiguration.class);
                String readString3 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    if (parcel2.readInt() != 0) {
                        z = true;
                    }
                    bool = Boolean.valueOf(z);
                }
                return new CheckoutConfiguration(aPMConfiguration, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool, A0q3, readString2, readString3, linkedHashSet2, linkedHashSet3, A1W);
            case 13:
                String A0q4 = C86104wH.A0q(parcel2);
                Object obj2 = null;
                if (parcel2.readInt() == 0) {
                    A002 = null;
                } else {
                    A002 = AnonymousClass7BF.A00(parcel2.readString());
                }
                String readString4 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    obj2 = ECPPaymentResponseParams.CREATOR.createFromParcel(parcel2);
                }
                return new CheckoutResponse((ECPPaymentResponseParams) obj2, A002, A0q4, readString4);
            case 14:
                return new CheckoutSetupKeyValue(C86104wH.A0q(parcel2), parcel2.readString());
            case 15:
                if (C86104wH.A09(parcel2) == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = AnonymousClass69W.valueOf(parcel2.readString());
                }
                return new DefaultCreditCardFields(valueOf7, parcel2.readString());
            case 16:
                if (C86104wH.A09(parcel2) == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = DefaultCreditCardFields.CREATOR.createFromParcel(parcel2);
                }
                return new DefaultPaymentMethodFields((DefaultCreditCardFields) createFromParcel2);
            case LangUtils.HASH_SEED /*17*/:
                String A0q5 = C86104wH.A0q(parcel2);
                String readString5 = parcel2.readString();
                int readInt5 = parcel2.readInt();
                PaymentReceiverInfo paymentReceiverInfo = (PaymentReceiverInfo) PaymentReceiverInfo.CREATOR.createFromParcel(parcel2);
                String readString6 = parcel2.readString();
                String readString7 = parcel2.readString();
                int readInt6 = parcel2.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(readInt6);
                for (int i5 = 0; i5 != readInt6; i5++) {
                    linkedHashSet4.add(AnonymousClass68M.valueOf(parcel2.readString()));
                }
                int readInt7 = parcel2.readInt();
                LinkedHashSet linkedHashSet5 = new LinkedHashSet(readInt7);
                for (int i6 = 0; i6 != readInt7; i6++) {
                    linkedHashSet5.add(AnonymousClass68F.valueOf(parcel2.readString()));
                }
                return new ECPAvailabilityRequestParams((ECPPaymentConfiguration) ECPPaymentConfiguration.CREATOR.createFromParcel(parcel2), paymentReceiverInfo, (LoggingPolicy) C18180wK.A0A(parcel2, ECPAvailabilityRequestParams.class), A0q5, readString5, readString6, readString7, linkedHashSet4, linkedHashSet5, readInt5, C86104wH.A1W(parcel2), C86104wH.A1W(parcel2), C86104wH.A1W(parcel2));
            case 18:
                int A092 = C86104wH.A09(parcel2);
                boolean z2 = true;
                boolean A1V = C18180wK.A1V(parcel2.readInt());
                if (parcel2.readInt() == 0) {
                    z2 = false;
                }
                if (parcel2.readInt() == 0) {
                    createFromParcel3 = null;
                } else {
                    createFromParcel3 = DefaultPaymentMethodFields.CREATOR.createFromParcel(parcel2);
                }
                return new ECPAvailabilityResponseParams((DefaultPaymentMethodFields) createFromParcel3, A092, A1V, z2);
            case 19:
                C04220Ms.A0B(parcel2, 0);
                return new ECPConfirmationConfiguration((ECPConfirmationUpsellSection) C18180wK.A0A(parcel2, ECPConfirmationConfiguration.class), parcel2.readString());
            case 20:
                return new ECPOffer(C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 21:
                C971368b valueOf16 = C971368b.valueOf(C86104wH.A0q(parcel2));
                String readString8 = parcel2.readString();
                String readString9 = parcel2.readString();
                int readInt8 = parcel2.readInt();
                ArrayList A0k10 = C18240wQ.A0k(readInt8);
                for (int i7 = 0; i7 != readInt8; i7++) {
                    A0k10.add(AnonymousClass67H.valueOf(parcel2.readString()));
                }
                Class<ECPPaymentConfiguration> cls = ECPPaymentConfiguration.class;
                CurrencyAmount currencyAmount = (CurrencyAmount) C18180wK.A0A(parcel2, cls);
                int readInt9 = parcel2.readInt();
                ArrayList A0k11 = C18240wQ.A0k(readInt9);
                for (int i8 = 0; i8 != readInt9; i8++) {
                    A0k11.add(AnonymousClass692.valueOf(parcel2.readString()));
                }
                LinkedHashSet linkedHashSet6 = null;
                if (parcel2.readInt() == 0) {
                    createFromParcel4 = null;
                } else {
                    createFromParcel4 = KnownData.CREATOR.createFromParcel(parcel2);
                }
                KnownData knownData = (KnownData) createFromParcel4;
                ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
                if (parcel2.readInt() == 0) {
                    A0v = null;
                } else {
                    int readInt10 = parcel2.readInt();
                    A0v = C18190wL.A0v(readInt10);
                    for (int i9 = 0; i9 != readInt10; i9++) {
                        A0v.put(AnonymousClass692.valueOf(parcel2.readString()), parcel2.readBundle(cls.getClassLoader()));
                    }
                }
                if (parcel2.readInt() != 0) {
                    int readInt11 = parcel2.readInt();
                    linkedHashSet6 = new LinkedHashSet(readInt11);
                    for (int i10 = 0; i10 != readInt11; i10++) {
                        linkedHashSet6.add(C967666p.valueOf(parcel2.readString()));
                    }
                }
                return new ECPPaymentConfiguration(currencyAmount, knownData, valueOf16, readString8, readString9, A0k10, A0k11, createStringArrayList, A0v, linkedHashSet6);
            case 22:
                String A0q6 = C86104wH.A0q(parcel2);
                String readString10 = parcel2.readString();
                EcpUIConfiguration ecpUIConfiguration = (EcpUIConfiguration) EcpUIConfiguration.CREATOR.createFromParcel(parcel2);
                String readString11 = parcel2.readString();
                String readString12 = parcel2.readString();
                int readInt12 = parcel2.readInt();
                Object obj3 = null;
                if (parcel2.readInt() == 0) {
                    createFromParcel5 = null;
                } else {
                    createFromParcel5 = PaymentReceiverInfo.CREATOR.createFromParcel(parcel2);
                }
                PaymentReceiverInfo paymentReceiverInfo2 = (PaymentReceiverInfo) createFromParcel5;
                if (parcel2.readInt() == 0) {
                    createFromParcel6 = null;
                } else {
                    createFromParcel6 = CheckoutConfiguration.CREATOR.createFromParcel(parcel2);
                }
                CheckoutConfiguration checkoutConfiguration = (CheckoutConfiguration) createFromParcel6;
                if (parcel2.readInt() == 0) {
                    createFromParcel7 = null;
                } else {
                    createFromParcel7 = ECPPaymentConfiguration.CREATOR.createFromParcel(parcel2);
                }
                ECPPaymentConfiguration eCPPaymentConfiguration = (ECPPaymentConfiguration) createFromParcel7;
                LoggingPolicy loggingPolicy = (LoggingPolicy) C18180wK.A0A(parcel2, ECPPaymentRequest.class);
                if (parcel2.readInt() != 0) {
                    obj3 = ECPConfirmationConfiguration.CREATOR.createFromParcel(parcel2);
                }
                return new ECPPaymentRequest(checkoutConfiguration, (ECPConfirmationConfiguration) obj3, eCPPaymentConfiguration, ecpUIConfiguration, paymentReceiverInfo2, loggingPolicy, A0q6, readString10, readString11, readString12, readInt12, C86104wH.A1W(parcel2));
            case 23:
                String A0q7 = C86104wH.A0q(parcel2);
                int readInt13 = parcel2.readInt();
                String readString13 = parcel2.readString();
                String readString14 = parcel2.readString();
                String readString15 = parcel2.readString();
                String readString16 = parcel2.readString();
                String readString17 = parcel2.readString();
                String readString18 = parcel2.readString();
                String readString19 = parcel2.readString();
                String readString20 = parcel2.readString();
                String readString21 = parcel2.readString();
                String readString22 = parcel2.readString();
                String readString23 = parcel2.readString();
                String readString24 = parcel2.readString();
                Class<ECPPaymentResponseParams> cls2 = ECPPaymentResponseParams.class;
                ShippingAddress shippingAddress = (ShippingAddress) C18180wK.A0A(parcel2, cls2);
                ShippingAddress shippingAddress2 = (ShippingAddress) C18180wK.A0A(parcel2, cls2);
                if (parcel2.readInt() == 0) {
                    createFromParcel8 = null;
                } else {
                    createFromParcel8 = ShippingOption.CREATOR.createFromParcel(parcel2);
                }
                ShippingOption shippingOption = (ShippingOption) createFromParcel8;
                FulfillmentOption fulfillmentOption = (FulfillmentOption) C18180wK.A0A(parcel2, cls2);
                if (parcel2.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int readInt14 = parcel2.readInt();
                    linkedHashSet = new LinkedHashSet(readInt14);
                    for (int i11 = 0; i11 != readInt14; i11++) {
                        linkedHashSet.add(AnonymousClass68F.valueOf(parcel2.readString()));
                    }
                }
                String readString25 = parcel2.readString();
                String readString26 = parcel2.readString();
                String readString27 = parcel2.readString();
                String readString28 = parcel2.readString();
                OtcInput otcInput = (OtcInput) C18180wK.A0A(parcel2, cls2);
                int readInt15 = parcel2.readInt();
                ArrayList A0k12 = C18240wQ.A0k(readInt15);
                for (int i12 = 0; i12 != readInt15; i12 = C86124wJ.A0B(parcel2, ECPOffer.CREATOR, A0k12, i12)) {
                }
                TransactionInfo transactionInfo = (TransactionInfo) TransactionInfo.CREATOR.createFromParcel(parcel2);
                String readString29 = parcel2.readString();
                boolean A1W2 = C86104wH.A1W(parcel2);
                if (parcel2.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = C40307LcE.valueOf(parcel2.readString());
                }
                if (parcel2.readInt() == 0) {
                    valueOf9 = null;
                } else {
                    valueOf9 = Long.valueOf(parcel2.readLong());
                }
                return new ECPPaymentResponseParams(fulfillmentOption, shippingOption, transactionInfo, valueOf8, otcInput, shippingAddress, shippingAddress2, valueOf9, A0q7, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, readString22, readString23, readString24, readString25, readString26, readString27, readString28, readString29, A0k12, linkedHashSet, readInt13, A1W2);
            case 24:
                return new ECPPreselectedFBPayData(C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 25:
                C04220Ms.A0B(parcel2, 0);
                return new EcpNuxLearnMoreScreenStyle((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2));
            case Rfc3492Idn.tmax /*26*/:
                AnonymousClass69R valueOf17 = AnonymousClass69R.valueOf(C86104wH.A0q(parcel2));
                AnonymousClass69R valueOf18 = AnonymousClass69R.valueOf(parcel2.readString());
                AnonymousClass69R valueOf19 = AnonymousClass69R.valueOf(parcel2.readString());
                AnonymousClass69R valueOf20 = AnonymousClass69R.valueOf(parcel2.readString());
                AnonymousClass69R valueOf21 = AnonymousClass69R.valueOf(parcel2.readString());
                AnonymousClass69R valueOf22 = AnonymousClass69R.valueOf(parcel2.readString());
                ItemDetails itemDetails = (ItemDetails) ItemDetails.CREATOR.createFromParcel(parcel2);
                Object obj4 = null;
                if (parcel2.readInt() == 0) {
                    createFromParcel9 = null;
                } else {
                    createFromParcel9 = AuthScreenStyle.CREATOR.createFromParcel(parcel2);
                }
                AuthScreenStyle authScreenStyle = (AuthScreenStyle) createFromParcel9;
                if (parcel2.readInt() != 0) {
                    obj4 = EcpNuxLearnMoreScreenStyle.CREATOR.createFromParcel(parcel2);
                }
                return new EcpUIConfiguration(authScreenStyle, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, AnonymousClass69R.valueOf(parcel2.readString()), (EcpNuxLearnMoreScreenStyle) obj4, itemDetails);
            case 27:
                return new FulfillmentOption((CurrencyAmount) C18180wK.A0A(parcel2, FulfillmentOption.class), C86104wH.A0q(parcel2), parcel2.readString(), (Date) parcel2.readSerializable(), (Date) parcel2.readSerializable());
            case 28:
                String A0q8 = C86104wH.A0q(parcel2);
                int readInt16 = parcel2.readInt();
                ArrayList A0k13 = C18240wQ.A0k(readInt16);
                for (int i13 = 0; i13 != readInt16; i13++) {
                    A0k13.add(C18180wK.A0A(parcel2, FulfillmentOptions.class));
                }
                return new FulfillmentOptions(A0q8, A0k13);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                Class<FulfillmentPickupOption> cls3 = FulfillmentPickupOption.class;
                return new FulfillmentPickupOption((CurrencyAmount) C18180wK.A0A(parcel2, cls3), (Distance) C18180wK.A0A(parcel2, cls3), (ShippingAddress) C18180wK.A0A(parcel2, cls3), C86104wH.A0q(parcel2), parcel2.readString(), (Date) parcel2.readSerializable(), (Date) parcel2.readSerializable(), C86104wH.A1W(parcel2));
            case 30:
                String A0q9 = C86104wH.A0q(parcel2);
                if (A0q9.equals("DEFAULT")) {
                    num = AnonymousClass006.A00;
                } else if (A0q9.equals("RESELLER")) {
                    num = AnonymousClass006.A01;
                } else {
                    throw C18190wL.A0a(A0q9);
                }
                return new ItemDetails(num, parcel2.readString());
            case 31:
                return new KnownData((ShippingAddress) C18180wK.A0A(parcel2, KnownData.class), C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 32:
                int A093 = C86104wH.A09(parcel2);
                ArrayList A0k14 = C18240wQ.A0k(A093);
                for (int i14 = 0; i14 != A093; i14 = C86124wJ.A0B(parcel2, ECPOffer.CREATOR, A0k14, i14)) {
                }
                return new OffersList(A0k14);
            case 33:
                String A0q10 = C86104wH.A0q(parcel2);
                if (A0q10.equals("SUBMIT_CONTAINER")) {
                    return new PaymentHandledResponseData(parcel2.readString());
                }
                throw C18190wL.A0a(A0q10);
            case 34:
                return new PaymentReceiverInfo(C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 35:
                return new PickupInfo(C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case Rfc3492Idn.base /*36*/:
                C04220Ms.A0B(parcel2, 0);
                CurrencyAmount currencyAmount2 = (CurrencyAmount) C18180wK.A0A(parcel2, PriceInfo.class);
                String readString30 = parcel2.readString();
                Integer num3 = null;
                if (parcel2.readInt() == 0) {
                    valueOf10 = null;
                } else {
                    valueOf10 = C973068v.valueOf(parcel2.readString());
                }
                if (parcel2.readInt() == 0) {
                    valueOf11 = null;
                } else {
                    valueOf11 = AnonymousClass23V.valueOf(parcel2.readString());
                }
                if (parcel2.readInt() != 0) {
                    num3 = C86114wI.A0b(parcel2);
                }
                return new PriceInfo(currencyAmount2, valueOf11, valueOf10, num3, readString30, parcel2.readString(), parcel2.readString(), parcel2.readString());
            case LangUtils.HASH_OFFSET /*37*/:
                C04220Ms.A0B(parcel2, 0);
                return new PromoCodeList(parcel2.createStringArrayList());
            case Rfc3492Idn.skew /*38*/:
                return new ShippingOption((CurrencyAmount) C18180wK.A0A(parcel2, ShippingOption.class), C116886xi.A00(parcel2.readString()), C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString());
            case 39:
                String A0q11 = C86104wH.A0q(parcel2);
                int readInt17 = parcel2.readInt();
                ArrayList A0k15 = C18240wQ.A0k(readInt17);
                for (int i15 = 0; i15 != readInt17; i15 = C86124wJ.A0B(parcel2, ShippingOption.CREATOR, A0k15, i15)) {
                }
                return new ShippingOptions(A0q11, A0k15);
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                String A0q12 = C86104wH.A0q(parcel2);
                String readString31 = parcel2.readString();
                Object obj5 = null;
                if (parcel2.readInt() == 0) {
                    A0k = null;
                } else {
                    int readInt18 = parcel2.readInt();
                    A0k = C18240wQ.A0k(readInt18);
                    for (int i16 = 0; i16 != readInt18; i16 = C86124wJ.A0B(parcel2, PriceInfo.CREATOR, A0k, i16)) {
                    }
                }
                if (parcel2.readInt() == 0) {
                    A0k2 = null;
                } else {
                    int readInt19 = parcel2.readInt();
                    A0k2 = C18240wQ.A0k(readInt19);
                    for (int i17 = 0; i17 != readInt19; i17 = C86124wJ.A0B(parcel2, PriceInfo.CREATOR, A0k2, i17)) {
                    }
                }
                if (parcel2.readInt() == 0) {
                    createFromParcel10 = null;
                } else {
                    createFromParcel10 = ShippingOptions.CREATOR.createFromParcel(parcel2);
                }
                ShippingOptions shippingOptions = (ShippingOptions) createFromParcel10;
                if (parcel2.readInt() == 0) {
                    createFromParcel11 = null;
                } else {
                    createFromParcel11 = FulfillmentOptions.CREATOR.createFromParcel(parcel2);
                }
                FulfillmentOptions fulfillmentOptions = (FulfillmentOptions) createFromParcel11;
                if (parcel2.readInt() == 0) {
                    createFromParcel12 = null;
                } else {
                    createFromParcel12 = PromoCodeList.CREATOR.createFromParcel(parcel2);
                }
                PromoCodeList promoCodeList = (PromoCodeList) createFromParcel12;
                ArrayList<String> createStringArrayList2 = parcel2.createStringArrayList();
                String readString32 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    A003 = null;
                } else {
                    A003 = C116886xi.A00(parcel2.readString());
                }
                if (parcel2.readInt() == 0) {
                    A004 = null;
                } else {
                    A004 = C116876xh.A00(parcel2.readString());
                }
                if (parcel2.readInt() != 0) {
                    obj5 = PickupInfo.CREATOR.createFromParcel(parcel2);
                }
                return new TransactionInfo(fulfillmentOptions, (PickupInfo) obj5, promoCodeList, shippingOptions, A003, A004, A0q12, readString31, readString32, A0k, A0k2, createStringArrayList2);
            case Seq.NULL_REFNUM /*41*/:
                return new AddressCellParams(parcel2);
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new BriefAddressCellParams(parcel2);
            case 43:
                C04220Ms.A0B(parcel2, 0);
                return new AddressListCellParams(parcel2);
            case 44:
                C04220Ms.A0B(parcel2, 0);
                return new AddressListHeaderCellParams(parcel2);
            case 45:
                C04220Ms.A0B(parcel2, 0);
                return new CheckboxCellParams(parcel2);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                C04220Ms.A0B(parcel2, 0);
                return new ContactInfoCellParams(parcel2);
            case 47:
                return new CardScannerCellParams(C86104wH.A09(parcel2), C86104wH.A1W(parcel2));
            case 48:
                return new CreditCardCellParams(parcel2);
            case 49:
                C04220Ms.A0B(parcel2, 0);
                return new FulfillmentOptionCellParams(parcel2);
            case AnimationSpecKt.IDLE_DURATION /*50*/:
                return new LabelCellParams(parcel2);
            case 51:
                int A094 = C86104wH.A09(parcel2);
                int readInt20 = parcel2.readInt();
                int readInt21 = parcel2.readInt();
                int readInt22 = parcel2.readInt();
                int readInt23 = parcel2.readInt();
                int readInt24 = parcel2.readInt();
                ArrayList A0k16 = C18240wQ.A0k(readInt24);
                for (int i18 = 0; i18 != readInt24; i18++) {
                    C18200wM.A1U(A0k16, parcel2.readInt());
                }
                return new PaymentMethodLabelCellParams(A0k16, A094, readInt20, readInt21, readInt22, readInt23);
            case 52:
                C04220Ms.A0B(parcel2, 0);
                return new SupportedLogosCellParams(parcel2);
            case 53:
                return new FormCellFocusEvents(C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 54:
                C04220Ms.A0B(parcel2, 0);
                return new FormCellLoggingEvents((FormCellFocusEvents) FormCellFocusEvents.CREATOR.createFromParcel(parcel2));
            case 57:
                return new TextCellParams(parcel2);
            case 58:
                return new TextValidatorParams(parcel2);
            case 59:
                C04220Ms.A0B(parcel2, 0);
                return new CreditCardFormatter(parcel2);
            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /*60*/:
                return new DateFormatter(parcel2);
            case 61:
                return new NameFormatter(parcel2);
            case 62:
                return new PhoneFormatter(parcel2);
            case StringTreeSet.PAYLOAD_MASK:
                return new UpperCaseFormatter(parcel2);
            case 64:
                String A0q13 = C86104wH.A0q(parcel2);
                if (A0q13 != null) {
                    r0 = AnonymousClass69W.valueOf(A0q13);
                } else {
                    r0 = null;
                }
                return new CvvTextFieldHandler(r0);
            case 65:
                return new SwitchCellParams(parcel2);
            case 66:
                boolean z3 = true;
                boolean A1V2 = C18180wK.A1V(C86104wH.A09(parcel2));
                if (parcel2.readInt() == 0) {
                    z3 = false;
                }
                return new FeatureConfiguration(A1V2, z3);
            case 67:
                return new FormClickEvent(C86104wH.A0q(parcel2), parcel2.readString());
            case 68:
                return new FormDisplayEvent(C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString());
            case 69:
                Object obj6 = null;
                if (C86104wH.A09(parcel2) == 0) {
                    A0k3 = null;
                } else {
                    int readInt25 = parcel2.readInt();
                    A0k3 = C18240wQ.A0k(readInt25);
                    for (int i19 = 0; i19 != readInt25; i19 = C86124wJ.A0B(parcel2, FormDisplayEvent.CREATOR, A0k3, i19)) {
                    }
                }
                if (parcel2.readInt() == 0) {
                    A0k4 = null;
                } else {
                    int readInt26 = parcel2.readInt();
                    A0k4 = C18240wQ.A0k(readInt26);
                    for (int i20 = 0; i20 != readInt26; i20 = C86124wJ.A0B(parcel2, FormClickEvent.CREATOR, A0k4, i20)) {
                    }
                }
                if (parcel2.readInt() == 0) {
                    createFromParcel13 = null;
                } else {
                    createFromParcel13 = FormClickEvent.CREATOR.createFromParcel(parcel2);
                }
                FormClickEvent formClickEvent = (FormClickEvent) createFromParcel13;
                if (parcel2.readInt() == 0) {
                    createFromParcel14 = null;
                } else {
                    createFromParcel14 = FormClickEvent.CREATOR.createFromParcel(parcel2);
                }
                FormClickEvent formClickEvent2 = (FormClickEvent) createFromParcel14;
                if (parcel2.readInt() == 0) {
                    createFromParcel15 = null;
                } else {
                    createFromParcel15 = FormClickEvent.CREATOR.createFromParcel(parcel2);
                }
                FormClickEvent formClickEvent3 = (FormClickEvent) createFromParcel15;
                if (parcel2.readInt() == 0) {
                    A0k5 = null;
                } else {
                    int readInt27 = parcel2.readInt();
                    A0k5 = C18240wQ.A0k(readInt27);
                    for (int i21 = 0; i21 != readInt27; i21 = C86124wJ.A0B(parcel2, FormMutationEvent.CREATOR, A0k5, i21)) {
                    }
                }
                if (parcel2.readInt() == 0) {
                    A0k6 = null;
                } else {
                    int readInt28 = parcel2.readInt();
                    A0k6 = C18240wQ.A0k(readInt28);
                    for (int i22 = 0; i22 != readInt28; i22 = C86124wJ.A0B(parcel2, FormMutationEvent.CREATOR, A0k6, i22)) {
                    }
                }
                if (parcel2.readInt() == 0) {
                    createFromParcel16 = null;
                } else {
                    createFromParcel16 = FormMutationEvent.CREATOR.createFromParcel(parcel2);
                }
                FormMutationEvent formMutationEvent = (FormMutationEvent) createFromParcel16;
                if (parcel2.readInt() != 0) {
                    obj6 = FormMutationEvent.CREATOR.createFromParcel(parcel2);
                }
                return new FormLoggingEvents(formClickEvent, formClickEvent2, formClickEvent3, formMutationEvent, (FormMutationEvent) obj6, A0k3, A0k4, A0k5, A0k6);
            case LineChartView.MARGIN_TICKS /*70*/:
                return new FormMutationEvent(C86104wH.A0q(parcel2), parcel2.readString());
            case 71:
                int A095 = C86104wH.A09(parcel2);
                String readString33 = parcel2.readString();
                int readInt29 = parcel2.readInt();
                if (parcel2.readInt() == 0) {
                    A0b2 = null;
                } else {
                    A0b2 = C86114wI.A0b(parcel2);
                }
                if (parcel2.readInt() == 0) {
                    A0b3 = null;
                } else {
                    A0b3 = C86114wI.A0b(parcel2);
                }
                int readInt30 = parcel2.readInt();
                ArrayList A0k17 = C18240wQ.A0k(readInt30);
                for (int i23 = 0; i23 != readInt30; i23++) {
                    A0k17.add(C18180wK.A0A(parcel2, FormParams.class));
                }
                if (parcel2.readInt() == 0) {
                    createFromParcel17 = null;
                } else {
                    createFromParcel17 = FormLoggingEvents.CREATOR.createFromParcel(parcel2);
                }
                FormLoggingEvents formLoggingEvents = (FormLoggingEvents) createFromParcel17;
                if (parcel2.readInt() == 0) {
                    valueOf12 = null;
                } else {
                    valueOf12 = AnonymousClass697.valueOf(parcel2.readString());
                }
                int readInt31 = parcel2.readInt();
                int readInt32 = parcel2.readInt();
                int readInt33 = parcel2.readInt();
                int readInt34 = parcel2.readInt();
                if (parcel2.readInt() == 0) {
                    createFromParcel18 = null;
                } else {
                    createFromParcel18 = ListCellParams.CREATOR.createFromParcel(parcel2);
                }
                ListCellParams listCellParams = (ListCellParams) createFromParcel18;
                if (parcel2.readInt() == 0) {
                    createFromParcel19 = null;
                } else {
                    createFromParcel19 = FeatureConfiguration.CREATOR.createFromParcel(parcel2);
                }
                FeatureConfiguration featureConfiguration = (FeatureConfiguration) createFromParcel19;
                if (parcel2.readInt() == 0) {
                    A0b4 = null;
                } else {
                    A0b4 = C86114wI.A0b(parcel2);
                }
                if (parcel2.readInt() == 0) {
                    A0k7 = null;
                } else {
                    int readInt35 = parcel2.readInt();
                    A0k7 = C18240wQ.A0k(readInt35);
                    for (int i24 = 0; i24 != readInt35; i24++) {
                        C18200wM.A1U(A0k7, parcel2.readInt());
                    }
                }
                CellParams cellParams = (CellParams) C18180wK.A0A(parcel2, FormParams.class);
                if (parcel2.readInt() == 0) {
                    num2 = null;
                } else {
                    String readString34 = parcel2.readString();
                    if (readString34.equals("ECP_ADD_ADDRESS")) {
                        num2 = AnonymousClass006.A00;
                    } else if (readString34.equals("ECP_EDIT_ADDRESS")) {
                        num2 = AnonymousClass006.A01;
                    } else {
                        throw C18190wL.A0a(readString34);
                    }
                }
                int readInt36 = parcel2.readInt();
                if (parcel2.readInt() == 0) {
                    valueOf13 = null;
                } else {
                    valueOf13 = AnonymousClass69W.valueOf(parcel2.readString());
                }
                return new FormParams(cellParams, featureConfiguration, formLoggingEvents, listCellParams, valueOf12, valueOf13, A0b2, A0b3, A0b4, num2, readString33, A0k17, A0k7, (AnonymousClass0YY) parcel2.readSerializable(), A095, readInt29, readInt31, readInt32, readInt33, readInt34, readInt36, C86104wH.A1W(parcel2));
            case Rfc3492Idn.initial_bias /*72*/:
                return new ListCellParams(C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString());
            case 73:
                C04220Ms.A0B(parcel2, 0);
                Country country = (Country) C18180wK.A0A(parcel2, AddressFormFieldsConfig.class);
                int readInt37 = parcel2.readInt();
                ArrayList A0k18 = C18240wQ.A0k(readInt37);
                for (int i25 = 0; i25 != readInt37; i25 = C86124wJ.A0B(parcel2, FormCountry.CREATOR, A0k18, i25)) {
                }
                return new AddressFormFieldsConfig(country, A0k18);
            case 74:
                C04220Ms.A0B(parcel2, 0);
                Country country2 = (Country) C18180wK.A0A(parcel2, FormCountry.class);
                int readInt38 = parcel2.readInt();
                ArrayList A0k19 = C18240wQ.A0k(readInt38);
                for (int i26 = 0; i26 != readInt38; i26 = C86124wJ.A0B(parcel2, FormField.CREATOR, A0k19, i26)) {
                }
                return new FormCountry(country2, A0k19);
            case 75:
                String A0q14 = C86104wH.A0q(parcel2);
                String readString35 = parcel2.readString();
                String readString36 = parcel2.readString();
                String readString37 = parcel2.readString();
                boolean A1V3 = C18180wK.A1V(parcel2.readInt());
                int readInt39 = parcel2.readInt();
                ArrayList A0k20 = C18240wQ.A0k(readInt39);
                for (int i27 = 0; i27 != readInt39; i27++) {
                    A0k20.add(C18180wK.A0A(parcel2, FormField.class));
                }
                return new FormField(C116906xk.A00(parcel2.readString()), A0q14, readString35, readString36, readString37, A0k20, A1V3);
            case 76:
                return new FulfillmentOptionComponent((CurrencyAmount) C18180wK.A0A(parcel2, FulfillmentOptionComponent.class), C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString());
            case 77:
                String A0q15 = C86104wH.A0q(parcel2);
                String readString38 = parcel2.readString();
                Class<FulfillmentPickupOptionComponent> cls4 = FulfillmentPickupOptionComponent.class;
                CurrencyAmount currencyAmount3 = (CurrencyAmount) C18180wK.A0A(parcel2, cls4);
                String readString39 = parcel2.readString();
                Date date = (Date) parcel2.readSerializable();
                Date date2 = (Date) parcel2.readSerializable();
                if (parcel2.readInt() == 0) {
                    valueOf14 = null;
                } else {
                    valueOf14 = Boolean.valueOf(C86104wH.A1W(parcel2));
                }
                return new FulfillmentPickupOptionComponent(currencyAmount3, (Distance) C18180wK.A0A(parcel2, cls4), (ShippingAddress) C18180wK.A0A(parcel2, cls4), valueOf14, A0q15, readString38, readString39, date, date2, C86104wH.A1W(parcel2));
            case 78:
                return new FulfillmentShippingOptionComponent((CurrencyAmount) C18180wK.A0A(parcel2, FulfillmentShippingOptionComponent.class), C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString(), (Date) parcel2.readSerializable(), (Date) parcel2.readSerializable());
            case 79:
                String A0q16 = C86104wH.A0q(parcel2);
                String readString40 = parcel2.readString();
                String readString41 = parcel2.readString();
                String readString42 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf15 = null;
                } else {
                    valueOf15 = Boolean.valueOf(C86104wH.A1W(parcel2));
                }
                return new ECPOffsiteOffer((CurrencyAmount) C18180wK.A0A(parcel2, ECPOffsiteOffer.class), valueOf15, A0q16, readString40, readString41, readString42, parcel2.readString());
            case 80:
                return new ECPOnsiteOffer((CurrencyAmount) C18180wK.A0A(parcel2, ECPOnsiteOffer.class), C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), C86104wH.A1W(parcel2));
            case 81:
                C04220Ms.A0B(parcel2, 0);
                return new IncentiveCredentialList(parcel2.createStringArrayList());
            case 82:
                int A096 = C86104wH.A09(parcel2);
                ArrayList A0k21 = C18240wQ.A0k(A096);
                for (int i28 = 0; i28 != A096; i28++) {
                    A0k21.add(C18180wK.A0A(parcel2, IncentiveList.class));
                }
                return new IncentiveList(A0k21);
            case 83:
                return new LoggingData(C86104wH.A0q(parcel2));
            case 84:
                return new OtcInput(C86104wH.A0q(parcel2), parcel2.readString());
            case 85:
                String A0q17 = C86104wH.A0q(parcel2);
                int readInt40 = parcel2.readInt();
                LinkedHashMap A0v2 = C18190wL.A0v(readInt40);
                int i29 = 0;
                while (true) {
                    String readString43 = parcel2.readString();
                    if (i29 == readInt40) {
                        return new OtcOptionState(AnonymousClass67P.valueOf(readString43), A0q17, parcel2.readString(), A0v2);
                    }
                    A0v2.put(AnonymousClass69P.valueOf(readString43), AnonymousClass67P.valueOf(parcel2.readString()));
                    i29++;
                }
            case 86:
                C04220Ms.A0B(parcel2, 0);
                return new APMCredential((AlternativePaymentMethodImpl) C86114wI.A0e(parcel2, APMCredential.class), C40307LcE.valueOf(parcel2.readString()), C86104wH.A1W(parcel2));
            case 87:
                C04220Ms.A0B(parcel2, 0);
                CreditCardCredentialImpl creditCardCredentialImpl = (CreditCardCredentialImpl) C86114wI.A0e(parcel2, CreditCard.class);
                boolean z4 = true;
                boolean A1V4 = C18180wK.A1V(parcel2.readInt());
                if (parcel2.readInt() == 0) {
                    z4 = false;
                }
                return new CreditCard(creditCardCredentialImpl, A1V4, z4);
            case 88:
                C04220Ms.A0B(parcel2, 0);
                return new PayPalCredential((PaypalBAImpl) C86114wI.A0e(parcel2, PayPalCredential.class), parcel2.readString(), C86104wH.A1W(parcel2));
            case 89:
                C04220Ms.A0B(parcel2, 0);
                Class<TokenizedCard> cls5 = TokenizedCard.class;
                CreditCardCredentialImpl creditCardCredentialImpl2 = (CreditCardCredentialImpl) C86114wI.A0e(parcel2, cls5);
                TokenizedCardCredentialImpl tokenizedCardCredentialImpl = (TokenizedCardCredentialImpl) C86114wI.A0e(parcel2, cls5);
                boolean z5 = true;
                boolean A1V5 = C18180wK.A1V(parcel2.readInt());
                if (parcel2.readInt() == 0) {
                    z5 = false;
                }
                return new TokenizedCard(creditCardCredentialImpl2, tokenizedCardCredentialImpl, A1V5, z5);
            case 90:
                return new LinkableTextParams(C86104wH.A0q(parcel2), parcel2.readInt(), parcel2.readInt(), parcel2.readString());
            case 91:
                String A0q18 = C86104wH.A0q(parcel2);
                String readString44 = parcel2.readString();
                String readString45 = parcel2.readString();
                LoggingPolicy loggingPolicy2 = (LoggingPolicy) C18180wK.A0A(parcel2, PaypalConsentLaunchParams.class);
                String readString46 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    createFromParcel20 = null;
                } else {
                    createFromParcel20 = LinkableTextParams.CREATOR.createFromParcel(parcel2);
                }
                return new PaypalConsentLaunchParams((LinkableTextParams) createFromParcel20, loggingPolicy2, A0q18, readString44, readString45, readString46, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), C86104wH.A1W(parcel2));
            case 92:
                return new ShippingAddress(C86104wH.A0q(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), C86104wH.A1W(parcel2), C86104wH.A1W(parcel2), C86104wH.A1W(parcel2), C86104wH.A1W(parcel2), C86104wH.A1W(parcel2));
            case 93:
                return new LinkParams(parcel2);
            case 94:
                return new FBPayAddress(parcel2);
            case 95:
                return new FormDialogParams(parcel2);
            case 96:
                return new FormLogEvents(parcel2);
            case 97:
                return new com.fbpay.hub.form.params.FormParams(parcel2);
            case 98:
                return new MerchantInfo(parcel2);
            case 99:
                return new FBPayOrder(parcel2);
            default:
                return new SelectorCellParams(parcel2);
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ECPConfirmationUpsellSection[i];
            case 1:
                return new ConnectAddressDetails[i];
            case 2:
                return new ConnectBulletCellConfig[i];
            case 3:
                return new ConnectContactDetails[i];
            case 4:
                return new ConnectErrorDialogConfig[i];
            case 5:
                return new ConnectExitConfirmationDialogConfig[i];
            case 6:
                return new ConnectLearnMoreConfig[i];
            case 7:
                return new ConnectNavigationBarStyle[i];
            case 8:
                return new ConnectPayload[i];
            case 9:
                return new ComponentLoggingData[i];
            case 10:
                return new APMConfiguration[i];
            case 11:
                return new AuthScreenStyle[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new CheckoutConfiguration[i];
            case 13:
                return new CheckoutResponse[i];
            case 14:
                return new CheckoutSetupKeyValue[i];
            case 15:
                return new DefaultCreditCardFields[i];
            case 16:
                return new DefaultPaymentMethodFields[i];
            case LangUtils.HASH_SEED /*17*/:
                return new ECPAvailabilityRequestParams[i];
            case 18:
                return new ECPAvailabilityResponseParams[i];
            case 19:
                return new ECPConfirmationConfiguration[i];
            case 20:
                return new ECPOffer[i];
            case 21:
                return new ECPPaymentConfiguration[i];
            case 22:
                return new ECPPaymentRequest[i];
            case 23:
                return new ECPPaymentResponseParams[i];
            case 24:
                return new ECPPreselectedFBPayData[i];
            case 25:
                return new EcpNuxLearnMoreScreenStyle[i];
            case Rfc3492Idn.tmax /*26*/:
                return new EcpUIConfiguration[i];
            case 27:
                return new FulfillmentOption[i];
            case 28:
                return new FulfillmentOptions[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new FulfillmentPickupOption[i];
            case 30:
                return new ItemDetails[i];
            case 31:
                return new KnownData[i];
            case 32:
                return new OffersList[i];
            case 33:
                return new PaymentHandledResponseData[i];
            case 34:
                return new PaymentReceiverInfo[i];
            case 35:
                return new PickupInfo[i];
            case Rfc3492Idn.base /*36*/:
                return new PriceInfo[i];
            case LangUtils.HASH_OFFSET /*37*/:
                return new PromoCodeList[i];
            case Rfc3492Idn.skew /*38*/:
                return new ShippingOption[i];
            case 39:
                return new ShippingOptions[i];
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return new TransactionInfo[i];
            case Seq.NULL_REFNUM /*41*/:
                return new AddressCellParams[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new BriefAddressCellParams[i];
            case 43:
                return new AddressListCellParams[i];
            case 44:
                return new AddressListHeaderCellParams[i];
            case 45:
                return new CheckboxCellParams[i];
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return new ContactInfoCellParams[i];
            case 47:
                return new CardScannerCellParams[i];
            case 48:
                return new CreditCardCellParams[i];
            case 49:
                return new FulfillmentOptionCellParams[i];
            case AnimationSpecKt.IDLE_DURATION /*50*/:
                return new LabelCellParams[i];
            case 51:
                return new PaymentMethodLabelCellParams[i];
            case 52:
                return new SupportedLogosCellParams[i];
            case 53:
                return new FormCellFocusEvents[i];
            case 54:
                return new FormCellLoggingEvents[i];
            case 57:
                return new TextCellParams[i];
            case 58:
                return new TextValidatorParams[i];
            case 59:
                return new CreditCardFormatter[i];
            case CacheConfig.DEFAULT_ASYNCHRONOUS_WORKER_IDLE_LIFETIME_SECS /*60*/:
                return new DateFormatter[i];
            case 61:
                return new NameFormatter[i];
            case 62:
                return new PhoneFormatter[i];
            case StringTreeSet.PAYLOAD_MASK:
                return new UpperCaseFormatter[i];
            case 64:
                return new CvvTextFieldHandler[i];
            case 65:
                return new SwitchCellParams[i];
            case 66:
                return new FeatureConfiguration[i];
            case 67:
                return new FormClickEvent[i];
            case 68:
                return new FormDisplayEvent[i];
            case 69:
                return new FormLoggingEvents[i];
            case LineChartView.MARGIN_TICKS /*70*/:
                return new FormMutationEvent[i];
            case 71:
                return new FormParams[i];
            case Rfc3492Idn.initial_bias /*72*/:
                return new ListCellParams[i];
            case 73:
                return new AddressFormFieldsConfig[i];
            case 74:
                return new FormCountry[i];
            case 75:
                return new FormField[i];
            case 76:
                return new FulfillmentOptionComponent[i];
            case 77:
                return new FulfillmentPickupOptionComponent[i];
            case 78:
                return new FulfillmentShippingOptionComponent[i];
            case 79:
                return new ECPOffsiteOffer[i];
            case 80:
                return new ECPOnsiteOffer[i];
            case 81:
                return new IncentiveCredentialList[i];
            case 82:
                return new IncentiveList[i];
            case 83:
                return new LoggingData[i];
            case 84:
                return new OtcInput[i];
            case 85:
                return new OtcOptionState[i];
            case 86:
                return new APMCredential[i];
            case 87:
                return new CreditCard[i];
            case 88:
                return new PayPalCredential[i];
            case 89:
                return new TokenizedCard[i];
            case 90:
                return new LinkableTextParams[i];
            case 91:
                return new PaypalConsentLaunchParams[i];
            case 92:
                return new ShippingAddress[i];
            case 93:
                return new LinkParams[i];
            case 94:
                return new FBPayAddress[i];
            case 95:
                return new FormDialogParams[i];
            case 96:
                return new FormLogEvents[i];
            case 97:
                return new com.fbpay.hub.form.params.FormParams[i];
            case 98:
                return new MerchantInfo[i];
            case 99:
                return new FBPayOrder[i];
            default:
                return new SelectorCellParams[i];
        }
    }
}
