package X;

import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.graphql.impls.OnDeviceFLFeaturesResponseImpl;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4200000_I2;
import com.facebook.pando.TreeJNI;
import java.util.List;

/* renamed from: X.77b  reason: invalid class name and case insensitive filesystem */
public final class C1198077b {
    public final C112076ox A00;
    public final C121547Gq A01;

    public final AnonymousClass5Id A01(KtCSuperShape0S4200000_I2 ktCSuperShape0S4200000_I2) {
        AnonymousClass5F2 r1;
        Integer num;
        TreeJNI A03;
        OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures onDeviceFlFeatures;
        try {
            AnonymousClass7EQ r5 = AnonymousClass6XB.A00;
            C112076ox r7 = this.A00;
            String str = ktCSuperShape0S4200000_I2.A03;
            String str2 = ktCSuperShape0S4200000_I2.A05;
            String str3 = ktCSuperShape0S4200000_I2.A04;
            AnonymousClass68S r4 = (AnonymousClass68S) ktCSuperShape0S4200000_I2.A01;
            int ordinal = r4.ordinal();
            if (ordinal == 1) {
                num = AnonymousClass006.A00;
            } else if (ordinal == 3) {
                num = AnonymousClass006.A01;
            } else {
                r1 = new AnonymousClass5F2(AnonymousClass0wJ.A0t("unsupported flow ", r4));
                throw r1;
            }
            C143338gY A002 = r7.A00(num, str, str2, str3, ktCSuperShape0S4200000_I2.A02, (List) ktCSuperShape0S4200000_I2.A00);
            if (A002 == null || (A03 = C685344e.A03(A002)) == null || (onDeviceFlFeatures = (OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures) A03.getTreeValue("on_device_fl_features(input_params:{\"client_msg\":$client_msg,\"client_msg_type\":$client_msg_type,\"contexts\":$contexts,\"purpose\":$purpose,\"test_id\":$test_id,\"usecase\":$usecase,\"version\":$version})", OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.class)) == null) {
                r1 = new AnonymousClass5F2("Got null server features response from network");
                throw r1;
            } else if (onDeviceFlFeatures.getStringValue("usecase") == null || onDeviceFlFeatures.getStringValue(ClientCookie.VERSION_ATTR) == null || !onDeviceFlFeatures.hasFieldValue("time_stamp")) {
                r1 = new AnonymousClass5F2("Got invalid server features response from network");
                throw r1;
            } else if (!onDeviceFlFeatures.getTreeList("features", OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.class).isEmpty()) {
                this.A01.A02(r4, C86134wK.A0N("fetched_server_features", (String) null, 6, 1), str);
                return r5.A02(onDeviceFlFeatures);
            } else {
                r1 = new AnonymousClass5F2("Got empty server features response from network");
                throw r1;
            }
        } catch (AnonymousClass6CM e) {
            AnonymousClass0ZV r12 = AnonymousClass0ZV.A00;
            String message = e.getMessage();
            if (message == null) {
                message = "Server features fetch failed due to unknown reason";
            }
            return AnonymousClass5Id.A01(r12, message, false);
        }
    }

    public C1198077b(C112076ox r1, C121547Gq r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static AnonymousClass5Id A00(C1198077b r5, C147128nR r6) {
        return r5.A01(new KtCSuperShape0S4200000_I2(AnonymousClass68S.PREDICT, r6.BJq(), r6.BJs(), r6.BJr()));
    }
}
