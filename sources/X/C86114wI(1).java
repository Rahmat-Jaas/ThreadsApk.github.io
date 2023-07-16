package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.dcp.model.DcpData;
import com.facebook.dcp.model.Type;
import com.facebook.forker.Process;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.impls.FBPayLinkableTextImpl;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxObjectShape308S0100000_2_I2;
import com.facebook.redex.IDxObserverShape211S0100000_2_I2;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.common.collect.ImmutableMap;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.debug.devoptions.igds.IgdsComponentDemoRow;
import com.instagram.model.reels.Reel;
import com.instagram.react.modules.base.IgReactFunnelLoggerModule;
import com.instagram.reels.store.ReelStore;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2;
import kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2;
import kotlin.coroutines.jvm.internal.KtCImplShape2S0501000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1;
import kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2;
import kotlin.jvm.internal.KtLambdaShape23S0101000_I2;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: X.4wI  reason: invalid class name and case insensitive filesystem */
public final class C86114wI {
    public static int A02(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    public static int A06(Resources.Theme theme, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, i2);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static int A07(IBinder iBinder, Parcel parcel, Parcel parcel2, int i) {
        iBinder.transact(i, parcel, parcel2, 0);
        parcel2.readException();
        return parcel2.readInt();
    }

    public static Rect A0D(Drawable drawable, Object obj) {
        C04220Ms.A0B(obj, 0);
        Rect bounds = drawable.getBounds();
        C04220Ms.A06(bounds);
        return bounds;
    }

    public static DcpData A0J() {
        return new DcpData((Type) null, (String) null, (String) null, (List) null, (List) null, (List) null, 0.0d, 32767, 0);
    }

    public static PandoGraphQLRequest A0M(C145828l9 r10, Class cls, String str, Map map, Map map2) {
        return new PandoGraphQLRequest(r10, str, map, map2, cls, true, (PandoRealtimeInfoJNI) null, 40, "data", (String) null);
    }

    public static PandoGraphQLRequest A0N(C145828l9 r10, Class cls, String str, Map map, Map map2) {
        return new PandoGraphQLRequest(r10, str, map, map2, cls, true, (PandoRealtimeInfoJNI) null, 12, "input", (String) null);
    }

    public static C25786Drz A0U(Fragment fragment, KtLambdaShape23S0101000_I2 ktLambdaShape23S0101000_I2) {
        C04220Ms.A0B(fragment, 0);
        Bundle requireArguments = fragment.requireArguments();
        requireArguments.putInt("interest_based_channel_implicit_audience_type", ktLambdaShape23S0101000_I2.A00);
        requireArguments.putString("interest_based_channel_entry_point", "broadcast_chat_nux");
        C25786Drz drz = new C25786Drz(fragment.requireActivity(), (C10300i6) ktLambdaShape23S0101000_I2.A01);
        drz.A0A(requireArguments, new C23071bs());
        return drz;
    }

    public static C63893iY A0V(Object obj) {
        AnonymousClass3VO r0 = new AnonymousClass3VO();
        r0.A03(obj, 0);
        return r0.A01();
    }

    public static Object A0c(ValueAnimator valueAnimator) {
        C04220Ms.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        C04220Ms.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        return animatedValue;
    }

    public static Object A0g(Object obj, Class cls, String str) {
        return cls.getMethod(str, new Class[0]).invoke(obj, new Object[0]);
    }

    public static String A0l(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return parcel.readString();
        }
        return null;
    }

    public static void A11(Path path, RectF rectF, float[] fArr, float f) {
        fArr[4] = f;
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    public static void A12(Parcel parcel, Parcelable parcelable, int i) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, i);
    }

    public static void A13(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeParcelable(parcelable, i);
    }

    public static void A15(SparseArray sparseArray, GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000, String str, int i) {
        String str2;
        Object obj = sparseArray.get(i);
        if ((obj instanceof String) && (str2 = (String) obj) != null) {
            GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000 = new GQLCallInputCInputShape0S0000000();
            gQLCallInputCInputShape0S0000000.A0D("skip_validation", true);
            gQLCallInputCInputShape0S0000000.A0F(str2, "payer_name");
            gQLCallInputCInputShape0S0000000.A0F(str, "mutation_type");
            gQLCallInputCInputShape1S0000000.A0B(gQLCallInputCInputShape0S0000000, "payer_name_input");
        }
    }

    public static void A1H(FlexboxLayoutManager.LayoutParams layoutParams) {
        layoutParams.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        layoutParams.A02 = 1.0f;
        layoutParams.A03 = -1;
        layoutParams.A00 = -1.0f;
        layoutParams.A05 = 16777215;
        layoutParams.A04 = 16777215;
    }

    public static void A1N(String str, Object obj) {
        if (Log.isLoggable(str, 3)) {
            String.valueOf(String.valueOf(obj));
        }
    }

    public static void A1O(String str, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        pluginGeneratedSerialDescriptor.A00(str, true);
        pluginGeneratedSerialDescriptor.A00("type", true);
        pluginGeneratedSerialDescriptor.A00("longVal", true);
        pluginGeneratedSerialDescriptor.A00("doubleVal", true);
        pluginGeneratedSerialDescriptor.A00("stringVal", true);
        pluginGeneratedSerialDescriptor.A00("booleanVal", true);
        pluginGeneratedSerialDescriptor.A00("longList", true);
        pluginGeneratedSerialDescriptor.A00("doubleList", true);
        pluginGeneratedSerialDescriptor.A00("stringList", true);
    }

    public static boolean A1S(int i) {
        return i >= 0;
    }

    public static boolean A1T(int i, int i2) {
        return i != i2;
    }

    public static boolean A1U(int i, int i2) {
        return i >= i2;
    }

    public static boolean A1Y(Object obj, Object obj2) {
        C04220Ms.A0B(obj, 2);
        return ((C39082KmL) obj2).A03.A05;
    }

    public static Object[] A1a(Collection collection, Object[] objArr) {
        C04220Ms.A0B(objArr, 0);
        return AnonymousClass0N4.A01(collection, objArr);
    }

    public static int A01(int i) {
        return ((i << 9) & 7168) | 6;
    }

    public static int A03(int i, int i2) {
        return i2 | (i & 112) | (i & 896) | (i & 7168);
    }

    public static long A09(int i) {
        if (i != 0) {
            return 1;
        }
        return 0;
    }

    public static Paint A0C(int i) {
        return new Paint(i);
    }

    public static Looper A0E(String str, int i) {
        HandlerThread handlerThread = new HandlerThread(str, i);
        C13820oM.A00(handlerThread);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    public static M5J A0H(M5J m5j, Object obj, int i) {
        return C30821GXg.A01(m5j, new IDxObjectShape308S0100000_2_I2(obj, i));
    }

    public static AnonymousClass7KG A0I(Object obj) {
        AnonymousClass7KG r1 = (AnonymousClass7KG) obj;
        C04220Ms.A0B(r1, 0);
        return r1;
    }

    public static GQLCallInputCInputShape1S0000000 A0K() {
        GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000 = new GQLCallInputCInputShape1S0000000();
        gQLCallInputCInputShape1S0000000.A0D(UUID.randomUUID().toString(), "client_mutation_id");
        return gQLCallInputCInputShape1S0000000;
    }

    public static GQLCallInputCInputShape1S0000000 A0L(String str, String str2) {
        GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000 = new GQLCallInputCInputShape1S0000000();
        gQLCallInputCInputShape1S0000000.A0D(C03480Iw.A00().toString(), "client_mutation_id");
        gQLCallInputCInputShape1S0000000.A0D(str, "actor_id");
        gQLCallInputCInputShape1S0000000.A0D(str2, "platform_trust_token");
        return gQLCallInputCInputShape1S0000000;
    }

    public static IDxObserverShape211S0100000_2_I2 A0Q(Object obj, int i) {
        return new IDxObserverShape211S0100000_2_I2(obj, i);
    }

    public static C112166p6 A0S(TreeJNI treeJNI, Class cls) {
        if (treeJNI.getTreeValue("terms", cls) != null) {
            Class<FBPayLinkableTextImpl> cls2 = FBPayLinkableTextImpl.class;
            if (!TextUtils.isEmpty(treeJNI.getTreeValue("terms", cls).reinterpret(cls2).getStringValue("text"))) {
                return AnonymousClass7IP.A02((FBPayLinkableTextImpl) treeJNI.getTreeValue("terms", cls).reinterpret(cls2));
            }
        }
        return null;
    }

    public static C7G A0Y(Context context, View view, ViewGroup viewGroup, String str) {
        viewGroup.addView(new IgdsComponentDemoRow(context, str, view));
        return new C7G(context);
    }

    public static Object A0f(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, String str) {
        Bundle bundle = browserLiteJSBridgeCall.A02;
        if (!bundle.containsKey(str)) {
            return null;
        }
        return bundle.get(str);
    }

    public static Object A0h(Object obj, KtCImplShape2S0501000_I2_1 ktCImplShape2S0501000_I2_1) {
        ktCImplShape2S0501000_I2_1.A04 = obj;
        ktCImplShape2S0501000_I2_1.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape2S0501000_I2_1.A05;
    }

    public static Object A0i(Object obj, C86024w9 r2, AnonymousClass0A5[] r3, int i) {
        return r2.BKJ(obj, r3[i]);
    }

    public static Object A0j(String str) {
        String A0L = AnonymousClass00U.A0L(IgReactFunnelLoggerModule.PREFIX, str);
        C04220Ms.A0B(A0L, 0);
        return AnonymousClass14Y.A00.get(A0L);
    }

    public static RuntimeException A0k(Throwable th) {
        return new RuntimeException(th);
    }

    public static String A0o(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C04220Ms.A06(lowerCase);
        return lowerCase;
    }

    public static StringBuilder A0s(int i) {
        return new StringBuilder(i);
    }

    public static C04530Oa A0w(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape22S0100000_I2_2(obj, i));
    }

    public static KtCImplShape2S0201000_I2 A0x(Object obj, C146958n9 r3, int i) {
        return new KtCImplShape2S0201000_I2(obj, r3, i, 42);
    }

    public static void A17(C147188nY r8, Modifier modifier, C115286uo r10, String str) {
        C1190173e.A00(r8, modifier, r10, str, 8, 8, 0);
    }

    public static void A19(Fragment fragment, C121107Ed r4, String str, String str2) {
        new RuntimeException(AnonymousClass00U.A0h("Prompt display parameter for ", str, " of ", str2, " is not available"));
        r4.A03(str2);
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static void A1A(AnonymousClass066 r1, M5J m5j, Object obj, int i) {
        m5j.A0C(r1, new IDxObserverShape211S0100000_2_I2(obj, i));
    }

    public static void A1C(AnonymousClass0A3 r1, AnonymousClass0V3 r2) {
        r1.A0P(r2, "event_payload");
    }

    public static void A1E(AnonymousClass0A3 r2, BKU bku, Long l) {
        r2.A0S("replied_to_comment_id", l);
        r2.A0T("media_id", bku.A0f.A4Y);
        r2.A0T(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "nudge_eligible");
        r2.Bb4();
    }

    public static void A1F(AnonymousClass0A3 r1, String str, String str2) {
        r1.A0T("partner_name", str);
        r1.A0T("url", str2);
    }

    public static void A1G(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, Object obj) {
        Map map = (Map) obj;
        if (map != null) {
            uSLEBaseShape0S0000000.A1g(map);
        }
    }

    public static void A1J(Object obj, Object obj2, Object obj3, KtCImplShape1S0501000_I2 ktCImplShape1S0501000_I2, int i) {
        ktCImplShape1S0501000_I2.A01 = obj;
        ktCImplShape1S0501000_I2.A02 = obj2;
        ktCImplShape1S0501000_I2.A03 = obj3;
        ktCImplShape1S0501000_I2.A00 = i;
    }

    public static void A1K(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put("logging_context", obj);
        if (obj2 != null) {
            abstractMap.put("TARGET_NAME", obj2);
        }
    }

    public static void A1L(Object obj, Object obj2, C86024w9 r3, AnonymousClass0A5[] r4, int i) {
        r3.CrD(obj, obj2, r4[i]);
    }

    public static void A1M(Object obj, KtCImplShape2S0201000_I2 ktCImplShape2S0201000_I2) {
        ktCImplShape2S0201000_I2.A02 = obj;
        ktCImplShape2S0201000_I2.A00 |= Process.WAIT_RESULT_TIMEOUT;
    }

    public static void A1P(Throwable th, AbstractMap abstractMap) {
        if (th != null) {
            abstractMap.put("error_message", AnonymousClass721.A00(th));
        }
    }

    public static void A1R(C04530Oa r3, int i, long j) {
        ((SharedPreferences) r3.getValue()).edit().putLong("awareness_prompt_last_time_shown_ms", j).apply();
        ((SharedPreferences) r3.getValue()).edit().putInt("awareness_prompt_show_count", i + 1).apply();
    }

    public static boolean A1W(Parcel parcel, Boolean bool) {
        if (bool == null) {
            return false;
        }
        parcel.writeInt(1);
        return bool.booleanValue();
    }

    public static boolean A1X(KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2, AnonymousClass5Im r5, Object obj, C86074wE r7) {
        return r7.ADi(obj, new KtCSuperShape0S0130000_I2(r5, ktCSuperShape0S0130000_I2.A03, ktCSuperShape0S0130000_I2.A02, ktCSuperShape0S0130000_I2.A01));
    }

    public static String[] A1b() {
        return new String[]{"allows_saving", "artist_id", "audio_asset_id", "audio_cluster_id", "cover_artwork_thumbnail_uri", "cover_artwork_uri", "dash_manifest", "display_artist", "duration_in_ms", "fast_start_progressive_download_url", "has_lyrics", "highlight_start_times_in_ms", "id", "ig_username", "is_explicit", "progressive_download_url", "subtitle", DialogModule.KEY_TITLE, "web_30s_preview_download_url"};
    }

    public static float A00(C81784oM r0) {
        Number number = (Number) r0.getValue();
        if (number != null) {
            return number.floatValue();
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public static int A04(int i, int i2) {
        return i2 | (57344 & i) | (458752 & i);
    }

    public static int A05(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.account_section_text_margin_horizontal);
    }

    public static int A08(Parcel parcel, Object obj) {
        obj.getClass().getClassLoader();
        return parcel.readInt();
    }

    public static long A0A(C81784oM r1) {
        return ((AnonymousClass7KE) r1.getValue()).A00;
    }

    public static Configuration A0B(Context context) {
        return context.getResources().getConfiguration();
    }

    public static Parcel A0F(IBinder iBinder) {
        int A03 = C14030oh.A03(1276056990);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        C14030oh.A0A(932077576, A03);
        obtain.writeStrongBinder(iBinder);
        return obtain;
    }

    public static AnonymousClass062 A0G(Object obj, KtSLambdaShape9S0301000_I2_1 ktSLambdaShape9S0301000_I2_1) {
        AnonymousClass0OU.A00(obj);
        return ((AnonymousClass066) ktSLambdaShape9S0301000_I2_1.A02).getLifecycle();
    }

    public static TreeJNI A0O(TreeJNI treeJNI, Class cls, Class cls2, String str, String str2) {
        return treeJNI.getTreeValue(str, cls).getTreeValue(str2, cls2);
    }

    public static C25812DsR A0P() {
        C25812DsR A02 = AnonymousClass0hJ.A00().A02();
        A02.A0D(C25757DrU.A01(30.0d, 7.0d));
        return A02;
    }

    public static C1201078o A0R(Object obj, Map map) {
        return (C1201078o) map.get(obj);
    }

    public static C970767v A0T(C86094wG r0) {
        return (C970767v) ((KtCSuperShape0S0400000_I2) r0.getValue()).A00;
    }

    public static BKU A0W(UserSession userSession, String str) {
        return C19462Awj.A01(userSession).A05(str);
    }

    public static Reel A0X(UserSession userSession, String str) {
        C19554AyF.A02();
        return ReelStore.A02(userSession).A0K(str);
    }

    public static ClassLoader A0Z(Object obj) {
        return obj.getClass().getClassLoader();
    }

    public static IndexOutOfBoundsException A0a(String str, String str2, int i, int i2) {
        return new IndexOutOfBoundsException(AnonymousClass00U.A01(i, i2, str, str2));
    }

    public static Integer A0b(Parcel parcel) {
        return Integer.valueOf(parcel.readInt());
    }

    public static Object A0d(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static Object A0e(Parcel parcel, Class cls) {
        return parcel.readValue(cls.getClassLoader());
    }

    public static String A0m(SparseArray sparseArray, int i) {
        return (String) sparseArray.get(i);
    }

    public static String A0n(AnonymousClass0A3 r2, C11630kW r3) {
        r2.A0T(IgFragmentActivity.MODULE_KEY, r3.getModuleName());
        String str = C103066Xr.A00.A02.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String A0p(String str, String str2) {
        if (str.length() != 0) {
            return str2.concat(str);
        }
        return new String(str2);
    }

    public static String A0q(StringBuilder sb, char c) {
        sb.append(c);
        return sb.toString();
    }

    public static String A0r(C04530Oa r0) {
        String str = (String) r0.getValue();
        C04220Ms.A06(str);
        return str;
    }

    public static HashSet A0t(Object[] objArr) {
        return new HashSet(Arrays.asList(objArr));
    }

    public static Iterator A0u(C81784oM r0) {
        return ((Map) r0.getValue()).entrySet().iterator();
    }

    public static Set A0v(ImmutableMap.Builder builder, Object obj, Object obj2, C04530Oa r3) {
        builder.put(obj, obj2);
        return (Set) r3.getValue();
    }

    public static C39060Kls A0y() {
        return new C39060Kls("com.facebook.dcp.model.Type", Type.values());
    }

    public static void A0z(Context context, View view, int i) {
        view.setBackground(new ColorDrawable(context.getColor(i)));
    }

    public static void A10(Canvas canvas, Drawable drawable) {
        canvas.save();
        canvas.translate((float) drawable.getBounds().left, (float) drawable.getBounds().top);
    }

    public static void A14(Parcel parcel, String str, String str2, int i) {
        parcel.writeInt(i);
        parcel.writeString(str);
        parcel.writeString(str2);
    }

    public static void A16(View view, AnonymousClass0V3 r3) {
        r3.A09("media_width", Long.valueOf((long) view.getWidth()));
        r3.A09("media_height", Long.valueOf((long) view.getHeight()));
    }

    public static void A18(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2) {
        if (androidComposeViewAccessibilityDelegateCompat.A0S()) {
            AndroidComposeViewAccessibilityDelegateCompat.A08(androidComposeViewAccessibilityDelegateCompat.A0Q(i, i2), androidComposeViewAccessibilityDelegateCompat);
        }
    }

    public static void A1B(M5J m5j, boolean z) {
        m5j.A0H(Boolean.valueOf(z));
    }

    public static void A1D(AnonymousClass0A3 r2, AnonymousClass0V3 r3, C11630kW r4, Object obj, String str) {
        r3.A0A("type", obj.toString());
        r3.A0A("module_name", r4.getModuleName());
        r2.A0P(r3, "extra_data");
        r2.A0T(IgFragmentActivity.MODULE_KEY, r4.getModuleName());
        r2.A0T("mediaId", str);
    }

    public static void A1I(Object obj, int i, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 9);
    }

    public static void A1Q(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((User) it.next()).B4M());
    }

    public static boolean A1V(Parcel parcel) {
        if (parcel.readInt() != 1) {
            return false;
        }
        return true;
    }

    public static boolean A1Z(Set set, int i) {
        return set.contains(Integer.valueOf(i));
    }
}
