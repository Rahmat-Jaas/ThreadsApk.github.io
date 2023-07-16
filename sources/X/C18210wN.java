package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.forker.Process;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxAListenerShape388S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape202S0100000_1_I2_1;
import com.facebook.redex.IDxCListenerShape345S0100000_1_I2;
import com.facebook.redex.IDxObserverShape210S0100000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.debug.devoptions.DirectInboxFlags;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.debug.devoptions.PanavisionFlags;
import com.instagram.debug.devoptions.igds.IgdsComponentDemoRow;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.KtCImplShape0S0411000_I2;
import kotlin.jvm.internal.KtLambdaShape40S0100000_I2_20;
import kotlin.jvm.internal.KtLambdaShape84S0100000_I2_64;
import org.json.JSONArray;

/* renamed from: X.0wN  reason: invalid class name and case insensitive filesystem */
public final class C18210wN {
    public static C32165H8c A0K(C146418mD r1, C10300i6 r2) {
        C04220Ms.A0B(r2, 0);
        C31082GfJ gfJ = new C31082GfJ(r2);
        gfJ.A06(r1);
        return gfJ.A04();
    }

    public static Set A0i(AnonymousClass0BO r1) {
        return AnonymousClass00J.A0c(r1.A0G((String) null));
    }

    public static void A0n(int i, Object obj, Object obj2) {
        C04220Ms.A0B(obj, 0);
        C04220Ms.A0B(obj2, i);
    }

    public static void A0o(Activity activity, Window window) {
        window.setBackgroundDrawable(new ColorDrawable(0));
        activity.getWindow().setStatusBarColor(activity.getColor(R.color.fds_transparent));
    }

    public static void A0q(Context context, TypedArray typedArray, TextView textView, int i) {
        int resourceId = typedArray.getResourceId(1, i);
        if (resourceId != 0) {
            textView.setHint(context.getText(resourceId));
        }
    }

    public static void A11(TextView textView, AnonymousClass3EV r3) {
        if (r3 != null) {
            textView.setText(r3.A00);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    public static void A1P(AbstractCollection abstractCollection, Iterator it) {
        IgdsBulletCell igdsBulletCell = (IgdsBulletCell) it.next();
        igdsBulletCell.setMovementMethod((MovementMethod) null, LinkMovementMethod.getInstance());
        abstractCollection.add(igdsBulletCell);
    }

    public static boolean A1V(Object obj) {
        C04220Ms.A0B(obj, 1);
        return false;
    }

    public static int A00(int i) {
        return (527 + i) * 31;
    }

    public static int A03(Number number) {
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public static long A06() {
        return TimeUnit.DAYS.toMillis(1);
    }

    public static Intent A09(String str) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        return intent;
    }

    public static Bundle A0B(Intent intent) {
        return intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
    }

    public static AttributeSet A0D(AttributeSet attributeSet, int i) {
        if ((i & 2) != 0) {
            return null;
        }
        return attributeSet;
    }

    public static IDxCListenerShape202S0100000_1_I2_1 A0H(Object obj, int i) {
        return new IDxCListenerShape202S0100000_1_I2_1(obj, i);
    }

    public static C16230sh A0I(Context context, Intent intent) {
        C16230sh r1 = new C16230sh();
        r1.A06(intent, context.getClassLoader());
        return r1;
    }

    public static ImmutableList A0J(Collection collection) {
        if (collection == null) {
            return null;
        }
        return ImmutableList.copyOf(collection);
    }

    public static C37032Jj9 A0L(C10300i6 r1) {
        return new C37032Jj9(r1);
    }

    public static Enum A0S(TreeJNI treeJNI) {
        if (treeJNI != null) {
            return treeJNI.getEnumValue("viewer_status", AnonymousClass22S.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }
        return null;
    }

    public static Long A0V() {
        return 0L;
    }

    public static NullPointerException A0W(String str) {
        return new NullPointerException(str);
    }

    public static Object A0Z(Object obj, KtCImplShape0S0411000_I2 ktCImplShape0S0411000_I2) {
        ktCImplShape0S0411000_I2.A03 = obj;
        ktCImplShape0S0411000_I2.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape0S0411000_I2.A04;
    }

    public static String A0f(Object obj) {
        String str = (String) obj;
        C04220Ms.A0B(str, 0);
        return str;
    }

    public static C04530Oa A0j(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape84S0100000_I2_64(obj, i));
    }

    public static C04530Oa A0k(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape40S0100000_I2_20(obj, i));
    }

    public static C02230Ai A0l(Class cls) {
        return new C02230Ai(cls);
    }

    public static void A0m() {
        C04220Ms.A0E("userSession");
    }

    public static void A0p(Context context) {
        C25745DrH A02 = C25745DrH.A00.A02(context);
        if (A02 != null) {
            A02.A0C();
        }
    }

    public static void A0r(Context context, View view, ViewGroup viewGroup, String str) {
        viewGroup.addView(new IgdsComponentDemoRow(context, str, view));
    }

    public static void A0t(Context context, C10300i6 r2, C36941JhV jhV, String str) {
        jhV.A02 = str;
        SimpleWebViewActivity.A00(context, r2, jhV.A00());
    }

    public static void A0v(Intent intent) {
        intent.putExtra("access_scope", "SAME_APP");
        intent.putExtra("enforce_scope", "false");
    }

    public static void A0x(BaseBundle baseBundle, String str) {
        baseBundle.putString("entry_point", str);
    }

    public static void A0y(View view) {
        AnonymousClass7FY.A02(view, AnonymousClass006.A01);
    }

    public static void A0z(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void A10(View view, int i, Object obj) {
        view.setOnFocusChangeListener(new IDxCListenerShape345S0100000_1_I2(obj, i));
    }

    public static void A12(TextView textView, Object obj, int i) {
        textView.setOnEditorActionListener(new IDxAListenerShape388S0100000_1_I2(obj, i));
    }

    public static void A16(AnonymousClass066 r1, M5J m5j, int i) {
        m5j.A0C(r1, new IDxObserverShape210S0100000_1_I2(r1, i));
    }

    public static void A17(AnonymousClass0A3 r2) {
        r2.A0T(IgFragmentActivity.MODULE_KEY, "waterfall_log_in");
    }

    public static void A19(AnonymousClass0A3 r1, String str) {
        r1.A0T("flow", str);
    }

    public static void A1A(AnonymousClass0A3 r1, String str) {
        r1.A0T("action", str);
    }

    public static void A1B(AnonymousClass0A3 r1, String str) {
        r1.A0T("entry_point", str);
    }

    public static void A1C(AnonymousClass0A3 r1, String str) {
        r1.A0T("containermodule", str);
        r1.Bb4();
    }

    public static void A1L(Integer num, AbstractCollection abstractCollection) {
        abstractCollection.add(new E8R(num));
    }

    public static void A1N(Object obj, Object obj2, Object obj3, AbstractMap abstractMap) {
        abstractMap.put("entry_point", obj);
        abstractMap.put("waterfall_id", obj2);
        abstractMap.put("prior_module", obj3);
        abstractMap.put("presentation_style", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
    }

    public static boolean A1T(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static String[] A1Z() {
        return new String[]{"id"};
    }

    public static String[] A1a() {
        return new String[]{"text"};
    }

    public static String[] A1b() {
        return new String[]{"id", FXPFAccessLibraryDebugFragment.NAME};
    }

    public static int A01(Context context) {
        return context.getColor(R.color.igds_link);
    }

    public static int A02(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_floating_window_z);
    }

    public static int A04(Object obj) {
        return obj.hashCode() * 31;
    }

    public static int A05(String str, int i) {
        return i + str.hashCode();
    }

    public static long A07(Calendar calendar) {
        return calendar.getTimeInMillis() / 1000;
    }

    public static Intent A08(Fragment fragment) {
        Context context = fragment.getContext();
        C04220Ms.A0B(context, 0);
        return new Intent(context, BusinessConversionActivity.class);
    }

    public static Uri A0A(String str) {
        Uri A01 = C15430rJ.A01(str);
        C04220Ms.A06(A01);
        return A01;
    }

    public static Spanned A0C(Resources resources, Object obj, int i) {
        return C16370sw.A00(resources, new Object[]{obj}, i);
    }

    public static TextView A0E(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.widget.TextView");
        return (TextView) requireViewById;
    }

    public static FragmentActivity A0F(Bundle bundle, Fragment fragment, Fragment fragment2) {
        fragment.setArguments(bundle);
        return fragment2.requireActivity();
    }

    public static TreeJNI A0G(Iterator it) {
        return (TreeJNI) it.next();
    }

    public static RegFlowExtras A0M(Fragment fragment) {
        return (RegFlowExtras) fragment.requireArguments().getParcelable("RegFlowExtras.EXTRA_KEY");
    }

    public static C07530bf A0N(Fragment fragment) {
        return AnonymousClass0RA.A0C.A04(fragment.requireArguments());
    }

    public static ProgressButton A0O(View view) {
        return (ProgressButton) view.requireViewById(R.id.next_button);
    }

    public static User A0P(UserSession userSession, String str) {
        return AnonymousClass6VR.A00(userSession).A03(str);
    }

    public static Boolean A0Q(BaseBundle baseBundle, String str) {
        return Boolean.valueOf(baseBundle.getBoolean(str));
    }

    public static Boolean A0R(AnonymousClass0A3 r0, Boolean bool, String str, boolean z) {
        r0.A0Q(str, bool);
        return Boolean.valueOf(z);
    }

    public static Integer A0T(BaseBundle baseBundle, String str) {
        return Integer.valueOf(baseBundle.getInt(str));
    }

    public static Integer A0U(Parcel parcel, int i) {
        return AnonymousClass006.A00(i)[parcel.readInt()];
    }

    public static Object A0X(View view) {
        Object tag = view.getTag();
        tag.getClass();
        return tag;
    }

    public static Object A0Y(PanavisionFlags panavisionFlags, String str) {
        return panavisionFlags.getBFlag(str).getCurrentValue();
    }

    public static String A0b(BaseBundle baseBundle, String str, String str2) {
        String string = baseBundle.getString(str, str2);
        C04220Ms.A06(string);
        return string;
    }

    public static String A0c(TextView textView) {
        return textView.getText().toString();
    }

    public static String A0d(Class cls, Object obj, C36975Ji8 ji8, AnonymousClass76V r3) {
        return ji8.A01(obj, AnonymousClass72C.A00(C03970Ls.A00(cls), r3));
    }

    public static String A0e(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static String A0g(Object obj, Map map) {
        return (String) map.get(obj);
    }

    public static List A0h(String str) {
        return Arrays.asList(new String[]{str});
    }

    public static void A0s(Context context, IgBloksScreenConfig igBloksScreenConfig, int i) {
        igBloksScreenConfig.A0S = context.getString(i);
    }

    public static void A0u(Context context, StringBuilder sb, int i) {
        sb.append(context.getString(i));
    }

    public static void A0w(Uri uri, String str, AbstractMap abstractMap) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            abstractMap.put(str, queryParameter);
        }
    }

    public static void A13(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            activity.getWindow().clearFlags(8192);
        }
    }

    public static void A14(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public static void A15(Fragment fragment, IgdsBottomButtonLayout igdsBottomButtonLayout, int i) {
        igdsBottomButtonLayout.setPrimaryActionText(fragment.getString(i));
    }

    public static void A18(AnonymousClass0A3 r2, long j) {
        r2.A0S("ig_media_id", Long.valueOf(j));
    }

    public static void A1D(AnonymousClass0V3 r2, long j) {
        r2.A09("impression_count", Long.valueOf(j));
    }

    public static void A1E(MMo mMo, Object[] objArr, int i) {
        objArr[i] = Float.valueOf((float) mMo.A0R());
    }

    public static void A1F(MMo mMo, Object[] objArr, int i) {
        objArr[i] = new Float(mMo.A0R());
    }

    public static void A1G(C22302CTd cTd) {
        ((C41030Luu) cTd.getScrollingViewProxy().APJ()).notifyDataSetChanged();
    }

    public static void A1H(DirectInboxFlags directInboxFlags, String str, boolean z) {
        directInboxFlags.getBooleanFlag(str).overrideValue(Boolean.valueOf(z));
    }

    public static void A1I(C08410dK r0, int i) {
        r0.A01.invoke(Integer.valueOf(i));
    }

    public static void A1J(UserSession userSession, User user) {
        AnonymousClass6VR.A00(userSession).A04(user);
    }

    public static void A1K(User user) {
        C63593hs.A03(user.B4M(), user.BK7());
    }

    public static void A1M(Object obj, int i, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 8);
    }

    public static void A1O(Object obj, AbstractCollection abstractCollection) {
        abstractCollection.add(obj.toString());
    }

    public static void A1Q(AbstractMap abstractMap, Map.Entry entry) {
        abstractMap.put(entry.getKey(), entry.getValue());
    }

    public static void A1R(Iterator it, JSONArray jSONArray) {
        jSONArray.put(it.next());
    }

    public static boolean A1S(long j) {
        return C07960cV.A05(AnonymousClass0e5.A00(j));
    }

    public static boolean A1U(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence);
    }

    public static boolean A1W(boolean z) {
        return Boolean.valueOf(z).booleanValue();
    }

    public static Object[] A1X(int i) {
        return new Object[]{Integer.valueOf(i)};
    }

    public static Object[] A1Y(Object obj, int i) {
        return new Object[]{obj, Integer.valueOf(i)};
    }

    public static String A0a() {
        return (String) C08960ea.A00(18864149199585442L).A01();
    }
}
