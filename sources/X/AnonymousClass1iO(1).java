package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0200000_I2_7;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0100000_I2_5;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S0410000_I2;

/* renamed from: X.1iO  reason: invalid class name */
public final class AnonymousClass1iO extends C63873iU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C18330wh A01;
    public final /* synthetic */ C63873iU A02;
    public final /* synthetic */ BKU A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C83224qz A05;
    public final /* synthetic */ boolean A06;

    public AnonymousClass1iO(Context context, C63873iU r2, BKU bku, UserSession userSession, C18330wh r5, C83224qz r6, boolean z) {
        this.A05 = r6;
        this.A01 = r5;
        this.A02 = r2;
        this.A03 = bku;
        this.A06 = z;
        this.A04 = userSession;
        this.A00 = context;
    }

    public final void onFail(AnonymousClass3XX r8) {
        String string;
        String errorMessage;
        int A002 = AnonymousClass0wJ.A00(2143625221, r8);
        C85814vo r0 = (C85814vo) r8.A00;
        if (r0 == null || (errorMessage = r0.getErrorMessage()) == null || errorMessage.hashCode() != 2083820669 || !errorMessage.equals("User has already pinned maximum amount of clips")) {
            boolean z = this.A06;
            Resources resources = this.A00.getResources();
            int i = 2131824634;
            if (z) {
                i = 2131824632;
            }
            string = resources.getString(i);
        } else {
            string = C18190wL.A0h(this.A00.getResources(), C63803iN.A07(AnonymousClass0TJ.A05, this.A04, 36608196697265003L), 2131824633);
        }
        C04220Ms.A09(string);
        C63733iD A003 = C63733iD.A00();
        A003.A0A = string;
        C38040KHr.A01.CWx(new H4Q(A003.A0B()));
        C14030oh.A0A(966190368, A002);
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(816766579);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0200000_I2_7(this.A02, this.A01, (C146958n9) null, 10), this.A05, 3);
        C14030oh.A0A(282779280, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(850505732);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0100000_I2_5(this.A01, (C146958n9) null, 10), this.A05, 3);
        C14030oh.A0A(230473125, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(-637620406);
        int A002 = AnonymousClass0wJ.A00(-479235306, obj);
        C83224qz r1 = this.A05;
        BKU bku = this.A03;
        boolean z = this.A06;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S0410000_I2(this.A04, bku, this.A02, obj, (C146958n9) null, 2, z), r1, 3);
        C14030oh.A0A(1854732366, A002);
        C14030oh.A0A(-1419373508, A032);
    }
}
