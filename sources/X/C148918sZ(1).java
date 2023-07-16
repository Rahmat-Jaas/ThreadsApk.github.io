package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.endtoend.EndToEnd;
import com.facebook.forker.Process;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0100100_I2;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.redex.IDxCListenerShape204S0100000_3_I2;
import com.facebook.redex.IDxCListenerShape448S0100000_3_I2;
import com.facebook.redex.IDxCListenerShape72S0200000_3_I2;
import com.facebook.redex.IDxHelperShape73S0000000_3_I2;
import com.facebook.redex.IDxHelperShape74S0000000_3_I2_1;
import com.facebook.redex.IDxHelperShape75S0000000_3_I2_2;
import com.facebook.redex.IDxHelperShape76S0000000_3_I2_3;
import com.facebook.redex.IDxHelperShape77S0000000_3_I2_4;
import com.facebook.redex.IDxHelperShape78S0000000_3_I2_5;
import com.facebook.redex.IDxHelperShape79S0000000_3_I2_6;
import com.facebook.redex.IDxPredicateShape353S0100000_3_I2;
import com.instagram.api.schemas.SettingId;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.persistence.CreationDatabase;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.roomdb.IgRoomDatabase;
import com.instagram.service.session.UserSession;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.KtCImplShape10S0201000_I2_8;
import kotlin.jvm.internal.KtLambdaShape124S0100000_I2_104;
import kotlin.jvm.internal.KtLambdaShape72S0100000_I2_52;

/* renamed from: X.8sZ  reason: invalid class name and case insensitive filesystem */
public final class C148918sZ {
    public static long A01(int i) {
        return ((long) Float.floatToRawIntBits((float) i)) | 9221683186994511872L;
    }

    public static MFM A05(LJ2 lj2, Integer num) {
        lj2.A05 = 0;
        lj2.A0Q = num;
        lj2.A04 = 1.0f;
        lj2.A0S = false;
        lj2.A0E = 0;
        lj2.A0B = Integer.MAX_VALUE;
        lj2.A0T = true;
        lj2.A0R = true;
        lj2.A02 = null;
        return lj2.A0A();
    }

    public static SubscriptionStickerDict A08(TreeJNI treeJNI, C112176p7 r4) {
        C21554BwI bwI = (C21554BwI) treeJNI.getTreeValueByHashCode(278043675, AnonymousClass9hJ.class);
        if (bwI != null) {
            return bwI.D2b(r4);
        }
        return null;
    }

    public static C32165H8c A0A(SettingId settingId, C10300i6 r7, String str) {
        H1T h1t = new H1T(r7, -2);
        h1t.A0F(AnonymousClass006.A01);
        h1t.A04();
        String A0d = AnonymousClass00U.A0d("api/", "v1/", "settings/", "set_string/");
        C04220Ms.A06(A0d);
        h1t.A0J(A0d);
        h1t.A0B(AnonymousClass9KO.class, C18608AiM.class);
        h1t.A0O("id", settingId.A00);
        h1t.A0O(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, str);
        C32165H8c A02 = h1t.A02();
        C04220Ms.A0C(A02, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.StringSettingResponse>>");
        return A02;
    }

    public static CurrencyAmountInfoImpl A0C(TreeJNI treeJNI, Class cls, String str) {
        TreeJNI treeValue = treeJNI.getTreeValue(str, cls);
        if (treeValue == null) {
            return null;
        }
        return new CurrencyAmountInfoImpl(Integer.valueOf(treeValue.getIntValue("offset")), treeValue.getStringValue("amount"), treeValue.getStringValue("amount_with_offset"), treeValue.getStringValue("currency"));
    }

    public static Double A0F(C15680ri r2, String str) {
        String A04 = r2.A04(str);
        if (A04 != null) {
            return Double.valueOf(Double.parseDouble(A04));
        }
        return null;
    }

    public static Integer A0H(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return Integer.valueOf(parcel.readInt());
        }
        return null;
    }

    public static BitSet A0Y(Drawable drawable, ImageView.ScaleType scaleType, LIz lIz, int i) {
        BitSet bitSet = new BitSet(i);
        bitSet.clear();
        lIz.A00 = drawable;
        bitSet.set(0);
        lIz.A01 = scaleType;
        return bitSet;
    }

    public static BitSet A0Z(C18266Acd acd, LJ2 lj2, CharSequence charSequence, int i) {
        BitSet bitSet = new BitSet(i);
        bitSet.clear();
        lj2.A0O = charSequence;
        bitSet.set(0);
        lj2.A0N = acd;
        return bitSet;
    }

    public static Iterator A0a(Parcel parcel, AbstractMap abstractMap) {
        parcel.writeInt(1);
        parcel.writeInt(abstractMap.size());
        return abstractMap.entrySet().iterator();
    }

    public static Iterator A0b(Parcel parcel, List list) {
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static void A0f(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeFloat(number.floatValue());
    }

    public static void A0g(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(number.longValue());
    }

    public static void A0h(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(number.longValue());
    }

    public static void A0j(SpannableStringBuilder spannableStringBuilder, int i) {
        if (spannableStringBuilder.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append(" • ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i), length, spannableStringBuilder.length(), 0);
        }
    }

    public static void A0v(AnonymousClass0A3 r3, User user) {
        r3.A0T("target_id", user.getId());
        r3.A0T("radio_type", (String) null);
        r3.A0T("reason", (String) null);
        r3.A0T("group_name", (String) null);
        r3.A0T("entity_user_type", String.valueOf(user.Apb()));
    }

    public static void A14(LJ2 lj2, float f) {
        lj2.A04 = f;
        lj2.A0S = false;
        lj2.A0E = 0;
        lj2.A0B = Integer.MAX_VALUE;
        lj2.A0T = true;
        lj2.A0R = true;
        lj2.A02 = null;
    }

    public static void A15(LJ2 lj2, Integer num, float f, int i) {
        lj2.A05 = 0;
        lj2.A0Q = num;
        lj2.A04 = f;
        lj2.A0S = false;
        lj2.A0E = 0;
        lj2.A0B = i;
    }

    public static void A16(LJ2 lj2, BitSet bitSet, String[] strArr, int i) {
        C36896Jgk.A00(bitSet, strArr, i);
        C18266Acd[] acdArr = new C18266Acd[i];
        lj2.A0U = acdArr;
        acdArr[0] = lj2.A0N;
    }

    public static void A1Q(MMo mMo, AbstractMap abstractMap) {
        Long l = null;
        String A0p = mMo.A0p();
        mMo.A0g();
        if (mMo.A0f() == C40318LcR.VALUE_NULL || (l = Long.valueOf(mMo.A0b())) != null) {
            abstractMap.put(A0p, l);
        }
    }

    public static void A1T(Object obj, Object obj2) {
        C04220Ms.A0B(obj, 6);
        C04220Ms.A0B(obj2, 7);
    }

    public static void A1V(Object obj, Object obj2, Object obj3) {
        C04220Ms.A0B(obj, 3);
        C04220Ms.A0B(obj2, 4);
        C04220Ms.A0B(obj3, 5);
    }

    public static void A1W(AbstractCollection abstractCollection, Iterator it) {
        String str = (String) it.next();
        C04220Ms.A0B(str, 0);
        abstractCollection.add(AnonymousClass4n2.A02(str));
    }

    public static AnonymousClass06B A03(Object obj) {
        AnonymousClass06B viewModelStore = ((AnonymousClass06C) ((C04530Oa) obj).getValue()).getViewModelStore();
        C04220Ms.A06(viewModelStore);
        return viewModelStore;
    }

    public static KtCSuperShape1S0100100_I2 A04(Object obj, int i, long j) {
        return new KtCSuperShape1S0100100_I2(i, j, obj);
    }

    public static AnonymousClass7A9 A06(AnonymousClass7A9 r1, C145838lB r2) {
        return new AnonymousClass7A9(r1, r2);
    }

    public static LJ2 A07(MNZ mnz) {
        LJ2 lj2 = new LJ2();
        if (mnz.A01 != null) {
            lj2.A00 = mnz.A05();
        }
        return lj2;
    }

    public static C11490kI A09(Integer num, String str) {
        return new C11490kI(num, str);
    }

    public static IgRoomDatabase A0D(C134057wx r4, UserSession userSession, boolean z) {
        Class<CreationDatabase> cls = CreationDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase != null) {
            return igRoomDatabase;
        }
        Context context = C10600ic.A00;
        C04220Ms.A06(context);
        C41012LuB A00 = C98506Fu.A00(context, cls, C120627Bu.A01(r4, userSession));
        AnonymousClass6UW.A00(A00, 1702658258, 1401021912, z);
        r4.A00(A00);
        IgRoomDatabase igRoomDatabase2 = (IgRoomDatabase) A00.A00();
        userSession.A04(cls, igRoomDatabase2);
        return igRoomDatabase2;
    }

    public static Object A0K(MMo mMo, int i) {
        return C25563Dnz.A02(mMo, new IDxHelperShape78S0000000_3_I2_5(i));
    }

    public static Object A0L(MMo mMo, int i) {
        return C25563Dnz.A02(mMo, new IDxHelperShape74S0000000_3_I2_1(i));
    }

    public static Object A0M(MMo mMo, int i) {
        return C25563Dnz.A02(mMo, new IDxHelperShape75S0000000_3_I2_2(i));
    }

    public static Object A0N(MMo mMo, int i) {
        return C25563Dnz.A02(mMo, new IDxHelperShape77S0000000_3_I2_4(i));
    }

    public static Object A0O(MMo mMo, int i) {
        return C25563Dnz.A02(mMo, new IDxHelperShape76S0000000_3_I2_3(i));
    }

    public static Object A0P(MMo mMo, int i) {
        return C25563Dnz.A02(mMo, new IDxHelperShape73S0000000_3_I2(i));
    }

    public static Object A0Q(MMo mMo, int i) {
        return C25563Dnz.A02(mMo, new IDxHelperShape79S0000000_3_I2_6(i));
    }

    public static Object A0R(Object obj, KtCImplShape10S0201000_I2_8 ktCImplShape10S0201000_I2_8) {
        ktCImplShape10S0201000_I2_8.A01 = obj;
        ktCImplShape10S0201000_I2_8.A00 |= Process.WAIT_RESULT_TIMEOUT;
        return ktCImplShape10S0201000_I2_8.A02;
    }

    public static String A0T(TreeJNI treeJNI) {
        return treeJNI.getStringValueByHashCode(3355);
    }

    public static String A0V(Product product) {
        Merchant merchant = product.A00.A0C;
        if (merchant != null) {
            return merchant.A06;
        }
        return null;
    }

    public static ArrayList A0W(View view, View view2, Object obj, int i) {
        view.setOnLongClickListener(new IDxCListenerShape448S0100000_3_I2(obj, i));
        View requireViewById = view2.requireViewById(R.id.image_1);
        C04220Ms.A06(requireViewById);
        requireViewById.setOnLongClickListener(new IDxCListenerShape448S0100000_3_I2(obj, i));
        View requireViewById2 = view2.requireViewById(R.id.image_2);
        C04220Ms.A06(requireViewById2);
        requireViewById2.setOnLongClickListener(new IDxCListenerShape448S0100000_3_I2(obj, i));
        View requireViewById3 = view2.requireViewById(R.id.image_3);
        C04220Ms.A06(requireViewById3);
        requireViewById3.setOnLongClickListener(new IDxCListenerShape448S0100000_3_I2(obj, i));
        return C06750aI.A14((IgImageView) view, (IgImageView) requireViewById, (IgImageView) requireViewById2, (IgImageView) requireViewById3);
    }

    public static BitSet A0X(int i) {
        BitSet bitSet = new BitSet(i);
        bitSet.clear();
        return bitSet;
    }

    public static C04530Oa A0d(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape72S0100000_I2_52(obj, i));
    }

    public static C04530Oa A0e(Object obj, int i) {
        return AnonymousClass0OY.A02(new KtLambdaShape124S0100000_I2_104(obj, i));
    }

    public static void A0l(View view, int i, Object obj) {
        view.setOnClickListener(new IDxCListenerShape204S0100000_3_I2(obj, i));
    }

    public static void A0m(View view, int i, Object obj, Object obj2) {
        view.setOnClickListener(new IDxCListenerShape72S0200000_3_I2(i, obj, obj2));
    }

    public static void A0p(C021109v r1, AnonymousClass0A3 r2, C11630kW r3) {
        r2.A0O(r1, "action_source");
        r2.A0T("containermodule", r3.getModuleName());
    }

    public static void A0w(AnonymousClass0A3 r2, String str) {
        r2.A0T("shopping_session_id", str);
        r2.A0T("navigation_chain", C103066Xr.A00.A02.A00);
    }

    public static void A0x(AnonymousClass0A3 r2, String str, int i, int i2, boolean z) {
        r2.A0T("item_type", str);
        r2.A0S("item_index", Long.valueOf((long) i));
        r2.A0S("item_count", Long.valueOf((long) i2));
        r2.A0Q("item_is_influencer_media", Boolean.valueOf(z));
    }

    public static void A0y(AnonymousClass0V3 r2, C15680ri r3, Boolean bool) {
        r2.A07("is_caption_fully_displayed", bool);
        r2.A0A("background_color_bottom", r3.A04("background_color_bottom"));
        r2.A0A("background_color_caption", r3.A04("background_color_caption"));
        r2.A0A("background_color_top", r3.A04("background_color_top"));
        r2.A0A("caption_background_color_alpha", r3.A04("caption_background_color_alpha"));
    }

    public static void A0z(AnonymousClass0V3 r2, String str) {
        r2.A0A("submodule", str);
        r2.A0A("nav_chain", C103066Xr.A00.A02.A00);
    }

    public static void A10(USLEBaseShape0S0000000 uSLEBaseShape0S0000000, FiltersLoggingInfo filtersLoggingInfo, String str) {
        uSLEBaseShape0S0000000.A0T("selected_value", str);
        uSLEBaseShape0S0000000.A0T(AnonymousClass3QF.A00(0, 10, 76), filtersLoggingInfo.A06);
        uSLEBaseShape0S0000000.A0V("filters", FiltersLoggingInfo.A00(new IDxPredicateShape353S0100000_3_I2(filtersLoggingInfo, 0), filtersLoggingInfo));
        uSLEBaseShape0S0000000.A0T("prior_module", filtersLoggingInfo.A05);
        Merchant merchant = filtersLoggingInfo.A03;
        if (merchant != null) {
            uSLEBaseShape0S0000000.A0T("merchant_id", merchant.A06);
            uSLEBaseShape0S0000000.A0b(Boolean.valueOf(C18786AlM.A01(merchant)));
        }
    }

    public static void A11(MHA mha, MNZ mnz) {
        mha.A03 = MHA.A06(mnz.A0C);
    }

    public static void A13(MNZ mnz, LJ7 lj7) {
        if (mnz.A01 != null) {
            lj7.A00 = mnz.A05();
        }
    }

    public static void A17(MMp mMp, StickerTraySurface stickerTraySurface) {
        if (stickerTraySurface != null) {
            mMp.A0d("surface", stickerTraySurface.A00);
        }
    }

    public static void A18(MMp mMp, SubscriptionStickerDict subscriptionStickerDict) {
        if (subscriptionStickerDict != null) {
            mMp.A0U("subscription_sticker");
            C19247AtC.A00(mMp, subscriptionStickerDict);
        }
    }

    public static void A19(MMp mMp, Number number) {
        if (number != null) {
            mMp.A0b("is_hidden", number.intValue());
        }
    }

    public static void A1A(MMp mMp, Number number) {
        if (number != null) {
            mMp.A0b("is_pinned", number.intValue());
        }
    }

    public static void A1B(MMp mMp, Number number) {
        if (number != null) {
            mMp.A0b("is_sticker", number.intValue());
        }
    }

    public static void A1C(MMp mMp, Number number) {
        if (number != null) {
            mMp.A0b("is_fb_sticker", number.intValue());
        }
    }

    public static void A1D(MMp mMp, Number number) {
        if (number != null) {
            mMp.A0b("sticker_style_enum", number.intValue());
        }
    }

    public static void A1E(MMp mMp, Number number) {
        if (number != null) {
            mMp.A0a("x", number.floatValue());
        }
    }

    public static void A1F(MMp mMp, Number number) {
        if (number != null) {
            mMp.A0a("y", number.floatValue());
        }
    }

    public static void A1G(MMp mMp, Number number) {
        if (number != null) {
            mMp.A0a("z", number.floatValue());
        }
    }

    public static void A1H(MMp mMp, Number number) {
        if (number != null) {
            mMp.A0a(IgReactMediaPickerNativeModule.WIDTH, number.floatValue());
        }
    }

    public static void A1I(MMp mMp, Number number) {
        if (number != null) {
            mMp.A0a(IgReactMediaPickerNativeModule.HEIGHT, number.floatValue());
        }
    }

    public static void A1J(MMp mMp, Number number) {
        if (number != null) {
            mMp.A0a("rotation", number.floatValue());
        }
    }

    public static void A1K(MMp mMp, Number number) {
        if (number != null) {
            mMp.A0a("end_time_ms", number.floatValue());
        }
    }

    public static void A1L(MMp mMp, Number number) {
        if (number != null) {
            mMp.A0a("start_time_ms", number.floatValue());
        }
    }

    public static void A1M(MMp mMp, String str) {
        if (str != null) {
            mMp.A0d("id", str);
        }
    }

    public static void A1P(MMo mMo, Object obj, Object[] objArr) {
        char c = 20;
        if ("x".equals(obj)) {
            objArr[19] = new Float(mMo.A0R());
            return;
        }
        if (!"y".equals(obj)) {
            if ("z".equals(obj)) {
                c = 21;
            } else {
                return;
            }
        }
        objArr[c] = new Float(mMo.A0R());
    }

    public static void A1U(Object obj, Object obj2) {
        C04220Ms.A0B(obj, 8);
        C04220Ms.A0B(obj2, 9);
    }

    public static String[] A1a() {
        return new String[]{"allow_creator_to_rename", "audio_asset_id", "can_remix_be_shared_to_fb", "dash_manifest", "duration_in_ms", "hide_remixing", "is_audio_automatically_attributed", "is_explicit", "is_reuse_disabled", "is_xpost_from_fb", "original_audio_subtype", "original_audio_title", "original_media_id", "progressive_download_url", "should_mute_audio", "time_created"};
    }

    public static int A00(Resources resources) {
        C04220Ms.A06(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_floating_window_z);
        return ((resources.getDisplayMetrics().widthPixels - dimensionPixelSize) - dimensionPixelSize) - resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
    }

    public static SpannableStringBuilder A02(Context context, Drawable drawable, int i) {
        C04220Ms.A0A(drawable);
        SpannableStringBuilder append = new SpannableStringBuilder().append("c");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * dimensionPixelSize) / drawable.getIntrinsicHeight(), dimensionPixelSize);
        F32 f32 = new F32(drawable);
        f32.A02 = AnonymousClass006.A00;
        append.setSpan(f32, 0, i, 33);
        return append;
    }

    public static C63863iT A0B(Activity activity, Bundle bundle, C10300i6 r2, Class cls, String str) {
        C63863iT A06 = C63863iT.A06(activity, bundle, r2, cls, str);
        A06.A0F = new int[]{R.anim.bottom_in, R.anim.top_out, R.anim.top_in, R.anim.bottom_out};
        return A06;
    }

    public static Boolean A0E(C11490kI r0, C11480kH r1) {
        return (Boolean) r1.A01(r0);
    }

    public static Integer A0G(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return Integer.valueOf(parcel.readInt());
    }

    public static Long A0I(Parcel parcel) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return Long.valueOf(parcel.readLong());
    }

    public static Long A0J(C11490kI r0, C11480kH r1) {
        return (Long) r1.A01(r0);
    }

    public static String A0S() {
        String obj = UUID.randomUUID().toString();
        C04220Ms.A06(obj);
        return obj;
    }

    public static String A0U(C11490kI r0, C11480kH r1) {
        return (String) r1.A01(r0);
    }

    public static Iterator A0c(MMp mMp, String str, AbstractMap abstractMap) {
        mMp.A0U(str);
        mMp.A0J();
        return abstractMap.entrySet().iterator();
    }

    public static void A0i(Parcel parcel, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        parcel.writeString((String) entry.getKey());
        parcel.writeString((String) entry.getValue());
    }

    public static void A0k(SpannableStringBuilder spannableStringBuilder, Object obj, int i) {
        spannableStringBuilder.setSpan(obj, i, spannableStringBuilder.length(), 33);
    }

    public static void A0n(View view, C21 c21, AnonymousClass94O r3, Runnable runnable, int i) {
        SimpleVideoLayout BKk;
        view.post(runnable);
        if (EndToEnd.isRunningEndToEndTest() && c21 != null && (BKk = c21.BKk()) != null) {
            String format = String.format(AnonymousClass00U.A0J("Reel Item ", r3.A01()), Arrays.copyOf(new Object[i], i));
            C04220Ms.A06(format);
            BKk.setContentDescription(format);
        }
    }

    public static void A0o(View view, C39549KvX kvX, C37021Jix jix, C30938GbW gbW) {
        jix.A01(kvX);
        gbW.A03(view, jix.A02());
    }

    public static void A0q(AnonymousClass0A3 r2) {
        r2.A0Q("is_dark_mode", Boolean.valueOf(C30975Gcb.A03()));
    }

    public static void A0r(AnonymousClass0A3 r2, long j) {
        r2.A0S("media_index", Long.valueOf(j));
    }

    public static void A0s(AnonymousClass0A3 r2, AnonymousClass0V3 r3, String str, int i, int i2) {
        r2.A0P(r3, str);
        r2.A0T("position", C1183770r.A01(i, i2));
    }

    public static void A0t(AnonymousClass0A3 r2, Product product) {
        r2.A0Q("is_checkout_enabled", Boolean.valueOf(product.A0A()));
    }

    public static void A0u(AnonymousClass0A3 r2, UserSession userSession) {
        if (C37360JqE.A05(userSession)) {
            r2.A0T("basic_ads_graphql_tier", C37360JqE.A00(AnonymousClass3WS.A01(userSession)).toString());
            r2.A0T("basic_ads_launcher_tier", C37360JqE.A01(userSession).toString());
        }
    }

    public static void A12(MHA mha, MNZ mnz, AnonymousClass7A9 r2) {
        r2.A01(mha.A0A(), mnz);
    }

    public static void A1N(MMp mMp, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        mMp.A0U((String) entry.getKey());
        if (entry.getValue() == null) {
            mMp.A0H();
        } else {
            mMp.A0Y((String) entry.getValue());
        }
    }

    public static void A1O(MMp mMp, Iterator it) {
        String str = (String) it.next();
        if (str != null) {
            mMp.A0Y(str);
        }
    }

    public static void A1R(H1T h1t, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        h1t.A0O((String) entry.getKey(), (String) entry.getValue());
    }

    public static void A1S(BK1 bk1, UserSession userSession) {
        if (C37360JqE.A05(userSession)) {
            bk1.A3M = C37360JqE.A00(AnonymousClass3WS.A01(userSession)).toString();
            bk1.A3N = C37360JqE.A01(userSession).toString();
        }
    }

    public static boolean A1X(Resources resources, Object obj, int i) {
        return resources.getString(i).equals(obj);
    }

    public static boolean A1Y(AnonymousClass0TJ r0, C10300i6 r1, long j) {
        return C63803iN.A0E(r0, r1, j);
    }

    public static boolean A1Z(Reel reel) {
        reel.A19 = Collections.emptySet();
        reel.A15 = Collections.emptyList();
        reel.A0x = Collections.emptyList();
        reel.A13 = Collections.emptyList();
        reel.A12 = Collections.emptyList();
        reel.A10 = Collections.emptyList();
        reel.A1A = Collections.emptySet();
        reel.A1d = true;
        reel.A05 = -9223372036854775807L;
        reel.A06 = -9223372036854775807L;
        reel.A04 = -9223372036854775807L;
        reel.A01 = -1;
        return true;
    }

    public static String[] A1b(Context context, MHA mha, String str) {
        mha.A03 = MHA.A06(context);
        return new String[]{str};
    }
}
