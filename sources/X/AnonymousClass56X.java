package X;

import android.app.Application;
import android.os.Bundle;
import com.facebook.redex.IDxObserverShape3S0300100_2_I2;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.security.SecurityProviderEphemeral;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape1S2400000_I2;
import kotlin.jvm.internal.KtLambdaShape4S1200000_I2_1;
import kotlin.jvm.internal.KtLambdaShape6S1100000_I2;

/* renamed from: X.56X  reason: invalid class name */
public final class AnonymousClass56X extends AnonymousClass10X {
    public static final C134697yC A0G = C18250wR.A0h("^\\d{3,4}$");
    public static final C134697yC A0H = C18250wR.A0h("^\\d{16}$");
    public AnonymousClass69W A00;
    public C113406rL A01;
    public String A02;
    public String A03;
    public final Application A04;
    public final C880756q A05;
    public final C880856r A06;
    public final C880856r A07;
    public final C880856r A08;
    public final C880856r A09;
    public final C03700Kj A0A;
    public final String A0B;
    public final C04530Oa A0C;
    public final Bundle A0D;
    public final C143158gC A0E;
    public final CardDetails A0F;

    public AnonymousClass56X(Application application, Bundle bundle) {
        super(application);
        String string;
        AnonymousClass69W r1;
        List A072;
        this.A04 = application;
        this.A0D = bundle;
        if (bundle == null || (string = bundle.getString("keyCredentialId")) == null) {
            throw C18190wL.A0a("INTENT_KEY_CREDENTIAL_ID is missing from Intent extras");
        }
        this.A0B = string;
        CardDetails cardDetails = (CardDetails) bundle.getParcelable("keyAuthFlow");
        this.A0F = cardDetails;
        this.A06 = C880856r.A03();
        C880856r A032 = C880856r.A03();
        this.A07 = A032;
        C880756q A012 = C880756q.A01();
        this.A05 = A012;
        this.A08 = C880856r.A04("");
        this.A09 = C880856r.A04("");
        this.A01 = C120917Dc.A00();
        this.A0A = AnonymousClass0IY.A00;
        this.A0E = C86114wI.A0Q(this, 281);
        A012.A0H(C969967n.OperationInProgress);
        if (cardDetails != null) {
            String str = cardDetails.A04;
            if (str != null && (A072 = C81074n3.A07(str, "•", 0)) != null && !A072.isEmpty() && A072.size() >= 2) {
                this.A02 = C18230wP.A0s(C18190wL.A0p(A072, 0), 0, AnonymousClass2C6.A00(C18190wL.A0p(A072, 0)) - 1);
                this.A03 = C86134wK.A0q(C18190wL.A0p(A072, C86144wL.A0C(A072, 1)), 1);
            }
            String str2 = this.A02;
            if (str2 == null) {
                C04220Ms.A0E("cardNetwork");
                throw null;
            }
            AnonymousClass69W[] values = AnonymousClass69W.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    r1 = AnonymousClass69W.EMPTY;
                    break;
                }
                r1 = values[i];
                if (r1.A02.equalsIgnoreCase(str2)) {
                    break;
                }
                i++;
            }
            C04220Ms.A06(r1);
            this.A00 = r1;
            A032.A0H(AnonymousClass67R.A03);
            A012.A0H(C969967n.InvalidInput);
            A01(this);
        } else {
            C113406rL r3 = this.A01;
            M5J A013 = C30821GXg.A01(r3.A00(), new KtLambdaShape6S1100000_I2(string, r3, 19));
            A012.A0K(A013, C86164wN.A0O(this, A013, 34));
        }
        this.A0C = C86124wJ.A12(this, 36);
    }

    private final List A00() {
        C880856r r0;
        AnonymousClass67R r02 = (AnonymousClass67R) this.A07.A08();
        if (r02 != null) {
            int i = C102916Xa.A00[r02.ordinal()];
            if (i == 1) {
                r0 = this.A08;
            } else if (i == 2) {
                r0 = this.A09;
            } else if (i == 3) {
                return C06750aI.A17(this.A09, this.A08);
            }
            return C18180wK.A0n(r0);
        }
        throw C18180wK.A0a("Illegal scenario");
    }

    public static final void A02(AnonymousClass56X r16, long j) {
        AnonymousClass0MQ r15 = new AnonymousClass0MQ();
        r15.A00 = System.currentTimeMillis();
        AnonymousClass56X r2 = r16;
        C113406rL r1 = r2.A01;
        String str = r2.A0B;
        Object A082 = r2.A08.A08();
        C04220Ms.A0A(A082);
        String str2 = (String) A082;
        boolean A1Z = AnonymousClass0wJ.A1Z(str, str2);
        AnonymousClass76P r4 = new AnonymousClass76P(str, str2);
        C04560Oe r5 = r1.A00;
        C114756tq r3 = new C114756tq(((C111136mq) r5.get()).A08, C86164wN.A0s(r4, 21));
        C121577Gw r9 = ((C111136mq) r5.get()).A07;
        C129017kq r7 = new C129017kq();
        if (C63803iN.A0E(AnonymousClass0TJ.A06, AnonymousClass7HK.A00(), 36310512516792442L)) {
            C93015kU r6 = new C93015kU(r9.A01.getUserId());
            C111826oU r8 = (C111826oU) ((AnonymousClass8HI) SecurityProviderEphemeral.A00).invoke();
            KtLambdaShape1S2400000_I2 ktLambdaShape1S2400000_I2 = new KtLambdaShape1S2400000_I2(r6, r7, r8, r9, str, str2, A1Z ? 1 : 0);
            synchronized (r8) {
                ktLambdaShape1S2400000_I2.invoke(r8.A00);
            }
        } else {
            GXN gxn = new GXN();
            gxn.A05("csc", str2);
            C32165H8c A002 = C121577Gw.A00(gxn);
            A002.A00 = new C95015yd(r7, r9, new KtLambdaShape4S1200000_I2_1(r7, r9, str, 17));
            C31155GhB.A03(A002);
        }
        C880056g r12 = new C880056g(new C92905kD(r3, new C114756tq(r7, C86164wN.A0s(r4, 22))));
        r2.A05.A0K(r12, new IDxObserverShape3S0300100_2_I2(A1Z, j, r15, r12, r2));
    }

    public final void A09() {
        C880756q r4 = this.A05;
        if (r4.A08() == C969967n.ValidInput) {
            for (M5J A0J : A00()) {
                r4.A0J(A0J);
            }
            r4.A0H(C969967n.OperationInProgress);
            if (this.A07.A08() != AnonymousClass67R.A01) {
                AnonymousClass0MQ r3 = new AnonymousClass0MQ();
                r3.A00 = System.currentTimeMillis();
                String str = (String) this.A09.A08();
                if (str != null) {
                    M5J A012 = this.A01.A01(this.A0B, str);
                    r4.A0K(A012, new IDxObserverShape55S0300000_2_I2(27, (Object) this, (Object) r3, (Object) A012));
                    return;
                }
                return;
            }
            A02(this, -1);
            return;
        }
        throw C18180wK.A0a(C18200wM.A0m(r4.A08(), C18190wL.A0s("Cannot confirm card details from state ")));
    }

    public static final void A01(AnonymousClass56X r4) {
        for (M5J A0K : r4.A00()) {
            r4.A05.A0K(A0K, r4.A0E);
        }
    }
}
