package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.facebook.redex.IDxObjectShape282S0100000_1_I2;
import com.facebook.redex.IDxTListenerShape295S0100000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.debug.devoptions.PanavisionFlags;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.service.session.UserSession;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;
import java.io.StringWriter;
import java.util.AbstractCollection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.0wP  reason: invalid class name and case insensitive filesystem */
public final class C18230wP {
    public static Bundle A0C() {
        return new Bundle(2);
    }

    public static C130667qT A0S(Fragment fragment, C10300i6 r2) {
        return C130667qT.A02(fragment, r2, (C30938GbW) null);
    }

    public static C15730rn A0T(String str) {
        str.getClass();
        return C15730rn.A01(str, (String) null);
    }

    public static Long A0f(int i) {
        return Long.valueOf((long) i);
    }

    public static String A0r(Object obj) {
        C04220Ms.A0B(obj, 1);
        return null;
    }

    public static AtomicBoolean A0w() {
        return new AtomicBoolean(false);
    }

    public static void A13(Uri uri, BaseBundle baseBundle, String str) {
        baseBundle.putBoolean(str, uri.getBooleanQueryParameter(str, false));
    }

    public static void A19(Fragment fragment, C25786Drz drz) {
        drz.A0C = false;
        drz.A03 = fragment;
        drz.A05();
    }

    public static boolean A1V(int i) {
        return i == 1;
    }

    public static boolean A1W(int i, int i2) {
        return i < i2;
    }

    public static Object[] A1Y() {
        return new Object[3];
    }

    public static int A02(Parcel parcel, Number number) {
        if (number == null) {
            return 0;
        }
        parcel.writeInt(1);
        return number.intValue();
    }

    public static int A05(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static long A06() {
        return new Date().getTime();
    }

    public static long A07() {
        return TimeUnit.HOURS.toMillis(2);
    }

    public static Intent A0B() {
        return new Intent();
    }

    public static Bundle A0D(Object obj) {
        return ((Fragment) obj).requireArguments();
    }

    public static AnonymousClass06B A0K(Object obj) {
        AnonymousClass06B viewModelStore = ((Fragment) obj).requireActivity().getViewModelStore();
        C04220Ms.A06(viewModelStore);
        return viewModelStore;
    }

    public static C146418mD A0N(C146418mD r2) {
        return r2.setMaxToleratedCacheAgeMs(0);
    }

    public static C13330nS A0U(C11630kW r1, C10300i6 r2) {
        C10680ik r0 = new C10680ik(r2);
        r0.A00 = r1;
        return r0.A00();
    }

    public static C109326jp A0V(C127397h3 r1) {
        return r1.A0L(35);
    }

    public static C37350Jpy A0Y(Activity activity, UserSession userSession, C171209wF r3, String str) {
        return new C37350Jpy(activity, userSession, r3, str);
    }

    public static C25745DrH A0a(Fragment fragment) {
        return C25745DrH.A00.A01(fragment.requireActivity());
    }

    public static StringWriter A0d() {
        return new StringWriter();
    }

    public static String A0i(Context context) {
        return C09140ev.A02.A05(context);
    }

    public static String A0k(Fragment fragment) {
        return C09140ev.A02.A05(fragment.getContext());
    }

    public static String A0o(C127397h3 r1) {
        return r1.A0N(36);
    }

    public static C27199Efm A0x(C148838sG r1, C86094wG r2) {
        return new C27199Efm(r1, r2);
    }

    public static JSONObject A0y() {
        return new JSONObject();
    }

    public static void A12(Intent intent, UserSession userSession) {
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
    }

    public static void A17(TextView textView, Object obj, int i) {
        textView.addTextChangedListener(new IDxObjectShape282S0100000_1_I2(obj, i));
    }

    public static void A1C(C021109v r1, AnonymousClass0A3 r2) {
        r2.A0O(r1, "entry_point");
        r2.A0O(AnonymousClass6BO.ACTION, "event_type");
    }

    public static void A1D(C021109v r1, AnonymousClass0A3 r2) {
        r2.A0O(r1, "source");
    }

    public static void A1E(AnonymousClass0A3 r2) {
        r2.A0T("message_controls_settings_version", "v2");
        r2.Bb4();
    }

    public static void A1G(AnonymousClass0A3 r1, String str) {
        r1.A0T("event_name", str);
    }

    public static void A1H(AnonymousClass0A3 r1, String str) {
        r1.A0T("container_module", str);
    }

    public static void A1J(C11630kW r1, IgImageView igImageView, String str) {
        igImageView.setUrl(new SimpleImageUrl(str), r1);
    }

    public static void A1M(C25828Dsm dsm, Object obj, Object obj2, int i, int i2) {
        dsm.A0O(new IDxCListenerShape77S0200000_1_I2(i, obj, obj2), i2);
    }

    public static void A1N(IgdsListCell igdsListCell, Object obj, int i) {
        igdsListCell.A0D(new IDxTListenerShape295S0100000_1_I2(obj, i));
    }

    public static void A1P(Object obj) {
        ((BusinessConversionActivity) obj).Bel((Bundle) null);
    }

    public static void A1Q(Object obj) {
        ((BusinessConversionActivity) obj).CfG((Bundle) null);
    }

    public static void A1T(AnonymousClass0YP r2, C83224qz r3, C84714tk r4) {
        C25817DsW.A06(r3, new IDxFlowShape93S0200000_1_I2(r2, r4, 34));
    }

    public static boolean A1U(int i) {
        if (C04220Ms.A00(i, 32) <= 0) {
            return true;
        }
        return false;
    }

    public static boolean A1X(Object obj) {
        return FXPFAccessLibraryDebugFragment.NAME.equals(obj);
    }

    public static String[] A1Z() {
        return new String[]{"uri"};
    }

    public static String[] A1a() {
        return new String[]{"error_message", "success"};
    }

    public static String[] A1b() {
        return new String[]{"inline_style", "length", "offset"};
    }

    public static float A00(int i) {
        return i != 0 ? 1.0f : 0.3f;
    }

    public static float A01(List list, int i) {
        return ((Number) list.get(i)).floatValue();
    }

    public static int A03(View view, int i) {
        view.requireViewById(i).setVisibility(8);
        return 8;
    }

    public static int A04(Enum enumR, int i) {
        C04220Ms.A0B(enumR, i);
        return enumR.ordinal();
    }

    public static Context A08() {
        return AnonymousClass794.A00().A00;
    }

    public static Context A09(Context context) {
        Context applicationContext = context.getApplicationContext();
        C04220Ms.A06(applicationContext);
        return applicationContext;
    }

    public static Context A0A(Fragment fragment) {
        Context context = fragment.getContext();
        context.getClass();
        return context;
    }

    public static DisplayMetrics A0E(Context context) {
        return context.getResources().getDisplayMetrics();
    }

    public static LayoutInflater A0F(Fragment fragment) {
        return LayoutInflater.from(fragment.getContext());
    }

    public static View A0G(C19577Ayd ayd) {
        View A08 = ayd.A08();
        C04220Ms.A06(A08);
        return A08;
    }

    public static ViewGroup.MarginLayoutParams A0H(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C04220Ms.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    public static Fragment A0I(FragmentActivity fragmentActivity) {
        return fragmentActivity.getSupportFragmentManager().A0L(R.id.layout_container_main);
    }

    public static M5J A0J(C04530Oa r0) {
        return (M5J) r0.getValue();
    }

    public static RecyclerView A0L(View view) {
        return (RecyclerView) view.requireViewById(R.id.recycler_view);
    }

    public static USLEBaseShape0S0000000 A0M(C10300i6 r2) {
        USLEBaseShape0S0000000 A04 = USLEBaseShape0S0000000.A04(C13330nS.A02(r2));
        A04.A0T("flow_name", "ig_story_share_to_fb");
        return A04;
    }

    public static AnonymousClass05L A0O() {
        return C16420t2.A00().A07();
    }

    public static ImmutableList A0P(TreeJNI treeJNI, Class cls, String str) {
        ImmutableList treeList = treeJNI.getTreeList(str, cls);
        C04220Ms.A06(treeList);
        return treeList;
    }

    public static ImmutableList A0Q(Iterable iterable, boolean z) {
        AnonymousClass7Ko.A0C(z);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.addAll(iterable);
        return builder.build();
    }

    public static E2V A0R(Fragment fragment) {
        return E2V.A03(fragment.requireActivity());
    }

    public static IgdsBottomButtonLayout A0W(View view, int i) {
        return (IgdsBottomButtonLayout) view.requireViewById(i);
    }

    public static C37383Jqm A0X(Fragment fragment, C37032Jj9 jj9, int i) {
        jj9.A0O = fragment.getString(i);
        return jj9.A00();
    }

    public static UserSession A0Z() {
        return AnonymousClass0RG.A00().A01();
    }

    public static IconConfig.SimpleIconConfig A0b() {
        return new IconConfig.SimpleIconConfig(R.drawable.instagram_facebook_circle_pano_outline_24);
    }

    public static ProgressButton A0c(View view) {
        return (ProgressButton) view.findViewById(R.id.next_button);
    }

    public static Integer A0e() {
        return Integer.valueOf(R.color.igds_primary_text);
    }

    public static Object A0g(String str) {
        return Class.forName(str).newInstance();
    }

    public static String A0h() {
        return C03480Iw.A00().toString();
    }

    public static String A0j(Resources resources, Object obj, int i, int i2) {
        return resources.getQuantityString(i, i2, new Object[]{obj});
    }

    public static String A0l(Fragment fragment) {
        return fragment.getString(2131834837);
    }

    public static String A0m(BusinessConversionActivity businessConversionActivity) {
        ConversionStep Abh = businessConversionActivity.Abh();
        if (Abh != null) {
            return Abh.A00;
        }
        return null;
    }

    public static String A0n(C11630kW r0) {
        String moduleName = r0.getModuleName();
        C04220Ms.A06(moduleName);
        return moduleName;
    }

    public static String A0p(PanavisionFlags panavisionFlags, String str) {
        return (String) panavisionFlags.getSFlag(str).getCurrentValue();
    }

    public static String A0q(UserSession userSession) {
        String userId = userSession.getUserId();
        C04220Ms.A0B(userId, 0);
        return userId;
    }

    public static String A0s(String str, int i, int i2) {
        String substring = str.substring(i, i2);
        C04220Ms.A06(substring);
        return substring;
    }

    public static String A0t(String str, Throwable th) {
        return AnonymousClass00U.A0L(str, th.getMessage());
    }

    public static String A0u(Map.Entry entry) {
        return (String) entry.getValue();
    }

    public static List A0v(UserSession userSession, C04620Ok r1) {
        return r1.A01(userSession).A1V();
    }

    public static void A0z(Context context, View view, int i) {
        view.setBackgroundColor(context.getColor(i));
    }

    public static void A10(Context context, C37032Jj9 jj9, int i) {
        jj9.A0O = context.getString(i);
    }

    public static void A11(Context context, C25828Dsm dsm, int i) {
        dsm.A0h(context.getDrawable(i));
    }

    public static void A14(View view, InputMethodManager inputMethodManager) {
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void A15(View view, C25553Dnn dnn) {
        dnn.A01(view);
        dnn.A03(D0f.ABOVE_ANCHOR);
    }

    public static void A16(TextView textView, Context context) {
        textView.setHighlightColor(context.getColor(R.color.fds_transparent));
    }

    public static void A18(Fragment fragment) {
        fragment.requireActivity().setResult(-1);
    }

    public static void A1A(Fragment fragment, IgBloksScreenConfig igBloksScreenConfig, int i) {
        igBloksScreenConfig.A0S = fragment.getString(i);
    }

    public static void A1B(Fragment fragment, C25828Dsm dsm, int i) {
        dsm.A0p(fragment.getString(i));
    }

    public static void A1F(AnonymousClass0A3 r2, long j) {
        r2.A0S("current_time", Long.valueOf(j));
    }

    public static void A1I(H1T h1t, Object obj) {
        h1t.A0O("google_tokens", obj.toString());
    }

    public static void A1K(C10300i6 r1, User user, boolean z) {
        user.A28(Boolean.valueOf(z));
        user.A1t(r1);
    }

    public static void A1L(MediaMapQuery mediaMapQuery, C37406JrN jrN, MediaMapPin mediaMapPin, String str) {
        C37406JrN.A00(mediaMapQuery, jrN, mediaMapPin, str).Bb4();
    }

    public static void A1O(Enum enumR, AbstractCollection abstractCollection) {
        abstractCollection.add(enumR.name());
    }

    public static void A1R(Object obj, int i, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 6);
    }

    public static void A1S(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }
}
