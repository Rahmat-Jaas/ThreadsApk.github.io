package com.facebook.redex;

import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass3VP;
import X.AnonymousClass566;
import X.AnonymousClass58W;
import X.AnonymousClass5MH;
import X.AnonymousClass5k0;
import X.AnonymousClass5xX;
import X.AnonymousClass67I;
import X.AnonymousClass74w;
import X.AnonymousClass76N;
import X.AnonymousClass7DY;
import X.AnonymousClass7EL;
import X.AnonymousClass7JD;
import X.AnonymousClass7Kz;
import X.C04220Ms;
import X.C04530Oa;
import X.C121817Ig;
import X.C122037Js;
import X.C14030oh;
import X.C18170wI;
import X.C18180wK;
import X.C34640IcN;
import X.C62543aG;
import X.C63813iO;
import X.C86074wE;
import X.C91815gt;
import X.C91865gy;
import X.C91875gz;
import X.C92755jo;
import X.C92835jw;
import X.C99206In;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.cell.address.BriefAddressCellParams;
import com.facebookpay.form.cell.creditcard.CreditCardCellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.facebookpay.msc.filter.viewmodel.FilterViewModel;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.fbpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableList;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

public class IDxCListenerShape15S1100000_2_I2 implements View.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxCListenerShape15S1100000_2_I2(String str, Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(View view) {
        int i;
        int i2;
        ImmutableList immutableList;
        Object addressCellParams;
        String str;
        switch (this.A02) {
            case 0:
                i = C14030oh.A05(569073568);
                FilterViewModel filterViewModel = (FilterViewModel) this.A00;
                String str2 = this.A01;
                C04220Ms.A0B(str2, 0);
                FilterViewModel.A02(filterViewModel, "payouthub_transactions_filter_choose_option_click", str2);
                filterViewModel.A04.A0H(str2);
                i2 = 1996335237;
                break;
            case 1:
                i = C14030oh.A05(-86797085);
                AnonymousClass3VP A0N = AnonymousClass7Kz.A0N();
                ContextThemeWrapper contextThemeWrapper = ((AnonymousClass566) this.A00).A00;
                if (contextThemeWrapper != null) {
                    A0N.A01(contextThemeWrapper, this.A01);
                    i2 = -373021924;
                    break;
                } else {
                    C04220Ms.A0E("viewContext");
                    throw null;
                }
            case 2:
                i = C14030oh.A05(948322659);
                ((AnonymousClass5k0) this.A00).A04(this.A01);
                i2 = -1910413431;
                break;
            case 3:
                i = C14030oh.A05(1740602194);
                C92835jw r7 = ((C92755jo) this.A00).A01;
                String str3 = this.A01;
                C121817Ig.A01().markerStart(110173292);
                r7.A0E.Bb8("fbpay_add_card_click", C122037Js.A06(r7.A06));
                Bundle A06 = C18180wK.A06();
                FBPayLoggerData fBPayLoggerData = r7.A06;
                boolean z = r7.A0H;
                boolean z2 = r7.A0I;
                AddressFormFieldsConfig addressFormFieldsConfig = r7.A03;
                FbPayNewCreditCardOption fbPayNewCreditCardOption = r7.A04;
                if (fbPayNewCreditCardOption != null) {
                    immutableList = fbPayNewCreditCardOption.A00;
                } else {
                    immutableList = null;
                }
                AnonymousClass7Kz.A0K().A08();
                AnonymousClass67I r10 = AnonymousClass67I.NONE;
                AnonymousClass7EL r0 = new AnonymousClass7EL(3, 2131832198, (String) null, 0);
                r0.A05 = str3;
                FormLogEvents formLogEvents = new FormLogEvents("fbpay_add_card_cancel", (String) null, (String) null, "fbpay_add_card_display", (String) null, (String) null, (String) null, "fbpay_add_card_save", "fbpay_add_card_fail", "fbpay_add_card_succeed");
                r0.A02 = fBPayLoggerData;
                r0.A01 = formLogEvents;
                C91865gy r11 = new C91865gy();
                r11.A04 = r10;
                r11.A06 = immutableList;
                r11.A0L = !z;
                CreditCardCellParams creditCardCellParams = new CreditCardCellParams(r11);
                ImmutableList.Builder builder = r0.A09;
                builder.add((Object) creditCardCellParams);
                if (!z2) {
                    builder.add((Object) C99206In.A00());
                }
                addressFormFieldsConfig.getClass();
                if (z) {
                    addressCellParams = new BriefAddressCellParams(new C91815gt(addressFormFieldsConfig));
                } else {
                    C91875gz r3 = new C91875gz(addressFormFieldsConfig, 11);
                    r3.A0T = false;
                    r3.A0V = false;
                    r3.A0S = true;
                    addressCellParams = new AddressCellParams(r3);
                }
                builder.add(addressCellParams);
                if (z2) {
                    builder.add((Object) C99206In.A00());
                }
                A06.putParcelable("form_params", r0.A01());
                AnonymousClass76N r1 = new AnonymousClass76N("form", A06);
                r1.A00 = 3;
                AnonymousClass7JD.A02(r7.A06, r1);
                i2 = -1863322946;
                break;
            default:
                int A05 = C14030oh.A05(-1489960820);
                AnonymousClass5xX r5 = (AnonymousClass5xX) this.A00;
                AnonymousClass5xX.A02(r5);
                AnonymousClass7DY r12 = (AnonymousClass7DY) r5.A05.getValue();
                Object value = r5.A07.getValue();
                if (value != null) {
                    String str4 = this.A01;
                    C04220Ms.A0B(str4, 1);
                    r12.A00.A00("ig_cg_bottomsheet_primary_cta_click", r12.A02);
                    if (str4.equals("3pd_trial_inline_opt_in")) {
                        AnonymousClass7DY.A01(r12, false);
                    } else {
                        if (str4.equals(C18170wI.A00(244))) {
                            if (value.equals("3pd_trial_control")) {
                                str = "ig_3pd_trial_control_megaphone";
                            } else if (value.equals("3pd_trial_go_to_settings")) {
                                str = "ig_3pd_trial_30_day_megaphone";
                            }
                        } else if (str4.equals("3pd_trial_inline_opt_out")) {
                            AnonymousClass7DY.A01(r12, true);
                        } else if (str4.equals(C18170wI.A00(370))) {
                            str = "ig_fewer_ads_megaphone";
                        } else if (str4.equals(C18170wI.A00(369))) {
                            str = "ig_fewer_ads_megaphone_control";
                        } else if (str4.equals(C18170wI.A00(294))) {
                            AnonymousClass7DY.A01(r12, false);
                            C34640IcN icN = r12.A01;
                            C63813iO.A02(icN.requireActivity(), icN.requireActivity().getString(2131820972), (String) null, 0);
                        }
                        AnonymousClass7DY.A00(r12, str);
                    }
                    C04530Oa r13 = r5.A0E;
                    if (((AnonymousClass58W) r13.getValue()).A06) {
                        AnonymousClass58W r02 = (AnonymousClass58W) r13.getValue();
                        C86074wE r8 = r02.A05;
                        String str5 = r02.A02;
                        r8.CrC(C18180wK.A0n(new AnonymousClass5MH(new KtCSuperShape0S0300000_I2(2, (Object) C62543aG.A02(str5, true), (Object) C62543aG.A00(str5, true), (Object) C62543aG.A01(str5, true)), new AnonymousClass74w((AnonymousClass0ZU) null))));
                        IgdsBottomButtonLayout igdsBottomButtonLayout = r5.A00;
                        if (igdsBottomButtonLayout == null) {
                            C04220Ms.A0E("button");
                            throw null;
                        }
                        igdsBottomButtonLayout.setDividerVisible(false);
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = r5.A00;
                        if (igdsBottomButtonLayout2 == null) {
                            C04220Ms.A0E("button");
                            throw null;
                        }
                        igdsBottomButtonLayout2.setPrimaryAction((CharSequence) null, (View.OnClickListener) null);
                        IgdsBottomButtonLayout igdsBottomButtonLayout3 = r5.A00;
                        if (igdsBottomButtonLayout3 == null) {
                            C04220Ms.A0E("button");
                            throw null;
                        }
                        igdsBottomButtonLayout3.setSecondaryAction((CharSequence) null, (View.OnClickListener) null);
                    } else {
                        AnonymousClass5xX.A01(r5, r5, false);
                    }
                    C14030oh.A0C(-560421657, A05);
                    return;
                }
                IllegalStateException A0b = AnonymousClass0wJ.A0b();
                C14030oh.A0C(1200144167, A05);
                throw A0b;
        }
        C14030oh.A0C(i2, i);
    }
}
