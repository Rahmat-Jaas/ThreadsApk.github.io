package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0310000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4200000_I2;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxCListenerShape10S1200000_3_I2;
import com.facebook.redex.IDxCListenerShape219S0100000_3_I2;
import com.facebook.redex.IDxEListenerShape225S0100000_3_I2;
import com.facebook.redex.IDxFCollectorShape231S0100000_3_I2;
import com.google.common.collect.MapMakerInternalMap;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape37S0200000_3_I2;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.igtv.persistence.IGTVDatabase;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ShoppingModuleLoggingInfo;
import com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.service.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.user.model.User;
import java.io.File;
import java.lang.ref.Reference;
import java.text.NumberFormat;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape13S0200000_I2_8;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0101000_I2_11;
import kotlin.jvm.internal.KtLambdaShape125S0100000_I2_105;
import kotlin.jvm.internal.KtLambdaShape126S0100000_I2_106;
import kotlin.jvm.internal.KtLambdaShape128S0100000_I2_108;
import kotlin.jvm.internal.KtLambdaShape130S0100000_I2_110;
import kotlin.jvm.internal.KtLambdaShape131S0100000_I2_111;
import kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55;
import kotlin.jvm.internal.KtLambdaShape99S0100000_I2_79;

/* renamed from: X.8sb  reason: invalid class name and case insensitive filesystem */
public final class C148938sb {
    public static float A00(LJ2 lj2, Integer num) {
        lj2.A05 = 0;
        lj2.A0Q = num;
        lj2.A04 = 1.0f;
        lj2.A0S = false;
        lj2.A0E = 0;
        return 1.0f;
    }

    public static Context A07(AnonymousClass39P r1) {
        C04220Ms.A0B(r1, 0);
        Context context = r1.A00.A04;
        C04220Ms.A06(context);
        return context;
    }

    public static View A0A(Activity activity, ViewGroup viewGroup, C37024Jj0 jj0, int i) {
        return jj0.A01(activity, new ViewGroup.LayoutParams(-1, -2), viewGroup, i, true);
    }

    public static AnonymousClass3I0 A0J(int i) {
        return new AnonymousClass3I0(new Object[0], i);
    }

    public static ImageUrl A0K(Context context, UserSession userSession, String str) {
        if (str != null) {
            File A02 = C25780Drt.A02(context, userSession, str);
            if (A02 != null) {
                return AnonymousClass3WG.A01(A02, -1, -1);
            }
            C10450iM.A03("ClipsFirstFrame", "Unable to retrieve first frame file");
        }
        return null;
    }

    public static C50 A0M(Context context, int i, int i2) {
        return new C50(context, 0.5f, 0.6f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0.25f, i, i2, 0, 300, false, false, false, false, false);
    }

    public static C37003Jib A0N(KtCSuperShape0S0310000_I2 ktCSuperShape0S0310000_I2) {
        C04220Ms.A0B(ktCSuperShape0S0310000_I2, 0);
        C36857Jfo jfo = ((C37170Jlr) ktCSuperShape0S0310000_I2.A00).A01;
        C04220Ms.A0A(jfo);
        return jfo.A08;
    }

    public static Long A0d(C11490kI r2, C11480kH r3) {
        Number number = (Number) r3.A01(r2);
        if (number != null) {
            return Long.valueOf((long) number.doubleValue());
        }
        return null;
    }

    public static Object A0f(Object obj, KtSLambdaShape14S0101000_I2_11 ktSLambdaShape14S0101000_I2_11, C28172Ezi ezi, int i) {
        IDxFCollectorShape231S0100000_3_I2 iDxFCollectorShape231S0100000_3_I2 = new IDxFCollectorShape231S0100000_3_I2(obj, i);
        ktSLambdaShape14S0101000_I2_11.A00 = 1;
        return ezi.collect(iDxFCollectorShape231S0100000_3_I2, ktSLambdaShape14S0101000_I2_11);
    }

    public static C84714tk A0z(Object obj, C84714tk r3, int i) {
        return AnonymousClass3XM.A01(AnonymousClass7J0.A01(new KtSLambdaShape13S0200000_I2_8(obj, (C146958n9) null, i), r3));
    }

    public static void A11(SharedPreferences.Editor editor, SharedPreferences sharedPreferences, String str) {
        editor.putInt(str, sharedPreferences.getInt(str, 0) + 1).apply();
    }

    public static void A13(View view, Object obj, Object obj2, boolean z) {
        View[] viewArr = {view};
        if (obj == obj2) {
            C28758Faf.A00(viewArr, z);
        } else {
            C31161GhM.A04((C33538HpY) null, viewArr, false);
        }
    }

    public static void A18(AnonymousClass0A3 r4, float f, float f2) {
        r4.A0R("time_elapsed", Double.valueOf(((double) (f * f2)) / 1000.0d));
    }

    public static void A1I(AnonymousClass0V3 r2, String str, long j) {
        r2.A0A("chaining_session_id", (String) null);
        r2.A09("chaining_position", Long.valueOf(j));
        r2.A0A("m_pk", str);
    }

    public static void A1S(C37530JwN jwN) {
        jwN.A0D = false;
        jwN.A00 = 0;
        jwN.A04.A0D(C25757DrU.A00(10.0d, 20.0d));
        jwN.A05.A0D(C25757DrU.A00(8.0d, 12.0d));
    }

    public static long A06() {
        return TimeUnit.MILLISECONDS.toSeconds(new Date().getTime());
    }

    public static IDxEListenerShape225S0100000_3_I2 A0E(Object obj, int i) {
        return new IDxEListenerShape225S0100000_3_I2(obj, i);
    }

    public static AnonymousClass420 A0F() {
        return new AnonymousClass420();
    }

    public static C21554BwI A0G(TreeJNI treeJNI) {
        return (C21554BwI) treeJNI.getTreeValueByHashCode(278043675, AnonymousClass9hJ.class);
    }

    public static AnonymousClass9CZ A0H(Object obj) {
        KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2 = (KtCSuperShape0S0200000_I2) obj;
        C04220Ms.A0B(ktCSuperShape0S0200000_I2, 0);
        return (AnonymousClass9CZ) ktCSuperShape0S0200000_I2.A00;
    }

    public static BKU A0O(Object obj) {
        BKU bku = (BKU) obj;
        C04220Ms.A0B(bku, 0);
        return bku;
    }

    public static BKU A0P(Object obj) {
        KtCSuperShape0S0310000_I2 ktCSuperShape0S0310000_I2 = (KtCSuperShape0S0310000_I2) obj;
        C04220Ms.A0B(ktCSuperShape0S0310000_I2, 0);
        return ((C37170Jlr) ktCSuperShape0S0310000_I2.A00).A01();
    }

    public static ExtendedImageUrl A0R(ImageInfo imageInfo, int i) {
        return C122057Ju.A04(imageInfo, AnonymousClass006.A0C, Math.min(i, 1080));
    }

    public static BKT A0T(Object obj) {
        BKT bkt = (BKT) obj;
        C04220Ms.A0B(bkt, 0);
        return bkt;
    }

    public static IgRoomDatabase A0U(C26626EOo eOo, UserSession userSession) {
        Class<IGTVDatabase> cls = IGTVDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase != null) {
            return igRoomDatabase;
        }
        Context context = C10600ic.A00;
        C04220Ms.A06(context);
        C41012LuB A00 = C98506Fu.A00(context, cls, C120627Bu.A01(eOo, userSession));
        AnonymousClass6UW.A00(A00, 823, 824, false);
        eOo.A00(A00);
        IgRoomDatabase igRoomDatabase2 = (IgRoomDatabase) A00.A00();
        userSession.A04(cls, igRoomDatabase2);
        return igRoomDatabase2;
    }

    public static Float A0Z(Object[] objArr) {
        return objArr[21];
    }

    public static Number A0e(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, KtCSuperShape0S4200000_I2 ktCSuperShape0S4200000_I2) {
        uSLEBaseShape0S0000000.A0T("parent_m_pk", ktCSuperShape0S4200000_I2.A03);
        uSLEBaseShape0S0000000.A0T("chaining_session_id", ktCSuperShape0S4200000_I2.A02);
        return (Number) ktCSuperShape0S4200000_I2.A00;
    }

    public static String A0n(C157059Qr r0) {
        if (r0 != null) {
            return r0.A00();
        }
        return null;
    }

    public static String A0o(C157069Qs r0) {
        if (r0 != null) {
            return r0.A01();
        }
        return null;
    }

    public static String A0p(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public static ConcurrentMap A0r() {
        C36484JXm jXm = new C36484JXm();
        jXm.A04(MapMakerInternalMap.Strength.A02);
        jXm.A01();
        return jXm.A00();
    }

    public static C04530Oa A0s(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape125S0100000_I2_105(obj, i));
    }

    public static C04530Oa A0t(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape130S0100000_I2_110(obj, i));
    }

    public static C04530Oa A0u(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape128S0100000_I2_108(obj, i));
    }

    public static C04530Oa A0v(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape126S0100000_I2_106(obj, i));
    }

    public static C04530Oa A0w(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape131S0100000_I2_111(obj, i));
    }

    public static C04530Oa A0x(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape75S0100000_I2_55(obj, i));
    }

    public static C04530Oa A0y(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape99S0100000_I2_79(obj, i));
    }

    public static void A10(int i) {
        AnonymousClass01V.A0p.markerPoint(i, C06030Xj.A00(22));
        AnonymousClass01V.A0p.markerEnd(i, 4);
    }

    public static void A15(AnonymousClass0A0 r1, AnonymousClass0A3 r2, AnonymousClass0V3 r3, boolean z) {
        r3.A05(r1, "merchant_id");
        r3.A07("is_checkout_enabled", Boolean.valueOf(z));
        r2.A0P(r3, "product_info");
    }

    public static void A16(AnonymousClass0A3 r2) {
        r2.A0T("nav_chain", String.valueOf(C103066Xr.A00.A02.A00));
    }

    public static void A17(AnonymousClass0A3 r2) {
        r2.A0R("elapsed_time_since_last_item", Double.valueOf(-1.0d));
    }

    public static void A1C(AnonymousClass0A3 r2, ShoppingGuideLoggingInfo shoppingGuideLoggingInfo) {
        if (shoppingGuideLoggingInfo != null) {
            r2.A0P(shoppingGuideLoggingInfo.A00(), "guide_logging_info");
        }
    }

    public static void A1D(AnonymousClass0A3 r1, Long l) {
        r1.A0S("product_id", l);
    }

    public static void A1E(AnonymousClass0A3 r3, String str) {
        r3.A0T(C61933Wk.A00(21, 10, 47), str);
    }

    public static void A1F(AnonymousClass0A3 r1, String str) {
        r1.A0T("viewer_session_id", str);
    }

    public static void A1G(AnonymousClass0A3 r1, String str) {
        r1.A0T("shopping_session_id", str);
    }

    public static void A1J(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, FiltersLoggingInfo filtersLoggingInfo) {
        Merchant merchant = filtersLoggingInfo.A03;
        if (merchant != null) {
            uSLEBaseShape0S0000000.A0T("merchant_id", merchant.A06);
            uSLEBaseShape0S0000000.A0b(Boolean.valueOf(C18786AlM.A01(merchant)));
        }
    }

    public static void A1K(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, String str) {
        if (str != null && str.length() != 0) {
            uSLEBaseShape0S0000000.A0W(B5H.A01(str));
        }
    }

    public static void A1L(MMp mMp, String str) {
        if (str != null) {
            mMp.A0d(DialogModule.KEY_TITLE, str);
        }
    }

    public static void A1Q(H1T h1t, String str, String str2, String str3, String str4) {
        h1t.A0O("container_module", str);
        h1t.A0P("session_info", str2);
        h1t.A0P("seen_reels", str3);
        h1t.A0P("max_id", str4);
    }

    public static void A1R(C32165H8c h8c, Object obj, Object obj2, int i) {
        h8c.A00 = new IDxACallbackShape37S0200000_3_I2(i, obj, obj2);
        C31155GhB.A03(h8c);
    }

    public static void A1T(C25828Dsm dsm, Object obj, int i, int i2) {
        dsm.A0T(new IDxCListenerShape219S0100000_3_I2(obj, i), AnonymousClass25l.RED_BOLD, i2);
        dsm.A0O((DialogInterface.OnClickListener) null, 2131823054);
    }

    public static void A1U(ProductGroup productGroup, ProductVariantDimension productVariantDimension, Object obj, String str, List list) {
        if (str != null && !productVariantDimension.equals(obj)) {
            AnonymousClass7Ko.A0B(!obj.equals(productVariantDimension));
            list.retainAll(productGroup.A01(productVariantDimension, str));
        }
    }

    public static boolean A1Z(C10300i6 r3) {
        return C63803iN.A0E(AnonymousClass0TJ.A05, r3, 36312806026380479L);
    }

    public static int A01(Context context) {
        return context.getColor(R.color.canvas_bottom_sheet_description_text_color);
    }

    public static int A02(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.account_permission_section_vertical_padding);
    }

    public static int A03(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.abc_floating_window_z);
    }

    public static int A04(AnonymousClass0TJ r0, C10300i6 r1, long j) {
        return Long.valueOf(C63803iN.A03(r0, r1, j)).intValue();
    }

    public static int A05(IDxCListenerShape10S1200000_3_I2 iDxCListenerShape10S1200000_3_I2, int i) {
        int A05 = C14030oh.A05(i);
        Product A01 = ((ProductFeedItem) iDxCListenerShape10S1200000_3_I2.A01).A01();
        if (A01 != null) {
            ((C18) iDxCListenerShape10S1200000_3_I2.A00).CCi(A01, new C1532493d((C15680ri) null, (ShoppingModuleLoggingInfo) null, (ShoppingRankingLoggingInfo) null, false, 0, iDxCListenerShape10S1200000_3_I2.A02, (String) null, (String) null, (String) null));
        }
        return A05;
    }

    public static Resources A08(Context context) {
        Resources resources = context.getResources();
        C04220Ms.A06(resources);
        return resources;
    }

    public static RectF A09(Fragment fragment) {
        return new RectF(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) C09860go.A08(fragment.requireContext()), (float) C09860go.A07(fragment.requireContext()));
    }

    public static View A0B(View view, int i) {
        View requireViewById = view.requireViewById(i);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.view.ViewStub");
        return ((ViewStub) requireViewById).inflate();
    }

    public static ViewGroup A0C(ViewStub viewStub) {
        View inflate = viewStub.inflate();
        C04220Ms.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) inflate;
    }

    public static FrameLayout.LayoutParams A0D(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C04220Ms.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        return (FrameLayout.LayoutParams) layoutParams;
    }

    public static AnonymousClass9CZ A0I(Iterator it) {
        return (AnonymousClass9CZ) it.next();
    }

    public static ImageUrl A0L(Product product) {
        ImageInfo A02 = product.A02();
        if (A02 != null) {
            return C122057Ju.A01(A02, AnonymousClass006.A01);
        }
        return null;
    }

    public static BKU A0Q(List list, int i) {
        return (BKU) list.get(i);
    }

    public static Product A0S(Iterator it) {
        return (Product) it.next();
    }

    public static UserSession A0V(Fragment fragment) {
        fragment.requireActivity();
        return AnonymousClass0RG.A00().A01();
    }

    public static Boolean A0W(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public static Float A0X(AnonymousClass5NL r1) {
        return r1.A07(-557632268);
    }

    public static Float A0Y(AnonymousClass5NL r1) {
        return r1.A07(1106770299);
    }

    public static Integer A0a(Context context) {
        return Integer.valueOf(context.getColor(R.color.default_cta_dominate_color));
    }

    public static Integer A0b(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(-524107635);
    }

    public static Integer A0c(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(1457597201);
    }

    public static Object A0g(Iterator it) {
        return ((Reference) it.next()).get();
    }

    public static Object A0h(C04530Oa r0, int i) {
        return ((List) r0.getValue()).get(i);
    }

    public static String A0i(int i) {
        return NumberFormat.getInstance(Locale.getDefault()).format((long) i);
    }

    public static String A0j(Context context, int i, boolean z) {
        return C120737Cg.A01(context.getResources(), Integer.valueOf(i), z);
    }

    public static String A0k(TreeJNI treeJNI) {
        return treeJNI.getStringValueByHashCode(110371416);
    }

    public static String A0l(TreeJNI treeJNI) {
        return treeJNI.getStringValueByHashCode(1939875509);
    }

    public static String A0m(TreeJNI treeJNI) {
        return treeJNI.getStringValueByHashCode(1940351839);
    }

    public static String A0q(C04530Oa r0) {
        return ((User) r0.getValue()).BK7();
    }

    public static void A12(Resources resources, RecyclerView recyclerView, int i, int i2) {
        recyclerView.A0y(new AnonymousClass11W(i2, resources.getDimensionPixelSize(i)));
    }

    public static void A14(TextView textView, boolean z) {
        textView.getPaint().setFakeBoldText(z);
    }

    public static void A19(AnonymousClass0A3 r2, int i, int i2) {
        r2.A0T("position", C1183770r.A01(i, i2));
    }

    public static void A1A(AnonymousClass0A3 r2, Reel reel) {
        String id = reel.getId();
        C04220Ms.A06(id);
        r2.A0T("reel_id", id);
    }

    public static void A1B(AnonymousClass0A3 r2, Reel reel) {
        r2.A0T("netego_id", reel.A0E());
        r2.A0T("tracking_token", reel.A0G());
    }

    public static void A1H(AnonymousClass0A3 r2, String str, String str2, long j) {
        r2.A0S("profile_owner_id", Long.valueOf(j));
        r2.A0T("partner_name", str);
        r2.A0T("url", str2);
    }

    public static void A1M(MMp mMp, Iterator it) {
        Number number = (Number) it.next();
        if (number != null) {
            mMp.A0N(number.intValue());
        }
    }

    public static void A1N(MMp mMp, Iterator it) {
        Number number = (Number) it.next();
        if (number != null) {
            mMp.A0M(number.floatValue());
        }
    }

    public static void A1O(MMo mMo, AbstractCollection abstractCollection) {
        AnonymousClass422 parseFromJson = C59023Je.parseFromJson(mMo);
        if (parseFromJson != null) {
            abstractCollection.add(parseFromJson);
        }
    }

    public static void A1P(H1T h1t, String str, String str2) {
        h1t.A0J(str);
        h1t.A0B(C21835C2k.class, C18633Aim.class);
        h1t.A0P("max_id", str2);
    }

    public static void A1V(Object obj, int i, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 12);
    }

    public static void A1W(AbstractMap abstractMap, Map.Entry entry) {
        Object key = entry.getKey();
        C04220Ms.A06(key);
        Integer valueOf = Integer.valueOf(Integer.parseInt((String) key));
        Object value = entry.getValue();
        C04220Ms.A06(value);
        abstractMap.put(valueOf, Integer.valueOf(Integer.parseInt((String) value)));
    }

    public static void A1X(C04530Oa r0) {
        ((C41030Luu) r0.getValue()).notifyDataSetChanged();
    }

    public static boolean A1Y(AnonymousClass0TJ r0, C10300i6 r1, long j, boolean z) {
        if (C63803iN.A0E(r0, r1, j)) {
            return true;
        }
        return z;
    }

    public static boolean A1a(User user, Object obj) {
        return C04220Ms.A0I(obj, user.getId());
    }

    public static boolean A1b(C04530Oa r0) {
        Boolean bool = (Boolean) r0.getValue();
        C04220Ms.A06(bool);
        return bool.booleanValue();
    }
}
