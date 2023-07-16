package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.impl.auth.NTLMEngineImpl;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.dextricks.DalvikConstants;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.dcp.signals.persistence.roomimpl.ig4a.RoomSignalsDatabase;
import com.facebook.forker.Process;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0130000_I2;
import com.facebook.pando.TreeJNI;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.IDxCListenerShape203S0100000_2_I2;
import com.facebook.redex.IDxCListenerShape71S0200000_2_I2;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.facebook.redex.IDxHelperShape71S0000000_2_I2;
import com.facebook.redex.IDxHelperShape72S0000000_2_I2_1;
import com.facebook.redex.IDxObserverShape211S0100000_2_I2;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.fragment.model.FeatureConfiguration;
import com.facebookpay.form.fragment.model.FormLoggingEvents;
import com.facebookpay.form.fragment.model.FormParams;
import com.facebookpay.form.fragment.model.ListCellParams;
import com.fbpay.logging.FBPayLoggerData;
import com.fbpay.logging.LoggingContext;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import com.mapbox.mapboxsdk.maps.MapboxMapOptions;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2;
import kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2;
import kotlin.coroutines.jvm.internal.KtCImplShape1S0501000_I2;
import kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2;
import kotlin.coroutines.jvm.internal.KtCImplShape2S0301000_I2_1;
import kotlin.coroutines.jvm.internal.KtCImplShape3S0201000_I2_1;
import kotlin.coroutines.jvm.internal.KtCImplShape4S0201000_I2_2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0100000_I2;
import kotlin.jvm.internal.KtLambdaShape23S0100000_I2_3;
import kotlin.jvm.internal.KtLambdaShape68S0100000_I2_48;

/* renamed from: X.4wH  reason: invalid class name and case insensitive filesystem */
public final class C86104wH {
    public static int A09(Parcel parcel) {
        C04220Ms.A0B(parcel, 0);
        return parcel.readInt();
    }

    public static RectF A0E(List list) {
        if (list.size() < 4) {
            return new RectF();
        }
        return new RectF(Float.parseFloat((String) list.get(0)), Float.parseFloat((String) list.get(1)), Float.parseFloat((String) list.get(2)), Float.parseFloat((String) list.get(3)));
    }

    public static AnonymousClass3HX A0V(C63893iY r1) {
        C04220Ms.A0B(r1, 0);
        Object A0H = r1.A0H(0);
        C04220Ms.A0C(A0H, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        return (AnonymousClass3HX) A0H;
    }

    public static C63893iY A0W(Object obj) {
        AnonymousClass3VO r0 = new AnonymousClass3VO();
        r0.A02(obj, 0);
        return r0.A01();
    }

    public static User A0Z(AnonymousClass0A3 r4, C11630kW r5, BKU bku, String str) {
        r4.A0T("nav_chain", str);
        BKN bkn = bku.A0f;
        String str2 = bkn.A4Y.split("[_@]")[0];
        C04220Ms.A06(str2);
        r4.A0S("media_id", Long.valueOf(Long.parseLong(str2)));
        r4.A0T("container_module", r5.getModuleName());
        return bkn.A1i;
    }

    public static Object A0g(Object obj, Object obj2, AnonymousClass0YP r3) {
        C04220Ms.A0B(r3, 2);
        return r3.invoke(obj, obj2);
    }

    public static Object A0p(String str, Class cls) {
        return cls.getMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    public static String A0q(Parcel parcel) {
        C04220Ms.A0B(parcel, 0);
        return parcel.readString();
    }

    public static String A0s(TreeJNI treeJNI, Class cls, String str) {
        if (treeJNI.getTreeValue(str, cls) != null) {
            return treeJNI.getTreeValue(str, cls).getStringValue("text");
        }
        return null;
    }

    public static void A19(IBinder iBinder, Parcel parcel, Parcel parcel2, int i) {
        iBinder.transact(i, parcel, parcel2, 0);
        parcel2.readException();
    }

    public static void A1A(Parcel parcel, Parcelable parcelable, int i, int i2) {
        parcel.writeInt(1);
        int dataPosition = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(i2);
        parcel.writeInt(dataPosition2 - dataPosition);
        parcel.setDataPosition(dataPosition2);
    }

    public static boolean A1Y(MapboxMapOptions mapboxMapOptions) {
        mapboxMapOptions.A07 = true;
        mapboxMapOptions.A09 = true;
        mapboxMapOptions.A04 = 8388661;
        mapboxMapOptions.A0A = true;
        mapboxMapOptions.A05 = 8388691;
        mapboxMapOptions.A03 = -1;
        mapboxMapOptions.A06 = true;
        mapboxMapOptions.A02 = 8388691;
        mapboxMapOptions.A01 = 0.0d;
        mapboxMapOptions.A00 = 25.5d;
        mapboxMapOptions.A0D = true;
        mapboxMapOptions.A0E = true;
        mapboxMapOptions.A0F = true;
        mapboxMapOptions.A0G = true;
        mapboxMapOptions.A08 = true;
        mapboxMapOptions.A0C = true;
        mapboxMapOptions.A0B = true;
        return true;
    }

    public static boolean A1Z(C86074wE r7) {
        Object value = r7.getValue();
        KtCSuperShape0S0130000_I2 ktCSuperShape0S0130000_I2 = (KtCSuperShape0S0130000_I2) value;
        AnonymousClass5Im r3 = (AnonymousClass5Im) ktCSuperShape0S0130000_I2.A00;
        boolean z = ktCSuperShape0S0130000_I2.A03;
        boolean z2 = ktCSuperShape0S0130000_I2.A02;
        C04220Ms.A0B(r3, 0);
        return r7.ADi(value, new KtCSuperShape0S0130000_I2(r3, z, z2, true));
    }

    public static float A00(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static int A01(int i) {
        return i != 0 ? 1048576 : 524288;
    }

    public static int A02(int i) {
        if (i != 0) {
            return NTLMEngineImpl.FLAG_NEGOTIATE_128;
        }
        return 268435456;
    }

    public static int A03(int i) {
        return i != 0 ? 67108864 : 33554432;
    }

    public static int A04(int i) {
        if (i != 0) {
            return DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE;
        }
        return 4194304;
    }

    public static int A06(int i, long j) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static int A07(long j) {
        return (int) (j >> 32);
    }

    public static long A0D(AnonymousClass0A3 r2, UserSession userSession, String str) {
        r2.A0T("entry_point", str);
        r2.A0Q("is_employee", Boolean.valueOf(C19573AyZ.A03(userSession)));
        String A14 = C04620Ok.A00(userSession).A00.A14();
        if (A14 != null) {
            return Long.parseLong(A14);
        }
        return 0;
    }

    public static TypedValue A0G(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue;
    }

    public static C147188nY A0H(Object obj, Object obj2) {
        C147188nY r0 = (C147188nY) obj;
        ((Number) obj2).intValue();
        return r0;
    }

    public static C111686o9 A0J(Object obj) {
        if (obj instanceof C012605w) {
            return ((C012605w) obj).getDefaultViewModelCreationExtras();
        }
        return C884658e.A00;
    }

    public static AnonymousClass0A2 A0K(Object obj, String str) {
        C13330nS r1 = (C13330nS) obj;
        return r1.A03(r1.A00, str);
    }

    public static USLEBaseShape0S0000000 A0L(AnonymousClass0A2 r3, String str, String str2, String str3, int i) {
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = new USLEBaseShape0S0000000(r3, i);
        uSLEBaseShape0S0000000.A0T("flow_name", str);
        uSLEBaseShape0S0000000.A0T("flow_step", str2);
        uSLEBaseShape0S0000000.A0T("event_name", str3);
        uSLEBaseShape0S0000000.A0T("event_type", DexOptimization.OPT_KEY_CLIENT);
        return uSLEBaseShape0S0000000;
    }

    public static C67463zb A0M(GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S0000000, GQLCallInputCInputShape0S0000000 gQLCallInputCInputShape0S00000002, String str, Map map) {
        gQLCallInputCInputShape0S0000000.A0F(str, "family_name");
        gQLCallInputCInputShape0S0000000.A0F((String) map.get("address-line1"), "address_line1");
        gQLCallInputCInputShape0S0000000.A0F((String) map.get("address-line2"), "address_line2");
        gQLCallInputCInputShape0S0000000.A0F((String) map.get("address-level1"), "address_level1");
        gQLCallInputCInputShape0S0000000.A0F((String) map.get("address-level2"), "address_level1");
        gQLCallInputCInputShape0S0000000.A0F((String) map.get("postal-code"), "postal_code");
        gQLCallInputCInputShape0S0000000.A0F((String) map.get("country"), "country_name");
        gQLCallInputCInputShape0S0000000.A0F((String) map.get("email"), "email");
        gQLCallInputCInputShape0S0000000.A0F((String) map.get("tel"), "tel");
        gQLCallInputCInputShape0S00000002.A0B(gQLCallInputCInputShape0S0000000, "data");
        C67463zb r1 = new C67463zb();
        r1.A02(gQLCallInputCInputShape0S00000002, "request");
        return r1;
    }

    public static C146698mi A0N(Object obj) {
        C146698mi r1 = (C146698mi) obj;
        C04220Ms.A0B(r1, 0);
        return r1;
    }

    public static IDxFlowShape93S0200000_1_I2 A0O(C31082GfJ gfJ, int i) {
        gfJ.A04 = -1L;
        return new IDxFlowShape93S0200000_1_I2((AnonymousClass0YP) new KtSLambdaShape11S0100000_I2(45, (C146958n9) null), C04220Ms.A0B(gfJ.A04(), 0), 2);
    }

    public static FormParams A0P(FormParams formParams, Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        FormParams formParams2 = formParams;
        int i = formParams2.A04;
        String str = formParams2.A0H;
        int i2 = formParams2.A06;
        Integer num = formParams2.A0F;
        Integer num2 = formParams2.A0E;
        FormLoggingEvents formLoggingEvents = formParams2.A09;
        AnonymousClass697 r15 = formParams2.A0B;
        int i3 = formParams2.A03;
        int i4 = formParams2.A00;
        int i5 = formParams2.A02;
        int i6 = formParams2.A01;
        ListCellParams listCellParams = formParams2.A0A;
        FeatureConfiguration featureConfiguration = formParams2.A08;
        Integer num3 = formParams2.A0G;
        List list = formParams2.A0J;
        CellParams cellParams = formParams2.A07;
        Integer num4 = formParams2.A0D;
        int i7 = formParams2.A05;
        AnonymousClass69W r2 = formParams2.A0C;
        boolean z = formParams2.A0L;
        Integer num5 = num2;
        String str2 = str;
        int i8 = i;
        return new FormParams(cellParams, featureConfiguration, formLoggingEvents, listCellParams, r15, r2, num, num5, num3, num4, str2, arrayList, list, formParams2.A0K, i8, i2, i3, i4, i5, i6, i7, z);
    }

    public static AnonymousClass7Kx A0S(Object obj) {
        AnonymousClass7Kx r1 = (AnonymousClass7Kx) obj;
        C04220Ms.A0B(r1, 0);
        return r1;
    }

    public static C32165H8c A0U(C10300i6 r3, Iterable iterable) {
        String A04 = C31015GdW.A00(BasicHeaderValueParser.ELEM_DELIMITER).A04(iterable);
        H1T h1t = new H1T(r3);
        h1t.A0F(AnonymousClass006.A0N);
        h1t.A0J("media/infos/");
        h1t.A0O("media_ids", A04);
        h1t.A0O("ranked_content", "true");
        h1t.A0O("include_inactive_reel", "true");
        h1t.A0B(C156169Me.class, C19265AtU.class);
        return h1t.A02();
    }

    public static IgRoomDatabase A0X(C144928jW r5, UserSession userSession) {
        Class<RoomSignalsDatabase> cls = RoomSignalsDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase != null) {
            return igRoomDatabase;
        }
        Context context = C10600ic.A00;
        C04220Ms.A06(context);
        C41012LuB A00 = C98506Fu.A00(context, cls, C120627Bu.A01(r5, userSession));
        AnonymousClass6UW.A00(A00, 439645738, 278132057, false);
        A00.A01();
        IgRoomDatabase igRoomDatabase2 = (IgRoomDatabase) A00.A00();
        userSession.A04(cls, igRoomDatabase2);
        return igRoomDatabase2;
    }

    public static Object A0b(C147188nY r1, AnonymousClass7W3 r2, Object obj, Object obj2, Object obj3) {
        if (obj != obj2) {
            return obj3;
        }
        AnonymousClass7WN r0 = new AnonymousClass7WN(AnonymousClass7K5.A00(r1, AnonymousClass869.A00));
        r2.A14(r0);
        return r0;
    }

    public static Object A0d(MMo mMo, int i) {
        return C25563Dnz.A02(mMo, new IDxHelperShape71S0000000_2_I2(i));
    }

    public static Object A0e(MMo mMo, int i) {
        return C25563Dnz.A02(mMo, new IDxHelperShape72S0000000_2_I2_1(i));
    }

    public static Object A0f(Object obj) {
        return ((C81784oM) obj).getValue();
    }

    public static Object A0i(Object obj, KtCImplShape0S0401000_I2 ktCImplShape0S0401000_I2) {
        ktCImplShape0S0401000_I2.A03 = obj;
        ktCImplShape0S0401000_I2.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape0S0401000_I2.A04;
    }

    public static Object A0j(Object obj, KtCImplShape1S0301000_I2 ktCImplShape1S0301000_I2) {
        ktCImplShape1S0301000_I2.A02 = obj;
        ktCImplShape1S0301000_I2.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape1S0301000_I2.A03;
    }

    public static Object A0k(Object obj, KtCImplShape1S0501000_I2 ktCImplShape1S0501000_I2) {
        ktCImplShape1S0501000_I2.A04 = obj;
        ktCImplShape1S0501000_I2.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape1S0501000_I2.A05;
    }

    public static Object A0l(Object obj, KtCImplShape2S0201000_I2 ktCImplShape2S0201000_I2) {
        ktCImplShape2S0201000_I2.A01 = obj;
        ktCImplShape2S0201000_I2.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape2S0201000_I2.A02;
    }

    public static Object A0m(Object obj, KtCImplShape2S0301000_I2_1 ktCImplShape2S0301000_I2_1) {
        ktCImplShape2S0301000_I2_1.A02 = obj;
        ktCImplShape2S0301000_I2_1.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape2S0301000_I2_1.A03;
    }

    public static Object A0n(Object obj, KtCImplShape3S0201000_I2_1 ktCImplShape3S0201000_I2_1) {
        ktCImplShape3S0201000_I2_1.A01 = obj;
        ktCImplShape3S0201000_I2_1.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape3S0201000_I2_1.A02;
    }

    public static Object A0o(Object obj, KtCImplShape4S0201000_I2_2 ktCImplShape4S0201000_I2_2) {
        ktCImplShape4S0201000_I2_2.A01 = obj;
        ktCImplShape4S0201000_I2_2.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape4S0201000_I2_2.A02;
    }

    public static String A0v(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("|   mediatorLoadStates: ");
        sb.append(obj);
        sb.append(10);
        return sb.toString();
    }

    public static UnsupportedOperationException A12(Object obj) {
        StringBuilder sb = new StringBuilder("Wrong view binded in: ");
        sb.append(obj.getClass());
        return new UnsupportedOperationException(sb.toString());
    }

    public static HashSet A13(HashSet hashSet, Set set) {
        if (set.contains("sessionId")) {
            return hashSet;
        }
        HashSet hashSet2 = new HashSet(set);
        hashSet2.add("sessionId");
        return hashSet2;
    }

    public static C04530Oa A15(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape23S0100000_I2_3(obj, i));
    }

    public static C04530Oa A16(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape68S0100000_I2_48(obj, i));
    }

    public static void A1C(View view, int i, Object obj) {
        view.setOnClickListener(new IDxCListenerShape203S0100000_2_I2(obj, i));
    }

    public static void A1D(View view, int i, Object obj, Object obj2) {
        view.setOnClickListener(new IDxCListenerShape71S0200000_2_I2(i, obj, obj2));
    }

    public static void A1F(AnonymousClass066 r1, M5J m5j, int i) {
        m5j.A0C(r1, new IDxObserverShape211S0100000_2_I2((Object) r1, i));
    }

    public static void A1G(C021109v r1, AnonymousClass0A3 r2) {
        r2.A0O(r1, "product_type");
        r2.A0O(AnonymousClass28E.ANDROID, "platform");
        r2.A0S("actual_event_time", Long.valueOf(System.currentTimeMillis()));
    }

    public static void A1H(AnonymousClass0A2 r2, AnonymousClass0V3 r3, int i) {
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = new USLEBaseShape0S0000000(r2, i);
        if (uSLEBaseShape0S0000000.A00.isSampled()) {
            uSLEBaseShape0S0000000.A0P(r3, "event_payload");
            uSLEBaseShape0S0000000.Bb4();
        }
    }

    public static void A1I(AnonymousClass0A2 r3, AnonymousClass0V3 r4, String str, Map map, int i) {
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = new USLEBaseShape0S0000000(r3, i);
        if (uSLEBaseShape0S0000000.A00.isSampled()) {
            uSLEBaseShape0S0000000.A0T(C61953Wm.A01(52, 10, 34), str);
            uSLEBaseShape0S0000000.A0O(C122017Jn.A00, "product_type");
            uSLEBaseShape0S0000000.A0O(C122017Jn.A01, "platform");
            uSLEBaseShape0S0000000.A0S("actual_event_time", Long.valueOf(System.currentTimeMillis()));
            uSLEBaseShape0S0000000.A0P(r4, "event_payload");
            uSLEBaseShape0S0000000.A1g(map);
            uSLEBaseShape0S0000000.Bb4();
        }
    }

    public static void A1J(AnonymousClass0A3 r4, String str) {
        r4.A0T("action", str);
        String obj = UUID.randomUUID().toString();
        C04220Ms.A06(obj);
        r4.A0T(AnonymousClass3Q6.A00(9, 10, 56), obj);
    }

    public static void A1K(AnonymousClass0V3 r2, LoggingContext loggingContext) {
        r2.A09("product_id", Long.valueOf(loggingContext.A00));
    }

    public static void A1Q(Object obj, Object obj2, Object obj3) {
        C04220Ms.A0B(obj, 9);
        C04220Ms.A0B(obj2, 10);
        C04220Ms.A0B(obj3, 11);
    }

    public static void A1S(Object obj, AnonymousClass0YP r2, int i) {
        r2.invoke(obj, Integer.valueOf(i & 14));
    }

    public static void A1T(String str, String str2, int i, Throwable th) {
        AnonymousClass0LU.A0E(str, str2, th);
        C14100oo ABJ = C10770iu.A00().ABJ(str, i);
        ABJ.A8U("error", str2);
        ABJ.Ciu(th);
        ABJ.report();
    }

    public static void A1V(Map map, boolean z) {
        if (z) {
            map.put("is_reload", String.valueOf(z));
        }
    }

    public static String[] A1a() {
        return new String[]{"full_name", "is_private", "is_verified", "pk", "pk_id", "profile_pic_id", "profile_pic_url", AnonymousClass3Q4.A00(19, 8, 94)};
    }

    public static String[] A1b() {
        return new String[]{"full_name", "is_private", "is_verified", "pk", "pk_id", "profile_pic_id", "profile_pic_url", C61943Wl.A01(31, 8, 29)};
    }

    public static int A05(int i, float f) {
        return (i + Float.floatToIntBits(f)) * 31;
    }

    public static int A0A(Object obj) {
        return String.valueOf(obj).length();
    }

    public static int A0B(List list) {
        return list.size() - 1;
    }

    public static long A0C(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
    }

    public static Parcelable A0F(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static ParcelableSnapshotMutableState A0I(C142848fh r1, Object obj, String str) {
        C04220Ms.A0C(r1, str);
        return new ParcelableSnapshotMutableState(r1, obj);
    }

    public static FBPayLoggerData A0Q(Bundle bundle) {
        bundle.getClass();
        Parcelable parcelable = bundle.getParcelable("logger_data");
        parcelable.getClass();
        return (FBPayLoggerData) parcelable;
    }

    public static AnonymousClass7Kx A0R(M5J m5j) {
        return (AnonymousClass7Kx) m5j.A08();
    }

    public static C32165H8c A0T(H1T h1t, String str, String str2) {
        h1t.A0O(str, str2);
        h1t.A0B(C85814vo.class, AnonymousClass3Za.class);
        return h1t.A02();
    }

    public static UserSession A0Y(AnonymousClass601 r1) {
        C10300i6 A0E = C63913ic.A0E(C63913ic.A0D(r1));
        C04220Ms.A0C(A0E, "null cannot be cast to non-null type com.instagram.service.session.UserSession");
        return (UserSession) A0E;
    }

    public static Enum A0a(TreeJNI treeJNI, Enum enumR, String str) {
        return TreeJNI.parseEnum(treeJNI.getStringValue(str), enumR);
    }

    public static Object A0c(MMp mMp, Map.Entry entry) {
        mMp.A0U((String) entry.getKey());
        return entry.getValue();
    }

    public static Object A0h(Object obj, Map map) {
        Object obj2 = map.get(obj);
        obj2.getClass();
        return obj2;
    }

    public static String A0r(Fragment fragment, AnonymousClass3XX r2) {
        C63813iO.A00(fragment.getContext(), 2131836068);
        Throwable th = r2.A01;
        if (th != null) {
            return th.getMessage();
        }
        return null;
    }

    public static String A0t(C2W c2w, Object obj) {
        C04220Ms.A06(obj);
        Product product = c2w.BDY().A00;
        C04220Ms.A0A(product);
        Merchant merchant = product.A00.A0C;
        if (merchant != null) {
            return merchant.A06;
        }
        return null;
    }

    public static String A0u(Object obj, String str) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() != 0) {
            return str.concat(valueOf);
        }
        return new String(str);
    }

    public static String A0w(Object obj, String str) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() != 0) {
            return str.concat(valueOf);
        }
        return new String(str);
    }

    public static String A0x(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static String A0y(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public static String A0z(Object obj, Throwable th) {
        String A0N = AnonymousClass00U.A0N(obj.getClass().getName(), Integer.toHexString(System.identityHashCode(obj)), '@');
        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(A0N), th);
        return AnonymousClass00U.A0h("<", A0N, " threw ", th.getClass().getName(), ">");
    }

    public static String A10(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String A11(String str, Locale locale, Object[] objArr, int i) {
        String format = String.format(locale, str, Arrays.copyOf(objArr, i));
        C04220Ms.A06(format);
        return format;
    }

    public static Iterator A14(Map map) {
        return map.values().iterator();
    }

    public static C27420EnC A17(C146958n9 r2) {
        C27420EnC enC = new C27420EnC(1, C25598DoY.A02(r2));
        enC.A0D();
        return enC;
    }

    public static void A18(Context context, Paint paint, int i) {
        paint.setColor(context.getColor(i));
    }

    public static void A1B(Parcel parcel, Enum enumR) {
        parcel.writeString(enumR.name());
    }

    public static void A1E(LazyListState lazyListState, C147188nY r13, List list, float f, int i) {
        int A00 = lazyListState.A00();
        if (A00 < list.size()) {
            AnonymousClass77C r5 = AnonymousClass77C.A00;
            C114796tu r0 = (C114796tu) list.get(A00);
            float f2 = r0.A00;
            float f3 = r0.A01;
            int i2 = i;
            C147188nY r6 = r13;
            r5.A00(r6, AnonymousClass7Kq.A0A(C97906Dk.A00(AnonymousClass7Kq.A03(AnonymousClass7KV.A08, Modifier.A00.Cx6(AnonymousClass7Kq.A02), 2), f2 + (f * f3), (float) i2), f3), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, i2, 6, 0);
        }
    }

    public static void A1L(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, C11630kW r4, BKU bku, UserSession userSession, String str) {
        B5H A01 = B5H.A01(str);
        AnonymousClass0A2 r2 = uSLEBaseShape0S0000000.A00;
        r2.A7c(A01, "media_owner_id");
        r2.A7c(B5H.A01(userSession.getUserId()), "actor_id");
        uSLEBaseShape0S0000000.A0O(bku.Aup().A00(), "media_type");
        uSLEBaseShape0S0000000.A0T("container_module", r4.getModuleName());
        uSLEBaseShape0S0000000.A1b(r4.getModuleName());
        uSLEBaseShape0S0000000.Bb4();
    }

    public static void A1M(GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000, String str, String str2, boolean z) {
        gQLCallInputCInputShape1S0000000.A0D(str, str2);
        gQLCallInputCInputShape1S0000000.A0C("is_default", Boolean.valueOf(z));
        gQLCallInputCInputShape1S0000000.A0D("FBPAY_HUB", "payment_type");
        gQLCallInputCInputShape1S0000000.A0D(C03480Iw.A00().toString(), "client_mutation_id");
    }

    public static void A1N(MMo mMo, Object[] objArr, int i) {
        objArr[i] = Long.valueOf(mMo.A0b());
    }

    public static void A1O(Number number, Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        if (number != null) {
            abstractMap.put("component_data_id", Long.valueOf(number.longValue()));
        }
    }

    public static void A1P(Object obj, int i, Object obj2) {
        C04220Ms.A0B(obj, i);
        C04220Ms.A0B(obj2, 7);
    }

    public static void A1R(Object obj, Object obj2, AnonymousClass0YM r3, int i) {
        r3.invoke(obj, obj2, Integer.valueOf(i));
    }

    public static void A1U(StringBuilder sb, float f) {
        sb.append(f);
        sb.append(", translationX=");
        sb.append(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        sb.append(", translationY=");
        sb.append(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        sb.append(", shadowElevation=");
        sb.append(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        sb.append(", rotationX=");
        sb.append(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        sb.append(", rotationY=");
        sb.append(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        sb.append(", rotationZ=");
    }

    public static boolean A1W(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static boolean A1X(C81784oM r0) {
        return ((Boolean) r0.getValue()).booleanValue();
    }

    public static int A08(long j) {
        return (int) (j & 4294967295L);
    }
}
