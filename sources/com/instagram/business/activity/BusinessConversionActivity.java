package com.instagram.business.activity;

import X.AnonymousClass01V;
import X.AnonymousClass06E;
import X.AnonymousClass0OY;
import X.AnonymousClass0RA;
import X.AnonymousClass0RJ;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass1bI;
import X.AnonymousClass1cG;
import X.AnonymousClass1cM;
import X.AnonymousClass1cS;
import X.AnonymousClass1cU;
import X.AnonymousClass1cW;
import X.AnonymousClass1cX;
import X.AnonymousClass1cj;
import X.AnonymousClass1iU;
import X.AnonymousClass22J;
import X.AnonymousClass265;
import X.AnonymousClass266;
import X.AnonymousClass2R2;
import X.AnonymousClass2R3;
import X.AnonymousClass32J;
import X.AnonymousClass33Y;
import X.AnonymousClass3GN;
import X.AnonymousClass3LJ;
import X.AnonymousClass3LY;
import X.AnonymousClass3S1;
import X.AnonymousClass3VX;
import X.AnonymousClass3WC;
import X.AnonymousClass3z8;
import X.AnonymousClass42N;
import X.AnonymousClass447;
import X.AnonymousClass44X;
import X.AnonymousClass46D;
import X.AnonymousClass49X;
import X.AnonymousClass4A9;
import X.AnonymousClass4K6;
import X.AnonymousClass4OO;
import X.AnonymousClass4WM;
import X.AnonymousClass7Ko;
import X.C04220Ms;
import X.C04530Oa;
import X.C04620Ok;
import X.C05030Qo;
import X.C06810aP;
import X.C10300i6;
import X.C10450iM;
import X.C11630kW;
import X.C12560m7;
import X.C130667qT;
import X.C14030oh;
import X.C145538kf;
import X.C169839tz;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18250wR;
import X.C22121Tl;
import X.C22891ay;
import X.C25828Dsm;
import X.C304921n;
import X.C31155GhB;
import X.C311924p;
import X.C313525q;
import X.C32165H8c;
import X.C33841Hva;
import X.C34452Jp;
import X.C34572Kb;
import X.C35692Ol;
import X.C38039KHq;
import X.C57933Db;
import X.C61853Wb;
import X.C62883b4;
import X.C63263h8;
import X.C63463hW;
import X.C63803iN;
import X.C64073jY;
import X.C67133yv;
import X.C67183z0;
import X.C67223zB;
import X.C67293zJ;
import X.C67333zN;
import X.C74844bF;
import X.C81194nK;
import X.C83644rk;
import X.C84294su;
import X.C84654td;
import X.H1T;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.facebook.redex.IDxCListenerShape222S0200000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.util.IDxACallbackShape10S0300000_1_I2;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.fragment.AccountTypeSelectionV2Fragment;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.business.fragment.ConnectFBPageFragment;
import com.instagram.business.fragment.FBPageListWithPreviewFragment;
import com.instagram.business.fragment.OnboardingCheckListFragment;
import com.instagram.business.fragment.ProfessionalAccountDescriptionFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.model.business.Address;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class BusinessConversionActivity extends BaseFragmentActivity implements C11630kW, C84654td, C145538kf, C83644rk, CallerContextable, AnonymousClass0RJ {
    public static final CallerContext A0G = CallerContext.A00(BusinessConversionActivity.class);
    public Bundle A00;
    public AnonymousClass3VX A01;
    public C311924p A02;
    public PageSelectionOverrideData A03;
    public String A04 = "";
    public boolean A05;
    public boolean A06 = true;
    public final HashSet A07 = C18200wM.A0u();
    public final C04530Oa A08 = C18190wL.A0w(this, 49);
    public final C04530Oa A09 = C18210wN.A0k(this, 0);
    public final C04530Oa A0A = C18210wN.A0k(this, 1);
    public final C04530Oa A0B = AnonymousClass0OY.A02(C74844bF.A00);
    public final C04530Oa A0C = C18210wN.A0k(this, 2);
    public final C04530Oa A0D = C18210wN.A0k(this, 3);
    public final C04530Oa A0E = C18210wN.A0k(this, 4);
    public final C04530Oa A0F = C18210wN.A0k(this, 5);

    public final void A0I(Context context, C84294su r13, C145538kf r14, AnonymousClass266 r15, String str, boolean z) {
        int i;
        int i2;
        AnonymousClass266 r8 = r15;
        C04220Ms.A0B(r15, 4);
        C04620Ok r1 = C06810aP.A01;
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A0A);
        C18200wM.A1R(A0U);
        User A012 = r1.A01((UserSession) A0U);
        Context context2 = context;
        C84294su r6 = r13;
        C145538kf r7 = r14;
        boolean z2 = z;
        if (A012.A3a() || A012.A0e() != C169839tz.PrivacyStatusPrivate) {
            A01(context2, this, r6, r7, r8, false, z2);
            return;
        }
        if (Aiz() == C311924p.INTEREST_ACCOUNT_CONVERSION || Aiz() == C311924p.RENEW_PROFESSIONAL_ACCOUNT) {
            i = 2131836519;
            i2 = 2131836518;
        } else {
            i = 2131823232;
            i2 = 2131823230;
            if (C67293zJ.A05(this)) {
                i = 2131823233;
                i2 = 2131823231;
            }
        }
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0L(i);
        A0W.A0K(i2);
        A0W.A0P(new C64073jY(context2, this, r6, r7, r8, str, z2), 2131831976);
        C18200wM.A1P(A0W);
        AnonymousClass0wJ.A1K(A0W);
    }

    public final boolean BRB() {
        return true;
    }

    public final void Bel(Bundle bundle) {
        Bem(bundle, (ConversionStep) null, true);
    }

    public final void ClA(C311924p r8) {
        C04220Ms.A0B(r8, 0);
        C311924p r0 = this.A02;
        if (r0 != null) {
            if (r0 != r8) {
                this.A02 = r8;
                A00();
                ConversionStep Abh = Abh();
                ImmutableList of = ImmutableList.of();
                ConversionStep conversionStep = ConversionStep.ACCOUNT_TYPE_SELECTION_V2;
                String str = "_flowType";
                if (Abh == conversionStep) {
                    C311924p r02 = this.A02;
                    if (r02 != null) {
                        int ordinal = r02.ordinal();
                        if (!(ordinal == 0 || ordinal == 6)) {
                            if (ordinal == 1 || ordinal == 7) {
                                of = AnonymousClass3LJ.A01(AnonymousClass0wJ.A0U(this.A0A), this.A04, this.A05, this.A06);
                            }
                        }
                        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A0A);
                        of = AnonymousClass3LJ.A00(C18220wO.A0U(this.A08).A03, A0U, this.A04, this.A05, this.A06);
                    }
                    C04220Ms.A0E(str);
                    throw null;
                } else if (Abh == ConversionStep.RENEW) {
                    C311924p r03 = this.A02;
                    if (r03 != null) {
                        int ordinal2 = r03.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 == 2) {
                                boolean A052 = A05();
                                ImmutableList.Builder builder = new ImmutableList.Builder();
                                if (!A052) {
                                    C313525q.A00(builder, ConversionStep.INTRO);
                                }
                                ConversionStep conversionStep2 = ConversionStep.CHOOSE_CATEGORY;
                                C313525q r04 = C313525q.NEXT;
                                C18250wR.A15(builder, r04, conversionStep2);
                                C18250wR.A15(builder, r04, conversionStep);
                                of = C18250wR.A0F(builder);
                            }
                        }
                        C10300i6 A0U2 = AnonymousClass0wJ.A0U(this.A0A);
                        of = AnonymousClass3LJ.A00(C18220wO.A0U(this.A08).A03, A0U2, this.A04, this.A05, this.A06);
                    }
                    C04220Ms.A0E(str);
                    throw null;
                }
                if (!of.isEmpty()) {
                    AnonymousClass3VX r05 = this.A01;
                    str = "conversionLogic";
                    if (r05 != null) {
                        BusinessConversionFlowStatus businessConversionFlowStatus = r05.A00;
                        int i = businessConversionFlowStatus.A00;
                        BusinessConversionFlowStatus A022 = AnonymousClass3WC.A02(businessConversionFlowStatus, of, i + 1, i);
                        AnonymousClass3VX r06 = this.A01;
                        if (r06 != null) {
                            r06.A00 = A022;
                        }
                    }
                    C04220Ms.A0E(str);
                    throw null;
                }
                BaseBundle baseBundle = (BaseBundle) this.A0C.getValue();
                C311924p r07 = this.A02;
                if (r07 != null) {
                    baseBundle.putInt("business_account_flow", r07.A00);
                    return;
                }
            } else {
                return;
            }
        }
        C04220Ms.A0E("_flowType");
        throw null;
    }

    public final String getModuleName() {
        return "business_conversion_activity";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C04220Ms.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        AnonymousClass3VX r0 = this.A01;
        if (r0 == null) {
            C04220Ms.A0E("conversionLogic");
            throw null;
        }
        bundle.putParcelable("conversion_flow_status", r0.A00);
        bundle.putParcelable("business_info", C18220wO.A0U(this.A08).A06);
        PageSelectionOverrideData pageSelectionOverrideData = this.A03;
        if (pageSelectionOverrideData != null) {
            bundle.putParcelable("EXTRA_FB_OVERRIDE_DATA", pageSelectionOverrideData);
        }
    }

    public final void schedule(C33841Hva hva) {
        C04220Ms.A0B(hva, 0);
        C31155GhB.A01(this, AnonymousClass06E.A00(this), hva);
    }

    private final void A00() {
        AnonymousClass3S1 r0;
        C67223zB A012 = C67223zB.A01(AnonymousClass0wJ.A0U(this.A0A));
        C311924p r6 = this.A02;
        if (r6 == null) {
            C04220Ms.A0E("_flowType");
            throw null;
        }
        C04530Oa r2 = this.A08;
        String str = C18220wO.A0U(r2).A0B;
        boolean z = C18220wO.A0U(r2).A0H;
        Integer num = C18220wO.A0U(r2).A09;
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("entry_point", str);
        A0y.put("is_fb_linked_when_enter_flow", String.valueOf(z));
        A0y.put("is_page_admin", C34452Jp.A00(num));
        Bundle A022 = AnonymousClass3z8.A02(A0y);
        switch (r6.ordinal()) {
            case 0:
                r0 = C67223zB.A04;
                break;
            case 1:
                r0 = C67223zB.A06;
                break;
            case 2:
                r0 = C67223zB.A05;
                break;
            case 3:
                r0 = C67223zB.A07;
                break;
            case 5:
            case 6:
            case 7:
                r0 = C67223zB.A08;
                break;
            case 8:
            case 9:
                r0 = null;
                break;
            default:
                throw C18190wL.A0a("unsupported flow type");
        }
        C67223zB.A02 = r0;
        if (r0 != null) {
            synchronized (A012.A00) {
            }
        }
        C67223zB.A03 = C67223zB.A00(A022);
    }

    public static final void A01(Context context, BusinessConversionActivity businessConversionActivity, C84294su r24, C145538kf r25, AnonymousClass266 r26, boolean z, boolean z2) {
        String str;
        BusinessConversionActivity businessConversionActivity2 = businessConversionActivity;
        C10300i6 A0U = AnonymousClass0wJ.A0U(businessConversionActivity2.A0A);
        C18200wM.A1R(A0U);
        UserSession userSession = (UserSession) A0U;
        C04530Oa r1 = businessConversionActivity2.A08;
        String str2 = C18220wO.A0U(r1).A0B;
        BusinessInfo businessInfo = C18220wO.A0U(r1).A06;
        C67133yv A0U2 = C18220wO.A0U(r1);
        String str3 = C18220wO.A0U(r1).A0F;
        int A002 = C18220wO.A0U(r1).A00();
        C67293zJ.A02(businessConversionActivity2);
        PublicPhoneContact publicPhoneContact = businessInfo.A01;
        String str4 = businessInfo.A09;
        CallerContext callerContext = C67183z0.A00;
        String A003 = C61853Wb.A00(callerContext, userSession, "ig_switch_to_business_account");
        String A022 = C35692Ol.A00(userSession).A02(callerContext, "ig_switch_to_business_account");
        AnonymousClass266 r5 = r26;
        H1T A004 = C67183z0.A00(userSession, r5, str2);
        A004.A06();
        A004.A0O("fb_user_id", A022);
        A004.A0O("category_id", str4);
        A004.A0R("set_public", z);
        String str5 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        String str6 = "0";
        if (z2) {
            str6 = str5;
        }
        A004.A0O("ignore_conversion_log", str6);
        A004.A0R("should_bypass_contact_check", true);
        if (A003 != null) {
            A004.A0O("page_id", businessInfo.A0J);
        }
        String str7 = businessInfo.A0B;
        if (!TextUtils.isEmpty(str7)) {
            A004.A0O("public_email", str7);
        }
        Address address = businessInfo.A00;
        String str8 = null;
        if (address != null) {
            try {
                str = AnonymousClass2R2.A00(address);
            } catch (IOException unused) {
                C10450iM.A03("business_conversion_activity", "Couldn't serialize create business address");
                str = null;
            }
            A004.A0O("business_address", str);
        }
        if (publicPhoneContact != null && !TextUtils.isEmpty(publicPhoneContact.A02)) {
            try {
                str8 = AnonymousClass2R3.A00(publicPhoneContact);
            } catch (IOException unused2) {
                C10450iM.A03("business_conversion_activity", "Couldn't serialize create business public phone contact");
            }
            A004.A0O("public_phone_contact", str8);
        }
        if (r5 != AnonymousClass266.A07) {
            String str9 = "0";
            if (businessInfo.A0R) {
                str9 = str5;
            }
            A004.A0O("should_show_public_contacts", str9);
            if (!businessInfo.A0P) {
                str5 = "0";
            }
            A004.A0O("should_show_category", str5);
        }
        C32165H8c A023 = A004.A02();
        C145538kf r13 = r25;
        A023.A00 = new AnonymousClass1iU(context, A0U2, r24, r13, businessInfo, userSession, userSession, r5, str2, str3, A002, C18180wK.A1Z(AnonymousClass0wJ.A0Y(userSession).A0g(), AnonymousClass266.A06));
        r13.schedule(A023);
    }

    public static final void A02(Bundle bundle, BusinessConversionActivity businessConversionActivity) {
        String obj;
        if (bundle == null) {
            C04530Oa r2 = businessConversionActivity.A08;
            C18220wO.A0U(r2).A08 = null;
            C18220wO.A0U(r2).A0A = null;
            return;
        }
        RegFlowExtras regFlowExtras = (RegFlowExtras) bundle.getParcelable("RegFlowExtras.EXTRA_KEY");
        C04530Oa r3 = businessConversionActivity.A08;
        C18220wO.A0U(r3).A08 = regFlowExtras;
        if (regFlowExtras != null) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            String str = null;
            if (regFlowExtras.A01() == null) {
                obj = null;
            } else {
                obj = regFlowExtras.A01().toString();
            }
            A0y.put("registration_flow", obj);
            A0y.put("email", regFlowExtras.A08);
            CountryCodeData countryCodeData = regFlowExtras.A01;
            if (countryCodeData != null) {
                str = countryCodeData.A01;
            }
            A0y.put("area_code", str);
            A0y.put("phone", regFlowExtras.A0R);
            A0y.put("device_nonce", regFlowExtras.A06);
            A0y.put("business_name", regFlowExtras.A0O);
            bundle.putBundle("conversion_funnel_log_payload", AnonymousClass3z8.A02(A0y));
        }
        C18220wO.A0U(r3).A0A = bundle.getString("error_message");
        if (bundle.containsKey("fb_access_token")) {
            C18220wO.A0U(r3).A0C = bundle.getString("fb_access_token");
        }
        if (bundle.containsKey("fb_user_id")) {
            C18220wO.A0U(r3).A0D = bundle.getString("fb_user_id");
        }
    }

    public static final void A03(BusinessConversionActivity businessConversionActivity) {
        ConversionStep conversionStep;
        AnonymousClass3VX r0 = businessConversionActivity.A01;
        if (r0 != null) {
            BusinessConversionStep A002 = r0.A00.A00();
            if (A002 == null) {
                conversionStep = null;
            } else {
                conversionStep = A002.A01;
            }
            if (conversionStep == ConversionStep.CREATE_PAGE) {
                AnonymousClass3VX r3 = businessConversionActivity.A01;
                if (r3 != null) {
                    BusinessConversionFlowStatus businessConversionFlowStatus = r3.A00;
                    businessConversionFlowStatus.A00().getClass();
                    int i = businessConversionFlowStatus.A00;
                    r3.A00 = AnonymousClass3WC.A00(businessConversionFlowStatus, i, i - 1);
                    businessConversionActivity.A07.remove(conversionStep);
                    return;
                }
            } else if (conversionStep == ConversionStep.RENEW && !businessConversionActivity.A05()) {
                AnonymousClass3VX r02 = businessConversionActivity.A01;
                if (r02 != null) {
                    BusinessConversionFlowStatus businessConversionFlowStatus2 = r02.A00;
                    businessConversionFlowStatus2.A00().getClass();
                    int i2 = businessConversionFlowStatus2.A00;
                    BusinessConversionFlowStatus A003 = AnonymousClass3WC.A00(businessConversionFlowStatus2, i2, i2 - 1);
                    AnonymousClass3VX r03 = businessConversionActivity.A01;
                    if (r03 != null) {
                        r03.A00 = A003;
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C04220Ms.A0E("conversionLogic");
        throw null;
    }

    private final boolean A05() {
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A0A);
        C04530Oa r4 = this.A08;
        boolean equals = "LATEST_CONVERTED_ACCOUNT".equals(C18220wO.A0U(r4).A0E);
        return C67333zN.A07(A0U, C18220wO.A0U(r4).A07.A02, C18220wO.A0U(r4).A07.A03, C18220wO.A0U(r4).A07.A09, equals);
    }

    public final void ACI() {
        C67223zB.A02((Bundle) null, C67223zB.A01(AnonymousClass0wJ.A0U(this.A0A)), C18230wP.A0m(this), "cancel", (String) null);
        AnonymousClass3VX r0 = this.A01;
        if (r0 == null) {
            C04220Ms.A0E("conversionLogic");
            throw null;
        }
        r0.A01();
        finish();
    }

    public final ConversionStep Abh() {
        AnonymousClass3VX r0 = this.A01;
        if (r0 == null) {
            C04220Ms.A0E("conversionLogic");
            throw null;
        }
        BusinessConversionStep A002 = r0.A00.A00();
        if (A002 == null) {
            return null;
        }
        return A002.A01;
    }

    public final Map AeU(Map map) {
        if (map == null) {
            map = AnonymousClass0wJ.A0y();
        }
        C04530Oa r2 = this.A08;
        map.put("is_fb_linked_when_enter_flow", String.valueOf(C18220wO.A0U(r2).A0H));
        String A002 = C34452Jp.A00(C18220wO.A0U(r2).A09);
        C04220Ms.A05(A002);
        map.put("is_fb_page_admin_when_enter_flow", A002);
        return map;
    }

    public final C311924p Aiz() {
        C311924p r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C04220Ms.A0E("_flowType");
        throw null;
    }

    public final String Ar0() {
        String A042 = C05030Qo.A04(AnonymousClass0wJ.A0U(this.A0A));
        if (A042 == null) {
            return "";
        }
        return A042;
    }

    public final boolean BMy() {
        C311924p r1 = this.A02;
        if (r1 == null) {
            C04220Ms.A0E("_flowType");
            throw null;
        } else if (r1 != C311924p.PROFESSIONAL_SIGNUP_FLOW || CWQ() == null) {
            return false;
        } else {
            while (CWQ() != null) {
                CfG((Bundle) null);
            }
            return true;
        }
    }

    public final ConversionStep CWP() {
        BusinessConversionStep businessConversionStep;
        AnonymousClass3VX r0 = this.A01;
        if (r0 == null) {
            C04220Ms.A0E("conversionLogic");
            throw null;
        }
        BusinessConversionFlowStatus businessConversionFlowStatus = r0.A00;
        int i = businessConversionFlowStatus.A00;
        ImmutableList immutableList = businessConversionFlowStatus.A01;
        if (i >= immutableList.size() - 1 || (businessConversionStep = (BusinessConversionStep) immutableList.get(i + 1)) == null) {
            return null;
        }
        return businessConversionStep.A01;
    }

    public final ConversionStep CWQ() {
        BusinessConversionStep businessConversionStep;
        AnonymousClass3VX r0 = this.A01;
        if (r0 == null) {
            C04220Ms.A0E("conversionLogic");
            throw null;
        }
        BusinessConversionFlowStatus businessConversionFlowStatus = r0.A00;
        int i = businessConversionFlowStatus.A00;
        if (i <= 0 || (businessConversionStep = (BusinessConversionStep) businessConversionFlowStatus.A01.get(i - 1)) == null) {
            return null;
        }
        return businessConversionStep.A01;
    }

    public final void D8y(String str) {
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A0A);
        if (A0U instanceof UserSession) {
            C38039KHq A002 = AnonymousClass3LY.A00(A0U);
            String userId = ((UserSession) A0U).getUserId();
            C04530Oa r3 = this.A08;
            C18220wO.A0U(r3).A00();
            "branded_content_settings".equals(C18220wO.A0U(r3).A0B);
            C311924p r1 = this.A02;
            if (r1 == null) {
                C04220Ms.A0E("_flowType");
                throw null;
            }
            if (r1 == C311924p.CREATOR_CONVERSION_FLOW) {
                "branded_content_settings".equals(C18220wO.A0U(r3).A0B);
            }
            A002.CWx(new AnonymousClass46D(userId));
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0A);
    }

    public static final void A04(BusinessConversionActivity businessConversionActivity, boolean z) {
        Bundle bundle;
        UserSession userSession;
        Fragment fragment;
        C22121Tl r0;
        List list;
        ConversionStep Abh = businessConversionActivity.Abh();
        if (Abh == null) {
            businessConversionActivity.finish();
            return;
        }
        int ordinal = Abh.ordinal();
        boolean z2 = z;
        if (ordinal == 16 && ((r0 = C18220wO.A0U(businessConversionActivity.A08).A02) == null || (list = r0.A03) == null || list.isEmpty())) {
            AnonymousClass3VX r02 = businessConversionActivity.A01;
            if (r02 == null) {
                C04220Ms.A0E("conversionLogic");
                throw null;
            }
            r02.A02();
            A04(businessConversionActivity, z);
            return;
        }
        if (Abh == ConversionStep.FACEBOOK_CONNECT) {
            bundle = AnonymousClass3z8.A00(AnonymousClass0wJ.A0U(businessConversionActivity.A0A));
        } else {
            bundle = null;
        }
        businessConversionActivity.A00 = bundle;
        ConversionStep conversionStep = ConversionStep.PAGE_SELECTION;
        if (Abh == conversionStep || Abh == ConversionStep.CREATE_PAGE) {
            C04530Oa r2 = businessConversionActivity.A08;
            C18220wO.A0U(r2).A0F = null;
            r2.getValue();
        }
        AnonymousClass3GN r4 = (AnonymousClass3GN) businessConversionActivity.A0D.getValue();
        switch (ordinal) {
            case 0:
                String name = Abh.name();
                Fragment fragment2 = r4.A0B;
                if (fragment2 == null) {
                    Bundle A062 = C18180wK.A06();
                    C18210wN.A0x(A062, r4.A0H);
                    C62883b4.A04();
                    fragment2 = new AnonymousClass1cU();
                    fragment2.setArguments(A062);
                    r4.A0B = fragment2;
                }
                r4.A00(fragment2, name);
                return;
            case 1:
                String name2 = Abh.name();
                int i = r4.A0L.A00;
                boolean z3 = false;
                if (i != -1) {
                    z3 = true;
                }
                AnonymousClass7Ko.A0C(z3);
                Fragment fragment3 = r4.A05;
                if (fragment3 == null) {
                    C62883b4.A04();
                    String str = r4.A0H;
                    Bundle A063 = C18180wK.A06();
                    C18210wN.A0x(A063, str);
                    A063.putString("edit_profile_entry", (String) null);
                    A063.putInt("entry_position", i);
                    fragment3 = new AnonymousClass1cX();
                    fragment3.setArguments(A063);
                    r4.A05 = fragment3;
                }
                r4.A0F.A00(fragment3, r4.A0J, r4.A0M, name2, z2);
                return;
            case 2:
                String name3 = Abh.name();
                Fragment fragment4 = r4.A00;
                if (fragment4 == null) {
                    Bundle A064 = C18180wK.A06();
                    C18210wN.A0x(A064, r4.A0H);
                    C62883b4.A04();
                    fragment4 = new AccountTypeSelectionV2Fragment();
                    fragment4.setArguments(A064);
                    r4.A00 = fragment4;
                }
                r4.A00(fragment4, name3);
                return;
            case 3:
                String name4 = Abh.name();
                Fragment fragment5 = r4.A03;
                if (fragment5 == null) {
                    C62883b4.A04();
                    String str2 = r4.A0H;
                    Bundle A065 = C18180wK.A06();
                    C18210wN.A0x(A065, str2);
                    A065.putInt("selected_account_type", 3);
                    fragment5 = new ProfessionalAccountDescriptionFragment();
                    fragment5.setArguments(A065);
                    r4.A03 = fragment5;
                }
                r4.A00(fragment5, name4);
                return;
            case 4:
                String name5 = Abh.name();
                if (r4.A08 == null) {
                    C62883b4.A04();
                    String str3 = r4.A0H;
                    PageSelectionOverrideData pageSelectionOverrideData = r4.A0G;
                    Bundle A066 = C18180wK.A06();
                    C18210wN.A0x(A066, str3);
                    A066.putString("edit_profile_entry", (String) null);
                    A066.putBoolean("from_null_state", false);
                    A066.putBoolean("business_profile_edit_entry", false);
                    A066.putParcelable("EXTRA_FB_OVERRIDE_DATA", pageSelectionOverrideData);
                    AnonymousClass1cM r03 = new AnonymousClass1cM();
                    r03.setArguments(A066);
                    r4.A08 = r03;
                }
                if (r4.A0K.CWQ() == conversionStep && (fragment = r4.A09) != null) {
                    r4.A08.setTargetFragment(fragment, 0);
                }
                r4.A00(r4.A08, name5);
                return;
            case 5:
                String name6 = Abh.name();
                userSession = C05030Qo.A02(r4.A0M.A00);
                if (!C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36326159079712202L)) {
                    Fragment fragment6 = r4.A02;
                    if (fragment6 == null) {
                        C62883b4.A04();
                        String str4 = r4.A0H;
                        Bundle A067 = C18180wK.A06();
                        A067.putString("edit_profile_entry", (String) null);
                        C18210wN.A0x(A067, str4);
                        fragment6 = new ConnectFBPageFragment();
                        fragment6.setArguments(A067);
                        r4.A02 = fragment6;
                    }
                    r4.A00(fragment6, name6);
                    return;
                }
                break;
            case 6:
                String name7 = Abh.name();
                userSession = C05030Qo.A02(r4.A0M.A00);
                if (!C63803iN.A0E(C18180wK.A0J(userSession), userSession, 36326159079712202L)) {
                    Fragment fragment7 = r4.A09;
                    if (fragment7 == null) {
                        C62883b4.A04();
                        String str5 = r4.A0H;
                        String str6 = r4.A0I;
                        PageSelectionOverrideData pageSelectionOverrideData2 = r4.A0G;
                        Bundle A068 = C18180wK.A06();
                        C18210wN.A0x(A068, str5);
                        A068.putString("edit_profile_entry", (String) null);
                        A068.putString("target_page_id", str6);
                        A068.putParcelable("EXTRA_FB_OVERRIDE_DATA", pageSelectionOverrideData2);
                        fragment7 = new FBPageListWithPreviewFragment();
                        fragment7.setArguments(A068);
                        r4.A09 = fragment7;
                    }
                    r4.A00(fragment7, name7);
                    return;
                }
                break;
            case 7:
                String name8 = Abh.name();
                Fragment fragment8 = r4.A01;
                if (fragment8 == null) {
                    C62883b4.A04();
                    String str7 = r4.A0H;
                    Bundle A069 = C18180wK.A06();
                    C18210wN.A0x(A069, str7);
                    fragment8 = new CategorySearchFragment();
                    fragment8.setArguments(A069);
                    r4.A01 = fragment8;
                }
                r4.A00(fragment8, name8);
                return;
            case 8:
                String name9 = Abh.name();
                Fragment fragment9 = r4.A04;
                if (fragment9 == null) {
                    C62883b4.A04();
                    C67133yv r04 = r4.A0L;
                    BusinessInfo businessInfo = r04.A06;
                    String str8 = r4.A0H;
                    String str9 = r04.A0F;
                    String str10 = r04.A0A;
                    C04220Ms.A0B(businessInfo, 0);
                    Bundle A0610 = C18180wK.A06();
                    A0610.putParcelable("business_info", businessInfo);
                    C18210wN.A0x(A0610, str8);
                    A0610.putString("edit_profile_entry", (String) null);
                    A0610.putString("page_access_token", str9);
                    A0610.putString("error_message", str10);
                    fragment9 = new AnonymousClass1cS();
                    fragment9.setArguments(A0610);
                    r4.A04 = fragment9;
                }
                r4.A00(fragment9, name9);
                return;
            case 9:
                String name10 = Abh.name();
                Fragment fragment10 = r4.A0A;
                if (fragment10 == null) {
                    Bundle A0611 = C18180wK.A06();
                    C18210wN.A0x(A0611, r4.A0H);
                    C62883b4.A04();
                    fragment10 = new AnonymousClass1bI();
                    fragment10.setArguments(A0611);
                    r4.A0A = fragment10;
                }
                r4.A00(fragment10, name10);
                return;
            case 10:
                String name11 = Abh.name();
                AnonymousClass49X.A00(AnonymousClass0RA.A0C.A05(new AnonymousClass4K6(r4))).A04();
                Bundle A0612 = C18180wK.A06();
                C18210wN.A0x(A0612, r4.A0H);
                C63463hW.A01();
                C18190wL.A13(A0612, "IgSessionManager.LOGGED_OUT_TOKEN");
                AnonymousClass1cj r05 = new AnonymousClass1cj();
                r05.setArguments(A0612);
                r4.A00(r05, name11);
                return;
            case 11:
                String name12 = Abh.name();
                Fragment fragment11 = r4.A0D;
                if (fragment11 == null) {
                    Bundle A0613 = C18180wK.A06();
                    C18210wN.A0x(A0613, r4.A0H);
                    C63463hW.A03();
                    fragment11 = new C22891ay();
                    fragment11.setArguments(A0613);
                    r4.A0D = fragment11;
                }
                r4.A00(fragment11, name12);
                return;
            case 13:
                String name13 = Abh.name();
                Fragment fragment12 = r4.A0E;
                if (fragment12 == null) {
                    Bundle A0614 = C18180wK.A06();
                    C18210wN.A0x(A0614, r4.A0H);
                    C62883b4.A04();
                    fragment12 = new AnonymousClass1cG();
                    fragment12.setArguments(A0614);
                    r4.A0E = fragment12;
                }
                r4.A00(fragment12, name13);
                return;
            case 14:
                String name14 = Abh.name();
                Bundle A0615 = C18180wK.A06();
                C18210wN.A0x(A0615, r4.A0H);
                C62883b4.A04();
                C84654td r1 = r4.A0K;
                String str11 = ((BusinessConversionActivity) r1).A04;
                boolean contains = AnonymousClass4WM.A08(C311924p.CREATOR_CONVERSION_FLOW, C311924p.CREATOR_SIGNUP_FLOW).contains(r1.Aiz());
                A0615.putString("user_email", str11);
                A0615.putBoolean("is_creator", contains);
                AnonymousClass1cW r06 = new AnonymousClass1cW();
                r06.setArguments(A0615);
                r4.A07 = r06;
                r4.A00(r06, name14);
                return;
            case 15:
                String name15 = Abh.name();
                C10300i6 r7 = r4.A0M.A00;
                boolean A082 = C67333zN.A08(C05030Qo.A02(r7), false);
                Fragment fragment13 = r4.A0C;
                if (fragment13 == null || A082) {
                    Bundle A0616 = C18180wK.A06();
                    C18210wN.A0x(A0616, r4.A0H);
                    SparseArray sparseArray = new SparseArray();
                    sparseArray.put(R.id.safety_step_handler, new AnonymousClass42N(r4));
                    fragment13 = C62883b4.A01().A00().A00(A0616, sparseArray, r4.A0K.Aiz(), C05030Qo.A02(r7));
                    r4.A0C = fragment13;
                }
                r4.A00(fragment13, name15);
                return;
            case 16:
                String name16 = Abh.name();
                Fragment fragment14 = r4.A06;
                if (fragment14 == null) {
                    Bundle A0617 = C18180wK.A06();
                    A0617.putString("entry_point", "conversion");
                    C62883b4.A04();
                    fragment14 = new OnboardingCheckListFragment();
                    fragment14.setArguments(A0617);
                    r4.A06 = fragment14;
                }
                r4.A00(fragment14, name16);
                return;
            case LangUtils.HASH_SEED /*17*/:
                C10300i6 r5 = r4.A0M.A00;
                C63803iN.A0E(AnonymousClass0TJ.A05, C05030Qo.A02(r5), 36321537694899082L);
                HashMap A0y = AnonymousClass0wJ.A0y();
                A0y.put("entry_point", "conversion");
                C57933Db r10 = r4.A0F;
                FragmentActivity fragmentActivity = r4.A0J;
                UserSession A022 = C05030Qo.A02(r5);
                C84654td r8 = r4.A0K;
                AnonymousClass447 r72 = AnonymousClass447.A00;
                C04220Ms.A0B(A022, 0);
                AnonymousClass01V.A0p.markerStart(962537714);
                AnonymousClass0wJ.A0F().postDelayed(new AnonymousClass4OO(A022), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                C130667qT A0T = C18220wO.A0T(fragmentActivity, r72, A022);
                AnonymousClass4A9 A002 = C63263h8.A00(A022, "com.instagram.pro_home.action", A0y);
                A002.A00 = new IDxACallbackShape10S0300000_1_I2(0, A0T, r10, r8);
                C31155GhB.A03(A002);
                C12560m7 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                supportFragmentManager.A0v(new IDxCListenerShape222S0200000_1_I2(0, (Object) supportFragmentManager, (Object) r4));
                return;
            default:
                C18230wP.A1P(r4.A0K);
                return;
        }
        C34572Kb.A00(C304921n.IG_PAGE_LINK, userSession).CXg(r4.A0J, new KtCSuperShape0S3100000_I2((Object) AnonymousClass22J.PAGE_SELECTION, (String) null, (String) null, (String) null, 7), "personal_to_business_conversion");
    }

    public final void A0D(Bundle bundle) {
        if (Abh() == null) {
            Bel((Bundle) null);
            C10300i6 A0U = AnonymousClass0wJ.A0U(this.A0A);
            if (A0U instanceof UserSession) {
                if (C18200wM.A1X((UserSession) A0U, C06810aP.A01)) {
                    C311924p r1 = this.A02;
                    if (r1 == null) {
                        C04220Ms.A0E("_flowType");
                        throw null;
                    } else if (r1 == C311924p.CONVERSION_FLOW) {
                        C25828Dsm A0W = C18190wL.A0W(this);
                        A0W.A0q(false);
                        A0W.A0r(false);
                        A0W.A0L(2131821307);
                        A0W.A0K(2131821306);
                        C18180wK.A1O(A0W, this, 11, 2131831976);
                        AnonymousClass0wJ.A1K(A0W);
                    }
                }
            }
        }
    }

    public final void A0J(Bundle bundle, boolean z) {
        ConversionStep conversionStep;
        A02(bundle, this);
        C04530Oa r7 = this.A0A;
        C67223zB.A02(bundle, C67223zB.A01(AnonymousClass0wJ.A0U(r7)), C18230wP.A0m(this), "skip", (String) null);
        A03(this);
        C311924p r1 = this.A02;
        if (r1 == null) {
            C04220Ms.A0E("_flowType");
            throw null;
        }
        if ((r1 == C311924p.CONVERSION_FLOW || r1 == C311924p.BUSINESS_SIGNUP_FLOW) && Abh() == ConversionStep.FACEBOOK_CONNECT) {
            AnonymousClass3VX r6 = this.A01;
            if (r6 == null) {
                C04220Ms.A0E("conversionLogic");
                throw null;
            }
            C10300i6 A0U = AnonymousClass0wJ.A0U(r7);
            C04220Ms.A0B(A0U, 0);
            ImmutableList.Builder builder = new ImmutableList.Builder();
            if (C63803iN.A0E(AnonymousClass0TJ.A05, A0U, 36321816867773493L)) {
                conversionStep = ConversionStep.PROFESSIONAL_DASHBOARD;
            } else {
                conversionStep = ConversionStep.ONBOARDING_CHECKLIST;
            }
            C313525q.A00(builder, conversionStep);
            r6.A03(C18250wR.A0F(builder));
        } else {
            AnonymousClass3VX r0 = this.A01;
            if (r0 == null) {
                C04220Ms.A0E("conversionLogic");
                throw null;
            }
            r0.A02();
        }
        C67223zB.A02(this.A00, C67223zB.A01(AnonymousClass0wJ.A0U(r7)), C18230wP.A0m(this), "start_step", (String) null);
        A04(this, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if (r9 > r2.A01.size()) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bem(android.os.Bundle r11, com.instagram.business.controller.datamodel.ConversionStep r12, boolean r13) {
        /*
            r10 = this;
            A02(r11, r10)
            X.0Oa r5 = r10.A0A
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r5)
            X.3zB r2 = X.C67223zB.A01(r0)
            java.lang.String r1 = X.C18230wP.A0m(r10)
            java.lang.String r0 = "finish_step"
            r4 = 0
            X.C67223zB.A02(r11, r2, r1, r0, r4)
            A03(r10)
            if (r12 == 0) goto L_0x0065
            java.util.HashSet r0 = r10.A07
            r0.add(r12)
            X.3VX r6 = r10.A01
            java.lang.String r0 = "conversionLogic"
            if (r6 != 0) goto L_0x002b
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x002b:
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r2 = r6.A00
            X.25q r0 = X.C313525q.NEXT
            com.instagram.business.controller.datamodel.BusinessConversionStep r8 = new com.instagram.business.controller.datamodel.BusinessConversionStep
            r8.<init>(r0, r12)
            int r7 = r2.A00
            int r9 = r7 + 1
            if (r9 < 0) goto L_0x0043
            com.google.common.collect.ImmutableList r0 = r2.A01
            int r1 = r0.size()
            r0 = 1
            if (r9 <= r1) goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            X.AnonymousClass7Ko.A0C(r0)
            com.google.common.collect.ImmutableList r3 = r2.A01
            int r0 = r3.size()
            com.google.common.collect.ImmutableList$Builder r2 = new com.google.common.collect.ImmutableList$Builder
            if (r9 != r0) goto L_0x006f
            r2.<init>()
            r2.addAll((java.lang.Iterable) r3)
            r2.add((java.lang.Object) r8)
            com.google.common.collect.ImmutableList r0 = r2.build()
        L_0x005e:
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r1 = new com.instagram.business.controller.datamodel.BusinessConversionFlowStatus
            r1.<init>(r0, r7)
            r6.A00 = r1
        L_0x0065:
            X.3VX r0 = r10.A01
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = "conversionLogic"
            X.C04220Ms.A0E(r0)
            throw r4
        L_0x006f:
            r2.<init>()
            r1 = 0
        L_0x0073:
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x0088
            if (r1 != r9) goto L_0x007e
            r2.add((java.lang.Object) r8)
        L_0x007e:
            java.lang.Object r0 = r3.get(r1)
            r2.add((java.lang.Object) r0)
            int r1 = r1 + 1
            goto L_0x0073
        L_0x0088:
            com.google.common.collect.ImmutableList r0 = r2.build()
            goto L_0x005e
        L_0x008d:
            r0.A02()
            r0 = 1
            A04(r10, r0)
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r5)
            X.3zB r3 = X.C67223zB.A01(r0)
            java.lang.String r2 = X.C18230wP.A0m(r10)
            android.os.Bundle r1 = r10.A00
            java.lang.String r0 = "start_step"
            X.C67223zB.A02(r1, r3, r2, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.activity.BusinessConversionActivity.Bem(android.os.Bundle, com.instagram.business.controller.datamodel.ConversionStep, boolean):void");
    }

    public final void CfG(Bundle bundle) {
        BusinessConversionStep businessConversionStep;
        BusinessConversionFlowStatus businessConversionFlowStatus;
        ConversionStep Abh = Abh();
        C67223zB.A02(bundle, C67223zB.A01(AnonymousClass0wJ.A0U(this.A0A)), C18230wP.A0m(this), "cancel", (String) null);
        AnonymousClass3VX r4 = this.A01;
        if (r4 == null) {
            C04220Ms.A0E("conversionLogic");
            throw null;
        }
        BusinessConversionFlowStatus businessConversionFlowStatus2 = r4.A00;
        if (businessConversionFlowStatus2.A00 > -1) {
            BusinessConversionStep A002 = businessConversionFlowStatus2.A00();
            if (A002 != null) {
                r4.A03.remove(A002);
            }
            BusinessConversionFlowStatus businessConversionFlowStatus3 = r4.A00;
            int i = businessConversionFlowStatus3.A00;
            if (i <= 0 || (businessConversionStep = (BusinessConversionStep) businessConversionFlowStatus3.A01.get(i - 1)) == null) {
                BusinessConversionFlowStatus businessConversionFlowStatus4 = r4.A00;
                r4.A00 = new BusinessConversionFlowStatus(businessConversionFlowStatus4.A01, businessConversionFlowStatus4.A00 - 1);
                for (AnonymousClass33Y r0 : r4.A01) {
                    BusinessConversionActivity businessConversionActivity = r0.A00;
                    C67223zB A012 = C67223zB.A01(AnonymousClass0wJ.A0U(businessConversionActivity.A0A));
                    if (C67223zB.A02 != null) {
                        C81194nK r02 = A012.A00;
                        synchronized (r02) {
                        }
                        synchronized (r02) {
                        }
                        C67223zB.A03 = new AnonymousClass32J();
                    }
                    businessConversionActivity.setResult(0);
                }
                r4.A02 = C18200wM.A0u();
                r4.A01 = C18200wM.A0u();
            } else {
                if (businessConversionStep.A00 == C313525q.SKIP) {
                    Map map = r4.A03;
                    if (map.containsKey(businessConversionStep)) {
                        businessConversionFlowStatus = (BusinessConversionFlowStatus) map.get(businessConversionStep);
                        r4.A00 = businessConversionFlowStatus;
                    }
                }
                BusinessConversionFlowStatus businessConversionFlowStatus5 = r4.A00;
                businessConversionFlowStatus = new BusinessConversionFlowStatus(businessConversionFlowStatus5.A01, businessConversionFlowStatus5.A00 - 1);
                r4.A00 = businessConversionFlowStatus;
            }
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("EXTRA_FORCE_FETCH_FB_PAGES", false)) {
            z = true;
        }
        ConversionStep conversionStep = ConversionStep.CREATE_PAGE;
        if (Abh == conversionStep) {
            AnonymousClass3VX r6 = this.A01;
            if (r6 == null) {
                C04220Ms.A0E("conversionLogic");
                throw null;
            }
            BusinessConversionFlowStatus businessConversionFlowStatus6 = r6.A00;
            int i2 = businessConversionFlowStatus6.A00;
            AnonymousClass7Ko.A0C(C18230wP.A1W(i2, businessConversionFlowStatus6.A01.size() - 1));
            r6.A00 = AnonymousClass3WC.A00(businessConversionFlowStatus6, i2 + 1, i2);
            if (!z) {
                C04530Oa r2 = this.A08;
                if (C18220wO.A0U(r2).A01 == ConversionStep.PAGE_SELECTION && C18220wO.A0U(r2).A05 != null && !C18220wO.A0U(r2).A01()) {
                    CfG((Bundle) null);
                }
            }
        } else if (this.A07.contains(Abh)) {
            AnonymousClass3VX r62 = this.A01;
            if (r62 == null) {
                C04220Ms.A0E("conversionLogic");
                throw null;
            }
            BusinessConversionFlowStatus businessConversionFlowStatus7 = r62.A00;
            int i3 = businessConversionFlowStatus7.A00;
            AnonymousClass7Ko.A0C(C18230wP.A1W(i3, businessConversionFlowStatus7.A01.size() - 1));
            r62.A00 = AnonymousClass3WC.A00(businessConversionFlowStatus7, i3 + 1, i3);
        }
        this.A07.remove(Abh);
        ConversionStep Abh2 = Abh();
        if (Abh2 == null) {
            finish();
            return;
        }
        if (Abh2 == ConversionStep.PAGE_SELECTION || Abh2 == conversionStep) {
            C04530Oa r1 = this.A08;
            C18220wO.A0U(r1).A0F = null;
            r1.getValue();
        }
        FragmentActivity fragmentActivity = ((AnonymousClass3GN) this.A0D.getValue()).A0J;
        fragmentActivity.getSupportFragmentManager().A1C(Abh2.name(), 0);
    }

    public final void finish() {
        super.finish();
        if (AnonymousClass0wJ.A1X(this.A0F.getValue())) {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        if (X.C62963bD.A03(A0G, X.AnonymousClass0wJ.A0U(r9.A0A), "ig_professional_creation_flow") != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f9, code lost:
        X.C313525q.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fc, code lost:
        r2 = new com.instagram.business.controller.datamodel.BusinessConversionStep(X.C313525q.A02, com.instagram.business.controller.datamodel.ConversionStep.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0205, code lost:
        r5.add((java.lang.Object) r2);
        r0 = X.C18250wR.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x021c, code lost:
        X.C313525q.A00(r1, r0);
        r0 = r1.build();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x023e, code lost:
        r1 = new com.instagram.business.controller.datamodel.BusinessConversionFlowStatus((java.util.List) r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            r0 = -2126359644(0xffffffff814253a4, float:-3.5692182E-38)
            int r4 = X.C14030oh.A00(r0)
            X.0Oa r3 = r9.A0C
            java.lang.Object r1 = r3.getValue()
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            java.lang.String r0 = "business_account_flow"
            int r7 = r1.getInt(r0)
            X.24p[] r6 = X.C311924p.values()
            int r5 = r6.length
            r2 = 0
        L_0x001b:
            if (r2 >= r5) goto L_0x0265
            r1 = r6[r2]
            int r0 = r1.A00
            if (r0 != r7) goto L_0x0255
            r9.A02 = r1
            X.24p r0 = X.C311924p.INTEREST_ACCOUNT_CONVERSION
            if (r1 != r0) goto L_0x004e
            X.0Oa r0 = r9.A0A
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r0)
            r0 = 0
            X.C04220Ms.A0B(r2, r0)
            r0 = 36316851885575522(0x8105fc00000d62, double:3.030261596438212E-306)
            X.0e5 r1 = X.AnonymousClass0e5.A00(r0)
            r0 = 1
            java.lang.Object r0 = X.C67333zN.A00(r2, r1, r0)
            X.C04220Ms.A06(r0)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x004e
            X.24p r0 = X.C311924p.RENEW_PROFESSIONAL_ACCOUNT
            r9.A02 = r0
        L_0x004e:
            r9.A00()
            X.24p r0 = r9.A02
            if (r0 == 0) goto L_0x025e
            X.24p r6 = X.C311924p.PROFESSIONAL_SIGNUP_FLOW
            if (r0 != r6) goto L_0x0245
            X.0Oa r0 = r9.A08
            X.3yv r0 = X.C18220wO.A0U(r0)
            java.lang.String r0 = r0.A0C
            if (r0 != 0) goto L_0x0074
            X.0Oa r0 = r9.A0A
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r0)
            com.facebook.common.callercontext.CallerContext r1 = A0G
            java.lang.String r0 = "ig_professional_creation_flow"
            boolean r1 = X.C62963bD.A03(r1, r2, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0075
        L_0x0074:
            r0 = 1
        L_0x0075:
            r9.A05 = r0
            java.lang.Object r1 = r3.getValue()
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            java.lang.String r0 = "only_show_nux_screens"
            r2 = 0
            boolean r8 = r1.getBoolean(r0, r2)
            java.lang.Object r1 = r3.getValue()
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            java.lang.String r0 = "show_personal_account_selector"
            boolean r7 = r1.getBoolean(r0, r2)
            if (r10 == 0) goto L_0x0190
            java.lang.String r0 = "conversion_flow_status"
            android.os.Parcelable r1 = r10.getParcelable(r0)
            if (r1 == 0) goto L_0x0259
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r1 = (com.instagram.business.controller.datamodel.BusinessConversionFlowStatus) r1
        L_0x009c:
            X.0Oa r5 = r9.A0E
            r5.getValue()
            X.3VX r0 = new X.3VX
            r0.<init>(r1)
            r9.A01 = r0
            java.lang.String r2 = "conversionLogic"
            X.33Y r1 = new X.33Y
            r1.<init>(r9)
            java.util.Set r0 = r0.A01
            r0.add(r1)
            X.3VX r0 = r9.A01
            if (r0 == 0) goto L_0x0260
            X.33Z r1 = new X.33Z
            r1.<init>(r9)
            java.util.Set r0 = r0.A02
            r0.add(r1)
            if (r8 == 0) goto L_0x00e3
            X.24p r0 = r9.Aiz()
            if (r0 != r6) goto L_0x00e3
            X.0Oa r0 = r9.A0A
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            com.instagram.service.session.UserSession r0 = X.C05030Qo.A02(r0)
            X.3V5 r2 = new X.3V5
            r2.<init>(r9, r0)
            r0 = 5
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r1 = X.C63873iU.A06(r9, r0)
            java.lang.String r0 = "conversion"
            r2.A02(r1, r0)
        L_0x00e3:
            java.lang.Object r1 = r3.getValue()
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            X.C04220Ms.A06(r1)
            if (r10 == 0) goto L_0x0189
            java.lang.String r0 = "business_info"
            android.os.Parcelable r0 = r10.getParcelable(r0)
            com.instagram.model.business.BusinessInfo r0 = (com.instagram.model.business.BusinessInfo) r0
            if (r0 == 0) goto L_0x0189
            X.3Xl r7 = new X.3Xl
            r7.<init>(r0)
        L_0x00fd:
            java.lang.String r0 = "account_id"
            java.lang.String r6 = r1.getString(r0)
            java.lang.String r0 = "user_type"
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r0 = "upsell_page_id"
            java.lang.String r2 = r1.getString(r0)
            X.0Oa r0 = r9.A08
            X.3yv r1 = X.C18220wO.A0U(r0)
            r7.A0G = r6
            r7.A0I = r3
            r7.A0H = r2
            com.instagram.model.business.BusinessInfo r0 = new com.instagram.model.business.BusinessInfo
            r0.<init>((X.C62163Xl) r7)
            r1.A06 = r0
            java.lang.String r1 = "EXTRA_FB_OVERRIDE_DATA"
            if (r10 == 0) goto L_0x012e
            android.os.Parcelable r0 = r10.getParcelable(r1)
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = (com.instagram.business.controller.datamodel.PageSelectionOverrideData) r0
            if (r0 != 0) goto L_0x0138
        L_0x012e:
            android.content.Intent r0 = r9.getIntent()
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = (com.instagram.business.controller.datamodel.PageSelectionOverrideData) r0
        L_0x0138:
            r9.A03 = r0
            X.0Oa r0 = r9.A0D
            java.lang.Object r1 = r0.getValue()
            X.3GN r1 = (X.AnonymousClass3GN) r1
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = r9.A03
            r1.A0G = r0
            super.onCreate(r10)
            java.lang.Object r0 = r5.getValue()
            X.33f r0 = (X.C554433f) r0
            X.0i6 r0 = r0.A00
            com.instagram.service.session.UserSession r3 = X.C05030Qo.A02(r0)
            X.C04220Ms.A06(r3)
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36326159079712202(0x810e73000025ca, double:3.036147503487311E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0182
            java.lang.Object r0 = r5.getValue()
            X.33f r0 = (X.C554433f) r0
            X.0i6 r0 = r0.A00
            com.instagram.service.session.UserSession r1 = X.C05030Qo.A02(r0)
            X.C04220Ms.A06(r1)
            X.21n r0 = X.C304921n.IG_PAGE_LINK
            X.4tw r1 = X.C34572Kb.A00(r0, r1)
            X.42w r0 = new X.42w
            r0.<init>(r9)
            r1.CZo(r9, r0)
        L_0x0182:
            r0 = -1954870128(0xffffffff8b7b0c90, float:-4.8350293E-32)
            X.C14030oh.A07(r0, r4)
            return
        L_0x0189:
            X.3Xl r7 = new X.3Xl
            r7.<init>()
            goto L_0x00fd
        L_0x0190:
            X.24p r5 = r9.A02
            if (r5 == 0) goto L_0x025e
            X.0Oa r0 = r9.A08
            X.3yv r0 = X.C18220wO.A0U(r0)
            int r1 = r0.A00
            r0 = -1
            boolean r2 = X.AnonymousClass0wJ.A1T(r1, r0)
            X.0Oa r0 = r9.A0A
            java.lang.Object r1 = r0.getValue()
            r0 = 5
            X.C04220Ms.A0B(r1, r0)
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L_0x01e6;
                case 1: goto L_0x01f0;
                case 2: goto L_0x0224;
                case 3: goto L_0x0215;
                case 4: goto L_0x01b2;
                case 5: goto L_0x01b7;
                case 6: goto L_0x01b2;
                case 7: goto L_0x01b2;
                case 8: goto L_0x0215;
                case 9: goto L_0x020d;
                default: goto L_0x01b2;
            }
        L_0x01b2:
            java.lang.UnsupportedOperationException r0 = X.C18240wQ.A0j()
            throw r0
        L_0x01b7:
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            if (r8 == 0) goto L_0x01cd
            r5.<init>()
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.SAVE_LOGIN_INFO
            X.25q r1 = X.C313525q.NEXT
            X.C18250wR.A15(r5, r1, r0)
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.ACCOUNT_TYPE_SELECTION_V2
        L_0x01c7:
            com.instagram.business.controller.datamodel.BusinessConversionStep r2 = new com.instagram.business.controller.datamodel.BusinessConversionStep
            r2.<init>(r1, r0)
            goto L_0x0205
        L_0x01cd:
            r5.<init>()
            if (r7 == 0) goto L_0x01d7
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.PROFESSIONAL_ACCOUNT_SELECTION
            X.C313525q.A00(r5, r0)
        L_0x01d7:
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.INTRO
            X.25q r1 = X.C313525q.NEXT
            X.C18250wR.A15(r5, r1, r0)
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.CHOOSE_CATEGORY
            X.C18250wR.A15(r5, r1, r0)
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.REGULAR_SIGNUP_FLOW
            goto L_0x01c7
        L_0x01e6:
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            r5.<init>()
            if (r2 != 0) goto L_0x01fc
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.INTRO
            goto L_0x01f9
        L_0x01f0:
            com.google.common.collect.ImmutableList$Builder r5 = new com.google.common.collect.ImmutableList$Builder
            r5.<init>()
            if (r2 != 0) goto L_0x01fc
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.CREATOR_ACCOUNT_DESCRIPTION
        L_0x01f9:
            X.C313525q.A00(r5, r0)
        L_0x01fc:
            com.instagram.business.controller.datamodel.ConversionStep r1 = com.instagram.business.controller.datamodel.ConversionStep.CHOOSE_CATEGORY
            X.25q r0 = X.C313525q.NEXT
            com.instagram.business.controller.datamodel.BusinessConversionStep r2 = new com.instagram.business.controller.datamodel.BusinessConversionStep
            r2.<init>(r0, r1)
        L_0x0205:
            r5.add((java.lang.Object) r2)
            com.google.common.collect.ImmutableList r0 = X.C18250wR.A0F(r5)
            goto L_0x023e
        L_0x020d:
            com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder
            r1.<init>()
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.RENEW
            goto L_0x021c
        L_0x0215:
            com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder
            r1.<init>()
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.PAGE_SELECTION
        L_0x021c:
            X.C313525q.A00(r1, r0)
            com.google.common.collect.ImmutableList r0 = r1.build()
            goto L_0x023e
        L_0x0224:
            com.google.common.collect.ImmutableList$Builder r2 = new com.google.common.collect.ImmutableList$Builder
            r2.<init>()
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.INTRO
            X.C313525q.A00(r2, r0)
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.CHOOSE_CATEGORY
            X.25q r1 = X.C313525q.NEXT
            X.C18250wR.A15(r2, r1, r0)
            com.instagram.business.controller.datamodel.ConversionStep r0 = com.instagram.business.controller.datamodel.ConversionStep.ACCOUNT_TYPE_SELECTION_V2
            X.C18250wR.A15(r2, r1, r0)
            com.google.common.collect.ImmutableList r0 = X.C18250wR.A0F(r2)
        L_0x023e:
            com.instagram.business.controller.datamodel.BusinessConversionFlowStatus r1 = new com.instagram.business.controller.datamodel.BusinessConversionFlowStatus
            r1.<init>((java.util.List) r0)
            goto L_0x009c
        L_0x0245:
            X.0Oa r0 = r9.A0A
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r0)
            com.facebook.common.callercontext.CallerContext r1 = A0G
            java.lang.String r0 = "ig_professional_conversion_flow"
            boolean r0 = X.C62963bD.A03(r1, r2, r0)
            goto L_0x0075
        L_0x0255:
            int r2 = r2 + 1
            goto L_0x001b
        L_0x0259:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        L_0x025e:
            java.lang.String r2 = "_flowType"
        L_0x0260:
            X.C04220Ms.A0E(r2)
            r0 = 0
            throw r0
        L_0x0265:
            java.lang.String r0 = "Unsupported BusinessAccountFlowType"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.business.activity.BusinessConversionActivity.onCreate(android.os.Bundle):void");
    }

    public final void onResume() {
        int A002 = C14030oh.A00(780452469);
        super.onResume();
        AnonymousClass44X.A00().A04(AnonymousClass0wJ.A0U(this.A0A), (AnonymousClass265) null);
        C14030oh.A07(-51052771, A002);
    }

    public final void schedule(C33841Hva hva, int i, int i2, boolean z, boolean z2) {
        C04220Ms.A0B(hva, 0);
        schedule(hva);
    }
}
