package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import java.util.Date;

/* renamed from: X.5yh  reason: invalid class name and case insensitive filesystem */
public final class C95045yh extends C63873iU {
    public final PushChannelType A00;
    public final C108336iC A01;
    public final AnonymousClass76T A02;
    public final String A03;
    public final boolean A04;

    public C95045yh(PushChannelType pushChannelType, C10300i6 r3, C108336iC r4, AnonymousClass76T r5, boolean z) {
        this.A00 = pushChannelType;
        this.A04 = z;
        this.A01 = r4;
        this.A03 = r3.getToken();
        this.A02 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r7 != null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.AnonymousClass3XX r7) {
        /*
            r6 = this;
            r0 = 65793622(0x3ebee56, float:1.3866778E-36)
            int r5 = X.C14030oh.A03(r0)
            X.76T r4 = r6.A02
            r3 = 0
            if (r7 == 0) goto L_0x0033
            java.lang.Object r0 = r7.A00
            X.4vo r0 = (X.C85814vo) r0
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = r0.getErrorMessage()
        L_0x0016:
            java.lang.Throwable r0 = r7.A01
            if (r0 == 0) goto L_0x001e
            java.lang.String r3 = r0.toString()
        L_0x001e:
            r1 = 0
            java.lang.String r0 = "registration_result_received"
            X.AnonymousClass76T.A00(r4, r0, r2, r3, r1)
            X.6iC r0 = r6.A01
            X.0Pk r1 = r0.A01
            r0 = 0
            r1.ADn(r0)
            r0 = -1762507364(0xffffffff96f2459c, float:-3.9141138E-25)
            X.C14030oh.A0A(r0, r5)
            return
        L_0x0033:
            r2 = r3
            if (r7 == 0) goto L_0x001e
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95045yh.onFail(X.3XX):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(928600001);
        int A033 = C14030oh.A03(-2066554949);
        PushChannelType pushChannelType = this.A00;
        AnonymousClass76T.A00(this.A02, "registration_result_received", (String) null, (String) null, true);
        if (this.A04) {
            AnonymousClass7GV.A02();
            C08350dD A002 = C08360dF.A00();
            long time = new Date().getTime();
            String str = pushChannelType.A01;
            C04220Ms.A0B(str, 1);
            AnonymousClass0wJ.A12(A002.A00.edit(), AnonymousClass00U.A0L("push_reg_date", str), time);
        }
        this.A01.A01.ADn((AnonymousClass0PT) null);
        C38040KHr.A01.CWx(new C130977rD());
        C14030oh.A0A(-2146666383, A033);
        C14030oh.A0A(1067706687, A032);
    }
}
