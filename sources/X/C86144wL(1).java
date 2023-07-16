package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebSettings;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import com.facebook.forker.Process;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxCListenerShape42S0300000_2_I2;
import com.facebook.redex.IDxComparatorShape303S0100000_2_I2;
import com.facebook.redex.IDxFCollectorShape230S0100000_2_I2;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import com.facebook.redex.IDxObjectShape120S0200000_2_I2;
import com.facebook.redex.PCreatorCreatorShape0S0100000_I2;
import com.facebook.redex.PCreatorCreatorShape2S0000000_I2_2;
import com.facebookpay.msc.feselector.viewmodel.ListSectionWithFeSelectorViewModel;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.graphql.instagramschemagraphservices.IGFBPayAddCreditCardResponseImpl;
import com.instagram.graphql.instagramschemagraphservices.IGFBPayUpdateCreditCardResponseImpl;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.KtCImplShape0S01303000_I2;
import kotlin.coroutines.jvm.internal.KtCImplShape0S0301100_I2;
import kotlin.coroutines.jvm.internal.KtCImplShape0S0311000_I2;
import kotlin.jvm.internal.KtLambdaShape145S0100000_I2;
import kotlin.jvm.internal.KtLambdaShape28S0100000_I2_8;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: X.4wL  reason: invalid class name and case insensitive filesystem */
public final class C86144wL {
    public static float A00(float f, float f2, float f3, float f4) {
        return (f * f2) + (f3 * f4);
    }

    public static int A04(int i, int i2, int i3, int i4) {
        return i | i2 | (i3 & i4);
    }

    public static int A09(Object obj) {
        C04220Ms.A0B(obj, 0);
        return 3;
    }

    public static PCreatorCreatorShape0S0100000_I2 A0P(Class cls) {
        return new PCreatorCreatorShape0S0100000_I2(cls, 2);
    }

    public static Integer A0b() {
        return -1;
    }

    public static String A0p(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static AtomicInteger A11() {
        return new AtomicInteger(0);
    }

    public static C148848sH A13(C148848sH r1, C142578fF r2) {
        C04220Ms.A0B(r2, 1);
        if (!C04220Ms.A0I(r1.Aqq(), r2)) {
            return null;
        }
        return r1;
    }

    public static C27952Ew2 A14(C148848sH r1, C142578fF r2) {
        C04220Ms.A0B(r2, 1);
        return C25235DiG.A00(r1, r2);
    }

    public static C27952Ew2 A15(C148848sH r1, C27952Ew2 ew2) {
        C04220Ms.A0B(ew2, 1);
        return C25235DiG.A01(r1, ew2);
    }

    public static void A19(Drawable drawable, View view, int i) {
        C04220Ms.A0B(drawable, 1);
        drawable.setTint(i);
        view.setBackground(drawable);
    }

    public static void A1D(WebSettings webSettings) {
        webSettings.setAllowFileAccess(false);
        webSettings.setDomStorageEnabled(false);
        webSettings.setDatabaseEnabled(false);
        webSettings.setSaveFormData(false);
        webSettings.setSupportZoom(false);
        webSettings.setUseWideViewPort(true);
    }

    public static void A1H(GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000, String str, String str2) {
        gQLCallInputCInputShape0S0000000.A0F(str, str2);
        gQLCallInputCInputShape0S0000000.A0D("skip_validation", true);
    }

    public static void A1L(AnonymousClass3VO r1, float f, float f2, int i) {
        r1.A02(Float.valueOf(f / f2), i);
    }

    public static void A1S(String str, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        pluginGeneratedSerialDescriptor.A00(str, true);
        pluginGeneratedSerialDescriptor.A00("timeOutInSeconds", true);
        pluginGeneratedSerialDescriptor.A00("refreshIntervalInSeconds", true);
        pluginGeneratedSerialDescriptor.A00("scheduleIntervalInMinutes", true);
    }

    public static boolean A1Z(Collection collection) {
        C04220Ms.A0B(collection, 0);
        return collection.isEmpty();
    }

    public static Object[] A1a(Object obj, Object obj2) {
        return Arrays.copyOf(new Object[]{obj, obj2}, 2);
    }

    public static int A05(int i, int[] iArr) {
        return iArr[i + 1] & 67108863;
    }

    public static int A08(Object obj) {
        return ((List) obj).size();
    }

    public static long A0D(String str) {
        if (str != null) {
            return Long.parseLong(str);
        }
        return 0;
    }

    public static Activity A0E(Object obj) {
        Context context = (Context) obj;
        C04220Ms.A0C(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        C04220Ms.A0B(activity, 0);
        return activity;
    }

    public static Paint A0F() {
        return new Paint();
    }

    public static Path A0G() {
        return new Path();
    }

    public static C147798pw A0J(Object obj) {
        C147798pw r1 = (C147798pw) obj;
        C04220Ms.A0B(r1, 0);
        return r1;
    }

    public static AnonymousClass75O A0K(Object obj) {
        AnonymousClass75O r1 = (AnonymousClass75O) obj;
        C04220Ms.A0B(r1, 0);
        return r1;
    }

    public static TreeJNI A0N(ListSectionWithFeSelectorViewModel listSectionWithFeSelectorViewModel) {
        return (TreeJNI) listSectionWithFeSelectorViewModel.A03.A08();
    }

    public static IDxFlowShape94S0200000_2_I2 A0O(AnonymousClass0YP r2, C84714tk r3) {
        return new IDxFlowShape94S0200000_2_I2(r2, r3, 29);
    }

    public static PCreatorCreatorShape2S0000000_I2_2 A0Q(int i) {
        return new PCreatorCreatorShape2S0000000_I2_2(i);
    }

    public static BKU A0W(C37415JrZ jrZ) {
        return C37415JrZ.A03(jrZ.A0O);
    }

    public static IGFBPayAddCreditCardResponseImpl.AddCreditCard.CreditCard A0X(IGFBPayAddCreditCardResponseImpl iGFBPayAddCreditCardResponseImpl) {
        return (IGFBPayAddCreditCardResponseImpl.AddCreditCard.CreditCard) ((IGFBPayAddCreditCardResponseImpl.AddCreditCard) iGFBPayAddCreditCardResponseImpl.getTreeValue("add_credit_card(data:$input)", IGFBPayAddCreditCardResponseImpl.AddCreditCard.class)).getTreeValue("credit_card", IGFBPayAddCreditCardResponseImpl.AddCreditCard.CreditCard.class);
    }

    public static BufferedReader A0Y(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream));
    }

    public static File A0Z(String str) {
        return new File(str);
    }

    public static Class A0a(Object obj) {
        if (obj != null) {
            return obj.getClass();
        }
        return null;
    }

    public static Object A0d() {
        return new Object();
    }

    public static Object A0f(AnonymousClass7W3 r1, Object obj, Object obj2) {
        if (obj != obj2) {
            return obj;
        }
        AnonymousClass7Us r0 = new AnonymousClass7Us();
        r1.A14(r0);
        return r0;
    }

    public static Object A0g(AnonymousClass7W3 r1, Object obj, Object obj2, Object obj3) {
        if (obj != obj2) {
            return obj3;
        }
        AnonymousClass75b r0 = new AnonymousClass75b();
        r1.A14(r0);
        return r0;
    }

    public static Object A0i(C10300i6 r1, Class cls, Object obj, int i) {
        return r1.A01(cls, new IDxObjectShape120S0200000_2_I2(i, obj, r1));
    }

    public static Object A0j(Object obj) {
        return ((AnonymousClass0ZU) obj).invoke();
    }

    public static Object A0k(Object obj, C146958n9 r2, C84714tk r3, int i) {
        return r3.collect(new IDxFCollectorShape230S0100000_2_I2(obj, i), r2);
    }

    public static Object A0l(Object obj, KtCImplShape0S0301100_I2 ktCImplShape0S0301100_I2) {
        ktCImplShape0S0301100_I2.A03 = obj;
        ktCImplShape0S0301100_I2.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape0S0301100_I2.A04;
    }

    public static Object A0m(Object obj, KtCImplShape0S0311000_I2 ktCImplShape0S0311000_I2) {
        ktCImplShape0S0311000_I2.A02 = obj;
        ktCImplShape0S0311000_I2.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape0S0311000_I2.A03;
    }

    public static String A0n() {
        return C61973Wo.A01(174, 10, 9);
    }

    public static String A0o() {
        return AnonymousClass3QI.A00(9, 10, 55);
    }

    public static String A0q(TreeJNI treeJNI) {
        return treeJNI.getStringValue("text");
    }

    public static String A0r(TreeJNI treeJNI) {
        return treeJNI.getStringValue("financial_id");
    }

    public static WeakReference A0w(Object obj) {
        return new WeakReference(obj);
    }

    public static Iterator A0y(Object obj) {
        return ((List) obj).iterator();
    }

    public static C04530Oa A12(Object obj, int i) {
        return C62373Zc.A03(new KtLambdaShape28S0100000_I2_8(obj, i));
    }

    public static KtLambdaShape145S0100000_I2 A16(Object obj, int i) {
        return new KtLambdaShape145S0100000_I2(obj, i);
    }

    public static AnonymousClass0MJ A17() {
        return new AnonymousClass0MJ();
    }

    public static void A18(Paint paint, PorterDuff.Mode mode) {
        paint.setXfermode(new PorterDuffXfermode(mode));
    }

    public static void A1B(Parcel parcel, int[] iArr, int i) {
        if (iArr != null) {
            int A01 = C122167Ky.A01(parcel, i);
            parcel.writeIntArray(iArr);
            C122167Ky.A05(parcel, A01);
        }
    }

    public static void A1C(View view, Object obj, Object obj2, Object obj3, int i) {
        view.setOnClickListener(new IDxCListenerShape42S0300000_2_I2(i, obj, obj2, obj3));
    }

    public static void A1F(C28170Ezf ezf, String str, int i) {
        if (str == null) {
            ezf.AAb(i);
        } else {
            ezf.AAi(i, str);
        }
    }

    public static void A1G(AnonymousClass0A3 r2, Boolean bool, boolean z) {
        r2.A0Q("requires_backgrounded", bool);
        r2.A0Q("is_backgrounded", Boolean.valueOf(z));
    }

    public static void A1I(GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000, String str, String str2) {
        gQLCallInputCInputShape1S0000000.A0D(str, "product_id");
        gQLCallInputCInputShape1S0000000.A0D(str2, "client_receiver_id");
    }

    public static void A1M(Object obj) {
        ((Number) obj).intValue();
    }

    public static void A1N(Object obj) {
        C122127Kl.A02.A01(obj);
    }

    public static void A1O(Object obj, Object obj2, Object obj3, Object obj4, KtCImplShape0S01303000_I2 ktCImplShape0S01303000_I2) {
        ktCImplShape0S01303000_I2.A09 = obj;
        ktCImplShape0S01303000_I2.A0A = obj2;
        ktCImplShape0S01303000_I2.A0B = obj3;
        ktCImplShape0S01303000_I2.A0C = obj4;
    }

    public static void A1Q(Object obj, List list, int i) {
        C001300p.A0y(list, new IDxComparatorShape303S0100000_2_I2(obj, i));
    }

    public static void A1R(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    public static void A1T(StringBuilder sb) {
        sb.append(", ");
    }

    public static boolean A1Y(String str) {
        return str.endsWith("%");
    }

    public static float A01(long j, long j2) {
        return AnonymousClass7KC.A01(j) + AnonymousClass7JK.A02(j2);
    }

    public static int A02(int i) {
        return Integer.valueOf(i).intValue();
    }

    public static int A03(int i, float f) {
        return i + Float.floatToIntBits(f);
    }

    public static int A06(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
    }

    public static int A07(Context context, int i) {
        return Math.round(C09860go.A03(context, i));
    }

    public static int A0A(Object obj) {
        C04220Ms.A06(obj);
        return UUID.randomUUID().hashCode();
    }

    public static int A0B(String str, int i) {
        return str.hashCode() + i;
    }

    public static int A0C(List list, int i) {
        return list.size() - i;
    }

    public static RemoteException A0H(Object obj) {
        return new RemoteException(String.valueOf(obj).concat(" : Binder has died."));
    }

    public static View A0I(C04530Oa r0) {
        return (View) r0.getValue();
    }

    public static AccessibilityNodeInfoCompat A0L() {
        return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
    }

    public static TreeJNI A0M(TreeJNI treeJNI, Class cls, Class cls2, String str) {
        return treeJNI.getTreeValue(str, cls).reinterpret(cls2);
    }

    public static AnonymousClass7j5 A0R(C04530Oa r0) {
        return (AnonymousClass7j5) r0.getValue();
    }

    public static C40318LcR A0S(MMo mMo) {
        mMo.A0g();
        return mMo.A0f();
    }

    public static AnonymousClass5Im A0T(C86094wG r0) {
        return (AnonymousClass5Im) ((KtCSuperShape0S0130000_I2) r0.getValue()).A00;
    }

    public static C25039DeW A0U() {
        return C62883b4.A01().A00();
    }

    public static C127397h3 A0V(Iterator it) {
        return (C127397h3) it.next();
    }

    public static Long A0c(Number number) {
        return Long.valueOf((long) number.intValue());
    }

    public static Object A0e(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C04220Ms.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        return animatedValue;
    }

    public static Object A0h(Fragment fragment) {
        return fragment.requireArguments().get("ECP_FORM_NAV_BAR_STYLE");
    }

    public static String A0s(TreeJNI treeJNI, String str) {
        String stringValue = treeJNI.getStringValue(str);
        if (stringValue == null) {
            return "";
        }
        return stringValue;
    }

    public static String A0t(IGFBPayUpdateCreditCardResponseImpl iGFBPayUpdateCreditCardResponseImpl, Object obj, String str, String str2) {
        AnonymousClass3ZT.A02(obj, str);
        return ((IGFBPayUpdateCreditCardResponseImpl.UpdateCreditCard.CreditCard) iGFBPayUpdateCreditCardResponseImpl.A00().getTreeValue("credit_card", IGFBPayUpdateCreditCardResponseImpl.UpdateCreditCard.CreditCard.class)).getStringValue(str2);
    }

    public static String A0u(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static String A0v(StringBuilder sb, int i) {
        sb.append(i);
        return sb.toString();
    }

    public static Iterator A0x(BaseBundle baseBundle) {
        return baseBundle.keySet().iterator();
    }

    public static Iterator A0z(Map map) {
        return map.values().iterator();
    }

    public static ListIterator A10(List list) {
        return list.listIterator(list.size());
    }

    public static void A1A(Binder binder, Parcel parcel) {
        parcel.enforceInterface(binder.getInterfaceDescriptor());
    }

    public static void A1E(M5J m5j, ImmutableList.Builder builder) {
        m5j.A0H(builder.build());
    }

    public static void A1J(CR9 cr9) {
        cr9.A07().A05();
        cr9.A06().A00();
    }

    public static void A1K(C39769Kzd kzd, C37744K2e k2e, ImageUrl imageUrl, String str) {
        C37030Jj7 A0A = k2e.A0A(imageUrl, str);
        A0A.A02(kzd);
        A0A.A01();
    }

    public static void A1P(Object obj, AbstractMap abstractMap, Map.Entry entry) {
        abstractMap.put(obj, entry.getValue());
    }

    public static void A1U(AbstractCollection abstractCollection, long j) {
        abstractCollection.add(Long.valueOf(j));
    }

    public static void A1V(List list, int i) {
        list.add(Integer.valueOf(i));
    }

    public static boolean A1W(int i, List list) {
        return list.contains(Integer.valueOf(i));
    }

    public static boolean A1X(Object obj, Object obj2) {
        return !C04220Ms.A0I(obj, obj2);
    }

    public static Object[] A1b(AbstractCollection abstractCollection) {
        return abstractCollection.toArray(new String[abstractCollection.size()]);
    }
}
