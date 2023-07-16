package X;

import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.bloks.nativeprops.APMBloksNativeProps;
import com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.widget.apm.ApmButtonsView;
import com.fbpay.logging.LoggingContext;
import java.util.Map;

/* renamed from: X.5gX  reason: invalid class name and case insensitive filesystem */
public final class C91625gX extends C886359v {
    public final ContextThemeWrapper A00;
    public final FragmentActivity A01;
    public final AnonymousClass0YY A02;

    public C91625gX(ContextThemeWrapper contextThemeWrapper, FragmentActivity fragmentActivity, LoggingContext loggingContext, AnonymousClass0YY r6) {
        super(AnonymousClass69U.A09, loggingContext, false);
        this.A00 = contextThemeWrapper;
        this.A01 = fragmentActivity;
        this.A02 = r6;
    }

    public final void A0A(C88845Ax r14, AnonymousClass7Kx r15) {
        APMConfiguration aPMConfiguration;
        Integer num;
        boolean A1Z = AnonymousClass0wJ.A1Z(r15, r14);
        APMButtonsItem aPMButtonsItem = (APMButtonsItem) r15.A01;
        if (!(aPMButtonsItem == null || (num = aPMButtonsItem.A02) == null)) {
            r14.A00.setPayWithCardText(num.intValue());
        }
        if (AnonymousClass7Kx.A0P(r15)) {
            r14.A00.A00.A07(A1Z);
            return;
        }
        ApmButtonsView apmButtonsView = r14.A00;
        apmButtonsView.A00.A03();
        if (aPMButtonsItem != null && (aPMConfiguration = aPMButtonsItem.A01) != null) {
            APMBloksNativeProps aPMBloksNativeProps = aPMButtonsItem.A00;
            aPMBloksNativeProps.A00 = this.A02;
            FragmentActivity fragmentActivity = this.A01;
            C147878q4 r3 = aPMConfiguration.A00;
            Map A0I = AnonymousClass4WJ.A0I(C18180wK.A0p(AnonymousClass7C6.A00(), aPMBloksNativeProps.A06), C18180wK.A0p("client_mutation_id", aPMBloksNativeProps.A02), C18180wK.A0p(I17.A00(96), aPMBloksNativeProps.A03), C18180wK.A0p("otc_session_id", aPMBloksNativeProps.A05), C18180wK.A0p("amount", aPMBloksNativeProps.A01), C18180wK.A0p("currency_code", aPMBloksNativeProps.A04));
            AnonymousClass0YY r1 = aPMBloksNativeProps.A00;
            if (r1 != null) {
                A0I.put("on_complete_callback", new AnonymousClass7EF(C86164wN.A0r(r1, 8)));
            }
            apmButtonsView.setupBloksApms(fragmentActivity, r3, A0I);
        }
    }
}
