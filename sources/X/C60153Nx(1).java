package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.quickpromotion.model.FilterType;

/* renamed from: X.3Nx  reason: invalid class name and case insensitive filesystem */
public final class C60153Nx {
    public static AnonymousClass3FV parseFromJson(MMo mMo) {
        return (AnonymousClass3FV) AnonymousClass0wJ.A0h(mMo, 116);
    }

    public static void A00(MMp mMp, AnonymousClass3FV r5) {
        mMp.A0J();
        String str = r5.A00;
        if (str != null) {
            mMp.A0d("clause_type", str);
        }
        if (r5.A02 != null) {
            mMp.A0U("filters");
            mMp.A0I();
            for (AnonymousClass3HP r2 : r5.A02) {
                if (r2 != null) {
                    mMp.A0J();
                    FilterType filterType = r2.A00;
                    if (filterType != null) {
                        mMp.A0d("filter_type", filterType.toString());
                    }
                    String str2 = r2.A02;
                    if (str2 != null) {
                        mMp.A0d("unknown_action", str2);
                    }
                    if (r2.A01 != null) {
                        mMp.A0U(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        AnonymousClass3O2.A00(mMp, r2.A01);
                    }
                    if (r2.A03 != null) {
                        mMp.A0U("extra_datas");
                        mMp.A0I();
                        for (C58473Fu r0 : r2.A03) {
                            if (r0 != null) {
                                AnonymousClass3O2.A00(mMp, r0);
                            }
                        }
                        mMp.A0F();
                    }
                    mMp.A0G();
                }
            }
            mMp.A0F();
        }
        if (r5.A01 != null) {
            mMp.A0U("clauses");
            mMp.A0I();
            for (AnonymousClass3FV r02 : r5.A01) {
                if (r02 != null) {
                    A00(mMp, r02);
                }
            }
            mMp.A0F();
        }
        mMp.A0G();
    }
}
