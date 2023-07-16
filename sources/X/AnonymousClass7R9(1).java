package X;

import android.view.View;
import com.instagram.api.schemas.UserMonetizationProductType;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S1211000_I2;

/* renamed from: X.7R9  reason: invalid class name */
public final class AnonymousClass7R9 implements View.OnClickListener {
    public final /* synthetic */ C882457h A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass7R9(C882457h r1, String str, boolean z) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = z;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(-1215921617);
        C882457h r5 = this.A00;
        UserMonetizationProductType userMonetizationProductType = UserMonetizationProductType.USER_PAY;
        String str = this.A01;
        boolean z = this.A02;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S1211000_I2(userMonetizationProductType, r5, str, (C146958n9) null, 5, z), AnonymousClass3J5.A00(r5), 3);
        C14030oh.A0C(-898055359, A05);
    }
}
