package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.DayOfTheWeek;
import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3KZ  reason: invalid class name */
public final class AnonymousClass3KZ {
    public static C210118m parseFromJson(MMo mMo) {
        return (C210118m) AnonymousClass0wJ.A0e(mMo, 8);
    }

    public static void A00(MMp mMp, C210118m r5) {
        mMp.A0J();
        Integer num = r5.A08;
        if (num != null) {
            mMp.A0b("daily_time_limit_without_extensions_seconds", num.intValue());
        }
        String str = r5.A0A;
        if (str != null) {
            mMp.A0d("fc_url", str);
        }
        Boolean bool = r5.A01;
        if (bool != null) {
            mMp.A0e("has_stated_age", bool.booleanValue());
        }
        Boolean bool2 = r5.A02;
        if (bool2 != null) {
            mMp.A0e("is_eligible_for_supervision", bool2.booleanValue());
        }
        Boolean bool3 = r5.A03;
        if (bool3 != null) {
            mMp.A0e("is_guardian_of_viewer", bool3.booleanValue());
        }
        Boolean bool4 = r5.A04;
        if (bool4 != null) {
            mMp.A0e("is_guardian_user", bool4.booleanValue());
        }
        Boolean bool5 = r5.A05;
        if (bool5 != null) {
            mMp.A0e("is_quiet_time_feature_enabled", bool5.booleanValue());
        }
        Boolean bool6 = r5.A06;
        if (bool6 != null) {
            mMp.A0e("is_supervised_by_viewer", bool6.booleanValue());
        }
        Boolean bool7 = r5.A07;
        if (bool7 != null) {
            mMp.A0e("is_supervised_user", bool7.booleanValue());
        }
        C210318o r2 = r5.A00;
        if (r2 != null) {
            mMp.A0U("latest_valid_time_limit_extension_request");
            mMp.A0J();
            String str2 = r2.A02;
            if (str2 != null) {
                mMp.A0d("decision_actor_username", str2);
            }
            Integer num2 = r2.A01;
            if (num2 != null) {
                mMp.A0b("granted_extension_time_seconds", num2.intValue());
            }
            String str3 = r2.A03;
            if (str3 != null) {
                mMp.A0d("id", str3);
            }
            XFBYPRequestStatus xFBYPRequestStatus = r2.A00;
            if (xFBYPRequestStatus != null) {
                mMp.A0d(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, xFBYPRequestStatus.A00);
            }
            mMp.A0G();
        }
        List list = r5.A0C;
        if (list != null) {
            Iterator A0t = C18190wL.A0t(mMp, "quiet_time_intervals", list);
            while (A0t.hasNext()) {
                AnonymousClass18a r22 = (AnonymousClass18a) A0t.next();
                if (r22 != null) {
                    mMp.A0J();
                    List list2 = r22.A03;
                    if (list2 != null) {
                        Iterator A0t2 = C18190wL.A0t(mMp, "days", list2);
                        while (A0t2.hasNext()) {
                            DayOfTheWeek dayOfTheWeek = (DayOfTheWeek) A0t2.next();
                            if (dayOfTheWeek != null) {
                                mMp.A0Y(dayOfTheWeek.A00);
                            }
                        }
                        mMp.A0F();
                    }
                    Integer num3 = r22.A00;
                    if (num3 != null) {
                        mMp.A0b("end_time", num3.intValue());
                    }
                    String str4 = r22.A02;
                    if (str4 != null) {
                        mMp.A0d("label", str4);
                    }
                    Integer num4 = r22.A01;
                    if (num4 != null) {
                        mMp.A0b(TraceFieldType.StartTime, num4.intValue());
                    }
                    mMp.A0G();
                }
            }
            mMp.A0F();
        }
        String str5 = r5.A0B;
        if (str5 != null) {
            mMp.A0d("screen_time_daily_limit_description", str5);
        }
        Integer num5 = r5.A09;
        if (num5 != null) {
            mMp.A0b("screen_time_daily_limit_seconds", num5.intValue());
        }
        mMp.A0G();
    }
}
