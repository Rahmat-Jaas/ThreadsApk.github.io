package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape6S0100000_I2;
import com.instagram.barcelona.profile.data.ProfileFeedDataSource;
import com.instagram.barcelona.profile.data.ProfileFeedDataSource$refreshFirstPage$2;
import com.instagram.service.session.UserSession;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0200000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape15S0201000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S1300000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1;

/* renamed from: X.7y5  reason: invalid class name and case insensitive filesystem */
public final class C134637y5 implements Closeable {
    public String A00;
    public final C1198477g A01;
    public final ProfileFeedDataSource A02;
    public final ProfileFeedDataSource A03;
    public final C21839C2o A04;
    public final UserSession A05;
    public final C20309BYl A06 = C20309BYl.A00();
    public final C83224qz A07;
    public final C84714tk A08;
    public final C84714tk A09;
    public final C84714tk A0A;
    public final C86094wG A0B;

    public final int A01(C968566y r7, String str) {
        ProfileFeedDataSource profileFeedDataSource;
        C04220Ms.A0B(str, 0);
        int ordinal = r7.ordinal();
        if (ordinal == 0) {
            profileFeedDataSource = this.A02;
        } else if (ordinal == 1) {
            profileFeedDataSource = this.A03;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        Iterator A0y = C86144wL.A0y(profileFeedDataSource.A0A.getValue());
        int i = 0;
        while (A0y.hasNext()) {
            List A002 = AnonymousClass5I1.A00(A0y);
            Iterator it = A002.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!C04220Ms.A0I(AnonymousClass5IF.A00(it).A01(), str)) {
                    i2++;
                } else if (i2 >= 0) {
                    return i + i2;
                }
            }
            i = C86164wN.A06(A002, i);
        }
        return -1;
    }

    public /* synthetic */ C134637y5(C21839C2o c2o, UserSession userSession, String str) {
        C968566y r1 = C968566y.Posts;
        UserSession userSession2 = userSession;
        String str2 = str;
        ProfileFeedDataSource profileFeedDataSource = new ProfileFeedDataSource(r1, userSession2, str2);
        C968566y r13 = C968566y.Replies;
        ProfileFeedDataSource profileFeedDataSource2 = new ProfileFeedDataSource(r13, userSession2, str2);
        this.A05 = userSession2;
        this.A04 = c2o;
        this.A02 = profileFeedDataSource;
        this.A03 = profileFeedDataSource2;
        C83224qz A032 = AnonymousClass7Ja.A03(C25235DiG.A01(new AnonymousClass8bb((C148838sG) null), C18250wR.A0J((AnonymousClass0gW) null, 3).AHN(2048393085, 3)));
        this.A07 = A032;
        C1198477g A002 = AnonymousClass6NK.A00(userSession2);
        this.A01 = A002;
        C86094wG r0 = profileFeedDataSource.A0B;
        C86094wG r14 = profileFeedDataSource2.A0B;
        this.A0B = C25753DrP.A04(AnonymousClass4WJ.A0G(C18180wK.A0p(r1, r0.getValue()), C18180wK.A0p(r13, r14.getValue())), A032, C25807DsL.A01(new KtSLambdaShape15S0200000_I2(5, (C146958n9) null), r0, r14), AnonymousClass74I.A00);
        this.A00 = str2;
        C86094wG r12 = profileFeedDataSource.A0A;
        C84714tk r2 = A002.A01;
        C84714tk A003 = A00(C25807DsL.A01(new KtSLambdaShape2S1300000_I2(this, str2, (C146958n9) null, 0), r12, r2));
        this.A08 = A003;
        C84714tk A004 = A00(C25807DsL.A01(new KtSLambdaShape2S1300000_I2(this, str2, (C146958n9) null, 1), profileFeedDataSource2.A0A, r2));
        this.A09 = A004;
        this.A0A = C25807DsL.A01(new KtSLambdaShape15S0200000_I2(4, (C146958n9) null), A003, A004);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 25), A032, 3);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this, (C146958n9) null, 26), A032, 3);
    }

    private final C84714tk A00(C84714tk r6) {
        C38039KHq A002 = AnonymousClass3LY.A00(this.A05);
        C04220Ms.A0B(A002, 1);
        C84714tk A012 = C25240DiL.A01(C25239DiK.A01(new KtSLambdaShape9S0301000_I2_1((Object) A002, (Object) r6, (C146958n9) null, 33)));
        C04220Ms.A0B(A012, 0);
        return C25240DiL.A01(C25239DiK.A01(new KtSLambdaShape15S0201000_I2_1((Object) A012, (C146958n9) null, 43, 42)));
    }

    public final void close() {
        AnonymousClass7Ja.A05((CancellationException) null, this.A07);
    }

    public final BKU A02(C968566y r8, String str) {
        ProfileFeedDataSource profileFeedDataSource;
        KtCSuperShape6S0100000_I2 ktCSuperShape6S0100000_I2;
        KtCSuperShape6S0100000_I2 ktCSuperShape6S0100000_I22;
        BKU bku;
        C90555Ml r0;
        C90535Mj r02;
        Object obj;
        BKU bku2;
        Object obj2;
        int ordinal = r8.ordinal();
        if (ordinal == 0) {
            profileFeedDataSource = this.A02;
        } else if (ordinal == 1) {
            profileFeedDataSource = this.A03;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        C86094wG r3 = profileFeedDataSource.A0A;
        Iterator A0q = C86154wM.A0q(r3.getValue());
        while (true) {
            if (!A0q.hasNext()) {
                ktCSuperShape6S0100000_I2 = null;
                break;
            }
            Iterator it = AnonymousClass5I1.A00(A0q).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (C04220Ms.A0I(((AnonymousClass5IF) obj2).A00.A01(), str)) {
                    break;
                }
            }
            AnonymousClass5IF r1 = (AnonymousClass5IF) obj2;
            if (r1 != null) {
                ktCSuperShape6S0100000_I2 = r1.A00;
                break;
            }
        }
        if (KtCSuperShape6S0100000_I2.A00(0, ktCSuperShape6S0100000_I2) && ktCSuperShape6S0100000_I2 != null && (bku2 = (BKU) ktCSuperShape6S0100000_I2.A00) != null) {
            return bku2;
        }
        Iterator A0q2 = C86154wM.A0q(r3.getValue());
        while (true) {
            if (!A0q2.hasNext()) {
                ktCSuperShape6S0100000_I22 = null;
                break;
            }
            Iterator it2 = AnonymousClass5I1.A00(A0q2).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (C04220Ms.A0I(((AnonymousClass5IF) obj).A00.A02(), str)) {
                    break;
                }
            }
            AnonymousClass5IF r12 = (AnonymousClass5IF) obj;
            if (r12 != null) {
                ktCSuperShape6S0100000_I22 = r12.A00;
                break;
            }
        }
        if (!KtCSuperShape6S0100000_I2.A00(0, ktCSuperShape6S0100000_I22) || ktCSuperShape6S0100000_I22 == null || (bku = (BKU) ktCSuperShape6S0100000_I22.A00) == null || (r0 = bku.A0f.A1J) == null || (r02 = r0.A03) == null) {
            return null;
        }
        return r02.A02;
    }

    public final Object A03(C968566y r5, C146958n9 r6, boolean z) {
        ProfileFeedDataSource profileFeedDataSource;
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            profileFeedDataSource = this.A02;
        } else if (ordinal == 1) {
            profileFeedDataSource = this.A03;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        AnonymousClass3V6 r3 = profileFeedDataSource.A06;
        ProfileFeedDataSource$refreshFirstPage$2 profileFeedDataSource$refreshFirstPage$2 = new ProfileFeedDataSource$refreshFirstPage$2(profileFeedDataSource, (C146958n9) null, z);
        Unit unit = Unit.A00;
        Object A002 = r3.A00(unit, r6, profileFeedDataSource$refreshFirstPage$2);
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (A002 != d0e) {
            A002 = unit;
        }
        if (A002 != d0e) {
            return unit;
        }
        return A002;
    }
}
