package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.redex.IDxCListenerShape217S0200000_1_I2;
import com.facebook.redex.IDxFCallbackShape313S0100000_1_I2;
import com.facebook.redex.IDxObjectShape282S0100000_1_I2;
import com.facebook.redex.IDxTListenerShape295S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.business.controller.datamodel.PageSelectionOverrideData;
import com.instagram.business.fragment.EditBusinessFBPageFragment;
import com.instagram.business.fragment.FBPageListWithPreviewFragment;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.common.api.base.IDxACallbackShape4S1100000_1_I2;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.model.business.BusinessInfo;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1cM  reason: invalid class name */
public final class AnonymousClass1cM extends C34640IcN implements C82424pb, C82034oy, C84284st, C144658ir, C84264sr, CallerContextable {
    public static final String __redex_internal_original_name = "FbPageCreationFragment";
    public View A00;
    public View A01;
    public View A02;
    public EditText A03;
    public ImageView A04;
    public TextView A05;
    public TextView A06;
    public BusinessFlowAnalyticsLogger A07;
    public C84654td A08;
    public C570739q A09;
    public PageSelectionOverrideData A0A;
    public AnonymousClass48S A0B;
    public BusinessNavBar A0C;
    public C24711ju A0D;
    public C10300i6 A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public TextView A0L;
    public C24731jw A0M;
    public C84464tB A0N;
    public IgSwitch A0O;
    public IgSwitch A0P;
    public boolean A0Q;
    public boolean A0R;
    public final Handler A0S = new C18540xM(Looper.getMainLooper(), this);
    public final TextWatcher A0T = new IDxObjectShape282S0100000_1_I2(this, 4);

    public static boolean A09(AnonymousClass1cM r12, String str, String str2) {
        String str3;
        AnonymousClass1cM r4 = r12;
        if (!C67293zJ.A04(r12.A08) && !r12.A0K && !r12.A0J && !r12.A0I) {
            return false;
        }
        String str4 = str;
        if (r12.getTargetFragment() instanceof FBPageListWithPreviewFragment) {
            ((FBPageListWithPreviewFragment) r12.getTargetFragment()).A09 = str;
        }
        String str5 = str2;
        if (C04660Oo.A00(r12.A0E) == null || !C04660Oo.A00(r12.A0E).A3Z()) {
            BusinessInfo businessInfo = AnonymousClass0wJ.A0R(r12.A08).A06;
            if (!C63483hZ.A07(r12.A0E)) {
                businessInfo = null;
            }
            C62163Xl r0 = new C62163Xl(businessInfo);
            r0.A0J = str;
            r12.A0S.post(new AnonymousClass4T3(r12, new BusinessInfo(r0), str2, AnonymousClass0wJ.A0n(r12.A03), str4));
            return true;
        }
        UserSession A022 = C05030Qo.A02(r12.A0E);
        String A032 = C67293zJ.A03(r12.A08, r12.A0E);
        Context context = r12.getContext();
        String str6 = r12.A0F;
        if (r12.A0G) {
            str3 = "edit_profile_flow";
        } else if (C67293zJ.A04(r12.A08)) {
            str3 = "business_conversion";
        } else {
            str3 = null;
        }
        AnonymousClass2KX.A00(context, r4, r12, A022, str4, str5, A032, str6, str3);
        return true;
    }

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final String getModuleName() {
        return "page_creation";
    }

    public static String A00(AnonymousClass1cM r2) {
        ConversionStep CWQ;
        if (r2.A0Q) {
            C84654td r1 = r2.A08;
            if (r1 == null || (CWQ = r1.CWQ()) == null) {
                return null;
            }
            return CWQ.A00;
        }
        PageSelectionOverrideData pageSelectionOverrideData = r2.A0A;
        if (pageSelectionOverrideData != null) {
            return pageSelectionOverrideData.A07;
        }
        return null;
    }

    public static void A02(AnonymousClass1cM r9) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (!r9.A0K && (businessFlowAnalyticsLogger = r9.A07) != null) {
            businessFlowAnalyticsLogger.BcE(new C37408JrQ("create_page", r9.A0F, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public static void A03(AnonymousClass1cM r6) {
        r6.A0S.removeMessages(1);
        if (r6.A03 != null) {
            String A032 = C67293zJ.A03(r6.A08, r6.A0E);
            String A0n = AnonymousClass0wJ.A0n(r6.A03);
            C67463zb A002 = C67463zb.A00();
            A002.A05("input_name", A0n);
            AnonymousClass7Ko.A0B(AnonymousClass0wJ.A1W(A0n));
            C32165H8c A0X = C18220wO.A0X(C67473zc.A00(A002, C204214p.class, "FbPageTitleCheckQuery"), A032);
            A0X.A00 = new IDxACallbackShape4S1100000_1_I2(A0n, r6, 1);
            r6.schedule(A0X);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r2.A0B == null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass1cM r2) {
        /*
            android.widget.EditText r0 = r2.A03
            if (r0 == 0) goto L_0x001b
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x001b
            android.widget.TextView r0 = r2.A05
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x001b
            X.48S r0 = r2.A0B
            r1 = 1
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            X.1ju r0 = r2.A0D
            if (r0 == 0) goto L_0x0025
            com.instagram.business.ui.BusinessNavBar r0 = r2.A0C
            r0.setPrimaryButtonEnabled(r1)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cM.A04(X.1cM):void");
    }

    public static void A05(AnonymousClass1cM r3, AnonymousClass3IK r4) {
        if (r3.A0G && (r3.A0E instanceof UserSession)) {
            if (r3.getTargetFragment() instanceof EditBusinessFBPageFragment) {
                EditBusinessFBPageFragment editBusinessFBPageFragment = (EditBusinessFBPageFragment) r3.getTargetFragment();
                String str = r4.A08;
                if (!TextUtils.isEmpty(str)) {
                    editBusinessFBPageFragment.A05 = r4;
                    editBusinessFBPageFragment.A08 = str;
                }
            }
            C18180wK.A12(r3);
        }
    }

    public static void A06(AnonymousClass1cM r9, String str) {
        String str2;
        C570739q r1 = r9.A09;
        if (r1 != null) {
            if ((r9.A0E instanceof UserSession) && r1.A02) {
                Context context = r9.getContext();
                UserSession A022 = C05030Qo.A02(r9.A0E);
                AnonymousClass06E A002 = AnonymousClass06E.A00(r9);
                IDxACallbackShape4S1100000_1_I2 iDxACallbackShape4S1100000_1_I2 = new IDxACallbackShape4S1100000_1_I2(str, r9, 0);
                String A003 = C61853Wb.A00(C67353zP.A00, A022, "ig_professional_conversion_flow");
                AnonymousClass7Ko.A07(A003, "fbAccessToken must not be null");
                C67463zb A004 = C67463zb.A00();
                GQLCallInputCInputShape0S0000000 A005 = GraphQlCallInput.A00();
                GraphQlCallInput.A05(A005, A022.getUserId(), "ig_user_id");
                GQLCallInputCInputShape0S0000000 A006 = GraphQlCallInput.A00();
                GraphQlCallInput.A05(A006, A003, "sensitive_string_value");
                A005.A0B(A006, "access_token");
                GraphQlCallInput.A05(A005, str, "page_id");
                C67463zb.A01(A005, A004);
                AnonymousClass7Ko.A0B(true);
                C32165H8c A0X = C18220wO.A0X(C67473zc.A00(A004, C204614t.class, "ImportIGProfilePhotoToPage"), A003);
                A0X.A00 = iDxACallbackShape4S1100000_1_I2;
                C31155GhB.A01(context, A002, A0X);
            }
            C570739q r2 = r9.A09;
            C28161tl A012 = AnonymousClass3WS.A01(r2.A00);
            if (r2.A01) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            C18180wK.A0v(C28161tl.A02(A012), "share_to_fb_settings", str2);
        }
    }

    public static void A07(AnonymousClass1cM r8, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r8.A07;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Be5(new C37408JrQ("create_page", r8.A0F, str, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
    }

    public final void C46(int i, boolean z) {
        int height;
        int i2;
        BusinessNavBar businessNavBar = this.A0C;
        if (businessNavBar == null) {
            height = 0;
        } else {
            height = businessNavBar.getHeight();
        }
        View A092 = C18250wR.A09(this);
        if (A092 != null) {
            int[] iArr = new int[2];
            A092.getLocationInWindow(iArr);
            if (i > 0) {
                int A072 = (C09860go.A07(getContext()) - iArr[1]) - A092.getHeight();
                View view = this.A01;
                if (view != null && A072 < (i2 = i + height)) {
                    view.postDelayed(new C73104Qy(this, i2 - A072), 300);
                }
            }
        }
    }

    public final void CCX() {
        A07(this, "continue");
        UserSession A022 = C05030Qo.A02(this.A0E);
        GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
        GraphQlCallInput.A05(A002, A022.getUserId(), "id");
        GraphQlCallInput.A05(A002, "", "access_token");
        C67463zb A003 = C67463zb.A00();
        A003.A02(A002, "query_params");
        AnonymousClass7Ko.A0B(true);
        C67453za.A00(this.A0E).AMA(C67473zc.A00(A003, AnonymousClass16N.class, "IGUserAPPlusCreationEligibleCheckQuery"), new IDxFCallbackShape313S0100000_1_I2(this, 3));
    }

    public final void CGO() {
        C24711ju r0 = this.A0D;
        if (r0 != null) {
            r0.A00();
        }
        A04(this);
    }

    public final void CGY() {
        C24711ju r0 = this.A0D;
        if (r0 != null) {
            r0.A01();
        }
        A04(this);
    }

    public final void CGh(String str) {
        if (!this.A0K) {
            HashMap A0y = AnonymousClass0wJ.A0y();
            C18250wR.A1E(str, A0y);
            BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A07;
            if (businessFlowAnalyticsLogger != null) {
                businessFlowAnalyticsLogger.Bdx(new C37408JrQ("create_page", this.A0F, "switch_page", (String) null, (String) null, (Map) null, A0y, (Map) null));
            }
        }
        if (C67293zJ.A04(this.A08) || this.A0K || this.A0J || this.A0I) {
            this.A0S.post(new C73114Qz(this, str));
            if (this.A0R) {
                A06(this, str);
            }
        } else if (this.A0G) {
            this.A0S.post(new AnonymousClass4OY(this));
        }
    }

    public final void CJ9() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        A07(this, "skip");
        if (!this.A0K && (businessFlowAnalyticsLogger = this.A07) != null) {
            businessFlowAnalyticsLogger.Bdo(new C37408JrQ("create_page", this.A0F, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (C67293zJ.A04(this.A08) || this.A0K || this.A0I) {
            C18220wO.A1N(this.A08);
        }
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        int i;
        if (this.A0K) {
            i = 2131828998;
        } else {
            if (this.A0J) {
                i = 2131835504;
            }
            AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 144);
            A04(this);
        }
        r3.Cqb(i);
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 144);
        A04(this);
    }

    public final C10300i6 getSession() {
        return this.A0E;
    }

    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A07;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.BbZ(new C37408JrQ("create_page", this.A0F, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        }
        if (requireArguments().getBoolean("from_null_state")) {
            this.mFragmentManager.A11("com.instagram.business.fragment.FBPageListWithPreviewFragment", 1);
        }
        C84654td r0 = this.A08;
        if (r0 == null) {
            return false;
        }
        C18230wP.A1Q(r0);
        return true;
    }

    public static Map A01(String str, String str2) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (!TextUtils.isEmpty(str)) {
            A0y.put("page_name", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            A0y.put("category_id", str2);
        }
        return A0y;
    }

    public static void A08(AnonymousClass1cM r6, String str, String str2, String str3, String str4) {
        Map A012 = A01(str, str2);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r6.A07;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdy(new C37408JrQ("create_page", r6.A0F, "create_page", str3, str4, (Map) null, A012, (Map) null));
        }
    }

    public final void CGK(String str, String str2, String str3, String str4) {
        C18250wR.A1E(str4, AnonymousClass0wJ.A0y());
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A07;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Bdy(new C37408JrQ("create_page", this.A0F, "switch_page", str2, str3, (Map) null, (Map) null, (Map) null));
        }
        C63813iO.A01(getContext(), str);
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.A08 = C67293zJ.A01(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0097, code lost:
        if (r2 != X.C311924p.SHOPPING_IN_APP_SIGNUP_FLOW) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a7, code lost:
        if (r2 != X.C311924p.SERVICE_ONBOARDING_FLOW) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = 715243132(0x2aa1be7c, float:2.873152E-13)
            int r3 = X.C14030oh.A02(r0)
            super.onCreate(r7)
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            X.1jw r0 = new X.1jw
            r0.<init>(r1)
            r6.A0M = r0
            r6.registerLifecycleListener(r0)
            android.os.Bundle r0 = r6.mArguments
            X.0i6 r0 = X.C18190wL.A0S(r0)
            r6.A0E = r0
            android.os.Bundle r1 = r6.mArguments
            java.lang.String r0 = "entry_point"
            java.lang.String r0 = r1.getString(r0)
            r6.A0F = r0
            android.os.Bundle r1 = r6.mArguments
            java.lang.String r0 = "EXTRA_FB_OVERRIDE_DATA"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            com.instagram.business.controller.datamodel.PageSelectionOverrideData r0 = (com.instagram.business.controller.datamodel.PageSelectionOverrideData) r0
            r6.A0A = r0
            android.os.Bundle r1 = r6.mArguments
            java.lang.String r0 = "business_profile_edit_entry"
            r4 = 0
            boolean r0 = r1.getBoolean(r0, r4)
            r6.A0G = r0
            X.4tB r0 = X.C25711DqZ.A01(r6, r4, r4)
            r6.A0N = r0
            X.0i6 r1 = r6.A0E
            boolean r0 = r1 instanceof com.instagram.service.session.UserSession
            if (r0 == 0) goto L_0x00cb
            com.instagram.service.session.UserSession r1 = X.C05030Qo.A02(r1)
            X.39q r0 = new X.39q
            r0.<init>(r1)
        L_0x0056:
            r6.A09 = r0
            X.4td r0 = r6.A08
            if (r0 == 0) goto L_0x008c
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r0)
            com.instagram.model.business.BusinessInfo r0 = r0.A06
            if (r0 == 0) goto L_0x008c
            X.4td r0 = r6.A08
            boolean r0 = X.C67293zJ.A04(r0)
            if (r0 == 0) goto L_0x008c
            X.4td r0 = r6.A08
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r0)
            com.instagram.model.business.BusinessInfo r0 = r0.A06
            java.lang.String r5 = r0.A09
            X.4td r0 = r6.A08
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r0)
            com.instagram.model.business.BusinessInfo r0 = r0.A06
            java.lang.String r2 = r0.A0K
            if (r5 == 0) goto L_0x008c
            if (r2 == 0) goto L_0x008c
            r1 = 0
            X.48S r0 = new X.48S
            r0.<init>(r1, r5, r2)
            r6.A0B = r0
        L_0x008c:
            X.4td r0 = r6.A08
            if (r0 == 0) goto L_0x0099
            X.24p r2 = r0.Aiz()
            X.24p r1 = X.C311924p.SHOPPING_IN_APP_SIGNUP_FLOW
            r0 = 1
            if (r2 == r1) goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            r6.A0K = r0
            X.4td r0 = r6.A08
            if (r0 == 0) goto L_0x00a9
            X.24p r2 = r0.Aiz()
            X.24p r1 = X.C311924p.SERVICE_ONBOARDING_FLOW
            r0 = 1
            if (r2 == r1) goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            r6.A0J = r0
            X.4td r0 = r6.A08
            boolean r0 = X.C67293zJ.A06(r0)
            r6.A0I = r0
            X.4td r0 = r6.A08
            if (r0 == 0) goto L_0x00bd
            boolean r0 = r6.A0J
            if (r0 != 0) goto L_0x00bd
            r4 = 1
        L_0x00bd:
            r6.A0H = r4
            X.4tB r0 = r6.A0N
            r0.A6s(r6)
            r0 = -121406475(0xfffffffff8c37bf5, float:-3.1719126E34)
            X.C14030oh.A09(r0, r3)
            return
        L_0x00cb:
            r0 = 0
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cM.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r7.A0G != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
            r7 = this;
            r0 = -89554144(0xfffffffffaa98320, float:-4.4007885E35)
            int r1 = X.C14030oh.A02(r0)
            r0 = 2131496021(0x7f0c0c55, float:1.8615595E38)
            r2 = 0
            android.view.View r3 = r8.inflate(r0, r9, r2)
            r0 = 2131303605(0x7f091cb5, float:1.822533E38)
            android.view.View r0 = r3.findViewById(r0)
            com.instagram.business.ui.BusinessNavBar r0 = (com.instagram.business.ui.BusinessNavBar) r0
            r7.A0C = r0
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x0077
            r6 = 2131824552(0x7f110fa8, float:1.9281935E38)
        L_0x0021:
            com.instagram.business.ui.BusinessNavBar r5 = r7.A0C
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x002e
            boolean r0 = r7.A0G
            r4 = 2131826220(0x7f11162c, float:1.9285318E38)
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r4 = -1
        L_0x002f:
            X.1ju r0 = new X.1ju
            r0.<init>((com.instagram.business.ui.BusinessNavBar) r5, (X.C84264sr) r7, (int) r6, (int) r4)
            r7.A0D = r0
            r7.registerLifecycleListener(r0)
            boolean r0 = r7.A0G
            r5 = 0
            if (r0 == 0) goto L_0x0062
            X.24p r0 = X.C311924p.EDIT_PROFILE
            r4 = r5
            r5 = r0
        L_0x0042:
            X.0i6 r0 = r7.A0E
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r0 = X.C37076Jk8.A00(r5, r7, r0, r4)
            r7.A07 = r0
            X.4td r0 = r7.A08
            if (r0 == 0) goto L_0x0059
            X.3yv r0 = X.AnonymousClass0wJ.A0R(r0)
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0059
            r2 = 1
        L_0x0059:
            r7.A0Q = r2
            r0 = -1287437226(0xffffffffb3434456, float:-4.5464127E-8)
            X.C14030oh.A09(r0, r1)
            return r3
        L_0x0062:
            X.4td r0 = r7.A08
            if (r0 == 0) goto L_0x0075
            X.24p r5 = r0.Aiz()
            X.4td r0 = r7.A08
            com.instagram.business.activity.BusinessConversionActivity r0 = (com.instagram.business.activity.BusinessConversionActivity) r0
            X.0Oa r0 = r0.A0B
            java.lang.String r4 = X.C18200wM.A0q(r0)
            goto L_0x0042
        L_0x0075:
            r4 = r5
            goto L_0x0042
        L_0x0077:
            boolean r0 = r7.A0G
            if (r0 != 0) goto L_0x0093
            X.4td r0 = r7.A08
            boolean r0 = X.C67293zJ.A04(r0)
            if (r0 == 0) goto L_0x0093
            X.4td r0 = r7.A08
            boolean r0 = X.C67293zJ.A04(r0)
            if (r0 == 0) goto L_0x0097
            X.4td r0 = r7.A08
            com.instagram.business.controller.datamodel.ConversionStep r0 = r0.CWP()
            if (r0 != 0) goto L_0x0097
        L_0x0093:
            r6 = 2131826219(0x7f11162b, float:1.9285316E38)
            goto L_0x0021
        L_0x0097:
            r6 = 2131831737(0x7f112bb9, float:1.9296508E38)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cM.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(-276529384);
        super.onDestroy();
        unregisterLifecycleListener(this.A0M);
        this.A0M = null;
        C14030oh.A09(1806911444, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1878176318);
        super.onDestroyView();
        this.A0N.Cc8(this);
        this.A05 = null;
        this.A03 = null;
        this.A04 = null;
        this.A00 = null;
        this.A02 = null;
        this.A0P = null;
        this.A0O = null;
        unregisterLifecycleListener(this.A0D);
        this.A0D = null;
        this.A0C = null;
        this.A01 = null;
        C14030oh.A09(887914396, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-1700131283);
        super.onPause();
        C18240wQ.A10(this);
        C18190wL.A0F(this).setSoftInputMode(48);
        C14030oh.A09(895492883, A022);
    }

    public final void onStart() {
        int A022 = C14030oh.A02(2038993487);
        super.onStart();
        this.A0N.CLs((Activity) getContext());
        C18190wL.A0F(this).setSoftInputMode(16);
        C14030oh.A09(1207177986, A022);
    }

    public final void onStop() {
        int A022 = C14030oh.A02(1430312790);
        super.onStop();
        C18240wQ.A10(this);
        this.A0N.onStop();
        C14030oh.A09(-32959539, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String Ak1;
        TextView textView;
        int i;
        String str;
        String str2;
        super.onViewCreated(view, bundle);
        AnonymousClass0wJ.A0L(view, R.id.title).setText(2131824580);
        this.A0L = C18180wK.A0G(view, R.id.subtitle);
        this.A01 = view.findViewById(R.id.scroll_view);
        BusinessNavBar businessNavBar = this.A0C;
        if (businessNavBar != null) {
            businessNavBar.setVisibility(0);
        }
        AnonymousClass0wJ.A0L(view, R.id.page_title_section_label).getPaint().setFakeBoldText(true);
        this.A05 = C18180wK.A0G(view, R.id.page_title_error);
        this.A04 = C18220wO.A0K(view, R.id.title_check_indicator);
        this.A00 = view.findViewById(R.id.title_spinner);
        EditText editText = (EditText) view.findViewById(R.id.page_title_edit);
        this.A03 = editText;
        if (C04660Oo.A00(this.A0E) == null) {
            Ak1 = null;
        } else {
            Ak1 = C04660Oo.A00(this.A0E).Ak1();
        }
        editText.setText(Ak1);
        this.A02 = view.findViewById(R.id.page_title_error_divider);
        C84654td r0 = this.A08;
        if (r0 != null && C67293zJ.A04(r0)) {
            if (this.A0Q || !C63483hZ.A07(this.A0E) || this.A0B == null) {
                this.A0R = C63803iN.A05(AnonymousClass0TJ.A05, this.A0E, 36313991437354765L).booleanValue();
            } else {
                this.A0R = false;
            }
        }
        if (this.A0K) {
            textView = this.A0L;
            i = 2131823291;
        } else if (this.A0J) {
            textView = this.A0L;
            i = 2131823290;
        } else {
            boolean z = this.A0R;
            textView = this.A0L;
            i = 2131824535;
            if (z) {
                i = 2131823289;
            }
        }
        textView.setText(i);
        View A0E2 = C18180wK.A0E(view, R.id.category_selection_container);
        A0E2.setVisibility(0);
        C18180wK.A0G(A0E2, R.id.primary_text).setText(2131832108);
        this.A06 = (TextView) C18180wK.A0E(A0E2, R.id.secondary_text);
        AnonymousClass48S r02 = this.A0B;
        if (r02 == null) {
            str = null;
        } else {
            str = r02.A02;
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView2 = this.A06;
            AnonymousClass48S r03 = this.A0B;
            if (r03 == null) {
                str2 = null;
            } else {
                str2 = r03.A02;
            }
            textView2.setText(str2);
        }
        AnonymousClass0wJ.A16(A0E2, 143, this);
        if (this.A0R && this.A09 != null) {
            view.findViewById(R.id.business_conversion_sync_options_container).setVisibility(0);
            if (C04660Oo.A00(this.A0E) != null) {
                C04660Oo.A00(this.A0E).B4M();
                if (!C04660Oo.A00(this.A0E).A34()) {
                    IgSwitch igSwitch = (IgSwitch) view.findViewById(R.id.import_profile_pic_switch);
                    this.A0P = igSwitch;
                    igSwitch.A07 = new IDxTListenerShape295S0100000_1_I2(this, 4);
                    IgSwitch igSwitch2 = (IgSwitch) view.findViewById(R.id.enable_cross_posting_switch);
                    this.A0O = igSwitch2;
                    igSwitch2.A07 = new IDxTListenerShape295S0100000_1_I2(this, 5);
                }
            }
            C18200wM.A1D(view, R.id.import_profile_pic_row);
            this.A09.A02 = false;
            IgSwitch igSwitch22 = (IgSwitch) view.findViewById(R.id.enable_cross_posting_switch);
            this.A0O = igSwitch22;
            igSwitch22.A07 = new IDxTListenerShape295S0100000_1_I2(this, 5);
        }
        if (this.A07 != null) {
            Map A012 = A01(AnonymousClass0wJ.A0n(this.A03), C18250wR.A0Z(this.A0B));
            if (C67293zJ.A04(this.A08)) {
                A012 = this.A08.AeU(A012);
            }
            this.A07.Bdt(new C37408JrQ("create_page", this.A0F, (String) null, (String) null, (String) null, A012, (Map) null, (Map) null));
        }
    }

    public final void onViewStateRestored(Bundle bundle) {
        int A022 = C14030oh.A02(1051051424);
        super.onViewStateRestored(bundle);
        this.A0C.setPrimaryButtonEnabled(false);
        View findViewById = requireView().findViewById(R.id.page_title_edit_container);
        if (!AnonymousClass0wJ.A0n(this.A03).isEmpty()) {
            A03(this);
        }
        this.A03.addTextChangedListener(this.A0T);
        this.A03.setOnFocusChangeListener(new IDxCListenerShape217S0200000_1_I2(0, this, findViewById));
        C14030oh.A09(1739036711, A022);
    }
}
