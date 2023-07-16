package com.instagram.common.api.base;

import X.AnonymousClass000;
import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass25l;
import X.AnonymousClass3XX;
import X.AnonymousClass5tR;
import X.AnonymousClass5uC;
import X.AnonymousClass5uE;
import X.AnonymousClass7IV;
import X.C04220Ms;
import X.C09860go;
import X.C135557zg;
import X.C135577zi;
import X.C13950oZ;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18539AhF;
import X.C19457Awe;
import X.C25828Dsm;
import X.C2W;
import X.C63813iO;
import X.C63873iU;
import X.C86104wH;
import X.C86114wI;
import X.C86134wK;
import X.C86154wM;
import X.C86164wN;
import X.C94135to;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxCListenerShape21S1100000_2_I2;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.barcelona.R;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;
import com.instagram.user.model.User;

public class IDxACallbackShape5S1100000_2_I2 extends C63873iU {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxACallbackShape5S1100000_2_I2(String str, Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onFail(AnonymousClass3XX r12) {
        int i;
        int i2;
        String str;
        switch (this.A02) {
            case 0:
                i = C14030oh.A03(-1246813765);
                super.onFail(r12);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A00;
                C63813iO.A00(supportServiceEditUrlFragment.getContext(), 2131836068);
                supportServiceEditUrlFragment.A00.setDisplayedChild(0);
                Throwable th = r12.A01;
                if (th != null) {
                    str = th.getMessage();
                } else {
                    str = null;
                }
                AnonymousClass7IV r7 = supportServiceEditUrlFragment.A02;
                String str2 = supportServiceEditUrlFragment.A07;
                boolean z = supportServiceEditUrlFragment.A0C;
                String str3 = supportServiceEditUrlFragment.A05;
                String str4 = supportServiceEditUrlFragment.A0B;
                String str5 = this.A01;
                C04220Ms.A0B(str2, 0);
                AnonymousClass0wJ.A1Q(str3, str4);
                USLEBaseShape0S0000000 A002 = AnonymousClass7IV.A00(r7);
                C18190wL.A1I(A002, "validate_url");
                C18210wN.A1A(A002, "error");
                AnonymousClass7IV.A02(A002, r7, str2, str3, z);
                C86114wI.A1F(A002, str4, str5);
                A002.A1J(str);
                A002.Bb4();
                i2 = -1934220265;
                break;
            case 1:
                i = C14030oh.A03(-10636778);
                super.onFail(r12);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment2 = (SupportServiceEditUrlFragment) this.A00;
                supportServiceEditUrlFragment2.A04.dismiss();
                String A0r = C86104wH.A0r(supportServiceEditUrlFragment2, r12);
                AnonymousClass7IV r72 = supportServiceEditUrlFragment2.A02;
                String str6 = supportServiceEditUrlFragment2.A07;
                boolean z2 = supportServiceEditUrlFragment2.A0C;
                String str7 = supportServiceEditUrlFragment2.A05;
                String str8 = supportServiceEditUrlFragment2.A0B;
                String str9 = this.A01;
                C04220Ms.A0B(str6, 0);
                AnonymousClass0wJ.A1Q(str7, str8);
                C04220Ms.A0B(str9, 4);
                USLEBaseShape0S0000000 A003 = AnonymousClass7IV.A00(r72);
                C18190wL.A1I(A003, "flow_update_info");
                C18210wN.A1A(A003, "error");
                AnonymousClass7IV.A02(A003, r72, str6, str7, z2);
                C86114wI.A1F(A003, str8, str9);
                A003.A1J(A0r);
                A003.Bb4();
                i2 = 521385044;
                break;
            case 2:
                i = C14030oh.A03(-276138358);
                super.onFail(r12);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment3 = (SupportServiceEditUrlFragment) this.A00;
                String A0r2 = C86104wH.A0r(supportServiceEditUrlFragment3, r12);
                AnonymousClass7IV r8 = supportServiceEditUrlFragment3.A02;
                String str10 = supportServiceEditUrlFragment3.A07;
                String str11 = supportServiceEditUrlFragment3.A05;
                String str12 = supportServiceEditUrlFragment3.A0B;
                String str13 = this.A01;
                C04220Ms.A0B(str11, 1);
                AnonymousClass0wJ.A1Q(str12, str13);
                USLEBaseShape0S0000000 A004 = AnonymousClass7IV.A00(r8);
                C18190wL.A1I(A004, "update_action_button");
                AnonymousClass7IV.A03(A004, r8, "error", str10, true);
                A004.A0S("partner_id", AnonymousClass0wJ.A0d(str11));
                C86114wI.A1F(A004, str12, str13);
                A004.A1J(A0r2);
                C86164wN.A1C(A004, (String) null);
                i2 = -1367716938;
                break;
            default:
                super.onFail(r12);
                return;
        }
        C14030oh.A0A(i2, i);
    }

    public final void onFinish() {
        if (2 - this.A02 != 0) {
            super.onFinish();
            return;
        }
        int A03 = C14030oh.A03(-1861450274);
        ((SupportServiceEditUrlFragment) this.A00).A04.dismiss();
        C14030oh.A0A(-177346414, A03);
    }

    public final void onStart() {
        if (1 - this.A02 != 0) {
            super.onStart();
            return;
        }
        int A03 = C14030oh.A03(1390452464);
        C13950oZ.A00(((SupportServiceEditUrlFragment) this.A00).A04);
        C14030oh.A0A(416770329, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03;
        int i;
        C25828Dsm dsm;
        int i2;
        String string;
        int i3;
        int i4;
        int i5;
        switch (this.A02) {
            case 0:
                int A032 = C14030oh.A03(-1953877841);
                AnonymousClass5uC r13 = (AnonymousClass5uC) obj;
                int A033 = C14030oh.A03(1542921563);
                super.onSuccess(r13);
                boolean z = r13.A01;
                SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A00;
                String string2 = supportServiceEditUrlFragment.getString(2131837540);
                if (z) {
                    C09860go.A0I(supportServiceEditUrlFragment.mView);
                    boolean z2 = supportServiceEditUrlFragment.A0C;
                    String str2 = this.A01;
                    if (z2) {
                        SupportServiceEditUrlFragment.A03(supportServiceEditUrlFragment, str2);
                    } else {
                        SupportServiceEditUrlFragment.A02(supportServiceEditUrlFragment, str2);
                    }
                } else {
                    string2 = r13.A00;
                    if (TextUtils.isEmpty(string2)) {
                        string2 = supportServiceEditUrlFragment.getString(2131829206);
                    }
                }
                supportServiceEditUrlFragment.A00.setDisplayedChild(0);
                boolean z3 = !z;
                supportServiceEditUrlFragment.mURLTitleTextView.setText(string2);
                TextView textView = supportServiceEditUrlFragment.mURLTitleTextView;
                Context context = supportServiceEditUrlFragment.getContext();
                int i6 = R.color.igds_secondary_text;
                if (z3) {
                    i6 = R.color.igds_error_or_destructive;
                }
                C18180wK.A0s(context, textView, i6);
                AnonymousClass7IV r9 = supportServiceEditUrlFragment.A02;
                String str3 = supportServiceEditUrlFragment.A07;
                boolean z4 = supportServiceEditUrlFragment.A0C;
                String str4 = supportServiceEditUrlFragment.A05;
                String str5 = supportServiceEditUrlFragment.A0B;
                String str6 = this.A01;
                C04220Ms.A0B(str3, 0);
                AnonymousClass0wJ.A1Q(str4, str5);
                USLEBaseShape0S0000000 A002 = AnonymousClass7IV.A00(r9);
                C18190wL.A1I(A002, "validate_url");
                if (z) {
                    str = "url_valid";
                } else {
                    str = "url_invalid";
                }
                AnonymousClass7IV.A03(A002, r9, str, str3, z4);
                A002.A0S("partner_id", AnonymousClass0wJ.A0d(str4));
                C86114wI.A1F(A002, str5, str6);
                A002.Bb4();
                C14030oh.A0A(-1486752700, A033);
                C14030oh.A0A(-1137586621, A032);
                return;
            case 1:
                A03 = C14030oh.A03(-90128840);
                AnonymousClass5tR r132 = (AnonymousClass5tR) obj;
                int A034 = C14030oh.A03(-667071555);
                super.onSuccess(r132);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment2 = (SupportServiceEditUrlFragment) this.A00;
                SupportServiceEditUrlFragment.A00(r132.A00, supportServiceEditUrlFragment2);
                String str7 = supportServiceEditUrlFragment2.A08;
                if (str7 == null && "business_hub".equals(supportServiceEditUrlFragment2.A0A)) {
                    String str8 = this.A01;
                    dsm = new C25828Dsm(supportServiceEditUrlFragment2.getActivity());
                    SMBPartnerType sMBPartnerType = supportServiceEditUrlFragment2.A01;
                    int ordinal = sMBPartnerType.ordinal();
                    if (ordinal == 3) {
                        i4 = 2131827973;
                    } else if (ordinal == 2) {
                        i4 = 2131824938;
                    } else if (ordinal == 1) {
                        i4 = 2131826218;
                    } else {
                        throw C86134wK.A0s(AnonymousClass00U.A0L(AnonymousClass000.A00(43), sMBPartnerType.toString()));
                    }
                    dsm.A02 = AnonymousClass0wJ.A0o(supportServiceEditUrlFragment2, supportServiceEditUrlFragment2.getString(i4), 2131820909);
                    SMBPartnerType sMBPartnerType2 = supportServiceEditUrlFragment2.A01;
                    if (sMBPartnerType2.equals(SMBPartnerType.GIFT_CARD)) {
                        dsm.A0p(AnonymousClass0wJ.A0o(supportServiceEditUrlFragment2, supportServiceEditUrlFragment2.A0B, 2131827974));
                    } else {
                        if (sMBPartnerType2.equals(SMBPartnerType.FOOD_DELIVERY)) {
                            i5 = 2131832050;
                        } else if (sMBPartnerType2.equals(SMBPartnerType.DONATION)) {
                            i5 = 2131826217;
                        }
                        dsm.A0K(i5);
                    }
                    dsm.A0Y(new IDxCListenerShape21S1100000_2_I2(supportServiceEditUrlFragment2, str8, 1), AnonymousClass25l.DEFAULT, supportServiceEditUrlFragment2.getString(2131821063), true);
                    string = supportServiceEditUrlFragment2.getString(2131831870);
                    i3 = 45;
                } else if (str7 == null && !supportServiceEditUrlFragment2.A0A.equals("sticker")) {
                    SupportServiceEditUrlFragment.A04(supportServiceEditUrlFragment2, this.A01);
                    AnonymousClass7IV r92 = supportServiceEditUrlFragment2.A02;
                    String str9 = supportServiceEditUrlFragment2.A07;
                    String str10 = supportServiceEditUrlFragment2.A05;
                    String str11 = supportServiceEditUrlFragment2.A0B;
                    String str12 = this.A01;
                    boolean A1Z = AnonymousClass0wJ.A1Z(str9, str10);
                    AnonymousClass0wJ.A1Q(str11, str12);
                    USLEBaseShape0S0000000 A003 = AnonymousClass7IV.A00(r92);
                    C18190wL.A1I(A003, "flow_update_info");
                    C18210wN.A1A(A003, "success");
                    AnonymousClass7IV.A02(A003, r92, str9, str10, A1Z);
                    C86114wI.A1F(A003, str11, str12);
                    A003.Bb4();
                    C14030oh.A0A(-1510183621, A034);
                    i = -857819075;
                } else if (supportServiceEditUrlFragment2.A0C || str7 == null || supportServiceEditUrlFragment2.A0A.equals("sticker")) {
                    supportServiceEditUrlFragment2.A04.dismiss();
                    supportServiceEditUrlFragment2.A0G.post(new C135557zg(this));
                    AnonymousClass7IV r922 = supportServiceEditUrlFragment2.A02;
                    String str92 = supportServiceEditUrlFragment2.A07;
                    String str102 = supportServiceEditUrlFragment2.A05;
                    String str112 = supportServiceEditUrlFragment2.A0B;
                    String str122 = this.A01;
                    boolean A1Z2 = AnonymousClass0wJ.A1Z(str92, str102);
                    AnonymousClass0wJ.A1Q(str112, str122);
                    USLEBaseShape0S0000000 A0032 = AnonymousClass7IV.A00(r922);
                    C18190wL.A1I(A0032, "flow_update_info");
                    C18210wN.A1A(A0032, "success");
                    AnonymousClass7IV.A02(A0032, r922, str92, str102, A1Z2);
                    C86114wI.A1F(A0032, str112, str122);
                    A0032.Bb4();
                    C14030oh.A0A(-1510183621, A034);
                    i = -857819075;
                    break;
                } else {
                    String str13 = this.A01;
                    dsm = new C25828Dsm(supportServiceEditUrlFragment2.getActivity());
                    dsm.A0L(2131832096);
                    SMBPartnerType sMBPartnerType3 = supportServiceEditUrlFragment2.A01;
                    int ordinal2 = sMBPartnerType3.ordinal();
                    if (ordinal2 == 3) {
                        i2 = 2131827973;
                    } else if (ordinal2 == 2) {
                        i2 = 2131824938;
                    } else if (ordinal2 == 1) {
                        i2 = 2131826218;
                    } else {
                        throw C86134wK.A0s(AnonymousClass00U.A0L(AnonymousClass000.A00(43), sMBPartnerType3.toString()));
                    }
                    dsm.A0p(supportServiceEditUrlFragment2.getString(2131832095, supportServiceEditUrlFragment2.getString(i2), supportServiceEditUrlFragment2.A09));
                    dsm.A0Y(new IDxCListenerShape21S1100000_2_I2(supportServiceEditUrlFragment2, str13, 2), AnonymousClass25l.DEFAULT, supportServiceEditUrlFragment2.getString(2131821063), true);
                    string = supportServiceEditUrlFragment2.getString(2131831870);
                    i3 = 46;
                }
                dsm.A0a(C86154wM.A0N(supportServiceEditUrlFragment2, i3), string);
                AnonymousClass0wJ.A1K(dsm);
                AnonymousClass7IV r9222 = supportServiceEditUrlFragment2.A02;
                String str922 = supportServiceEditUrlFragment2.A07;
                String str1022 = supportServiceEditUrlFragment2.A05;
                String str1122 = supportServiceEditUrlFragment2.A0B;
                String str1222 = this.A01;
                boolean A1Z22 = AnonymousClass0wJ.A1Z(str922, str1022);
                AnonymousClass0wJ.A1Q(str1122, str1222);
                USLEBaseShape0S0000000 A00322 = AnonymousClass7IV.A00(r9222);
                C18190wL.A1I(A00322, "flow_update_info");
                C18210wN.A1A(A00322, "success");
                AnonymousClass7IV.A02(A00322, r9222, str922, str1022, A1Z22);
                C86114wI.A1F(A00322, str1122, str1222);
                A00322.Bb4();
                C14030oh.A0A(-1510183621, A034);
                i = -857819075;
                break;
            case 2:
                A03 = C14030oh.A03(-1905794726);
                C94135to r133 = (C94135to) obj;
                int A035 = C14030oh.A03(1287113569);
                super.onSuccess(r133);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment3 = (SupportServiceEditUrlFragment) this.A00;
                User A0Y = AnonymousClass0wJ.A0Y(supportServiceEditUrlFragment3.A03);
                A0Y.A1p(r133.A01);
                A0Y.A1j(r133.A00);
                A0Y.A2J(false);
                C18210wN.A1J(supportServiceEditUrlFragment3.A03, A0Y);
                supportServiceEditUrlFragment3.A0G.post(new C135577zi(this));
                supportServiceEditUrlFragment3.A02.A04(supportServiceEditUrlFragment3.A07, supportServiceEditUrlFragment3.A05, supportServiceEditUrlFragment3.A0B, this.A01, (String) null);
                C14030oh.A0A(-72220355, A035);
                i = -617067166;
                break;
            default:
                A03 = C14030oh.A03(768936275);
                int A036 = C14030oh.A03(-1674786256);
                C2W c2w = ((C18539AhF) this.A00).A07;
                C19457Awe A0T = C86154wM.A0T(c2w);
                A0T.A02(this.A01, ((AnonymousClass5uE) obj).A00);
                C86154wM.A1O(c2w, A0T);
                C14030oh.A0A(523288275, A036);
                i = -155303307;
                break;
        }
        C14030oh.A0A(i, A03);
    }
}
