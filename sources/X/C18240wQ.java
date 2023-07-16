package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxCListenerShape420S0100000_1_I2;
import com.facebook.redex.IDxListenerShape412S0100000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.barcelona.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.business.ui.BusinessNavBar;
import com.instagram.debug.devoptions.DirectInboxFlags;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.registration.ui.NotificationBar;
import com.instagram.service.session.UserSession;
import java.text.DateFormat;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.coroutines.jvm.internal.KtCImplShape1S0401000_I2_1;
import kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape10S0101000_I2_7;
import kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95;
import kotlin.jvm.internal.KtLambdaShape62S0100000_I2_42;

/* renamed from: X.0wQ  reason: invalid class name and case insensitive filesystem */
public final class C18240wQ {
    public static int A07(Calendar calendar) {
        return calendar.get(5);
    }

    public static View A0E(LayoutInflater layoutInflater, int i) {
        return layoutInflater.inflate(i, (ViewGroup) null);
    }

    public static C148858sI A0H(Object obj, int i) {
        return AnonymousClass7JR.A03(obj, i, false);
    }

    public static IgdsListCell A0T(Context context) {
        return new IgdsListCell(context, (AttributeSet) null);
    }

    public static C04620Ok A0V(Object obj) {
        C04220Ms.A0B(obj, 0);
        return C06810aP.A01;
    }

    public static Object A0b(List list) {
        return list.get(0);
    }

    public static void A0o() {
        AnonymousClass7Ko.A0E(false, "Must call setInstanceSupplier first");
        throw null;
    }

    public static void A0t(Paint paint) {
        C04220Ms.A0B(paint, 0);
        paint.setUnderlineText(false);
    }

    public static void A0y(CompoundButton compoundButton, boolean z) {
        compoundButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        compoundButton.setChecked(z);
    }

    public static void A17(MMo mMo, AbstractCollection abstractCollection) {
        BKU A08 = BKU.A08(mMo, false);
        if (A08 != null) {
            abstractCollection.add(A08);
        }
    }

    public static void A1B(C25786Drz drz) {
        drz.A0C = false;
        drz.A05();
    }

    public static void A1H(Object obj) {
        C04220Ms.A0B(obj, 0);
    }

    public static boolean A1S(BaseBundle baseBundle, String str) {
        return baseBundle.getBoolean(str, false);
    }

    public static boolean A1X(Object obj) {
        C04220Ms.A0B(obj, 2);
        return false;
    }

    public static boolean A1Y(Object obj, Object obj2) {
        return obj != obj2;
    }

    public static Integer[] A1Z() {
        return AnonymousClass006.A00(3);
    }

    public static Integer[] A1a() {
        return AnonymousClass006.A00(4);
    }

    public static float A00(Object obj) {
        return ((Number) obj).floatValue();
    }

    public static long A08(int i) {
        if (i != 0) {
            return 1;
        }
        return 60;
    }

    public static Context A0B(M5O m5o) {
        return m5o.itemView.getContext();
    }

    public static Context A0C(Object obj) {
        return ((Fragment) obj).getContext();
    }

    public static View A0F(KtLambdaShape62S0100000_I2_42 ktLambdaShape62S0100000_I2_42) {
        return ((Fragment) ktLambdaShape62S0100000_I2_42.A00).requireView();
    }

    public static FragmentActivity A0I(Object obj) {
        return ((Fragment) obj).requireActivity();
    }

    public static C25764Drc A0K() {
        return new C25764Drc();
    }

    public static ErrorIdentifier A0L(String str, int i) {
        return new ErrorIdentifier(str, i, str);
    }

    public static C37408JrQ A0M(SuggestBusinessFragment suggestBusinessFragment) {
        return new C37408JrQ("pro_account_suggestions", suggestBusinessFragment.A05, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null);
    }

    public static AnonymousClass3HJ A0Q(Object obj) {
        AnonymousClass3HJ r1 = (AnonymousClass3HJ) obj;
        C04220Ms.A0B(r1, 0);
        return r1;
    }

    public static AnonymousClass3ZF A0R(Object obj) {
        AnonymousClass3ZF r1 = (AnonymousClass3ZF) obj;
        C04220Ms.A0B(r1, 0);
        return r1;
    }

    public static Boolean A0X(boolean z) {
        return Boolean.valueOf(!z);
    }

    public static String A0g(String str) {
        return str.toLowerCase(Locale.US);
    }

    public static String A0h(String str, String str2, String str3) {
        String A0h = AnonymousClass00U.A0h("api/", "v1/", str, str2, str3);
        C04220Ms.A06(A0h);
        return A0h;
    }

    public static String A0i(DateFormat dateFormat, long j) {
        return dateFormat.format(new Date(j));
    }

    public static UnsupportedOperationException A0j() {
        return new UnsupportedOperationException();
    }

    public static ArrayList A0k(int i) {
        return new ArrayList(i);
    }

    public static C04530Oa A0l(Integer num, Object obj, int i) {
        return AnonymousClass0OY.A01(num, new KtLambdaShape115S0100000_I2_95(obj, i));
    }

    public static KtCImplShape3S0201000_I2_1 A0m(Object obj, C146958n9 r3, int i) {
        return new KtCImplShape3S0201000_I2_1(obj, r3, i, 42);
    }

    public static KtSLambdaShape10S0101000_I2_7 A0n(Object obj, C146958n9 r2, int i) {
        return new KtSLambdaShape10S0101000_I2_7(obj, r2, i);
    }

    public static void A0p() {
        C04220Ms.A0E("logger");
    }

    public static void A0w(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static void A0z(TextView textView) {
        textView.setTransformationMethod(new PasswordTransformationMethod());
    }

    public static void A10(Fragment fragment) {
        C09860go.A0I(fragment.mView);
    }

    public static void A13(C021109v r1, AnonymousClass0A3 r2) {
        r2.A0O(r1, "surface");
    }

    public static void A15(AnonymousClass0A3 r1, String str) {
        r1.A0T(IgFragmentActivity.MODULE_KEY, str);
    }

    public static void A16(AnonymousClass0A3 r1, String str) {
        r1.A0T("prior_module", str);
        r1.Bb4();
    }

    public static void A18(H1T h1t) {
        h1t.A0B(C85814vo.class, AnonymousClass3Za.class);
    }

    public static void A19(H1T h1t) {
        h1t.A0F(AnonymousClass006.A0N);
        h1t.A04();
    }

    public static void A1A(H1T h1t, Class cls, Class cls2) {
        h1t.A08(C04740Ox.A00, cls, cls2);
    }

    public static void A1C(C25828Dsm dsm, Object obj, int i) {
        dsm.A0M(new IDxCListenerShape420S0100000_1_I2(obj, i));
    }

    public static void A1D(C08410dK r0, Object obj) {
        r0.A01.invoke(obj);
    }

    public static void A1G(Object obj) {
        ((AnonymousClass0ZU) obj).invoke();
    }

    public static void A1I(Object obj) {
        C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.String");
    }

    public static void A1K(Object obj, int i, Object obj2) {
        ((C35189Ipf) obj2).A0B = new IDxListenerShape412S0100000_1_I2(obj, i);
    }

    public static void A1M(Object obj, Object obj2, KtCImplShape1S0401000_I2_1 ktCImplShape1S0401000_I2_1, int i) {
        ktCImplShape1S0401000_I2_1.A01 = obj;
        ktCImplShape1S0401000_I2_1.A02 = obj2;
        ktCImplShape1S0401000_I2_1.A00 = i;
    }

    public static void A1N(Object obj, AbstractCollection abstractCollection, int i) {
        if ((i ^ 1) != 0) {
            abstractCollection.add(obj);
        }
    }

    public static boolean A1R(int i, boolean z) {
        if (i != 0) {
            return false;
        }
        return z;
    }

    public static boolean A1W(Object obj) {
        return "user".equals(obj);
    }

    public static int A01(Context context, int i) {
        return (int) C09860go.A03(context, i);
    }

    public static int A02(Context context, int i) {
        return AnonymousClass8bA.A02(C09860go.A03(context, i));
    }

    public static int A03(Uri uri) {
        return uri.getPathSegments().size();
    }

    public static int A04(View view, int i) {
        return view.getResources().getDimensionPixelSize(i);
    }

    public static int A05(AnonymousClass0A3 r0, Number number, String str, String str2) {
        r0.A0T(str, str2);
        return number.intValue();
    }

    public static int A06(Number number, int i) {
        C04220Ms.A0B(number, i);
        return number.intValue();
    }

    public static long A09(long j) {
        return System.currentTimeMillis() - j;
    }

    public static Context A0A(Fragment fragment, Object obj, int i) {
        C04220Ms.A0B(obj, i);
        return fragment.requireContext();
    }

    public static Parcelable A0D(Bundle bundle, String str) {
        Parcelable parcelable = bundle.getParcelable(str);
        parcelable.getClass();
        return parcelable;
    }

    public static ViewGroup A0G(View view, int i) {
        return (ViewGroup) view.findViewById(i);
    }

    public static ImmutableList A0J(AbstractMap abstractMap) {
        return ImmutableList.copyOf(abstractMap.values());
    }

    public static BusinessNavBar A0N(View view) {
        return (BusinessNavBar) view.requireViewById(R.id.navigation_bar);
    }

    public static H8Q A0O(Context context, AnonymousClass066 r3) {
        return new H8Q(context, AnonymousClass06E.A00(r3));
    }

    public static AnonymousClass49Y A0P(C04530Oa r0) {
        return (AnonymousClass49Y) r0.getValue();
    }

    public static IgdsHeadline A0S(View view, int i) {
        return (IgdsHeadline) view.requireViewById(i);
    }

    public static NotificationBar A0U(View view) {
        return (NotificationBar) view.findViewById(R.id.notification_bar);
    }

    public static C41840MeW A0W(UserSession userSession, C04620Ok r1) {
        return r1.A01(userSession).A05;
    }

    public static Integer A0Y(TreeJNI treeJNI, String str) {
        return Integer.valueOf(treeJNI.getIntValue(str));
    }

    public static Object A0Z(DirectInboxFlags directInboxFlags, String str) {
        return directInboxFlags.getBooleanFlag(str).getCurrentValue();
    }

    public static Object A0a(Class cls, String str, C36975Ji8 ji8, AnonymousClass76V r3) {
        return ji8.A00(str, AnonymousClass72C.A00(C03970Ls.A00(cls), r3));
    }

    public static String A0c(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return readString;
    }

    public static String A0d(Fragment fragment) {
        return C09140ev.A00(fragment.getContext());
    }

    public static String A0e(UserSession userSession, C04620Ok r1) {
        return r1.A01(userSession).A17();
    }

    public static String A0f(Object obj, AbstractMap abstractMap) {
        return (String) abstractMap.get(obj);
    }

    public static void A0q(Context context, TypedArray typedArray, TextView textView, int i) {
        int resourceId = typedArray.getResourceId(i, i);
        if (resourceId != 0) {
            textView.setText(context.getText(resourceId));
        }
    }

    public static void A0r(Context context, ImageView imageView, int i) {
        imageView.setColorFilter(context.getColor(i));
    }

    public static void A0s(DialogInterface.OnClickListener onClickListener, C25828Dsm dsm, int i, boolean z) {
        dsm.A0N(onClickListener, i);
        dsm.A0q(z);
        dsm.A0r(z);
    }

    public static void A0u(Bundle bundle, Fragment fragment, C25786Drz drz) {
        drz.A0A(bundle, fragment);
        drz.A08();
        drz.A05();
    }

    public static void A0v(Parcel parcel, Number number) {
        parcel.writeLong(number.longValue());
    }

    public static void A0x(ViewGroup viewGroup, Iterator it) {
        viewGroup.addView((View) it.next());
    }

    public static void A11(C12560m7 r0, String str) {
        AnonymousClass099 r02 = (AnonymousClass099) r0.A0O(str);
        if (r02 != null) {
            r02.A07();
        }
    }

    public static void A12(RecyclerView recyclerView, C04530Oa r2) {
        recyclerView.setAdapter((C41030Luu) r2.getValue());
    }

    public static void A14(AnonymousClass0A3 r2, C11630kW r3) {
        r2.A0T("containermodule", r3.getModuleName());
    }

    public static void A1E(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 1;
    }

    public static void A1F(Enum enumR, int[] iArr) {
        iArr[enumR.ordinal()] = 2;
    }

    public static void A1J(Object obj, int i, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 10);
    }

    public static void A1L(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
        obj3.getClass();
    }

    public static void A1O(Object obj, C146368m8 r1) {
        r1.D7w(obj);
        r1.ADR((Throwable) null);
    }

    public static void A1P(String str, String str2, StringBuilder sb) {
        sb.append(AnonymousClass00U.A0L(str, str2));
    }

    public static void A1Q(AbstractCollection abstractCollection, Object[] objArr) {
        abstractCollection.addAll(Arrays.asList(objArr));
    }

    public static boolean A1T(BaseBundle baseBundle, String str) {
        return TextUtils.isEmpty(baseBundle.getString(str));
    }

    public static boolean A1U(Fragment fragment) {
        return fragment.requireActivity().isFinishing();
    }

    public static boolean A1V(CharSequence charSequence, Pattern pattern) {
        return pattern.matcher(charSequence).matches();
    }

    public static Object[] A1b(long j) {
        return new Object[]{Long.valueOf(j)};
    }
}
