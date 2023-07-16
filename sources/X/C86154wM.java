package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxCListenerShape218S0100000_2_I2;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.facebookpay.msc.listsection.viewmodel.ListSectionViewModel;
import com.instagram.api.schemas.AdproObjectiveTypesEnum;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2;
import kotlin.coroutines.jvm.internal.KtCImplShape8S0201000_I2_6;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0101000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0101000_I2_2;
import kotlin.jvm.internal.KtLambdaShape10S0300000_I2;
import kotlin.jvm.internal.KtLambdaShape146S0100000_I2_1;
import kotlin.jvm.internal.KtLambdaShape147S0100000_I2_2;
import kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3;
import kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1;
import kotlin.jvm.internal.KtLambdaShape20S0100000_I2;
import kotlin.jvm.internal.KtLambdaShape21S0100000_I2_1;
import kotlin.jvm.internal.KtLambdaShape29S0100000_I2_9;
import kotlin.jvm.internal.KtLambdaShape37S0100000_I2_17;
import kotlin.jvm.internal.KtLambdaShape38S0100000_I2_18;
import kotlin.jvm.internal.KtLambdaShape5S0300000_I2;
import org.json.JSONArray;

/* renamed from: X.4wM  reason: invalid class name and case insensitive filesystem */
public final class C86154wM {
    public static Integer A0X() {
        return 2;
    }

    public static Object A0Y(MMo mMo) {
        if (mMo.A0f() != C40318LcR.VALUE_NULL) {
            return mMo.A0p();
        }
        return null;
    }

    public static Object A0c(Object obj, KtLambdaShape146S0100000_I2_1 ktLambdaShape146S0100000_I2_1) {
        C04220Ms.A0B(obj, 0);
        return ktLambdaShape146S0100000_I2_1.A00;
    }

    public static Object A0d(Object obj, KtLambdaShape148S0100000_I2_3 ktLambdaShape148S0100000_I2_3) {
        C04220Ms.A0B(obj, 0);
        return ktLambdaShape148S0100000_I2_3.A00;
    }

    public static Method A0p(Object obj, Object obj2, Method method) {
        return (Method) method.invoke(obj2, new Object[]{obj, new Class[0]});
    }

    public static void A1D(BaseBundle baseBundle, List list) {
        baseBundle.putStringArray("PTT_UTIL_CAP_NAMES", (String[]) list.toArray(new String[0]));
    }

    public static void A1F(IBinder iBinder, Parcel parcel, int i) {
        iBinder.transact(i, parcel, (Parcel) null, 1);
    }

    public static boolean A1Y(int i, Object obj, Object obj2) {
        C04220Ms.A0B(obj, 0);
        C04220Ms.A0B(obj2, i);
        return false;
    }

    public static float A00(int i, float f, float f2, float f3) {
        if (i != 0) {
            return (f * f2) / 100.0f;
        }
        return f3;
    }

    public static int A02(int i, int i2) {
        return i2 | (i & 112) | (i & 896);
    }

    public static int A03(int i, int[] iArr) {
        return iArr[(i * 5) + 3];
    }

    public static int A04(long j) {
        return ((int) (j ^ (j >>> 32))) * 31;
    }

    public static long A08(TimeUnit timeUnit) {
        return timeUnit.toMillis(1);
    }

    public static Context A0A(Object obj) {
        Context context = (Context) obj;
        C04220Ms.A0B(context, 0);
        return context;
    }

    public static Typeface A0C(Context context) {
        return C09250f7.A05.A00(context).A03(C09340fG.A0k);
    }

    public static SparseArray A0D() {
        return new SparseArray();
    }

    public static LayoutInflater A0E(Context context, LayoutInflater layoutInflater, int i) {
        return layoutInflater.cloneInContext(new ContextThemeWrapper(context, i));
    }

    public static View A0F(KtLambdaShape29S0100000_I2_9 ktLambdaShape29S0100000_I2_9) {
        return ((Fragment) ktLambdaShape29S0100000_I2_9.A00).requireView();
    }

    public static C115606vY A0G(long j) {
        return GQI.A0K[(int) (j & 63)];
    }

    public static GQLCallInputCInputShape1S0000000 A0L() {
        return new GQLCallInputCInputShape1S0000000();
    }

    public static TreeJNI A0M(TreeJNI treeJNI, Class cls) {
        return treeJNI.getTreeValue("error", cls);
    }

    public static IDxCListenerShape218S0100000_2_I2 A0N(Object obj, int i) {
        return new IDxCListenerShape218S0100000_2_I2(obj, i);
    }

    public static IDxFlowShape93S0200000_1_I2 A0O(AnonymousClass0YP r2, C84714tk r3) {
        return new IDxFlowShape93S0200000_1_I2(r2, r3, 34);
    }

    public static AdproObjectiveTypesEnum A0P(String str, int i) {
        return new AdproObjectiveTypesEnum(str, i, str);
    }

    public static File A0U(File file, String str) {
        return new File(file, str);
    }

    public static IOException A0V(String str) {
        return new IOException(str);
    }

    public static Float A0W(float f) {
        return new Float(f);
    }

    public static RuntimeException A0h(String str, Throwable th) {
        return new RuntimeException(str, th);
    }

    public static String A0j(TreeJNI treeJNI) {
        return treeJNI.getStringValue("label");
    }

    public static String A0k(TreeJNI treeJNI) {
        return treeJNI.getStringValue("formatted_amount");
    }

    public static String A0m(BKU bku) {
        String str = bku.A0f.A4Y;
        C04220Ms.A06(str);
        return str;
    }

    public static Iterator A0q(Object obj) {
        return ((Iterable) obj).iterator();
    }

    public static NoSuchElementException A0u() {
        return new NoSuchElementException();
    }

    public static C04530Oa A0v(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape38S0100000_I2_18(obj, i));
    }

    public static KtCImplShape8S0201000_I2_6 A0w(Object obj, C146958n9 r3, int i) {
        return new KtCImplShape8S0201000_I2_6(obj, r3, i, 42);
    }

    public static KtSLambdaShape5S0101000_I2_2 A0x(Object obj, C146958n9 r2, int i) {
        return new KtSLambdaShape5S0101000_I2_2(obj, r2, i);
    }

    public static KtLambdaShape10S0300000_I2 A0y(Object obj, Object obj2, Object obj3, int i) {
        return new KtLambdaShape10S0300000_I2(i, obj, obj2, obj3);
    }

    public static KtLambdaShape146S0100000_I2_1 A0z(Object obj, int i) {
        return new KtLambdaShape146S0100000_I2_1(obj, i);
    }

    public static KtLambdaShape147S0100000_I2_2 A10(Object obj, int i) {
        return new KtLambdaShape147S0100000_I2_2(obj, i);
    }

    public static KtLambdaShape17S0200000_I2_1 A11(Object obj, Object obj2, int i) {
        return new KtLambdaShape17S0200000_I2_1(i, obj, obj2);
    }

    public static KtLambdaShape20S0100000_I2 A12(Object obj, int i) {
        return new KtLambdaShape20S0100000_I2(obj, i);
    }

    public static KtLambdaShape21S0100000_I2_1 A13(Object obj, int i) {
        return new KtLambdaShape21S0100000_I2_1(obj, i);
    }

    public static KtLambdaShape37S0100000_I2_17 A14(Object obj, int i) {
        return new KtLambdaShape37S0100000_I2_17(obj, i);
    }

    public static KtLambdaShape5S0300000_I2 A15(Object obj, Object obj2, Object obj3, int i) {
        return new KtLambdaShape5S0300000_I2(i, obj, obj2, obj3);
    }

    public static void A1B(PorterDuff.Mode mode, Drawable drawable, int i) {
        drawable.setColorFilter(new PorterDuffColorFilter(i, mode));
    }

    public static void A1E(Bundle bundle, Parcelable parcelable) {
        bundle.putParcelable("logger_data", parcelable);
    }

    public static void A1G(View.OnClickListener onClickListener, Integer num, List list, int i, boolean z) {
        list.add(new EK0(onClickListener, num, i, z));
    }

    public static void A1H(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public static void A1K(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, CharSequence charSequence) {
        accessibilityNodeInfoCompat.A08(new C008103m(16, charSequence));
    }

    public static void A1L(MAm mAm, String str, int i) {
        if (str == null) {
            mAm.AAb(i);
        } else {
            mAm.AAi(i, str);
        }
    }

    public static void A1M(GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000) {
        gQLCallInputCInputShape1S0000000.A0D("FBPAY_HUB", "payment_type");
    }

    public static void A1O(C2W c2w, C19457Awe awe) {
        c2w.Cq7(new C19505AxS(awe));
    }

    public static void A1S(Object obj, Object obj2, Object obj3, Object obj4, KtCImplShape0S0601000_I2 ktCImplShape0S0601000_I2) {
        ktCImplShape0S0601000_I2.A01 = obj;
        ktCImplShape0S0601000_I2.A02 = obj2;
        ktCImplShape0S0601000_I2.A03 = obj3;
        ktCImplShape0S0601000_I2.A04 = obj4;
    }

    public static void A1X(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public static boolean A1Z(int i, boolean z) {
        if (i != 0) {
            return true;
        }
        return z;
    }

    public static String[] A1b() {
        return new String[]{"client_mutation_id"};
    }

    public static float A01(Context context, int i) {
        return context.getResources().getDimension(i);
    }

    public static int A05(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return Arrays.hashCode(new Object[]{obj, obj2, obj3, obj4, obj5});
    }

    public static int A06(String str, int i) {
        return i + str.length();
    }

    public static int A07(AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        abstractCollection.add(jSONArray.getString(i));
        return i + 1;
    }

    public static Context A09(Context context) {
        Context applicationContext = context.getApplicationContext();
        C04220Ms.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return applicationContext;
    }

    public static SharedPreferences A0B(C04530Oa r0) {
        return (SharedPreferences) r0.getValue();
    }

    public static AnonymousClass7HE A0H(List list, int i) {
        return (AnonymousClass7HE) list.get(i);
    }

    public static AnonymousClass7HD A0I(C81784oM r0) {
        return (AnonymousClass7HD) r0.getValue();
    }

    public static C123917Zx A0J(Iterator it) {
        return (C123917Zx) it.next();
    }

    public static C147128nR A0K(C04530Oa r0) {
        return (C147128nR) r0.getValue();
    }

    public static C127397h3 A0Q(List list, int i) {
        return (C127397h3) list.get(i);
    }

    public static C63893iY A0R(AnonymousClass3VO r0, Object obj, int i) {
        r0.A02(obj, i);
        return r0.A01();
    }

    public static C63893iY A0S(AnonymousClass3VO r0, Object obj, int i) {
        r0.A03(obj, i);
        return r0.A01();
    }

    public static C19457Awe A0T(C2W c2w) {
        return new C19457Awe(c2w.BDY());
    }

    public static Object A0Z(Object obj, Object obj2, Method method) {
        return method.invoke(obj2, new Object[]{obj});
    }

    public static Object A0a(Object obj, KtSLambdaShape4S0101000_I2_1 ktSLambdaShape4S0101000_I2_1) {
        AnonymousClass0OU.A00(obj);
        return ktSLambdaShape4S0101000_I2_1.A01;
    }

    public static Object A0b(Object obj, KtSLambdaShape5S0101000_I2_2 ktSLambdaShape5S0101000_I2_2) {
        AnonymousClass0OU.A00(obj);
        return ktSLambdaShape5S0101000_I2_2.A01;
    }

    public static Object A0e(AtomicReference atomicReference) {
        Object obj = atomicReference.get();
        C04220Ms.A06(obj);
        return obj;
    }

    public static Object A0f(AnonymousClass0YY r1, int i) {
        return r1.invoke(Integer.valueOf(i));
    }

    public static Object A0g(AnonymousClass0YP r2, float f, float f2) {
        return r2.invoke(Float.valueOf(f), Float.valueOf(f2));
    }

    public static String A0i(TreeJNI treeJNI) {
        return treeJNI.getStringValueByHashCode(116079);
    }

    public static String A0l(C63893iY r0, int i) {
        return (String) r0.A0H(i);
    }

    public static String A0n(StringBuilder sb, long j) {
        sb.append(j);
        return sb.toString();
    }

    public static String A0o(Locale locale, String str, Object[] objArr) {
        String format = String.format(locale, str, objArr);
        C04220Ms.A06(format);
        return format;
    }

    public static Iterator A0r(AbstractMap abstractMap) {
        return abstractMap.keySet().iterator();
    }

    public static Iterator A0s(Map map) {
        return map.keySet().iterator();
    }

    public static Map A0t(C81784oM r0) {
        return (Map) r0.getValue();
    }

    public static AnonymousClass0FL A16(Class cls) {
        return AnonymousClass0I3.A00(C03970Ls.A00(cls));
    }

    public static C83224qz A17(C62793ak r0, Object obj, C86074wE r2) {
        r2.CrC(obj);
        return AnonymousClass3J5.A00(r0);
    }

    public static void A18(long j, StringBuilder sb) {
        sb.append(AnonymousClass7KE.A06(j));
    }

    public static void A19(Context context, F10 f10, int i) {
        f10.A0H(context.getColor(i));
    }

    public static void A1A(Context context, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(context.getString(i));
    }

    public static void A1C(BaseBundle baseBundle, String str) {
        baseBundle.putStringArray("PTT_UTIL_CAP_NAMES", new String[]{str});
    }

    public static void A1I(View view, int i) {
        ((ViewStub) view.requireViewById(i)).inflate();
    }

    public static void A1J(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void A1N(ListSectionViewModel listSectionViewModel, boolean z) {
        listSectionViewModel.A00 = Boolean.valueOf(z);
    }

    public static void A1P(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 3;
    }

    public static void A1Q(Enum enumR, int[] iArr, int i) {
        iArr[enumR.ordinal()] = i;
    }

    public static void A1R(Object obj, int i, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 11);
    }

    public static void A1T(Object obj, Map map, int i) {
        map.put(obj, Integer.valueOf(i));
    }

    public static void A1U(Object obj, Map map, boolean z) {
        map.put(obj, Boolean.valueOf(z));
    }

    public static void A1V(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(": ");
    }

    public static void A1W(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(10);
    }

    public static boolean A1a(AnonymousClass68G r0, Object obj, AnonymousClass8s2 r2, C86074wE r3, boolean z) {
        return r3.ADi(obj, KtCSuperShape0S0210000_I2.A00(r0, r2, z));
    }
}
