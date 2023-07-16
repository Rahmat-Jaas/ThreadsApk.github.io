package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Parcel;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.forker.Process;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape3S0200000_I2;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.redex.IDxCListenerShape204S0100000_3_I2;
import com.facebook.redex.IDxCListenerShape43S0300000_3_I2;
import com.facebook.redex.IDxObjectShape238S0100000_3_I2;
import com.facebook.redex.IDxObserverShape212S0100000_3_I2;
import com.facebook.redex.IDxPredicateShape353S0100000_3_I2;
import com.facebook.redex.KtSItemShape1S0100001_I2;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape113S0100000_3_I2;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.productfeed.ShoppingRankingLoggingInfo;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8;
import kotlin.jvm.internal.KtLambdaShape117S0100000_I2_97;
import kotlin.jvm.internal.KtLambdaShape118S0100000_I2_98;
import kotlin.jvm.internal.KtLambdaShape119S0100000_I2_99;
import kotlin.jvm.internal.KtLambdaShape120S0100000_I2_100;
import kotlin.jvm.internal.KtLambdaShape122S0100000_I2_102;
import kotlin.jvm.internal.KtLambdaShape123S0100000_I2_103;
import kotlin.jvm.internal.KtLambdaShape127S0100000_I2_107;
import kotlin.jvm.internal.KtLambdaShape129S0100000_I2_109;
import kotlin.jvm.internal.KtLambdaShape71S0100000_I2_51;
import kotlin.jvm.internal.KtLambdaShape97S0100000_I2_77;

/* renamed from: X.8sa  reason: invalid class name and case insensitive filesystem */
public final class C148928sa {
    public static long A04(int i) {
        return Double.doubleToRawLongBits((double) i);
    }

    public static Float A0L(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return Float.valueOf(parcel.readFloat());
        }
        return null;
    }

    public static Long A0W(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, B5H b5h, AnonymousClass94Q r5) {
        uSLEBaseShape0S0000000.A00.A7c(b5h, "advertiser_id");
        uSLEBaseShape0S0000000.A0S("catalog_id", (Long) null);
        if (r5 != null) {
            return Long.valueOf(r5.A00);
        }
        return null;
    }

    public static void A18(TextUtils.TruncateAt truncateAt, LJ2 lj2, boolean z) {
        lj2.A0T = z;
        lj2.A0R = z;
        lj2.A0M = truncateAt;
        lj2.A02 = null;
    }

    public static void A1K(LJ2 lj2, Integer num, int i) {
        lj2.A05 = 0;
        lj2.A0Q = num;
        lj2.A04 = 1.0f;
        lj2.A0S = false;
        lj2.A0E = 0;
        lj2.A0B = i;
    }

    public static int A02(long j, int i) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static RectF A05(View view) {
        RectF rectF = new RectF();
        C09860go.A0G(rectF, view);
        return rectF;
    }

    public static KtCSuperShape3S0200000_I2 A08(A0C a0c, Object obj) {
        return new KtCSuperShape3S0200000_I2(a0c, obj);
    }

    public static KtSItemShape1S0100001_I2 A09(A04 a04, float f) {
        return new KtSItemShape1S0100001_I2(a04, f);
    }

    public static User A0H(TreeJNI treeJNI) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) treeJNI.getTreeValueByHashCode(3599307, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            return new User(immutablePandoUserDict);
        }
        return null;
    }

    public static User A0I(TreeJNI treeJNI, C112176p7 r2, int i) {
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) treeJNI.getTreeValueByHashCode(i, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            return (User) r2.A00(new User(immutablePandoUserDict));
        }
        return null;
    }

    public static Float A0O(AnonymousClass5NL r1) {
        return r1.A07(120);
    }

    public static Float A0P(AnonymousClass5NL r1) {
        return r1.A07(121);
    }

    public static Float A0Q(AnonymousClass5NL r1) {
        return r1.A07(122);
    }

    public static Object A0Z(UserSession userSession, Class cls, int i) {
        return userSession.A01(cls, new IDxObjectShape238S0100000_3_I2(userSession, i));
    }

    public static Object A0a(Object obj, KtCImplShape10S0201000_I2_8 ktCImplShape10S0201000_I2_8) {
        ktCImplShape10S0201000_I2_8.A02 = obj;
        ktCImplShape10S0201000_I2_8.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape10S0201000_I2_8.A01;
    }

    public static String A0b() {
        return AnonymousClass3QJ.A00(21, 8, 71);
    }

    public static String A0h(BKU bku) {
        if (bku != null) {
            return bku.A0f.A4Y;
        }
        return null;
    }

    public static String A0i(Merchant merchant) {
        if (merchant != null) {
            return merchant.A06;
        }
        return null;
    }

    public static String A0j(Product product) {
        String str = product.A00.A0j;
        C04220Ms.A06(str);
        return str;
    }

    public static String A0k(Product product) {
        Merchant merchant = product.A00.A0C;
        if (merchant != null) {
            return merchant.A06;
        }
        return null;
    }

    public static StringBuilder A0p(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static C04530Oa A0s(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape120S0100000_I2_100(obj, i));
    }

    public static C04530Oa A0t(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape123S0100000_I2_103(obj, i));
    }

    public static C04530Oa A0u(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape71S0100000_I2_51(obj, i));
    }

    public static C04530Oa A0v(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape117S0100000_I2_97(obj, i));
    }

    public static C04530Oa A0w(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape97S0100000_I2_77(obj, i));
    }

    public static C04530Oa A0x(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape118S0100000_I2_98(obj, i));
    }

    public static C04530Oa A0y(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape129S0100000_I2_109(obj, i));
    }

    public static C04530Oa A0z(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape119S0100000_I2_99(obj, i));
    }

    public static C04530Oa A10(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape122S0100000_I2_102(obj, i));
    }

    public static C04530Oa A11(Object obj, int i) {
        return new AnonymousClass4UR(new KtLambdaShape127S0100000_I2_107(obj, i));
    }

    public static void A12(int i) {
        AnonymousClass01V.A0p.markerPoint(i, C06030Xj.A00(97));
        AnonymousClass01V.A0p.markerEnd(i, 3);
    }

    public static void A17(Typeface typeface, LJ2 lj2) {
        lj2.A0L = typeface;
        lj2.A0G = -7829368;
    }

    public static void A19(View view, Object obj, Object obj2, Object obj3, int i) {
        view.setOnClickListener(new IDxCListenerShape43S0300000_3_I2(i, obj, obj2, obj3));
    }

    public static void A1A(AnonymousClass066 r1, M5J m5j, Object obj, int i) {
        m5j.A0C(r1, new IDxObserverShape212S0100000_3_I2(obj, i));
    }

    public static void A1C(AnonymousClass0A3 r1, AnonymousClass0V3 r2) {
        r1.A0P(r2, "navigation_info");
    }

    public static void A1E(AnonymousClass0A3 r2, FiltersLoggingInfo filtersLoggingInfo, int i) {
        r2.A0V("filters", FiltersLoggingInfo.A00(new IDxPredicateShape353S0100000_3_I2(filtersLoggingInfo, i), filtersLoggingInfo));
    }

    public static void A1F(AnonymousClass0A3 r2, ShoppingRankingLoggingInfo shoppingRankingLoggingInfo) {
        if (shoppingRankingLoggingInfo != null) {
            r2.A0P(shoppingRankingLoggingInfo.A00(), "ranking_logging_info");
        }
    }

    public static void A1G(AnonymousClass0A3 r2, Boolean bool, String str, String str2) {
        r2.A0Q("can_add_to_bag", bool);
        r2.A0S("item_count", -1L);
        r2.A0T("variant_id", str);
        r2.A0T("visual_style", str2);
    }

    public static void A1H(AnonymousClass0A3 r1, String str) {
        r1.A0T("m_pk", str);
    }

    public static void A1I(AnonymousClass0A3 r1, String str) {
        r1.A0T("prior_module", str);
    }

    public static void A1L(MMp mMp, String str) {
        if (str != null) {
            mMp.A0d("media_type", str);
        }
    }

    public static void A1M(MMp mMp, String str) {
        if (str != null) {
            mMp.A0d("attribution", str);
        }
    }

    public static void A1N(MMp mMp, String str) {
        if (str != null) {
            mMp.A0d("display_type", str);
        }
    }

    public static void A1O(MMp mMp, String str) {
        if (str != null) {
            mMp.A0d("attribution_url", str);
        }
    }

    public static void A1P(MMp mMp, String str) {
        if (str != null) {
            mMp.A0d("custom_text_color", str);
        }
    }

    public static void A1S(C25764Drc drc, AnonymousClass4u2 r2, Object obj, int i) {
        drc.A0C = new IDxCListenerShape204S0100000_3_I2(obj, i);
        r2.A7Q(new C25435DlZ(drc));
    }

    public static void A1T(H1T h1t, UserSession userSession, Class cls) {
        h1t.A01 = new CY0(new C04710Ou(userSession), cls);
    }

    public static void A1W(C32165H8c h8c, Object obj, int i) {
        h8c.A00 = new IDxACallbackShape113S0100000_3_I2(obj, i);
    }

    public static void A1Y(BK1 bk1) {
        String str = C103066Xr.A00.A02.A00;
        if (str != null) {
            bk1.A4a = str;
        }
    }

    public static void A1Z(Object obj) {
        View view = (View) obj;
        C04220Ms.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.scrubber);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.widget.SeekBar");
        ((SeekBar) requireViewById).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
    }

    public static void A1a(Object obj, Object obj2) {
        C04220Ms.A0B(obj, 10);
        C04220Ms.A0B(obj2, 11);
    }

    public static float A00(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C04220Ms.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Number) animatedValue).floatValue();
    }

    public static int A01(int i, Object obj) {
        int A03 = C14030oh.A03(i);
        C04220Ms.A0B(obj, 1);
        return A03;
    }

    public static int A03(Parcel parcel, AbstractMap abstractMap, int i) {
        abstractMap.put(parcel.readString(), parcel.readString());
        return i + 1;
    }

    public static ViewStub A06(View view, int i) {
        return (ViewStub) view.requireViewById(i);
    }

    public static M5J A07(C62793ak r0, C84714tk r1, int i) {
        return C29110FiC.A00(AnonymousClass3J5.A00(r0).Aa1(), r1, i);
    }

    public static E2V A0A(Fragment fragment) {
        E2V A04 = E2V.A04(fragment.requireActivity());
        A04.getClass();
        return A04;
    }

    public static E2V A0B(Fragment fragment) {
        E2V A04 = E2V.A04(fragment.getActivity());
        A04.getClass();
        return A04;
    }

    public static StickerTraySurface A0C(AnonymousClass5NL r1, AnonymousClass0YY r2) {
        return (StickerTraySurface) r1.A09(r2, -1853231955);
    }

    public static C36409JTs A0D(Layout.Alignment alignment, TextPaint textPaint, TextView textView, int i) {
        return new C36409JTs(alignment, textPaint, textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier(), i, textView.getIncludeFontPadding());
    }

    public static BKU A0E(Iterator it) {
        return (BKU) it.next();
    }

    public static BKT A0F(BKU bku, UserSession userSession) {
        return C101936Te.A00(userSession).A00(bku);
    }

    public static AnonymousClass940 A0G(M5J m5j) {
        Object A08 = m5j.A08();
        C04220Ms.A0A(A08);
        return (AnonymousClass940) A08;
    }

    public static Double A0J(C11490kI r0, C11480kH r1) {
        return (Double) r1.A01(r0);
    }

    public static Double A0K(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    public static Float A0M(AnonymousClass5NL r1) {
        return r1.A07(-1221029593);
    }

    public static Float A0N(AnonymousClass5NL r1) {
        return r1.A07(-40300674);
    }

    public static Float A0R(AnonymousClass5NL r1) {
        return r1.A07(113126854);
    }

    public static Integer A0S(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(-1128035601);
    }

    public static Integer A0T(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(-753448353);
    }

    public static Integer A0U(TreeJNI treeJNI) {
        return treeJNI.getOptionalIntValueByHashCode(-389942488);
    }

    public static Integer A0V(Set set, int i) {
        Integer valueOf = Integer.valueOf(i);
        if (set.contains(valueOf)) {
            AnonymousClass01V.A0p.markerEnd(i, 111);
        }
        return valueOf;
    }

    public static Object A0X(Parcel parcel, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        parcel.writeString((String) entry.getKey());
        return entry.getValue();
    }

    public static Object A0Y(View view, Object obj) {
        view.setTag(obj);
        return view.getTag();
    }

    public static String A0c(AnonymousClass0A3 r2, KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I2, String str, String str2) {
        r2.A0T(str, str2);
        r2.A0T(TraceFieldType.ContentType, String.valueOf(ktCSuperShape0S0300000_I2.A00));
        return String.valueOf(ktCSuperShape0S0300000_I2.A02);
    }

    public static String A0d(TreeJNI treeJNI) {
        return treeJNI.getStringValueByHashCode(-966120017);
    }

    public static String A0e(TreeJNI treeJNI) {
        return treeJNI.getStringValueByHashCode(-309882753);
    }

    public static String A0f(TreeJNI treeJNI) {
        return treeJNI.getStringValueByHashCode(1615288471);
    }

    public static String A0g(MMp mMp, Object obj) {
        mMp.close();
        return obj.toString();
    }

    public static String A0l(UserSession userSession, String str) {
        return AnonymousClass00U.A0L(str, userSession.getUserId());
    }

    public static String A0m(Iterator it) {
        return ((Product) it.next()).A00.A0j;
    }

    public static String A0n(Iterator it) {
        Object key = ((C41882MfV) it.next()).getKey();
        C04220Ms.A06(key);
        return (String) key;
    }

    public static String A0o(List list, int i) {
        return ((User) list.get(i)).BK7();
    }

    public static Iterator A0q(List list) {
        return Collections.unmodifiableList(list).iterator();
    }

    public static List A0r(List list) {
        List unmodifiableList = Collections.unmodifiableList(list);
        C04220Ms.A06(unmodifiableList);
        return unmodifiableList;
    }

    public static void A13(Context context, View view, int i) {
        view.setContentDescription(context.getString(i));
    }

    public static void A14(Context context, MHA mha) {
        mha.A03 = MHA.A06(context);
    }

    public static void A15(SharedPreferences sharedPreferences, String str, int i) {
        sharedPreferences.edit().putInt(str, i + 1).apply();
    }

    public static void A16(Resources resources, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(resources.getString(i));
    }

    public static void A1B(AnonymousClass0A3 r2, long j) {
        r2.A0S("container_id", Long.valueOf(j));
    }

    public static void A1D(AnonymousClass0A3 r2, C11630kW r3) {
        r2.A0T("container_module", r3.getModuleName());
    }

    public static void A1J(AnonymousClass0V3 r1, C15680ri r2, String str) {
        r1.A0A(str, r2.A04(str));
    }

    public static void A1Q(MMp mMp, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        mMp.A0U((String) entry.getKey());
        if (entry.getValue() == null) {
            mMp.A0H();
        } else {
            mMp.A0O(((Number) entry.getValue()).longValue());
        }
    }

    public static void A1R(MMp mMp, Iterator it) {
        User user = (User) it.next();
        if (user != null) {
            C19527Axo.A05(mMp, user);
        }
    }

    public static void A1U(C34640IcN icN, C04530Oa r2) {
        icN.registerLifecycleListener((C19819BBt) r2.getValue());
    }

    public static void A1V(C34640IcN icN, C04530Oa r2) {
        icN.unregisterLifecycleListener((C19819BBt) r2.getValue());
    }

    public static void A1X(C39549KvX kvX, C37021Jix jix, C26372EBv eBv, String str) {
        jix.A01(kvX);
        eBv.A80(jix.A02(), str);
    }

    public static void A1b(Set set, int i) {
        Integer valueOf = Integer.valueOf(i);
        if (set.contains(valueOf)) {
            AnonymousClass01V.A0p.markerEnd(i, 2);
            set.remove(valueOf);
        }
    }
}
