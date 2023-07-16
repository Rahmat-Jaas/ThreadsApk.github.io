package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.71B  reason: invalid class name */
public final class AnonymousClass71B {
    public static ExtendedImageUrl parseFromJson(MMo mMo) {
        return (ExtendedImageUrl) C86104wH.A0e(mMo, HttpStatus.SC_PROCESSING);
    }

    public static void A00(MMp mMp, ExtendedImageUrl extendedImageUrl) {
        mMp.A0J();
        String str = extendedImageUrl.A0A;
        if (str != null) {
            mMp.A0d("url", str);
        }
        Long l = extendedImageUrl.A05;
        if (l != null) {
            mMp.A0c(C18170wI.A00(64), l.longValue());
        }
        ExtendedImageUrl extendedImageUrl2 = extendedImageUrl.A01;
        if (extendedImageUrl2 != null) {
            mMp.A0U("fallback");
            A00(mMp, extendedImageUrl2);
        }
        Integer num = extendedImageUrl.A04;
        if (num != null) {
            mMp.A0b(IgReactMediaPickerNativeModule.WIDTH, num.intValue());
        }
        Integer num2 = extendedImageUrl.A03;
        if (num2 != null) {
            mMp.A0b(IgReactMediaPickerNativeModule.HEIGHT, num2.intValue());
        }
        String str2 = extendedImageUrl.A07;
        if (str2 != null) {
            mMp.A0d("scans_profile", str2);
        }
        if (extendedImageUrl.A08 != null) {
            mMp.A0U("estimated_scans_sizes");
            mMp.A0I();
            for (Number number : extendedImageUrl.A08) {
                if (number != null) {
                    mMp.A0N(number.intValue());
                }
            }
            mMp.A0F();
        }
        String str3 = extendedImageUrl.A06;
        if (str3 != null) {
            mMp.A0d("color_preview_hex", str3);
        }
        mMp.A0G();
    }
}
