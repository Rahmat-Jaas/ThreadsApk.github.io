package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.3O0  reason: invalid class name */
public final class AnonymousClass3O0 {
    public static AnonymousClass3TA parseFromJson(MMo mMo) {
        return (AnonymousClass3TA) AnonymousClass0wJ.A0h(mMo, 126);
    }

    public static void A00(MMp mMp, AnonymousClass3TA r3) {
        mMp.A0J();
        String str = r3.A04;
        if (str != null) {
            mMp.A0d("uri", str);
        }
        Integer num = r3.A02;
        if (num != null) {
            mMp.A0b(IgReactMediaPickerNativeModule.WIDTH, num.intValue());
        }
        Integer num2 = r3.A01;
        if (num2 != null) {
            mMp.A0b(IgReactMediaPickerNativeModule.HEIGHT, num2.intValue());
        }
        String str2 = r3.A03;
        if (str2 != null) {
            mMp.A0d("scale", str2);
        }
        mMp.A0G();
    }
}
