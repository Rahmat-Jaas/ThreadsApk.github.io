package X;

import com.facebook.dcp.model.DcpContext;
import com.facebook.dcp.model.FeatureData;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7eA  reason: invalid class name and case insensitive filesystem */
public final class C125847eA implements C146908n4 {
    public final AnonymousClass68S A00;
    public final C121547Gq A01;
    public final C147128nR A02;
    public final C145188k1 A03;
    public final C145198k2 A04;

    private final void A00(String str, String str2) {
        C121547Gq.A01(this.A00, C86134wK.A0N(str, str2, 4, 0), this.A01);
    }

    public final AnonymousClass5Id CX7(C145188k1 r11, Long l, List list) {
        String str;
        C143308gV r3;
        String str2 = "ml engine error";
        AnonymousClass5KE r0 = new AnonymousClass5KE((String) null, (DefaultConstructorMarker) null, 1);
        C121547Gq r7 = this.A01;
        AnonymousClass68S r6 = this.A00;
        C121547Gq.A01(r6, r0, r7);
        C147128nR r32 = this.A02;
        C121547Gq.A01(r6, C86134wK.A0N("use_case_name", r32.BJq(), 4, 0), r7);
        C121547Gq.A01(r6, C86134wK.A0N("use_case_version", r32.BJs(), 4, 0), r7);
        A00("app_start_type", ((FeatureData) C86124wJ.A0p(this.A03.ALA((DcpContext) null).A00, 0)).A00());
        C145198k2 r2 = this.A04;
        A00(AnonymousClass000.A00(342), r2.BIu());
        A00("examples_requested", String.valueOf(list.size()));
        switch (r32.B2e().intValue()) {
            case 0:
                str = "PYTORCH_BINARY_CLASSIFIER_USING_NEURAL_NET";
                break;
            case 1:
                str = "LITE_BINARY_CLASSIFIER_USING_NEURAL_NET";
                break;
            default:
                str = "LINEAR_REGRESSION";
                break;
        }
        A00("predictor_type", str);
        try {
            AnonymousClass5Id CX5 = r2.CX5(r11, list);
            if (CX5.A02) {
                Object obj = CX5.A00;
                if (C18190wL.A1a((Collection) obj)) {
                    String format = NumberFormat.getInstance(Locale.ENGLISH).format(C86124wJ.A00(((Pair) C86124wJ.A0p(obj, 0)).A01));
                    C04220Ms.A06(format);
                    A00("score", format);
                }
                r3 = new AnonymousClass5KF((DefaultConstructorMarker) null, 0, 1);
            } else {
                String str3 = CX5.A01;
                if (str3 == null) {
                    str3 = str2;
                }
                r3 = new AnonymousClass5KC(str3, "ml_engine_prediction_failure");
            }
            C121547Gq.A01(r6, r3, r7);
            return CX5;
        } catch (Exception e) {
            C121547Gq.A01(r6, new AnonymousClass5KB(e, "ml_engine"), r7);
            AnonymousClass0ZV r1 = AnonymousClass0ZV.A00;
            String message = e.getMessage();
            if (message != null) {
                str2 = message;
            }
            return AnonymousClass5Id.A01(r1, str2, false);
        }
    }

    public C125847eA(C145188k1 r2, C145198k2 r3, AnonymousClass68S r4, C121547Gq r5, C147128nR r6) {
        AnonymousClass0wJ.A1O(r5, r2);
        C04220Ms.A0B(r4, 5);
        this.A01 = r5;
        this.A03 = r2;
        this.A04 = r3;
        this.A02 = r6;
        this.A00 = r4;
    }
}
