package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3000000_I2;

/* renamed from: X.3KK  reason: invalid class name */
public final class AnonymousClass3KK {
    public static KtCSuperShape0S3000000_I2 parseFromJson(MMo mMo) {
        return (KtCSuperShape0S3000000_I2) AnonymousClass0wJ.A0f(mMo, 133);
    }

    public static void A00(KtCSuperShape0S3000000_I2 ktCSuperShape0S3000000_I2, MMp mMp) {
        mMp.A0J();
        String str = ktCSuperShape0S3000000_I2.A00;
        if (str != null) {
            mMp.A0d("existing_prompt_id", str);
        }
        String str2 = ktCSuperShape0S3000000_I2.A01;
        if (str2 != null) {
            mMp.A0d("prompt_text", str2);
        }
        String str3 = ktCSuperShape0S3000000_I2.A02;
        if (str3 != null) {
            mMp.A0d("replied_to_media_id", str3);
        }
        mMp.A0G();
    }
}
