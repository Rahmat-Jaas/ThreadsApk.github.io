package X;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.common.locale.LocaleMember;
import com.facebook.graphql.impls.CheckoutSetupMutationResponseImpl;
import com.facebook.graphql.impls.ComponentDataMutationResponseImpl;
import com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxCListenerShape71S0200000_2_I2;
import com.facebook.redex.IDxFlowShape250S0100000_1_I2;
import com.facebook.redex.IDxFunctionShape101S0000000_2_I2;
import com.facebook.redex.IDxObserverShape99S0200000_2_I2;
import com.facebook.redex.IDxTListenerShape262S0100000_2_I2;
import com.facebookpay.msc.feselector.viewmodel.ListSectionWithFeSelectorViewModel;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2;
import kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0100000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape3S0101000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0200000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape8S0301000_I2;
import kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3;
import kotlin.jvm.internal.KtLambdaShape149S0100000_I2_4;
import kotlin.jvm.internal.KtLambdaShape150S0100000_I2_5;
import kotlin.jvm.internal.KtLambdaShape152S0100000_I2_7;
import kotlin.jvm.internal.KtLambdaShape167S0100000_I2;
import kotlin.jvm.internal.KtLambdaShape16S0200000_I2;
import kotlin.jvm.internal.KtLambdaShape171S0100000_I2;
import kotlin.jvm.internal.KtLambdaShape173S0100000_I2;
import kotlin.jvm.internal.KtLambdaShape20S0200000_I2_4;
import kotlin.jvm.internal.KtLambdaShape34S0100000_I2_14;
import kotlin.jvm.internal.KtLambdaShape39S0200000_I2;
import kotlin.jvm.internal.KtLambdaShape40S0200000_I2_1;
import kotlin.jvm.internal.KtLambdaShape77S0100000_I2_57;
import org.json.JSONObject;

/* renamed from: X.4wN  reason: invalid class name and case insensitive filesystem */
public final class C86164wN {
    public static double A00(double d, double d2) {
        return Math.exp(d * d2);
    }

    public static float A01(int i) {
        if (i != 0) {
            return 1.0f;
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public static int A04(int i) {
        return i != 0 ? 1 : 2;
    }

    public static SharedPreferences A0C(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }

    public static void A18(IBinder iBinder, Parcel parcel) {
        iBinder.transact(1, parcel, (Parcel) null, 1);
    }

    public static void A1N(KtCImplShape0S0401000_I2 ktCImplShape0S0401000_I2) {
        ktCImplShape0S0401000_I2.A01 = null;
        ktCImplShape0S0401000_I2.A02 = null;
        ktCImplShape0S0401000_I2.A00 = 2;
    }

    public static Object[] A1T() {
        return new Object[0];
    }

    public static float A03(float[] fArr, float f, float f2, int i) {
        return f2 + (f * fArr[i]);
    }

    public static Matrix A0E() {
        return new Matrix();
    }

    public static Rect A0F(int i, int i2, int i3, int i4) {
        return new Rect(i, i2, i3, i4);
    }

    public static C122137Ks A0G(Object obj) {
        C122137Ks r1 = (C122137Ks) obj;
        C04220Ms.A0B(r1, 1);
        return r1;
    }

    public static C147828pz A0H(Object obj, Object obj2) {
        C147828pz r0 = (C147828pz) obj;
        AnonymousClass0OU.A00(obj2);
        return r0;
    }

    public static TreeJNI A0I(TreeJNI treeJNI) {
        return treeJNI.getTreeValue("fetch_fbpay_component_data(component_types:$component_types,otc_component_input:$otc_component_input,otc_session_id:$otc_session_id,otc_type:$otc_type,payment_container_mode:$payment_container_mode,payment_product_id:$payment_product_id)", FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData.class);
    }

    public static TreeJNI A0J(TreeJNI treeJNI) {
        return treeJNI.getTreeValue("payer_name_response", ComponentDataMutationResponseImpl.FbpayAccountMutation.PayerNameResponse.class);
    }

    public static TreeJNI A0K(TreeJNI treeJNI) {
        return treeJNI.getTreeValue("ecp_availability", CheckoutSetupMutationResponseImpl.CheckoutSetupMutation.EcpAvailability.class);
    }

    public static IDxCListenerShape71S0200000_2_I2 A0L(Object obj, Object obj2, int i) {
        return new IDxCListenerShape71S0200000_2_I2(i, obj, obj2);
    }

    public static IDxFlowShape250S0100000_1_I2 A0M(Object obj) {
        return new IDxFlowShape250S0100000_1_I2(obj, 41);
    }

    public static IDxFunctionShape101S0000000_2_I2 A0N(int i) {
        return new IDxFunctionShape101S0000000_2_I2(i);
    }

    public static IDxObserverShape99S0200000_2_I2 A0O(Object obj, Object obj2, int i) {
        return new IDxObserverShape99S0200000_2_I2(i, obj, obj2);
    }

    public static ImmutableList.Builder A0Q() {
        return new ImmutableList.Builder();
    }

    public static AnonymousClass1jB A0R(Object obj) {
        return new AnonymousClass1jB(obj);
    }

    public static F10 A0T(Context context, int i) {
        return new F10(context, i);
    }

    public static Object A0U(Object obj) {
        if (obj != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return obj;
    }

    public static String A0f(LocaleMember localeMember) {
        return localeMember.A00.getCountry();
    }

    public static String A0g(TreeJNI treeJNI) {
        return treeJNI.getStringValue(DialogModule.KEY_TITLE);
    }

    public static String A0h(Object obj) {
        C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.String");
        return "null cannot be cast to non-null type kotlin.String";
    }

    public static HashMap A0j(Map map) {
        return new HashMap(map);
    }

    public static Map A0l(AutofillData autofillData) {
        return Collections.unmodifiableMap(autofillData.A00);
    }

    public static C146958n9 A0m(Object obj, C39041KlF klF) {
        return klF.create((C146958n9) obj);
    }

    public static KtCImplShape1S0301000_I2 A0n(Object obj, C146958n9 r2, int i) {
        return new KtCImplShape1S0301000_I2(obj, r2, i);
    }

    public static KtSLambdaShape3S0101000_I2 A0o(Object obj, C146958n9 r2, int i) {
        return new KtSLambdaShape3S0101000_I2(obj, r2, i);
    }

    public static KtSLambdaShape8S0301000_I2 A0p(Object obj, Object obj2, C146958n9 r8, int i) {
        return new KtSLambdaShape8S0301000_I2(obj, obj2, r8, i, 42);
    }

    public static KtLambdaShape148S0100000_I2_3 A0q(Object obj, int i) {
        return new KtLambdaShape148S0100000_I2_3(obj, i);
    }

    public static KtLambdaShape149S0100000_I2_4 A0r(Object obj, int i) {
        return new KtLambdaShape149S0100000_I2_4(obj, i);
    }

    public static KtLambdaShape150S0100000_I2_5 A0s(Object obj, int i) {
        return new KtLambdaShape150S0100000_I2_5(obj, i);
    }

    public static KtLambdaShape152S0100000_I2_7 A0t(Object obj, int i) {
        return new KtLambdaShape152S0100000_I2_7(obj, i);
    }

    public static KtLambdaShape167S0100000_I2 A0u(Object obj, int i) {
        return new KtLambdaShape167S0100000_I2(obj, i);
    }

    public static KtLambdaShape16S0200000_I2 A0v(Object obj, Object obj2, int i) {
        return new KtLambdaShape16S0200000_I2(i, obj, obj2);
    }

    public static KtLambdaShape171S0100000_I2 A0w(Object obj, int i) {
        return new KtLambdaShape171S0100000_I2(obj, i);
    }

    public static KtLambdaShape173S0100000_I2 A0x(Object obj, int i) {
        return new KtLambdaShape173S0100000_I2(obj, i);
    }

    public static KtLambdaShape20S0200000_I2_4 A0y(Object obj, Object obj2, int i) {
        return new KtLambdaShape20S0200000_I2_4(i, obj, obj2);
    }

    public static KtLambdaShape34S0100000_I2_14 A0z(Object obj, int i) {
        return new KtLambdaShape34S0100000_I2_14(obj, i);
    }

    public static KtLambdaShape39S0200000_I2 A10(Object obj, Object obj2, int i) {
        return new KtLambdaShape39S0200000_I2(i, obj, obj2);
    }

    public static KtLambdaShape40S0200000_I2_1 A11(Object obj, Object obj2, int i) {
        return new KtLambdaShape40S0200000_I2_1(i, obj, obj2);
    }

    public static KtLambdaShape77S0100000_I2_57 A12(Object obj, int i) {
        return new KtLambdaShape77S0100000_I2_57(obj, i);
    }

    public static C84714tk A13(C32165H8c h8c, int i, int i2) {
        return C63623hv.A03(h8c, i, i2, 14);
    }

    public static void A15(Animator animator) {
        animator.setInterpolator(new LinearInterpolator());
    }

    public static void A1A(View view, int i, Object obj) {
        view.setOnTouchListener(new IDxTListenerShape262S0100000_2_I2(obj, i));
    }

    public static void A1B(C021109v r1, AnonymousClass0V3 r2) {
        r2.A04(r1, "credential_type");
    }

    public static void A1C(AnonymousClass0A3 r1, String str) {
        r1.A0T("button_label", str);
        r1.Bb4();
    }

    public static void A1F(Object obj) {
        C04220Ms.A0C(obj, "null cannot be cast to non-null type android.app.Activity");
    }

    public static void A1I(Object obj, AbstractMap abstractMap) {
        abstractMap.put("financial_entity_id", obj);
    }

    public static void A1J(Object obj, Map map) {
        map.put("id", obj);
    }

    public static void A1K(Object obj, Map map) {
        map.put("logging_context", obj);
    }

    public static void A1L(String str, String str2, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new LinkParams(str, i, str2));
    }

    public static boolean A1P(int i) {
        return Log.isLoggable("Paging", i);
    }

    public static boolean A1S(boolean z) {
        if (z) {
            return true;
        }
        return z;
    }

    public static float A02(Number number) {
        C04220Ms.A0A(number);
        return number.floatValue();
    }

    public static int A05(AbstractCollection abstractCollection) {
        return abstractCollection.size() - 1;
    }

    public static int A06(List list, int i) {
        return i + list.size();
    }

    public static int A07(byte[] bArr, int i) {
        return i + Arrays.hashCode(bArr);
    }

    public static long A08(C81784oM r1) {
        return ((AnonymousClass7KC) r1.getValue()).A00;
    }

    public static long A09(AnonymousClass0TJ r0, C10300i6 r1, TimeUnit timeUnit, long j) {
        return timeUnit.toMillis(C63803iN.A03(r0, r1, j));
    }

    public static long A0A(PaymentMethod paymentMethod) {
        return Long.parseLong(paymentMethod.Aal());
    }

    public static Intent A0B(Intent intent, String str) {
        return intent.setData(C15430rJ.A01(str));
    }

    public static Resources A0D(View view) {
        return view.getContext().getResources();
    }

    public static CheckoutHandler A0P(C04530Oa r0) {
        return (CheckoutHandler) r0.getValue();
    }

    public static C127397h3 A0S(List list, int i) {
        return (C127397h3) list.get(i);
    }

    public static Object A0V(Object obj, KtSLambdaShape11S0100000_I2 ktSLambdaShape11S0100000_I2) {
        AnonymousClass0OU.A00(obj);
        return ktSLambdaShape11S0100000_I2.A00;
    }

    public static Object A0W(Object obj, KtSLambdaShape12S0100000_I2_1 ktSLambdaShape12S0100000_I2_1) {
        AnonymousClass0OU.A00(obj);
        return ktSLambdaShape12S0100000_I2_1.A00;
    }

    public static Object A0X(Object obj, KtSLambdaShape15S0201000_I2_1 ktSLambdaShape15S0201000_I2_1) {
        AnonymousClass0OU.A00(obj);
        return ktSLambdaShape15S0201000_I2_1.A02;
    }

    public static Object A0Y(Object obj, KtSLambdaShape3S0101000_I2 ktSLambdaShape3S0101000_I2) {
        AnonymousClass0OU.A00(obj);
        return ktSLambdaShape3S0101000_I2.A01;
    }

    public static Object A0Z(Object obj, KtSLambdaShape5S0200000_I2 ktSLambdaShape5S0200000_I2) {
        AnonymousClass0OU.A00(obj);
        return ktSLambdaShape5S0200000_I2.A00;
    }

    public static Object A0a(Object obj, AnonymousClass0YP r2, int i) {
        return r2.invoke(obj, Integer.valueOf(i));
    }

    public static Object A0b(AbstractList abstractList, int i) {
        Object obj = abstractList.get(i);
        C04220Ms.A06(obj);
        return obj;
    }

    public static Object A0c(AbstractMap abstractMap, int i) {
        return abstractMap.get(Integer.valueOf(i));
    }

    public static Object A0d(AnonymousClass0YY r1, float f) {
        return r1.invoke(Float.valueOf(f));
    }

    public static String A0e(C81784oM r0) {
        return (String) r0.getValue();
    }

    public static String A0i(Object obj, String str) {
        return String.format(str, new Object[]{obj});
    }

    public static List A0k(List list, int i) {
        return (List) list.get(i);
    }

    public static void A14(long j, StringBuilder sb) {
        sb.append(AnonymousClass7KC.A06(j));
    }

    public static void A16(RectF rectF, Drawable drawable) {
        rectF.set(drawable.getBounds());
    }

    public static void A17(Bundle bundle, ListSectionWithFeSelectorViewModel listSectionWithFeSelectorViewModel) {
        bundle.putParcelable("logging_data", listSectionWithFeSelectorViewModel.A09());
    }

    public static void A19(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            creator.createFromParcel(parcel);
        }
    }

    public static void A1D(AnonymousClass0V3 r2, long j) {
        r2.A09("credential_id", Long.valueOf(j));
    }

    public static void A1E(MMo mMo, Object[] objArr, int i) {
        objArr[i] = C59533Le.A00(mMo);
    }

    public static void A1G(Object obj, Object obj2, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        if (abstractCollection.add(obj)) {
            abstractCollection2.add(obj2);
        }
    }

    public static void A1H(Object obj, String str, JSONObject jSONObject) {
        jSONObject.put(str, obj.toString());
    }

    public static void A1M(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(true);
    }

    public static void A1O(Object[] objArr, int i, int i2) {
        objArr[i2] = Integer.valueOf(i);
    }

    public static boolean A1Q(int i, Object obj) {
        C04220Ms.A0B(obj, i);
        return InspectableValueKt.isDebugInspectorInfoEnabled;
    }

    public static boolean A1R(Map map) {
        return !map.isEmpty();
    }
}
