package X;

import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.ServerFeaturesResponse;
import com.facebook.graphql.impls.OnDeviceFLFeaturesResponseImpl;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S2110000_I2;
import com.facebook.pando.TreeJNI;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6py  reason: invalid class name and case insensitive filesystem */
public final class C112656py {
    public final C104476bq A00;
    public final C112076ox A01;
    public final C121547Gq A02;
    public final boolean A03;

    public final ServerFeaturesResponse A00(AnonymousClass68S r25, String str, String str2, String str3, List list) {
        ServerFeaturesResponse serverFeaturesResponse;
        C121547Gq r3;
        KtCSuperShape1S2110000_I2 ktCSuperShape1S2110000_I2;
        Integer num;
        TreeJNI A032;
        AnonymousClass68S r12 = r25;
        String str4 = str3;
        int A07 = C86124wJ.A07(2, str4, r12);
        StringBuilder A0r = C18200wM.A0r();
        String str5 = str;
        String str6 = str2;
        A0r.append(AnonymousClass00U.A0N(str5, str6, Rfc3492Idn.delimiter));
        List<DcpContext> list2 = list;
        if (list != null && C18190wL.A1a(list2)) {
            for (DcpContext dcpContext : list2) {
                StringBuilder A0r2 = C18200wM.A0r();
                A0r2.append(Rfc3492Idn.delimiter);
                A0r.append(C86144wL.A0v(A0r2, C18220wO.A06(dcpContext.A04, C18220wO.A06(dcpContext.A02, dcpContext.A03.hashCode()))));
            }
        }
        String A0n = C18190wL.A0n(A0r);
        boolean z = this.A03;
        OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures onDeviceFlFeatures = null;
        if (z) {
            C104476bq r2 = this.A00;
            String A0L = AnonymousClass00U.A0L("full_response_server_feature_", A0n);
            C146988nC r22 = r2.A00;
            if (C125677do.A01((C125677do) r22, A0L)) {
                try {
                    C39237Kq4 kq4 = C36975Ji8.A03;
                    String string = r22.getString(A0L);
                    AnonymousClass76V r32 = kq4.A02;
                    C02230Ai A0l = C18210wN.A0l(ServerFeaturesResponse.class);
                    List emptyList = Collections.emptyList();
                    C04220Ms.A0B(emptyList, 2);
                    serverFeaturesResponse = (ServerFeaturesResponse) kq4.A00(string, AnonymousClass72C.A00(new AnonymousClass0AD(emptyList, (AnonymousClass0AD) null, A0l, 1), r32));
                    if (serverFeaturesResponse != null) {
                        r3 = this.A02;
                        ktCSuperShape1S2110000_I2 = C86134wK.A0N("server_features_cache_read", (String) null, 6, 1);
                        C121547Gq.A01(r12, ktCSuperShape1S2110000_I2, r3);
                        return serverFeaturesResponse;
                    }
                } catch (Exception unused) {
                }
            }
        }
        C112076ox r1 = this.A01;
        int ordinal = r12.ordinal();
        if (ordinal == 1) {
            num = AnonymousClass006.A00;
        } else if (ordinal == A07) {
            num = AnonymousClass006.A01;
        } else {
            throw new AnonymousClass5F0(AnonymousClass0wJ.A0t("unsupported flow ", r12));
        }
        C143338gY A002 = r1.A00(num, str5, str6, str4, (String) null, list2);
        AnonymousClass7EQ r33 = AnonymousClass6XB.A00;
        if (!(A002 == null || (A032 = C685344e.A03(A002)) == null)) {
            onDeviceFlFeatures = (OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures) A032.getTreeValue("on_device_fl_features(input_params:{\"client_msg\":$client_msg,\"client_msg_type\":$client_msg_type,\"contexts\":$contexts,\"purpose\":$purpose,\"test_id\":$test_id,\"usecase\":$usecase,\"version\":$version})", OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.class);
        }
        serverFeaturesResponse = new ServerFeaturesResponse(r33.A03(onDeviceFlFeatures));
        r3 = this.A02;
        r3.A02(r12, C86134wK.A0N("fetched_server_features", (String) null, 6, 1), str5);
        if (z) {
            C146988nC r6 = this.A00.A00;
            String A0L2 = AnonymousClass00U.A0L("full_response_server_feature_", A0n);
            C39237Kq4 kq42 = C36975Ji8.A03;
            r6.CYP(A0L2, C18210wN.A0d(ServerFeaturesResponse.class, serverFeaturesResponse, kq42, kq42.A02), TimeUnit.MINUTES.toMillis(15));
            ktCSuperShape1S2110000_I2 = C86134wK.A0N("server_features_cache_write", (String) null, 6, 1);
            C121547Gq.A01(r12, ktCSuperShape1S2110000_I2, r3);
        }
        return serverFeaturesResponse;
    }

    public C112656py(C112076ox r1, C104476bq r2, C121547Gq r3, boolean z) {
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r1;
        this.A03 = z;
    }
}
