package X;

import android.app.Dialog;
import android.app.NotificationManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.pando.TreeJNI;
import com.facebook.redex.IDxCListenerShape48S0300000_1_I2;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.facebook.redex.IDxDListenerShape328S0100000_1_I2;
import com.facebook.redex.IDxFCallbackShape313S0100000_1_I2;
import com.facebook.redex.IDxObserverShape98S0200000_1_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint;
import com.instagram.api.schemas.ShowreelNativeClientName;
import com.instagram.barcelona.R;
import com.instagram.business.controller.datamodel.BusinessConversionStep;
import com.instagram.business.controller.datamodel.ConversionStep;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.switchbutton.IgSwitch;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.KtCImplShape0S0601000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape10S0101000_I2_7;
import kotlin.jvm.internal.KtLambdaShape26S0200000_I2_10;
import kotlin.jvm.internal.KtLambdaShape63S0100000_I2_43;
import kotlin.jvm.internal.KtLambdaShape69S0100000_I2_49;
import kotlin.jvm.internal.KtLambdaShape70S0100000_I2_50;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0wR  reason: invalid class name and case insensitive filesystem */
public final class C18250wR {
    public static int A02(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        return i2 + 1;
    }

    public static SimpleWebViewConfig A0P(String str, String str2) {
        return new SimpleWebViewConfig(str, (String) null, str2, (String) null, false, false, false, false, false, true, false, true, false, false, false);
    }

    public static void A14(MMo mMo, Object[] objArr, int i) {
        objArr[i] = C19527Axo.A01(mMo, false);
    }

    public static void A18(C25786Drz drz) {
        drz.A0C = false;
        drz.A08();
    }

    public static Object[] A1L() {
        return new Object[4];
    }

    public static NotificationManager A03(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    public static Intent A04(Context context, Class cls) {
        return new Intent(context, cls);
    }

    public static Intent A05(String str) {
        return new Intent(str);
    }

    public static Bundle A07(Fragment fragment) {
        Bundle bundle = fragment.mArguments;
        bundle.getClass();
        return bundle;
    }

    public static Handler A08() {
        return new Handler();
    }

    public static TextView A0A(Object obj) {
        C04220Ms.A0C(obj, "null cannot be cast to non-null type android.widget.TextView");
        return (TextView) obj;
    }

    public static IDxCListenerShape48S0300000_1_I2 A0E(Object obj, Object obj2, Object obj3, int i) {
        return new IDxCListenerShape48S0300000_1_I2(i, obj, obj2, obj3);
    }

    public static IGCreatorIncentiveProgramFetchEntryPoint A0H(String str, String str2, int i) {
        return new IGCreatorIncentiveProgramFetchEntryPoint(str, i, str2);
    }

    public static ShowreelNativeClientName A0I(String str, int i) {
        return new ShowreelNativeClientName(str, i, str);
    }

    public static E5N A0J(AnonymousClass0gW r1, int i) {
        return new E5N(r1, i);
    }

    public static SimpleImageUrl A0K(String str) {
        return new SimpleImageUrl(str);
    }

    public static C23151ca A0O(Bundle bundle) {
        C23151ca r0 = new C23151ca();
        r0.setArguments(bundle);
        return r0;
    }

    public static RuntimeException A0V(String str) {
        return new RuntimeException(str);
    }

    public static String A0W(SharedPreferences sharedPreferences, String str) {
        return sharedPreferences.getString(str, "");
    }

    public static String A0X(TreeJNI treeJNI) {
        return treeJNI.getStringValue("id");
    }

    public static String A0Y(TreeJNI treeJNI) {
        return treeJNI.getStringValue("uri");
    }

    public static String A0Z(AnonymousClass48S r0) {
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    public static String A0b(byte[] bArr) {
        return new String(bArr);
    }

    public static KtLambdaShape26S0200000_I2_10 A0d(Object obj, Object obj2, int i) {
        return new KtLambdaShape26S0200000_I2_10(i, obj, obj2);
    }

    public static KtLambdaShape63S0100000_I2_43 A0e(Object obj, int i) {
        return new KtLambdaShape63S0100000_I2_43(obj, i);
    }

    public static KtLambdaShape69S0100000_I2_49 A0f(Object obj, int i) {
        return new KtLambdaShape69S0100000_I2_49(obj, i);
    }

    public static KtLambdaShape70S0100000_I2_50 A0g(Object obj, int i) {
        return new KtLambdaShape70S0100000_I2_50(obj, i);
    }

    public static C134697yC A0h(String str) {
        return new C134697yC(str);
    }

    public static JSONArray A0i() {
        return new JSONArray();
    }

    public static JSONObject A0j(String str) {
        return new JSONObject(str);
    }

    public static void A0k() {
        C04220Ms.A0E("plugin");
    }

    public static void A0l() {
        C04220Ms.A0E("session");
    }

    public static void A0m() {
        C04220Ms.A0E("response");
    }

    public static void A0o(Intent intent, int i, Bundle bundle) {
        bundle.putInt("business_account_flow", i);
        intent.putExtras(bundle);
    }

    public static void A0s(View view, OneTapLoginLandingFragment oneTapLoginLandingFragment, C62733ac r3, int i) {
        view.setOnClickListener(new IDxCListenerShape70S0200000_1_I2(oneTapLoginLandingFragment, r3, i));
    }

    public static void A0t(TextView textView) {
        textView.setText("");
    }

    public static void A0v(AnonymousClass066 r1, M5J m5j, Object obj, Object obj2, int i) {
        m5j.A0C(r1, new IDxObserverShape98S0200000_1_I2(i, obj, obj2));
    }

    public static void A0w(AnonymousClass0A3 r1, Boolean bool) {
        r1.A0Q("user_attempted_client_setting", bool);
        r1.Bb4();
    }

    public static void A0x(AnonymousClass0A3 r1, Long l) {
        r1.A0S("creator_igid", l);
    }

    public static void A0y(AnonymousClass0A3 r1, String str) {
        r1.A0T("waterfall_id", str);
    }

    public static void A0z(AnonymousClass0A3 r1, String str) {
        r1.A0T("origin", str);
        r1.Bb4();
    }

    public static void A11(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, String str, Map map) {
        uSLEBaseShape0S0000000.A0T("entrypoint", str);
        uSLEBaseShape0S0000000.A1h(map);
    }

    public static void A12(C146418mD r1, C31580Grx grx, Object obj, int i) {
        grx.AMA(r1, new IDxFCallbackShape313S0100000_1_I2(obj, i));
    }

    public static void A15(ImmutableList.Builder builder, C313525q r2, ConversionStep conversionStep) {
        builder.add((Object) new BusinessConversionStep(r2, conversionStep));
    }

    public static void A16(H1T h1t) {
        h1t.A0F(AnonymousClass006.A01);
    }

    public static void A17(H1T h1t, String str) {
        h1t.A0O("user_id", str);
    }

    public static void A19(C15730rn r1, String str) {
        r1.A0D(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
    }

    public static void A1A(C37032Jj9 jj9, Object obj, int i) {
        jj9.A0J = new IDxDListenerShape328S0100000_1_I2(obj, i);
    }

    public static void A1C(Object obj) {
        ((Dialog) obj).dismiss();
    }

    public static void A1D(Object obj, Object obj2, Object obj3, KtCImplShape0S0601000_I2 ktCImplShape0S0601000_I2, int i) {
        ktCImplShape0S0601000_I2.A02 = obj;
        ktCImplShape0S0601000_I2.A03 = obj2;
        ktCImplShape0S0601000_I2.A04 = obj3;
        ktCImplShape0S0601000_I2.A00 = i;
    }

    public static void A1E(Object obj, AbstractMap abstractMap) {
        abstractMap.put("page_id", obj);
    }

    public static boolean A1H(BaseBundle baseBundle, String str, boolean z) {
        boolean z2 = z | true;
        baseBundle.putString("extra", str);
        return z2;
    }

    public static int A00(Resources resources) {
        return resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
    }

    public static int A01(C10300i6 r0) {
        return C05030Qo.A01(r0).A0B();
    }

    public static SharedPreferences.Editor A06(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        C04220Ms.A06(edit);
        return edit;
    }

    public static View A09(Fragment fragment) {
        return fragment.requireActivity().getCurrentFocus();
    }

    public static C12560m7 A0B(Fragment fragment) {
        return fragment.requireActivity().getSupportFragmentManager();
    }

    public static C126197ek A0C(C10300i6 r0) {
        return C131607sT.A00(r0).A00;
    }

    public static AnonymousClass0TJ A0D(Object obj, int i) {
        C04220Ms.A0B(obj, i);
        return AnonymousClass0TJ.A05;
    }

    public static ImmutableList A0F(ImmutableList.Builder builder) {
        ImmutableList build = builder.build();
        C04220Ms.A06(build);
        return build;
    }

    public static C1366783w A0G(TreeJNI treeJNI, Class cls, String str) {
        return treeJNI.getTreeList(str, cls).iterator();
    }

    public static IgTextView A0L(View view, int i) {
        return (IgTextView) view.requireViewById(i);
    }

    public static IgImageView A0M(View view, int i) {
        return (IgImageView) view.requireViewById(i);
    }

    public static IgSwitch A0N(View view, int i) {
        return (IgSwitch) view.requireViewById(i);
    }

    public static C62733ac A0Q(Iterator it) {
        return (C62733ac) it.next();
    }

    public static User A0R(UserSession userSession) {
        return C04620Ok.A00(userSession).A00;
    }

    public static Boolean A0S(TreeJNI treeJNI, String str) {
        return Boolean.valueOf(treeJNI.getBooleanValue(str));
    }

    public static Long A0T(Parcel parcel) {
        return Long.valueOf(parcel.readLong());
    }

    public static Object A0U(Object obj, KtSLambdaShape10S0101000_I2_7 ktSLambdaShape10S0101000_I2_7) {
        AnonymousClass0OU.A00(obj);
        return ktSLambdaShape10S0101000_I2_7.A01;
    }

    public static String A0a(User user) {
        return user.B4M().getUrl();
    }

    public static Set A0c(Object obj) {
        Set singleton = Collections.singleton(obj);
        C04220Ms.A06(singleton);
        return singleton;
    }

    public static void A0n(ClipboardManager clipboardManager, CharSequence charSequence, CharSequence charSequence2) {
        clipboardManager.setPrimaryClip(ClipData.newPlainText(charSequence, charSequence2));
    }

    public static void A0p(SharedPreferences.Editor editor, String str, Set set) {
        editor.putStringSet(str, set).apply();
    }

    public static void A0q(BaseBundle baseBundle, TextView textView, String str) {
        textView.setText(baseBundle.getString(str));
    }

    public static void A0r(View view, C25553Dnn dnn) {
        dnn.A01(view);
        dnn.A03(D0f.BELOW_ANCHOR);
    }

    public static void A0u(C41026Luf luf) {
        C13950oZ.A00(luf.A00());
    }

    public static void A10(AnonymousClass0A3 r1, String str, String str2, String str3) {
        r1.A0T(str, str2);
        r1.A0T("media_id", str3);
    }

    public static void A13(C14090on r0, String str, int i) {
        r0.ABJ(str, i).report();
    }

    public static void A1B(C37032Jj9 jj9, boolean z) {
        jj9.A0M = Boolean.valueOf(z);
    }

    public static void A1F(Object obj, Map map, int i) {
        map.put(Integer.valueOf(i), obj);
    }

    public static void A1G(String str, String str2, String str3) {
        C10450iM.A03(str3, AnonymousClass00U.A0L(str, str2));
    }

    public static boolean A1I(EditText editText) {
        return TextUtils.isEmpty(editText.getText());
    }

    public static boolean A1J(UserSession userSession, Object obj) {
        return C04220Ms.A0I(obj, userSession.getUserId());
    }

    public static boolean A1K(AbstractCollection abstractCollection) {
        return !abstractCollection.isEmpty();
    }
}
