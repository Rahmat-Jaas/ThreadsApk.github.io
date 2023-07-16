package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.MicroUserDict;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.4Mm  reason: invalid class name and case insensitive filesystem */
public final class C72144Mm implements C83154qs {
    public MicroUserDict A00;

    public final String A01() {
        String str = this.A00.A0E;
        if (str != null) {
            return str;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String A02() {
        String str = this.A00.A0F;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final ImageUrl B4M() {
        return this.A00.A04;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72144Mm) {
            return C04220Ms.A0I(A01(), ((C72144Mm) obj).A01());
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C72144Mm(com.instagram.user.model.User r19) {
        /*
            r18 = this;
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r2 = r19.A0E()
            java.lang.String r14 = r19.A14()
            java.lang.String r15 = r19.Ak1()
            boolean r1 = r19.A3A()
            boolean r0 = r19.BZi()
            java.lang.String r16 = r19.getId()
            com.instagram.common.typedurl.ImageUrl r6 = r19.B4M()
            java.lang.String r17 = r19.BK7()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            r3 = 0
            com.instagram.user.model.MicroUserDict r1 = new com.instagram.user.model.MicroUserDict
            r4 = r3
            r5 = r3
            r7 = r3
            r8 = r3
            r11 = r3
            r12 = r3
            r13 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r18
            r0.<init>((com.instagram.user.model.MicroUserDict) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72144Mm.<init>(com.instagram.user.model.User):void");
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C72144Mm) it.next()).A01());
    }

    public final int hashCode() {
        return A01().hashCode();
    }

    public C72144Mm(MicroUserDict microUserDict) {
        this.A00 = microUserDict;
    }
}
