package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import java.io.StringWriter;

/* renamed from: X.3WT  reason: invalid class name */
public final class AnonymousClass3WT {
    public static String A00(C28291u0 r2) {
        StringWriter stringWriter = new StringWriter();
        MMp A04 = C18987Aon.A00.A04(stringWriter);
        A01(A04, r2);
        A04.close();
        return stringWriter.toString();
    }

    public static C28291u0 parseFromJson(MMo mMo) {
        return (C28291u0) AnonymousClass0wJ.A0h(mMo, 134);
    }

    public static void A01(MMp mMp, C28291u0 r4) {
        mMp.A0J();
        if (r4.A08 != null) {
            mMp.A0U("creative");
            C60163Ny.A00(mMp, r4.A08);
        }
        if (r4.A09 != null) {
            mMp.A0U("template");
            AnonymousClass3O3.A00(mMp, r4.A09);
        }
        String str = r4.A0B;
        if (str != null) {
            mMp.A0d("id", str);
        }
        String str2 = r4.A0E;
        if (str2 != null) {
            mMp.A0d("user_id", str2);
        }
        String str3 = r4.A0D;
        if (str3 != null) {
            mMp.A0d("promotion_id", str3);
        }
        mMp.A0c("end_time", r4.A02);
        mMp.A0b("max_impressions", r4.A00);
        mMp.A0e("is_server_force_pass", r4.A0I);
        mMp.A0e("disable_logging_to_qp_tables", r4.A0G);
        if (r4.A0A != null) {
            mMp.A0U("local_state");
            AnonymousClass3WU.A00(mMp, r4.A0A);
        }
        mMp.A0b("priority", r4.A01);
        QuickPromotionSurface quickPromotionSurface = r4.A06;
        if (quickPromotionSurface != null) {
            mMp.A0b("surface", quickPromotionSurface.A00);
        }
        if (r4.A0F != null) {
            mMp.A0U("triggers");
            mMp.A0I();
            for (Trigger trigger : r4.A0F) {
                if (trigger != null) {
                    mMp.A0Y(trigger.A01);
                }
            }
            mMp.A0F();
        }
        String str4 = r4.A0C;
        if (str4 != null) {
            mMp.A0d("logging_data", str4);
        }
        mMp.A0e("log_eligibility_waterfall", r4.A0K);
        if (r4.A07 != null) {
            mMp.A0U("contextual_filters");
            C60153Nx.A00(mMp, r4.A07);
        }
        mMp.A0e("is_holdout", r4.A0H);
        mMp.A0c("fetch_time_epoch", r4.A03);
        AnonymousClass3Za.A00(mMp, r4);
        mMp.A0G();
    }
}
