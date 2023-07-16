package X;

import com.facebook.pando.TreeJNI;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.graphql.instagramschema.IGLocationBusinessUserInfoQueryResponseImpl;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.2QR  reason: invalid class name */
public final class AnonymousClass2QR {
    public static final AnonymousClass1U8 A00(C143338gY r16, String str) {
        TreeJNI treeValue;
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse;
        String str2 = str;
        C143338gY r0 = r16;
        AnonymousClass0wJ.A1N(r0, str2);
        TreeJNI A03 = C685344e.A03(r0);
        TreeJNI treeJNI = null;
        if (A03 == null || (treeValue = A03.getTreeValue("xfb_one_link_logged_out_page_info_monoschema(input:$input)", IGLocationBusinessUserInfoQueryResponseImpl.XfbOneLinkLoggedOutPageInfoMonoschema.class)) == null) {
            return new AnonymousClass1U8();
        }
        TreeJNI treeJNI2 = null;
        TreeJNI treeValue2 = treeValue.getTreeValue("hours", IGLocationBusinessUserInfoQueryResponseImpl.XfbOneLinkLoggedOutPageInfoMonoschema.Hours.class);
        if (treeValue2 != null) {
            treeJNI2 = treeValue2.getTreeValue("schedule", IGLocationBusinessUserInfoQueryResponseImpl.XfbOneLinkLoggedOutPageInfoMonoschema.Hours.Schedule.class);
        }
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (treeJNI2 != null) {
            int size = treeJNI2.getStringList("days_in_a_week").size();
            for (int i = 0; i < size; i++) {
                Object obj = treeJNI2.getStringList("days_in_a_week").get(i);
                C04220Ms.A06(obj);
                A0v.add(new LocationPageInfoPageOperationHour((String) obj, treeJNI2.getStringList("hours_in_a_day")));
            }
        }
        if (treeValue2 != null) {
            String stringValue = treeValue2.getStringValue(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
            if (stringValue == null) {
                stringValue = "";
            }
            String stringValue2 = treeValue2.getStringValue("current_status");
            if (stringValue2 == null) {
                stringValue2 = "";
            }
            String stringValue3 = treeValue2.getStringValue("hours_today");
            if (stringValue3 == null) {
                stringValue3 = "";
            }
            locationPageInfoPageOperationHourResponse = new LocationPageInfoPageOperationHourResponse(C18250wR.A0S(treeValue2, "is_open"), stringValue, stringValue2, stringValue3, A0v);
        } else {
            locationPageInfoPageOperationHourResponse = new LocationPageInfoPageOperationHourResponse();
        }
        TreeJNI treeValue3 = treeValue.getTreeValue("ig_business", IGLocationBusinessUserInfoQueryResponseImpl.XfbOneLinkLoggedOutPageInfoMonoschema.IgBusiness.class);
        if (treeValue3 != null) {
            treeJNI = treeValue3.getTreeValue("profile", IGLocationBusinessUserInfoQueryResponseImpl.XfbOneLinkLoggedOutPageInfoMonoschema.IgBusiness.Profile.class);
        }
        User user = new User(str2, treeValue.getStringValue("location_id"));
        if (treeJNI != null) {
            user = new User(treeJNI.getStringValue("pk"), treeJNI.getStringValue(C62983bG.A01()));
            user.A2B(treeJNI.getStringValue("full_name"));
            user.A2D(treeJNI.getStringValue("profile_pic_url"));
            user.A2Z(treeJNI.getBooleanValue("is_verified"));
            user.A25(C18250wR.A0S(treeJNI, "has_anonymous_profile_picture"));
            String stringValue4 = treeJNI.getStringValue("address_street");
            if (stringValue4 != null) {
                user.A05.Chb(stringValue4);
            }
            String stringValue5 = treeJNI.getStringValue("category");
            if (stringValue5 != null) {
                user.A05.Cit(stringValue5);
            }
            String stringValue6 = treeJNI.getStringValue("city_name");
            if (stringValue6 != null) {
                user.A05.Ciz(stringValue6);
            }
            user.A2J(treeJNI.getBooleanValue("is_call_to_action_enabled"));
            String stringValue7 = treeJNI.getStringValue("public_email");
            if (stringValue7 != null) {
                user.A05.Coe(stringValue7);
            }
            String stringValue8 = treeJNI.getStringValue("public_phone_country_code");
            if (stringValue8 != null) {
                user.A05.Cof(stringValue8);
            }
            String stringValue9 = treeJNI.getStringValue("public_phone_number");
            if (stringValue9 != null) {
                user.A05.Cog(stringValue9);
            }
            String stringValue10 = treeJNI.getStringValue(ServerW3CShippingAddressConstants.POSTAL_CODE);
            if (stringValue10 != null) {
                user.A05.Crd(stringValue10);
            }
            user.A23(C18250wR.A0S(treeJNI, "is_business"));
            user.A22(AnonymousClass266.A04);
            user.A2c(treeJNI.getBooleanValue("should_show_category"));
            user.A2d(treeJNI.getBooleanValue("should_show_public_contacts"));
        }
        String A0l = C18220wO.A0l(treeValue);
        if (A0l == null) {
            A0l = "";
        }
        String stringValue11 = treeValue.getStringValue("phone");
        String stringValue12 = treeValue.getStringValue("website");
        String stringValue13 = treeValue.getStringValue("category");
        String stringValue14 = treeValue.getStringValue("location_address");
        if (stringValue14 == null) {
            stringValue14 = "";
        }
        String stringValue15 = treeValue.getStringValue("location_city");
        Integer A0Y = C18240wQ.A0Y(treeValue, "location_region");
        String stringValue16 = treeValue.getStringValue("location_zip");
        if (stringValue16 == null) {
            stringValue16 = "";
        }
        boolean hasFieldValue = treeValue.hasFieldValue("has_menu");
        treeValue.getStringValue("location_id");
        return new AnonymousClass1U8(locationPageInfoPageOperationHourResponse, user, A0Y, C18240wQ.A0Y(treeValue, "num_guides"), A0l, stringValue11, stringValue12, stringValue13, stringValue14, stringValue15, stringValue16, hasFieldValue);
    }
}
