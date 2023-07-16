package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import com.instagram.api.schemas.ReplyControlStr;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1;

/* renamed from: X.57e  reason: invalid class name and case insensitive filesystem */
public final class C882157e extends C62793ak {
    public final UserSession A00;
    public final String A01;
    public final C86074wE A02;
    public final C86094wG A03;

    public C882157e(UserSession userSession, String str) {
        ReplyControlStr replyControlStr;
        Object value;
        C971468c r1;
        C90555Ml r0;
        this.A00 = userSession;
        this.A01 = str;
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0100000_I2());
        this.A02 = A0z;
        this.A03 = C18230wP.A0x((C148838sG) null, A0z);
        BKU A0W = C86114wI.A0W(userSession, str);
        if (A0W == null || (r0 = A0W.A0f.A1J) == null) {
            replyControlStr = null;
        } else {
            replyControlStr = r0.A02;
        }
        do {
            value = A0z.getValue();
            if (replyControlStr != null) {
                int ordinal = replyControlStr.ordinal();
                if (ordinal == 2) {
                    r1 = C971468c.AccountsYouFollow;
                } else if (ordinal == 3) {
                    r1 = C971468c.MentionedOnly;
                } else if (ordinal == 1) {
                    r1 = C971468c.Anyone;
                }
            }
            r1 = null;
        } while (!A0z.ADi(value, new KtCSuperShape0S0100000_I2((Object) r1, 17)));
    }

    public final void A00(C971468c r11) {
        ReplyControlStr replyControlStr;
        C04220Ms.A0B(r11, 0);
        Object obj = ((KtCSuperShape0S0100000_I2) this.A03.getValue()).A00;
        C86074wE r3 = this.A02;
        do {
        } while (!r3.ADi(r3.getValue(), new KtCSuperShape0S0100000_I2((Object) r11, 17)));
        int ordinal = r11.ordinal();
        if (ordinal == 1) {
            replyControlStr = ReplyControlStr.ACCOUNTS_YOU_FOLLOW;
        } else if (ordinal == 2) {
            replyControlStr = ReplyControlStr.MENTIONED_ONLY;
        } else if (ordinal == 0) {
            replyControlStr = ReplyControlStr.EVERYONE;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape9S0301000_I2_1(obj, replyControlStr, this, (C146958n9) null, 38), AnonymousClass3J5.A00(this), 3);
    }
}
