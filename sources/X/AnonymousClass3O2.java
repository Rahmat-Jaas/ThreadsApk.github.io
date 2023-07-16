package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

/* renamed from: X.3O2  reason: invalid class name */
public final class AnonymousClass3O2 {
    public static C58473Fu parseFromJson(MMo mMo) {
        return (C58473Fu) AnonymousClass0wJ.A0h(mMo, 131);
    }

    public static void A00(MMp mMp, C58473Fu r3) {
        mMp.A0J();
        String str = r3.A02;
        if (str != null) {
            mMp.A0d(FXPFAccessLibraryDebugFragment.NAME, str);
        }
        mMp.A0e("required", r3.A04);
        Integer num = r3.A01;
        if (num != null) {
            mMp.A0b("int_value", num.intValue());
        }
        Boolean bool = r3.A00;
        if (bool != null) {
            mMp.A0e("bool_value", bool.booleanValue());
        }
        String str2 = r3.A03;
        if (str2 != null) {
            mMp.A0d("string_value", str2);
        }
        mMp.A0G();
    }
}
