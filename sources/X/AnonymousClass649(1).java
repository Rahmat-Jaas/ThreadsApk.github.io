package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.649  reason: invalid class name */
public final class AnonymousClass649 extends AnonymousClass5NL implements C146658me {
    public final C144198hz AnE() {
        return (C144198hz) getTreeValueByHashCode(805787307, C959562x.class);
    }

    public final C144228i2 As8() {
        return (C144228i2) getTreeValueByHashCode(2023272031, AnonymousClass631.class);
    }

    public final ReplyControlStr B7E() {
        return (ReplyControlStr) A09(C139918Pu.A00, 1276679432);
    }

    public final List B7F() {
        ImmutableList optionalTreeListByHashCode = getOptionalTreeListByHashCode(1759540429, ImmutablePandoUserDict.class);
        if (optionalTreeListByHashCode == null) {
            return null;
        }
        ArrayList A0w = AnonymousClass0wJ.A0w(optionalTreeListByHashCode);
        Iterator it = optionalTreeListByHashCode.iterator();
        while (it.hasNext()) {
            C18180wK.A1U(A0w, it);
        }
        return A0w;
    }

    public final C146468mI BAj() {
        return (C146468mI) getTreeValueByHashCode(-1788288754, AnonymousClass646.class);
    }

    public final C90555Ml D4h(C144028hi r2) {
        return D4g(new C112176p7(r2));
    }

    public final Boolean AVj() {
        return getOptionalBooleanValueByHashCode(373873083);
    }

    public final Integer AdI() {
        return getOptionalIntValueByHashCode(345297956);
    }

    public final User B7H() {
        return AnonymousClass5NL.A00(this, 1192612026);
    }

    public final Integer BAA() {
        return getOptionalIntValueByHashCode(-1819645779);
    }

    public final Boolean BXH() {
        return getOptionalBooleanValueByHashCode(2058022310);
    }

    public final Boolean BXr() {
        return getOptionalBooleanValueByHashCode(123370389);
    }

    public final C90555Ml D4g(C112176p7 r14) {
        C90075Kk r2;
        C90115Ko r3;
        ArrayList arrayList;
        User user;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(373873083);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(345297956);
        C144198hz AnE = AnE();
        C90535Mj r5 = null;
        if (AnE != null) {
            r2 = AnE.Cyu();
        } else {
            r2 = null;
        }
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(2058022310);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(123370389);
        C144228i2 As8 = As8();
        if (As8 != null) {
            r3 = As8.Cz9();
        } else {
            r3 = null;
        }
        ReplyControlStr B7E = B7E();
        List B7F = B7F();
        if (B7F != null) {
            arrayList = AnonymousClass0wJ.A0w(B7F);
            Iterator it = B7F.iterator();
            while (it.hasNext()) {
                C18190wL.A1Q(r14, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        User A00 = AnonymousClass5NL.A00(this, 1192612026);
        if (A00 != null) {
            user = AnonymousClass5NL.A02(r14, A00);
        } else {
            user = null;
        }
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-1819645779);
        C146468mI BAj = BAj();
        if (BAj != null) {
            r5 = BAj.D4U(r14);
        }
        return new C90555Ml(r2, r3, B7E, r5, user, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalIntValueByHashCode, optionalIntValueByHashCode2, arrayList);
    }
}
