package X;

import com.instagram.quickpromotion.intf.Trigger;

/* renamed from: X.3Nz  reason: invalid class name and case insensitive filesystem */
public final class C60173Nz {
    public static C57833Cq parseFromJson(MMo mMo) {
        return (C57833Cq) AnonymousClass0wJ.A0h(mMo, 121);
    }

    public static void A00(MMp mMp, C57833Cq r5) {
        mMp.A0J();
        if (r5.A02 != null) {
            mMp.A0U("node");
            AnonymousClass3GI r2 = r5.A02;
            mMp.A0J();
            String str = r2.A05;
            if (str != null) {
                mMp.A0d("promotion_id", str);
            }
            String str2 = r2.A03;
            if (str2 != null) {
                mMp.A0d("id", str2);
            }
            String str3 = r2.A04;
            if (str3 != null) {
                mMp.A0d("logging_data", str3);
            }
            Integer num = r2.A02;
            if (num != null) {
                mMp.A0b("max_impressions", num.intValue());
            }
            if (r2.A07 != null) {
                mMp.A0U("triggers");
                mMp.A0I();
                for (Trigger trigger : r2.A07) {
                    if (trigger != null) {
                        mMp.A0Y(trigger.A01);
                    }
                }
                mMp.A0F();
            }
            mMp.A0e("is_uncancelable", r2.A0A);
            if (r2.A06 != null) {
                mMp.A0U("creatives");
                mMp.A0I();
                for (C28221tt r0 : r2.A06) {
                    if (r0 != null) {
                        C60163Ny.A00(mMp, r0);
                    }
                }
                mMp.A0F();
            }
            if (r2.A00 != null) {
                mMp.A0U("contextual_filters");
                C60153Nx.A00(mMp, r2.A00);
            }
            if (r2.A01 != null) {
                mMp.A0U("template");
                AnonymousClass3O3.A00(mMp, r2.A01);
            }
            mMp.A0e("is_server_force_pass", r2.A09);
            mMp.A0e("disable_logging_to_qp_tables", r2.A08);
            mMp.A0e("bypass_surface_delay", r2.A0B);
            mMp.A0G();
        }
        if (r5.A01 != null) {
            mMp.A0U("time_range");
            C568038p r3 = r5.A01;
            mMp.A0J();
            Long l = r3.A01;
            if (l != null) {
                mMp.A0c("start", l.longValue());
            }
            Long l2 = r3.A00;
            if (l2 != null) {
                mMp.A0c("end", l2.longValue());
            }
            mMp.A0G();
        }
        mMp.A0e("is_holdout", r5.A04);
        mMp.A0b("priority", r5.A00);
        Long l3 = r5.A03;
        if (l3 != null) {
            mMp.A0c("client_ttl_seconds", l3.longValue());
        }
        mMp.A0e("log_eligibility_waterfall", r5.A05);
        mMp.A0G();
    }
}
