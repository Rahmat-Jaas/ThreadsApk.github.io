package X;

import com.facebook.redex.IDxEListenerShape509S0100000_1_I2;

/* renamed from: X.4Q0  reason: invalid class name */
public final class AnonymousClass4Q0 implements Runnable {
    public final /* synthetic */ IDxEListenerShape509S0100000_1_I2 A00;

    public AnonymousClass4Q0(IDxEListenerShape509S0100000_1_I2 iDxEListenerShape509S0100000_1_I2) {
        this.A00 = iDxEListenerShape509S0100000_1_I2;
    }

    public final void run() {
        C29131wm r4 = (C29131wm) this.A00.A00;
        CU1 cu1 = new CU1();
        cu1.setArguments(C98316Fa.A00(C18180wK.A0p("args_previous_module_name", "settings_account_options"), C18180wK.A0p("args_editor_logging_surface", "ig_settings")));
        C37032Jj9 A0L = C18210wN.A0L(r4.A03);
        A0L.A0J = cu1;
        C37383Jqm A002 = A0L.A00();
        cu1.A0E = A002;
        cu1.A01 = r4.requireActivity();
        C37383Jqm.A00(r4.requireActivity(), cu1, A002);
    }
}
