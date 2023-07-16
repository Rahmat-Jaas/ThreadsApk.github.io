package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.telephony.PhoneNumberUtils;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import com.facebook.redex.IDxCListenerShape41S0300000_1_I2;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.facebook.redex.IDxFCollectorShape229S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.fx.access.sso.FxSsoViewModel;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.service.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.ui.primer.ColorTint;
import com.instagram.ui.primer.TitleIcon;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.KtLambdaShape63S0100000_I2_43;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0wM  reason: invalid class name and case insensitive filesystem */
public final class C18200wM {
    public static int A03(TextView textView, CharSequence charSequence, int i) {
        if (charSequence != null) {
            textView.setText(charSequence);
            textView.setVisibility(0);
            if (i != 0) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            }
            return 8;
        }
        textView.setVisibility(8);
        return 8;
    }

    public static int A07(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int A09(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static ComposeView A0L(C34640IcN icN, Object obj, int i) {
        return AnonymousClass6QR.A00(icN, AnonymousClass7JR.A03(obj, i, true));
    }

    public static C32165H8c A0S(C146418mD r2, C10300i6 r3) {
        C04220Ms.A0B(r3, 0);
        C31082GfJ gfJ = new C31082GfJ(r3);
        gfJ.A06(r2);
        gfJ.A08 = "ads_viewer_context_policy";
        return gfJ.A05(AnonymousClass006.A01);
    }

    public static C32165H8c A0U(C10300i6 r3, GA2 ga2) {
        C04220Ms.A0B(r3, 0);
        C31082GfJ gfJ = new C31082GfJ(r3);
        gfJ.A07(ga2);
        Integer num = AnonymousClass006.A00;
        gfJ.A08 = "ads_viewer_context_policy";
        return gfJ.A05(num);
    }

    public static TitleIcon A0Z() {
        return new TitleIcon(new ColorTint(0, R.color.igds_creation_tools_red, R.color.igds_creation_tools_purple), R.drawable.instagram_reels_outline_96);
    }

    public static String A0h(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getString(str, (String) null);
    }

    public static String A0l(CharSequence charSequence, Iterable iterable) {
        return AnonymousClass00J.A0H(charSequence, (CharSequence) null, (CharSequence) null, iterable, (AnonymousClass0YY) null, 62);
    }

    public static void A10(Activity activity, Intent intent) {
        activity.setResult(-1, intent);
        activity.finish();
    }

    public static void A13(Context context, TypedArray typedArray, TextView textView, int i) {
        int resourceId = typedArray.getResourceId(2, i);
        if (resourceId != 0) {
            textView.setImeActionLabel(context.getText(resourceId), textView.getImeActionId());
        }
    }

    public static void A1B(Parcel parcel, DirectMessageInteropReachabilityOptions directMessageInteropReachabilityOptions, int i) {
        if (directMessageInteropReachabilityOptions == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        directMessageInteropReachabilityOptions.writeToParcel(parcel, i);
    }

    public static void A1C(View view) {
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }

    public static void A1H(RecyclerView recyclerView, int i) {
        recyclerView.setLayoutManager(new LinearLayoutManager(i, false));
    }

    public static void A1L(MMo mMo, AbstractCollection abstractCollection) {
        User A01 = C19527Axo.A01(mMo, false);
        if (A01 != null) {
            abstractCollection.add(A01);
        }
    }

    public static void A1O(C25828Dsm dsm) {
        dsm.A0q(true);
        dsm.A0r(true);
    }

    public static void A1S(Object obj, Object obj2) {
        C04220Ms.A0B(obj, 0);
        C04220Ms.A0B(obj2, 1);
    }

    public static boolean A1V(Context context, TypedArray typedArray, View view) {
        int resourceId = typedArray.getResourceId(3, 0);
        if (resourceId != 0) {
            view.setContentDescription(context.getText(resourceId));
        }
        return false;
    }

    public static boolean A1Y(Object obj) {
        C04220Ms.A0B(obj, 0);
        return false;
    }

    public static boolean A1Z(Object obj) {
        C04220Ms.A0B(obj, 2);
        return true;
    }

    public static boolean A1a(Object obj, Object obj2) {
        System.arraycopy(obj, 0, obj2, 0, 27);
        return false;
    }

    public static int A06(UserSession userSession, int i) {
        if (i != 0) {
            return C49222r2.A00(userSession).A00();
        }
        return C63073bQ.A00(userSession).A00;
    }

    public static SpannableStringBuilder A0E(CharSequence charSequence) {
        return new SpannableStringBuilder(charSequence);
    }

    public static TextView A0K(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.widget.TextView");
        return (TextView) requireViewById;
    }

    public static AnonymousClass0TJ A0Q() {
        return AnonymousClass0TJ.A00(new AnonymousClass0TJ());
    }

    public static IDxCListenerShape70S0200000_1_I2 A0R(Object obj, Object obj2, int i) {
        return new IDxCListenerShape70S0200000_1_I2(i, obj, obj2);
    }

    public static C10300i6 A0V(Fragment fragment) {
        return AnonymousClass0RA.A0C.A02(fragment.requireArguments());
    }

    public static C10300i6 A0W(Object obj) {
        return AnonymousClass0RA.A0C.A03(obj);
    }

    public static C37032Jj9 A0Y(C10300i6 r2, boolean z) {
        C37032Jj9 jj9 = new C37032Jj9(r2);
        jj9.A0M = Boolean.valueOf(z);
        return jj9;
    }

    public static NullPointerException A0d() {
        return new NullPointerException("getFragmentFactory");
    }

    public static String A0g() {
        return C09140ev.A02.A04(C10600ic.A00);
    }

    public static String A0i(IgFormField igFormField) {
        return igFormField.A00.getText().toString();
    }

    public static String A0j(C08410dK r0) {
        return (String) r0.A00.invoke();
    }

    public static String A0o(Collection collection) {
        return new JSONArray(collection).toString();
    }

    public static StringBuilder A0r() {
        return new StringBuilder();
    }

    public static ArrayList A0s(Collection collection) {
        return new ArrayList(collection);
    }

    public static HashSet A0u() {
        return new HashSet();
    }

    public static C04530Oa A0x(Integer num, Object obj, int i) {
        return AnonymousClass0OY.A01(num, new KtLambdaShape63S0100000_I2_43(obj, i));
    }

    public static void A1E(View view, Object obj, Object obj2, Object obj3, int i) {
        view.setOnClickListener(new IDxCListenerShape41S0300000_1_I2(i, obj, obj2, obj3));
    }

    public static void A1G(Fragment fragment, C12560m7 r3) {
        AnonymousClass01J r1 = new AnonymousClass01J(r3);
        r1.A0D(fragment, R.id.layout_container_main);
        r1.A0K("reg_gdpr_entrance");
        r1.A00();
    }

    public static void A1I(AnonymousClass0A3 r2, String str) {
        r2.A0T("action", str);
        r2.A0T("ig_appid", "567067343352427");
    }

    public static void A1J(AnonymousClass0A3 r1, Map map) {
        r1.A0V("extra", map);
        r1.Bb4();
    }

    public static void A1R(Object obj) {
        C04220Ms.A0C(obj, "null cannot be cast to non-null type com.instagram.service.session.UserSession");
    }

    public static boolean A1b(String str, int i) {
        if (C04220Ms.A00(str.charAt(i), 32) <= 0) {
            return true;
        }
        return false;
    }

    public static double A00() {
        return (double) System.currentTimeMillis();
    }

    public static int A01(int i, Object obj) {
        int A05 = C14030oh.A05(i);
        C04220Ms.A0B(obj, 0);
        return A05;
    }

    public static int A02(int i, Object obj, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 2);
        return 2;
    }

    public static int A04(IDxCListenerShape202S0100000_1_I2_1 iDxCListenerShape202S0100000_1_I2_1, int i) {
        int A05 = C14030oh.A05(i);
        ((AnonymousClass0ZU) iDxCListenerShape202S0100000_1_I2_1.A00).invoke();
        return A05;
    }

    public static int A05(C19577Ayd ayd) {
        if (ayd.A0A()) {
            ayd.A08().setVisibility(8);
        }
        return 8;
    }

    public static int A08(Object obj, AbstractMap abstractMap, int i, int i2) {
        abstractMap.put(Integer.valueOf(i), obj);
        return i2 + 1;
    }

    public static long A0A() {
        return System.currentTimeMillis() / ((long) 1000);
    }

    public static long A0B(UserSession userSession) {
        return Long.parseLong(userSession.getUserId());
    }

    public static SharedPreferences A0C() {
        return C08360dF.A00().A00;
    }

    public static Drawable A0D(Context context) {
        return C19587Ayn.A01(context, R.drawable.instagram_payments_icons_radio, context.getColor(R.color.igds_primary_button));
    }

    public static View A0F(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        C04220Ms.A06(inflate);
        return inflate;
    }

    public static View A0G(View view, int i) {
        return ((ViewStub) view.requireViewById(i)).inflate();
    }

    public static ViewGroup A0H(C22302CTd cTd) {
        return cTd.getScrollingViewProxy().BLD();
    }

    public static ImageView A0I(View view) {
        View inflate = ((ViewStub) view.findViewById(R.id.radio_button_view_stub)).inflate();
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        return (ImageView) inflate;
    }

    public static ImageView A0J(View view, int i) {
        return (ImageView) view.requireViewById(i);
    }

    public static LifecycleCoroutineScopeImpl A0M(Fragment fragment) {
        return AnonymousClass067.A00(fragment.getViewLifecycleOwner());
    }

    public static C62793ak A0N(C04530Oa r0) {
        return (C62793ak) r0.getValue();
    }

    public static USLEBaseShape0S0000000 A0O(C10300i6 r2) {
        USLEBaseShape0S0000000 A04 = USLEBaseShape0S0000000.A04(C13330nS.A02(r2));
        A04.A0T("flow_name", "ig_feed_share_to_fb");
        return A04;
    }

    public static USLEBaseShape0S0000000 A0P(C10300i6 r0) {
        return USLEBaseShape0S0000000.A0A(C13330nS.A02(r0));
    }

    public static C32165H8c A0T(H1T h1t, String str, String str2) {
        h1t.A0O(str, str2);
        return h1t.A02();
    }

    public static FxSsoViewModel A0X(Fragment fragment) {
        return (FxSsoViewModel) new AnonymousClass7IU(fragment.requireActivity()).A01(FxSsoViewModel.class);
    }

    public static C169839tz A0a(UserSession userSession, C04620Ok r1) {
        return r1.A01(userSession).A0e();
    }

    public static AnonymousClass266 A0b(UserSession userSession, C04620Ok r1) {
        return r1.A01(userSession).A0g();
    }

    public static Long A0c() {
        return Long.valueOf(System.currentTimeMillis());
    }

    public static Object A0f(Map map, int i) {
        return map.get(Integer.valueOf(i));
    }

    public static String A0k(UserSession userSession, C04620Ok r1) {
        return r1.A01(userSession).BK7();
    }

    public static String A0m(Object obj, StringBuilder sb) {
        sb.append(obj);
        return sb.toString();
    }

    public static String A0n(String str) {
        String country = C31103Gfm.A02().getCountry();
        if (country != null) {
            return PhoneNumberUtils.formatNumber(str, country);
        }
        return PhoneNumberUtils.formatNumber(str);
    }

    public static String A0p(Map.Entry entry) {
        return (String) entry.getKey();
    }

    public static String A0q(C04530Oa r0) {
        return (String) r0.getValue();
    }

    public static ArrayList A0t(List list) {
        return new ArrayList(list.size());
    }

    public static Iterator A0v(Parcel parcel, List list) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static Set A0w(Object[] objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public static C83234r0 A0y(IDxFCollectorShape229S0100000_1_I2 iDxFCollectorShape229S0100000_1_I2, Object obj) {
        AnonymousClass0OU.A00(obj);
        return (C83234r0) iDxFCollectorShape229S0100000_1_I2.A00;
    }

    public static void A0z(Activity activity) {
        if (activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
            activity.getWindow().getDecorView().setBackgroundColor(activity.getApplicationContext().getColor(R.color.igds_creation_menu_background));
        }
    }

    public static void A11(Activity activity, Intent intent, String str) {
        int[] intArrayExtra = intent.getIntArrayExtra(str);
        if (intArrayExtra != null && intArrayExtra.length == 4) {
            activity.overridePendingTransition(intArrayExtra[2], intArrayExtra[3]);
        }
    }

    public static void A12(Activity activity, GVD gvd) {
        C25745DrH A01 = gvd.A01(activity);
        if (A01 != null) {
            A01.A0C();
        }
    }

    public static void A14(Context context, TextView textView, float f, float f2) {
        textView.setLetterSpacing(f2 / (f / context.getResources().getDisplayMetrics().scaledDensity));
    }

    public static void A15(Context context, TextView textView, int i) {
        textView.setText(context.getString(i));
    }

    public static void A16(Context context, Fragment fragment, C37032Jj9 jj9) {
        C37383Jqm.A00(context, fragment, jj9.A00());
    }

    public static void A17(Resources resources, TextView textView, int i) {
        textView.setText(resources.getString(i));
    }

    public static void A18(Resources resources, TextView textView, int i) {
        textView.setText(Html.fromHtml(resources.getString(i)));
    }

    public static void A19(Resources resources, TextView textView, String str, int i) {
        textView.setText(C16370sw.A01(resources, new String[]{str}, i));
    }

    public static void A1A(Uri uri, String str, JSONObject jSONObject) {
        if (uri.getQueryParameter(str) != null && !uri.getQueryParameter(str).isEmpty()) {
            jSONObject.put(str, uri.getQueryParameter(str));
        }
    }

    public static void A1D(View view, int i) {
        view.requireViewById(i).setVisibility(8);
    }

    public static void A1F(Fragment fragment) {
        FragmentActivity requireActivity = fragment.requireActivity();
        C04220Ms.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        ((BaseFragmentActivity) requireActivity).A0B();
    }

    public static void A1K(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, double d) {
        uSLEBaseShape0S0000000.A0R(TraceFieldType.StartTime, Double.valueOf(d));
    }

    public static void A1M(H1T h1t, Integer num, String str) {
        h1t.A0O("timezone_offset", String.valueOf(C19591Ayr.A00().longValue()));
        h1t.A0E(num);
        h1t.A0I(str);
    }

    public static void A1N(H1T h1t, String str) {
        h1t.A0J(str);
        h1t.A0B(C85814vo.class, AnonymousClass3Za.class);
    }

    public static void A1P(C25828Dsm dsm) {
        dsm.A0O((DialogInterface.OnClickListener) null, 2131823054);
    }

    public static void A1Q(C25553Dnn dnn) {
        dnn.A00().A05();
    }

    public static void A1T(Object obj, AbstractMap abstractMap) {
        abstractMap.put("params", obj.toString());
    }

    public static void A1U(AbstractCollection abstractCollection, int i) {
        abstractCollection.add(Integer.valueOf(i));
    }

    public static boolean A1W(Context context, C25828Dsm dsm, User user, Object obj, int i) {
        dsm.A0p(context.getString(i, new Object[]{obj, user.BK7()}));
        return true;
    }

    public static boolean A1X(UserSession userSession, C04620Ok r1) {
        return r1.A01(userSession).Apo();
    }

    public static Object A0e() {
        Object A01 = C08960ea.A00(18301199246101137L).A01();
        C04220Ms.A06(A01);
        return A01;
    }
}
