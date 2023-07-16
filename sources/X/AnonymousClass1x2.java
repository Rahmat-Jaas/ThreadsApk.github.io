package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.redex.IDxCListenerShape15S0400000_1_I2;
import com.facebook.redex.IDxCListenerShape332S0100000_1_I2;
import com.facebook.redex.IDxEListenerShape223S0100000_1_I2;
import com.facebook.redex.IDxIListenerShape658S0100000_1_I2;
import com.facebook.redex.IDxTListenerShape416S0100000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2;
import com.instagram.migration.scrollingviewproxy.IDxSListenerShape170S0100000_1_I2;
import com.instagram.modal.ModalActivity;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;
import com.instagram.settings.common.PaymentOptionsFragment;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1x2  reason: invalid class name */
public final class AnonymousClass1x2 extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "UserOptionsFragment";
    public long A00;
    public ImmutableList A01;
    public C161629e7 A02;
    public C28321u4 A03;
    public AnonymousClass47H A04;
    public AnonymousClass392 A05;
    public C58753Hb A06;
    public AnonymousClass3CZ A07;
    public C57593Br A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public AnonymousClass3EF A0D;
    public C82394pY A0E;
    public C82394pY A0F;
    public C24621ji A0G;
    public final List A0H = AnonymousClass0wJ.A0v();
    public final AtomicBoolean A0I = C18230wP.A0w();
    public final C04530Oa A0J = C62373Zc.A02(this, 44);
    public final C04530Oa A0K = C62373Zc.A02(this, 45);
    public final C04530Oa A0L = C80644m9.A00(this);
    public final IDxACallbackShape111S0100000_1_I2 A0M = C63873iU.A06(this, 156);
    public final C83874s8 A0N = new AnonymousClass4MV(this);
    public final C83114qo A0O = new AnonymousClass4MZ(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131835530);
    }

    public final String getModuleName() {
        return "settings_category_options";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        SearchEditText searchEditText;
        String trim;
        C04220Ms.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        C57593Br r0 = this.A08;
        if (r0 != null && (searchEditText = r0.A00) != null && (trim = AnonymousClass0wJ.A0n(searchEditText).trim()) != null) {
            bundle.putString("query", trim);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C04530Oa r2 = this.A0J;
        ((TextView) r2.getValue()).setHint(getString(2131835293));
        ((SearchEditText) r2.getValue()).A08 = new AnonymousClass4MQ(this);
        C57593Br r1 = new C57593Br();
        r1.A00 = (SearchEditText) r2.getValue();
        r1.A01 = this.A0N;
        r1.A02 = this.A0O;
        this.A08 = r1;
        if (bundle != null) {
            this.A09 = bundle.getString("query", "");
        }
        ViewGroup A0H2 = C18200wM.A0H(this);
        C04220Ms.A06(A0H2);
        getScrollingViewProxy().A7b(new IDxSListenerShape170S0100000_1_I2(this, 2));
        C18200wM.A0H(this).addOnLayoutChangeListener(new IDxCListenerShape332S0100000_1_I2(this, 2));
        A0H2.setPadding(A0H2.getPaddingLeft(), A0H2.getPaddingTop(), A0H2.getPaddingRight(), 0);
        C28321u4 r0 = this.A03;
        if (r0 == null) {
            C04220Ms.A0E("quickPromotionDelegate");
            throw null;
        } else {
            r0.A01();
        }
    }

    public static final void A0B(C24 c24, AnonymousClass1x2 r9) {
        int Aip;
        int ArL;
        if (c24 != null && (Aip = c24.Aip()) <= (ArL = c24.ArL())) {
            int i = Aip;
            while (true) {
                try {
                    C27900EvB APJ = c24.APJ();
                    Object obj = null;
                    if (APJ != null) {
                        obj = APJ.getItem(i);
                    }
                    if (obj instanceof C29291xi) {
                        View AXO = c24.AXO(i);
                        AnonymousClass47H r2 = r9.A04;
                        if (r2 == null) {
                            C04220Ms.A0E("quickPromotionTooltipsController");
                            break;
                        }
                        C28321u4 r1 = r9.A03;
                        if (r1 == null) {
                            C04220Ms.A0E("quickPromotionDelegate");
                            break;
                        }
                        r2.A00(AXO, ((C29291xi) obj).A00, r1);
                    }
                    if (i != ArL) {
                        i++;
                    } else {
                        return;
                    }
                } catch (IndexOutOfBoundsException unused) {
                    C10450iM.A03(__redex_internal_original_name, AnonymousClass00U.A0b("tryToShowTooltip Array Index out of bound. first index: ", "; last index: ", "; current index: ", Aip, ArL, i));
                    return;
                }
            }
            throw null;
        }
    }

    public static final void A0C(AnonymousClass1x2 r19) {
        AnonymousClass1x2 r1 = r19;
        List list = r1.A0H;
        list.clear();
        C58753Hb r2 = r1.A06;
        if (r2 == null) {
            C04220Ms.A0E("userOptionsController");
            throw null;
        }
        r2.A01(list, false, true);
        AnonymousClass392 r8 = r1.A05;
        if (r8 == null) {
            C04220Ms.A0E("accountsCenterOptionsController");
            throw null;
        }
        ImmutableList immutableList = r1.A01;
        if (immutableList != null) {
            C1366783w it = immutableList.iterator();
            while (it.hasNext()) {
                C85454vD r4 = (C85454vD) it.next();
                if (!C121687Hl.A03(r4.getName())) {
                    list.add(AnonymousClass4MA.A01(C18200wM.A0R(r4, r8, 176), r4.getName()));
                }
            }
        }
        C04530Oa r10 = r1.A0L;
        new C61713Va(r1, r1, AnonymousClass0wJ.A0X(r10), false).A01(list);
        AnonymousClass394 r7 = new AnonymousClass394(r1.requireActivity(), AnonymousClass0wJ.A0X(r10));
        AnonymousClass4MA.A04(r7, list, 177, 2131827939);
        UserSession userSession = r7.A01;
        AnonymousClass0TJ r42 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r42, userSession, 36313823933630153L)) {
            AnonymousClass4MA.A04(r7, list, 178, 2131826745);
        }
        if (C28161tl.A04(userSession).getBoolean("seen_facebook_story", false)) {
            AnonymousClass4MA.A04(r7, list, 179, 2131827001);
        }
        AnonymousClass4MA.A04(r7, list, 180, 2131830433);
        C10300i6 A0U = AnonymousClass0wJ.A0U(r10);
        C04220Ms.A0B(A0U, 0);
        if (C63803iN.A0E(r42, A0U, 36316774576164162L)) {
            new AnonymousClass3FX(r1, AnonymousClass0wJ.A0X(r10)).A00(list);
        }
        C04620Ok r82 = C06810aP.A01;
        if (C18200wM.A1X(AnonymousClass0wJ.A0X(r10), r82)) {
            new C67193z5(r1, AnonymousClass0wJ.A0X(r10), (C29201xU) null, (C29201xU) null, "settings_category_options").A01(r1, "settings_search", list, (List) null);
            new C61783Vj(r1, AnonymousClass0wJ.A0X(r10)).A02(AnonymousClass006.A0C, list);
        }
        Integer num = ((AnonymousClass3YL) C18180wK.A0c(AnonymousClass0wJ.A0X(r10), AnonymousClass3YL.class, 30)).A0B;
        if (!(num == null || num == AnonymousClass006.A00)) {
            C61443Tl r13 = PaymentOptionsFragment.A04;
            FragmentActivity requireActivity = r1.requireActivity();
            C04220Ms.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
            Integer num2 = num;
            r13.A01((BaseFragmentActivity) requireActivity, AnonymousClass0wJ.A0X(r10), num2, (String) null, "settings_search", list);
        }
        new C62693aX(r1, AnonymousClass0wJ.A0X(r10), (String) null, false, false).A03((String) null, list, false, false, r1.A0A);
        if (!C63803iN.A0E(r42, AnonymousClass0wJ.A0U(r10), 36316409504205922L)) {
            new AnonymousClass3HD(AnonymousClass0wJ.A0X(r10), r1).A01((C85604vT) null, (String) null, list, false, false);
        }
        new AnonymousClass3YG(r1.requireArguments(), (C27930Evg) null, r1, r1, AnonymousClass0wJ.A0X(r10)).A02(AnonymousClass006.A0C, "settings_search", list);
        new C61573Ug(AnonymousClass0wJ.A0X(r10), r1).A01(list);
        AnonymousClass3TE r5 = new AnonymousClass3TE(AnonymousClass0wJ.A0X(r10), r1);
        if (r5.A01) {
            AnonymousClass4MA.A04(r5, list, 90, 2131821355);
        }
        Boolean BR9 = C18240wQ.A0W(r5.A04, r82).BR9();
        if (BR9 != null && BR9.booleanValue()) {
            AnonymousClass4MA.A04(r5, list, 91, 2131834035);
        }
        list.add(AnonymousClass4MA.A01(C18210wN.A0H(r5, 92), r5.A02.getResources().getString(2131832774)));
        int i = 2131836648;
        if (C62503a9.A02()) {
            i = 2131827959;
        }
        AnonymousClass4MA.A04(r5, list, 93, i);
        AnonymousClass4MA.A04(r5, list, 94, 2131832026);
        if (r5.A00) {
            AnonymousClass4MA.A04(r5, list, 95, 2131834547);
        }
        if (C19573AyZ.A02(AnonymousClass0wJ.A0X(r10)) || C63803iN.A0E(r42, AnonymousClass0wJ.A0U(r10), 36313957077616387L)) {
            UserSession A0X = AnonymousClass0wJ.A0X(r10);
            C57533Bk r72 = new C57533Bk(r1.requireContext(), r1.getParentFragmentManager(), r1.requireActivity(), A0X);
            if (C19573AyZ.A02(AnonymousClass0wJ.A0X(r10))) {
                AnonymousClass4MA.A04(r72, list, 170, 2131836657);
            }
            if (C63803iN.A0E(r42, AnonymousClass0wJ.A0U(r10), 36313957077616387L)) {
                AnonymousClass4MA.A04(r72, list, 171, 2131837574);
            }
        }
        AnonymousClass393 r52 = new AnonymousClass393(r1.requireActivity(), AnonymousClass0wJ.A0X(r10));
        AnonymousClass4MA A002 = AnonymousClass4MA.A00(C18210wN.A0H(r52, 124), 2131836818);
        FragmentActivity fragmentActivity = r52.A00;
        A002.A06 = C18210wN.A0h(fragmentActivity.getString(2131836819));
        list.add(A002);
        AnonymousClass4MA A003 = AnonymousClass4MA.A00(C18210wN.A0H(r52, 125), 2131829681);
        A003.A06 = C18210wN.A0h(fragmentActivity.getString(2131829682));
        list.add(A003);
        AnonymousClass4MA.A04(r52, list, 126, 2131834076);
        AnonymousClass4MA.A04(r52, list, StringTreeSet.MAX_SYMBOL_COUNT, 2131820842);
        AnonymousClass4MA.A04(r52, list, 128, 2131826236);
        AnonymousClass4MA.A04(r52, list, 129, 2131830239);
        AnonymousClass4MA.A04(r52, list, 130, 2131830256);
        AnonymousClass4MA.A04(r52, list, 131, 2131830261);
        AnonymousClass4MA.A04(r52, list, 132, 2131830266);
        AnonymousClass4MA.A04(r52, list, 121, 2131830271);
        AnonymousClass4MA.A04(r52, list, 122, 2131830264);
        AnonymousClass4MA.A04(r52, list, 123, 2131821488);
        if (C63803iN.A0E(r42, AnonymousClass0wJ.A0U(r10), 36320360873858993L)) {
            Object value = r10.getValue();
            FragmentActivity requireActivity2 = r1.requireActivity();
            Context requireContext = r1.requireContext();
            C04220Ms.A0B(value, 1);
            Bundle A062 = C18180wK.A06();
            A062.putString("entrypoint", "search");
            list.add(AnonymousClass4MA.A00(new IDxCListenerShape15S0400000_1_I2(22, requireActivity2, value, A062, requireContext), 2131833972));
        }
        C58753Hb r22 = r1.A06;
        if (r22 == null) {
            C04220Ms.A0E("userOptionsController");
            throw null;
        } else {
            r22.A00(r82.A01(AnonymousClass0wJ.A0X(r10)), list);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0L);
    }

    public static final void A0D(AnonymousClass1x2 r2) {
        r2.requireActivity().runOnUiThread(new AnonymousClass4QB(r2));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ModalActivity modalActivity;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            if (i != 12) {
                if (i == 11) {
                    C62423Zt.A02(AnonymousClass0wJ.A0U(this.A0L));
                    FragmentActivity activity = getActivity();
                    if ((activity instanceof ModalActivity) && (modalActivity = (ModalActivity) activity) != null) {
                        modalActivity.finish();
                        return;
                    }
                } else {
                    return;
                }
            }
            C18190wL.A19(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-282584654);
        super.onCreate(bundle);
        C04530Oa r5 = this.A0L;
        C10300i6 A0U = AnonymousClass0wJ.A0U(r5);
        C04220Ms.A0B(A0U, 0);
        synchronized (C18250wR.A0C(A0U)) {
        }
        C62423Zt.A02(AnonymousClass0wJ.A0U(r5));
        C62423Zt.A01((C11630kW) null, AnonymousClass0wJ.A0X(r5), "settings", "settings_entered", (String) null);
        C04530Oa r6 = this.A0K;
        this.A00 = ((UserFlowLogger) r6.getValue()).generateNewFlowId(762584123);
        ((UserFlowLogger) r6.getValue()).flowStart(this.A00, new UserFlowConfig("user_options", false));
        UserSession A0X = AnonymousClass0wJ.A0X(r5);
        C12560m7 parentFragmentManager = getParentFragmentManager();
        AnonymousClass06E A002 = AnonymousClass06E.A00(this);
        FragmentActivity requireActivity = requireActivity();
        C04220Ms.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.IgFragmentActivity");
        this.A06 = new C58753Hb(requireContext(), parentFragmentManager, A002, (IgFragmentActivity) requireActivity, this, A0X, this);
        this.A05 = new AnonymousClass392(AnonymousClass0wJ.A0X(r5), this);
        IDxEListenerShape223S0100000_1_I2 A0P = C18220wO.A0P(this, 72);
        this.A0E = A0P;
        C38040KHr.A01.A03(A0P, AnonymousClass45E.class);
        AnonymousClass49X.A02(AnonymousClass0wJ.A0U(r5));
        C36622Sa.A00();
        UserSession A0X2 = AnonymousClass0wJ.A0X(r5);
        QPTooltipAnchor qPTooltipAnchor = QPTooltipAnchor.A0s;
        C36622Sa.A00();
        Map A0I2 = AnonymousClass4WJ.A0I(C18180wK.A0p(qPTooltipAnchor, new C70854Go()));
        C04220Ms.A0B(A0X2, 0);
        AnonymousClass47H r0 = new AnonymousClass47H(A0X2, A0I2);
        this.A04 = r0;
        registerLifecycleListener(r0);
        C61833Vz A003 = C36622Sa.A00();
        UserSession A0X3 = AnonymousClass0wJ.A0X(r5);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A02;
        C36622Sa.A00();
        IDxTListenerShape416S0100000_1_I2 iDxTListenerShape416S0100000_1_I2 = new IDxTListenerShape416S0100000_1_I2(this, 3);
        AnonymousClass47H r1 = this.A04;
        if (r1 == null) {
            C04220Ms.A0E("quickPromotionTooltipsController");
            throw null;
        }
        C28321u4 A042 = A003.A04(this, this, C61403Th.A00((C17701AKf) null, (AnonymousClass38Q) null, (AnonymousClass35B) null, (AnonymousClass35C) null, (C559435e) null, new IDxIListenerShape658S0100000_1_I2(this, 2), (C82904qS) null, iDxTListenerShape416S0100000_1_I2, (C82914qT) null, r1, (C561335x) null, (Boolean) null), quickPromotionSlot, A0X3);
        this.A03 = A042;
        registerLifecycleListener(A042);
        C24621ji r02 = new C24621ji(requireActivity(), AnonymousClass0wJ.A0X(r5));
        this.A0G = r02;
        registerLifecycleListener(r02);
        this.A0F = C18220wO.A0P(this, 73);
        C38039KHq A004 = AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(r5));
        Class<C687645j> cls = C687645j.class;
        C82394pY r03 = this.A0F;
        if (r03 == null) {
            C04220Ms.A0E("interopUpgradeEventIgEventListener");
            throw null;
        }
        A004.A01(r03, cls);
        FragmentActivity requireActivity2 = requireActivity();
        C04220Ms.A0C(requireActivity2, I17.A00(3));
        this.A02 = new C161629e7((C82044oz) requireActivity2, 0);
        this.A0D = new AnonymousClass3EF(AnonymousClass0wJ.A0X(r5));
        if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass0wJ.A0U(r5), 36321546285947803L)) {
            C35662Oi.A00(AnonymousClass0wJ.A0X(r5)).A03(requireContext(), AnonymousClass0wJ.A0X(r5), "IG_FB_RIGHT_BEFORE_LOGOUT_SSO_UPSELL", true);
        }
        C14030oh.A09(453545852, A022);
    }

    public final void onDestroy() {
        String str;
        int A022 = C14030oh.A02(-429806918);
        super.onDestroy();
        C04530Oa r4 = this.A0L;
        C10300i6 A0U = AnonymousClass0wJ.A0U(r4);
        C04220Ms.A0B(A0U, 0);
        synchronized (C18250wR.A0C(A0U)) {
        }
        C38040KHr kHr = C38040KHr.A01;
        Class<AnonymousClass45E> cls = AnonymousClass45E.class;
        C82394pY r0 = this.A0E;
        if (r0 == null) {
            str = "accountFamilyFetchedEventListener";
        } else {
            kHr.A04(r0, cls);
            C38039KHq A002 = AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(r4));
            Class<C687645j> cls2 = C687645j.class;
            C82394pY r02 = this.A0F;
            if (r02 == null) {
                str = "interopUpgradeEventIgEventListener";
            } else {
                A002.A02(r02, cls2);
                AnonymousClass47H r03 = this.A04;
                if (r03 == null) {
                    str = "quickPromotionTooltipsController";
                } else {
                    unregisterLifecycleListener(r03);
                    C28321u4 r04 = this.A03;
                    if (r04 == null) {
                        str = "quickPromotionDelegate";
                    } else {
                        unregisterLifecycleListener(r04);
                        C24621ji r05 = this.A0G;
                        if (r05 == null) {
                            str = "directInteropFragmentLifecycleListener";
                        } else {
                            unregisterLifecycleListener(r05);
                            C14030oh.A09(1554904268, A022);
                            return;
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(61180531);
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C09860go.A0E(activity);
        }
        C14030oh.A09(780987261, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1566211471);
        E2V A0M2 = C18190wL.A0M(this);
        A0M2.A0S(this);
        E2V.A0G(A0M2);
        super.onResume();
        A0D(this);
        if (this.A09 != null) {
            ((TextView) this.A0J.getValue()).setText(this.A09);
        }
        C04530Oa r4 = this.A0L;
        if (C67373zR.A0E(AnonymousClass0wJ.A0X(r4))) {
            if (C63803iN.A0F(AnonymousClass0wJ.A0U(r4))) {
                C49222r2.A00(AnonymousClass0wJ.A0X(r4)).A04((C83804s1) null, "user_options", (String) null);
            } else {
                schedule(C67303zK.A01(AnonymousClass0wJ.A0X(r4), (AnonymousClass3D3) null, AnonymousClass006.A0B));
            }
        }
        if (!this.A0B) {
            C63873iU.A0C(this, C63503hc.A06(AnonymousClass0wJ.A0X(r4)), 155);
        }
        H1T h1t = new H1T(AnonymousClass0wJ.A0U(r4));
        Integer num = AnonymousClass006.A0N;
        h1t.A0F(num);
        h1t.A0J("commerce/creator_settings/visibility/");
        C63873iU.A0C(this, AnonymousClass0wJ.A0T(h1t, C21801Sf.class, AnonymousClass3OZ.class), 154);
        H1T h1t2 = new H1T(AnonymousClass0wJ.A0U(r4));
        h1t2.A0F(num);
        h1t2.A0J("accounts/should_show_notable_verification_row/");
        C63873iU.A0C(this, AnonymousClass0wJ.A0T(h1t2, C21911Sq.class, AnonymousClass3PO.class), 153);
        Integer A0n = C06810aP.A01.A01(AnonymousClass0wJ.A0X(r4)).A0n();
        if (A0n != null && A0n.intValue() > 10000) {
            C10300i6 A0U = AnonymousClass0wJ.A0U(r4);
            C04220Ms.A0B(A0U, 0);
            H1T A0P = C18180wK.A0P(A0U);
            A0P.A0F(num);
            A0P.A0J("interest_nux/author_interests/");
            C63873iU.A0C(this, AnonymousClass0wJ.A0T(A0P, C21311Qf.class, AnonymousClass3JW.class), 152);
        }
        C67473zc A002 = C67473zc.A00(C67463zb.A00(), AnonymousClass15X.class, "FxSettingsSearchQuery");
        C10300i6 A0U2 = AnonymousClass0wJ.A0U(r4);
        C04220Ms.A0B(A0U2, 0);
        C31082GfJ gfJ = new C31082GfJ(A0U2);
        gfJ.A06(A002);
        Integer num2 = AnonymousClass006.A01;
        C63873iU.A0C(this, gfJ.A05(num2), 150);
        C67473zc A003 = C67473zc.A00(C67463zb.A00(), AnonymousClass15P.class, "FxSettingsAccountsCenterTransitionQuery");
        C10300i6 A0U3 = AnonymousClass0wJ.A0U(r4);
        C04220Ms.A0B(A0U3, 0);
        C31082GfJ gfJ2 = new C31082GfJ(A0U3);
        gfJ2.A06(A003);
        C63873iU.A0C(this, gfJ2.A05(num2), 151);
        AnonymousClass3EF r1 = this.A0D;
        if (r1 == null) {
            C04220Ms.A0E("avatarPrivacySettingRepository");
            throw null;
        }
        r1.A00(this.A0M);
        C14030oh.A09(-25643089, A022);
    }
}
