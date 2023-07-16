package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.redex.IDxCListenerShape217S0100000_1_I2;
import com.facebook.redex.IDxEListenerShape223S0100000_1_I2;
import com.facebook.redex.IDxFCollectorShape83S0200000_1_I2;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.debug.devoptions.PanavisionDevUtil;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.user.model.User;
import java.text.BreakIterator;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape64S0100000_I2_44;

/* renamed from: X.0wO  reason: invalid class name and case insensitive filesystem */
public final class C18220wO {
    public static long A09(int i) {
        return ((long) i) * 1000;
    }

    public static C130667qT A0T(FragmentActivity fragmentActivity, C11630kW r2, C10300i6 r3) {
        return C130667qT.A00((SparseArray) null, fragmentActivity, r2, r3);
    }

    public static C13330nS A0V(C11630kW r1, C10300i6 r2) {
        C04220Ms.A0B(r2, 0);
        return C13330nS.A01(r1, r2);
    }

    public static C13330nS A0W(C10300i6 r1) {
        C04220Ms.A0B(r1, 0);
        return C13330nS.A02(r1);
    }

    public static Integer A0d() {
        return 0;
    }

    public static C27420EnC A11(C146958n9 r3) {
        C27420EnC enC = new C27420EnC(1, C25598DoY.A02(r3));
        enC.A0D();
        return enC;
    }

    public static void A13(Activity activity, Intent intent, Bundle bundle, String str) {
        bundle.putBoolean(str, true);
        bundle.putInt("business_account_flow", 7);
        intent.putExtras(bundle);
        C10650ih.A08(activity, intent, 11);
    }

    public static void A1I(MMo mMo, Object[] objArr, int i, int i2) {
        if (i != 0) {
            objArr[i2] = C19527Axo.A01(mMo, false);
        }
    }

    public static boolean A1U(Object obj) {
        return obj == null;
    }

    public static Object[] A1X() {
        return new Object[2];
    }

    public static AnonymousClass0A5[] A1b(Class cls, String str, String str2) {
        return new AnonymousClass0A5[]{new C000400f(cls, str, str2, 0)};
    }

    public static int A00(int i, int i2) {
        if ((i & 4) != 0) {
            return 0;
        }
        return i2;
    }

    public static int A07(String str) {
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static Context A0A(Object obj) {
        return ((Fragment) obj).requireContext();
    }

    public static SharedPreferences.Editor A0B(C08350dD r0) {
        return r0.A00.edit();
    }

    public static Uri.Builder A0D() {
        return new Uri.Builder().scheme("instagram");
    }

    public static Uri A0G(String str) {
        return AnonymousClass30B.A00.buildUpon().appendPath("package").appendPath(str).build();
    }

    public static C1370485v A0M(AnonymousClass0ZU r1, AnonymousClass0ZU r2, AnonymousClass0ZU r3, AnonymousClass0W7 r4) {
        return new C1370485v(r1, r2, r3, r4);
    }

    public static IDxCListenerShape217S0100000_1_I2 A0O(Object obj, int i) {
        return new IDxCListenerShape217S0100000_1_I2(obj, i);
    }

    public static IDxEListenerShape223S0100000_1_I2 A0P(Object obj, int i) {
        return new IDxEListenerShape223S0100000_1_I2(obj, i);
    }

    public static C32165H8c A0X(C146418mD r1, String str) {
        C31082GfJ gfJ = new C31082GfJ(str);
        gfJ.A06(r1);
        return gfJ.A03();
    }

    public static C25745DrH A0b(Activity activity) {
        return C25745DrH.A00.A01(activity);
    }

    public static Long A0e(Number number) {
        if (number != null) {
            return Long.valueOf((long) number.intValue());
        }
        return null;
    }

    public static Object A0f(C08410dK r0) {
        return r0.A00.invoke();
    }

    public static String A0l(TreeJNI treeJNI) {
        return treeJNI.getStringValue(FXPFAccessLibraryDebugFragment.NAME);
    }

    public static String A0m(TreeJNI treeJNI) {
        return treeJNI.getStringValue("strong_id__");
    }

    public static String A0n(CategorySearchFragment categorySearchFragment) {
        if (categorySearchFragment.A0G) {
            return "change_category";
        }
        return "choose_category";
    }

    public static String A0o(C127397h3 r1) {
        return r1.A0N(35);
    }

    public static String A0p(Object obj) {
        return new Gson().A08(obj);
    }

    public static String A0s(String str, int i, int i2) {
        return str.subSequence(i2, i + 1).toString();
    }

    public static UnsupportedOperationException A0v() {
        return new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public static LinkedHashMap A0y() {
        return new LinkedHashMap();
    }

    public static C04530Oa A0z(Integer num, Object obj, int i) {
        return AnonymousClass0OY.A01(num, new KtLambdaShape64S0100000_I2_44(obj, i));
    }

    public static C146958n9 A10(Object obj, Object obj2, C39041KlF klF) {
        return klF.create(obj2, (C146958n9) obj);
    }

    public static void A15(Bitmap bitmap, Drawable drawable, int i) {
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(i, i, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
    }

    public static void A16(Bundle bundle, Parcelable parcelable, String str, String str2, String str3) {
        bundle.putString("argument_reset_token", str);
        bundle.putString("argument_user_id", str2);
        bundle.putString("argument_user_name", str3);
        bundle.putParcelable("argument_profile_pic_url", parcelable);
    }

    public static void A17(TextView textView, CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            textView.setText(charSequence);
            textView.setVisibility(i);
            return;
        }
        textView.setVisibility(i2);
    }

    public static void A1A(Fragment fragment, C25786Drz drz) {
        drz.A03 = fragment;
        drz.A0B = true;
        drz.A05();
    }

    public static void A1B(Fragment fragment, C25786Drz drz, boolean z) {
        drz.A03 = fragment;
        drz.A0C = z;
        drz.A05();
    }

    public static void A1D(C021109v r1, AnonymousClass0A3 r2) {
        r2.A0O(r1, "event");
    }

    public static void A1E(C021109v r1, AnonymousClass0A3 r2) {
        r2.A0O(r1, "action");
    }

    public static void A1F(AnonymousClass0A3 r1, Long l, String str, String str2) {
        r1.A0S("creator_igid", l);
        r1.A0T("origin", str);
        r1.A0T("settings_recommendation_type", str2);
    }

    public static void A1G(AnonymousClass0A3 r1, Map map) {
        r1.A0V("debug_test_data", map);
        r1.Bb4();
    }

    public static void A1H(AnonymousClass0V3 r1, String str, String str2, String str3, String str4) {
        r1.A0A("event", str);
        r1.A0A("event_flow", str2);
        r1.A0A("event_step", str3);
        r1.A0A("event_category", str4);
    }

    public static void A1N(Object obj) {
        ((BusinessConversionActivity) obj).A0J((Bundle) null, true);
    }

    public static void A1Q(Calendar calendar, long j) {
        calendar.setTime(new Date(j));
    }

    public static boolean A1S(Object obj) {
        return "id".equals(obj);
    }

    public static boolean A1T(Object obj) {
        return DialogModule.KEY_TITLE.equals(obj);
    }

    public static byte[] A1W(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i + i2);
    }

    public static String[] A1Z() {
        return new String[]{"amount", "amount_with_offset", "currency", "offset"};
    }

    public static String[] A1a() {
        return new String[]{"build_info_url", "build_number", "download_url", "file_size", "itms_url", "publish_date", "release_channel", "version_name"};
    }

    public static int A01(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static int A02(Context context, int i) {
        return context.getColor(C121907Is.A02(context, i));
    }

    public static int A03(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal);
    }

    public static int A04(Fragment fragment) {
        return fragment.requireContext().getColor(R.color.igds_primary_button);
    }

    public static int A05(Number number, String str, int i) {
        return (i + str.hashCode() + number.intValue()) * 31;
    }

    public static int A06(Object obj, int i) {
        return i + obj.hashCode();
    }

    public static int A08(String str) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.last();
    }

    public static SharedPreferences.Editor A0C(String str) {
        return C08340dC.A01(str).edit();
    }

    public static Uri.Builder A0E(String str) {
        return C15430rJ.A01(str).buildUpon();
    }

    public static Uri A0F(Uri.Builder builder, String str, String str2) {
        return builder.appendQueryParameter(str, str2).build();
    }

    public static Pair A0H(Object obj, int i) {
        return new Pair(obj, Integer.valueOf(i));
    }

    public static ViewGroup A0I(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) inflate;
    }

    public static ViewGroup A0J(View view, int i) {
        return (ViewGroup) view.requireViewById(i);
    }

    public static ImageView A0K(View view, int i) {
        return (ImageView) view.findViewById(i);
    }

    public static AnonymousClass01J A0L(FragmentActivity fragmentActivity) {
        return new AnonymousClass01J(fragmentActivity.getSupportFragmentManager());
    }

    public static AnonymousClass3FH A0N(C10300i6 r0) {
        return C15500rQ.A01(r0).B1K();
    }

    public static AnonymousClass7H0 A0Q(View view, int i, int i2) {
        view.measure(i, i2);
        return new AnonymousClass7H0(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public static AnonymousClass5rY A0R(Object obj) {
        obj.getClass();
        return new AnonymousClass5rY(obj);
    }

    public static ImmutableList A0S(Collection collection) {
        ImmutableList copyOf = ImmutableList.copyOf(collection);
        C04220Ms.A06(copyOf);
        return copyOf;
    }

    public static C67133yv A0U(C04530Oa r0) {
        return (C67133yv) r0.getValue();
    }

    public static C18489AgL A0Y(Fragment fragment) {
        return C150388wA.A00(fragment.requireContext());
    }

    public static C150388wA A0Z(C18489AgL agL, C18523Agw agw) {
        agL.A01(agw);
        return agL.A00();
    }

    public static C37406JrN A0a(Fragment fragment) {
        return ((MediaMapFragment) fragment.requireParentFragment()).A0J;
    }

    public static User A0c(Iterator it) {
        return (User) it.next();
    }

    public static String A0g(Context context, H1T h1t, String str, String str2) {
        h1t.A0O(str, str2);
        return C09140ev.A00(context);
    }

    public static String A0h(Context context, Object obj, Object obj2, int i) {
        return context.getString(i, new Object[]{obj, obj2});
    }

    public static String A0i(Resources resources, String str, int i) {
        return C16370sw.A01(resources, new String[]{str}, i).toString();
    }

    public static String A0j(Fragment fragment) {
        return fragment.requireArguments().getString("argument_event_id");
    }

    public static String A0k(Fragment fragment, Object obj, Object obj2, int i) {
        return fragment.getString(i, obj, obj2);
    }

    public static String A0q(Object obj) {
        return obj.getClass().getName();
    }

    public static String A0r(Object obj, Map map) {
        return (String) map.get(obj);
    }

    public static String A0t(Iterator it) {
        return (String) it.next();
    }

    public static String A0u(Locale locale, String str) {
        String upperCase = str.toUpperCase(locale);
        C04220Ms.A06(upperCase);
        return upperCase;
    }

    public static ArrayList A0w(Map map) {
        return new ArrayList(map.size());
    }

    public static Iterator A0x(Map map) {
        return map.keySet().iterator();
    }

    public static C83234r0 A12(IDxFCollectorShape83S0200000_1_I2 iDxFCollectorShape83S0200000_1_I2, Object obj) {
        AnonymousClass0OU.A00(obj);
        return (C83234r0) iDxFCollectorShape83S0200000_1_I2.A00;
    }

    public static void A14(Context context, C25828Dsm dsm, int i) {
        dsm.A0p(context.getString(i));
    }

    public static void A18(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static void A19(Fragment fragment, Fragment fragment2, C37032Jj9 jj9) {
        C37383Jqm.A00(fragment.requireActivity(), fragment2, jj9.A00());
    }

    public static void A1C(Fragment fragment, C33841Hva hva) {
        C31155GhB.A01(fragment.requireContext(), AnonymousClass06E.A00(fragment), hva);
    }

    public static void A1J(H1T h1t, String str) {
        h1t.A0J(str);
        h1t.A0B(CP8.class, C25056Dep.class);
        h1t.A06();
    }

    public static void A1K(H1T h1t, String str) {
        h1t.A0J(str);
        h1t.A0F(AnonymousClass006.A0N);
    }

    public static void A1L(C11630kW r1, IgImageView igImageView, User user) {
        igImageView.setUrl(user.B4M(), r1);
    }

    public static void A1M(PanavisionDevUtil.ExperimentFlag experimentFlag, boolean z) {
        experimentFlag.overrideValue(Boolean.valueOf(z));
    }

    public static void A1O(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put("uids_count", String.valueOf(i));
        C04220Ms.A0B(obj, 0);
    }

    public static void A1P(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (((String) next).length() > 0) {
            abstractCollection.add(next);
        }
    }

    public static boolean A1R(Boolean bool) {
        C04220Ms.A0A(bool);
        return bool.booleanValue();
    }

    public static boolean A1V(String str, int i, String str2) {
        C04220Ms.A0B(str, i);
        return str2.startsWith(str);
    }

    public static Object[] A1Y(User user, User user2) {
        return new Object[]{user.getId(), user2.getId()};
    }
}
