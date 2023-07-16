package X;

import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6qo  reason: invalid class name and case insensitive filesystem */
public final class C113136qo {
    public C144198hz A00;
    public C144228i2 A01;
    public ReplyControlStr A02;
    public C146468mI A03;
    public User A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Integer A08;
    public Integer A09;
    public List A0A;
    public final C146658me A0B;

    public final C90555Ml A00() {
        C90075Kk r2;
        C90115Ko r3;
        if (this.A0B instanceof C90555Ml) {
            C90535Mj r5 = null;
            C112176p7 r1 = new C112176p7(new AnonymousClass420());
            Boolean bool = this.A05;
            Integer num = this.A08;
            C144198hz r0 = this.A00;
            if (r0 != null) {
                r2 = r0.Cyu();
            } else {
                r2 = null;
            }
            Boolean bool2 = this.A06;
            Boolean bool3 = this.A07;
            C144228i2 r02 = this.A01;
            if (r02 != null) {
                r3 = r02.Cz9();
            } else {
                r3 = null;
            }
            ReplyControlStr replyControlStr = this.A02;
            List list = this.A0A;
            User user = this.A04;
            Integer num2 = this.A09;
            C146468mI r03 = this.A03;
            if (r03 != null) {
                r5 = r03.D4U(r1);
            }
            return new C90555Ml(r2, r3, replyControlStr, r5, user, bool, bool2, bool3, num, num2, list);
        }
        throw new Exception(C18170wI.A00(16));
    }

    public C113136qo(C90555Ml r2) {
        this.A0B = r2;
        this.A05 = r2.AVj();
        this.A08 = r2.AdI();
        this.A00 = r2.AnE();
        this.A06 = r2.BXH();
        this.A07 = r2.BXr();
        this.A01 = r2.As8();
        this.A02 = r2.B7E();
        this.A0A = r2.B7F();
        this.A04 = r2.B7H();
        this.A09 = r2.BAA();
        this.A03 = r2.BAj();
    }
}
