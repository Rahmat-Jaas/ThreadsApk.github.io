package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.fbpay.logging.LoggingContext;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6;

/* renamed from: X.5j5  reason: invalid class name */
public final class AnonymousClass5j5 extends AnonymousClass567 implements C145328kK {
    public ContextThemeWrapper A00;
    public C146618mX A01;
    public AnonymousClass5AC A02;
    public LoggingContext A03;
    public boolean A04;
    public ECPHandler A05;
    public final AnonymousClass0YY A06 = C86164wN.A0s(this, 7);
    public final AnonymousClass0YY A07 = C86164wN.A0s(this, 8);
    public final AnonymousClass0YP A08 = C86164wN.A0u(this, 44);

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        this.A04 = requireArguments().getBoolean("ECP_ENABLE_REDESIGN");
        super.onViewCreated(view2, bundle);
        View A0K = AnonymousClass0wJ.A0K(view2, R.id.ecp_selection_content_fragment_scroll_view);
        View A0K2 = AnonymousClass0wJ.A0K(view2, R.id.content_container);
        if (!this.A04) {
            A0K.setMinimumHeight(0);
        } else {
            C121047Dv r2 = AnonymousClass6XX.A00;
            ContextThemeWrapper contextThemeWrapper = this.A00;
            if (contextThemeWrapper == null) {
                C04220Ms.A0E("viewContext");
                throw null;
            }
            r2.A02(contextThemeWrapper, A0K2, 28);
        }
        if (getActivity() != null) {
            RecyclerView recyclerView = (RecyclerView) view2.requireViewById(R.id.recyclerView);
            C18200wM.A1H(recyclerView, 1);
            recyclerView.setItemAnimator((M0E) null);
            Object A0h = C86144wL.A0h(this);
            if (A0h != null) {
                if (((AnonymousClass69R) A0h).A07) {
                    AnonymousClass6XN.A00.A04(recyclerView);
                }
                LoggingContext loggingContext = this.A03;
                if (loggingContext == null) {
                    C04220Ms.A0E("loggingContext");
                    throw null;
                }
                C91355g6 r13 = new C91355g6(loggingContext, false);
                AnonymousClass0YY r1 = this.A06;
                LoggingContext loggingContext2 = this.A03;
                if (loggingContext2 == null) {
                    C04220Ms.A0E("loggingContext");
                    throw null;
                }
                C91565gR r11 = new C91565gR(loggingContext2, r1, false, false);
                AnonymousClass0YY r12 = this.A07;
                LoggingContext loggingContext3 = this.A03;
                if (loggingContext3 == null) {
                    C04220Ms.A0E("loggingContext");
                    throw null;
                }
                C91425gD r10 = new C91425gD(loggingContext3, r12);
                LoggingContext loggingContext4 = this.A03;
                if (loggingContext4 == null) {
                    C04220Ms.A0E("loggingContext");
                    throw null;
                }
                C91525gN r9 = new C91525gN(loggingContext4, r12, false);
                LoggingContext loggingContext5 = this.A03;
                if (loggingContext5 == null) {
                    C04220Ms.A0E("loggingContext");
                    throw null;
                }
                C91405gB r8 = new C91405gB(loggingContext5, r12);
                LoggingContext loggingContext6 = this.A03;
                if (loggingContext6 == null) {
                    C04220Ms.A0E("loggingContext");
                    throw null;
                }
                C91455gG r7 = new C91455gG(loggingContext6, r12);
                LoggingContext loggingContext7 = this.A03;
                if (loggingContext7 == null) {
                    C04220Ms.A0E("loggingContext");
                    throw null;
                }
                C91395gA r6 = new C91395gA(loggingContext7, r12);
                LoggingContext loggingContext8 = this.A03;
                if (loggingContext8 == null) {
                    C04220Ms.A0E("loggingContext");
                    throw null;
                }
                C91435gE r5 = new C91435gE(loggingContext8, r12);
                LoggingContext loggingContext9 = this.A03;
                if (loggingContext9 == null) {
                    C04220Ms.A0E("loggingContext");
                    throw null;
                }
                C91505gL r14 = new C91505gL(loggingContext9, r12, false);
                AnonymousClass5AC r0 = new AnonymousClass5AC(AnonymousClass4WJ.A0H(C18180wK.A0p(r13.A02, r13), C18180wK.A0p(r11.A02, r11), C18180wK.A0p(r10.A02, r10), C18180wK.A0p(r9.A02, r9), C18180wK.A0p(r8.A02, r8), C18180wK.A0p(r7.A02, r7), C18180wK.A0p(r6.A02, r6), C18180wK.A0p(r5.A02, r5), C18180wK.A0p(r14.A02, r14)));
                this.A02 = r0;
                recyclerView.setAdapter(r0);
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        C146618mX r02 = this.A01;
        if (r02 != null) {
            C86104wH.A1F(this, r02.Cgs(), 172);
            C146618mX r03 = this.A01;
            if (r03 != null) {
                C86104wH.A1F(this, r03.Abc(), 173);
                return;
            }
        }
        C04220Ms.A0E("viewModel");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        r6.A01 = r0;
        r6.A03 = X.AnonymousClass567.A02(r6);
        X.C010604w.A01(r6, "selectionContentRequestKey", r6.A08);
        X.C14030oh.A09(-1473812502, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0077, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = 1916313150(0x72389e3e, float:3.656739E30)
            int r2 = X.C14030oh.A02(r0)
            super.onCreate(r7)
            r4 = 0
            X.58M r5 = X.C116896xj.A01(r6, r4)
            android.os.Bundle r0 = r6.mArguments
            java.lang.String r3 = "ECP_SELECTION_FRAGMENT_COMPONENT_ID"
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r0.getString(r3)
            if (r1 == 0) goto L_0x0022
            int r0 = r1.hashCode()
            switch(r0) {
                case -1583857130: goto L_0x0056;
                case -794429895: goto L_0x004b;
                case -670538355: goto L_0x0040;
                case 909774403: goto L_0x0035;
                default: goto L_0x0022;
            }
        L_0x0022:
            java.lang.String r1 = "No ViewModel support for "
            android.os.Bundle r0 = r6.mArguments
            if (r0 == 0) goto L_0x002c
            java.lang.String r4 = r0.getString(r3)
        L_0x002c:
            java.lang.String r0 = X.AnonymousClass00U.A0L(r1, r4)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0035:
            java.lang.String r0 = "SHIPPING_ADDRESS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.58T r0 = r5.A1T
            goto L_0x0060
        L_0x0040:
            java.lang.String r0 = "CONTACT_INFO"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.58V r0 = r5.A1J
            goto L_0x0060
        L_0x004b:
            java.lang.String r0 = "PAYMENT_METHODS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.58U r0 = r5.A1P
            goto L_0x0060
        L_0x0056:
            java.lang.String r0 = "FULFILLMENT_OPTION"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            X.58S r0 = r5.A1M
        L_0x0060:
            X.8mX r0 = (X.C146618mX) r0
            r6.A01 = r0
            com.fbpay.logging.LoggingContext r0 = X.AnonymousClass567.A02(r6)
            r6.A03 = r0
            X.0YP r1 = r6.A08
            java.lang.String r0 = "selectionContentRequestKey"
            X.C010604w.A01(r6, r0, r1)
            r0 = -1473812502(0xffffffffa82767ea, float:-9.292895E-15)
            X.C14030oh.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5j5.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1658319163);
        ContextThemeWrapper A002 = AnonymousClass567.A00(this, layoutInflater);
        this.A00 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_selection_content_fragment, viewGroup, false);
        C14030oh.A09(1541630284, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-554390041);
        super.onResume();
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            C04220Ms.A0E("viewContext");
            throw null;
        }
        Object obj = requireArguments().get("ECP_SELECTION_NAV_BAR_STYLE");
        if (obj != null) {
            AnonymousClass3JK.A00(contextThemeWrapper, this, (AnonymousClass69R) obj, requireArguments().getString("ECP_SELECTION_FRAGMENT_NAVIGATION_TITLE"), (String) null, new KtLambdaShape26S0100000_I2_6(this, 24), new KtLambdaShape26S0100000_I2_6(this, 25), 448, false);
            C14030oh.A09(553046914, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(1433258805, A022);
        throw A0b;
    }

    public final void onStop() {
        int A022 = C14030oh.A02(1182375987);
        super.onStop();
        C146618mX r0 = this.A01;
        if (r0 == null) {
            C04220Ms.A0E("viewModel");
            throw null;
        }
        r0.CeZ();
        C14030oh.A09(842122490, A022);
    }

    public final /* synthetic */ boolean Bnq(LoggingContext loggingContext, Integer num) {
        return false;
    }

    public final void CkR(ECPHandler eCPHandler) {
        this.A05 = eCPHandler;
    }
}
