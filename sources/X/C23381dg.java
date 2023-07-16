package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.redex.IDxCListenerShape217S0100000_1_I2;
import com.facebook.redex.IDxDListenerShape644S0100000_1_I2;
import com.facebook.redex.IDxTListenerShape416S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.location.surface.data.LocationPageInfo;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1dg  reason: invalid class name and case insensitive filesystem */
public final class C23381dg extends I5x implements C82424pb, C82034oy, CallerContextable {
    public static final String __redex_internal_original_name = "LocationPageInfoPageFragment";
    public AnonymousClass3VI A00;
    public AnonymousClass1U8 A01;
    public LocationPageInfo A02;
    public C28321u4 A03;
    public AnonymousClass47H A04;
    public UserSession A05;
    public String A06;
    public String A07;
    public boolean A08;
    public AnonymousClass1fP A09;
    public String A0A;
    public final Handler A0B = AnonymousClass0wJ.A0F();

    public final void configureActionBar(AnonymousClass4u2 r5) {
        String str;
        TextView textView;
        AnonymousClass47H r2;
        C28321u4 r1;
        QPTooltipAnchor qPTooltipAnchor;
        AnonymousClass38H r0;
        r5.CtT(true);
        if (getActivity() != null) {
            C25764Drc A0K = C18240wQ.A0K();
            A0K.A05(AnonymousClass006.A00);
            AnonymousClass4u2.A01(C18190wL.A0H(this, 490), A0K, r5);
            r5.Cnm(this.A01.A08, AnonymousClass0wJ.A0B(this).getString(2131820787));
            if (C59843Mq.A01(this.A05, this.A06)) {
                C25764Drc A0K2 = C18240wQ.A0K();
                A0K2.A08 = R.layout.location_page_info_page_edit_button;
                A0K2.A04 = 2131826643;
                A0K2.A0C = C18190wL.A0H(this, 491);
                textView = (TextView) r5.A7T(new C25435DlZ(A0K2));
                textView.setText(2131826643);
                A06(this, "edit_location");
                r2 = this.A04;
                r1 = this.A03;
                qPTooltipAnchor = QPTooltipAnchor.A0L;
            } else {
                AnonymousClass1U8 r02 = this.A01;
                if (r02 == null || (r0 = r02.A00) == null || r0.A01 == null) {
                    UserSession userSession = this.A05;
                    C04620Ok r22 = C06810aP.A01;
                    if (C18200wM.A1X(userSession, r22) && (str = this.A06) != null && !str.equals(C18240wQ.A0e(this.A05, r22))) {
                        if (C63803iN.A05(AnonymousClass0TJ.A05, this.A05, 36314021502125844L).booleanValue()) {
                            C25764Drc A0K3 = C18240wQ.A0K();
                            A0K3.A08 = R.layout.location_page_info_page_edit_button;
                            A0K3.A04 = 2131823296;
                            A0K3.A0C = C18190wL.A0H(this, 492);
                            textView = (TextView) r5.A7T(new C25435DlZ(A0K3));
                            textView.setText(2131823296);
                            A06(this, "claim_location");
                            r2 = this.A04;
                            r1 = this.A03;
                            qPTooltipAnchor = QPTooltipAnchor.A09;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            r2.A00(textView, qPTooltipAnchor, r1);
        }
    }

    public final String getModuleName() {
        return "location_page_info_page";
    }

    public static AnonymousClass3VI A01(C23381dg r2) {
        AnonymousClass3VI r1 = r2.A00;
        if (r1 == null) {
            r1 = new AnonymousClass3VI(r2.A05);
            r2.A00 = r1;
        }
        r1.A02 = r2.A0A;
        return r1;
    }

    public static void A03(C23381dg r7) {
        LocationPageInfo locationPageInfo = r7.A02;
        if (locationPageInfo == null) {
            C61873Wd.A02(r7.mFragmentManager);
            Context context = r7.getContext();
            UserSession userSession = r7.A05;
            AnonymousClass06E A002 = AnonymousClass06E.A00(r7);
            IDxACallbackShape111S0100000_1_I2 A062 = C63873iU.A06(r7, 58);
            String A003 = C61853Wb.A00(C67353zP.A00, userSession, "ig_professional_conversion_flow");
            C26241qH r1 = new C26241qH(StringFormatUtil.formatStrLocaleSafe("{\"%s\":\"%s\"}", "0", "ADMINISTER"));
            C31082GfJ gfJ = new C31082GfJ(A003);
            gfJ.A07(r1);
            C32165H8c A032 = gfJ.A03();
            A032.A00 = A062;
            C31155GhB.A01(context, A002, A032);
            return;
        }
        A02(locationPageInfo, r7);
    }

    public static void A04(C23381dg r10) {
        String str;
        String str2;
        A06(r10, "claim_location_success");
        Context context = r10.getContext();
        ImageUrl B4M = AnonymousClass0wJ.A0Y(r10.A05).B4M();
        AnonymousClass1U8 r6 = r10.A01;
        if (r6 == null || (str2 = r6.A05) == null) {
            str = null;
        } else {
            str = AnonymousClass00U.A0h(str2.trim(), " ", r6.A07, " ", r6.A0B).trim();
        }
        IDxCListenerShape217S0100000_1_I2 A0O = C18220wO.A0O(r10, 75);
        String A0l = AnonymousClass0wJ.A0l(context, str, 2131823304);
        int A082 = C18220wO.A08(A0l) - C18220wO.A08(str);
        int A083 = C18220wO.A08(A0l);
        SpannableString spannableString = new SpannableString(C18180wK.A0j("%s\n\n%s", new Object[]{A0l, context.getString(2131823305)}));
        spannableString.setSpan(new StyleSpan(1), A082, A083, 0);
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.grey_9)), A082, A083, 0);
        C25828Dsm A0W = C18190wL.A0W(context);
        A0W.A0q(true);
        A0W.A0r(true);
        A0W.A0l(B4M, r10);
        A0W.A0P(A0O, 2131831976);
        A0W.A0L(2131823306);
        A0W.A0p(spannableString);
        AnonymousClass0wJ.A1K(A0W);
    }

    public final C10300i6 A0I() {
        return this.A05;
    }

    public static void A02(LocationPageInfo locationPageInfo, C23381dg r3) {
        Bundle A062 = C18180wK.A06();
        A062.putParcelable("location_page_info", locationPageInfo);
        C23341db r2 = new C23341db();
        r2.setArguments(A062);
        r2.A00 = A01(r3);
        C25786Drz A0Q = C18180wK.A0Q(r3.getActivity(), r3.A05);
        A0Q.A03 = r2;
        A0Q.A0C(r3, 0);
        A0Q.A05();
    }

    public static void A05(C23381dg r7, Integer num) {
        String str;
        int intValue = num.intValue();
        if (intValue == 0) {
            str = "address";
        } else if (intValue == 4) {
            str = "website";
        } else if (intValue != 5) {
            str = null;
        } else {
            str = "call";
        }
        A01(r7).A01((C15680ri) null, "information_page", "tap_component", str, r7.A07, r7.A06, (String) null, (Map) null);
    }

    public static void A06(C23381dg r2, String str) {
        AnonymousClass3VI A012 = A01(r2);
        A012.A04 = "impression";
        A012.A07 = "information_page";
        A012.A01 = str;
        A012.A05 = r2.A06;
        A012.A06 = r2.A07;
        A012.A00();
    }

    public static void A07(C23381dg r7, String str) {
        A01(r7).A01((C15680ri) null, "information_page", "tap_component", str, r7.A07, r7.A06, (String) null, (Map) null);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            AnonymousClass3VI A012 = A01(this);
            A012.A04 = "finish_step";
            A012.A07 = "edit_location_page";
            A012.A05 = this.A06;
            A012.A06 = this.A07;
            A012.A00();
        } else if (i == 64206 && i2 == -1) {
            C67363zQ.A06(intent, this.A05, new IDxDListenerShape644S0100000_1_I2(this, 3), i2);
        }
    }

    public final boolean onBackPressed() {
        AnonymousClass3VI A012 = A01(this);
        A012.A04 = "cancel";
        A012.A07 = "information_page";
        A012.A06 = this.A07;
        A012.A05 = this.A06;
        A012.A00();
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1657016802);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A05 = C18180wK.A0V(this.mArguments);
        this.A07 = requireArguments.getString("location_id_key");
        this.A06 = requireArguments.getString("fb_page_id_key");
        this.A0A = requireArguments.getString("info_page_logging_entry_point");
        if (requireArguments.containsKey("location_page_info")) {
            LocationPageInformation locationPageInformation = (LocationPageInformation) requireArguments.getParcelable("location_page_info");
            String str = locationPageInformation.A08;
            String str2 = locationPageInformation.A09;
            String str3 = locationPageInformation.A0A;
            String str4 = locationPageInformation.A06;
            String str5 = locationPageInformation.A05;
            String str6 = locationPageInformation.A07;
            Integer num = locationPageInformation.A04;
            String str7 = locationPageInformation.A0B;
            User A002 = locationPageInformation.A00();
            this.A01 = new AnonymousClass1U8(locationPageInformation.A01, A002, num, locationPageInformation.A02, str, str2, str3, str4, str5, str6, str7, locationPageInformation.A0C);
        }
        Context context = getContext();
        AnonymousClass1U8 r6 = this.A01;
        UserSession userSession = this.A05;
        AnonymousClass350 r4 = new AnonymousClass350(this);
        AnonymousClass1U8 r16 = r6;
        AnonymousClass1fP r13 = new AnonymousClass1fP(context, this, r16, new C558934z(this), r4, userSession, this.A06, C59843Mq.A00(CallerContext.A00(C23381dg.class), userSession, this.A06));
        this.A09 = r13;
        A0F(r13);
        AnonymousClass3VI A012 = A01(this);
        A012.A04 = "start_step";
        A012.A07 = "information_page";
        A012.A05 = this.A06;
        A012.A06 = this.A07;
        AnonymousClass1U8 r42 = this.A01;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass38H r1 = r42.A00;
        if (!(r1 == null || r1.A01 == null)) {
            A0v.add("business");
        }
        if (!TextUtils.isEmpty(r42.A05)) {
            A0v.add("address");
        }
        if (!TextUtils.isEmpty(r42.A06)) {
            A0v.add("category");
        }
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse = r42.A01;
        if (!(locationPageInfoPageOperationHourResponse == null || locationPageInfoPageOperationHourResponse.A03 == null)) {
            A0v.add("hours");
        }
        if (r42.A03 != null) {
            A0v.add("price");
        }
        if (!TextUtils.isEmpty(r42.A0A)) {
            A0v.add("website");
        }
        if (!TextUtils.isEmpty(r42.A09)) {
            A0v.add("call");
        }
        A012.A08 = A0v;
        A012.A00();
        C36622Sa.A00();
        UserSession userSession2 = this.A05;
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put(QPTooltipAnchor.A0L, new C70844Gn());
        A0y.put(QPTooltipAnchor.A09, new C70834Gm());
        C04220Ms.A0B(userSession2, 0);
        AnonymousClass47H r12 = new AnonymousClass47H(userSession2, A0y);
        this.A04 = r12;
        registerLifecycleListener(r12);
        C61833Vz A003 = C36622Sa.A00();
        UserSession userSession3 = this.A05;
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0V;
        C36622Sa.A00();
        C28321u4 A052 = A003.A05(this, this, C61403Th.A00((C17701AKf) null, (AnonymousClass38Q) null, (AnonymousClass35B) null, (AnonymousClass35C) null, (C559435e) null, (C82894qR) null, (C82904qS) null, new IDxTListenerShape416S0100000_1_I2(this, 0), (C82914qT) null, this.A04, (C561335x) null, (Boolean) null), quickPromotionSlot, userSession3);
        this.A03 = A052;
        registerLifecycleListener(A052);
        this.A03.A01();
        C14030oh.A09(95494320, A022);
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(832165024);
        unregisterLifecycleListener(this.A04);
        unregisterLifecycleListener(this.A03);
        super.onDestroy();
        C14030oh.A09(-1651159732, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-1643288601);
        super.onPause();
        AnonymousClass3VI A012 = A01(this);
        A012.A04 = "finish_step";
        A012.A07 = "information_page";
        A012.A05 = this.A06;
        A012.A06 = this.A07;
        A012.A00();
        C14030oh.A09(1479322369, A022);
    }

    public final void onResume() {
        AnonymousClass38H r0;
        User user;
        String id;
        int A022 = C14030oh.A02(1951326751);
        super.onResume();
        this.A09.A09();
        if (this.A08) {
            this.A08 = false;
            A04(this);
        }
        AnonymousClass1U8 r02 = this.A01;
        if (!(r02 == null || (r0 = r02.A00) == null || (user = r0.A01) == null || (id = user.getId()) == null)) {
            C15680ri r4 = new C15680ri();
            r4.A0D("profile_id", id);
            C37170Jlr jlr = this.A01.A00.A00;
            if (jlr != null) {
                C36857Jfo jfo = jlr.A01;
                C04220Ms.A0A(jfo);
                List<C37003Jib> list = jfo.A0E;
                if (list != null) {
                    C15560rW r2 = new C15560rW();
                    for (C37003Jib A002 : list) {
                        r2.A04(A002.A00());
                    }
                    r4.A08(r2, "available_media");
                }
            }
            AnonymousClass3VI A012 = A01(this);
            A012.A04 = "impression";
            A012.A07 = "information_page";
            A012.A01 = "related_profile";
            A012.A05 = this.A06;
            A012.A06 = this.A07;
            A012.A00 = r4;
            A012.A00();
        }
        C14030oh.A09(1189106793, A022);
    }
}
