package com.facebookpay.form.cell;

import X.AnonymousClass67I;
import X.AnonymousClass69W;
import X.AnonymousClass7Ih;
import X.C110616lz;
import X.C116916xl;
import X.C1366783w;
import X.C18180wK;
import X.C86164wN;
import X.C91905hH;
import X.C91915hI;
import X.C91925hJ;
import X.C91935hK;
import X.C91945hL;
import X.C91955hM;
import X.C91965hN;
import X.C91975hO;
import X.C91985hP;
import X.C91995hQ;
import X.C92005hR;
import X.C92015hS;
import X.C92025hT;
import X.C92035hU;
import X.C92045hV;
import X.C92075hZ;
import X.C92105hd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.address.BriefAddressCellParams;
import com.facebookpay.form.cell.addresslist.AddressListCellParams;
import com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams;
import com.facebookpay.form.cell.card.CardCellParams;
import com.facebookpay.form.cell.checkbox.CheckboxCellParams;
import com.facebookpay.form.cell.contactinfo.ContactInfoCellParams;
import com.facebookpay.form.cell.creditcard.CardScannerCellParams;
import com.facebookpay.form.cell.creditcard.CreditCardCellParams;
import com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams;
import com.facebookpay.form.cell.label.LabelCellParams;
import com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams;
import com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.facebookpay.form.cell.selector.CountrySelectorCellParams;
import com.facebookpay.form.cell.selector.SelectorCellParams;
import com.facebookpay.form.cell.text.TextCellParams;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.facebookpay.form.cell.toggle.SwitchCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.fbpay.logging.LoggingContext;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;

public abstract class CellParams implements Parcelable {
    public AnonymousClass7Ih A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final FormCellLoggingEvents A04;
    public final boolean A05;
    public final boolean A06;

    /* JADX WARNING: type inference failed for: r2v3, types: [X.51t] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.51v] */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.5hz] */
    /* JADX WARNING: type inference failed for: r2v6, types: [X.5hc] */
    /* JADX WARNING: type inference failed for: r2v7, types: [X.52M] */
    /* JADX WARNING: type inference failed for: r2v11, types: [X.51h] */
    /* JADX WARNING: type inference failed for: r2v13, types: [X.51u] */
    /* JADX WARNING: type inference failed for: r2v14, types: [X.5hY] */
    /* JADX WARNING: type inference failed for: r2v15, types: [X.51g] */
    /* JADX WARNING: type inference failed for: r2v16, types: [X.5hy] */
    /* JADX WARNING: type inference failed for: r2v17, types: [X.5hx] */
    /* JADX WARNING: type inference failed for: r2v20, types: [X.52Q] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C143538gu A00(android.content.Context r5) {
        /*
            r4 = this;
            r2 = 0
            r0 = -2
            android.widget.TableRow$LayoutParams r1 = new android.widget.TableRow$LayoutParams
            r1.<init>(r2, r0)
            float r0 = r4.A01
            r1.weight = r0
            r3 = r4
            boolean r0 = r4 instanceof com.facebookpay.form.cell.toggle.SwitchCellParams
            if (r0 == 0) goto L_0x0021
            X.52Q r2 = new X.52Q
            r2.<init>(r5)
        L_0x0015:
            r2.setLayoutParams(r1)
        L_0x0018:
            X.7Ih r0 = r4.A00
            r0.getClass()
            r2.setViewModel(r0)
            return r2
        L_0x0021:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.selector.SelectorCellParams
            if (r0 == 0) goto L_0x002b
            X.5hx r2 = new X.5hx
            r2.<init>(r5)
            goto L_0x0015
        L_0x002b:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.selector.CountrySelectorCellParams
            if (r0 == 0) goto L_0x0035
            X.5hy r2 = new X.5hy
            r2.<init>(r5)
            goto L_0x0015
        L_0x0035:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.label.paymentmethod.SupportedLogosCellParams
            if (r0 == 0) goto L_0x0042
            X.AnonymousClass0wJ.A1N(r5, r1)
            X.51g r2 = new X.51g
            r2.<init>(r5)
            goto L_0x0015
        L_0x0042:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.label.LabelCellParams
            if (r0 == 0) goto L_0x0062
            com.facebookpay.form.cell.label.LabelCellParams r3 = (com.facebookpay.form.cell.label.LabelCellParams) r3
            boolean r0 = r3 instanceof com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellParams
            if (r0 == 0) goto L_0x005a
            X.AnonymousClass0wJ.A1N(r5, r1)
            int r0 = r3.A04
            X.5hY r2 = new X.5hY
            r2.<init>(r5, r0)
        L_0x0056:
            r2.setLayoutParams(r1)
            goto L_0x0018
        L_0x005a:
            int r0 = r3.A04
            X.51u r2 = new X.51u
            r2.<init>(r5, r0)
            goto L_0x0056
        L_0x0062:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.fulfillmentoption.FulfillmentOptionCellParams
            if (r0 == 0) goto L_0x006f
            X.AnonymousClass0wJ.A1N(r5, r1)
            X.51h r2 = new X.51h
            r2.<init>(r5)
            goto L_0x0015
        L_0x006f:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.creditcard.CreditCardCellParams
            if (r0 == 0) goto L_0x0089
            com.facebookpay.form.cell.creditcard.CreditCardCellParams r3 = (com.facebookpay.form.cell.creditcard.CreditCardCellParams) r3
            X.5i0 r2 = new X.5i0
            r2.<init>(r5)
            r2.setLayoutParams(r1)
            boolean r0 = r3.A0J
        L_0x007f:
            if (r0 == 0) goto L_0x0018
            r1 = 22
            X.7Dv r0 = X.AnonymousClass6XX.A00
            r0.A02(r5, r2, r1)
            goto L_0x0018
        L_0x0089:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.creditcard.CardScannerCellParams
            if (r0 == 0) goto L_0x009c
            X.AnonymousClass0wJ.A1N(r5, r1)
            X.51s r0 = new X.51s
            r0.<init>(r5)
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            throw r0
        L_0x009c:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.contactinfo.ContactInfoCellParams
            if (r0 == 0) goto L_0x00b0
            com.facebookpay.form.cell.contactinfo.ContactInfoCellParams r3 = (com.facebookpay.form.cell.contactinfo.ContactInfoCellParams) r3
            X.AnonymousClass0wJ.A1N(r5, r1)
            X.5i0 r2 = new X.5i0
            r2.<init>(r5)
            r2.setLayoutParams(r1)
            boolean r0 = r3.A04
            goto L_0x007f
        L_0x00b0:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.checkbox.CheckboxCellParams
            if (r0 == 0) goto L_0x00be
            X.AnonymousClass0wJ.A1N(r5, r1)
            X.52M r2 = new X.52M
            r2.<init>(r5)
            goto L_0x0015
        L_0x00be:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.text.TextCellParams
            if (r0 == 0) goto L_0x00ce
            com.facebookpay.form.cell.text.TextCellParams r3 = (com.facebookpay.form.cell.text.TextCellParams) r3
            boolean r0 = r3 instanceof com.facebookpay.form.cell.card.CardCellParams
            if (r0 == 0) goto L_0x0103
            X.5hc r2 = new X.5hc
            r2.<init>(r5)
            goto L_0x0056
        L_0x00ce:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.addresslist.AddressListHeaderCellParams
            if (r0 == 0) goto L_0x00dc
            X.AnonymousClass0wJ.A1N(r5, r1)
            X.51v r2 = new X.51v
            r2.<init>(r5)
            goto L_0x0015
        L_0x00dc:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.addresslist.AddressListCellParams
            if (r0 == 0) goto L_0x00ea
            X.AnonymousClass0wJ.A1N(r5, r1)
            X.51t r2 = new X.51t
            r2.<init>(r5)
            goto L_0x0015
        L_0x00ea:
            boolean r0 = r4 instanceof com.facebookpay.form.cell.address.BriefAddressCellParams
            if (r0 == 0) goto L_0x00f5
            X.5i0 r2 = new X.5i0
            r2.<init>(r5)
            goto L_0x0015
        L_0x00f5:
            com.facebookpay.form.cell.address.AddressCellParams r3 = (com.facebookpay.form.cell.address.AddressCellParams) r3
            X.5i0 r2 = new X.5i0
            r2.<init>(r5)
            r2.setLayoutParams(r1)
            boolean r0 = r3.A0S
            goto L_0x007f
        L_0x0103:
            X.5hz r2 = new X.5hz
            r2.<init>(r5)
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.form.cell.CellParams.A00(android.content.Context):X.8gu");
    }

    public final AnonymousClass7Ih A01() {
        if (this instanceof SwitchCellParams) {
            SwitchCellParams switchCellParams = (SwitchCellParams) this;
            return new C91925hJ(switchCellParams.A02, switchCellParams.A00, switchCellParams.A06, switchCellParams.A05, switchCellParams.A01);
        } else if (this instanceof SelectorCellParams) {
            SelectorCellParams selectorCellParams = (SelectorCellParams) this;
            int i = selectorCellParams.A02;
            boolean z = selectorCellParams.A06;
            boolean z2 = selectorCellParams.A05;
            int i2 = selectorCellParams.A00;
            return new C91955hM(selectorCellParams.A02, selectorCellParams.A03, i, i2, selectorCellParams.A01, z, z2);
        } else if (this instanceof CountrySelectorCellParams) {
            CountrySelectorCellParams countrySelectorCellParams = (CountrySelectorCellParams) this;
            int i3 = countrySelectorCellParams.A03;
            int i4 = countrySelectorCellParams.A02;
            boolean z3 = countrySelectorCellParams.A06;
            boolean z4 = countrySelectorCellParams.A05;
            FormCellLoggingEvents formCellLoggingEvents = countrySelectorCellParams.A04;
            String str = countrySelectorCellParams.A03;
            int i5 = countrySelectorCellParams.A00;
            return new C91975hO(countrySelectorCellParams.A01, formCellLoggingEvents, countrySelectorCellParams.A02, str, i3, i4, i5, z3, z4, countrySelectorCellParams.A04);
        } else if (this instanceof SupportedLogosCellParams) {
            SupportedLogosCellParams supportedLogosCellParams = (SupportedLogosCellParams) this;
            return new C91915hI(supportedLogosCellParams.A00, supportedLogosCellParams.A02, supportedLogosCellParams.A05);
        } else if (this instanceof LabelCellParams) {
            LabelCellParams labelCellParams = (LabelCellParams) this;
            if (labelCellParams instanceof PaymentMethodLabelCellParams) {
                PaymentMethodLabelCellParams paymentMethodLabelCellParams = (PaymentMethodLabelCellParams) labelCellParams;
                return new C92075hZ(paymentMethodLabelCellParams.A05, paymentMethodLabelCellParams.A01, paymentMethodLabelCellParams.A03, paymentMethodLabelCellParams.A04, paymentMethodLabelCellParams.A00, paymentMethodLabelCellParams.A02);
            }
            int i6 = labelCellParams.A02;
            boolean z5 = labelCellParams.A06;
            boolean z6 = labelCellParams.A05;
            String str2 = labelCellParams.A08;
            int i7 = labelCellParams.A03;
            return new C91985hP(labelCellParams.A07, str2, i6, i7, labelCellParams.A05, labelCellParams.A00, labelCellParams.A02, labelCellParams.A06, labelCellParams.A01, z5, z6);
        } else if (this instanceof FulfillmentOptionCellParams) {
            FulfillmentOptionCellParams fulfillmentOptionCellParams = (FulfillmentOptionCellParams) this;
            return new C91935hK(fulfillmentOptionCellParams.A02, fulfillmentOptionCellParams.A00, fulfillmentOptionCellParams.A01, fulfillmentOptionCellParams.A05);
        } else if (this instanceof CreditCardCellParams) {
            CreditCardCellParams creditCardCellParams = (CreditCardCellParams) this;
            int i8 = creditCardCellParams.A02;
            boolean z7 = creditCardCellParams.A06;
            boolean z8 = creditCardCellParams.A05;
            String str3 = creditCardCellParams.A0B;
            String str4 = creditCardCellParams.A0G;
            String str5 = creditCardCellParams.A0F;
            String str6 = creditCardCellParams.A0H;
            String str7 = creditCardCellParams.A0C;
            String str8 = creditCardCellParams.A0E;
            String str9 = creditCardCellParams.A0D;
            AnonymousClass69W r13 = creditCardCellParams.A06;
            ImmutableList immutableList = creditCardCellParams.A07;
            ImmutableList immutableList2 = creditCardCellParams.A08;
            boolean booleanValue = creditCardCellParams.A0A.booleanValue();
            boolean booleanValue2 = creditCardCellParams.A09.booleanValue();
            boolean z9 = creditCardCellParams.A00;
            Map map = creditCardCellParams.A0I;
            int i9 = creditCardCellParams.A02;
            AnonymousClass67I r6 = creditCardCellParams.A05;
            boolean z10 = creditCardCellParams.A0K;
            int i10 = creditCardCellParams.A01;
            int i11 = creditCardCellParams.A03;
            AddressCellParams addressCellParams = creditCardCellParams.A04;
            return new C92035hU(addressCellParams, r6, r13, immutableList, immutableList2, str3, str4, str5, str6, str7, str8, str9, map, i8, i9, i10, i11, z7, z8, booleanValue, booleanValue2, z9, z10, creditCardCellParams.A0J, creditCardCellParams.A0L);
        } else if (this instanceof CardScannerCellParams) {
            CardScannerCellParams cardScannerCellParams = (CardScannerCellParams) this;
            return new C91905hH(cardScannerCellParams, cardScannerCellParams.A00);
        } else if (this instanceof ContactInfoCellParams) {
            ContactInfoCellParams contactInfoCellParams = (ContactInfoCellParams) this;
            int i12 = contactInfoCellParams.A02;
            boolean z11 = contactInfoCellParams.A05;
            int i13 = contactInfoCellParams.A00;
            return new C92025hT(contactInfoCellParams.A02, contactInfoCellParams.A01, contactInfoCellParams.A03, i12, i13, z11, contactInfoCellParams.A05, contactInfoCellParams.A04);
        } else if (this instanceof CheckboxCellParams) {
            CheckboxCellParams checkboxCellParams = (CheckboxCellParams) this;
            int i14 = checkboxCellParams.A02;
            boolean z12 = checkboxCellParams.A05;
            boolean z13 = checkboxCellParams.A02;
            return new C91945hL(i14, checkboxCellParams.A01, checkboxCellParams.A00, z12, z13, checkboxCellParams.A03);
        } else if (this instanceof TextCellParams) {
            TextCellParams textCellParams = (TextCellParams) this;
            if (textCellParams instanceof CardCellParams) {
                CardCellParams cardCellParams = (CardCellParams) textCellParams;
                ImmutableList.Builder A0Q = C86164wN.A0Q();
                C1366783w it = cardCellParams.A07.iterator();
                while (it.hasNext()) {
                    TextValidatorParams textValidatorParams = (TextValidatorParams) it.next();
                    A0Q.add((Object) C116916xl.A00(cardCellParams.A01, textValidatorParams.A02, textValidatorParams.A04, textValidatorParams.A03, textValidatorParams.A01, textValidatorParams.A00));
                }
                int i15 = cardCellParams.A03;
                int i16 = cardCellParams.A02;
                boolean z14 = cardCellParams.A06;
                boolean z15 = cardCellParams.A05;
                FormCellLoggingEvents formCellLoggingEvents2 = cardCellParams.A04;
                String str10 = cardCellParams.A0F;
                int i17 = cardCellParams.A03;
                String str11 = cardCellParams.A0E;
                FBPayIcon fBPayIcon = cardCellParams.A06;
                Integer num = cardCellParams.A0C;
                ImmutableList build = A0Q.build();
                int i18 = cardCellParams.A00;
                boolean booleanValue3 = cardCellParams.A08.booleanValue();
                String str12 = cardCellParams.A0D;
                return new C92105hd(formCellLoggingEvents2, cardCellParams.A04, fBPayIcon, build, num, str10, str11, str12, i15, i16, i17, i18, z14, z15, booleanValue3);
            }
            ImmutableList.Builder A0Q2 = C86164wN.A0Q();
            C1366783w it2 = textCellParams.A07.iterator();
            while (it2.hasNext()) {
                TextValidatorParams textValidatorParams2 = (TextValidatorParams) it2.next();
                A0Q2.add((Object) C116916xl.A00((ImmutableList) null, textValidatorParams2.A02, textValidatorParams2.A04, textValidatorParams2.A03, textValidatorParams2.A01, textValidatorParams2.A00));
            }
            int i19 = textCellParams.A03;
            int i20 = textCellParams.A02;
            boolean z16 = textCellParams.A06;
            boolean z17 = textCellParams.A05;
            FormCellLoggingEvents formCellLoggingEvents3 = textCellParams.A04;
            String str13 = textCellParams.A0F;
            int i21 = textCellParams.A03;
            String str14 = textCellParams.A0E;
            int i22 = textCellParams.A00;
            int i23 = textCellParams.A01;
            FBPayIcon fBPayIcon2 = textCellParams.A06;
            Integer num2 = textCellParams.A0C;
            ImmutableList build2 = A0Q2.build();
            TextFieldHandler textFieldHandler = textCellParams.A05;
            Boolean bool = textCellParams.A0A;
            int i24 = textCellParams.A02;
            boolean booleanValue4 = textCellParams.A0B.booleanValue();
            boolean booleanValue5 = textCellParams.A08.booleanValue();
            String str15 = textCellParams.A0D;
            boolean booleanValue6 = textCellParams.A09.booleanValue();
            return new C92005hR(formCellLoggingEvents3, textCellParams.A04, textFieldHandler, fBPayIcon2, build2, bool, num2, str13, str14, str15, i19, i20, i21, i22, i23, i24, z16, z17, booleanValue4, booleanValue5, booleanValue6);
        } else if (this instanceof AddressListHeaderCellParams) {
            AddressListHeaderCellParams addressListHeaderCellParams = (AddressListHeaderCellParams) this;
            int i25 = addressListHeaderCellParams.A02;
            boolean z18 = addressListHeaderCellParams.A05;
            boolean z19 = addressListHeaderCellParams.A03;
            boolean z20 = addressListHeaderCellParams.A04;
            return new C91965hN(addressListHeaderCellParams.A02, i25, addressListHeaderCellParams.A01, addressListHeaderCellParams.A00, z18, z19, z20);
        } else if (this instanceof AddressListCellParams) {
            AddressListCellParams addressListCellParams = (AddressListCellParams) this;
            int i26 = addressListCellParams.A02;
            boolean z21 = addressListCellParams.A05;
            List list = addressListCellParams.A03;
            BaseCheckoutItem baseCheckoutItem = addressListCellParams.A01;
            int i27 = addressListCellParams.A00;
            return new C91995hQ(baseCheckoutItem, addressListCellParams.A02, list, i26, i27, z21, addressListCellParams.A04);
        } else if (this instanceof BriefAddressCellParams) {
            BriefAddressCellParams briefAddressCellParams = (BriefAddressCellParams) this;
            int i28 = briefAddressCellParams.A02;
            boolean z22 = briefAddressCellParams.A06;
            boolean z23 = briefAddressCellParams.A05;
            String str16 = briefAddressCellParams.A02;
            return new C92015hS(briefAddressCellParams.A00, briefAddressCellParams.A01, str16, i28, z22, z23);
        } else {
            AddressCellParams addressCellParams2 = (AddressCellParams) this;
            int i29 = addressCellParams2.A02;
            boolean z24 = addressCellParams2.A06;
            boolean z25 = addressCellParams2.A05;
            String str17 = addressCellParams2.A0I;
            String str18 = addressCellParams2.A0O;
            String str19 = addressCellParams2.A0J;
            String str20 = addressCellParams2.A0L;
            String str21 = addressCellParams2.A0P;
            String str22 = addressCellParams2.A0K;
            String str23 = addressCellParams2.A0M;
            String str24 = addressCellParams2.A0N;
            Country country = addressCellParams2.A0D;
            AddressFormFieldsConfig addressFormFieldsConfig = addressCellParams2.A0E;
            boolean z26 = addressCellParams2.A0V;
            int i30 = addressCellParams2.A05;
            int i31 = addressCellParams2.A06;
            int i32 = addressCellParams2.A09;
            int i33 = addressCellParams2.A0A;
            int i34 = addressCellParams2.A07;
            int i35 = addressCellParams2.A0B;
            int i36 = addressCellParams2.A03;
            int i37 = addressCellParams2.A08;
            int i38 = addressCellParams2.A0C;
            int i39 = addressCellParams2.A04;
            boolean z27 = addressCellParams2.A0X;
            boolean z28 = addressCellParams2.A0U;
            ImmutableList immutableList3 = addressCellParams2.A0H;
            Map map2 = addressCellParams2.A0R;
            boolean z29 = addressCellParams2.A0W;
            LoggingContext loggingContext = addressCellParams2.A0F;
            boolean z30 = addressCellParams2.A01;
            List list2 = addressCellParams2.A0Q;
            boolean z31 = addressCellParams2.A00;
            int i40 = addressCellParams2.A02;
            boolean z32 = addressCellParams2.A0S;
            return new C92045hV(country, addressFormFieldsConfig, loggingContext, immutableList3, addressCellParams2.A0G, str17, str18, str19, str20, str21, str22, str23, str24, list2, map2, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, z24, z25, z26, z27, z28, z29, z30, z31, z32, addressCellParams2.A0T);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeByte(this.A05 ? (byte) 1 : 0);
        parcel.writeFloat(this.A01);
        parcel.writeParcelable(this.A04, i);
    }

    public CellParams(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        boolean z = true;
        this.A06 = C18180wK.A1V(parcel.readByte());
        this.A05 = parcel.readByte() == 0 ? false : z;
        this.A01 = parcel.readFloat();
        this.A04 = (FormCellLoggingEvents) C18180wK.A0A(parcel, FormCellLoggingEvents.class);
    }

    public CellParams(C110616lz r2) {
        this.A03 = r2.A01;
        this.A02 = r2.A05;
        this.A06 = r2.A04;
        this.A05 = r2.A03;
        this.A01 = r2.A00;
        this.A04 = r2.A02;
    }

    public CellParams(int i) {
        this.A03 = 0;
        this.A02 = i;
        this.A06 = false;
        this.A05 = true;
        this.A01 = 1.0f;
        this.A04 = null;
    }
}
