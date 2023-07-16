package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxObserverShape3S1500000_2_I2;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellAction;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellSection;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPAvailabilityRequestParams;
import com.facebookpay.expresscheckout.models.ECPConfirmationConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentConfiguration;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.models.FulfillmentOption;
import com.facebookpay.expresscheckout.models.FulfillmentOptions;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.expresscheckout.models.PaymentReceiverInfo;
import com.facebookpay.expresscheckout.models.PickupInfo;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.expresscheckout.models.ShippingOptions;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import com.fbpay.logging.LoggingContext;
import com.fbpay.logging.LoggingPolicy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape0S0300100_I2;

/* renamed from: X.6sW  reason: invalid class name and case insensitive filesystem */
public final class C113996sW {
    public final FragmentActivity A00;
    public final C880856r A01;
    public final C880856r A02;
    public final C110996mc A03;
    public final FulfillmentOptions A04;
    public final C128127iv A05 = new C128127iv(this);
    public final Runnable A06;
    public final ArrayList A07;
    public final List A08;
    public final ArrayList A09;

    public final void A00(EcpUIConfiguration ecpUIConfiguration, String str) {
        PaymentReceiverInfo paymentReceiverInfo = new PaymentReceiverInfo("PSP_TEST_1::MERCHANT_TEST_E2E", (String) null, (String) null, (String) null);
        CurrencyAmount currencyAmount = new CurrencyAmount("USD", "0.70");
        C973068v r14 = C973068v.TAX;
        AnonymousClass23V r13 = AnonymousClass23V.FINAL;
        AnonymousClass23V r27 = r13;
        ArrayList A14 = C06750aI.A14(new PriceInfo(currencyAmount, r13, r14, (Integer) null, "Tax", (String) null, (String) null, (String) null), new PriceInfo(new CurrencyAmount("USD", "10.00"), r27, C973068v.SUBTOTAL, (Integer) null, "Subtotal", (String) null, (String) null, (String) null), new PriceInfo(new CurrencyAmount("USD", "10.70"), r27, C973068v.TOTAL, (Integer) null, "Total", (String) null, (String) null, (String) null));
        ArrayList A142 = C06750aI.A14(new PriceInfo(new CurrencyAmount("USD", "7.77"), r13, r14, 1, "Item Name", (String) null, "Size: L", "https://cdn.shopify.com/s/files/1/0059/8835/2052/products/Kieffer-Pear-Tree-450w_901dda52-964c-41f7-a282-44e3a667ac6e_1024x1024.jpg?v=1603108180"));
        TransactionInfo transactionInfo = new TransactionInfo(this.A04, (PickupInfo) null, new PromoCodeList(this.A07), (ShippingOptions) null, (Integer) null, (Integer) null, "USD", "US", (String) null, A14, A142, this.A08);
        CheckoutConfiguration checkoutConfiguration = new CheckoutConfiguration((APMConfiguration) null, C969767l.META_PAY_BANNER, (C969767l) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, AnonymousClass4WM.A08(AnonymousClass68M.UX_FULFILLMENT_OPTIONS, AnonymousClass68M.UX_SHIPPING_ADDRESS, AnonymousClass68M.UX_PROMO_CODE), AnonymousClass4WM.A08(AnonymousClass68F.REQUEST_PAYER_EMAIL, AnonymousClass68F.REQUEST_PAYER_PHONE, AnonymousClass68F.REQUEST_PAYER_NAME, AnonymousClass68F.REQUEST_BILLING_ADDRESS), false);
        AnonymousClass7Kx.A0I(this.A02, transactionInfo);
        C971368b r30 = C971368b.TEST;
        ArrayList A143 = C06750aI.A14(AnonymousClass67H.CHARGE);
        CurrencyAmount currencyAmount2 = new CurrencyAmount("USD", "100");
        CurrencyAmount currencyAmount3 = currencyAmount2;
        ECPPaymentConfiguration eCPPaymentConfiguration = new ECPPaymentConfiguration(currencyAmount3, new KnownData(new ShippingAddress((String) null, (String) null, "Jamie Wilson", "1 Hacker Way", (String) null, "Menlo Park", "CA", "US", "94025", (String) null, false, false, false, false, true), "Jamie Wilson", "jamie@email.com", "6505051234", "IAW"), r30, "1234", "https://www.fbpaytesting.com", A143, C06750aI.A14(AnonymousClass692.BASIC_CARD_V1), (ArrayList) null, (Map) null, (Set) null);
        LoggingPolicy loggingPolicy = new LoggingPolicy("payments_offsite_partners", AnonymousClass0wJ.A0v());
        AnonymousClass7Kz.A05();
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass7Kx.A0F(fragmentActivity, new C114966uD((Fragment) null, fragmentActivity).A01(new ECPAvailabilityRequestParams(eCPPaymentConfiguration, paymentReceiverInfo, loggingPolicy, C122037Js.A00(), "88888", "742725890006429", "https://www.fbpaytesting.com", checkoutConfiguration.A0B, checkoutConfiguration.A0C, 1, false, false, true)), new C124007aI(checkoutConfiguration, eCPPaymentConfiguration, ecpUIConfiguration, paymentReceiverInfo, this, loggingPolicy, str, A14, A142));
    }

    public final void A01(EcpUIConfiguration ecpUIConfiguration, String str) {
        PaymentReceiverInfo paymentReceiverInfo = new PaymentReceiverInfo("5206913519322793", "Jemma Tan", (String) null, (String) null);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        CurrencyAmount currencyAmount = new CurrencyAmount("USD", "1.00");
        CurrencyAmount currencyAmount2 = currencyAmount;
        TransactionInfo transactionInfo = new TransactionInfo(this.A04, (PickupInfo) null, new PromoCodeList(this.A07), (ShippingOptions) null, (Integer) null, (Integer) null, "USD", "US", (String) null, A0v, C06750aI.A14(new PriceInfo(currencyAmount2, AnonymousClass23V.FINAL, C973068v.TOTAL, (Integer) null, "Ms. Tan's Middle School Classroom", (String) null, "Jemma Tan", "https://cdn.shopify.com/s/files/1/0059/8835/2052/products/Kieffer-Pear-Tree-450w_901dda52-964c-41f7-a282-44e3a667ac6e_1024x1024.jpg?v=1603108180")), this.A08);
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        A0v2.add(new ECPConfirmationUpsellAction("LINK", "Connected", "", "Stay connected", "https://m.facebook.com/facebook_pay/connect_learn_more"));
        A0v2.add(new ECPConfirmationUpsellAction("LINK", "Invite", "", "Invite your friends", ""));
        ECPConfirmationConfiguration eCPConfirmationConfiguration = new ECPConfirmationConfiguration(new ECPConfirmationUpsellSection("Up Next", A0v2), "NEXT");
        String A002 = C122037Js.A00();
        ECPRepositoryImpl A022 = AnonymousClass7JJ.A02();
        M5J A032 = A022.A03(A002, "137885231632764", "5206913519322793", "5206913519322793");
        long parseLong = Long.parseLong("137885231632764");
        AnonymousClass84Y r11 = AnonymousClass84Y.A00;
        LoggingContext loggingContext = new LoggingContext((LoggingPolicy) null, A002, r11, r11, parseLong, false);
        C128957ke.A04(C18180wK.A0I(C86104wH.A0K(AnonymousClass7JJ.A00().A00, "client_load_ecpproductconfiguration_init"), 294), loggingContext, new KtLambdaShape0S0300100_I2(2, Long.parseLong("5206913519322793"), AnonymousClass0wJ.A0d("5206913519322793"), (Object) null, loggingContext));
        AnonymousClass7Kx.A0F(this.A00, C30821GXg.A01(A032, new AnonymousClass8IZ(A022, loggingContext, A002)), new IDxObserverShape3S1500000_2_I2(ecpUIConfiguration, transactionInfo, this, eCPConfirmationConfiguration, paymentReceiverInfo, str, 0));
    }

    public C113996sW(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
        this.A03 = new C110996mc((Fragment) null, fragmentActivity, (ECPHandler) null);
        this.A01 = C880856r.A04(AnonymousClass7Kx.A09((Object) null));
        this.A02 = C880856r.A03();
        ArrayList A14 = C06750aI.A14(new FulfillmentOption(new CurrencyAmount("USD", "19.99"), "prty-usps", "Priority USPS", new Date(2023, 12, 30), new Date(2023, 12, 31)), new FulfillmentOption(new CurrencyAmount("USD", "29.99"), "ovrn-fedex", "Overnight FedEx", (Date) null, (Date) null));
        this.A09 = A14;
        this.A04 = new FulfillmentOptions(((FulfillmentOption) A14.get(0)).A00(), A14);
        this.A07 = AnonymousClass0wJ.A0v();
        this.A08 = AnonymousClass0wJ.A0v();
        this.A06 = new C135327zF(this);
    }
}
