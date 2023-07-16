package androidx.room;

import X.AnonymousClass5C8;
import X.AnonymousClass7JN;
import X.C107676h8;
import X.C28051Exi;
import X.C41259M6w;
import X.C86144wL;
import X.C89885Hk;

public class IDxUAdapterShape64S0100000_2_I2 extends AnonymousClass5C8 {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxUAdapterShape64S0100000_2_I2(C41259M6w m6w, Object obj, int i) {
        super(m6w);
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ void A01(C28051Exi exi, Object obj) {
        int i;
        long j;
        switch (this.A01) {
            case 0:
                j = (long) ((C89885Hk) obj).A02;
                i = 1;
                break;
            case 1:
                C89885Hk r6 = (C89885Hk) obj;
                j = (long) r6.A02;
                AnonymousClass7JN.A00(exi, r6, j);
                i = 11;
                break;
            default:
                C107676h8 r62 = (C107676h8) obj;
                String str = r62.A01;
                C86144wL.A1F(exi, str, 1);
                exi.AAa(2, (long) r62.A00);
                C86144wL.A1F(exi, str, 3);
                return;
        }
        exi.AAa(i, j);
    }

    public final String createQuery() {
        switch (this.A01) {
            case 0:
                return "DELETE FROM `examples` WHERE `id` = ?";
            case 1:
                return "UPDATE OR REPLACE `examples` SET `id` = ?,`example_id` = ?,`use_case` = ?,`use_case_version` = ?,`model_version` = ?,`label` = ?,`features` = ?,`timestamp` = ?,`label_timestamp` = ?,`context` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `effects` SET `effectId` = ?,`saveStatus` = ? WHERE `effectId` = ?";
        }
    }
}
