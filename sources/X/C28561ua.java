package X;

import android.content.Context;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.task.IDxLTaskShape3S0500000_1_I2;
import java.util.HashMap;

/* renamed from: X.1ua  reason: invalid class name and case insensitive filesystem */
public final class C28561ua extends AnonymousClass9UH {
    public Context A00;
    public IgFragmentActivity A01;
    public C07530bf A02;
    public C12560m7 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28561ua(Context context, C12560m7 r3, IgFragmentActivity igFragmentActivity, C07530bf r5) {
        super(r3);
        C04220Ms.A0B(context, 4);
        this.A03 = r3;
        this.A01 = igFragmentActivity;
        this.A02 = r5;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = C14030oh.A03(1049485818);
        C22171Tq r6 = (C22171Tq) obj;
        int A033 = C14030oh.A03(2020923037);
        C04220Ms.A0B(r6, 0);
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put("get_challenge", "true");
        A0y.put("user_id", r6.A06);
        A0y.put("nonce_code", r6.A04);
        A0y.put("cni", r6.A02);
        A0y.put("challenge_context", r6.A01);
        if (r6.A07) {
            C57873Cu r1 = new C57873Cu(this.A00);
            IgFragmentActivity igFragmentActivity = this.A01;
            C07530bf r7 = this.A02;
            C62323Yh.A00(r7, false, "auto_conf_consent", "client_start_generate_start_message", (String) null, "registration_flow", "ar_reset_password_link_sms", (String) null, (String) null, (String) null, (String) null);
            C31155GhB.A03(new IDxLTaskShape3S0500000_1_I2(1, igFragmentActivity, r6, r7, A0y, r1));
            i = 169687755;
        } else {
            IgFragmentActivity igFragmentActivity2 = this.A01;
            AnonymousClass4A9 A002 = C63263h8.A00(this.A02, r6.A00, A0y);
            AnonymousClass4A9.A00(A002, this, 19);
            igFragmentActivity2.schedule(A002);
            i = 405518077;
        }
        C14030oh.A0A(i, A033);
        C14030oh.A0A(-1976328683, A032);
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A002 = AnonymousClass0wJ.A00(659735826, r3);
        C62973bE.A02(this.A01, r3);
        C14030oh.A0A(-1978550441, A002);
    }
}
