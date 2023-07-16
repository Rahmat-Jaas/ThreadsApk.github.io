package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import com.facebook.redex.IDxCListenerShape217S0100000_1_I2;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.facebook.redex.IDxObjectShape236S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.io.Writer;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0wK  reason: invalid class name and case insensitive filesystem */
public final class C18180wK {
    public static Bundle A07() {
        return new Bundle(2);
    }

    public static SpannableString A0B(Context context) {
        SpannableString spannableString = new SpannableString(context.getString(2131823613));
        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.igds_link)), 0, spannableString.length(), 33);
        return spannableString;
    }

    public static AnonymousClass0TJ A0J(Object obj) {
        C04220Ms.A0B(obj, 0);
        return AnonymousClass0TJ.A05;
    }

    public static H1T A0P(C10300i6 r2) {
        return new H1T(r2, -2);
    }

    public static C32165H8c A0R(C146418mD r2, C10300i6 r3) {
        C04220Ms.A0B(r3, 0);
        C31082GfJ gfJ = new C31082GfJ(r3);
        gfJ.A06(r2);
        return gfJ.A05(AnonymousClass006.A01);
    }

    public static Boolean A0X() {
        return false;
    }

    public static Boolean A0Y() {
        return true;
    }

    public static C83224qz A0q() {
        return AnonymousClass7Ja.A03(C25235DiG.A01(new E5N((AnonymousClass0gW) null, 3).A03, new AnonymousClass8bb((C148838sG) null)));
    }

    public static void A1H(MMo mMo, AbstractCollection abstractCollection) {
        User A01 = C19527Axo.A01(mMo, false);
        if (A01 != null) {
            abstractCollection.add(A01);
        }
    }

    public static void A1R(Object obj, Object obj2) {
        C04220Ms.A0B(obj, 4);
        C04220Ms.A0B(obj2, 5);
    }

    public static void A1S(Object obj, Object obj2, Object obj3) {
        C04220Ms.A0B(obj, 6);
        C04220Ms.A0B(obj2, 7);
        C04220Ms.A0B(obj3, 8);
    }

    public static boolean A1V(int i) {
        return i != 0;
    }

    public static boolean A1W(int i) {
        return i == 0;
    }

    public static boolean A1X(int i) {
        return i > 0;
    }

    public static boolean A1Z(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static long A04() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public static long A05(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getLong(str, 0);
    }

    public static Bundle A06() {
        return new Bundle();
    }

    public static Bundle A08(Bundle bundle) {
        if (bundle == null) {
            return new Bundle(2);
        }
        return bundle;
    }

    public static Bundle A09(Object obj, Object obj2) {
        return C98316Fa.A00(new Pair(obj, obj2));
    }

    public static USLEBaseShape0S0000000 A0I(AnonymousClass0A2 r1, int i) {
        return new USLEBaseShape0S0000000(r1, i);
    }

    public static MMp A0K(Writer writer) {
        MMp A04 = C18987Aon.A00.A04(writer);
        A04.A0J();
        return A04;
    }

    public static MMo A0L(String str) {
        MMo A08 = C18987Aon.A00.A08(str);
        A08.A0g();
        return A08;
    }

    public static IVw A0M(K9R k9r, Object obj) {
        IVw iVw = new IVw(k9r);
        iVw.A00.put("server_params", obj);
        return iVw;
    }

    public static C25764Drc A0N() {
        C25764Drc drc = new C25764Drc();
        drc.A04(R.drawable.instagram_arrow_back_24);
        return drc;
    }

    public static H1T A0O(C10300i6 r2) {
        H1T h1t = new H1T(r2);
        h1t.A0F(AnonymousClass006.A0N);
        return h1t;
    }

    public static C25786Drz A0Q(FragmentActivity fragmentActivity, C10300i6 r2) {
        return new C25786Drz(fragmentActivity, r2);
    }

    public static C32165H8c A0S(H1T h1t) {
        h1t.A08(C04740Ox.A00, C26641qy.class, AnonymousClass3WN.class);
        h1t.A06();
        return h1t.A02();
    }

    public static C19577Ayd A0U(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.view.ViewStub");
        return new C19577Ayd((ViewStub) requireViewById);
    }

    public static UserSession A0V(Bundle bundle) {
        return AnonymousClass0RA.A0C.A06(bundle);
    }

    public static IllegalStateException A0a(String str) {
        return new IllegalStateException(str);
    }

    public static Object A0c(C10300i6 r1, Class cls, int i) {
        return r1.A01(cls, new IDxObjectShape236S0100000_1_I2(r1, i));
    }

    public static String A0l(char[] cArr, int i, int i2) {
        return new String(cArr, i, i2);
    }

    public static Pair A0p(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public static void A0y(Parcel parcel, Number number, int i, int i2) {
        if (number == null) {
            parcel.writeInt(i);
            return;
        }
        parcel.writeInt(i2);
        parcel.writeInt(number.intValue());
    }

    public static void A13(Fragment fragment) {
        C25745DrH A01 = C25745DrH.A00.A01(fragment.requireActivity());
        if (A01 != null) {
            A01.A0C();
        }
    }

    public static void A16(Fragment fragment, FragmentActivity fragmentActivity, C10300i6 r4) {
        C25786Drz drz = new C25786Drz(fragmentActivity, r4);
        drz.A03 = fragment;
        drz.A0C = false;
        drz.A05();
    }

    public static void A17(Fragment fragment, C25786Drz drz) {
        drz.A03 = fragment;
        drz.A08();
        drz.A05();
    }

    public static void A18(Fragment fragment, AnonymousClass0YP r3, C84714tk r4) {
        C25817DsW.A06(AnonymousClass067.A00(fragment.getViewLifecycleOwner()), new IDxFlowShape93S0200000_1_I2(r3, r4, 34));
    }

    public static void A19(AnonymousClass0A3 r2) {
        r2.A0T("containermodule", "waterfall_log_in");
    }

    public static void A1D(AnonymousClass0A3 r2, C11630kW r3, String str, long j) {
        r2.A0O(A02.A0N, "action_source");
        r2.A0T("containermodule", r3.getModuleName());
        r2.A0T("media_compound_key", str);
        r2.A0S("media_index", Long.valueOf(j));
        r2.A0T("viewer_session_id", "");
        r2.Bb4();
    }

    public static void A1E(AnonymousClass0A3 r2, C10300i6 r3, String str, String str2, boolean z) {
        r2.A0T("event_name", str);
        r2.A0T("ig_account_type", C04660Oo.A02(r3));
        r2.A0T("entry_point", str2);
        r2.A0Q("user_interaction", Boolean.valueOf(z));
    }

    public static void A1F(AnonymousClass0A3 r2, String str, String str2, boolean z, boolean z2) {
        r2.A0T("event_name", str);
        r2.A0T("xposting_setting_location", str2);
        r2.A0Q("client_setting", Boolean.valueOf(z));
        r2.A0Q("user_interaction", Boolean.valueOf(z2));
    }

    public static void A1G(USLEBaseShape0S0000000 uSLEBaseShape0S0000000) {
        uSLEBaseShape0S0000000.A0T("guid", C09140ev.A02.A04(C10600ic.A00));
    }

    public static void A1I(H1T h1t, long j, long j2) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TraceFieldType.StartTime, j);
        jSONObject.put("end_time", j2);
        jSONArray.put(jSONObject);
        String obj = jSONArray.toString();
        C04220Ms.A06(obj);
        h1t.A0O("quiet_time_windows", obj);
        String id = TimeZone.getDefault().getID();
        C04220Ms.A06(id);
        h1t.A0O("last_seen_timezone", id);
    }

    public static void A1N(C25828Dsm dsm, Object obj, int i, int i2) {
        dsm.A0O(new IDxCListenerShape217S0100000_1_I2(obj, i), i2);
    }

    public static void A1O(C25828Dsm dsm, Object obj, int i, int i2) {
        dsm.A0P(new IDxCListenerShape217S0100000_1_I2(obj, i), i2);
    }

    public static C108776iv[] A1a(C108776iv r1, Class cls, String str, boolean z) {
        return new C108776iv[]{r1, new C108776iv(cls, str, z)};
    }

    public static int A00(Fragment fragment) {
        return fragment.requireContext().getColor(R.color.igds_link);
    }

    public static int A01(IDxCListenerShape201S0100000_1_I2 iDxCListenerShape201S0100000_1_I2, int i) {
        int A05 = C14030oh.A05(i);
        ((AnonymousClass0ZU) iDxCListenerShape201S0100000_1_I2.A00).invoke();
        return A05;
    }

    public static int A02(IDxCListenerShape202S0100000_1_I2_1 iDxCListenerShape202S0100000_1_I2_1, int i) {
        int A05 = C14030oh.A05(i);
        ((Fragment) iDxCListenerShape202S0100000_1_I2_1.A00).requireActivity().onBackPressed();
        return A05;
    }

    public static int A03(String str) {
        return str.hashCode() * 31;
    }

    public static Parcelable A0A(Parcel parcel, Class cls) {
        return parcel.readParcelable(cls.getClassLoader());
    }

    public static LayoutInflater A0C(View view) {
        return LayoutInflater.from(view.getContext());
    }

    public static View A0D(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        C04220Ms.A06(inflate);
        return inflate;
    }

    public static View A0E(View view, int i) {
        View findViewById = view.findViewById(i);
        findViewById.getClass();
        return findViewById;
    }

    public static Window A0F(Fragment fragment) {
        return fragment.requireActivity().getWindow();
    }

    public static TextView A0G(View view, int i) {
        return (TextView) view.findViewById(i);
    }

    public static AnonymousClass06B A0H(C04530Oa r0) {
        AnonymousClass06B viewModelStore = ((AnonymousClass06C) r0.getValue()).getViewModelStore();
        C04220Ms.A06(viewModelStore);
        return viewModelStore;
    }

    public static C32165H8c A0T(H1T h1t, Class cls, Class cls2) {
        h1t.A0B(cls, cls2);
        h1t.A06();
        return h1t.A02();
    }

    public static UserSession A0W(Fragment fragment, AnonymousClass0RG r1) {
        return r1.A06(fragment.requireArguments());
    }

    public static Boolean A0Z(MMo mMo) {
        return Boolean.valueOf(mMo.A12());
    }

    public static Long A0b(MMo mMo) {
        return Long.valueOf(mMo.A0b());
    }

    public static Object A0d(C04530Oa r0) {
        return ((M5J) r0.getValue()).A08();
    }

    public static String A0e() {
        return UUID.randomUUID().toString();
    }

    public static String A0f(TextView textView) {
        return textView.getText().toString();
    }

    public static String A0g(Fragment fragment, int i) {
        String string = fragment.getString(i);
        C04220Ms.A06(string);
        return string;
    }

    public static String A0h(MMp mMp, Object obj) {
        mMp.A0G();
        mMp.close();
        return obj.toString();
    }

    public static String A0i(String str, StringBuilder sb) {
        sb.append(str);
        return sb.toString();
    }

    public static String A0j(String str, Object[] objArr) {
        str.getClass();
        return String.format((Locale) null, str, objArr);
    }

    public static String A0k(Iterator it) {
        return (String) it.next();
    }

    public static StringBuilder A0m(Context context, String str) {
        StringBuilder sb;
        if (AnonymousClass0hB.A02(context)) {
            List asList = Arrays.asList(str.split(" "));
            Collections.reverse(asList);
            sb.append(C31015GdW.A00(' ').A04(asList));
            sb.append('+');
            return sb;
        }
        sb = new StringBuilder();
        sb.append('+');
        sb.append(str);
        return sb;
    }

    public static List A0n(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C04220Ms.A06(singletonList);
        return singletonList;
    }

    public static Map.Entry A0o(Iterator it) {
        return (Map.Entry) it.next();
    }

    public static void A0r(Context context, ImageView imageView, int i) {
        imageView.setImageDrawable(context.getDrawable(i));
    }

    public static void A0s(Context context, TextView textView, int i) {
        textView.setTextColor(context.getColor(i));
    }

    public static void A0t(Context context, H1T h1t, String str, String str2) {
        h1t.A0O(str, str2);
        h1t.A0O("guid", C09140ev.A02.A05(context));
    }

    public static void A0u(SharedPreferences.Editor editor, String str) {
        editor.remove(str).apply();
    }

    public static void A0v(SharedPreferences.Editor editor, String str, String str2) {
        editor.putString(str, str2).apply();
    }

    public static void A0w(BaseBundle baseBundle, C10300i6 r3) {
        baseBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r3.getToken());
    }

    public static void A0x(Bundle bundle, Fragment fragment, C25786Drz drz) {
        fragment.setArguments(bundle);
        drz.A03 = fragment;
        drz.A05();
    }

    public static void A0z(TextView textView) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static void A10(TextView textView, Fragment fragment, int i) {
        textView.setText(fragment.getString(i));
    }

    public static void A11(Fragment fragment) {
        E2V.A0G(E2V.A03(fragment.requireActivity()));
    }

    public static void A12(Fragment fragment) {
        fragment.requireActivity().onBackPressed();
    }

    public static void A14(Fragment fragment) {
        C25745DrH A01;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && (A01 = C25745DrH.A00.A01(activity)) != null) {
            A01.A0C();
        }
    }

    public static void A15(Fragment fragment) {
        fragment.requireActivity().getWindow().setSoftInputMode(16);
    }

    public static void A1A(AnonymousClass0A3 r2, double d) {
        r2.A0R(TraceFieldType.StartTime, Double.valueOf(d));
    }

    public static void A1B(AnonymousClass0A3 r2, double d) {
        r2.A0R("current_time", Double.valueOf(d));
    }

    public static void A1C(AnonymousClass0A3 r2, C11630kW r3) {
        r2.A0T(IgFragmentActivity.MODULE_KEY, r3.getModuleName());
    }

    public static void A1J(H1T h1t, C10300i6 r3, String str, String str2) {
        h1t.A0O(str, str2);
        h1t.A0O("phone_id", C15500rQ.A01(r3).BJN());
    }

    public static void A1K(C15730rn r1, C10300i6 r2) {
        C12090lI.A00(r2).Cd7(r1);
    }

    public static void A1L(C19577Ayd ayd, int i) {
        if (ayd.A0A()) {
            ayd.A08().setVisibility(i);
        }
    }

    public static void A1M(C25828Dsm dsm) {
        dsm.A0P((DialogInterface.OnClickListener) null, 2131831976);
    }

    public static void A1P(Object obj, int i, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 3);
    }

    public static void A1Q(Object obj, int i, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 4);
    }

    public static void A1T(Object obj, AbstractMap abstractMap, float f) {
        abstractMap.put(obj, Float.valueOf(f));
    }

    public static void A1U(AbstractCollection abstractCollection, Iterator it) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) it.next();
        C04220Ms.A04(immutablePandoUserDict);
        abstractCollection.add(new User(immutablePandoUserDict));
    }

    public static boolean A1Y(Parcel parcel) {
        if (parcel.readByte() != 0) {
            return true;
        }
        return false;
    }

    public static AnonymousClass258[] A1b() {
        if (C07960cV.A05(AnonymousClass0e5.A00(36315065179179363L))) {
            return new AnonymousClass258[]{AnonymousClass258.A05, AnonymousClass258.A04, AnonymousClass258.A07};
        }
        return new AnonymousClass258[]{AnonymousClass258.A05, AnonymousClass258.A04};
    }
}
