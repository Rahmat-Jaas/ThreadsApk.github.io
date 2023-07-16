package X;

import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.graphql.UpdateAutoCrossPostingSettingMutationResponseImpl;

/* renamed from: X.4L4  reason: invalid class name */
public final class AnonymousClass4L4 implements C83834s4 {
    public final /* synthetic */ C67233zC A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass4L4(C67233zC r1, Integer num, String str, boolean z, boolean z2) {
        this.A00 = r1;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = str;
        this.A01 = num;
    }

    public final void Bxq() {
        C67233zC.A01(this.A00, this.A01, this.A02, (String) null, false, this.A04);
    }

    public final void CNE(UpdateAutoCrossPostingSettingMutationResponseImpl updateAutoCrossPostingSettingMutationResponseImpl) {
        String str;
        C61453Tm r0 = C67233zC.A08;
        C67233zC r6 = this.A00;
        UserSession userSession = r6.A06;
        boolean z = this.A03;
        boolean z2 = this.A04;
        String str2 = this.A02;
        Integer num = this.A01;
        r0.A01(userSession, num, str2, z, z2);
        if (num.intValue() != 0) {
            C83824s3 r02 = r6.A07;
            if (r02 != null) {
                r02.CKJ();
            }
        } else {
            C67233zC.A00(r6);
        }
        if (updateAutoCrossPostingSettingMutationResponseImpl == null || !z) {
            str = "OFF";
        } else {
            str = "ON";
        }
        C67233zC.A01(r6, num, str2, str, true, z2);
    }
}
