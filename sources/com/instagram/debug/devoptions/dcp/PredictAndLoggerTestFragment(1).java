package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass0RA;
import X.AnonymousClass0wJ;
import X.AnonymousClass3Ie;
import X.AnonymousClass3W9;
import X.AnonymousClass4WJ;
import X.AnonymousClass4u2;
import X.AnonymousClass5FB;
import X.AnonymousClass7EB;
import X.C04220Ms;
import X.C04530Oa;
import X.C06750aI;
import X.C104466bp;
import X.C112096oz;
import X.C116196wa;
import X.C14030oh;
import X.C147108nP;
import X.C18180wK;
import X.C30954Gc6;
import X.C34640IcN;
import X.C61823Vx;
import X.C67603zp;
import X.C82034oy;
import X.C86004w7;
import X.C86104wH;
import X.C86134wK;
import X.C97356Ba;
import X.C98676Gm;
import X.GP0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.dcp.model.Example;
import com.facebook.dcp.model.ExampleContext;
import com.facebook.dcp.model.ExampleSource;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.LogLevel;
import com.facebook.dcp.model.PredictorMetadata;
import com.facebook.dcp.model.Type;
import com.facebook.models.IgModelLoader;
import com.facebook.redex.IDxCallableShape70S0300000_2_I2;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.barcelona.R;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

public final class PredictAndLoggerTestFragment extends C34640IcN implements C82034oy {
    public final C86004w7 executorService;
    public TextView responseText;
    public final Bundle sessionTokenBundle = C18180wK.A06();
    public final C04530Oa userSession$delegate = AnonymousClass3W9.A00(this);

    public void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131825122);
    }

    public String getModuleName() {
        return "device_compute_platform";
    }

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.responseText = (TextView) AnonymousClass0wJ.A0I(view, R.id.response_text);
        AnonymousClass0wJ.A0I(view, R.id.execute_button_2).setOnClickListener(new PredictAndLoggerTestFragment$onViewCreated$1(this, view));
    }

    private final PredictorMetadata getPredictorMetadata() {
        String str;
        long j;
        String str2;
        AnonymousClass3Ie A04;
        C61823Vx r2 = C61823Vx.A01;
        C67603zp r0 = null;
        if (!(r2 == null || (A04 = r2.A04(AnonymousClass0wJ.A0X(this.userSession$delegate))) == null)) {
            r0 = A04.A01.A00;
        }
        HashMap hashMap = new AnonymousClass5FB(r0).A00;
        C147108nP r1 = (C147108nP) hashMap.get("notification_ranking");
        if (r1 == null || (str = r1.B2X()) == null) {
            str = "";
        }
        C147108nP r12 = (C147108nP) hashMap.get("notification_ranking");
        if (r12 != null) {
            j = r12.B2Y();
        } else {
            j = 1;
        }
        C147108nP r13 = (C147108nP) hashMap.get("notification_ranking");
        if (r13 == null || (str2 = r13.B2W()) == null) {
            str2 = "";
        }
        return new PredictorMetadata(ExampleSource.COMBINE, new LogLevel(0), str, str2, AnonymousClass4WJ.A0A(), 0.5d, 1.0d, j, 600, 3600, 0, 0, 0, false, true, false);
    }

    private final UserSession getUserSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }

    /* access modifiers changed from: private */
    public final void logScore(double d, String str, long j, String str2) {
        C116196wa.A00(C18180wK.A0I(C86104wH.A0K(new C104466bp(AnonymousClass0wJ.A0X(this.userSession$delegate)).A00, "dcp_raw_prediction_score"), 511), str, String.valueOf(j), str2, (String) null, d);
    }

    /* access modifiers changed from: private */
    public final void onExecuteButtonClick2(View view) {
        Type type = Type.CLIENT_CONTEXT;
        List A17 = C06750aI.A17(new Example(new ExampleContext(type, "0", 28), "0", AnonymousClass4WJ.A09(C18180wK.A0p("1052397117", new FeatureData((Type) null, "1052397117", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.5d, 16374, 0, false)), C18180wK.A0p("1081785108", new FeatureData((Type) null, "1081785108", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.3d, 16374, 0, false)), C18180wK.A0p("1127873735", new FeatureData((Type) null, "1127873735", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.2d, 16374, 0, false)))), new Example(new ExampleContext(type, RealtimeSubscription.GRAPHQL_MQTT_VERSION, 28), RealtimeSubscription.GRAPHQL_MQTT_VERSION, AnonymousClass4WJ.A09(C18180wK.A0p("1142539578", new FeatureData((Type) null, "1142539578", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 9.8d, 16374, 0, false)), C18180wK.A0p("1157146048", new FeatureData((Type) null, "1157146048", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 11.3d, 16374, 0, false)), C18180wK.A0p("1224643601", new FeatureData((Type) null, "1224643601", (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 4.7d, 16374, 0, false)))));
        PredictorMetadata predictorMetadata = getPredictorMetadata();
        IgModelLoader A00 = GP0.A00(AnonymousClass0RA.A0C.A02(this.sessionTokenBundle));
        if (A00 != null) {
            C97356Ba r4 = C97356Ba.A01;
            AnonymousClass7EB r2 = new AnonymousClass7EB(C98676Gm.A00(AnonymousClass0wJ.A0X(this.userSession$delegate)).A00, new C112096oz(A00, AnonymousClass0wJ.A0X(this.userSession$delegate)), this.executorService);
            C04220Ms.A0B(predictorMetadata, 1);
            ListenableFuture CwQ = r2.A01.CwQ(new IDxCallableShape70S0300000_2_I2(1, A17, r2, predictorMetadata));
            C04220Ms.A06(CwQ);
            C30954Gc6.A03(new PredictAndLoggerTestFragment$onExecuteButtonClick2$1(this, predictorMetadata), CwQ, r4);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public PredictAndLoggerTestFragment() {
        C86004w7 listeningDecorator = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
        C04220Ms.A06(listeningDecorator);
        this.executorService = listeningDecorator;
    }

    public void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(320083113);
        super.onCreate(bundle);
        C86134wK.A15(this.sessionTokenBundle, AnonymousClass0wJ.A0X(this.userSession$delegate));
        C14030oh.A09(-767282978, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1183111418);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_dcp_predict_logger, viewGroup, false);
        C14030oh.A09(-860991644, A02);
        return inflate;
    }

    public UserSession getSession() {
        return AnonymousClass0wJ.A0X(this.userSession$delegate);
    }
}
