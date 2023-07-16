package X;

/* renamed from: X.7p0  reason: invalid class name */
public final class AnonymousClass7p0 implements C146638ma {
    public final AnonymousClass7KG A00;
    public final AnonymousClass0YY A01;

    public final void Bh3(Boolean bool, String str, String str2) {
        boolean z;
        C04220Ms.A0B(str, 0);
        AnonymousClass7KG r3 = this.A00;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        StringBuilder A0s = C18190wL.A0s("media_viewer/");
        A0s.append(str);
        A0s.append('/');
        A0s.append(str2);
        A0s.append('/');
        A0s.append(z);
        r3.A0G((C113926sO) null, (AnonymousClass8dR) null, A0s.toString());
    }

    public final void Bh6(String str) {
        C04220Ms.A0B(str, 0);
        AnonymousClass7KG r2 = this.A00;
        C04220Ms.A0B(r2, 0);
        r2.A0G((C113926sO) null, (AnonymousClass8dR) null, AnonymousClass00U.A0L("media?id=", str));
    }

    public final void Bh7(String str, boolean z) {
        C04220Ms.A0B(str, 0);
        AnonymousClass7KG r2 = this.A00;
        StringBuilder A0s = C18190wL.A0s("post/");
        A0s.append(str);
        A0s.append('/');
        A0s.append(z);
        r2.A0G((C113926sO) null, (AnonymousClass8dR) null, C18180wK.A0i("/actions", A0s));
    }

    public final void Bh8(String str) {
        C04220Ms.A0B(str, 0);
        this.A00.A0G((C113926sO) null, (AnonymousClass8dR) null, AnonymousClass00U.A0V("post/", str, "/likes"));
    }

    public final void Bh9(String str) {
        C04220Ms.A0B(str, 0);
        this.A00.A0G((C113926sO) null, (AnonymousClass8dR) null, AnonymousClass00U.A0V("post/", str, "/repost"));
    }

    public final void BhB(String str) {
        C04220Ms.A0B(str, 0);
        this.A01.invoke(str);
    }

    public final void BhF(String str) {
        C04220Ms.A0B(str, 0);
        AnonymousClass7KG r2 = this.A00;
        C04220Ms.A0B(r2, 0);
        r2.A0G((C113926sO) null, (AnonymousClass8dR) null, AnonymousClass00U.A0L("profile?userId=", str));
    }

    public final void BhK(String str, String str2) {
        C04220Ms.A0B(str, 0);
        AnonymousClass7KG r2 = this.A00;
        StringBuilder A0s = C18190wL.A0s("reply?postId=");
        if (str2 != null) {
            A0s.append(str);
            A0s.append("&repostId=");
            A0s.append(str2);
        } else {
            A0s.append(str);
        }
        r2.A0G((C113926sO) null, (AnonymousClass8dR) null, A0s.toString());
    }

    public final void BhA(String str, String str2) {
        AnonymousClass7KG r2 = this.A00;
        StringBuilder A0s = C18190wL.A0s("post/");
        A0s.append(str);
        A0s.append('/');
        A0s.append(str2);
        r2.A0G((C113926sO) null, (AnonymousClass8dR) null, C18180wK.A0i("/share", A0s));
    }

    public final void BhI(String str) {
        this.A00.A0G((C113926sO) null, (AnonymousClass8dR) null, AnonymousClass00U.A0L("profile?username=", str));
    }

    public AnonymousClass7p0(AnonymousClass7KG r1, AnonymousClass0YY r2) {
        AnonymousClass0wJ.A1O(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
