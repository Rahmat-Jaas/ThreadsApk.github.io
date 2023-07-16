package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;

/* renamed from: X.7eF  reason: invalid class name and case insensitive filesystem */
public final class C125897eF implements C143318gW {
    public final C104466bp A00;

    public final void BiS(AnonymousClass68S r10, C143308gV r11, String str) {
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(C86104wH.A0K(this.A00.A00, "dcp_raw_prediction_score"), 511);
        if (r11.AgJ().intValue() == 5) {
            AnonymousClass5KD r112 = (AnonymousClass5KD) r11;
            double d = r112.A00;
            String str2 = r112.A04;
            String str3 = r112.A05;
            String str4 = r112.A03;
            String str5 = r112.A01;
            String str6 = r112.A02;
            C04220Ms.A0B(str3, 2);
            if (AnonymousClass0wJ.A1U(A0I)) {
                A0I.A0R("prediction_score", Double.valueOf(d));
                A0I.A0T("use_case_version", "0.1");
                A0I.A0T("use_case", str);
                A0I.A0T("embedding_scores", str6);
                A0I.A0T("model_version", str3);
                A0I.A0T("model_name", str2);
                A0I.A0T("model_asset", str4);
                A0I.A0T("context", str5);
                A0I.A0T("ranking_call_id", str6);
                A0I.Bb4();
            }
        }
    }

    static {
        C125897eF.class.getCanonicalName();
    }

    public C125897eF(C104466bp r1) {
        this.A00 = r1;
    }
}
