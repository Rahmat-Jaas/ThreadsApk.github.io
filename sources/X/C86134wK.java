package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.facebook.android.maps.model.LatLng;
import com.facebook.dcp.model.Matrix;
import com.facebook.forker.Process;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0400000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I2;
import com.facebook.redex.IDxFCollectorShape230S0100000_2_I2;
import com.facebook.redex.IDxFCollectorShape84S0200000_2_I2;
import com.facebook.redex.IDxObjectShape237S0100000_2_I2;
import com.facebook.redex.IDxSequenceShape670S0100000_I2;
import com.facebook.redex.IDxUListenerShape255S0100000_2_I2;
import com.facebook.redex.PCreatorCreatorShape6S0000000_I2_6;
import com.facebookpay.form.cell.logging.FormCellFocusEvents;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ApiAdFormats;
import com.instagram.barcelona.R;
import com.instagram.common.api.base.IDxACallbackShape16S0300000_2_I2;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.igds.compose.ComposeShowcaseComponentsKt;
import com.instagram.debug.devoptions.newsfeed.ActivityFeedShowcaseComposeFragment;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.io.PrintStream;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0101000_I2_2;
import kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4;
import kotlin.jvm.internal.KtLambdaShape150S0100000_I2_5;
import kotlin.jvm.internal.KtLambdaShape24S0100000_I2_4;
import kotlin.jvm.internal.KtLambdaShape90S0100000_I2_70;

/* renamed from: X.4wK  reason: invalid class name and case insensitive filesystem */
public final class C86134wK {
    public static float A01(int i) {
        return ((float) i) / 2.0f;
    }

    public static Matrix A0L(Object obj, float[][] fArr) {
        System.arraycopy(obj, 0, fArr, 27, 5);
        return new Matrix(fArr);
    }

    public static IDxSequenceShape670S0100000_I2 A0Q(Object obj) {
        C04220Ms.A0B(obj, 1);
        return new IDxSequenceShape670S0100000_I2(obj, 1);
    }

    public static ImageUrl A0X(C147188nY r1, ActivityFeedShowcaseComposeFragment activityFeedShowcaseComposeFragment, String str) {
        ComposeShowcaseComponentsKt.ShowcaseSectionHeader(str, r1, 6);
        return activityFeedShowcaseComposeFragment.getUser().B4M();
    }

    public static Object A0d() {
        return Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
    }

    public static Object A0g(Class cls) {
        return cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static Object A0j(Object obj, KtLambdaShape150S0100000_I2_5 ktLambdaShape150S0100000_I2_5) {
        C04220Ms.A0B(obj, 0);
        return ktLambdaShape150S0100000_I2_5.A00;
    }

    public static Object A0k(List list) {
        return list.get(1);
    }

    public static void A1F(AnonymousClass0V3 r2, int i) {
        r2.A09("balance", Long.valueOf((long) i));
    }

    public static boolean A1X(int i, int i2) {
        return i > i2;
    }

    public static boolean A1Z(Object obj) {
        C04220Ms.A0B(obj, 0);
        return InspectableValueKt.isDebugInspectorInfoEnabled;
    }

    public static int A04(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    public static int A05(int i, int i2) {
        return (i & 57344) | i2 | (i & 7168);
    }

    public static int A06(int i, long j) {
        return i + ((int) (j ^ (j >>> 32)));
    }

    public static int A0B(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        cArr2[i2] = cArr[(i >> 4) & 15];
        int i4 = i3 + 1;
        cArr2[i3] = cArr[i & 15];
        return i4;
    }

    public static long A0C(Number number) {
        if (number != null) {
            return number.longValue();
        }
        return 0;
    }

    public static Rect A0D() {
        return new Rect();
    }

    public static RectF A0E() {
        return new RectF();
    }

    public static TextView A0G(Object obj, float f) {
        TextView textView = (TextView) obj;
        textView.setWidth((int) (((float) textView.getWidth()) * f));
        textView.setHeight(textView.getHeight());
        return textView;
    }

    public static AnonymousClass53S A0H(Object obj, Object obj2) {
        C04220Ms.A0C(obj, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (AnonymousClass53S) C122127Kl.A06((AnonymousClass53S) obj2);
    }

    public static AnonymousClass7KE A0I(long j) {
        return new AnonymousClass7KE(j);
    }

    public static M5J A0K(M5J m5j, Object obj, int i) {
        return C30821GXg.A01(m5j, new KtLambdaShape149S0100000_I2_4(obj, i));
    }

    public static KtCSuperShape1S2110000_I2 A0N(String str, String str2, int i, int i2) {
        return new KtCSuperShape1S2110000_I2(str, str2, i, i2);
    }

    public static IDxCListenerShape203S0100000_2_I2 A0P(Object obj, int i) {
        return new IDxCListenerShape203S0100000_2_I2(obj, i);
    }

    public static PCreatorCreatorShape6S0000000_I2_6 A0R(int i) {
        return new PCreatorCreatorShape6S0000000_I2_6(i);
    }

    public static AnonymousClass5qq A0S(Fragment fragment) {
        Fragment fragment2 = fragment.mParentFragment;
        C04220Ms.A0C(fragment2, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.FBPayBottomSheetDialogFragment");
        return (AnonymousClass5qq) fragment2;
    }

    public static ApiAdFormats A0V(String str, int i) {
        return new ApiAdFormats(str, i, str);
    }

    public static C91165fi A0Z(Object obj) {
        IRw iRw = (IRw) obj;
        C04220Ms.A0B(iRw, 0);
        return iRw.A0O;
    }

    public static Integer A0c(C008103m r0) {
        return Integer.valueOf(((AccessibilityNodeInfo.AccessibilityAction) r0.A03).getId());
    }

    public static Object A0f(C10300i6 r1, Class cls, int i) {
        return r1.A01(cls, new IDxObjectShape237S0100000_2_I2(r1, i));
    }

    public static Object A0i(Object obj, KtSLambdaShape5S0101000_I2_2 ktSLambdaShape5S0101000_I2_2, C28172Ezi ezi, int i, int i2) {
        IDxFCollectorShape230S0100000_2_I2 iDxFCollectorShape230S0100000_2_I2 = new IDxFCollectorShape230S0100000_2_I2(obj, i);
        ktSLambdaShape5S0101000_I2_2.A00 = i2;
        return ezi.collect(iDxFCollectorShape230S0100000_2_I2, ktSLambdaShape5S0101000_I2_2);
    }

    public static String A0l(int i, int i2, String str, String str2) {
        return AnonymousClass00U.A0P(str, str2, ')', i, i2);
    }

    public static String A0n(BaseBundle baseBundle) {
        return baseBundle.getString("PAYMENT_ACCOUNT_ID");
    }

    public static String A0o(TreeJNI treeJNI) {
        return String.valueOf(treeJNI.getIntValue("id"));
    }

    public static String A0p(User user) {
        if (user != null) {
            return user.getId();
        }
        return null;
    }

    public static String A0r(String str, int i) {
        return AnonymousClass00U.A0E(str, ')', i);
    }

    public static UnsupportedOperationException A0s(String str) {
        return new UnsupportedOperationException(str);
    }

    public static LinkedHashSet A0u() {
        return new LinkedHashSet();
    }

    public static C04530Oa A0w(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape24S0100000_I2_4(obj, i));
    }

    public static C000000a A0x(Class cls, String str, String str2) {
        return new C000000a(cls, str, str2);
    }

    public static void A0z(ValueAnimator valueAnimator, Object obj, int i) {
        valueAnimator.addUpdateListener(new IDxUListenerShape255S0100000_2_I2(obj, i));
    }

    public static void A11(Canvas canvas, Rect rect) {
        canvas.translate((float) rect.left, (float) rect.top);
    }

    public static void A12(Paint paint) {
        paint.setStyle(Paint.Style.STROKE);
    }

    public static void A13(Paint paint) {
        paint.setStyle(Paint.Style.FILL);
    }

    public static void A15(BaseBundle baseBundle, UserSession userSession) {
        baseBundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
    }

    public static void A1E(C021109v r1, C021109v r2, AnonymousClass0A3 r3, String str) {
        r3.A0O(r1, "product");
        r3.A0O(r2, "product_type");
        r3.A0T("container_module", str);
    }

    public static void A1G(AnonymousClass0V3 r1, String str) {
        r1.A0A("target_name", str);
    }

    public static void A1H(LatLng latLng, StringBuilder sb) {
        sb.append('|');
        sb.append(latLng.A00);
        sb.append(BasicHeaderValueParser.ELEM_DELIMITER);
        sb.append(latLng.A01);
    }

    public static void A1I(Mcm mcm, M5L m5l, Object obj) {
        m5l.A0J(new Lr9(mcm, obj));
    }

    public static void A1J(C110616lz r4, String str) {
        if (str != null) {
            r4.A02 = new FormCellLoggingEvents(new FormCellFocusEvents("user_click_contactdetails_atomic", "client_add_contactdetails_fail", "client_add_contactdetails_success", str));
        }
    }

    public static void A1L(Object obj, Object obj2) {
        ((AnonymousClass0YY) obj).invoke(obj2);
    }

    public static void A1M(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put("view_name", obj);
        if (obj2 != null) {
            abstractMap.put("target_name", obj2);
        }
    }

    public static void A1O(Object obj, AbstractMap abstractMap) {
        if (obj != null) {
            abstractMap.put("CREDENTIAL_TYPE", obj);
        }
    }

    public static void A1Q(Object obj, KtCImplShape1S0301000_I2 ktCImplShape1S0301000_I2) {
        ktCImplShape1S0301000_I2.A03 = obj;
        ktCImplShape1S0301000_I2.A00 |= Process.WAIT_RESULT_TIMEOUT;
    }

    public static void A1S(String str, String str2, AbstractMap abstractMap) {
        if (!abstractMap.containsKey("logging_context")) {
            abstractMap.put("logging_context", C121537Gp.A00(str, str2));
        }
    }

    public static void A1T(String str, Throwable th) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th.printStackTrace();
    }

    public static float A00() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float A02(long j, long j2) {
        return AnonymousClass7KC.A02(j) + AnonymousClass7JK.A00(j2);
    }

    public static int A03(float f) {
        return Float.floatToIntBits(f) * 31;
    }

    public static int A07(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
    }

    public static int A08(Drawable drawable) {
        return drawable.getBounds().height();
    }

    public static int A09(IDxACallbackShape16S0300000_2_I2 iDxACallbackShape16S0300000_2_I2, int i) {
        int A03 = C14030oh.A03(i);
        C63913ic.A0K((AnonymousClass601) iDxACallbackShape16S0300000_2_I2.A00, (C109326jp) iDxACallbackShape16S0300000_2_I2.A01, new Object[0]);
        return A03;
    }

    public static int A0A(Number number) {
        C04220Ms.A0A(number);
        return number.intValue();
    }

    public static InputMethodManager A0F(View view) {
        return (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    public static C39909L6z A0J(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C04220Ms.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        return (C39909L6z) layoutParams;
    }

    public static KtCSuperShape0S1200000_I2 A0M(AnonymousClass8s2 r2, C86094wG r3) {
        KtCSuperShape0S1200000_I2 ktCSuperShape0S1200000_I2 = (KtCSuperShape0S1200000_I2) ((KtCSuperShape0S0400000_I2) r3.getValue()).A03;
        return KtCSuperShape0S1200000_I2.A01((AnonymousClass67Y) ktCSuperShape0S1200000_I2.A00, ktCSuperShape0S1200000_I2.A02, r2);
    }

    public static C25812DsR A0O() {
        return AnonymousClass0hJ.A00().A02();
    }

    public static ImmutableList A0T() {
        ImmutableList of = ImmutableList.of();
        C04220Ms.A06(of);
        return of;
    }

    public static C1366783w A0U(Parcel parcel, ImmutableCollection immutableCollection) {
        parcel.writeInt(immutableCollection.size());
        return immutableCollection.iterator();
    }

    public static C32165H8c A0W(H1T h1t, String str) {
        h1t.A0I(str);
        h1t.A0E(AnonymousClass006.A0Y);
        return h1t.A02();
    }

    public static C30541GIx A0Y(UserSession userSession) {
        return (C30541GIx) AnonymousClass2NL.A00(userSession).A01(C30541GIx.class, new KtLambdaShape90S0100000_I2_70(userSession, 20));
    }

    public static UserSession A0a(AnonymousClass3HX r0) {
        return C05030Qo.A03(C63913ic.A0E(r0));
    }

    public static Integer A0b(Context context, int i) {
        return Integer.valueOf(context.getColor(i));
    }

    public static Object A0e(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C04220Ms.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        return animatedValue;
    }

    public static Object A0h(Class cls, Class cls2, Object obj) {
        return cls2.getConstructor(new Class[]{cls}).newInstance(new Object[]{obj});
    }

    public static String A0m(Resources resources, int i, boolean z) {
        String A01 = C120737Cg.A01(resources, Integer.valueOf(i), z);
        C04220Ms.A06(A01);
        return A01;
    }

    public static String A0q(String str, int i) {
        String substring = str.substring(i);
        C04220Ms.A06(substring);
        return substring;
    }

    public static Iterator A0t(Iterable iterable) {
        C04220Ms.A06(iterable);
        return iterable.iterator();
    }

    public static List A0v(Integer num, int i) {
        return C06750aI.A17(num, Integer.valueOf(i));
    }

    public static C83234r0 A0y(IDxFCollectorShape84S0200000_2_I2 iDxFCollectorShape84S0200000_2_I2, Object obj) {
        AnonymousClass0OU.A00(obj);
        return (C83234r0) iDxFCollectorShape84S0200000_2_I2.A00;
    }

    public static void A10(Context context, F10 f10, float f) {
        f10.A0B(f);
        f10.A0H(context.getColor(R.color.igds_secondary_text));
    }

    public static void A14(Drawable drawable, View view, ViewGroup viewGroup) {
        View requireViewById = view.requireViewById(R.id.card_icon);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) requireViewById).setImageDrawable(drawable);
        viewGroup.addView(view);
    }

    public static void A16(IInterface iInterface, Parcel parcel) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }

    public static void A17(Parcel parcel, Class cls, List list) {
        parcel.readList(list, cls.getClassLoader());
    }

    public static void A18(Parcel parcel, Number number, int i) {
        parcel.writeInt(i);
        parcel.writeLong(number.longValue());
    }

    public static void A19(Parcel parcel, Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, parcel.readString());
    }

    public static void A1A(SparseArray sparseArray, SparseArray sparseArray2, int i) {
        sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
    }

    public static void A1B(C81784oM r0) {
        C147788pu r02 = (C147788pu) r0.getValue();
        if (r02 != null) {
            r02.ANV();
        }
    }

    public static void A1C(Fragment fragment, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            C63813iO.A01(fragment.getContext(), charSequence);
        }
    }

    public static void A1D(C28170Ezf ezf, Iterator it, int i) {
        Number number = (Number) it.next();
        if (number == null) {
            ezf.AAb(i);
        } else {
            ezf.AAa(i, (long) number.intValue());
        }
    }

    public static void A1K(MMp mMp, Iterator it) {
        Number number = (Number) it.next();
        if (number != null) {
            mMp.A0O(number.longValue());
        }
    }

    public static void A1N(Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        map.put("credential_type", "shop_pay");
    }

    public static void A1P(Object obj, AbstractMap abstractMap, int i) {
        abstractMap.put(obj, Integer.valueOf(i));
    }

    public static void A1R(String str, String str2, StringBuilder sb, Throwable th) {
        sb.append(str);
        sb.append(str2);
        sb.append(" from remote package:\n  ");
        Log.e("DynamiteClient", sb.toString(), th);
    }

    public static void A1U(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(false);
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(C19451AwY.A01(((AnonymousClass422) it.next()).A00));
    }

    public static void A1W(List list, List list2, List list3, Set set, Set set2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
    }

    public static boolean A1Y(Object obj) {
        return C04220Ms.A0I(obj, AnonymousClass4WJ.A0A());
    }

    public static boolean A1a(Object obj, Object obj2, boolean z) {
        if (C04220Ms.A0I(obj, obj2)) {
            return true;
        }
        return z;
    }

    public static Object[] A1b(Object obj, Object obj2, int i) {
        return new Object[]{obj, obj2, Integer.valueOf(i)};
    }
}
