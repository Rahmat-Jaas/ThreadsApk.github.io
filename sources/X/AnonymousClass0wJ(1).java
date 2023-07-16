package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.JsonWriter;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.forker.Process;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.facebook.redex.IDxHelperShape67S0000000_1_I2;
import com.facebook.redex.IDxHelperShape68S0000000_1_I2_1;
import com.facebook.redex.IDxHelperShape69S0000000_1_I2_2;
import com.facebook.redex.IDxHelperShape70S0000000_1_I2_3;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.KtCImplShape3S0301000_I2_2;
import kotlin.coroutines.jvm.internal.KtCImplShape7S0201000_I2_5;

/* renamed from: X.0wJ  reason: invalid class name */
public final class AnonymousClass0wJ {
    public static Bundle A0D(Bundle bundle) {
        if (bundle == null) {
            return new Bundle(2);
        }
        return bundle;
    }

    public static View A0H(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public static H1T A0O(C10300i6 r2) {
        H1T h1t = new H1T(r2, -2);
        h1t.A0F(AnonymousClass006.A01);
        return h1t;
    }

    public static H1T A0P(C10300i6 r2) {
        H1T h1t = new H1T(r2, -2);
        h1t.A0F(AnonymousClass006.A0N);
        return h1t;
    }

    public static IllegalArgumentException A0Z(Object obj) {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.bloks_ig_session, obj);
        sparseArray.put(R.id.bloks_ig_use_prelogin_json_parser, false);
        C04220Ms.A06(sparseArray.clone());
        return new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{1}));
    }

    public static String A0r(MMo mMo) {
        if (mMo.A0f() != C40318LcR.VALUE_NULL) {
            return mMo.A0p();
        }
        return null;
    }

    public static String A0s(MMo mMo) {
        if (mMo.A0f() != C40318LcR.VALUE_NULL) {
            return mMo.A0p();
        }
        return null;
    }

    public static void A15(Parcel parcel, Enum enumR) {
        C04220Ms.A0B(parcel, 0);
        parcel.writeInt(enumR.ordinal());
    }

    public static void A1A(AnonymousClass0A3 r2, double d, double d2) {
        r2.A0R("elapsed_time", Double.valueOf(d - d2));
    }

    public static void A1G(MMo mMo, AbstractMap abstractMap) {
        String str = null;
        String A0p = mMo.A0p();
        mMo.A0g();
        C40318LcR A0f = mMo.A0f();
        C40318LcR lcR = C40318LcR.VALUE_NULL;
        if (A0f == lcR || !(A0f == lcR || (str = mMo.A0p()) == null)) {
            abstractMap.put(A0p, str);
        }
    }

    public static void A1N(Object obj, Object obj2) {
        C04220Ms.A0B(obj, 0);
        C04220Ms.A0B(obj2, 1);
    }

    public static void A1O(Object obj, Object obj2) {
        C04220Ms.A0B(obj, 1);
        C04220Ms.A0B(obj2, 2);
    }

    public static void A1P(Object obj, Object obj2) {
        C04220Ms.A0B(obj, 1);
        C04220Ms.A0B(obj2, 3);
    }

    public static void A1Q(Object obj, Object obj2) {
        C04220Ms.A0B(obj, 2);
        C04220Ms.A0B(obj2, 3);
    }

    public static void A1R(Object obj, Object obj2) {
        C04220Ms.A0B(obj, 3);
        C04220Ms.A0B(obj2, 4);
    }

    public static boolean A1T(int i, int i2) {
        return i == i2;
    }

    public static boolean A1W(Object obj) {
        return obj != null;
    }

    public static boolean A1Y(Object obj, Object obj2) {
        C04220Ms.A0B(obj, 0);
        C04220Ms.A0B(obj2, 1);
        return false;
    }

    public static boolean A1Z(Object obj, Object obj2) {
        C04220Ms.A0B(obj, 0);
        C04220Ms.A0B(obj2, 1);
        return true;
    }

    public static C108776iv[] A1a(Class cls, String str) {
        return new C108776iv[]{new C108776iv(cls, str, false)};
    }

    public static C108776iv[] A1b(Class cls, String str) {
        return new C108776iv[]{new C108776iv(cls, str, true)};
    }

    public static int A03(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static int A04(Object obj) {
        return ((Number) obj).intValue();
    }

    public static int A06(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public static int A08(String str, int i) {
        return str.indexOf(38, i);
    }

    public static int A09(String str, int i) {
        return str.indexOf(61, i);
    }

    public static Bundle A0E(UserSession userSession) {
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        return bundle;
    }

    public static JsonWriter A0G(Context context, JsonWriter jsonWriter, String str, String str2, String str3) {
        return jsonWriter.name("IG_UserId").value(str).name("last_seen_ad_id").value(str2).name("IG_Username").value(str3).name("Git_Hash").value(AnonymousClass0Jc.A00(context).A01).name("Build_Num").value((long) C10380iF.A00()).name("Branch").value(C10380iF.A01(context)).name("OS_Version");
    }

    public static AnonymousClass0A2 A0M(C13330nS r1, String str) {
        return r1.A03(r1.A00, str);
    }

    public static H1T A0N(C10300i6 r2) {
        H1T h1t = new H1T(r2);
        h1t.A0F(AnonymousClass006.A01);
        return h1t;
    }

    public static C25786Drz A0Q(FragmentActivity fragmentActivity, C10300i6 r2) {
        C25786Drz drz = new C25786Drz(fragmentActivity, r2);
        drz.A08();
        return drz;
    }

    public static C67133yv A0R(Object obj) {
        return (C67133yv) ((BusinessConversionActivity) obj).A08.getValue();
    }

    public static C32165H8c A0S(H1T h1t) {
        h1t.A0B(C85814vo.class, AnonymousClass3Za.class);
        h1t.A06();
        return h1t.A02();
    }

    public static User A0Y(UserSession userSession) {
        return C06810aP.A01.A01(userSession);
    }

    public static IllegalStateException A0a() {
        return new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static IllegalStateException A0b() {
        return new IllegalStateException("Required value was null.");
    }

    public static IllegalStateException A0c(int i) {
        return new IllegalStateException(AnonymousClass00U.A0J("Unexpected templateType: ", i));
    }

    public static Object A0e(MMo mMo, int i) {
        return C25563Dnz.A02(mMo, new IDxHelperShape68S0000000_1_I2_1(i));
    }

    public static Object A0f(MMo mMo, int i) {
        return C25563Dnz.A02(mMo, new IDxHelperShape67S0000000_1_I2(i));
    }

    public static Object A0g(MMo mMo, int i) {
        return C25563Dnz.A02(mMo, new IDxHelperShape70S0000000_1_I2_3(i));
    }

    public static Object A0h(MMo mMo, int i) {
        return C25563Dnz.A02(mMo, new IDxHelperShape69S0000000_1_I2_2(i));
    }

    public static Object A0i(Object obj, KtCImplShape3S0301000_I2_2 ktCImplShape3S0301000_I2_2) {
        ktCImplShape3S0301000_I2_2.A02 = obj;
        ktCImplShape3S0301000_I2_2.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape3S0301000_I2_2.A03;
    }

    public static Object A0j(Object obj, KtCImplShape7S0201000_I2_5 ktCImplShape7S0201000_I2_5) {
        ktCImplShape7S0201000_I2_5.A01 = obj;
        ktCImplShape7S0201000_I2_5.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape7S0201000_I2_5.A02;
    }

    public static String A0t(String str, Object obj) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(obj);
        return sb.toString();
    }

    public static String A0u(StringBuilder sb) {
        sb.append(')');
        return sb.toString();
    }

    public static ArrayList A0v() {
        return new ArrayList();
    }

    public static ArrayList A0w(Iterable iterable) {
        return new ArrayList(C02260Al.A0z(iterable, 10));
    }

    public static HashMap A0y() {
        return new HashMap();
    }

    public static void A16(View view, int i, Object obj) {
        view.setOnClickListener(new IDxCListenerShape201S0100000_1_I2(obj, i));
    }

    public static void A17(View view, int i, Object obj) {
        view.setOnClickListener(new IDxCListenerShape202S0100000_1_I2_1(obj, i));
    }

    public static void A18(View view, int i, Object obj, Object obj2) {
        view.setOnClickListener(new IDxCListenerShape70S0200000_1_I2(i, obj, obj2));
    }

    public static void A19(Fragment fragment, FragmentActivity fragmentActivity, C10300i6 r3) {
        C25786Drz drz = new C25786Drz(fragmentActivity, r3);
        drz.A03 = fragment;
        drz.A05();
    }

    public static void A1C(AnonymousClass0A3 r2, String str, String str2, boolean z, boolean z2) {
        r2.A0T("xposting_setting_location", str);
        r2.A0Q("client_setting", Boolean.valueOf(z));
        r2.A0T("server_setting", str2);
        r2.A0Q("user_interaction", Boolean.valueOf(z2));
    }

    public static void A1J(H1T h1t, String str, String str2) {
        h1t.A0F(AnonymousClass006.A0N);
        h1t.A04();
        String A0d = AnonymousClass00U.A0d("api/", "v1/", str, str2);
        C04220Ms.A06(A0d);
        h1t.A0J(A0d);
    }

    public static void A1S(Object obj, Object obj2) {
        C147188nY r2 = (C147188nY) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && r2.BCM()) {
            r2.CuJ();
        }
    }

    public static boolean A1U(AnonymousClass0A3 r0) {
        return r0.A00.isSampled();
    }

    public static boolean A1V(C08410dK r0) {
        return ((Boolean) r0.A00.invoke()).booleanValue();
    }

    public static boolean A1X(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static int A00(int i, Object obj) {
        int A03 = C14030oh.A03(i);
        C04220Ms.A0B(obj, 0);
        return A03;
    }

    public static int A01(IDxCListenerShape201S0100000_1_I2 iDxCListenerShape201S0100000_1_I2, int i) {
        int A05 = C14030oh.A05(i);
        ((Fragment) iDxCListenerShape201S0100000_1_I2.A00).requireActivity().onBackPressed();
        return A05;
    }

    public static int A02(IDxCListenerShape201S0100000_1_I2 iDxCListenerShape201S0100000_1_I2, int i) {
        int A05 = C14030oh.A05(i);
        FragmentActivity activity = ((Fragment) iDxCListenerShape201S0100000_1_I2.A00).getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
        return A05;
    }

    public static int A05(Object obj, int i) {
        return (i + obj.hashCode()) * 31;
    }

    public static int A07(String str, int i) {
        return (i + str.hashCode()) * 31;
    }

    public static long A0A() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    public static Resources A0B(Fragment fragment) {
        return fragment.requireContext().getResources();
    }

    public static Bundle A0C(Activity activity) {
        return activity.getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
    }

    public static Handler A0F() {
        return new Handler(Looper.getMainLooper());
    }

    public static View A0I(View view, int i) {
        View findViewById = view.findViewById(i);
        C04220Ms.A06(findViewById);
        return findViewById;
    }

    public static View A0J(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C04220Ms.A06(requireViewById);
        return requireViewById;
    }

    public static View A0K(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C04220Ms.A06(requireViewById);
        return requireViewById;
    }

    public static TextView A0L(View view, int i) {
        return (TextView) view.requireViewById(i);
    }

    public static C32165H8c A0T(H1T h1t, Class cls, Class cls2) {
        h1t.A0B(cls, cls2);
        return h1t.A02();
    }

    public static C10300i6 A0U(C04530Oa r0) {
        return (C10300i6) r0.getValue();
    }

    public static C25828Dsm A0V(Fragment fragment) {
        return new C25828Dsm(fragment.requireContext());
    }

    public static UserSession A0W(Fragment fragment) {
        return AnonymousClass0RA.A0C.A06(fragment.requireArguments());
    }

    public static UserSession A0X(C04530Oa r0) {
        return (UserSession) r0.getValue();
    }

    public static Long A0d(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    public static String A0k(Context context, int i) {
        String string = context.getString(i);
        C04220Ms.A06(string);
        return string;
    }

    public static String A0l(Context context, Object obj, int i) {
        return context.getString(i, new Object[]{obj});
    }

    public static String A0m(Resources resources, int i, int i2) {
        return resources.getQuantityString(i2, i, new Object[]{Integer.valueOf(i)});
    }

    public static String A0n(EditText editText) {
        return editText.getText().toString();
    }

    public static String A0o(Fragment fragment, Object obj, int i) {
        return fragment.getString(i, obj);
    }

    public static String A0p(MMo mMo) {
        if (mMo.A0f() == C40318LcR.VALUE_NULL) {
            return null;
        }
        return mMo.A0p();
    }

    public static String A0q(MMo mMo) {
        String A0o = mMo.A0o();
        mMo.A0g();
        return A0o;
    }

    public static ArrayList A0x(Iterable iterable, int i) {
        return new ArrayList(C02260Al.A0z(iterable, i));
    }

    public static Iterator A0z(Map map) {
        return map.entrySet().iterator();
    }

    public static Pair A10(Object obj, int i) {
        return new Pair(obj, Integer.valueOf(i));
    }

    public static void A11(SharedPreferences.Editor editor, String str, int i) {
        editor.putInt(str, i).apply();
    }

    public static void A12(SharedPreferences.Editor editor, String str, long j) {
        editor.putLong(str, j).apply();
    }

    public static void A13(SharedPreferences.Editor editor, String str, boolean z) {
        editor.putBoolean(str, z).apply();
    }

    public static void A14(SharedPreferences sharedPreferences, String str, int i) {
        sharedPreferences.edit().putInt(str, sharedPreferences.getInt(str, i) + 1).apply();
    }

    public static void A1B(AnonymousClass0A3 r2, double d, double d2) {
        r2.A0R("current_time", Double.valueOf(d));
        r2.A0R("elapsed_time", Double.valueOf(d - d2));
    }

    public static void A1D(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, double d, double d2) {
        uSLEBaseShape0S0000000.A0R(TraceFieldType.StartTime, Double.valueOf(d));
        uSLEBaseShape0S0000000.A0R("current_time", Double.valueOf(d2));
    }

    public static void A1E(MMo mMo) {
        if (mMo.A0f() != C40318LcR.VALUE_NULL) {
            mMo.A0p();
        }
    }

    public static void A1F(MMo mMo, AbstractCollection abstractCollection) {
        String A0p;
        if (mMo.A0f() != C40318LcR.VALUE_NULL && (A0p = mMo.A0p()) != null) {
            abstractCollection.add(A0p);
        }
    }

    public static void A1H(MMo mMo, Object[] objArr, int i) {
        objArr[i] = Integer.valueOf(mMo.A0X());
    }

    public static void A1I(MMo mMo, Object[] objArr, int i) {
        objArr[i] = Boolean.valueOf(mMo.A12());
    }

    public static void A1K(C25828Dsm dsm) {
        C13950oZ.A00(dsm.A0G());
    }

    public static void A1L(C08410dK r0, boolean z) {
        r0.A01.invoke(Boolean.valueOf(z));
    }

    public static void A1M(Object obj, int i, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 2);
    }
}
