package X;

import com.instagram.share.facebook.graphql.UpdateAutoCrossPostingSettingMutationResponseImpl;

/* renamed from: X.4L2  reason: invalid class name */
public final class AnonymousClass4L2 implements C83834s4 {
    public final /* synthetic */ C67263zF A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public AnonymousClass4L2(C67263zF r1, String str, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
    }

    public final void Bxq() {
        C67263zF r3 = this.A00;
        C67263zF.A02(r3, this.A01, this.A03, this.A02);
        AnonymousClass3HQ r0 = r3.A00;
        if (r0 != null) {
            r0.A00();
        }
    }

    public final void CNE(UpdateAutoCrossPostingSettingMutationResponseImpl updateAutoCrossPostingSettingMutationResponseImpl) {
        Integer num;
        String str;
        C67263zF r5 = this.A00;
        String str2 = this.A01;
        boolean z = this.A03;
        if (updateAutoCrossPostingSettingMutationResponseImpl == null || !this.A02) {
            num = AnonymousClass006.A0C;
        } else {
            num = AnonymousClass006.A01;
        }
        if (1 - num.intValue() != 0) {
            str = "OFF";
        } else {
            str = "ON";
        }
        boolean z2 = this.A02;
        C67263zF.A01(r5, str2, str, z, z2);
        if (z) {
            C67263zF.A03.A02(r5.A01, str2, z2, true);
        }
        AnonymousClass3HQ r0 = r5.A00;
        if (r0 != null) {
            r0.A01();
        }
    }
}
