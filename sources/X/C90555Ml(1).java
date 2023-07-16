package X;

import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.5Ml  reason: invalid class name and case insensitive filesystem */
public final class C90555Ml extends AnonymousClass0Sf implements C146658me {
    public final C90075Kk A00;
    public final C90115Ko A01;
    public final ReplyControlStr A02;
    public final C90535Mj A03;
    public final User A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Integer A08;
    public final Integer A09;
    public final List A0A;

    public final C90555Ml D4g(C112176p7 r1) {
        return this;
    }

    public final C90555Ml D4h(C144028hi r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90555Ml) {
                C90555Ml r5 = (C90555Ml) obj;
                if (!C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A08, r5.A08) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A06, r5.A06) || !C04220Ms.A0I(this.A07, r5.A07) || !C04220Ms.A0I(this.A01, r5.A01) || this.A02 != r5.A02 || !C04220Ms.A0I(this.A0A, r5.A0A) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A09, r5.A09) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Boolean AVj() {
        return this.A05;
    }

    public final Integer AdI() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ C144198hz AnE() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C144228i2 As8() {
        return this.A01;
    }

    public final ReplyControlStr B7E() {
        return this.A02;
    }

    public final List B7F() {
        return this.A0A;
    }

    public final User B7H() {
        return this.A04;
    }

    public final Integer BAA() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ C146468mI BAj() {
        return this.A03;
    }

    public final Boolean BXH() {
        return this.A06;
    }

    public final Boolean BXr() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((((((((AnonymousClass0wJ.A03(this.A05) * 31) + AnonymousClass0wJ.A03(this.A08)) * 31) + AnonymousClass0wJ.A03(this.A00)) * 31) + AnonymousClass0wJ.A03(this.A06)) * 31) + AnonymousClass0wJ.A03(this.A07)) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A0A)) * 31) + AnonymousClass0wJ.A03(this.A04)) * 31) + AnonymousClass0wJ.A03(this.A09)) * 31) + C18200wM.A07(this.A03);
    }

    public C90555Ml(C90075Kk r1, C90115Ko r2, ReplyControlStr replyControlStr, C90535Mj r4, User user, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, List list) {
        this.A05 = bool;
        this.A08 = num;
        this.A00 = r1;
        this.A06 = bool2;
        this.A07 = bool3;
        this.A01 = r2;
        this.A02 = replyControlStr;
        this.A0A = list;
        this.A04 = user;
        this.A09 = num2;
        this.A03 = r4;
    }
}
