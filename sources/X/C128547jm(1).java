package X;

import android.content.Context;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebookpay.expresscheckout.models.ECPPaymentResponseParams;
import com.facebookpay.offsite.models.message.PaymentRequest;
import com.instagram.service.session.UserSession;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7jm  reason: invalid class name and case insensitive filesystem */
public final class C128547jm implements C146668mf {
    public AnonymousClass7AE A00 = new AnonymousClass7AE((ECPPaymentResponseParams) null, (PaymentRequest) null, (PaymentRequest) null, (C115316ur) null, (AnonymousClass7Kx) null, (Boolean) null, (String) null, (DefaultConstructorMarker) null, StringTreeSet.MAX_SYMBOL_COUNT);
    public final UserSession A01;
    public final C111486nl A02;
    public final C04530Oa A03;
    public final C04530Oa A04;
    public final C04530Oa A05;
    public final C04530Oa A06;

    public C128547jm(Context context, L3B l3b, UserSession userSession) {
        this.A01 = userSession;
        this.A04 = AnonymousClass0OY.A02(C138458Ho.A00);
        this.A02 = new C92585it(context, l3b);
        this.A05 = C86104wH.A16(this, 32);
        this.A06 = C86104wH.A16(this, 33);
        this.A03 = C86104wH.A16(this, 31);
    }

    public final void clear() {
        this.A00 = new AnonymousClass7AE((ECPPaymentResponseParams) null, (PaymentRequest) null, (PaymentRequest) null, (C115316ur) null, (AnonymousClass7Kx) null, (Boolean) null, (String) null, (DefaultConstructorMarker) null, StringTreeSet.MAX_SYMBOL_COUNT);
    }

    public final C111486nl APl() {
        return this.A02;
    }

    public final /* synthetic */ Set AQS(PaymentRequest paymentRequest) {
        return C18250wR.A0c(C967666p.CARDS);
    }

    public final String AR2() {
        return "META_PAY_APP_STYLE_IG";
    }

    public final Set ATW() {
        return (Set) this.A03.getValue();
    }

    public final AnonymousClass7AE AXJ() {
        return this.A00;
    }

    public final boolean Asm() {
        return C63803iN.A0E(AnonymousClass0TJ.A05, this.A01, 36315855453293385L);
    }

    public final boolean B0w() {
        return C63803iN.A0E(AnonymousClass0TJ.A06, this.A01, 36315855453293385L);
    }

    public final boolean B3a() {
        return true;
    }

    public final String B3n() {
        return "742725890006429";
    }

    public final String B6A() {
        return C18200wM.A0q(this.A05);
    }

    public final boolean B7d() {
        return C63803iN.A0E(AnonymousClass0TJ.A05, this.A01, 36315855454145358L);
    }

    public final String B9B() {
        return C18200wM.A0q(this.A06);
    }

    public final boolean BBR() {
        return true;
    }

    public final boolean BXU() {
        return AnonymousClass0wJ.A1X(this.A04.getValue());
    }

    public final boolean BT0() {
        return AnonymousClass7Kz.A0J().A05();
    }

    public final boolean BW9() {
        return C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass7HK.A00(), 36317470363750172L);
    }

    public C128547jm() {
    }
}
