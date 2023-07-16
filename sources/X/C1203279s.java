package X;

import android.os.Bundle;
import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.Example;
import com.facebook.dcp.model.ExampleContext;
import com.facebook.dcp.model.ExampleSource;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.LogLevel;
import com.facebook.dcp.model.PredictorMetadata;
import com.facebook.dcp.model.Type;
import com.facebook.models.IgModelLoader;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2;
import com.instagram.ondevicecompute.OnDeviceCompute$submitTrainingInBackground$1;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

/* renamed from: X.79s  reason: invalid class name and case insensitive filesystem */
public final class C1203279s {
    public IgModelLoader A00;
    public C144858jP A01;
    public final Bundle A02;
    public final PredictorMetadata A03;
    public final C121547Gq A04;
    public final C86004w7 A05;
    public final UserSession A06;
    public final HashMap A07 = AnonymousClass0wJ.A0y();
    public final C83224qz A08 = C84874u0.A00(C18250wR.A0J((AnonymousClass0gW) null, 3), 584703874, 3);
    public final Map A09 = AnonymousClass4WJ.A0H(C18180wK.A0p(C18170wI.A00(367), 500), C18180wK.A0p("interest_story", 538), C18180wK.A0p(C18170wI.A00(514), 557));

    public C1203279s(UserSession userSession, String str, String str2, String str3) {
        UserSession userSession2 = userSession;
        String str4 = str;
        AnonymousClass0wJ.A1M(userSession2, 1, str4);
        String str5 = str2;
        String str6 = str3;
        C18180wK.A1Q(str5, 3, str6);
        this.A06 = userSession2;
        Bundle A062 = C18180wK.A06();
        this.A02 = A062;
        C86134wK.A15(A062, userSession2);
        long parseLong = Long.parseLong(str6);
        this.A03 = new PredictorMetadata(ExampleSource.COMBINE, new LogLevel(0), str4, str5, AnonymousClass4WJ.A0A(), 0.5d, 1.0d, parseLong, 600, 3600, 0, 0, 0, false, true, false);
        C86004w7 listeningDecorator = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
        C04220Ms.A06(listeningDecorator);
        this.A05 = listeningDecorator;
        this.A04 = C98676Gm.A00(userSession2).A00;
    }

    public final void A02(String str, String str2, long j) {
        C14100oo ABJ;
        String A0L;
        String str3;
        Long l = null;
        try {
            Number A0j = C86124wJ.A0j(str2, this.A09);
            if (A0j != null) {
                l = C86144wL.A0c(A0j);
            }
        } catch (NumberFormatException unused) {
            C14100oo ABJ2 = C10770iu.A00().ABJ("on_device_compute", 16915972);
            ABJ2.A8U("error converting notif type to ID for training", AnonymousClass00U.A0L("notifType: ", str2));
            ABJ2.report();
        }
        if (str == null || str.equals("None")) {
            UserSession userSession = this.A06;
            ABJ = C10770iu.A00().ABJ("on_device_compute", 16915972);
            A0L = AnonymousClass00U.A0L("usersession: ", userSession.getUserId());
            str3 = "actor ID is null/'None' when submitting training data";
        } else if (l == null) {
            UserSession userSession2 = this.A06;
            ABJ = C10770iu.A00().ABJ("on_device_compute", 16915972);
            A0L = AnonymousClass00U.A0L("usersession: ", userSession2.getUserId());
            str3 = "notif ID is null when submitting training data";
        } else {
            DcpContext dcpContext = new DcpContext((String) null, C86124wJ.A0z(C18180wK.A0p("3339", l)), C86124wJ.A0z(C18180wK.A0p("2476", str)), 11);
            if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A06, 36321572054637487L)) {
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new OnDeviceCompute$submitTrainingInBackground$1(dcpContext, this, "2474001", (C146958n9) null, j), this.A08, 3);
                return;
            }
            return;
        }
        ABJ.A8U(str3, A0L);
        ABJ.report();
    }

    public static final void A00(C1203279s r3, String str, String str2, String str3, double d, long j) {
        C116196wa.A00(C18180wK.A0I(C86104wH.A0K(new C104466bp(r3.A06).A00, "dcp_raw_prediction_score"), 511), str, String.valueOf(j), str2, str3, d);
    }

    public final void A01(String str) {
        H1T A0P = AnonymousClass0wJ.A0P(this.A06);
        A0P.A0J("notifications/get_on_device_compute_features/");
        A0P.A0O("notification_type", str);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, AnonymousClass5t4.class, C117376ya.class);
        A0T.A00 = new IDxACallbackShape112S0100000_2_I2(this, 18);
        C31155GhB.A03(A0T);
    }

    public final void A03(boolean z) {
        UserSession userSession = this.A06;
        AnonymousClass0gN.A00().AKp(new AnonymousClass61G(this, C18180wK.A0n(new Example(new ExampleContext(Type.CLIENT_CONTEXT, userSession.getUserId(), 28), userSession.getUserId(), C86124wJ.A0z(C18180wK.A0p("10000", new FeatureData(Type.BOOLEAN, "10000", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16348, 0, z)))))));
    }
}
