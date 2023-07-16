package X;

import com.instagram.model.mediasize.VideoVersion;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.71D  reason: invalid class name */
public final class AnonymousClass71D {
    public static VideoVersion parseFromJson(MMo mMo) {
        return (VideoVersion) C86104wH.A0e(mMo, 106);
    }

    public static void A00(MMp mMp, VideoVersion videoVersion) {
        mMp.A0J();
        Integer num = videoVersion.A00;
        if (num != null) {
            mMp.A0b(IgReactMediaPickerNativeModule.HEIGHT, num.intValue());
        }
        String str = videoVersion.A03;
        if (str != null) {
            mMp.A0d("id", str);
        }
        Integer num2 = videoVersion.A01;
        if (num2 != null) {
            mMp.A0b("type", num2.intValue());
        }
        String str2 = videoVersion.A04;
        if (str2 != null) {
            mMp.A0d("url", str2);
        }
        Integer num3 = videoVersion.A02;
        if (num3 != null) {
            mMp.A0b(IgReactMediaPickerNativeModule.WIDTH, num3.intValue());
        }
        mMp.A0G();
    }
}
