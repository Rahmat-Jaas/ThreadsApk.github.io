package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.BaseBundle;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import android.text.style.ForegroundColorSpan;
import android.util.JsonWriter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.forker.Process;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.redex.IDxCBackShape14S0500000_3_I2;
import com.facebook.redex.IDxCListenerShape204S0100000_3_I2;
import com.facebook.redex.IDxTListenerShape108S0200000_3_I2;
import com.facebook.redex.IDxUListenerShape256S0100000_3_I2;
import com.facebook.redex.KtSItemShape1S0100001_I2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.api.schemas.SmartReelType;
import com.instagram.barcelona.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.model.shopping.ProductDetailsProductItemDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.user.model.User;
import java.io.Writer;
import java.lang.ref.Reference;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.KtCImplShape11S0201000_I2_9;
import kotlin.coroutines.jvm.internal.KtCImplShape1S0101000_I2;
import kotlin.jvm.internal.KtLambdaShape122S0100000_I2_102;
import kotlin.jvm.internal.KtLambdaShape132S0100000_I2_112;
import kotlin.jvm.internal.KtLambdaShape133S0100000_I2_113;
import kotlin.jvm.internal.KtLambdaShape6S0300000_I2_1;
import kotlin.jvm.internal.KtLambdaShape74S0100000_I2_54;

/* renamed from: X.8sc  reason: invalid class name and case insensitive filesystem */
public final class C148948sc {
    public static int A02(Context context) {
        C04220Ms.A0B(context, 0);
        return ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public static Object A0R(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return DirectMessageInteropReachabilityOptions.CREATOR.createFromParcel(parcel);
        }
        return null;
    }

    public static String A0T(BKU bku) {
        if (bku != null) {
            return bku.A0f.A4Y;
        }
        return null;
    }

    public static void A0o(RecyclerView recyclerView) {
        IA1 ia1 = new IA1();
        ia1.A00 = false;
        recyclerView.setItemAnimator(ia1);
    }

    public static void A12(LJ2 lj2, Integer num, int i) {
        lj2.A05 = 0;
        lj2.A0Q = num;
        lj2.A04 = 1.28f;
        lj2.A0S = false;
        lj2.A0E = 0;
        lj2.A0B = i;
    }

    public static void A13(LJ2 lj2, Integer num, int i) {
        lj2.A05 = 0;
        lj2.A0Q = num;
        lj2.A04 = 1.33f;
        lj2.A0S = false;
        lj2.A0E = 0;
        lj2.A0B = i;
    }

    public static void A14(LJ2 lj2, Integer num, boolean z) {
        lj2.A05 = 0;
        lj2.A0Q = num;
        lj2.A04 = 1.0f;
        lj2.A0S = z;
        lj2.A0E = 0;
        lj2.A0B = Integer.MAX_VALUE;
    }

    public static void A15(LJ2 lj2, boolean z) {
        lj2.A0T = z;
        lj2.A0R = z;
        lj2.A02 = null;
    }

    public static boolean A1E(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean A1X(Object obj) {
        C04220Ms.A0B(obj, 3);
        return true;
    }

    public static SpannableStringBuilder A05() {
        return new SpannableStringBuilder();
    }

    public static JsonWriter A07(Writer writer, Boolean bool, String str) {
        return new JsonWriter(writer).beginObject().name("gif_media_id").value(str).name("is_sticker").value(bool.booleanValue()).endObject();
    }

    public static FrameLayout A09(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.video_scrubber_layout, frameLayout, true);
        return frameLayout;
    }

    public static FragmentActivity A0B(KtLambdaShape6S0300000_I2_1 ktLambdaShape6S0300000_I2_1) {
        Context context = (Context) ktLambdaShape6S0300000_I2_1.A01;
        C04220Ms.A0C(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (FragmentActivity) context;
    }

    public static AK6 A0C(Object obj) {
        AK6 ak6 = (AK6) obj;
        C04220Ms.A0B(ak6, 0);
        return ak6;
    }

    public static IDxCListenerShape204S0100000_3_I2 A0D(Object obj, int i) {
        return new IDxCListenerShape204S0100000_3_I2(obj, i);
    }

    public static KtSItemShape1S0100001_I2 A0E(A05 a05, float f) {
        return new KtSItemShape1S0100001_I2(a05, f);
    }

    public static SmartReelType A0G(String str, String str2, int i) {
        return new SmartReelType(str, i, str2);
    }

    public static ClipsViewerSource A0H(String str, String str2, int i) {
        return new ClipsViewerSource(str, i, str2);
    }

    public static ImageUrl A0L(C146478mJ r1) {
        return C122057Ju.A01(r1, AnonymousClass006.A01);
    }

    public static C37415JrZ A0N(Object obj) {
        KtCSuperShape0S0400000_I2 ktCSuperShape0S0400000_I2 = (KtCSuperShape0S0400000_I2) obj;
        C04220Ms.A0B(ktCSuperShape0S0400000_I2, 0);
        return (C37415JrZ) ktCSuperShape0S0400000_I2.A01;
    }

    public static ProductDetailsProductItemDict A0O(TreeJNI treeJNI, int i) {
        C2U c2u = (C2U) treeJNI.getTreeValueByHashCode(i, C163889jD.class);
        if (c2u != null) {
            return c2u.D5l();
        }
        return null;
    }

    public static String A0U(String str, int i) {
        return str.split("[_@]")[i];
    }

    public static C04530Oa A0Y(Object obj, int i) {
        return new AnonymousClass4UR(new KtLambdaShape132S0100000_I2_112(obj, i));
    }

    public static C04530Oa A0Z(Object obj, int i) {
        return new AnonymousClass4UR(new KtLambdaShape133S0100000_I2_113(obj, i));
    }

    public static C04530Oa A0a(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape74S0100000_I2_54(obj, i));
    }

    public static C04530Oa A0b(Object obj, int i) {
        return new AnonymousClass4UR(new KtLambdaShape122S0100000_I2_102(obj, i));
    }

    public static KtCImplShape11S0201000_I2_9 A0c(Object obj, C146958n9 r3, int i) {
        return new KtCImplShape11S0201000_I2_9(obj, r3, i, 42);
    }

    public static void A0d(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new IDxUListenerShape256S0100000_3_I2(obj, i));
    }

    public static void A0i(View view, int i, Object obj, Object obj2) {
        view.setOnTouchListener(new IDxTListenerShape108S0200000_3_I2(i, obj, obj2));
    }

    public static void A0p(C021109v r1, AnonymousClass0A3 r2, IDxCBackShape14S0500000_3_I2 iDxCBackShape14S0500000_3_I2) {
        r2.A0O(r1, "event");
        r2.A0O((AnonymousClass28V) iDxCBackShape14S0500000_3_I2.A01, "project");
        r2.A0O((AnonymousClass28W) iDxCBackShape14S0500000_3_I2.A02, "screen");
    }

    public static void A0q(AnonymousClass0A3 r2) {
        r2.A0T("navigation_chain", C103066Xr.A00.A02.A00);
        r2.Bb4();
    }

    public static void A0u(AnonymousClass0A3 r2, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments) {
        r2.A0Q("is_organic_product_tagging", Boolean.valueOf(shoppingTaggingFeedArguments.A01));
        r2.Bb4();
    }

    public static void A0v(AnonymousClass0A3 r2, Long l, String str) {
        r2.A0T("story_ranking_token", str);
        Double valueOf = Double.valueOf(0.0d);
        r2.A0R("time_elapsed", valueOf);
        r2.A0R("time_remaining", valueOf);
        r2.A0S("tray_pos_excl_own_story", l);
        r2.A0S("tray_position", l);
    }

    public static void A0w(AnonymousClass0A3 r1, String str) {
        r1.A0T("submodule", str);
    }

    public static void A0x(AnonymousClass0A3 r2, String str, long j) {
        r2.A0T("containermodule", str);
        r2.A0S("time_spent", Long.valueOf(j));
        r2.A0S("time_spent_all_media_rendered", -1L);
        r2.A0S("time_spent_first_media_rendered", -1L);
    }

    public static void A0y(AnonymousClass0A3 r1, String str, String str2, String str3) {
        r1.A0T("service_type", str);
        r1.A0T("sticker_id", str2);
        r1.A0T("reel_item_id", str3);
        r1.Bb4();
    }

    public static void A10(AnonymousClass0V3 r1, String str) {
        r1.A0A("prior_submodule", str);
    }

    public static void A16(MMp mMp, User user) {
        if (user != null) {
            mMp.A0U("user");
            C19527Axo.A05(mMp, user);
        }
    }

    public static void A18(C22302CTd cTd) {
        if (cTd.mView != null) {
            ((C28130Ez1) cTd.getScrollingViewProxy()).CmG(false);
        }
    }

    public static void A1A(Object obj, KtCImplShape1S0101000_I2 ktCImplShape1S0101000_I2) {
        ktCImplShape1S0101000_I2.A01 = obj;
        ktCImplShape1S0101000_I2.A00 |= Process.WAIT_RESULT_TIMEOUT;
    }

    public static boolean A1F(C10300i6 r3) {
        return C63803iN.A0E(AnonymousClass0TJ.A05, r3, 36328293678459230L);
    }

    public static boolean A1G(Object obj) {
        return DialogModule.KEY_ITEMS.equals(obj);
    }

    public static boolean A1H(Object obj) {
        return IgReactMediaPickerNativeModule.WIDTH.equals(obj);
    }

    public static boolean A1I(Object obj) {
        return IgReactMediaPickerNativeModule.HEIGHT.equals(obj);
    }

    public static boolean A1J(Object obj) {
        return "surface".equals(obj);
    }

    public static boolean A1K(Object obj) {
        return "rotation".equals(obj);
    }

    public static boolean A1L(Object obj) {
        return "is_hidden".equals(obj);
    }

    public static boolean A1M(Object obj) {
        return "is_pinned".equals(obj);
    }

    public static boolean A1N(Object obj) {
        return "media_type".equals(obj);
    }

    public static boolean A1O(Object obj) {
        return "is_sticker".equals(obj);
    }

    public static boolean A1P(Object obj) {
        return "end_time_ms".equals(obj);
    }

    public static boolean A1Q(Object obj) {
        return "attribution".equals(obj);
    }

    public static boolean A1R(Object obj) {
        return "display_type".equals(obj);
    }

    public static boolean A1S(Object obj) {
        return "is_fb_sticker".equals(obj);
    }

    public static boolean A1T(Object obj) {
        return "start_time_ms".equals(obj);
    }

    public static boolean A1U(Object obj) {
        return "attribution_url".equals(obj);
    }

    public static boolean A1V(Object obj) {
        return "custom_text_color".equals(obj);
    }

    public static boolean A1W(Object obj) {
        return "sticker_style_enum".equals(obj);
    }

    public static boolean A1Y(Object obj) {
        return "subscription_sticker".equals(obj);
    }

    public static String[] A1a() {
        return new String[]{"can_add_to_bag", "can_enable_restock_reminder", "can_show_inventory_quantity", "commerce_inventory", "full_inventory_quantity", "has_free_shipping", "has_free_two_day_shipping", "is_final_sale", "is_purchase_protected", "is_shopify_merchant", "pre_order_estimate_fulfill_date", "product_group_has_inventory", "receiver_id", "return_policy_time", "two_day_shipping_qe_signal", "viewer_purchase_limit"};
    }

    public static String[] A1b() {
        return new String[]{"disabled_sharing_products_to_guides", "has_active_affiliate_shop", "is_verified", "merchant_checkout_style", "pk", "profile_pic_url", "seller_shoppable_feed_type", "show_shoppable_feed", "storefront_attribution_username", C61943Wl.A01(31, 8, 29)};
    }

    public static int A00(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
    }

    public static int A01(Context context) {
        int A08 = (int) (((float) C09860go.A08(context)) * C19604Az5.A01);
        int A082 = C09860go.A08(context);
        if (AnonymousClass0hB.A02(context)) {
            return A082 - A08;
        }
        return A08;
    }

    public static int A03(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
    }

    public static int A04(Number number, String str) {
        return str.hashCode() + number.intValue();
    }

    public static ForegroundColorSpan A06(Context context, int i) {
        return new ForegroundColorSpan(context.getColor(i));
    }

    public static ViewParent A08(View view) {
        ViewParent parent = view.getParent();
        C04220Ms.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        return parent;
    }

    public static Fragment A0A(Reference reference) {
        return (Fragment) reference.get();
    }

    public static ShimmerFrameLayout A0F(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, boolean z) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
        return (ShimmerFrameLayout) inflate;
    }

    public static AnonymousClass9CZ A0I(List list, int i) {
        return (AnonymousClass9CZ) list.get(i);
    }

    public static C13330nS A0J(C11630kW r0, C10300i6 r1, Object obj, int i) {
        C04220Ms.A0B(obj, i);
        return C13330nS.A01(r0, r1);
    }

    public static AnonymousClass3I0 A0K(Object obj, int i) {
        return new AnonymousClass3I0(new Object[]{obj}, i);
    }

    public static C19208AsV A0M(C04530Oa r0) {
        return (C19208AsV) r0.getValue();
    }

    public static LightboxArguments A0P(C04530Oa r0) {
        return (LightboxArguments) r0.getValue();
    }

    public static Float A0Q(Parcel parcel) {
        return Float.valueOf(parcel.readFloat());
    }

    public static Object A0S(BKU bku, Map map) {
        Object obj = map.get(bku);
        if (obj != null) {
            return obj;
        }
        C20066BMj bMj = new C20066BMj(bku);
        map.put(bku, bMj);
        return bMj;
    }

    public static String A0V(String str, String str2) {
        return str.split(str2)[0];
    }

    public static SimpleDateFormat A0W(String str, Locale locale) {
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale, str), C31103Gfm.A02());
    }

    public static List A0X() {
        return C06750aI.A17(Float.valueOf(0.1435f), Float.valueOf(0.3779f), Float.valueOf(0.6071f), Float.valueOf(0.831f));
    }

    public static void A0e(Context context, View view, int i) {
        view.setBackground(context.getDrawable(i));
    }

    public static void A0f(Bitmap bitmap, ImageView imageView) {
        imageView.setImageBitmap(BlurUtil.blur(bitmap, 0.1f, 6));
    }

    public static void A0g(BaseBundle baseBundle, String str, String str2, String str3) {
        baseBundle.putString(str, str2);
        baseBundle.putString("prior_module_name", str3);
    }

    public static void A0h(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        spannableStringBuilder.setSpan(obj, i, spannableStringBuilder.length(), i2);
    }

    public static void A0k(View view, boolean z) {
        if (view.getParent() != null) {
            view.getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public static void A0l(TextView textView) {
        textView.getPaint().setFakeBoldText(true);
    }

    public static void A0m(Fragment fragment, Pair pair, Pair pair2) {
        fragment.setArguments(C98316Fa.A00(pair, pair2));
    }

    public static void A0n(M5J m5j, M5J m5j2, AnonymousClass0YY r2) {
        Object A08 = m5j.A08();
        C04220Ms.A0A(A08);
        m5j2.A0H(r2.invoke(A08));
    }

    public static void A0r(AnonymousClass0A3 r2, C11630kW r3) {
        r2.A0T("module_name", r3.getModuleName());
    }

    public static void A0s(AnonymousClass0A3 r2, C11630kW r3) {
        r2.A0T("source_of_action", r3.getModuleName());
    }

    public static void A0t(AnonymousClass0A3 r1, C15680ri r2, String str) {
        r1.A0T(str, r2.A04(str));
    }

    public static void A0z(AnonymousClass0A3 r2, String str, String str2, String str3) {
        r2.A0T(str, str2);
        r2.A0T("session_instance_id", str3);
        r2.A0T("feed_type", "trending");
    }

    public static void A11(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, boolean z) {
        uSLEBaseShape0S0000000.A0b(Boolean.valueOf(z));
    }

    public static void A17(MMo mMo, Object obj, String str, Object[] objArr, int i) {
        if (str.equals(obj)) {
            objArr[i] = C19276Atf.parseFromJson(mMo);
        }
    }

    public static void A19(Object obj, int i, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 15);
    }

    public static void A1B(AbstractCollection abstractCollection, AbstractMap abstractMap, Iterator it) {
        Object next = it.next();
        if (abstractMap.containsKey(next)) {
            abstractCollection.add(abstractMap.get(next));
        }
    }

    public static void A1C(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(C134397xc.A00((User) it.next()));
    }

    public static void A1D(AnonymousClass0YY r1, C86074wE r2) {
        Object value = r2.getValue();
        Object invoke = r1.invoke(value);
        if (!C04220Ms.A0I(invoke, value)) {
            r2.CrC(invoke);
        }
    }

    public static boolean A1Z(List list) {
        return Collections.unmodifiableList(list).isEmpty();
    }

    public static void A0j(View view, AnonymousClass0TJ r3, C10300i6 r4) {
        if (C63803iN.A0E(r3, r4, 36318200505307376L)) {
            C37235Jn1.A00(r4).A06(view, C171779zx.A0B);
        }
    }
}
