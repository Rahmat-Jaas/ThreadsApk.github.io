package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.Iterator;

/* renamed from: X.709  reason: invalid class name */
public final class AnonymousClass709 {
    public static AnonymousClass5MB parseFromJson(MMo mMo) {
        return (AnonymousClass5MB) C86104wH.A0e(mMo, 7);
    }

    public static void A00(MMp mMp, AnonymousClass5MB r5) {
        mMp.A0J();
        mMp.A0d("alignment", r5.A0B.A00);
        Iterator A0t = C18190wL.A0t(mMp, "colors", r5.A0G);
        while (A0t.hasNext()) {
            C90035Ke r2 = (C90035Ke) A0t.next();
            if (r2 != null) {
                mMp.A0J();
                mMp.A0b("count", r2.A00);
                mMp.A0d("hex_rgba_color", r2.A01);
                mMp.A0G();
            }
        }
        mMp.A0F();
        mMp.A0a("end_time_ms", r5.A00);
        mMp.A0a("font_size", r5.A01);
        mMp.A0a(IgReactMediaPickerNativeModule.HEIGHT, r5.A02);
        mMp.A0d("id", r5.A0E);
        mMp.A0b("is_animated", r5.A09);
        mMp.A0a("offset_x", r5.A03);
        mMp.A0a("offset_y", r5.A04);
        mMp.A0a("rotation_degree", r5.A05);
        mMp.A0a("scale", r5.A06);
        mMp.A0a("start_time_ms", r5.A07);
        mMp.A0d("text", r5.A0F);
        mMp.A0d("text_emphasis_mode", r5.A0C.A00);
        mMp.A0d("text_format_type", r5.A0D.A00);
        mMp.A0a(IgReactMediaPickerNativeModule.WIDTH, r5.A08);
        mMp.A0b("z_index", r5.A0A);
        mMp.A0G();
    }
}
