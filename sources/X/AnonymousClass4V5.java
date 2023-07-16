package X;

import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S1101000_I2_1;

/* renamed from: X.4V5  reason: invalid class name */
public final class AnonymousClass4V5 implements C83234r0 {
    public final /* synthetic */ FanClubConsiderationViewModel A00;
    public final /* synthetic */ String A01;

    public AnonymousClass4V5(FanClubConsiderationViewModel fanClubConsiderationViewModel, String str) {
        this.A00 = fanClubConsiderationViewModel;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, C146958n9 r9) {
        C86074wE r1;
        Object obj2;
        AnonymousClass2OF r8 = (AnonymousClass2OF) obj;
        if (C04220Ms.A0I(r8, C25921pf.A00)) {
            r1 = this.A00.A0C;
            obj2 = C305621v.DISABLED;
        } else if (C04220Ms.A0I(r8, C25901pd.A00) || C04220Ms.A0I(r8, C25881pb.A00)) {
            r1 = this.A00.A0C;
            obj2 = C305621v.ENABLED;
        } else if (C04220Ms.A0I(r8, C25891pc.A00)) {
            r1 = this.A00.A0C;
            obj2 = C305621v.LOADING;
        } else {
            if (r8 instanceof C25871pa) {
                FanClubConsiderationViewModel fanClubConsiderationViewModel = this.A00;
                fanClubConsiderationViewModel.A0C.CrC(C305621v.ENABLED);
                C40289Lbs lbs = ((C25871pa) r8).A00;
                if (lbs == C40289Lbs.SERVER_QUOTING_FAILED) {
                    r1 = fanClubConsiderationViewModel.A0D;
                    obj2 = C305721w.QUOTE_ERROR;
                } else if (!(lbs == C40289Lbs.USER_CANCELLED_PAYMENT || lbs == C40289Lbs.USER_PAYMENT_FAILED)) {
                    r1 = fanClubConsiderationViewModel.A0D;
                    obj2 = C305721w.VERIFICATION_ERROR;
                }
            } else if (C04220Ms.A0I(r8, C25911pe.A00)) {
                FanClubConsiderationViewModel fanClubConsiderationViewModel2 = this.A00;
                String str = this.A01;
                C04220Ms.A0B(str, 0);
                C25237DiI.A00((Integer) null, ((E5N) fanClubConsiderationViewModel2.A01).A03, new KtSLambdaShape2S1101000_I2_1(fanClubConsiderationViewModel2, str, (C146958n9) null, 6), AnonymousClass3J5.A00(fanClubConsiderationViewModel2), 2);
            }
            return Unit.A00;
        }
        r1.CrC(obj2);
        return Unit.A00;
    }
}
