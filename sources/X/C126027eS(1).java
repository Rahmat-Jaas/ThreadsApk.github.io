package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.7eS  reason: invalid class name and case insensitive filesystem */
public final class C126027eS implements C147128nR {
    public final C07810cE A00;

    public C126027eS(UserSession userSession) {
        C67603zp r0;
        AnonymousClass3Ie A04;
        C04220Ms.A0B(userSession, 1);
        C61823Vx r02 = C61823Vx.A01;
        if (r02 == null || (A04 = r02.A04(userSession)) == null) {
            r0 = null;
        } else {
            r0 = A04.A01.A00;
        }
        this.A00 = r0;
    }

    public final boolean BXd() {
        return true;
    }

    public final String Aw7() {
        String BEN;
        C07810cE r2 = this.A00;
        if (r2 == null || (BEN = r2.BEN(36887167708561867L)) == null) {
            return "invalid";
        }
        return BEN;
    }

    public final String AwE() {
        String BEN;
        C07810cE r2 = this.A00;
        if (r2 == null || (BEN = r2.BEN(36887167708037575L)) == null) {
            return "invalid";
        }
        return BEN;
    }

    public final long AwF() {
        C07810cE r2 = this.A00;
        if (r2 != null) {
            return r2.At2(36605692731462089L);
        }
        return 1;
    }

    public final long B2Q() {
        C07810cE r2 = this.A00;
        if (r2 != null) {
            return r2.At2(36605692732903888L);
        }
        return 0;
    }

    public final long B2R() {
        C07810cE r2 = this.A00;
        if (r2 != null) {
            return r2.At2(36605692732772814L);
        }
        return 0;
    }

    public final Integer B2e() {
        C07810cE r2 = this.A00;
        if (r2 != null) {
            long At2 = r2.At2(36605692733100497L);
            if (At2 != 1) {
                if (At2 == 2) {
                    return AnonymousClass006.A01;
                }
                if (At2 == 3) {
                    return AnonymousClass006.A0C;
                }
            }
        }
        return AnonymousClass006.A00;
    }

    public final Integer BAS() {
        String str;
        C07810cE r2 = this.A00;
        if (r2 != null) {
            str = r2.BEN(36887167709741517L);
        } else {
            str = null;
        }
        if (C04220Ms.A0I(str, "stash")) {
            return AnonymousClass006.A00;
        }
        C04220Ms.A0I(str, "shared_prefs");
        return AnonymousClass006.A01;
    }

    public final boolean BBI() {
        C07810cE r3 = this.A00;
        if (r3 == null || !r3.ATr(36324217756262764L)) {
            return false;
        }
        return true;
    }

    public final boolean BBc() {
        C07810cE r3 = this.A00;
        if (r3 == null || !r3.ATr(36324217755607400L)) {
            return false;
        }
        return true;
    }

    public final long BGt() {
        C07810cE r2 = this.A00;
        if (r2 != null) {
            return r2.At2(36605692731593162L);
        }
        return 1000;
    }

    public final String BJq() {
        String BEN;
        C07810cE r2 = this.A00;
        if (r2 == null || (BEN = r2.BEN(36887167708496330L)) == null) {
            return "invalid";
        }
        return BEN;
    }

    public final String BJr() {
        String BEN;
        C07810cE r2 = this.A00;
        if (r2 == null || (BEN = r2.BEN(36887167708365257L)) == null) {
            return "invalid";
        }
        return BEN;
    }

    public final String BJs() {
        String BEN;
        C07810cE r2 = this.A00;
        if (r2 == null || (BEN = r2.BEN(36887167708103112L)) == null) {
            return "invalid";
        }
        return BEN;
    }

    public final boolean BU8() {
        C07810cE r3 = this.A00;
        if (r3 == null || !r3.ATr(36324217756590447L)) {
            return false;
        }
        return true;
    }

    public final boolean BXK() {
        C07810cE r3 = this.A00;
        if (r3 == null || !r3.ATr(36324217754558819L)) {
            return false;
        }
        return true;
    }

    public final boolean BZD() {
        C07810cE r3 = this.A00;
        if (r3 == null || !r3.ATr(36324217755541863L)) {
            return false;
        }
        return true;
    }

    public final boolean BZw() {
        C07810cE r3 = this.A00;
        if (r3 == null || !r3.ATr(36324217756459373L)) {
            return false;
        }
        return true;
    }
}
