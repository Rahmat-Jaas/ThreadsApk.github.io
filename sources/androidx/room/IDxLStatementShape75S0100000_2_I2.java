package androidx.room;

import X.AnonymousClass7JN;
import X.C41259M6w;

public class IDxLStatementShape75S0100000_2_I2 extends AnonymousClass7JN {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLStatementShape75S0100000_2_I2(C41259M6w m6w, Object obj, int i) {
        super(m6w);
        this.A01 = i;
        this.A00 = obj;
    }

    public final String createQuery() {
        switch (this.A01) {
            case 0:
                return "\n        UPDATE examples\n        SET label = ?,\n        label_timestamp = ?\n        WHERE context= ?\n        ";
            case 1:
                return "\n        UPDATE examples\n        SET label = ?,\n        label_timestamp = ?\n        WHERE context != ?\n        AND label != -1\n        ";
            case 2:
                return "\n        DELETE  FROM examples\n        WHERE use_case = ?\n        AND use_case_version = ?\n        ";
            case 3:
                return "\n        DELETE FROM signals\n        WHERE expiration_timestamp < ?\n      ";
            default:
                return "DELETE FROM mini_gallery_categories";
        }
    }
}
