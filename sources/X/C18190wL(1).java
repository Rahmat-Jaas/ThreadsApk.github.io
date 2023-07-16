package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.forker.Process;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.facebook.redex.IDxLDelegateShape338S0100000_1_I2;
import com.facebook.redex.IDxObserverShape210S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.model.UserBirthDate;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5;
import kotlin.coroutines.jvm.internal.KtCImplShape9S0201000_I2_7;
import kotlin.jvm.internal.KtLambdaShape39S0100000_I2_19;
import kotlin.jvm.internal.KtLambdaShape90S0100000_I2_70;

/* renamed from: X.0wL  reason: invalid class name and case insensitive filesystem */
public final class C18190wL {
    public static int A04(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getInt(str, 0);
    }

    public static InfoItem A0Y(Integer num, String str, int i) {
        return new InfoItem(new IconConfig.SimpleIconConfig(i), num, str, (String) null);
    }

    public static void A14(Parcel parcel, Boolean bool) {
        if (bool == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void A15(Parcel parcel, Enum enumR) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeString(enumR.name());
    }

    public static void A17(View view) {
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public static void A1G(AnonymousClass0A3 r2, long j, long j2) {
        r2.A0R("elapsed_time", Double.valueOf((double) (j - j2)));
    }

    public static void A1W(Calendar calendar) {
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
    }

    public static boolean A1X(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getBoolean(str, false);
    }

    public static int A00(int i) {
        return i != 0 ? 0 : 8;
    }

    public static int A01(long j) {
        return (int) ((j >>> 48) & 63);
    }

    public static int A02(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int A06(C07950cU r3, C07950cU r4) {
        String str = r3.mUniverseName;
        String str2 = r4.mUniverseName;
        if (!str.equalsIgnoreCase(str2)) {
            return str.compareTo(str2);
        }
        String str3 = r3.mName;
        if ("is_enabled".equals(str3)) {
            return -1;
        }
        String str4 = r4.mName;
        if ("is_enabled".equals(str4)) {
            return 1;
        }
        return str3.compareTo(str4);
    }

    public static long A08(Object obj) {
        return ((Number) obj).longValue();
    }

    public static SpannableStringBuilder A0D(CharSequence charSequence, CharSequence charSequence2) {
        return new SpannableStringBuilder(charSequence).append(" ").append(charSequence2);
    }

    public static C108776iv A0G(Class cls, String str, boolean z) {
        return new C108776iv(cls, str, z);
    }

    public static IDxCListenerShape201S0100000_1_I2 A0H(Object obj, int i) {
        return new IDxCListenerShape201S0100000_1_I2(obj, i);
    }

    public static C16240si A0I() {
        C16240si r0 = new C36890Jge("IgSecureUriParser").A01;
        C04220Ms.A06(r0);
        return r0;
    }

    public static C15710rl A0J() {
        C15740ro r2 = new C15740ro();
        r2.A01();
        r2.A02(C15470rN.A0f, "com.instagram.android");
        return r2.A00();
    }

    public static C25764Drc A0K() {
        C25764Drc drc = new C25764Drc();
        drc.A00 = R.drawable.instagram_x_pano_outline_24;
        return drc;
    }

    public static C25435DlZ A0L(C25764Drc drc, Object obj, int i) {
        drc.A0C = new IDxCListenerShape202S0100000_1_I2_1(obj, i);
        return new C25435DlZ(drc);
    }

    public static IgBloksScreenConfig A0N(C10300i6 r1) {
        return new IgBloksScreenConfig(r1);
    }

    public static BusinessFlowAnalyticsLogger A0O(C311924p r1, C11630kW r2, C10300i6 r3, Object obj) {
        return C37076Jk8.A00(r1, r2, r3, (String) ((BusinessConversionActivity) obj).A0B.getValue());
    }

    public static C10300i6 A0S(Bundle bundle) {
        return AnonymousClass0RA.A0C.A02(bundle);
    }

    public static C25828Dsm A0W(Context context) {
        return new C25828Dsm(context);
    }

    public static C09120et A0X() {
        return C09120et.A3D.A00();
    }

    public static IllegalArgumentException A0a(String str) {
        return new IllegalArgumentException(str);
    }

    public static Integer A0c(Object obj) {
        ((Number) obj).intValue();
        return 1;
    }

    public static Object A0d(Object obj, KtCImplShape9S0201000_I2_7 ktCImplShape9S0201000_I2_7) {
        ktCImplShape9S0201000_I2_7.A02 = obj;
        ktCImplShape9S0201000_I2_7.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape9S0201000_I2_7.A01;
    }

    public static Object A0e(Object obj, KtCImplShape9S0201000_I2_7 ktCImplShape9S0201000_I2_7) {
        ktCImplShape9S0201000_I2_7.A01 = obj;
        ktCImplShape9S0201000_I2_7.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape9S0201000_I2_7.A02;
    }

    public static String A0i(BaseBundle baseBundle) {
        return baseBundle.getString("original_url");
    }

    public static String A0o(StringBuilder sb) {
        sb.append('}');
        return sb.toString();
    }

    public static StringBuilder A0s(String str) {
        return new StringBuilder(str);
    }

    public static LinkedHashMap A0v(int i) {
        return new LinkedHashMap(i);
    }

    public static C04530Oa A0w(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape39S0100000_I2_19(obj, i));
    }

    public static C04530Oa A0x(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape90S0100000_I2_70(obj, i));
    }

    public static KtCImplShape7S0201000_I2_5 A0y(Object obj, C146958n9 r3, int i) {
        return new KtCImplShape7S0201000_I2_5(obj, r3, i, 42);
    }

    public static C27457Enn A0z(Object obj) {
        return new C27457Enn(obj);
    }

    public static void A10() {
        C111986om.A01.A00();
    }

    public static void A13(BaseBundle baseBundle, String str) {
        baseBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
    }

    public static void A16(Parcel parcel, String str, int i, int i2) {
        if (str == null) {
            parcel.writeInt(i);
            return;
        }
        parcel.writeInt(i2);
        parcel.writeString(str);
    }

    public static void A1C(AnonymousClass066 r1, M5J m5j, Object obj, int i) {
        m5j.A0C(r1, new IDxObserverShape210S0100000_1_I2(obj, i));
    }

    public static void A1D(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new LinearLayoutManager());
    }

    public static void A1E(RecyclerView recyclerView, AnonymousClass9NU r5, int i) {
        recyclerView.A11(new C150728wn(r5.getRecyclerView().A0H, new IDxLDelegateShape338S0100000_1_I2(r5, i), C19064Aq3.A0C));
    }

    public static void A1F(C021109v r1, AnonymousClass0A3 r2, C25831Dsp dsp) {
        r2.A0O(r1, "blacklist_type");
        r2.A0O(C25831Dsp.A02(dsp.A02), "camera_position");
        r2.A0O(C25831Dsp.A01(dsp), "capture_type");
        r2.A0O(dsp.A06, "entry_point");
        r2.A0O(AnonymousClass6BO.ACTION, "event_type");
    }

    public static void A1H(AnonymousClass0A3 r2, C10300i6 r3, String str) {
        r2.A0T("event_name", str);
        r2.A0T("ig_account_type", C04660Oo.A02(r3));
    }

    public static void A1I(AnonymousClass0A3 r1, String str) {
        r1.A0T(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
    }

    public static void A1J(AnonymousClass0A3 r2, String str, long j) {
        r2.A0T("container_module", str);
        r2.A0S("creator_igid", Long.valueOf(j));
    }

    public static void A1K(USLEBaseShape0S0000000 uSLEBaseShape0S0000000) {
        uSLEBaseShape0S0000000.A0S("os_version", Long.valueOf((long) Build.VERSION.SDK_INT));
        uSLEBaseShape0S0000000.A0T("release_channel", C10340iB.A00().name().toLowerCase(Locale.US));
    }

    public static void A1L(USLEBaseShape0S0000000 uSLEBaseShape0S0000000) {
        uSLEBaseShape0S0000000.A1U(C103066Xr.A00.A02.A00);
    }

    public static void A1M(H1T h1t, RegFlowExtras regFlowExtras) {
        UserBirthDate userBirthDate = regFlowExtras.A03;
        if (userBirthDate != null) {
            h1t.A0O("year", Integer.toString(userBirthDate.A02));
            h1t.A0O("month", Integer.toString(regFlowExtras.A03.A01));
            h1t.A0O("day", Integer.toString(regFlowExtras.A03.A00));
        }
    }

    public static void A1P(H1T h1t, String str, String str2) {
        h1t.A0F(AnonymousClass006.A01);
        h1t.A04();
        String A0d = AnonymousClass00U.A0d("api/", "v1/", str, str2);
        C04220Ms.A06(A0d);
        h1t.A0J(A0d);
    }

    public static void A1R(C25828Dsm dsm, Object obj, Object obj2, int i, int i2) {
        dsm.A0P(new IDxCListenerShape77S0200000_1_I2(i, obj, obj2), i2);
    }

    public static void A1U(AbstractMap abstractMap) {
        abstractMap.put("nav_chain", C103066Xr.A00.A02.A00);
    }

    public static String[] A1b(CharSequence charSequence, String str, int i) {
        return (String[]) new C134697yC(str).A02(charSequence, i).toArray(new String[i]);
    }

    public static int A03(Context context) {
        return (int) Math.ceil((double) context.getResources().getDisplayMetrics().density);
    }

    public static int A05(IDxCListenerShape202S0100000_1_I2_1 iDxCListenerShape202S0100000_1_I2_1, int i) {
        int A05 = C14030oh.A05(i);
        FragmentActivity activity = ((Fragment) iDxCListenerShape202S0100000_1_I2_1.A00).getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return A05;
    }

    public static long A07() {
        return System.currentTimeMillis() / 1000;
    }

    public static Application A09(Fragment fragment) {
        Application application = fragment.requireActivity().getApplication();
        C04220Ms.A06(application);
        return application;
    }

    public static Context A0A(View view) {
        Context context = view.getContext();
        C04220Ms.A06(context);
        return context;
    }

    public static Intent A0B(String str) {
        return new Intent("android.intent.action.VIEW", C15430rJ.A01(str));
    }

    public static Bundle A0C(Activity activity) {
        return activity.getIntent().getExtras();
    }

    public static ViewGroup A0E(View view) {
        return (ViewGroup) view.findViewById(R.id.content_container);
    }

    public static Window A0F(C34640IcN icN) {
        return icN.getRootActivity().getWindow();
    }

    public static E2V A0M(Fragment fragment) {
        return E2V.A03(fragment.getActivity());
    }

    public static PromoteData A0P(Fragment fragment) {
        FragmentActivity requireActivity = fragment.requireActivity();
        C04220Ms.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteData.Delegate");
        return ((C39846L2w) requireActivity).B4m();
    }

    public static C32165H8c A0Q(H1T h1t) {
        h1t.A06();
        return h1t.A02();
    }

    public static C109326jp A0R(List list, int i) {
        Object obj = list.get(i);
        if (obj == null) {
            return null;
        }
        return ((C105916eC) obj).A00;
    }

    public static C19577Ayd A0T(View view, int i) {
        return new C19577Ayd((ViewStub) view.requireViewById(i));
    }

    public static C19577Ayd A0U(View view, int i) {
        return new C19577Ayd((ViewStub) view.findViewById(i));
    }

    public static C209316s A0V(Iterator it) {
        TreeJNI treeJNI = (TreeJNI) it.next();
        if (treeJNI == null) {
            return null;
        }
        boolean hasFieldValue = treeJNI.hasFieldValue("offset");
        int intValue = treeJNI.getIntValue("offset");
        boolean hasFieldValue2 = treeJNI.hasFieldValue("length");
        return new C209316s(intValue, treeJNI.getIntValue("length"), treeJNI.getIntValue("inline_style"), hasFieldValue, hasFieldValue2, treeJNI.hasFieldValue("inline_style"));
    }

    public static Boolean A0Z(AnonymousClass0A3 r0, String str, String str2, boolean z) {
        r0.A0T(str, str2);
        return Boolean.valueOf(z);
    }

    public static Integer A0b(MMo mMo) {
        return Integer.valueOf(mMo.A0X());
    }

    public static Object A0f(C04530Oa r0) {
        Object value = r0.getValue();
        C04220Ms.A06(value);
        return value;
    }

    public static String A0g(Resources resources, int i) {
        String string = resources.getString(i);
        C04220Ms.A06(string);
        return string;
    }

    public static String A0h(Resources resources, Object obj, int i) {
        return resources.getString(i, new Object[]{obj});
    }

    public static String A0j(BaseBundle baseBundle, String str) {
        String string = baseBundle.getString(str);
        string.getClass();
        return string;
    }

    public static String A0k(Fragment fragment) {
        return fragment.requireArguments().getString("entry_point");
    }

    public static String A0l(C10300i6 r0) {
        return C15500rQ.A01(r0).BJN();
    }

    public static String A0m(C10300i6 r0) {
        if (C05030Qo.A01(r0).A0B() > 0) {
            return "mas";
        }
        return null;
    }

    public static String A0n(Object obj) {
        String obj2 = obj.toString();
        C04220Ms.A06(obj2);
        return obj2;
    }

    public static String A0p(List list, int i) {
        return (String) list.get(i);
    }

    public static String A0q(List list, int i) {
        return (String) list.get(i);
    }

    public static String A0r(Locale locale, String str) {
        String lowerCase = str.toLowerCase(locale);
        C04220Ms.A06(lowerCase);
        return lowerCase;
    }

    public static Iterator A0t(MMp mMp, String str, List list) {
        mMp.A0U(str);
        mMp.A0I();
        return list.iterator();
    }

    public static Iterator A0u(AbstractMap abstractMap) {
        return abstractMap.entrySet().iterator();
    }

    public static void A11(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().clear().apply();
    }

    public static void A12(Uri uri, BaseBundle baseBundle, String str) {
        baseBundle.putString(str, uri.getQueryParameter(str));
    }

    public static void A18(View view, int i, int i2) {
        view.requireViewById(i).setVisibility(i2);
    }

    public static void A19(Fragment fragment) {
        fragment.getParentFragmentManager().A0d();
    }

    public static void A1A(Fragment fragment) {
        fragment.requireActivity().finish();
    }

    public static void A1B(Fragment fragment) {
        E2V.A03(fragment.getActivity()).setIsLoading(false);
    }

    public static void A1N(H1T h1t, Iterable iterable, String str) {
        h1t.A06();
        h1t.A0J("direct_v2/create_group_thread/");
        h1t.A0B(FWy.class, C30615GNd.class);
        h1t.A0O("recipient_users", AnonymousClass00U.A0V("[", C31015GdW.A00(BasicHeaderValueParser.ELEM_DELIMITER).A04(iterable), "]"));
        h1t.A0O("client_context", str);
    }

    public static void A1O(H1T h1t, String str, int i, int i2, int i3) {
        h1t.A0J(str);
        h1t.A0O("year", String.valueOf(i));
        h1t.A0O("month", String.valueOf(i2));
        h1t.A0O("day", String.valueOf(i3));
    }

    public static void A1Q(C112176p7 r1, AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(r1.A00((User) it.next()));
    }

    public static void A1S(Object obj, int i, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 5);
    }

    public static void A1T(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((User) it.next()).getId());
    }

    public static void A1V(AbstractMap abstractMap, List list, Map.Entry entry) {
        if (list.contains(entry.getKey())) {
            abstractMap.put(entry.getKey(), entry.getValue());
        }
    }

    public static boolean A1Y(Object obj, Object obj2) {
        return C04220Ms.A0I(obj.getClass(), obj2.getClass());
    }

    public static boolean A1Z(Object obj, boolean z) {
        return C04220Ms.A0I(obj, Boolean.valueOf(z));
    }

    public static boolean A1a(Collection collection) {
        return !collection.isEmpty();
    }
}
