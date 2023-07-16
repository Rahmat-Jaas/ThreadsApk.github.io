package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.fbpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape1S1310000_I2;
import kotlin.jvm.internal.KtLambdaShape3S0310000_I2;

/* renamed from: X.8EH  reason: invalid class name */
public final class AnonymousClass8EH extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ AnonymousClass7DP A00;
    public final /* synthetic */ LoggingContext A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8EH(AnonymousClass7DP r2, LoggingContext loggingContext, String str, String str2, List list, boolean z) {
        super(0);
        this.A02 = str;
        this.A01 = loggingContext;
        this.A05 = z;
        this.A04 = list;
        this.A03 = str2;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        LoggingContext loggingContext;
        AnonymousClass0YY r1;
        USLEBaseShape0S0000000 uSLEBaseShape0S0000000;
        String str = this.A02;
        int hashCode = str.hashCode();
        if (hashCode != -1785516855) {
            if (hashCode != 1996002556) {
                if (hashCode == 2012838315 && str.equals("DELETE")) {
                    C128957ke A002 = AnonymousClass7JJ.A00();
                    LoggingContext loggingContext2 = this.A01;
                    boolean z = this.A05;
                    List list = this.A04;
                    AnonymousClass7DP r0 = this.A00;
                    LinkedHashMap A0y = C18220wO.A0y();
                    if (r0 != null) {
                        AnonymousClass7Kr.A0B(r0, A0y);
                    }
                    C128957ke.A04(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_remove_fbpayaccountmutation_success"), 388), loggingContext2, new KtLambdaShape3S0310000_I2(4, loggingContext2, A0y, list, z));
                }
            } else if (str.equals("CREATE")) {
                C128957ke A003 = AnonymousClass7JJ.A00();
                loggingContext = this.A01;
                boolean z2 = this.A05;
                List list2 = this.A04;
                String str2 = this.A03;
                if (str2 != null) {
                    AnonymousClass7DP r02 = this.A00;
                    LinkedHashMap A0y2 = C18220wO.A0y();
                    if (r02 != null) {
                        AnonymousClass7Kr.A0B(r02, A0y2);
                    }
                    uSLEBaseShape0S0000000 = C18180wK.A0I(C86104wH.A0K(A003.A00, "client_add_fbpayaccountmutation_success"), 193);
                    r1 = new KtLambdaShape1S1310000_I2(A0y2, loggingContext, list2, str2, 4, z2);
                    C128957ke.A04(uSLEBaseShape0S0000000, loggingContext, r1);
                } else {
                    throw AnonymousClass0wJ.A0b();
                }
            }
            throw C18190wL.A0a(AnonymousClass00U.A0L("Invalid mutation type: ", str));
        }
        if (str.equals("UPDATE")) {
            C128957ke A004 = AnonymousClass7JJ.A00();
            loggingContext = this.A01;
            boolean z3 = this.A05;
            List list3 = this.A04;
            AnonymousClass7DP r03 = this.A00;
            LinkedHashMap A0y3 = C18220wO.A0y();
            if (r03 != null) {
                AnonymousClass7Kr.A0B(r03, A0y3);
            }
            uSLEBaseShape0S0000000 = C18180wK.A0I(C86104wH.A0K(A004.A00, "client_edit_fbpayaccountmutation_success"), 231);
            r1 = new KtLambdaShape3S0310000_I2(2, loggingContext, A0y3, list3, z3);
            C128957ke.A04(uSLEBaseShape0S0000000, loggingContext, r1);
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L("Invalid mutation type: ", str));
        return Unit.A00;
    }
}
