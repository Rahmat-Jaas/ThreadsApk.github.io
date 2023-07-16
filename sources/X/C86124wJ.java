package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.forker.Process;
import com.facebook.graphql.impls.PayoutTransactionQueryResponseImpl;
import com.facebook.graphql.impls.SharedPaymentsErrorImpl;
import com.facebook.graphql.impls.TransactionFragmentImpl;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0210000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0302000_I2;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.pando.TreeJNI;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxCListenerShape1S2400000_2_I2;
import com.facebook.redex.IDxCListenerShape201S0100000_1_I2;
import com.facebook.redex.IDxFCollectorShape230S0100000_2_I2;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.facebook.redex.IDxUListenerShape255S0100000_2_I2;
import com.facebook.redex.PCreatorCreatorShape0S0000000_I2;
import com.facebook.redex.PCreatorCreatorShape3S0000000_I2_3;
import com.facebook.redex.PCreatorCreatorShape4S0000000_I2_4;
import com.facebook.redex.PCreatorCreatorShape5S0000000_I2_5;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.instagram.barcelona.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.graphql.instagramschemagraphservices.IGFBPayDisableCreditCardResponseImpl;
import com.instagram.graphql.instagramschemagraphservices.ModularIgPaymentsCredentialOptionViewImpl;
import com.instagram.modal.ModalActivity;
import com.instagram.model.shopping.Product;
import com.instagram.react.modules.product.IgReactGeoGatingModule;
import com.instagram.service.session.UserSession;
import java.io.File;
import java.math.BigDecimal;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtCImplShape0S01001000_I2;
import kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2;
import kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1;
import kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0000000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0402000_I2;
import kotlin.jvm.internal.KtLambdaShape147S0100000_I2_2;
import kotlin.jvm.internal.KtLambdaShape16S0200000_I2;
import kotlin.jvm.internal.KtLambdaShape23S0100000_I2_3;
import kotlin.jvm.internal.KtLambdaShape25S0100000_I2_5;
import kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* renamed from: X.4wJ  reason: invalid class name and case insensitive filesystem */
public final class C86124wJ {
    public static float A01(float f, float f2) {
        return Math.abs(f - f2);
    }

    public static int A03(float f) {
        return (int) ((float) Math.ceil((double) f));
    }

    public static int A0G(Object obj, int i) {
        C04220Ms.A0B(obj, 0);
        return i & 14;
    }

    public static PandoGraphQLRequest A0S(C145828l9 r11, Class cls, String str, Map map, Map map2) {
        return new PandoGraphQLRequest(r11, str, map, map2, cls, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_business_payments_hub");
    }

    public static IDxFlowShape93S0200000_1_I2 A0V(C84714tk r3, int i) {
        return new IDxFlowShape93S0200000_1_I2((AnonymousClass0YP) new KtSLambdaShape0S0000000_I2(i, (C146958n9) null), r3, 3);
    }

    public static Float A0g() {
        return Float.valueOf(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public static Object A0l(IDxUListenerShape255S0100000_2_I2 iDxUListenerShape255S0100000_2_I2, Object obj) {
        C04220Ms.A0B(obj, 0);
        return iDxUListenerShape255S0100000_2_I2.A00;
    }

    public static Object A0m(C63893iY r1) {
        C04220Ms.A0B(r1, 0);
        return r1.A0H(0);
    }

    public static Object A0r(Object obj, KtLambdaShape147S0100000_I2_2 ktLambdaShape147S0100000_I2_2) {
        C04220Ms.A0B(obj, 0);
        return ktLambdaShape147S0100000_I2_2.A00;
    }

    public static PluginGeneratedSerialDescriptor A18(String str, C28173Ezj ezj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(str, ezj, 5);
        pluginGeneratedSerialDescriptor.A00("id", true);
        pluginGeneratedSerialDescriptor.A00("type", true);
        pluginGeneratedSerialDescriptor.A00("longMap", true);
        pluginGeneratedSerialDescriptor.A00("doubleMap", true);
        pluginGeneratedSerialDescriptor.A00("stringMap", true);
        return pluginGeneratedSerialDescriptor;
    }

    public static void A1C(Drawable drawable) {
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static void A1G(C147188nY r8, Modifier modifier, C115286uo r10) {
        C1190173e.A00(r8, modifier, r10, (String) null, 56, 8, 0);
    }

    public static void A1O(MMo mMo, AbstractCollection abstractCollection) {
        BKU A08 = BKU.A08(mMo, false);
        if (A08 != null) {
            abstractCollection.add(A08);
        }
    }

    public static void A1W(KtSLambdaShape1S0402000_I2 ktSLambdaShape1S0402000_I2) {
        if (((AtomicInteger) ktSLambdaShape1S0402000_I2.A04).decrementAndGet() == 0) {
            ((C146368m8) ktSLambdaShape1S0402000_I2.A02).ADR((Throwable) null);
        }
    }

    public static boolean A1X(int i) {
        return i < 0;
    }

    public static boolean A1a(KtCSuperShape0S0210000_I2 ktCSuperShape0S0210000_I2, Integer num, Object obj, C86074wE r6) {
        List list = (List) ktCSuperShape0S0210000_I2.A01;
        boolean z = ktCSuperShape0S0210000_I2.A02;
        C04220Ms.A0B(list, 1);
        return r6.ADi(obj, new KtCSuperShape0S0210000_I2(num, list, z));
    }

    public static double A00(Object obj) {
        return ((Number) obj).doubleValue();
    }

    public static float A02(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static int A04(int i) {
        return i != 0 ? 1231 : 1237;
    }

    public static int A05(int i) {
        return ((i >> 6) & 112) | 6;
    }

    public static int A06(int i) {
        return i != 0 ? 256 : 128;
    }

    public static LayoutInflater A0K(Context context, int i) {
        return LayoutInflater.from(new ContextThemeWrapper(context, i));
    }

    public static View A0L(Object obj) {
        View view = (View) obj;
        C04220Ms.A0B(view, 0);
        return view;
    }

    public static C145078jn A0M(Object obj) {
        C145078jn r1 = (C145078jn) obj;
        C04220Ms.A0B(r1, 0);
        return r1;
    }

    public static AnonymousClass53T A0N(Object obj, Object obj2) {
        C04220Ms.A0C(obj, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (AnonymousClass53T) C122127Kl.A06((AnonymousClass53T) obj2);
    }

    public static AnonymousClass7KC A0O(long j) {
        return new AnonymousClass7KC(j);
    }

    public static C146828mv A0Q(Object obj) {
        C146828mv r1 = (C146828mv) obj;
        C04220Ms.A0B(r1, 0);
        return r1;
    }

    public static TreeJNI A0T(TreeJNI treeJNI) {
        return treeJNI.reinterpret(SharedPaymentsErrorImpl.class);
    }

    public static TreeJNI A0U(TreeJNI treeJNI, Class cls, String str) {
        TreeJNI reinterpret = treeJNI.reinterpret(ModularIgPaymentsCredentialOptionViewImpl.class);
        if (!reinterpret.isFulfilled(str)) {
            return null;
        }
        return reinterpret.reinterpret(cls);
    }

    public static PCreatorCreatorShape0S0000000_I2 A0W(int i) {
        return new PCreatorCreatorShape0S0000000_I2(i);
    }

    public static PCreatorCreatorShape3S0000000_I2_3 A0X(int i) {
        return new PCreatorCreatorShape3S0000000_I2_3(i);
    }

    public static PCreatorCreatorShape4S0000000_I2_4 A0Y(int i) {
        return new PCreatorCreatorShape4S0000000_I2_4(i);
    }

    public static PCreatorCreatorShape5S0000000_I2_5 A0Z(int i) {
        return new PCreatorCreatorShape5S0000000_I2_5(i);
    }

    public static AnonymousClass7Dm A0b(Object obj) {
        AnonymousClass7Dm r1 = (AnonymousClass7Dm) obj;
        C04220Ms.A0B(r1, 0);
        return r1;
    }

    public static AnonymousClass3VO A0d(Object obj) {
        AnonymousClass3VO r1 = new AnonymousClass3VO();
        r1.A03(obj, 0);
        return r1;
    }

    public static EK3 A0e(Object obj, int i, int i2) {
        return new EK3(new IDxCListenerShape201S0100000_1_I2(obj, i), i2);
    }

    public static Object A0n(C10300i6 r1, Class cls, int i) {
        return r1.A01(cls, new KtLambdaShape23S0100000_I2_3(r1, i));
    }

    public static Object A0o(C10300i6 r1, Class cls, Object obj, int i) {
        return r1.A01(cls, new KtLambdaShape16S0200000_I2(i, obj, r1));
    }

    public static Object A0p(Object obj, int i) {
        return ((List) obj).get(i);
    }

    public static Object A0q(Object obj, KtCImplShape4S0201000_I2_2 ktCImplShape4S0201000_I2_2) {
        ktCImplShape4S0201000_I2_2.A02 = obj;
        ktCImplShape4S0201000_I2_2.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape4S0201000_I2_2.A01;
    }

    public static String A0s(RectF rectF, StringBuilder sb) {
        sb.append(rectF.left);
        sb.append(BasicHeaderValueParser.ELEM_DELIMITER);
        sb.append(rectF.top);
        sb.append(BasicHeaderValueParser.ELEM_DELIMITER);
        sb.append(rectF.right);
        sb.append(BasicHeaderValueParser.ELEM_DELIMITER);
        sb.append(rectF.bottom);
        return sb.toString();
    }

    public static String A0t(BaseBundle baseBundle, String str, String str2) {
        baseBundle.putString("referrer", str);
        if (TextUtils.isEmpty(str2)) {
            return C122037Js.A01();
        }
        if (!str2.startsWith("upl")) {
            return StringFormatUtil.formatStrLocaleSafe("%s_%s_%s", "upl", String.valueOf(System.currentTimeMillis()), str2);
        }
        return str2;
    }

    public static String A0v(CurrencyAmount currencyAmount, AnonymousClass77N r4) {
        return r4.A00(currencyAmount.A00, new BigDecimal(currencyAmount.A01));
    }

    public static C04530Oa A12(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape26S0100000_I2_6(obj, i));
    }

    public static C04530Oa A13(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape25S0100000_I2_5(obj, i));
    }

    public static KtCImplShape4S0201000_I2_2 A15(Object obj, C146958n9 r3, int i) {
        return new KtCImplShape4S0201000_I2_2(obj, r3, i, 42);
    }

    public static void A19() {
        C04220Ms.A0E("loggingContext");
    }

    public static void A1B(Bitmap bitmap, Paint paint) {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
    }

    public static void A1D(Bundle bundle, Object obj) {
        AnonymousClass099 r6 = (AnonymousClass099) obj;
        FragmentActivity requireActivity = r6.requireActivity();
        C10650ih.A08(requireActivity, new Intent(requireActivity, ModalActivity.class).putExtra("fragment_name", "edit_autofill_entry").putExtra(IgReactGeoGatingModule.FRAGMENT_ARGUMENTS, bundle), 1000);
        r6.A06();
    }

    public static void A1I(Fragment fragment) {
        Fragment fragment2 = fragment.mParentFragment;
        if (fragment2 instanceof C956661r) {
            FragmentActivity activity = fragment2.getActivity();
            activity.getClass();
            E2V.A0G(E2V.A03(activity));
            FragmentActivity activity2 = fragment2.getActivity();
            if (activity2 != null && (activity2 instanceof BaseFragmentActivity)) {
                ((BaseFragmentActivity) activity2).A0C();
            }
        }
    }

    public static void A1J(AnonymousClass0A3 r2, UserSession userSession, String str) {
        r2.A0T("entry_point", str);
        r2.A0Q("is_employee", Boolean.valueOf(C19573AyZ.A03(userSession)));
    }

    public static void A1K(AnonymousClass0V3 r1, String str) {
        r1.A0A("view_name", str);
    }

    public static void A1L(TreeJNI treeJNI, AbstractCollection abstractCollection) {
        TreeJNI reinterpret;
        TreeJNI treeValue = treeJNI.getTreeValue("node", PayoutTransactionQueryResponseImpl.XfbBusinessPaymentsHub.PayoutTransactions.Edges.Node.class);
        if (treeValue != null && (reinterpret = treeValue.reinterpret(TransactionFragmentImpl.class)) != null) {
            abstractCollection.add(reinterpret);
        }
    }

    public static void A1M(C25812DsR dsR) {
        dsR.A09(0.0d);
        dsR.A0A(1.0d);
    }

    public static void A1N(Mcm mcm, M5L m5l) {
        m5l.A0J(new Lr9(mcm, m5l));
    }

    public static void A1P(C883857v r2, String str) {
        if (str != null) {
            r2.A0A.Bb8(str, C883857v.A00(r2, (Throwable) null));
        }
    }

    public static void A1R(Object obj, Object obj2, Object obj3, Object obj4, KtCImplShape0S01001000_I2 ktCImplShape0S01001000_I2) {
        ktCImplShape0S01001000_I2.A01 = obj;
        ktCImplShape0S01001000_I2.A02 = obj2;
        ktCImplShape0S01001000_I2.A03 = obj3;
        ktCImplShape0S01001000_I2.A04 = obj4;
    }

    public static void A1S(Object obj, Object obj2, KtCImplShape0S0401000_I2 ktCImplShape0S0401000_I2, int i) {
        ktCImplShape0S0401000_I2.A01 = obj;
        ktCImplShape0S0401000_I2.A02 = obj2;
        ktCImplShape0S0401000_I2.A00 = i;
    }

    public static void A1T(Object obj, KtCImplShape3S0201000_I2_1 ktCImplShape3S0201000_I2_1) {
        ktCImplShape3S0201000_I2_1.A02 = obj;
        ktCImplShape3S0201000_I2_1.A00 |= Process.WAIT_RESULT_TIMEOUT;
    }

    public static void A1U(Object obj, C86024w9 r3, AnonymousClass0A5[] r4, int i, boolean z) {
        r3.CrD(obj, Boolean.valueOf(z), r4[i]);
    }

    public static boolean A1Z(KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2, AnonymousClass5Im r2, Object obj, C86074wE r4) {
        return r4.ADi(obj, new KtCSuperShape0S0200000_I2((KtCSuperShape0S0302000_I2) ktCSuperShape0S0200000_I2.A01, r2));
    }

    public static int A07(int i, Object obj, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 3);
        return 3;
    }

    public static int A08(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
    }

    public static int A09(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
    }

    public static int A0A(Drawable drawable) {
        return drawable.getBounds().width();
    }

    public static int A0B(Parcel parcel, Parcelable.Creator creator, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(creator.createFromParcel(parcel));
        return i + 1;
    }

    public static int A0C(IDxCListenerShape1S2400000_2_I2 iDxCListenerShape1S2400000_2_I2, int i) {
        int A05 = C14030oh.A05(i);
        ((C19513Axa) iDxCListenerShape1S2400000_2_I2.A00).A19((FragmentActivity) iDxCListenerShape1S2400000_2_I2.A01, (UserSession) iDxCListenerShape1S2400000_2_I2.A03, iDxCListenerShape1S2400000_2_I2.A05, ((C11630kW) iDxCListenerShape1S2400000_2_I2.A02).getModuleName(), (String) null, iDxCListenerShape1S2400000_2_I2.A04);
        return A05;
    }

    public static int A0D(File file, AbstractList abstractList, int i) {
        AnonymousClass0FJ r2 = (AnonymousClass0FJ) abstractList.get(i);
        r2.A00 = new File(file, r2.A01);
        return i + 1;
    }

    public static int A0E(Object obj) {
        return AnonymousClass3ZT.A01(obj);
    }

    public static int A0F(Object obj) {
        return Arrays.hashCode(new Object[]{obj});
    }

    public static int A0H(Object obj, Object obj2) {
        return Arrays.hashCode(new Object[]{obj, obj2});
    }

    public static int A0I(Object obj, Object obj2, Object obj3) {
        return Arrays.hashCode(new Object[]{obj, obj2, obj3});
    }

    public static int A0J(String str, int i, int i2) {
        return (i2 + str.hashCode() + i) * 31;
    }

    public static C121197Es A0P(List list, int i) {
        return (C121197Es) list.get(i);
    }

    public static AnonymousClass01J A0R(Fragment fragment) {
        return new AnonymousClass01J(fragment.getChildFragmentManager());
    }

    public static ECPPaymentRequest A0a(M5J m5j) {
        return (ECPPaymentRequest) m5j.A08();
    }

    public static C29721zB A0c(String str, String str2) {
        return new C29721zB(AnonymousClass00U.A0L(str, str2));
    }

    public static Boolean A0f(Object obj, Object obj2) {
        return Boolean.valueOf(C04220Ms.A0I(obj, obj2));
    }

    public static Integer A0h(String str) {
        return Integer.valueOf(Integer.parseInt(str));
    }

    public static Integer A0i(byte[] bArr) {
        return Integer.valueOf(Arrays.hashCode(bArr));
    }

    public static Number A0j(Object obj, Map map) {
        return (Number) map.get(obj);
    }

    public static Object A0k(SparseArray sparseArray, int i) {
        Object obj = sparseArray.get(i);
        obj.getClass();
        return obj;
    }

    public static String A0u(TreeJNI treeJNI, Class cls, String str) {
        return treeJNI.reinterpret(cls).getStringValue(str);
    }

    public static String A0w(IGFBPayDisableCreditCardResponseImpl iGFBPayDisableCreditCardResponseImpl, Object obj, String str, String str2) {
        AnonymousClass3ZT.A02(obj, str);
        return ((IGFBPayDisableCreditCardResponseImpl.DisableCreditCard.CreditCard) ((IGFBPayDisableCreditCardResponseImpl.DisableCreditCard) iGFBPayDisableCreditCardResponseImpl.getTreeValue("disable_credit_card(data:$input)", IGFBPayDisableCreditCardResponseImpl.DisableCreditCard.class)).getTreeValue("credit_card", IGFBPayDisableCreditCardResponseImpl.DisableCreditCard.CreditCard.class)).getStringValue(str2);
    }

    public static String A0x(C2W c2w) {
        Product product = c2w.BDY().A00;
        C04220Ms.A0A(product);
        return product.A00.A0j;
    }

    public static String A0y(AtomicLong atomicLong) {
        return String.valueOf(atomicLong.getAndIncrement());
    }

    public static HashMap A0z(Pair pair) {
        return AnonymousClass4WJ.A09(pair);
    }

    public static Iterator A10(Parcel parcel, AbstractCollection abstractCollection) {
        parcel.writeInt(abstractCollection.size());
        return abstractCollection.iterator();
    }

    public static Iterator A11(Parcel parcel, Set set) {
        parcel.writeInt(set.size());
        return set.iterator();
    }

    public static Unit A14(C41259M6w m6w, C28051Exi exi) {
        exi.AKx();
        m6w.setTransactionSuccessful();
        Unit unit = Unit.A00;
        m6w.endTransaction();
        return unit;
    }

    public static C02230Ai A16(Object obj) {
        return new C02230Ai(obj.getClass());
    }

    public static C83234r0 A17(IDxFCollectorShape230S0100000_2_I2 iDxFCollectorShape230S0100000_2_I2, Object obj) {
        AnonymousClass0OU.A00(obj);
        return (C83234r0) iDxFCollectorShape230S0100000_2_I2.A00;
    }

    public static void A1A(int i, Object obj, Object obj2, Object obj3) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 13);
        C04220Ms.A0B(obj3, 14);
    }

    public static void A1E(Handler handler, Object obj, int i) {
        handler.sendMessage(handler.obtainMessage(i, obj));
    }

    public static void A1F(Parcel parcel, Iterator it, int i) {
        parcel.writeParcelable((Parcelable) it.next(), i);
    }

    public static void A1H(Fragment fragment) {
        C63813iO.A03(fragment.requireContext(), (String) null, 2131834837, 0);
    }

    public static void A1Q(AnonymousClass601 r1, C109326jp r2, Object obj) {
        C63913ic.A0K(r1, r2, obj);
    }

    public static void A1V(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (next instanceof String) {
            abstractCollection.add(next);
        }
    }

    public static boolean A1Y(C81784oM r0, Object obj) {
        return C04220Ms.A0I(obj, r0.getValue());
    }

    public static Object[] A1b(Object[] objArr, int i) {
        Object[] copyOf = Arrays.copyOf(objArr, i);
        C04220Ms.A06(copyOf);
        return copyOf;
    }
}
